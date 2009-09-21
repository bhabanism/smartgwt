/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.smartgwt.sample.showcase.client.other;

import com.smartgwt.client.util.BooleanCallback;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.form.validator.RegExpValidator;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.data.SimpleType;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.DataSourceField;
import com.smartgwt.client.types.FieldType;
import com.smartgwt.sample.showcase.client.PanelFactory;
import com.smartgwt.sample.showcase.client.ShowcasePanel;

public class TypeReuseSample extends ShowcasePanel {

    private static final String DESCRIPTION = "Enter a bad zip code (eg just \"123\") and press \"Validate\" to receive a validation error. " +
            "Custom types can be declared based on built-in validators and re-used in multiple DataSources ";

    public static class Factory implements PanelFactory {
        private String id;

        public Canvas create() {
            TypeReuseSample panel = new TypeReuseSample();
            id = panel.getID();
            return panel;
        }

        public String getID() {
            return id;
        }

        public String getDescription() {
            return DESCRIPTION;
        }
    }

    public Canvas getViewPanel() {

        DataSource dataSource = new DataSource();

        DataSourceField zipCodeField = new DataSourceField();
        zipCodeField.setName("zipCode");
        zipCodeField.setTitle("Zip Code");
        zipCodeField.setType(new ZipCodeUSType());

        dataSource.setFields(zipCodeField);
        
        final DynamicForm boundForm = new DynamicForm();
        boundForm.setWidth(300);
        boundForm.setDataSource(dataSource);

        IButton button = new IButton("Validate");
        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                boundForm.validate();
            }
        });

        VLayout layout = new VLayout(10);
        layout.setMembers(boundForm, button);

        return layout;
    }

    public static class ZipCodeUSType extends SimpleType {
        public ZipCodeUSType() {
            super("zipCodeUS", FieldType.TEXT);

            RegExpValidator validator = new RegExpValidator("^\\d{5}(-\\d{4})?$");
            setValidators(validator);
        }
    }

    public String getIntro() {
        return DESCRIPTION;
    }
}