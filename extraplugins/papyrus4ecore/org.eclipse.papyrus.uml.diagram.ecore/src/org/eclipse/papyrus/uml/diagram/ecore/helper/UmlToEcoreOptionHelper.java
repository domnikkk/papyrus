/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi benoit.maggi@cea.fr  - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.ecore.helper;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This helper refactor the control part of org.eclipse.uml2.examples.uml.ui.dialogs.UML2EcoreConverterOptionsDialog
 * so that it can be shared between dialog and wizardPage 
 * 
 * @author Benoit Maggi
 */
public class UmlToEcoreOptionHelper {

	protected final Map<String, String> options;

	protected final Map<String, String> choiceLabels = new HashMap<String, String>();

	protected final String discardChoiceLabel;

	protected final String ignoreChoiceLabel;

	protected final String processChoiceLabel;

	protected final String reportChoiceLabel;

	public UmlToEcoreOptionHelper(Map<String, String> options) {
		this.options=options;
		choiceLabels.put(discardChoiceLabel = UMLEditorPlugin.INSTANCE.getString("_UI_Discard_label"), UMLUtil.OPTION__DISCARD); //$NON-NLS-1$
		choiceLabels.put(ignoreChoiceLabel = UMLEditorPlugin.INSTANCE.getString("_UI_Ignore_label"), UMLUtil.OPTION__IGNORE); //$NON-NLS-1$
		choiceLabels.put(processChoiceLabel = UMLEditorPlugin.INSTANCE.getString("_UI_Process_label"), UMLUtil.OPTION__PROCESS); //$NON-NLS-1$
		choiceLabels.put(reportChoiceLabel = UMLEditorPlugin.INSTANCE.getString("_UI_Report_label"), UMLUtil.OPTION__REPORT); //$NON-NLS-1$
	}

	/**
	 * Create contents of the wizard.
	 *
	 * @param parent
	 */
	public Composite createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			container.setLayout(layout);
			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			container.setLayoutData(data);
		}
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_EcoreTaggedValues_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_DerivedFeatures_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_DuplicateFeatureInheritance_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE, new String[]{ ignoreChoiceLabel, reportChoiceLabel, discardChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_DuplicateFeatures_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES, new String[]{ ignoreChoiceLabel, reportChoiceLabel, discardChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_DuplicateOperationInheritance_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE, new String[]{ ignoreChoiceLabel, reportChoiceLabel, discardChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_DuplicateOperations_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS, new String[]{ ignoreChoiceLabel, reportChoiceLabel, discardChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_RedefiningOperations_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_RedefiningProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_SubsettingProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_UnionProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_SuperClassOrder_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_AnnotationDetails_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_InvariantConstraints_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_ValidationDelegates_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__VALIDATION_DELEGATES, new String[]{ ignoreChoiceLabel, processChoiceLabel }, ignoreChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_NonAPIInvariants_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__NON_API_INVARIANTS, new String[]{ ignoreChoiceLabel, processChoiceLabel }, ignoreChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_OperationBodies_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_InvocationDelegates_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__INVOCATION_DELEGATES, new String[]{ ignoreChoiceLabel, processChoiceLabel }, ignoreChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_PropertyDefaultExpressions_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__PROPERTY_DEFAULT_EXPRESSIONS, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_Comments_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__COMMENTS, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_CamelCaseNames_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES, new String[]{ ignoreChoiceLabel, reportChoiceLabel, processChoiceLabel }, processChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_UntypedProperties_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__UNTYPED_PROPERTIES, new String[]{ ignoreChoiceLabel, reportChoiceLabel, discardChoiceLabel, processChoiceLabel }, reportChoiceLabel);
		createOptionArea(container, UMLExamplesUIPlugin.INSTANCE.getString("_UI_OppositeRoleNames_label"), //$NON-NLS-1$
			UMLUtil.UML2EcoreConverter.OPTION__OPPOSITE_ROLE_NAMES, new String[]{ ignoreChoiceLabel, processChoiceLabel }, ignoreChoiceLabel);
		
		return container;
	}

	protected void createOptionArea(Composite parent, String text, final String option, String[] choices, String initialChoice) {
		Label label = new Label(parent, SWT.LEFT);
		{
			label.setText(text);
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			label.setLayoutData(data);
		}
		final CCombo combo = new CCombo(parent, SWT.BORDER | SWT.READ_ONLY);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			combo.setLayoutData(data);
			combo.setItems(choices);
			combo.addModifyListener(new ModifyListener() {

				public void modifyText(ModifyEvent me) {
					options.put(option, choiceLabels.get(combo.getText()));
				}
			});
			combo.setText(initialChoice);
		}
	}
}
