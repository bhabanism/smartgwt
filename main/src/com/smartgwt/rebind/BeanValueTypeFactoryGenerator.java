/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * is published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.smartgwt.rebind;

import com.google.gwt.core.ext.Generator;
import com.google.gwt.core.ext.GeneratorContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.TreeLogger.Type;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.*;

import com.google.gwt.user.rebind.ClassSourceFileComposerFactory;
import com.google.gwt.user.rebind.SourceWriter;

import com.smartgwt.rebind.BeanValueType;

import java.io.PrintWriter;

public class BeanValueTypeFactoryGenerator extends Generator {
    public String generate(TreeLogger logger, GeneratorContext context, String typeName) throws UnableToCompleteException {
        TypeOracle typeOracle = context.getTypeOracle();
        JClassType metaFactoryType = typeOracle.findType(typeName);
        
        final String genPackageName = metaFactoryType.getPackage().getName();
        final String genClassName = metaFactoryType.getSimpleSourceName() + "Impl";

        ClassSourceFileComposerFactory composer = new ClassSourceFileComposerFactory(genPackageName, genClassName);
        composer.addImplementedInterface(typeName);
        composer.addImport(com.smartgwt.client.bean.BeanValueType.class.getCanonicalName());
        composer.addImport("com.smartgwt.client.bean.types.*");

        PrintWriter printWriter = context.tryCreate(logger, genPackageName, genClassName);
        if (printWriter != null) {
            SourceWriter sourceWriter = composer.createSourceWriter(context, printWriter);
            sourceWriter.println("// This class lovingly generated by " + BeanValueTypeFactoryGenerator.class.getCanonicalName() + "\n");

            StringBuilder functions = new StringBuilder();

            // Our constructor ... will be called by GWT.create()
            sourceWriter.println(genClassName + " () {");
            sourceWriter.indent();

            JClassType beanValueTypeClass = typeOracle.findType(com.smartgwt.client.bean.BeanValueType.class.getCanonicalName()).isClass();

            // Iterate over the methods defined on the interface
            for (JMethod method : metaFactoryType.getMethods()) {
                if (method.getParameters().length != 0) {
                    logger.log(Type.ERROR, typeName + "::" + method.getName() + " should have no parameters.");
                    throw new UnableToCompleteException();
                }

                JParameterizedType returnType = method.getReturnType().isParameterized();
                if (returnType == null) {
                    logger.log(Type.ERROR, typeName + "::" + method.getName() + " has a non-parameterized return type.");
                    throw new UnableToCompleteException();
                }

                if (returnType.getBaseType() != beanValueTypeClass) {
                    logger.log(Type.ERROR, typeName + "::" + method.getName() + " does not have BeanValueType<> as its return type.");
                    throw new UnableToCompleteException();                    
                }
               
                JClassType[] typeArgs = returnType.getTypeArgs();
                if (typeArgs.length != 1) {
                    logger.log(Type.ERROR, typeName + "::" + method.getName() + " should have a return type with one parameterized type.");
                    throw new UnableToCompleteException();
                }

                BeanValueType beanValueType = new BeanValueType(typeArgs[0], typeOracle);
                
                // Write the function to register the value type. Note that a side-effect
                // is that the factory for the value type is actually generated!
                beanValueType.writeRegisterValueType(sourceWriter, logger, context);

                // And we'll need to generate the function!
                functions.append(
                    "\n\n@Override public BeanValueType<" + 
                    beanValueType.getQualifiedTypeName() + 
                    "> " + method.getName() + "() {\n  " +
                    "return (BeanValueType<" +
                    beanValueType.getQualifiedTypeName() + 
                    ">) BeanValueType.getBeanValueType(" +
                    beanValueType.getQualifiedValueTypeLiteral() + 
                    ");\n}"
                );
            }

            sourceWriter.outdent();
            sourceWriter.println("}");

            sourceWriter.println(functions.toString());
            sourceWriter.commit(logger);
        }

        return composer.getCreatedClassName();
    }
}
