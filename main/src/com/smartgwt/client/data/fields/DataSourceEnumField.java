/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * smartclient.com/license.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.smartgwt.client.data.fields;

import com.smartgwt.client.data.DataSourceField;
import com.smartgwt.client.types.FieldType;


public class DataSourceEnumField extends DataSourceField {

    public DataSourceEnumField() {
        setType(FieldType.ENUM);
    }

    public DataSourceEnumField(String name) {
        super(name, FieldType.ENUM);
    }

    public DataSourceEnumField(String name, String title) {
        super(name, FieldType.ENUM, title);
    }

    public DataSourceEnumField(String name, String title, int length) {
        super(name, FieldType.ENUM, title, length);
    }

    public DataSourceEnumField(String name, String title, int length, boolean required) {
        super(name, FieldType.ENUM, title, length, required);
    }
}
