/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.activity.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.diagram.activity.part.UMLDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ShapeNamedElementPreferencePage.initDefaults(store);
		ExpansionNodePreferencePage.initDefaults(store);
		ValuePinPreferencePage.initDefaults(store);
		CentralBufferNodePreferencePage.initDefaults(store);
		MergeNodePreferencePage.initDefaults(store);
		CreateObjectActionPreferencePage.initDefaults(store);
		BroadcastSignalActionPreferencePage.initDefaults(store);
		ActivityPartitionPreferencePage.initDefaults(store);
		InputPinPreferencePage.initDefaults(store);
		SendObjectActionPreferencePage.initDefaults(store);
		AddVariableValueActionPreferencePage.initDefaults(store);
		CommentPreferencePage.initDefaults(store);
		SequenceNodePreferencePage.initDefaults(store);
		ActivityParameterNodePreferencePage.initDefaults(store);
		ActivityPreferencePage.initDefaults(store);
		DecisionNodePreferencePage.initDefaults(store);
		ValueSpecificationActionPreferencePage.initDefaults(store);
		ConstraintPreferencePage.initDefaults(store);
		RemoveVariableValueActionPreferencePage.initDefaults(store);
		InterruptibleActivityRegionPreferencePage.initDefaults(store);
		IntervalConstraintPreferencePage.initDefaults(store);
		DataStoreNodePreferencePage.initDefaults(store);
		ActivityFinalNodePreferencePage.initDefaults(store);
		ExpansionRegionPreferencePage.initDefaults(store);
		RemoveStructuralFeatureValueActionPreferencePage.initDefaults(store);
		AcceptEventActionPreferencePage.initDefaults(store);
		AddStructuralFeatureValueActionPreferencePage.initDefaults(store);
		ForkNodePreferencePage.initDefaults(store);
		ConditionalNodePreferencePage.initDefaults(store);
		TimeConstraintPreferencePage.initDefaults(store);
		ReadStructuralFeatureActionPreferencePage.initDefaults(store);
		LoopNodePreferencePage.initDefaults(store);
		ActionInputPinPreferencePage.initDefaults(store);
		CallOperationActionPreferencePage.initDefaults(store);
		CallBehaviorActionPreferencePage.initDefaults(store);
		InitialNodePreferencePage.initDefaults(store);
		OutputPinPreferencePage.initDefaults(store);
		DurationConstraintPreferencePage.initDefaults(store);
		StructuredActivityNodePreferencePage.initDefaults(store);
		OpaqueActionPreferencePage.initDefaults(store);
		JoinNodePreferencePage.initDefaults(store);
		SendSignalActionPreferencePage.initDefaults(store);
		FlowFinalNodePreferencePage.initDefaults(store);
		ReadSelfActionPreferencePage.initDefaults(store);
		ReadVariableActionPreferencePage.initDefaults(store);
		ParameterPreferencePage.initDefaults(store);
		DestroyObjectActionPreferencePage.initDefaults(store);
		ControlFlowPreferencePage.initDefaults(store);
		ExceptionHandlerPreferencePage.initDefaults(store);
		ObjectFlowPreferencePage.initDefaults(store);
	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return UMLDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
