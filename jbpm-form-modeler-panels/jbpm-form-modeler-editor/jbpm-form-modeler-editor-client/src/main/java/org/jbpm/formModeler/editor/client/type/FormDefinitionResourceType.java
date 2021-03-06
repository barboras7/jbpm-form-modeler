/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.jbpm.formModeler.editor.client.type;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import org.jbpm.formModeler.editor.client.resources.FormModelerEditorResources;
import org.jbpm.formModeler.editor.client.resources.i18n.Constants;
import org.jbpm.formModeler.editor.type.FormResourceTypeDefinition;
import org.uberfire.client.workbench.type.ClientResourceType;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FormDefinitionResourceType extends FormResourceTypeDefinition implements ClientResourceType {

    @Override
    public IsWidget getIcon() {
        return new Image(FormModelerEditorResources.INSTANCE.images().typeForm());
    }

    @Override
    public String getDescription() {
        String desc = Constants.INSTANCE.formResourceTypeDescription();
        if ( desc == null || desc.isEmpty() ) return super.getDescription();
        return desc;
    }
}
