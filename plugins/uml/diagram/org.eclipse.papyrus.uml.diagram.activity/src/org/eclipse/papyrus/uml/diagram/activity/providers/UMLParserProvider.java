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
package org.eclipse.papyrus.uml.diagram.activity.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.*;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.AcceptEventActionParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.AcceptTimeEventActionParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.ActivityEdgeWeightParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.ActivityParameterNodeParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.ActivitySingleExecutionParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.CallBehaviorActionParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.CallOperationActionParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.DecisionInputFlowParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.EdgeGuardParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.ExceptionHandlerTypeParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.InputDecisionParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.JoinSpecParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.ObjectFlowSelectionParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.ObjectFlowTransformationParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.ObjectNodeParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.ObjectNodeSelectionParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.ParameterParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.PinParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.PinValueParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.PostConditionConstraintLabelParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.PreConditionConstraintLabelParser;
import org.eclipse.papyrus.uml.diagram.activity.parser.custom.StructuredActivityNodeKeywordParser;
import org.eclipse.papyrus.uml.diagram.activity.parsers.MessageFormatParser;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.common.parser.CommentParser;
import org.eclipse.papyrus.uml.diagram.common.parser.ConstraintParser;
import org.eclipse.papyrus.uml.diagram.common.parser.stereotype.AppliedStereotypeParser;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser activityName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getActivityName_5001Parser() {
		if (activityName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityName_5001Parser = parser;
		}
		return activityName_5001Parser;
	}

	/**
	 * @generated
	 *            not generated but changes include on gmfgen, can be override at the generation
	 */
	private IParser broadcastSignalActionName_6017Parser;

	/**
	 * @generated
	 */
	private IParser getBroadcastSignalActionName_6017Parser() {
		if (broadcastSignalActionName_6017Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			broadcastSignalActionName_6017Parser = parser;
		}
		return broadcastSignalActionName_6017Parser;
	}

	/**
	 * @generated
	 */
	private ActivitySingleExecutionParser activityIsSingleExecution_5002Parser;

	/**
	 * @generated
	 */
	private IParser getActivityIsSingleExecution_5002Parser() {
		if (activityIsSingleExecution_5002Parser == null) {
			activityIsSingleExecution_5002Parser = new ActivitySingleExecutionParser();
		}
		return activityIsSingleExecution_5002Parser;
	}

	/**
	 * @generated
	 */
	private ParameterParser parameter_3001Parser;

	/**
	 * @generated
	 */
	private IParser getParameter_3001Parser() {
		if (parameter_3001Parser == null) {
			parameter_3001Parser = new ParameterParser();
		}
		return parameter_3001Parser;
	}

	/**
	 * @generated
	 */
	private PreConditionConstraintLabelParser constraint_3002Parser;

	/**
	 * @generated
	 */
	private IParser getConstraint_3002Parser() {
		if (constraint_3002Parser == null) {
			constraint_3002Parser = new PreConditionConstraintLabelParser();
		}
		return constraint_3002Parser;
	}

	/**
	 * @generated
	 */
	private PostConditionConstraintLabelParser constraint_3003Parser;

	/**
	 * @generated
	 */
	private IParser getConstraint_3003Parser() {
		if (constraint_3003Parser == null) {
			constraint_3003Parser = new PostConditionConstraintLabelParser();
		}
		return constraint_3003Parser;
	}

	/**
	 * @generated
	 */
	private IParser initialNodeName_6034Parser;

	/**
	 * @generated
	 */
	private IParser getInitialNodeName_6034Parser() {
		if (initialNodeName_6034Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			initialNodeName_6034Parser = parser;
		}
		return initialNodeName_6034Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser initialNodeLabel_5080Parser;

	/**
	 * @generated
	 */
	private IParser getInitialNodeLabel_5080Parser() {
		if (initialNodeLabel_5080Parser == null) {
			initialNodeLabel_5080Parser = new AppliedStereotypeParser();
		}
		return initialNodeLabel_5080Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityFinalNodeName_6033Parser;

	/**
	 * @generated
	 */
	private IParser getActivityFinalNodeName_6033Parser() {
		if (activityFinalNodeName_6033Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityFinalNodeName_6033Parser = parser;
		}
		return activityFinalNodeName_6033Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser activityFinalNodeLabel_5081Parser;

	/**
	 * @generated
	 */
	private IParser getActivityFinalNodeLabel_5081Parser() {
		if (activityFinalNodeLabel_5081Parser == null) {
			activityFinalNodeLabel_5081Parser = new AppliedStereotypeParser();
		}
		return activityFinalNodeLabel_5081Parser;
	}

	/**
	 * @generated
	 */
	private IParser flowFinalNodeName_6035Parser;

	/**
	 * @generated
	 */
	private IParser getFlowFinalNodeName_6035Parser() {
		if (flowFinalNodeName_6035Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			flowFinalNodeName_6035Parser = parser;
		}
		return flowFinalNodeName_6035Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser flowFinalNodeLabel_5082Parser;

	/**
	 * @generated
	 */
	private IParser getFlowFinalNodeLabel_5082Parser() {
		if (flowFinalNodeLabel_5082Parser == null) {
			flowFinalNodeLabel_5082Parser = new AppliedStereotypeParser();
		}
		return flowFinalNodeLabel_5082Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActionName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActionName_5003Parser() {
		if (opaqueActionName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			opaqueActionName_5003Parser = parser;
		}
		return opaqueActionName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActionName_6028Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActionName_6028Parser() {
		if (opaqueActionName_6028Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			opaqueActionName_6028Parser = parser;
		}
		return opaqueActionName_6028Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5011Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5011Parser() {
		if (valuePinLabel_5011Parser == null) {
			valuePinLabel_5011Parser = new PinParser();
		}
		return valuePinLabel_5011Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5024Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5024Parser() {
		if (valuePinLabel_5024Parser == null) {
			valuePinLabel_5024Parser = new PinValueParser();
		}
		return valuePinLabel_5024Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5083Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5083Parser() {
		if (valuePinLabel_5083Parser == null) {
			valuePinLabel_5083Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5083Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5012Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5012Parser() {
		if (actionInputPinLabel_5012Parser == null) {
			actionInputPinLabel_5012Parser = new PinParser();
		}
		return actionInputPinLabel_5012Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5025Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5025Parser() {
		if (actionInputPinLabel_5025Parser == null) {
			actionInputPinLabel_5025Parser = new PinValueParser();
		}
		return actionInputPinLabel_5025Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5084Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5084Parser() {
		if (actionInputPinLabel_5084Parser == null) {
			actionInputPinLabel_5084Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5084Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5009Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5009Parser() {
		if (inputPinLabel_5009Parser == null) {
			inputPinLabel_5009Parser = new PinParser();
		}
		return inputPinLabel_5009Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5085Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5085Parser() {
		if (inputPinLabel_5085Parser == null) {
			inputPinLabel_5085Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5085Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5010Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5010Parser() {
		if (outputPinLabel_5010Parser == null) {
			outputPinLabel_5010Parser = new PinParser();
		}
		return outputPinLabel_5010Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5086Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5086Parser() {
		if (outputPinLabel_5086Parser == null) {
			outputPinLabel_5086Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5086Parser;
	}

	/**
	 * @generated
	 */
	private CallBehaviorActionParser callBehaviorActionLabel_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCallBehaviorActionLabel_5004Parser() {
		if (callBehaviorActionLabel_5004Parser == null) {
			callBehaviorActionLabel_5004Parser = new CallBehaviorActionParser();
		}
		return callBehaviorActionLabel_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser callBehaviorActionName_6029Parser;

	/**
	 * @generated
	 */
	private IParser getCallBehaviorActionName_6029Parser() {
		if (callBehaviorActionName_6029Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callBehaviorActionName_6029Parser = parser;
		}
		return callBehaviorActionName_6029Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5013Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5013Parser() {
		if (valuePinLabel_5013Parser == null) {
			valuePinLabel_5013Parser = new PinParser();
		}
		return valuePinLabel_5013Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5026Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5026Parser() {
		if (valuePinLabel_5026Parser == null) {
			valuePinLabel_5026Parser = new PinValueParser();
		}
		return valuePinLabel_5026Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5087Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5087Parser() {
		if (valuePinLabel_5087Parser == null) {
			valuePinLabel_5087Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5087Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5014Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5014Parser() {
		if (actionInputPinLabel_5014Parser == null) {
			actionInputPinLabel_5014Parser = new PinParser();
		}
		return actionInputPinLabel_5014Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5027Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5027Parser() {
		if (actionInputPinLabel_5027Parser == null) {
			actionInputPinLabel_5027Parser = new PinValueParser();
		}
		return actionInputPinLabel_5027Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5088Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5088Parser() {
		if (actionInputPinLabel_5088Parser == null) {
			actionInputPinLabel_5088Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5088Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5015Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5015Parser() {
		if (inputPinLabel_5015Parser == null) {
			inputPinLabel_5015Parser = new PinParser();
		}
		return inputPinLabel_5015Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5089Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5089Parser() {
		if (inputPinLabel_5089Parser == null) {
			inputPinLabel_5089Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5089Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5016Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5016Parser() {
		if (outputPinLabel_5016Parser == null) {
			outputPinLabel_5016Parser = new PinParser();
		}
		return outputPinLabel_5016Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5090Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5090Parser() {
		if (outputPinLabel_5090Parser == null) {
			outputPinLabel_5090Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5090Parser;
	}

	/**
	 * @generated
	 */
	private CallOperationActionParser callOperationActionLabel_5006Parser;

	/**
	 * @generated
	 */
	private IParser getCallOperationActionLabel_5006Parser() {
		if (callOperationActionLabel_5006Parser == null) {
			callOperationActionLabel_5006Parser = new CallOperationActionParser();
		}
		return callOperationActionLabel_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser callOperationActionName_6020Parser;

	/**
	 * @generated
	 */
	private IParser getCallOperationActionName_6020Parser() {
		if (callOperationActionName_6020Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callOperationActionName_6020Parser = parser;
		}
		return callOperationActionName_6020Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5017Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5017Parser() {
		if (actionInputPinLabel_5017Parser == null) {
			actionInputPinLabel_5017Parser = new PinParser();
		}
		return actionInputPinLabel_5017Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5028Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5028Parser() {
		if (actionInputPinLabel_5028Parser == null) {
			actionInputPinLabel_5028Parser = new PinValueParser();
		}
		return actionInputPinLabel_5028Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5091Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5091Parser() {
		if (actionInputPinLabel_5091Parser == null) {
			actionInputPinLabel_5091Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5091Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5018Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5018Parser() {
		if (valuePinLabel_5018Parser == null) {
			valuePinLabel_5018Parser = new PinParser();
		}
		return valuePinLabel_5018Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5029Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5029Parser() {
		if (valuePinLabel_5029Parser == null) {
			valuePinLabel_5029Parser = new PinValueParser();
		}
		return valuePinLabel_5029Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5092Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5092Parser() {
		if (valuePinLabel_5092Parser == null) {
			valuePinLabel_5092Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5092Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5019Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5019Parser() {
		if (inputPinLabel_5019Parser == null) {
			inputPinLabel_5019Parser = new PinParser();
		}
		return inputPinLabel_5019Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5093Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5093Parser() {
		if (inputPinLabel_5093Parser == null) {
			inputPinLabel_5093Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5093Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5020Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5020Parser() {
		if (outputPinLabel_5020Parser == null) {
			outputPinLabel_5020Parser = new PinParser();
		}
		return outputPinLabel_5020Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5094Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5094Parser() {
		if (outputPinLabel_5094Parser == null) {
			outputPinLabel_5094Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5094Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5021Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5021Parser() {
		if (valuePinLabel_5021Parser == null) {
			valuePinLabel_5021Parser = new PinParser();
		}
		return valuePinLabel_5021Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5030Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5030Parser() {
		if (valuePinLabel_5030Parser == null) {
			valuePinLabel_5030Parser = new PinValueParser();
		}
		return valuePinLabel_5030Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5095Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5095Parser() {
		if (valuePinLabel_5095Parser == null) {
			valuePinLabel_5095Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5095Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5022Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5022Parser() {
		if (actionInputPinLabel_5022Parser == null) {
			actionInputPinLabel_5022Parser = new PinParser();
		}
		return actionInputPinLabel_5022Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5031Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5031Parser() {
		if (actionInputPinLabel_5031Parser == null) {
			actionInputPinLabel_5031Parser = new PinValueParser();
		}
		return actionInputPinLabel_5031Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5096Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5096Parser() {
		if (actionInputPinLabel_5096Parser == null) {
			actionInputPinLabel_5096Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5096Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5023Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5023Parser() {
		if (inputPinLabel_5023Parser == null) {
			inputPinLabel_5023Parser = new PinParser();
		}
		return inputPinLabel_5023Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5097Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5097Parser() {
		if (inputPinLabel_5097Parser == null) {
			inputPinLabel_5097Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5097Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintName_5007Parser() {
		if (constraintName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			constraintName_5007Parser = parser;
		}
		return constraintName_5007Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser constraintLabel_5136Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintLabel_5136Parser() {
		if (constraintLabel_5136Parser == null) {
			constraintLabel_5136Parser = new ConstraintParser();
		}
		return constraintLabel_5136Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintName_5008Parser() {
		if (constraintName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			constraintName_5008Parser = parser;
		}
		return constraintName_5008Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser constraintLabel_5137Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintLabel_5137Parser() {
		if (constraintLabel_5137Parser == null) {
			constraintLabel_5137Parser = new ConstraintParser();
		}
		return constraintLabel_5137Parser;
	}

	/**
	 * @generated
	 */
	private IParser decisionNodeName_6036Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionNodeName_6036Parser() {
		if (decisionNodeName_6036Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			decisionNodeName_6036Parser = parser;
		}
		return decisionNodeName_6036Parser;
	}

	/**
	 * @generated
	 */
	private InputDecisionParser decisionNodeLabel_5043Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionNodeLabel_5043Parser() {
		if (decisionNodeLabel_5043Parser == null) {
			decisionNodeLabel_5043Parser = new InputDecisionParser();
		}
		return decisionNodeLabel_5043Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser decisionNodeLabel_5098Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionNodeLabel_5098Parser() {
		if (decisionNodeLabel_5098Parser == null) {
			decisionNodeLabel_5098Parser = new AppliedStereotypeParser();
		}
		return decisionNodeLabel_5098Parser;
	}

	/**
	 * @generated
	 */
	private IParser mergeNodeName_6037Parser;

	/**
	 * @generated
	 */
	private IParser getMergeNodeName_6037Parser() {
		if (mergeNodeName_6037Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mergeNodeName_6037Parser = parser;
		}
		return mergeNodeName_6037Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser mergeNodeLabel_5099Parser;

	/**
	 * @generated
	 */
	private IParser getMergeNodeLabel_5099Parser() {
		if (mergeNodeLabel_5099Parser == null) {
			mergeNodeLabel_5099Parser = new AppliedStereotypeParser();
		}
		return mergeNodeLabel_5099Parser;
	}

	/**
	 * @generated
	 */
	private IParser forkNodeName_6038Parser;

	/**
	 * @generated
	 */
	private IParser getForkNodeName_6038Parser() {
		if (forkNodeName_6038Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forkNodeName_6038Parser = parser;
		}
		return forkNodeName_6038Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser forkNodeLabel_5100Parser;

	/**
	 * @generated
	 */
	private IParser getForkNodeLabel_5100Parser() {
		if (forkNodeLabel_5100Parser == null) {
			forkNodeLabel_5100Parser = new AppliedStereotypeParser();
		}
		return forkNodeLabel_5100Parser;
	}

	/**
	 * @generated
	 */
	private JoinSpecParser joinNodeLabel_5042Parser;

	/**
	 * @generated
	 */
	private IParser getJoinNodeLabel_5042Parser() {
		if (joinNodeLabel_5042Parser == null) {
			joinNodeLabel_5042Parser = new JoinSpecParser();
		}
		return joinNodeLabel_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser joinNodeName_6039Parser;

	/**
	 * @generated
	 */
	private IParser getJoinNodeName_6039Parser() {
		if (joinNodeName_6039Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			joinNodeName_6039Parser = parser;
		}
		return joinNodeName_6039Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser joinNodeLabel_5101Parser;

	/**
	 * @generated
	 */
	private IParser getJoinNodeLabel_5101Parser() {
		if (joinNodeLabel_5101Parser == null) {
			joinNodeLabel_5101Parser = new AppliedStereotypeParser();
		}
		return joinNodeLabel_5101Parser;
	}

	/**
	 * @generated
	 */
	private IParser sendObjectActionName_5059Parser;

	/**
	 * @generated
	 */
	private IParser getSendObjectActionName_5059Parser() {
		if (sendObjectActionName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendObjectActionName_5059Parser = parser;
		}
		return sendObjectActionName_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser sendObjectActionName_6027Parser;

	/**
	 * @generated
	 */
	private IParser getSendObjectActionName_6027Parser() {
		if (sendObjectActionName_6027Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendObjectActionName_6027Parser = parser;
		}
		return sendObjectActionName_6027Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5049Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5049Parser() {
		if (valuePinLabel_5049Parser == null) {
			valuePinLabel_5049Parser = new PinParser();
		}
		return valuePinLabel_5049Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5050Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5050Parser() {
		if (valuePinLabel_5050Parser == null) {
			valuePinLabel_5050Parser = new PinValueParser();
		}
		return valuePinLabel_5050Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5102Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5102Parser() {
		if (valuePinLabel_5102Parser == null) {
			valuePinLabel_5102Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5102Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5051Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5051Parser() {
		if (actionInputPinLabel_5051Parser == null) {
			actionInputPinLabel_5051Parser = new PinParser();
		}
		return actionInputPinLabel_5051Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5052Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5052Parser() {
		if (actionInputPinLabel_5052Parser == null) {
			actionInputPinLabel_5052Parser = new PinValueParser();
		}
		return actionInputPinLabel_5052Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5103Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5103Parser() {
		if (actionInputPinLabel_5103Parser == null) {
			actionInputPinLabel_5103Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5103Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5053Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5053Parser() {
		if (inputPinLabel_5053Parser == null) {
			inputPinLabel_5053Parser = new PinParser();
		}
		return inputPinLabel_5053Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5104Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5104Parser() {
		if (inputPinLabel_5104Parser == null) {
			inputPinLabel_5104Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5104Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5054Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5054Parser() {
		if (valuePinLabel_5054Parser == null) {
			valuePinLabel_5054Parser = new PinParser();
		}
		return valuePinLabel_5054Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5055Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5055Parser() {
		if (valuePinLabel_5055Parser == null) {
			valuePinLabel_5055Parser = new PinValueParser();
		}
		return valuePinLabel_5055Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5105Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5105Parser() {
		if (valuePinLabel_5105Parser == null) {
			valuePinLabel_5105Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5105Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5056Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5056Parser() {
		if (actionInputPinLabel_5056Parser == null) {
			actionInputPinLabel_5056Parser = new PinParser();
		}
		return actionInputPinLabel_5056Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5057Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5057Parser() {
		if (actionInputPinLabel_5057Parser == null) {
			actionInputPinLabel_5057Parser = new PinValueParser();
		}
		return actionInputPinLabel_5057Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5106Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5106Parser() {
		if (actionInputPinLabel_5106Parser == null) {
			actionInputPinLabel_5106Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5106Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5058Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5058Parser() {
		if (inputPinLabel_5058Parser == null) {
			inputPinLabel_5058Parser = new PinParser();
		}
		return inputPinLabel_5058Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5107Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5107Parser() {
		if (inputPinLabel_5107Parser == null) {
			inputPinLabel_5107Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5107Parser;
	}

	/**
	 * @generated
	 */
	private IParser sendSignalActionName_5060Parser;

	/**
	 * @generated
	 */
	private IParser getSendSignalActionName_5060Parser() {
		if (sendSignalActionName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendSignalActionName_5060Parser = parser;
		}
		return sendSignalActionName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser sendSignalActionName_6032Parser;

	/**
	 * @generated
	 */
	private IParser getSendSignalActionName_6032Parser() {
		if (sendSignalActionName_6032Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendSignalActionName_6032Parser = parser;
		}
		return sendSignalActionName_6032Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5061Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5061Parser() {
		if (actionInputPinLabel_5061Parser == null) {
			actionInputPinLabel_5061Parser = new PinParser();
		}
		return actionInputPinLabel_5061Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5062Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5062Parser() {
		if (actionInputPinLabel_5062Parser == null) {
			actionInputPinLabel_5062Parser = new PinValueParser();
		}
		return actionInputPinLabel_5062Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5108Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5108Parser() {
		if (actionInputPinLabel_5108Parser == null) {
			actionInputPinLabel_5108Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5108Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5063Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5063Parser() {
		if (valuePinLabel_5063Parser == null) {
			valuePinLabel_5063Parser = new PinParser();
		}
		return valuePinLabel_5063Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5064Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5064Parser() {
		if (valuePinLabel_5064Parser == null) {
			valuePinLabel_5064Parser = new PinValueParser();
		}
		return valuePinLabel_5064Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5109Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5109Parser() {
		if (valuePinLabel_5109Parser == null) {
			valuePinLabel_5109Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5109Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5065Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5065Parser() {
		if (inputPinLabel_5065Parser == null) {
			inputPinLabel_5065Parser = new PinParser();
		}
		return inputPinLabel_5065Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5110Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5110Parser() {
		if (inputPinLabel_5110Parser == null) {
			inputPinLabel_5110Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5110Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5072Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5072Parser() {
		if (valuePinLabel_5072Parser == null) {
			valuePinLabel_5072Parser = new PinParser();
		}
		return valuePinLabel_5072Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5073Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5073Parser() {
		if (valuePinLabel_5073Parser == null) {
			valuePinLabel_5073Parser = new PinValueParser();
		}
		return valuePinLabel_5073Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5111Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5111Parser() {
		if (valuePinLabel_5111Parser == null) {
			valuePinLabel_5111Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5111Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5074Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5074Parser() {
		if (actionInputPinLabel_5074Parser == null) {
			actionInputPinLabel_5074Parser = new PinParser();
		}
		return actionInputPinLabel_5074Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5075Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5075Parser() {
		if (actionInputPinLabel_5075Parser == null) {
			actionInputPinLabel_5075Parser = new PinValueParser();
		}
		return actionInputPinLabel_5075Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5112Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5112Parser() {
		if (actionInputPinLabel_5112Parser == null) {
			actionInputPinLabel_5112Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5112Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5076Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5076Parser() {
		if (inputPinLabel_5076Parser == null) {
			inputPinLabel_5076Parser = new PinParser();
		}
		return inputPinLabel_5076Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5113Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5113Parser() {
		if (inputPinLabel_5113Parser == null) {
			inputPinLabel_5113Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5113Parser;
	}

	/**
	 * @generated
	 */
	private ActivityParameterNodeParser activityParameterNodeLabel_5071Parser;

	/**
	 * @generated
	 */
	private IParser getActivityParameterNodeLabel_5071Parser() {
		if (activityParameterNodeLabel_5071Parser == null) {
			activityParameterNodeLabel_5071Parser = new ActivityParameterNodeParser();
		}
		return activityParameterNodeLabel_5071Parser;
	}

	/**
	 * @generated
	 */
	private AcceptEventActionParser acceptEventActionLabel_5078Parser;

	/**
	 * @generated
	 */
	private IParser getAcceptEventActionLabel_5078Parser() {
		if (acceptEventActionLabel_5078Parser == null) {
			acceptEventActionLabel_5078Parser = new AcceptEventActionParser();
		}
		return acceptEventActionLabel_5078Parser;
	}

	/**
	 * @generated
	 */
	private AcceptTimeEventActionParser acceptEventActionLabel_5079Parser;

	/**
	 * @generated
	 */
	private IParser getAcceptEventActionLabel_5079Parser() {
		if (acceptEventActionLabel_5079Parser == null) {
			acceptEventActionLabel_5079Parser = new AcceptTimeEventActionParser();
		}
		return acceptEventActionLabel_5079Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser acceptEventActionLabel_5115Parser;

	/**
	 * @generated
	 */
	private IParser getAcceptEventActionLabel_5115Parser() {
		if (acceptEventActionLabel_5115Parser == null) {
			acceptEventActionLabel_5115Parser = new AppliedStereotypeParser();
		}
		return acceptEventActionLabel_5115Parser;
	}

	/**
	 * @generated
	 */
	private IParser acceptEventActionName_6040Parser;

	/**
	 * @generated
	 */
	private IParser getAcceptEventActionName_6040Parser() {
		if (acceptEventActionName_6040Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			acceptEventActionName_6040Parser = parser;
		}
		return acceptEventActionName_6040Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5077Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5077Parser() {
		if (outputPinLabel_5077Parser == null) {
			outputPinLabel_5077Parser = new PinParser();
		}
		return outputPinLabel_5077Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5114Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5114Parser() {
		if (outputPinLabel_5114Parser == null) {
			outputPinLabel_5114Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5114Parser;
	}

	/**
	 * @generated
	 */
	private StructuredActivityNodeKeywordParser structuredActivityNodeLabel_5117Parser;

	/**
	 * @generated
	 */
	private IParser getStructuredActivityNodeLabel_5117Parser() {
		if (structuredActivityNodeLabel_5117Parser == null) {
			structuredActivityNodeLabel_5117Parser = new StructuredActivityNodeKeywordParser();
		}
		return structuredActivityNodeLabel_5117Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5178Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5178Parser() {
		if (inputPinLabel_5178Parser == null) {
			inputPinLabel_5178Parser = new PinParser();
		}
		return inputPinLabel_5178Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5179Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5179Parser() {
		if (inputPinLabel_5179Parser == null) {
			inputPinLabel_5179Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5179Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPartitionName_5118Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPartitionName_5118Parser() {
		if (activityPartitionName_5118Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityPartitionName_5118Parser = parser;
		}
		return activityPartitionName_5118Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPartitionName_6016Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPartitionName_6016Parser() {
		if (activityPartitionName_6016Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityPartitionName_6016Parser = parser;
		}
		return activityPartitionName_6016Parser;
	}

	/**
	 * @generated
	 */
	private ActivitySingleExecutionParser namedElementName_5129Parser;

	/**
	 * @generated
	 */
	private IParser getNamedElementName_5129Parser() {
		if (namedElementName_5129Parser == null) {
			namedElementName_5129Parser = new ActivitySingleExecutionParser();
		}
		return namedElementName_5129Parser;
	}

	/**
	 * @generated
	 */
	private IParser createObjectActionName_5148Parser;

	/**
	 * @generated
	 */
	private IParser getCreateObjectActionName_5148Parser() {
		if (createObjectActionName_5148Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createObjectActionName_5148Parser = parser;
		}
		return createObjectActionName_5148Parser;
	}

	/**
	 * @generated
	 */
	private IParser createObjectActionName_6024Parser;

	/**
	 * @generated
	 */
	private IParser getCreateObjectActionName_6024Parser() {
		if (createObjectActionName_6024Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createObjectActionName_6024Parser = parser;
		}
		return createObjectActionName_6024Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5146Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5146Parser() {
		if (outputPinLabel_5146Parser == null) {
			outputPinLabel_5146Parser = new PinParser();
		}
		return outputPinLabel_5146Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5147Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5147Parser() {
		if (outputPinLabel_5147Parser == null) {
			outputPinLabel_5147Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5147Parser;
	}

	/**
	 * @generated
	 */
	private IParser readStructuralFeatureActionName_5153Parser;

	/**
	 * @generated
	 */
	private IParser getReadStructuralFeatureActionName_5153Parser() {
		if (readStructuralFeatureActionName_5153Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readStructuralFeatureActionName_5153Parser = parser;
		}
		return readStructuralFeatureActionName_5153Parser;
	}

	/**
	 * @generated
	 */
	private IParser readStructuralFeatureActionName_6023Parser;

	/**
	 * @generated
	 */
	private IParser getReadStructuralFeatureActionName_6023Parser() {
		if (readStructuralFeatureActionName_6023Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readStructuralFeatureActionName_6023Parser = parser;
		}
		return readStructuralFeatureActionName_6023Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5149Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5149Parser() {
		if (inputPinLabel_5149Parser == null) {
			inputPinLabel_5149Parser = new PinParser();
		}
		return inputPinLabel_5149Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5150Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5150Parser() {
		if (inputPinLabel_5150Parser == null) {
			inputPinLabel_5150Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5150Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5151Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5151Parser() {
		if (outputPinLabel_5151Parser == null) {
			outputPinLabel_5151Parser = new PinParser();
		}
		return outputPinLabel_5151Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5152Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5152Parser() {
		if (outputPinLabel_5152Parser == null) {
			outputPinLabel_5152Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5152Parser;
	}

	/**
	 * @generated
	 */
	private IParser addStructuralFeatureValueActionName_5160Parser;

	/**
	 * @generated
	 */
	private IParser getAddStructuralFeatureValueActionName_5160Parser() {
		if (addStructuralFeatureValueActionName_5160Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addStructuralFeatureValueActionName_5160Parser = parser;
		}
		return addStructuralFeatureValueActionName_5160Parser;
	}

	/**
	 * @generated
	 */
	private IParser addStructuralFeatureValueActionName_6019Parser;

	/**
	 * @generated
	 */
	private IParser getAddStructuralFeatureValueActionName_6019Parser() {
		if (addStructuralFeatureValueActionName_6019Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addStructuralFeatureValueActionName_6019Parser = parser;
		}
		return addStructuralFeatureValueActionName_6019Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5154Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5154Parser() {
		if (inputPinLabel_5154Parser == null) {
			inputPinLabel_5154Parser = new PinParser();
		}
		return inputPinLabel_5154Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5155Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5155Parser() {
		if (inputPinLabel_5155Parser == null) {
			inputPinLabel_5155Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5155Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5156Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5156Parser() {
		if (inputPinLabel_5156Parser == null) {
			inputPinLabel_5156Parser = new PinParser();
		}
		return inputPinLabel_5156Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5157Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5157Parser() {
		if (inputPinLabel_5157Parser == null) {
			inputPinLabel_5157Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5157Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5158Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5158Parser() {
		if (outputPinLabel_5158Parser == null) {
			outputPinLabel_5158Parser = new PinParser();
		}
		return outputPinLabel_5158Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5159Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5159Parser() {
		if (outputPinLabel_5159Parser == null) {
			outputPinLabel_5159Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5159Parser;
	}

	/**
	 * @generated
	 */
	private IParser destroyObjectActionName_5163Parser;

	/**
	 * @generated
	 */
	private IParser getDestroyObjectActionName_5163Parser() {
		if (destroyObjectActionName_5163Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			destroyObjectActionName_5163Parser = parser;
		}
		return destroyObjectActionName_5163Parser;
	}

	/**
	 * @generated
	 */
	private IParser destroyObjectActionName_6022Parser;

	/**
	 * @generated
	 */
	private IParser getDestroyObjectActionName_6022Parser() {
		if (destroyObjectActionName_6022Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			destroyObjectActionName_6022Parser = parser;
		}
		return destroyObjectActionName_6022Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5161Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5161Parser() {
		if (inputPinLabel_5161Parser == null) {
			inputPinLabel_5161Parser = new PinParser();
		}
		return inputPinLabel_5161Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5162Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5162Parser() {
		if (inputPinLabel_5162Parser == null) {
			inputPinLabel_5162Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5162Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5332Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5332Parser() {
		if (valuePinLabel_5332Parser == null) {
			valuePinLabel_5332Parser = new PinParser();
		}
		return valuePinLabel_5332Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5333Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5333Parser() {
		if (valuePinLabel_5333Parser == null) {
			valuePinLabel_5333Parser = new PinValueParser();
		}
		return valuePinLabel_5333Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5334Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5334Parser() {
		if (valuePinLabel_5334Parser == null) {
			valuePinLabel_5334Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5334Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5335Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5335Parser() {
		if (actionInputPinLabel_5335Parser == null) {
			actionInputPinLabel_5335Parser = new PinParser();
		}
		return actionInputPinLabel_5335Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5336Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5336Parser() {
		if (actionInputPinLabel_5336Parser == null) {
			actionInputPinLabel_5336Parser = new PinValueParser();
		}
		return actionInputPinLabel_5336Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5337Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5337Parser() {
		if (actionInputPinLabel_5337Parser == null) {
			actionInputPinLabel_5337Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5337Parser;
	}

	/**
	 * @generated
	 */
	private IParser readVariableActionName_5166Parser;

	/**
	 * @generated
	 */
	private IParser getReadVariableActionName_5166Parser() {
		if (readVariableActionName_5166Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readVariableActionName_5166Parser = parser;
		}
		return readVariableActionName_5166Parser;
	}

	/**
	 * @generated
	 */
	private IParser readVariableActionName_6021Parser;

	/**
	 * @generated
	 */
	private IParser getReadVariableActionName_6021Parser() {
		if (readVariableActionName_6021Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readVariableActionName_6021Parser = parser;
		}
		return readVariableActionName_6021Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5164Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5164Parser() {
		if (outputPinLabel_5164Parser == null) {
			outputPinLabel_5164Parser = new PinParser();
		}
		return outputPinLabel_5164Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5165Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5165Parser() {
		if (outputPinLabel_5165Parser == null) {
			outputPinLabel_5165Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5165Parser;
	}

	/**
	 * @generated
	 */
	private IParser addVariableValueActionName_5171Parser;

	/**
	 * @generated
	 */
	private IParser getAddVariableValueActionName_5171Parser() {
		if (addVariableValueActionName_5171Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addVariableValueActionName_5171Parser = parser;
		}
		return addVariableValueActionName_5171Parser;
	}

	/**
	 * @generated
	 */
	private IParser addVariableValueActionName_6018Parser;

	/**
	 * @generated
	 */
	private IParser getAddVariableValueActionName_6018Parser() {
		if (addVariableValueActionName_6018Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addVariableValueActionName_6018Parser = parser;
		}
		return addVariableValueActionName_6018Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5167Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5167Parser() {
		if (inputPinLabel_5167Parser == null) {
			inputPinLabel_5167Parser = new PinParser();
		}
		return inputPinLabel_5167Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5168Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5168Parser() {
		if (inputPinLabel_5168Parser == null) {
			inputPinLabel_5168Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5168Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5169Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5169Parser() {
		if (inputPinLabel_5169Parser == null) {
			inputPinLabel_5169Parser = new PinParser();
		}
		return inputPinLabel_5169Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5170Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5170Parser() {
		if (inputPinLabel_5170Parser == null) {
			inputPinLabel_5170Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5170Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5350Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5350Parser() {
		if (valuePinLabel_5350Parser == null) {
			valuePinLabel_5350Parser = new PinParser();
		}
		return valuePinLabel_5350Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5339Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5339Parser() {
		if (valuePinLabel_5339Parser == null) {
			valuePinLabel_5339Parser = new PinValueParser();
		}
		return valuePinLabel_5339Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5340Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5340Parser() {
		if (valuePinLabel_5340Parser == null) {
			valuePinLabel_5340Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5340Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5341Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5341Parser() {
		if (valuePinLabel_5341Parser == null) {
			valuePinLabel_5341Parser = new PinParser();
		}
		return valuePinLabel_5341Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5342Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5342Parser() {
		if (valuePinLabel_5342Parser == null) {
			valuePinLabel_5342Parser = new PinValueParser();
		}
		return valuePinLabel_5342Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5343Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5343Parser() {
		if (valuePinLabel_5343Parser == null) {
			valuePinLabel_5343Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5343Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5344Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5344Parser() {
		if (actionInputPinLabel_5344Parser == null) {
			actionInputPinLabel_5344Parser = new PinParser();
		}
		return actionInputPinLabel_5344Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5345Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5345Parser() {
		if (actionInputPinLabel_5345Parser == null) {
			actionInputPinLabel_5345Parser = new PinValueParser();
		}
		return actionInputPinLabel_5345Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5346Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5346Parser() {
		if (actionInputPinLabel_5346Parser == null) {
			actionInputPinLabel_5346Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5346Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5347Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5347Parser() {
		if (actionInputPinLabel_5347Parser == null) {
			actionInputPinLabel_5347Parser = new PinParser();
		}
		return actionInputPinLabel_5347Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5348Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5348Parser() {
		if (actionInputPinLabel_5348Parser == null) {
			actionInputPinLabel_5348Parser = new PinValueParser();
		}
		return actionInputPinLabel_5348Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5349Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5349Parser() {
		if (actionInputPinLabel_5349Parser == null) {
			actionInputPinLabel_5349Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5349Parser;
	}

	/**
	 * @generated
	 */
	private IParser broadcastSignalActionName_5175Parser;

	/**
	 * @generated
	 */
	private IParser getBroadcastSignalActionName_5175Parser() {
		if (broadcastSignalActionName_5175Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			broadcastSignalActionName_5175Parser = parser;
		}
		return broadcastSignalActionName_5175Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5172Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5172Parser() {
		if (inputPinLabel_5172Parser == null) {
			inputPinLabel_5172Parser = new PinParser();
		}
		return inputPinLabel_5172Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser inputPinLabel_5173Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5173Parser() {
		if (inputPinLabel_5173Parser == null) {
			inputPinLabel_5173Parser = new PinValueParser();
		}
		return inputPinLabel_5173Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5174Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5174Parser() {
		if (inputPinLabel_5174Parser == null) {
			inputPinLabel_5174Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5174Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5351Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5351Parser() {
		if (valuePinLabel_5351Parser == null) {
			valuePinLabel_5351Parser = new PinParser();
		}
		return valuePinLabel_5351Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5352Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5352Parser() {
		if (valuePinLabel_5352Parser == null) {
			valuePinLabel_5352Parser = new PinValueParser();
		}
		return valuePinLabel_5352Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5353Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5353Parser() {
		if (valuePinLabel_5353Parser == null) {
			valuePinLabel_5353Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5353Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5354Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5354Parser() {
		if (actionInputPinLabel_5354Parser == null) {
			actionInputPinLabel_5354Parser = new PinParser();
		}
		return actionInputPinLabel_5354Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5355Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5355Parser() {
		if (actionInputPinLabel_5355Parser == null) {
			actionInputPinLabel_5355Parser = new PinValueParser();
		}
		return actionInputPinLabel_5355Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5356Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5356Parser() {
		if (actionInputPinLabel_5356Parser == null) {
			actionInputPinLabel_5356Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5356Parser;
	}

	/**
	 * @generated
	 */
	private ObjectNodeParser centralBufferNodeLabel_5176Parser;

	/**
	 * @generated
	 */
	private IParser getCentralBufferNodeLabel_5176Parser() {
		if (centralBufferNodeLabel_5176Parser == null) {
			centralBufferNodeLabel_5176Parser = new ObjectNodeParser();
		}
		return centralBufferNodeLabel_5176Parser;
	}

	/**
	 * @generated
	 */
	private ObjectNodeSelectionParser centralBufferNodeLabel_5177Parser;

	/**
	 * @generated
	 */
	private IParser getCentralBufferNodeLabel_5177Parser() {
		if (centralBufferNodeLabel_5177Parser == null) {
			centralBufferNodeLabel_5177Parser = new ObjectNodeSelectionParser();
		}
		return centralBufferNodeLabel_5177Parser;
	}

	/**
	 * @generated
	 */
	private IParser centralBufferNodeName_6030Parser;

	/**
	 * @generated
	 */
	private IParser getCentralBufferNodeName_6030Parser() {
		if (centralBufferNodeName_6030Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			centralBufferNodeName_6030Parser = parser;
		}
		return centralBufferNodeName_6030Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintName_5189Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintName_5189Parser() {
		if (constraintName_5189Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			constraintName_5189Parser = parser;
		}
		return constraintName_5189Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser constraintSpecification_5190Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintSpecification_5190Parser() {
		if (constraintSpecification_5190Parser == null) {
			constraintSpecification_5190Parser = new ConstraintParser();
		}
		return constraintSpecification_5190Parser;
	}

	/**
	 * @generated
	 */
	private IParser startObjectBehaviorActionName_5191Parser;

	/**
	 * @generated
	 */
	private IParser getStartObjectBehaviorActionName_5191Parser() {
		if (startObjectBehaviorActionName_5191Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			startObjectBehaviorActionName_5191Parser = parser;
		}
		return startObjectBehaviorActionName_5191Parser;
	}

	/**
	 * @generated
	 */
	private IParser startObjectBehaviorActionName_5394Parser;

	/**
	 * @generated
	 */
	private IParser getStartObjectBehaviorActionName_5394Parser() {
		if (startObjectBehaviorActionName_5394Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			startObjectBehaviorActionName_5394Parser = parser;
		}
		return startObjectBehaviorActionName_5394Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5203Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5203Parser() {
		if (outputPinLabel_5203Parser == null) {
			outputPinLabel_5203Parser = new PinParser();
		}
		return outputPinLabel_5203Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5204Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5204Parser() {
		if (outputPinLabel_5204Parser == null) {
			outputPinLabel_5204Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5204Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5217Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5217Parser() {
		if (inputPinLabel_5217Parser == null) {
			inputPinLabel_5217Parser = new PinParser();
		}
		return inputPinLabel_5217Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5218Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5218Parser() {
		if (inputPinLabel_5218Parser == null) {
			inputPinLabel_5218Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5218Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5245Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5245Parser() {
		if (valuePinLabel_5245Parser == null) {
			valuePinLabel_5245Parser = new PinParser();
		}
		return valuePinLabel_5245Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5246Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5246Parser() {
		if (valuePinLabel_5246Parser == null) {
			valuePinLabel_5246Parser = new PinValueParser();
		}
		return valuePinLabel_5246Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5247Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5247Parser() {
		if (valuePinLabel_5247Parser == null) {
			valuePinLabel_5247Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5247Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5263Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5263Parser() {
		if (actionInputPinLabel_5263Parser == null) {
			actionInputPinLabel_5263Parser = new PinParser();
		}
		return actionInputPinLabel_5263Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5264Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5264Parser() {
		if (actionInputPinLabel_5264Parser == null) {
			actionInputPinLabel_5264Parser = new PinValueParser();
		}
		return actionInputPinLabel_5264Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5265Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5265Parser() {
		if (actionInputPinLabel_5265Parser == null) {
			actionInputPinLabel_5265Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5265Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5219Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5219Parser() {
		if (inputPinLabel_5219Parser == null) {
			inputPinLabel_5219Parser = new PinParser();
		}
		return inputPinLabel_5219Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser inputPinLabel_5220Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5220Parser() {
		if (inputPinLabel_5220Parser == null) {
			inputPinLabel_5220Parser = new PinValueParser();
		}
		return inputPinLabel_5220Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5248Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5248Parser() {
		if (valuePinLabel_5248Parser == null) {
			valuePinLabel_5248Parser = new PinParser();
		}
		return valuePinLabel_5248Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5249Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5249Parser() {
		if (valuePinLabel_5249Parser == null) {
			valuePinLabel_5249Parser = new PinValueParser();
		}
		return valuePinLabel_5249Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5250Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5250Parser() {
		if (valuePinLabel_5250Parser == null) {
			valuePinLabel_5250Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5250Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5266Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5266Parser() {
		if (actionInputPinLabel_5266Parser == null) {
			actionInputPinLabel_5266Parser = new PinParser();
		}
		return actionInputPinLabel_5266Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5267Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5267Parser() {
		if (actionInputPinLabel_5267Parser == null) {
			actionInputPinLabel_5267Parser = new PinValueParser();
		}
		return actionInputPinLabel_5267Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5268Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5268Parser() {
		if (actionInputPinLabel_5268Parser == null) {
			actionInputPinLabel_5268Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5268Parser;
	}

	/**
	 * @generated
	 */
	private IParser testIdentityActionName_5192Parser;

	/**
	 * @generated
	 */
	private IParser getTestIdentityActionName_5192Parser() {
		if (testIdentityActionName_5192Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			testIdentityActionName_5192Parser = parser;
		}
		return testIdentityActionName_5192Parser;
	}

	/**
	 * @generated
	 */
	private IParser testIdentityActionName_5395Parser;

	/**
	 * @generated
	 */
	private IParser getTestIdentityActionName_5395Parser() {
		if (testIdentityActionName_5395Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			testIdentityActionName_5395Parser = parser;
		}
		return testIdentityActionName_5395Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5205Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5205Parser() {
		if (outputPinLabel_5205Parser == null) {
			outputPinLabel_5205Parser = new PinParser();
		}
		return outputPinLabel_5205Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5206Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5206Parser() {
		if (outputPinLabel_5206Parser == null) {
			outputPinLabel_5206Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5206Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5221Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5221Parser() {
		if (inputPinLabel_5221Parser == null) {
			inputPinLabel_5221Parser = new PinParser();
		}
		return inputPinLabel_5221Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5222Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5222Parser() {
		if (inputPinLabel_5222Parser == null) {
			inputPinLabel_5222Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5222Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5223Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5223Parser() {
		if (inputPinLabel_5223Parser == null) {
			inputPinLabel_5223Parser = new PinParser();
		}
		return inputPinLabel_5223Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5224Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5224Parser() {
		if (inputPinLabel_5224Parser == null) {
			inputPinLabel_5224Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5224Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5251Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5251Parser() {
		if (valuePinLabel_5251Parser == null) {
			valuePinLabel_5251Parser = new PinParser();
		}
		return valuePinLabel_5251Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5252Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5252Parser() {
		if (valuePinLabel_5252Parser == null) {
			valuePinLabel_5252Parser = new PinValueParser();
		}
		return valuePinLabel_5252Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5253Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5253Parser() {
		if (valuePinLabel_5253Parser == null) {
			valuePinLabel_5253Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5253Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5254Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5254Parser() {
		if (valuePinLabel_5254Parser == null) {
			valuePinLabel_5254Parser = new PinParser();
		}
		return valuePinLabel_5254Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5255Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5255Parser() {
		if (valuePinLabel_5255Parser == null) {
			valuePinLabel_5255Parser = new PinValueParser();
		}
		return valuePinLabel_5255Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5256Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5256Parser() {
		if (valuePinLabel_5256Parser == null) {
			valuePinLabel_5256Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5256Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5269Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5269Parser() {
		if (actionInputPinLabel_5269Parser == null) {
			actionInputPinLabel_5269Parser = new PinParser();
		}
		return actionInputPinLabel_5269Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5270Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5270Parser() {
		if (actionInputPinLabel_5270Parser == null) {
			actionInputPinLabel_5270Parser = new PinValueParser();
		}
		return actionInputPinLabel_5270Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5271Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5271Parser() {
		if (actionInputPinLabel_5271Parser == null) {
			actionInputPinLabel_5271Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5271Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5272Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5272Parser() {
		if (actionInputPinLabel_5272Parser == null) {
			actionInputPinLabel_5272Parser = new PinParser();
		}
		return actionInputPinLabel_5272Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5273Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5273Parser() {
		if (actionInputPinLabel_5273Parser == null) {
			actionInputPinLabel_5273Parser = new PinValueParser();
		}
		return actionInputPinLabel_5273Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5274Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5274Parser() {
		if (actionInputPinLabel_5274Parser == null) {
			actionInputPinLabel_5274Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5274Parser;
	}

	/**
	 * @generated
	 */
	private IParser clearStructuralFeatureActionName_5193Parser;

	/**
	 * @generated
	 */
	private IParser getClearStructuralFeatureActionName_5193Parser() {
		if (clearStructuralFeatureActionName_5193Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clearStructuralFeatureActionName_5193Parser = parser;
		}
		return clearStructuralFeatureActionName_5193Parser;
	}

	/**
	 * @generated
	 */
	private IParser clearStructuralFeatureActionName_5396Parser;

	/**
	 * @generated
	 */
	private IParser getClearStructuralFeatureActionName_5396Parser() {
		if (clearStructuralFeatureActionName_5396Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clearStructuralFeatureActionName_5396Parser = parser;
		}
		return clearStructuralFeatureActionName_5396Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5207Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5207Parser() {
		if (outputPinLabel_5207Parser == null) {
			outputPinLabel_5207Parser = new PinParser();
		}
		return outputPinLabel_5207Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5208Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5208Parser() {
		if (outputPinLabel_5208Parser == null) {
			outputPinLabel_5208Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5208Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5225Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5225Parser() {
		if (inputPinLabel_5225Parser == null) {
			inputPinLabel_5225Parser = new PinParser();
		}
		return inputPinLabel_5225Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5226Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5226Parser() {
		if (inputPinLabel_5226Parser == null) {
			inputPinLabel_5226Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5226Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5260Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5260Parser() {
		if (valuePinLabel_5260Parser == null) {
			valuePinLabel_5260Parser = new PinParser();
		}
		return valuePinLabel_5260Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5261Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5261Parser() {
		if (valuePinLabel_5261Parser == null) {
			valuePinLabel_5261Parser = new PinValueParser();
		}
		return valuePinLabel_5261Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5262Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5262Parser() {
		if (valuePinLabel_5262Parser == null) {
			valuePinLabel_5262Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5262Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5275Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5275Parser() {
		if (actionInputPinLabel_5275Parser == null) {
			actionInputPinLabel_5275Parser = new PinParser();
		}
		return actionInputPinLabel_5275Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5276Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5276Parser() {
		if (actionInputPinLabel_5276Parser == null) {
			actionInputPinLabel_5276Parser = new PinValueParser();
		}
		return actionInputPinLabel_5276Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5277Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5277Parser() {
		if (actionInputPinLabel_5277Parser == null) {
			actionInputPinLabel_5277Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5277Parser;
	}

	/**
	 * @generated
	 */
	private IParser createLinkActionName_5195Parser;

	/**
	 * @generated
	 */
	private IParser getCreateLinkActionName_5195Parser() {
		if (createLinkActionName_5195Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createLinkActionName_5195Parser = parser;
		}
		return createLinkActionName_5195Parser;
	}

	/**
	 * @generated
	 */
	private IParser createLinkActionName_5397Parser;

	/**
	 * @generated
	 */
	private IParser getCreateLinkActionName_5397Parser() {
		if (createLinkActionName_5397Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createLinkActionName_5397Parser = parser;
		}
		return createLinkActionName_5397Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5227Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5227Parser() {
		if (inputPinLabel_5227Parser == null) {
			inputPinLabel_5227Parser = new PinParser();
		}
		return inputPinLabel_5227Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5228Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5228Parser() {
		if (inputPinLabel_5228Parser == null) {
			inputPinLabel_5228Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5228Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5281Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5281Parser() {
		if (valuePinLabel_5281Parser == null) {
			valuePinLabel_5281Parser = new PinParser();
		}
		return valuePinLabel_5281Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5282Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5282Parser() {
		if (valuePinLabel_5282Parser == null) {
			valuePinLabel_5282Parser = new PinValueParser();
		}
		return valuePinLabel_5282Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5283Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5283Parser() {
		if (valuePinLabel_5283Parser == null) {
			valuePinLabel_5283Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5283Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5278Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5278Parser() {
		if (actionInputPinLabel_5278Parser == null) {
			actionInputPinLabel_5278Parser = new PinParser();
		}
		return actionInputPinLabel_5278Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5279Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5279Parser() {
		if (actionInputPinLabel_5279Parser == null) {
			actionInputPinLabel_5279Parser = new PinValueParser();
		}
		return actionInputPinLabel_5279Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5280Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5280Parser() {
		if (actionInputPinLabel_5280Parser == null) {
			actionInputPinLabel_5280Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5280Parser;
	}

	/**
	 * @generated
	 */
	private IParser readLinkActionName_5194Parser;

	/**
	 * @generated
	 */
	private IParser getReadLinkActionName_5194Parser() {
		if (readLinkActionName_5194Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readLinkActionName_5194Parser = parser;
		}
		return readLinkActionName_5194Parser;
	}

	/**
	 * @generated
	 */
	private IParser readLinkActionName_5398Parser;

	/**
	 * @generated
	 */
	private IParser getReadLinkActionName_5398Parser() {
		if (readLinkActionName_5398Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readLinkActionName_5398Parser = parser;
		}
		return readLinkActionName_5398Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5209Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5209Parser() {
		if (outputPinLabel_5209Parser == null) {
			outputPinLabel_5209Parser = new PinParser();
		}
		return outputPinLabel_5209Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5210Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5210Parser() {
		if (outputPinLabel_5210Parser == null) {
			outputPinLabel_5210Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5210Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5229Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5229Parser() {
		if (inputPinLabel_5229Parser == null) {
			inputPinLabel_5229Parser = new PinParser();
		}
		return inputPinLabel_5229Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5230Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5230Parser() {
		if (inputPinLabel_5230Parser == null) {
			inputPinLabel_5230Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5230Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5287Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5287Parser() {
		if (valuePinLabel_5287Parser == null) {
			valuePinLabel_5287Parser = new PinParser();
		}
		return valuePinLabel_5287Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5288Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5288Parser() {
		if (valuePinLabel_5288Parser == null) {
			valuePinLabel_5288Parser = new PinValueParser();
		}
		return valuePinLabel_5288Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5289Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5289Parser() {
		if (valuePinLabel_5289Parser == null) {
			valuePinLabel_5289Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5289Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5284Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5284Parser() {
		if (actionInputPinLabel_5284Parser == null) {
			actionInputPinLabel_5284Parser = new PinParser();
		}
		return actionInputPinLabel_5284Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5285Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5285Parser() {
		if (actionInputPinLabel_5285Parser == null) {
			actionInputPinLabel_5285Parser = new PinValueParser();
		}
		return actionInputPinLabel_5285Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5286Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5286Parser() {
		if (actionInputPinLabel_5286Parser == null) {
			actionInputPinLabel_5286Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5286Parser;
	}

	/**
	 * @generated
	 */
	private IParser destroyLinkActionName_5196Parser;

	/**
	 * @generated
	 */
	private IParser getDestroyLinkActionName_5196Parser() {
		if (destroyLinkActionName_5196Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			destroyLinkActionName_5196Parser = parser;
		}
		return destroyLinkActionName_5196Parser;
	}

	/**
	 * @generated
	 */
	private IParser destroyLinkActionName_5399Parser;

	/**
	 * @generated
	 */
	private IParser getDestroyLinkActionName_5399Parser() {
		if (destroyLinkActionName_5399Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			destroyLinkActionName_5399Parser = parser;
		}
		return destroyLinkActionName_5399Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5231Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5231Parser() {
		if (inputPinLabel_5231Parser == null) {
			inputPinLabel_5231Parser = new PinParser();
		}
		return inputPinLabel_5231Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5232Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5232Parser() {
		if (inputPinLabel_5232Parser == null) {
			inputPinLabel_5232Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5232Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5290Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5290Parser() {
		if (valuePinLabel_5290Parser == null) {
			valuePinLabel_5290Parser = new PinParser();
		}
		return valuePinLabel_5290Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5291Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5291Parser() {
		if (valuePinLabel_5291Parser == null) {
			valuePinLabel_5291Parser = new PinValueParser();
		}
		return valuePinLabel_5291Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5292Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5292Parser() {
		if (valuePinLabel_5292Parser == null) {
			valuePinLabel_5292Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5292Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5293Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5293Parser() {
		if (actionInputPinLabel_5293Parser == null) {
			actionInputPinLabel_5293Parser = new PinParser();
		}
		return actionInputPinLabel_5293Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5294Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5294Parser() {
		if (actionInputPinLabel_5294Parser == null) {
			actionInputPinLabel_5294Parser = new PinValueParser();
		}
		return actionInputPinLabel_5294Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5295Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5295Parser() {
		if (actionInputPinLabel_5295Parser == null) {
			actionInputPinLabel_5295Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5295Parser;
	}

	/**
	 * @generated
	 */
	private IParser clearAssociationActionName_5197Parser;

	/**
	 * @generated
	 */
	private IParser getClearAssociationActionName_5197Parser() {
		if (clearAssociationActionName_5197Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clearAssociationActionName_5197Parser = parser;
		}
		return clearAssociationActionName_5197Parser;
	}

	/**
	 * @generated
	 */
	private IParser clearAssociationActionName_5400Parser;

	/**
	 * @generated
	 */
	private IParser getClearAssociationActionName_5400Parser() {
		if (clearAssociationActionName_5400Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clearAssociationActionName_5400Parser = parser;
		}
		return clearAssociationActionName_5400Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5235Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5235Parser() {
		if (inputPinLabel_5235Parser == null) {
			inputPinLabel_5235Parser = new PinParser();
		}
		return inputPinLabel_5235Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5236Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5236Parser() {
		if (inputPinLabel_5236Parser == null) {
			inputPinLabel_5236Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5236Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5296Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5296Parser() {
		if (valuePinLabel_5296Parser == null) {
			valuePinLabel_5296Parser = new PinParser();
		}
		return valuePinLabel_5296Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5297Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5297Parser() {
		if (valuePinLabel_5297Parser == null) {
			valuePinLabel_5297Parser = new PinValueParser();
		}
		return valuePinLabel_5297Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5298Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5298Parser() {
		if (valuePinLabel_5298Parser == null) {
			valuePinLabel_5298Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5298Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5299Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5299Parser() {
		if (actionInputPinLabel_5299Parser == null) {
			actionInputPinLabel_5299Parser = new PinParser();
		}
		return actionInputPinLabel_5299Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5300Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5300Parser() {
		if (actionInputPinLabel_5300Parser == null) {
			actionInputPinLabel_5300Parser = new PinValueParser();
		}
		return actionInputPinLabel_5300Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5301Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5301Parser() {
		if (actionInputPinLabel_5301Parser == null) {
			actionInputPinLabel_5301Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5301Parser;
	}

	/**
	 * @generated
	 */
	private IParser readExtentActionName_5198Parser;

	/**
	 * @generated
	 */
	private IParser getReadExtentActionName_5198Parser() {
		if (readExtentActionName_5198Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readExtentActionName_5198Parser = parser;
		}
		return readExtentActionName_5198Parser;
	}

	/**
	 * @generated
	 */
	private IParser readExtentActionName_5402Parser;

	/**
	 * @generated
	 */
	private IParser getReadExtentActionName_5402Parser() {
		if (readExtentActionName_5402Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readExtentActionName_5402Parser = parser;
		}
		return readExtentActionName_5402Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5211Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5211Parser() {
		if (outputPinLabel_5211Parser == null) {
			outputPinLabel_5211Parser = new PinParser();
		}
		return outputPinLabel_5211Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5212Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5212Parser() {
		if (outputPinLabel_5212Parser == null) {
			outputPinLabel_5212Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5212Parser;
	}

	/**
	 * @generated
	 */
	private IParser reclassifyObjectActionName_5199Parser;

	/**
	 * @generated
	 */
	private IParser getReclassifyObjectActionName_5199Parser() {
		if (reclassifyObjectActionName_5199Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			reclassifyObjectActionName_5199Parser = parser;
		}
		return reclassifyObjectActionName_5199Parser;
	}

	/**
	 * @generated
	 */
	private IParser reclassifyObjectActionName_5401Parser;

	/**
	 * @generated
	 */
	private IParser getReclassifyObjectActionName_5401Parser() {
		if (reclassifyObjectActionName_5401Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			reclassifyObjectActionName_5401Parser = parser;
		}
		return reclassifyObjectActionName_5401Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5237Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5237Parser() {
		if (inputPinLabel_5237Parser == null) {
			inputPinLabel_5237Parser = new PinParser();
		}
		return inputPinLabel_5237Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5238Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5238Parser() {
		if (inputPinLabel_5238Parser == null) {
			inputPinLabel_5238Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5238Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5302Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5302Parser() {
		if (valuePinLabel_5302Parser == null) {
			valuePinLabel_5302Parser = new PinParser();
		}
		return valuePinLabel_5302Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5303Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5303Parser() {
		if (valuePinLabel_5303Parser == null) {
			valuePinLabel_5303Parser = new PinValueParser();
		}
		return valuePinLabel_5303Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5304Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5304Parser() {
		if (valuePinLabel_5304Parser == null) {
			valuePinLabel_5304Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5304Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5305Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5305Parser() {
		if (actionInputPinLabel_5305Parser == null) {
			actionInputPinLabel_5305Parser = new PinParser();
		}
		return actionInputPinLabel_5305Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5306Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5306Parser() {
		if (actionInputPinLabel_5306Parser == null) {
			actionInputPinLabel_5306Parser = new PinValueParser();
		}
		return actionInputPinLabel_5306Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5307Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5307Parser() {
		if (actionInputPinLabel_5307Parser == null) {
			actionInputPinLabel_5307Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5307Parser;
	}

	/**
	 * @generated
	 */
	private IParser readIsClassifiedObjectActionName_5200Parser;

	/**
	 * @generated
	 */
	private IParser getReadIsClassifiedObjectActionName_5200Parser() {
		if (readIsClassifiedObjectActionName_5200Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readIsClassifiedObjectActionName_5200Parser = parser;
		}
		return readIsClassifiedObjectActionName_5200Parser;
	}

	/**
	 * @generated
	 */
	private IParser readIsClassifiedObjectActionName_5403Parser;

	/**
	 * @generated
	 */
	private IParser getReadIsClassifiedObjectActionName_5403Parser() {
		if (readIsClassifiedObjectActionName_5403Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readIsClassifiedObjectActionName_5403Parser = parser;
		}
		return readIsClassifiedObjectActionName_5403Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5213Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5213Parser() {
		if (outputPinLabel_5213Parser == null) {
			outputPinLabel_5213Parser = new PinParser();
		}
		return outputPinLabel_5213Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5214Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5214Parser() {
		if (outputPinLabel_5214Parser == null) {
			outputPinLabel_5214Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5214Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5239Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5239Parser() {
		if (inputPinLabel_5239Parser == null) {
			inputPinLabel_5239Parser = new PinParser();
		}
		return inputPinLabel_5239Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5240Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5240Parser() {
		if (inputPinLabel_5240Parser == null) {
			inputPinLabel_5240Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5240Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5308Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5308Parser() {
		if (valuePinLabel_5308Parser == null) {
			valuePinLabel_5308Parser = new PinParser();
		}
		return valuePinLabel_5308Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5309Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5309Parser() {
		if (valuePinLabel_5309Parser == null) {
			valuePinLabel_5309Parser = new PinValueParser();
		}
		return valuePinLabel_5309Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5310Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5310Parser() {
		if (valuePinLabel_5310Parser == null) {
			valuePinLabel_5310Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5310Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5311Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5311Parser() {
		if (actionInputPinLabel_5311Parser == null) {
			actionInputPinLabel_5311Parser = new PinParser();
		}
		return actionInputPinLabel_5311Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5312Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5312Parser() {
		if (actionInputPinLabel_5312Parser == null) {
			actionInputPinLabel_5312Parser = new PinValueParser();
		}
		return actionInputPinLabel_5312Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5313Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5313Parser() {
		if (actionInputPinLabel_5313Parser == null) {
			actionInputPinLabel_5313Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5313Parser;
	}

	/**
	 * @generated
	 */
	private IParser reduceActionName_5201Parser;

	/**
	 * @generated
	 */
	private IParser getReduceActionName_5201Parser() {
		if (reduceActionName_5201Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			reduceActionName_5201Parser = parser;
		}
		return reduceActionName_5201Parser;
	}

	/**
	 * @generated
	 */
	private IParser reduceActionName_5404Parser;

	/**
	 * @generated
	 */
	private IParser getReduceActionName_5404Parser() {
		if (reduceActionName_5404Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			reduceActionName_5404Parser = parser;
		}
		return reduceActionName_5404Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5215Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5215Parser() {
		if (outputPinLabel_5215Parser == null) {
			outputPinLabel_5215Parser = new PinParser();
		}
		return outputPinLabel_5215Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5216Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5216Parser() {
		if (outputPinLabel_5216Parser == null) {
			outputPinLabel_5216Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5216Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5241Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5241Parser() {
		if (inputPinLabel_5241Parser == null) {
			inputPinLabel_5241Parser = new PinParser();
		}
		return inputPinLabel_5241Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5242Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5242Parser() {
		if (inputPinLabel_5242Parser == null) {
			inputPinLabel_5242Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5242Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5314Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5314Parser() {
		if (valuePinLabel_5314Parser == null) {
			valuePinLabel_5314Parser = new PinParser();
		}
		return valuePinLabel_5314Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5315Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5315Parser() {
		if (valuePinLabel_5315Parser == null) {
			valuePinLabel_5315Parser = new PinValueParser();
		}
		return valuePinLabel_5315Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5316Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5316Parser() {
		if (valuePinLabel_5316Parser == null) {
			valuePinLabel_5316Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5316Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5317Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5317Parser() {
		if (actionInputPinLabel_5317Parser == null) {
			actionInputPinLabel_5317Parser = new PinParser();
		}
		return actionInputPinLabel_5317Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5318Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5318Parser() {
		if (actionInputPinLabel_5318Parser == null) {
			actionInputPinLabel_5318Parser = new PinValueParser();
		}
		return actionInputPinLabel_5318Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5319Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5319Parser() {
		if (actionInputPinLabel_5319Parser == null) {
			actionInputPinLabel_5319Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5319Parser;
	}

	/**
	 * @generated
	 */
	private IParser startClassifierBehaviorActionName_5202Parser;

	/**
	 * @generated
	 */
	private IParser getStartClassifierBehaviorActionName_5202Parser() {
		if (startClassifierBehaviorActionName_5202Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			startClassifierBehaviorActionName_5202Parser = parser;
		}
		return startClassifierBehaviorActionName_5202Parser;
	}

	/**
	 * @generated
	 */
	private IParser startClassifierBehaviorActionName_5405Parser;

	/**
	 * @generated
	 */
	private IParser getStartClassifierBehaviorActionName_5405Parser() {
		if (startClassifierBehaviorActionName_5405Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			startClassifierBehaviorActionName_5405Parser = parser;
		}
		return startClassifierBehaviorActionName_5405Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5243Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5243Parser() {
		if (inputPinLabel_5243Parser == null) {
			inputPinLabel_5243Parser = new PinParser();
		}
		return inputPinLabel_5243Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser inputPinLabel_5244Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5244Parser() {
		if (inputPinLabel_5244Parser == null) {
			inputPinLabel_5244Parser = new AppliedStereotypeParser();
		}
		return inputPinLabel_5244Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5320Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5320Parser() {
		if (valuePinLabel_5320Parser == null) {
			valuePinLabel_5320Parser = new PinParser();
		}
		return valuePinLabel_5320Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser valuePinLabel_5321Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5321Parser() {
		if (valuePinLabel_5321Parser == null) {
			valuePinLabel_5321Parser = new PinValueParser();
		}
		return valuePinLabel_5321Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser valuePinLabel_5322Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5322Parser() {
		if (valuePinLabel_5322Parser == null) {
			valuePinLabel_5322Parser = new AppliedStereotypeParser();
		}
		return valuePinLabel_5322Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5323Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5323Parser() {
		if (actionInputPinLabel_5323Parser == null) {
			actionInputPinLabel_5323Parser = new PinParser();
		}
		return actionInputPinLabel_5323Parser;
	}

	/**
	 * @generated
	 */
	private PinValueParser actionInputPinLabel_5324Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5324Parser() {
		if (actionInputPinLabel_5324Parser == null) {
			actionInputPinLabel_5324Parser = new PinValueParser();
		}
		return actionInputPinLabel_5324Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser actionInputPinLabel_5325Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5325Parser() {
		if (actionInputPinLabel_5325Parser == null) {
			actionInputPinLabel_5325Parser = new AppliedStereotypeParser();
		}
		return actionInputPinLabel_5325Parser;
	}

	/**
	 * @generated
	 */
	private CommentParser commentBody_5138Parser;

	/**
	 * @generated
	 */
	private IParser getCommentBody_5138Parser() {
		if (commentBody_5138Parser == null) {
			commentBody_5138Parser = new CommentParser();
		}
		return commentBody_5138Parser;
	}

	/**
	 * @generated
	 */
	private IParser readSelfActionName_5139Parser;

	/**
	 * @generated
	 */
	private IParser getReadSelfActionName_5139Parser() {
		if (readSelfActionName_5139Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readSelfActionName_5139Parser = parser;
		}
		return readSelfActionName_5139Parser;
	}

	/**
	 * @generated
	 */
	private IParser readSelfActionName_6025Parser;

	/**
	 * @generated
	 */
	private IParser getReadSelfActionName_6025Parser() {
		if (readSelfActionName_6025Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			readSelfActionName_6025Parser = parser;
		}
		return readSelfActionName_6025Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5144Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5144Parser() {
		if (outputPinLabel_5144Parser == null) {
			outputPinLabel_5144Parser = new PinParser();
		}
		return outputPinLabel_5144Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5145Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5145Parser() {
		if (outputPinLabel_5145Parser == null) {
			outputPinLabel_5145Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5145Parser;
	}

	/**
	 * @generated
	 */
	private IParser activityName_5142Parser;

	/**
	 * @generated
	 */
	private IParser getActivityName_5142Parser() {
		if (activityName_5142Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityName_5142Parser = parser;
		}
		return activityName_5142Parser;
	}

	/**
	 * @generated
	 */
	private ActivitySingleExecutionParser activityIsSingleExecution_5143Parser;

	/**
	 * @generated
	 */
	private IParser getActivityIsSingleExecution_5143Parser() {
		if (activityIsSingleExecution_5143Parser == null) {
			activityIsSingleExecution_5143Parser = new ActivitySingleExecutionParser();
		}
		return activityIsSingleExecution_5143Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueSpecificationActionName_5126Parser;

	/**
	 * @generated
	 */
	private IParser getValueSpecificationActionName_5126Parser() {
		if (valueSpecificationActionName_5126Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueSpecificationActionName_5126Parser = parser;
		}
		return valueSpecificationActionName_5126Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueSpecificationActionName_6026Parser;

	/**
	 * @generated
	 */
	private IParser getValueSpecificationActionName_6026Parser() {
		if (valueSpecificationActionName_6026Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueSpecificationActionName_6026Parser = parser;
		}
		return valueSpecificationActionName_6026Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5124Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5124Parser() {
		if (outputPinLabel_5124Parser == null) {
			outputPinLabel_5124Parser = new PinParser();
		}
		return outputPinLabel_5124Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5125Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5125Parser() {
		if (outputPinLabel_5125Parser == null) {
			outputPinLabel_5125Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5125Parser;
	}

	/**
	 * @generated
	 */
	private ObjectNodeParser dataStoreNodeLabel_5127Parser;

	/**
	 * @generated
	 */
	private IParser getDataStoreNodeLabel_5127Parser() {
		if (dataStoreNodeLabel_5127Parser == null) {
			dataStoreNodeLabel_5127Parser = new ObjectNodeParser();
		}
		return dataStoreNodeLabel_5127Parser;
	}

	/**
	 * @generated
	 */
	private ObjectNodeSelectionParser dataStoreNodeLabel_5128Parser;

	/**
	 * @generated
	 */
	private IParser getDataStoreNodeLabel_5128Parser() {
		if (dataStoreNodeLabel_5128Parser == null) {
			dataStoreNodeLabel_5128Parser = new ObjectNodeSelectionParser();
		}
		return dataStoreNodeLabel_5128Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataStoreNodeName_6031Parser;

	/**
	 * @generated
	 */
	private IParser getDataStoreNodeName_6031Parser() {
		if (dataStoreNodeName_6031Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataStoreNodeName_6031Parser = parser;
		}
		return dataStoreNodeName_6031Parser;
	}

	/**
	 * @generated
	 */
	private StructuredActivityNodeKeywordParser conditionalNodeLabel_5119Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalNodeLabel_5119Parser() {
		if (conditionalNodeLabel_5119Parser == null) {
			conditionalNodeLabel_5119Parser = new StructuredActivityNodeKeywordParser();
		}
		return conditionalNodeLabel_5119Parser;
	}

	/**
	 * @generated
	 */
	private StructuredActivityNodeKeywordParser expansionRegionLabel_5120Parser;

	/**
	 * @generated
	 */
	private IParser getExpansionRegionLabel_5120Parser() {
		if (expansionRegionLabel_5120Parser == null) {
			expansionRegionLabel_5120Parser = new StructuredActivityNodeKeywordParser();
		}
		return expansionRegionLabel_5120Parser;
	}

	/**
	 * @generated
	 */
	private StructuredActivityNodeKeywordParser loopNodeLabel_5121Parser;

	/**
	 * @generated
	 */
	private IParser getLoopNodeLabel_5121Parser() {
		if (loopNodeLabel_5121Parser == null) {
			loopNodeLabel_5121Parser = new StructuredActivityNodeKeywordParser();
		}
		return loopNodeLabel_5121Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5184Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5184Parser() {
		if (outputPinLabel_5184Parser == null) {
			outputPinLabel_5184Parser = new PinParser();
		}
		return outputPinLabel_5184Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5185Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5185Parser() {
		if (outputPinLabel_5185Parser == null) {
			outputPinLabel_5185Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5185Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5186Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5186Parser() {
		if (outputPinLabel_5186Parser == null) {
			outputPinLabel_5186Parser = new PinParser();
		}
		return outputPinLabel_5186Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5183Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5183Parser() {
		if (outputPinLabel_5183Parser == null) {
			outputPinLabel_5183Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5183Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5187Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5187Parser() {
		if (outputPinLabel_5187Parser == null) {
			outputPinLabel_5187Parser = new PinParser();
		}
		return outputPinLabel_5187Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser outputPinLabel_5188Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5188Parser() {
		if (outputPinLabel_5188Parser == null) {
			outputPinLabel_5188Parser = new AppliedStereotypeParser();
		}
		return outputPinLabel_5188Parser;
	}

	/**
	 * @generated
	 */
	private StructuredActivityNodeKeywordParser sequenceNodeLabel_5123Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceNodeLabel_5123Parser() {
		if (sequenceNodeLabel_5123Parser == null) {
			sequenceNodeLabel_5123Parser = new StructuredActivityNodeKeywordParser();
		}
		return sequenceNodeLabel_5123Parser;
	}

	/**
	 * @generated
	 */
	private IParser intervalConstraintName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getIntervalConstraintName_5036Parser() {
		if (intervalConstraintName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			intervalConstraintName_5036Parser = parser;
		}
		return intervalConstraintName_5036Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser intervalConstraintLabel_5134Parser;

	/**
	 * @generated
	 */
	private IParser getIntervalConstraintLabel_5134Parser() {
		if (intervalConstraintLabel_5134Parser == null) {
			intervalConstraintLabel_5134Parser = new ConstraintParser();
		}
		return intervalConstraintLabel_5134Parser;
	}

	/**
	 * @generated
	 */
	private IParser intervalConstraintName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getIntervalConstraintName_5037Parser() {
		if (intervalConstraintName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			intervalConstraintName_5037Parser = parser;
		}
		return intervalConstraintName_5037Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser intervalConstraintLabel_5135Parser;

	/**
	 * @generated
	 */
	private IParser getIntervalConstraintLabel_5135Parser() {
		if (intervalConstraintLabel_5135Parser == null) {
			intervalConstraintLabel_5135Parser = new ConstraintParser();
		}
		return intervalConstraintLabel_5135Parser;
	}

	/**
	 * @generated
	 */
	private IParser durationConstraintName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getDurationConstraintName_5038Parser() {
		if (durationConstraintName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			durationConstraintName_5038Parser = parser;
		}
		return durationConstraintName_5038Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser durationConstraintLabel_5130Parser;

	/**
	 * @generated
	 */
	private IParser getDurationConstraintLabel_5130Parser() {
		if (durationConstraintLabel_5130Parser == null) {
			durationConstraintLabel_5130Parser = new ConstraintParser();
		}
		return durationConstraintLabel_5130Parser;
	}

	/**
	 * @generated
	 */
	private IParser durationConstraintName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getDurationConstraintName_5039Parser() {
		if (durationConstraintName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			durationConstraintName_5039Parser = parser;
		}
		return durationConstraintName_5039Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser durationConstraintLabel_5131Parser;

	/**
	 * @generated
	 */
	private IParser getDurationConstraintLabel_5131Parser() {
		if (durationConstraintLabel_5131Parser == null) {
			durationConstraintLabel_5131Parser = new ConstraintParser();
		}
		return durationConstraintLabel_5131Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeConstraintName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getTimeConstraintName_5040Parser() {
		if (timeConstraintName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			timeConstraintName_5040Parser = parser;
		}
		return timeConstraintName_5040Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser timeConstraintLabel_5132Parser;

	/**
	 * @generated
	 */
	private IParser getTimeConstraintLabel_5132Parser() {
		if (timeConstraintLabel_5132Parser == null) {
			timeConstraintLabel_5132Parser = new ConstraintParser();
		}
		return timeConstraintLabel_5132Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeConstraintName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getTimeConstraintName_5041Parser() {
		if (timeConstraintName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			timeConstraintName_5041Parser = parser;
		}
		return timeConstraintName_5041Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser timeConstraintLabel_5133Parser;

	/**
	 * @generated
	 */
	private IParser getTimeConstraintLabel_5133Parser() {
		if (timeConstraintLabel_5133Parser == null) {
			timeConstraintLabel_5133Parser = new ConstraintParser();
		}
		return timeConstraintLabel_5133Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectFlowName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getObjectFlowName_6001Parser() {
		if (objectFlowName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			objectFlowName_6001Parser = parser;
		}
		return objectFlowName_6001Parser;
	}

	/**
	 * @generated
	 */
	private ActivityEdgeWeightParser objectFlowLabel_6002Parser;

	/**
	 * @generated
	 */
	private IParser getObjectFlowLabel_6002Parser() {
		if (objectFlowLabel_6002Parser == null) {
			objectFlowLabel_6002Parser = new ActivityEdgeWeightParser();
		}
		return objectFlowLabel_6002Parser;
	}

	/**
	 * @generated
	 */
	private ObjectFlowSelectionParser objectFlowLabel_6005Parser;

	/**
	 * @generated
	 */
	private IParser getObjectFlowLabel_6005Parser() {
		if (objectFlowLabel_6005Parser == null) {
			objectFlowLabel_6005Parser = new ObjectFlowSelectionParser();
		}
		return objectFlowLabel_6005Parser;
	}

	/**
	 * @generated
	 */
	private ObjectFlowTransformationParser objectFlowLabel_6006Parser;

	/**
	 * @generated
	 */
	private IParser getObjectFlowLabel_6006Parser() {
		if (objectFlowLabel_6006Parser == null) {
			objectFlowLabel_6006Parser = new ObjectFlowTransformationParser();
		}
		return objectFlowLabel_6006Parser;
	}

	/**
	 * @generated
	 */
	private DecisionInputFlowParser objectFlowLabel_6007Parser;

	/**
	 * @generated
	 */
	private IParser getObjectFlowLabel_6007Parser() {
		if (objectFlowLabel_6007Parser == null) {
			objectFlowLabel_6007Parser = new DecisionInputFlowParser();
		}
		return objectFlowLabel_6007Parser;
	}

	/**
	 * @generated
	 */
	private EdgeGuardParser objectFlowLabel_6008Parser;

	/**
	 * @generated
	 */
	private IParser getObjectFlowLabel_6008Parser() {
		if (objectFlowLabel_6008Parser == null) {
			objectFlowLabel_6008Parser = new EdgeGuardParser();
		}
		return objectFlowLabel_6008Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser objectFlowLabel_6010Parser;

	/**
	 * @generated
	 */
	private IParser getObjectFlowLabel_6010Parser() {
		if (objectFlowLabel_6010Parser == null) {
			objectFlowLabel_6010Parser = new AppliedStereotypeParser();
		}
		return objectFlowLabel_6010Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlFlowName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getControlFlowName_6003Parser() {
		if (controlFlowName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controlFlowName_6003Parser = parser;
		}
		return controlFlowName_6003Parser;
	}

	/**
	 * @generated
	 */
	private ActivityEdgeWeightParser controlFlowLabel_6004Parser;

	/**
	 * @generated
	 */
	private IParser getControlFlowLabel_6004Parser() {
		if (controlFlowLabel_6004Parser == null) {
			controlFlowLabel_6004Parser = new ActivityEdgeWeightParser();
		}
		return controlFlowLabel_6004Parser;
	}

	/**
	 * @generated
	 */
	private EdgeGuardParser controlFlowLabel_6009Parser;

	/**
	 * @generated
	 */
	private IParser getControlFlowLabel_6009Parser() {
		if (controlFlowLabel_6009Parser == null) {
			controlFlowLabel_6009Parser = new EdgeGuardParser();
		}
		return controlFlowLabel_6009Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser controlFlowLabel_6011Parser;

	/**
	 * @generated
	 */
	private IParser getControlFlowLabel_6011Parser() {
		if (controlFlowLabel_6011Parser == null) {
			controlFlowLabel_6011Parser = new AppliedStereotypeParser();
		}
		return controlFlowLabel_6011Parser;
	}

	/**
	 * @generated
	 */
	private ExceptionHandlerTypeParser exceptionHandlerLabel_6012Parser;

	/**
	 * @generated
	 */
	private IParser getExceptionHandlerLabel_6012Parser() {
		if (exceptionHandlerLabel_6012Parser == null) {
			exceptionHandlerLabel_6012Parser = new ExceptionHandlerTypeParser();
		}
		return exceptionHandlerLabel_6012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActivityNameEditPart.VISUAL_ID:
			return getActivityName_5001Parser();
		case ActivityIsSingleExecutionEditPart.VISUAL_ID:
			return getActivityIsSingleExecution_5002Parser();
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001Parser();
		case ConstraintInActivityAsPrecondEditPart.VISUAL_ID:
			return getConstraint_3002Parser();
		case ConstraintInActivityAsPostcondEditPart.VISUAL_ID:
			return getConstraint_3003Parser();
		case InitialNodeFloatingNameEditPart.VISUAL_ID:
			return getInitialNodeName_6034Parser();
		case InitialNodeAppliedStereotypeEditPart.VISUAL_ID:
			return getInitialNodeLabel_5080Parser();
		case ActivityFinalNodeFloatingNameEditPart.VISUAL_ID:
			return getActivityFinalNodeName_6033Parser();
		case ActivityFinalNodeAppliedStereotypeEditPart.VISUAL_ID:
			return getActivityFinalNodeLabel_5081Parser();
		case FlowFinalNodeFloatingNameEditPart.VISUAL_ID:
			return getFlowFinalNodeName_6035Parser();
		case FlowFinalNodeAppliedStereotypeEditPart.VISUAL_ID:
			return getFlowFinalNodeLabel_5082Parser();
		case OpaqueActionNameEditPart.VISUAL_ID:
			return getOpaqueActionName_5003Parser();
		case OpaqueActionFloatingNameEditPart.VISUAL_ID:
			return getOpaqueActionName_6028Parser();
		case ValuePinInOActLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5011Parser();
		case ValuePinInOActValueEditPart.VISUAL_ID:
			return getValuePinLabel_5024Parser();
		case ValuePinInOActAppliedStereotypeEditPart.VISUAL_ID:
			return getValuePinLabel_5083Parser();
		case ActionInputPinInOActLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5012Parser();
		case ActionInputPinInOActValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5025Parser();
		case ActionInputPinInOActAppliedStereotypeEditPart.VISUAL_ID:
			return getActionInputPinLabel_5084Parser();
		case InputPinInOActLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5009Parser();
		case InputPinInOActAppliedStereotypeEditPart.VISUAL_ID:
			return getInputPinLabel_5085Parser();
		case OutputPinInOActLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5010Parser();
		case OutputPinInOActAppliedStereotypeEditPart.VISUAL_ID:
			return getOutputPinLabel_5086Parser();
		case CallBehaviorActionNameEditPart.VISUAL_ID:
			return getCallBehaviorActionLabel_5004Parser();
		case CallBehaviorActionFloatingNameEditPart.VISUAL_ID:
			return getCallBehaviorActionName_6029Parser();
		case ValuePinInCBActLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5013Parser();
		case ValuePinInCBActValueEditPart.VISUAL_ID:
			return getValuePinLabel_5026Parser();
		case ValuePinInCBActAppliedStereotypeEditPart.VISUAL_ID:
			return getValuePinLabel_5087Parser();
		case ActionInputPinInCBActLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5014Parser();
		case ActionInputPinInCBActValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5027Parser();
		case ActionInputPinInCBActAppliedStereotypeEditPart.VISUAL_ID:
			return getActionInputPinLabel_5088Parser();
		case InputPinInCBActLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5015Parser();
		case InputPinInCBActAppliedStereotypeEditPart.VISUAL_ID:
			return getInputPinLabel_5089Parser();
		case OutputPinInCBActLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5016Parser();
		case OutputPinInCBActAppliedStereotypeEditPart.VISUAL_ID:
			return getOutputPinLabel_5090Parser();
		case CallOperationActionNameEditPart.VISUAL_ID:
			return getCallOperationActionLabel_5006Parser();
		case CallOperationActionFloatingNameEditPart.VISUAL_ID:
			return getCallOperationActionName_6020Parser();
		case ActionInputPinInCOActLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5017Parser();
		case ActionInputPinInCOActValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5028Parser();
		case ActionInputPinInCOActAppliedStereotypeEditPart.VISUAL_ID:
			return getActionInputPinLabel_5091Parser();
		case ValuePinInCOActLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5018Parser();
		case ValuePinInCOActValueEditPart.VISUAL_ID:
			return getValuePinLabel_5029Parser();
		case ValuePinInCOActAppliedStereotypeEditPart.VISUAL_ID:
			return getValuePinLabel_5092Parser();
		case InputPinInCOActLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5019Parser();
		case InputPinInCOActAppliedStereotypeEditPart.VISUAL_ID:
			return getInputPinLabel_5093Parser();
		case OutputPinInCOActLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5020Parser();
		case OutputPinInCOActAppliedStereotypeEditPart.VISUAL_ID:
			return getOutputPinLabel_5094Parser();
		case ValuePinInCOActAsTargetLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5021Parser();
		case ValuePinInCOActAsTargetValueEditPart.VISUAL_ID:
			return getValuePinLabel_5030Parser();
		case ValuePinInCOActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
			return getValuePinLabel_5095Parser();
		case ActionInputPinInCOActAsTargetLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5022Parser();
		case ActionInputPinInCOActAsTargetValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5031Parser();
		case ActionInputPinInCOActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
			return getActionInputPinLabel_5096Parser();
		case InputPinInCOActAsTargetLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5023Parser();
		case InputPinInCOActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
			return getInputPinLabel_5097Parser();
		case DurationConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
			return getDurationConstraintName_5038Parser();
		case DurationConstraintAsLocalPrecondBodyEditPart.VISUAL_ID:
			return getDurationConstraintLabel_5130Parser();
		case DurationConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
			return getDurationConstraintName_5039Parser();
		case DurationConstraintAsLocalPostcondBodyEditPart.VISUAL_ID:
			return getDurationConstraintLabel_5131Parser();
		case TimeConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
			return getTimeConstraintName_5040Parser();
		case TimeConstraintAsLocalPrecondBodyEditPart.VISUAL_ID:
			return getTimeConstraintLabel_5132Parser();
		case TimeConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
			return getTimeConstraintName_5041Parser();
		case TimeConstraintAsLocalPostcondBodyEditPart.VISUAL_ID:
			return getTimeConstraintLabel_5133Parser();
		case IntervalConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
			return getIntervalConstraintName_5036Parser();
		case IntervalConstraintAsLocalPrecondBodyEditPart.VISUAL_ID:
			return getIntervalConstraintLabel_5134Parser();
		case IntervalConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
			return getIntervalConstraintName_5037Parser();
		case IntervalConstraintAsLocalPostcondBodyEditPart.VISUAL_ID:
			return getIntervalConstraintLabel_5135Parser();
		case ConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
			return getConstraintName_5007Parser();
		case ConstraintAsLocalPrecondBodyEditPart.VISUAL_ID:
			return getConstraintLabel_5136Parser();
		case ConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
			return getConstraintName_5008Parser();
		case ConstraintAsLocalPostcondBodyEditPart.VISUAL_ID:
			return getConstraintLabel_5137Parser();
		case DecisionNodeFloatingNameEditPart.VISUAL_ID:
			return getDecisionNodeName_6036Parser();
		case DecisionInputEditPart.VISUAL_ID:
			return getDecisionNodeLabel_5043Parser();
		case DecisionNodeAppliedStereotypeEditPart.VISUAL_ID:
			return getDecisionNodeLabel_5098Parser();
		case MergeNodeFloatingNameEditPart.VISUAL_ID:
			return getMergeNodeName_6037Parser();
		case MergeNodeAppliedStereotypeEditPart.VISUAL_ID:
			return getMergeNodeLabel_5099Parser();
		case ForkNodeFloatingNameEditPart.VISUAL_ID:
			return getForkNodeName_6038Parser();
		case ForkNodeAppliedStereotypeEditPart.VISUAL_ID:
			return getForkNodeLabel_5100Parser();
		case JoinNodeFloatingNameEditPart.VISUAL_ID:
			return getJoinNodeName_6039Parser();
		case JoinSpecEditPart.VISUAL_ID:
			return getJoinNodeLabel_5042Parser();
		case JoinNodeAppliedStereotypeEditPart.VISUAL_ID:
			return getJoinNodeLabel_5101Parser();
		case DataStoreNodeLabelEditPart.VISUAL_ID:
			return getDataStoreNodeLabel_5127Parser();
		case DataStoreSelectionEditPart.VISUAL_ID:
			return getDataStoreNodeLabel_5128Parser();
		case DataStoreNodeFloatingNameEditPart.VISUAL_ID:
			return getDataStoreNodeName_6031Parser();
		case SendObjectActionNameEditPart.VISUAL_ID:
			return getSendObjectActionName_5059Parser();
		case SendObjectActionFloatingNameEditPart.VISUAL_ID:
			return getSendObjectActionName_6027Parser();
		case ValuePinInSendObjActAsReqLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5049Parser();
		case ValuePinInSendObjActAsReqValueEditPart.VISUAL_ID:
			return getValuePinLabel_5050Parser();
		case ValuePinInSendObjActAsReqAppliedStereotypeEditPart.VISUAL_ID:
			return getValuePinLabel_5102Parser();
		case ActionInputPinInSendObjActAsReqLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5051Parser();
		case ActionInputPinInSendObjActAsReqValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5052Parser();
		case ActionInputPinInSendObjActAsReqAppliedStereotypeEditPart.VISUAL_ID:
			return getActionInputPinLabel_5103Parser();
		case InputPinInSendObjActAsReqLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5053Parser();
		case InputPinInSendObjActAsReqAppliedStereotypeEditPart.VISUAL_ID:
			return getInputPinLabel_5104Parser();
		case ValuePinInSendObjActAsTargetLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5054Parser();
		case ValuePinInSendObjActAsTargetValueEditPart.VISUAL_ID:
			return getValuePinLabel_5055Parser();
		case ValuePinInSendObjActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
			return getValuePinLabel_5105Parser();
		case ActionInputPinInSendObjActAsTargetLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5056Parser();
		case ActionInputPinInSendObjActAsTargetValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5057Parser();
		case ActionInputPinInSendObjActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
			return getActionInputPinLabel_5106Parser();
		case InputPinInSendObjActAsTargetLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5058Parser();
		case InputPinInSendObjActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
			return getInputPinLabel_5107Parser();
		case SendSignalActionNameEditPart.VISUAL_ID:
			return getSendSignalActionName_5060Parser();
		case SendSignalActionFloatingNameEditPart.VISUAL_ID:
			return getSendSignalActionName_6032Parser();
		case ActionInputPinInSendSigActLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5061Parser();
		case ActionInputPinInSendSigActValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5062Parser();
		case ActionInputPinInSendSigActAppliedStereotypeEditPart.VISUAL_ID:
			return getActionInputPinLabel_5108Parser();
		case ValuePinInSendSigActLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5063Parser();
		case ValuePinInSendSigActValueEditPart.VISUAL_ID:
			return getValuePinLabel_5064Parser();
		case ValuePinInSendSigActAppliedStereotypeEditPart.VISUAL_ID:
			return getValuePinLabel_5109Parser();
		case InputPinInSendSigActLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5065Parser();
		case InputPinInSendSigActAppliedStereotypeEditPart.VISUAL_ID:
			return getInputPinLabel_5110Parser();
		case ValuePinInSendSigActAsTargetLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5072Parser();
		case ValuePinInSendSigActAsTargetValueEditPart.VISUAL_ID:
			return getValuePinLabel_5073Parser();
		case ValuePinInSendSigActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
			return getValuePinLabel_5111Parser();
		case ActionInputPinInSendSigActAsTargetLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5074Parser();
		case ActionInputPinInSendSigActAsTargetValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5075Parser();
		case ActionInputPinInSendSigActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
			return getActionInputPinLabel_5112Parser();
		case InputPinInSendSigActAsTargetLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5076Parser();
		case InputPinInSendSigActAsTargetAppliedStereotypeEditPart.VISUAL_ID:
			return getInputPinLabel_5113Parser();
		case ParameterNodeNameEditPart.VISUAL_ID:
			return getActivityParameterNodeLabel_5071Parser();
		case AcceptEventActionLabelEditPart.VISUAL_ID:
			return getAcceptEventActionLabel_5078Parser();
		case AcceptTimeEventActionLabelEditPart.VISUAL_ID:
			return getAcceptEventActionLabel_5079Parser();
		case AcceptTimeEventActionAppliedStereotypeEditPart.VISUAL_ID:
			return getAcceptEventActionLabel_5115Parser();
		case AcceptEventActionFloatingNameEditPart.VISUAL_ID:
			return getAcceptEventActionName_6040Parser();
		case OutputPinInAcceptEventActionLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5077Parser();
		case OutputPinInAcceptEventActionAppliedStereotypeEditPart.VISUAL_ID:
			return getOutputPinLabel_5114Parser();
		case ValueSpecificationActionNameEditPart.VISUAL_ID:
			return getValueSpecificationActionName_5126Parser();
		case ValueSpecificationActionFloatingNameEditPart.VISUAL_ID:
			return getValueSpecificationActionName_6026Parser();
		case OutputPinInValSpecActLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5124Parser();
		case OutputPinInValSpecActAppliedStereotypeEditPart.VISUAL_ID:
			return getOutputPinLabel_5125Parser();
		case ConditionalNodeKeywordEditPart.VISUAL_ID:
			return getConditionalNodeLabel_5119Parser();
		case ExpansionRegionKeywordEditPart.VISUAL_ID:
			return getExpansionRegionLabel_5120Parser();
		case LoopNodeKeywordEditPart.VISUAL_ID:
			return getLoopNodeLabel_5121Parser();
		case OutputPinInLoopNodeAsBodyOutputLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5184Parser();
		case OutputPinInLoopNodeAsBodyOutputAppliedStereotypeEditPart.VISUAL_ID:
			return getOutputPinLabel_5185Parser();
		case OutputPinInLoopNodeAsLoopVariableLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5186Parser();
		case OutputPinInLoopNodeAsLoopVariableAppliedStereotypeEditPart.VISUAL_ID:
			return getOutputPinLabel_5183Parser();
		case OutputPinInLoopNodeAsResultLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5187Parser();
		case OutputPinInLoopNodeAsResultAppliedStereotypeEditPart.VISUAL_ID:
			return getOutputPinLabel_5188Parser();
		case SequenceNodeKeywordEditPart.VISUAL_ID:
			return getSequenceNodeLabel_5123Parser();
		case StructuredActivityNodeKeywordEditPart.VISUAL_ID:
			return getStructuredActivityNodeLabel_5117Parser();
		case InputPinInLoopNodeAsVariableLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5178Parser();
		case InputPinInStructuredActivityNodeAppliedStereotypeEditPart.VISUAL_ID:
			return getInputPinLabel_5179Parser();
		case ActivityPartitionNameEditPart.VISUAL_ID:
			return getActivityPartitionName_5118Parser();
		case ActivityPartitionFloatingNameEditPart.VISUAL_ID:
			return getActivityPartitionName_6016Parser();
		case CommentBodyLabelEditPart.VISUAL_ID:
			return getCommentBody_5138Parser();
		case ReadSelfActionNameEditPart.VISUAL_ID:
			return getReadSelfActionName_5139Parser();
		case ReadSelfActionFloatingNameEditPart.VISUAL_ID:
			return getReadSelfActionName_6025Parser();
		case OutputPinInReadSelfActionLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5144Parser();
		case OutputPinInReadSelfActionAppliedStereotypeEditPart.VISUAL_ID:
			return getOutputPinLabel_5145Parser();
		case ActivityNameEditPartCN.VISUAL_ID:
			return getActivityName_5142Parser();
		case ActivityIsSingleExecutionCNEditPart.VISUAL_ID:
			return getActivityIsSingleExecution_5143Parser();
		case CreateObjectActionNameEditPart.VISUAL_ID:
			return getCreateObjectActionName_5148Parser();
		case CreateObjectActionFloatingNameEditPart.VISUAL_ID:
			return getCreateObjectActionName_6024Parser();
		case OutputPinInCreateObjectActionAsResultLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5146Parser();
		case OutputPinInCreateObjectActionAsResultAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5147Parser();
		case ShapeNamedElementNameEditPart.VISUAL_ID:
			return getNamedElementName_5129Parser();
		case ReadStructuralFeatureActionNameEditPart.VISUAL_ID:
			return getReadStructuralFeatureActionName_5153Parser();
		case ReadStructuralFeatureActionFloatingNameEditPart.VISUAL_ID:
			return getReadStructuralFeatureActionName_6023Parser();
		case InputPinInReadStructuralFeatureAsObjectLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5149Parser();
		case InputPinInReadStructuralFeatureAsObjectAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5150Parser();
		case OutputPinInReadStructuralFeatureAsResultLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5151Parser();
		case InputPinInReadStructuralFeatureAsResultWrappingLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5152Parser();
		case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
			return getAddStructuralFeatureValueActionName_5160Parser();
		case AddStructuralFeatureValueActionFloatingNameEditPart.VISUAL_ID:
			return getAddStructuralFeatureValueActionName_6019Parser();
		case InputPinInAddStructuralFeatureValueActionAsObjectLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5154Parser();
		case InputPinInAddStructuralFeatureValueActionAsObjectAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5155Parser();
		case InputPinInAddStructuralFeatureValueActionAsValueLabel2EditPart.VISUAL_ID:
			return getInputPinLabel_5156Parser();
		case InputPinInAddStructuralFeatureValueActionAsValueAppliedStereotypeWrappingLabel2EditPart.VISUAL_ID:
			return getInputPinLabel_5157Parser();
		case OutputPinInAddStructuralFeatureValueActionAsResultLabel3EditPart.VISUAL_ID:
			return getOutputPinLabel_5158Parser();
		case OutputPinInAddStructuralFeatureValueActionAsResultAppliedStereotypeWrappingLabel3EditPart.VISUAL_ID:
			return getOutputPinLabel_5159Parser();
		case DestroyObjectActionNameEditPart.VISUAL_ID:
			return getDestroyObjectActionName_5163Parser();
		case DestroyObjectActionFloatingNameEditPart.VISUAL_ID:
			return getDestroyObjectActionName_6022Parser();
		case InputPinInDestroyObjectActionLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5161Parser();
		case InputPinInDestroyObjectActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5162Parser();
		case ValuePinInDestroyObjectActionLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5332Parser();
		case ValuePinInDestroyObjectActionValueEditPart.VISUAL_ID:
			return getValuePinLabel_5333Parser();
		case ValuePinInDestroyObjectActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5334Parser();
		case ActionPinInDestroyObjectActionLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5335Parser();
		case ActionPinInDestroyObjectActionValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5336Parser();
		case ActionPinInDestroyObjectActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5337Parser();
		case ReadVariableActionNameEditPart.VISUAL_ID:
			return getReadVariableActionName_5166Parser();
		case ReadVariableActionFloatingNameEditPart.VISUAL_ID:
			return getReadVariableActionName_6021Parser();
		case OutputPinInReadVariableActionAsResultLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5164Parser();
		case OutputPinInReadVariableActionAsResultAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5165Parser();
		case AddVariableValueActionNameEditPart.VISUAL_ID:
			return getAddVariableValueActionName_5171Parser();
		case AddVariableValueActionFloatingNameEditPart.VISUAL_ID:
			return getAddVariableValueActionName_6018Parser();
		case InputPinInAddVariableValueActionAsInsertAtLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5167Parser();
		case InputPinInAddVariableValueActionAsInsertAtAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5168Parser();
		case InputPinInAddVariableValueActionAsValueLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5169Parser();
		case InputPinInAddVariableValueActionAsValueAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5170Parser();
		case ValuePinInAddVariableValueActionAsInsertAtLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5350Parser();
		case ValuePinInAddVariableValueActionAsInsertAtValueEditPart.VISUAL_ID:
			return getValuePinLabel_5339Parser();
		case ValuePinInAddVariableValueActionAsInsertAtAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5340Parser();
		case ValuePinInAddVariableValueActionAsValueLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5341Parser();
		case ValuePinInAddVariableValueActionAsValueValueEditPart.VISUAL_ID:
			return getValuePinLabel_5342Parser();
		case ValuePinInAddVariableValueActionAsValueAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5343Parser();
		case ActionPinInAddVariableValueActionAsInsertAtLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5344Parser();
		case ActionPinInAddVariableValueActionAsInsertAtValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5345Parser();
		case ActionPinInAddVariableValueActionAsInsertAtAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5346Parser();
		case ActionPinInAddVariableValueActionAsValueLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5347Parser();
		case ActionPinInAddVariableValueActionAsValueValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5348Parser();
		case ActionPinInAddVariableValueActionAsValueAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5349Parser();
		case BroadcastSignalActionNameEditPart.VISUAL_ID:
			return getBroadcastSignalActionName_5175Parser();
		case BroadcastSignalActionFloatingNameEditPart.VISUAL_ID:
			return getBroadcastSignalActionName_6017Parser();
		case InputPinInBroadcastSignalActionLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5172Parser();
		case InputPinInBroadcastSignalActionValueLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5173Parser();
		case InputPinInBroadcastSignalActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5174Parser();
		case ValuePinInBroadcastSignalActionLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5351Parser();
		case ValuePinInBroadcastSignalActionValueLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5352Parser();
		case ValuePinInBroadcastSignalActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5353Parser();
		case ActionPinInBroadcastSignalActionLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5354Parser();
		case ActionPinInBroadcastSignalActionValueLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5355Parser();
		case ActionPinInBroadcastSignalActionAppliedStereotypeWrappingLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5356Parser();
		case CentralBufferNodeLabelEditPart.VISUAL_ID:
			return getCentralBufferNodeLabel_5176Parser();
		case CentralBufferNodeSelectionEditPart.VISUAL_ID:
			return getCentralBufferNodeLabel_5177Parser();
		case CentralBufferNodeFloatingNameEditPart.VISUAL_ID:
			return getCentralBufferNodeName_6030Parser();
		case ConstraintNameEditPartCN.VISUAL_ID:
			return getConstraintName_5189Parser();
		case ConstraintBodyEditPartCN.VISUAL_ID:
			return getConstraintSpecification_5190Parser();
		case StartObjectBehaviorActionNameEditPart.VISUAL_ID:
			return getStartObjectBehaviorActionName_5191Parser();
		case StartObjectBehaviorActionFloatingNameEditPart.VISUAL_ID:
			return getStartObjectBehaviorActionName_5394Parser();
		case OutputPinInStartObjectBehaviorActionLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5203Parser();
		case OutputPinInStartObjectBehaviorActionAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5204Parser();
		case InputPinInStartObjectBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5217Parser();
		case InputPinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5218Parser();
		case ValuePinInStartObjectBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5245Parser();
		case ValuePinInStartObjectBehaviorActionAsObjectValueEditPart.VISUAL_ID:
			return getValuePinLabel_5246Parser();
		case ValuePinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5247Parser();
		case ActionPinInStartObjectBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5263Parser();
		case ActionPinInStartObjectBehaviorActionAsObjectValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5264Parser();
		case ActionPinInStartObjectBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5265Parser();
		case InputPinInStartObjectBehaviorActionAsArgumentLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5219Parser();
		case InputPinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5220Parser();
		case ValuePinInStartObjectBehaviorActionAsArgumentLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5248Parser();
		case ValuePinInStartObjectBehaviorActionAsArgumentValueEditPart.VISUAL_ID:
			return getValuePinLabel_5249Parser();
		case ValuePinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5250Parser();
		case ActionPinInStartObjectBehaviorActionAsArgumentLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5266Parser();
		case ActionPinInStartObjectBehaviorActionAsArgumentValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5267Parser();
		case ActionPinInStartObjectBehaviorActionAsArgumentAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5268Parser();
		case TestIdentityActionNameEditPart.VISUAL_ID:
			return getTestIdentityActionName_5192Parser();
		case TestIdentityActionFloatingNameEditPart.VISUAL_ID:
			return getTestIdentityActionName_5395Parser();
		case OutputPinInTestIdentityActionItemLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5205Parser();
		case OutputPinInTestIdentityActionItemAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5206Parser();
		case InputPinInTestIdentityActionAsFirstLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5221Parser();
		case InputPinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5222Parser();
		case InputPinInTestIdentityActionAsSecondLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5223Parser();
		case InputPinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5224Parser();
		case ValuePinInTestIdentityActionAsFirstLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5251Parser();
		case ValuePinInTestIdentityActionAsFirstValueEditPart.VISUAL_ID:
			return getValuePinLabel_5252Parser();
		case ValuePinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5253Parser();
		case ValuePinInTestIdentityActionAsSecondLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5254Parser();
		case ValuePinInTestIdentityActionAsSecondValueEditPart.VISUAL_ID:
			return getValuePinLabel_5255Parser();
		case ValuePinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5256Parser();
		case ActionPinInTestIdentityActionAsFirstLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5269Parser();
		case ActionPinInTestIdentityActionAsFirstValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5270Parser();
		case ActionPinInTestIdentityActionAsFirstAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5271Parser();
		case ActionPinInTestIdentityActionAsSecondLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5272Parser();
		case ActionPinInTestIdentityActionAsSecondValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5273Parser();
		case ActionPinInTestIdentityActionAsSecondAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5274Parser();
		case ClearStructuralFeatureActionNameEditPart.VISUAL_ID:
			return getClearStructuralFeatureActionName_5193Parser();
		case ClearStructuralFeatureActionFloatingNameEditPart.VISUAL_ID:
			return getClearStructuralFeatureActionName_5396Parser();
		case OutputPinInClearStructuralFeatureActionLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5207Parser();
		case OutputPinInClearStructuralFeatureActionAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5208Parser();
		case InputPinInClearStructuralFeatureActionAsObjectLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5225Parser();
		case InputPinInClearStructuralFeatureActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5226Parser();
		case ValuePinInClearStructuralFeatureActionAsObjectLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5260Parser();
		case ValuePinInClearStructuralFeatureActionAsObjectValueEditPart.VISUAL_ID:
			return getValuePinLabel_5261Parser();
		case ValuePinInClearStructuralFeatureActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5262Parser();
		case ActionInputPinInClearStructuralFeatureActionAsObjectLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5275Parser();
		case ActionInputPinInClearStructuralFeatureActionAsObjectValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5276Parser();
		case ActionInputPinInClearStructFeatActAsObjectAppliedStereotypeEditPart.VISUAL_ID:
			return getActionInputPinLabel_5277Parser();
		case CreateLinkActionNameEditPart.VISUAL_ID:
			return getCreateLinkActionName_5195Parser();
		case CreateLinkActionFloatingNameEditPart.VISUAL_ID:
			return getCreateLinkActionName_5397Parser();
		case InputPinInCreateLinkActionAsInputValueLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5227Parser();
		case InputPinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5228Parser();
		case ValuePinInCreateLinkActionAsInputValueLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5281Parser();
		case ValuePinInCreateLinkActionAsInputValueValueEditPart.VISUAL_ID:
			return getValuePinLabel_5282Parser();
		case ValuePinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5283Parser();
		case ActionInputPinInCreateLinkActionAsInputValueLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5278Parser();
		case ActionInputPinInCreateLinkActionAsInputValueValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5279Parser();
		case ActionInputPinInCreateLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5280Parser();
		case ReadLinkActionNameEditPart.VISUAL_ID:
			return getReadLinkActionName_5194Parser();
		case ReadLinkActionFloatingNameEditPart.VISUAL_ID:
			return getReadLinkActionName_5398Parser();
		case OutputPinInReadLinkActionLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5209Parser();
		case OutputPinInReadLinkActionAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5210Parser();
		case InputPinInReadLinkActionAsInputValueLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5229Parser();
		case InputPinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5230Parser();
		case ValuePinInReadLinkActionAsInputValueLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5287Parser();
		case ValuePinInReadLinkActionAsInputValueValueEditPart.VISUAL_ID:
			return getValuePinLabel_5288Parser();
		case ValuePinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5289Parser();
		case ActionInputPinInReadLinkActionAsInputValueLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5284Parser();
		case ActionInputPinInReadLinkActionAsInputValueValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5285Parser();
		case ActionInputPinInReadLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5286Parser();
		case DestroyLinkActionNameEditPart.VISUAL_ID:
			return getDestroyLinkActionName_5196Parser();
		case DestroyLinkActionFloatingNameEditPart.VISUAL_ID:
			return getDestroyLinkActionName_5399Parser();
		case InputPinInDestroyLinkActionAsInputValueLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5231Parser();
		case InputPinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5232Parser();
		case ValuePinInDestroyLinkActionAsInputValueLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5290Parser();
		case ValuePinInDestroyLinkActionAsInputValueValueEditPart.VISUAL_ID:
			return getValuePinLabel_5291Parser();
		case ValuePinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5292Parser();
		case ActionInputPinInDestroyLinkActionAsInputValueLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5293Parser();
		case ActionInputPinInDestroyLinkActionAsInputValueValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5294Parser();
		case ActionInputPinInDestroyLinkActionAsInputValueAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5295Parser();
		case ClearAssociationActionNameEditPart.VISUAL_ID:
			return getClearAssociationActionName_5197Parser();
		case ClearAssociationActionFloatingNameEditPart.VISUAL_ID:
			return getClearAssociationActionName_5400Parser();
		case InputPinInClearAssociationActionAsObjectLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5235Parser();
		case InputPinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5236Parser();
		case ValuePinInClearAssociationActionAsObjectLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5296Parser();
		case ValuePinInClearAssociationActionAsObjectValueEditPart.VISUAL_ID:
			return getValuePinLabel_5297Parser();
		case ValuePinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5298Parser();
		case ActionPinInClearAssociationActionAsObjectLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5299Parser();
		case ActionPinInClearAssociationActionAsObjectValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5300Parser();
		case ActionPinInClearAssociationActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5301Parser();
		case ReadExtentActionNameEditPart.VISUAL_ID:
			return getReadExtentActionName_5198Parser();
		case ReadExtentActionFloatingNameEditPart.VISUAL_ID:
			return getReadExtentActionName_5402Parser();
		case OutputPinInReadExtentActionLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5211Parser();
		case OutputPinInReadExtentActionAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5212Parser();
		case ReclassifyObjectActionNameEditPart.VISUAL_ID:
			return getReclassifyObjectActionName_5199Parser();
		case ReclassifyObjectActionFloatingNameEditPart.VISUAL_ID:
			return getReclassifyObjectActionName_5401Parser();
		case InputPinInReclassifyObjectActionAsObjectLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5237Parser();
		case InputPinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5238Parser();
		case ValuePinInReclassifyObjectActionAsObjectLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5302Parser();
		case ValuePinInReclassifyObjectActionAsObjectValueEditPart.VISUAL_ID:
			return getValuePinLabel_5303Parser();
		case ValuePinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5304Parser();
		case ActionPinInReclassifyObjectActionAsObjectLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5305Parser();
		case ActionPinInReclassifyObjectActionAsObjectValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5306Parser();
		case ActionPinInReclassifyObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5307Parser();
		case ReadIsClassifiedObjectActionNameEditPart.VISUAL_ID:
			return getReadIsClassifiedObjectActionName_5200Parser();
		case ReadIsClassifiedObjectActionFloatingNameEditPart.VISUAL_ID:
			return getReadIsClassifiedObjectActionName_5403Parser();
		case OutputPinInReadIsClassifiedObjectActionLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5213Parser();
		case OutputPinInReadIsClassifiedObjectActionAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5214Parser();
		case InputPinInReadIsClassifiedObjectActionAsObjectLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5239Parser();
		case InputPinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5240Parser();
		case ValuePinInReadIsClassifiedObjectActionAsObjectLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5308Parser();
		case ValuePinInReadIsClassifiedObjectActionAsObjectValueEditPart.VISUAL_ID:
			return getValuePinLabel_5309Parser();
		case ValuePinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5310Parser();
		case ActionPinInReadIsClassifiedObjectActionAsObjectLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5311Parser();
		case ActionPinInReadIsClassifiedObjectActionAsObjectValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5312Parser();
		case ActionPinInReadIsClassifiedObjectActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5313Parser();
		case ReduceActionNameEditPart.VISUAL_ID:
			return getReduceActionName_5201Parser();
		case ReduceActionFloatingNameEditPart.VISUAL_ID:
			return getReduceActionName_5404Parser();
		case OutputPinInReduceActionLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5215Parser();
		case OutputPinInReduceActionAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5216Parser();
		case InputPinInReduceActionAsCollectionLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5241Parser();
		case InputPinInReduceActionAsCollectionAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5242Parser();
		case ValuePinInReduceActionAsCollectionLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5314Parser();
		case ValuePinInReduceActionAsCollectionValueEditPart.VISUAL_ID:
			return getValuePinLabel_5315Parser();
		case ValuePinInReduceActionAsCollectionAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5316Parser();
		case ActionPinInReduceActionAsCollectionLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5317Parser();
		case ActionPinInReduceActionAsCollectionValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5318Parser();
		case ActionPinInReduceActionAsCollectionAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5319Parser();
		case StartClassifierBehaviorActionNameEditPart.VISUAL_ID:
			return getStartClassifierBehaviorActionName_5202Parser();
		case StartClassifierBehaviorActionFloatingNameEditPart.VISUAL_ID:
			return getStartClassifierBehaviorActionName_5405Parser();
		case InputPinInStartClassifierBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5243Parser();
		case InputPinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5244Parser();
		case ValuePinInStartClassifierBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5320Parser();
		case ValuePinInStartClassifierBehaviorActionAsObjectValueEditPart.VISUAL_ID:
			return getValuePinLabel_5321Parser();
		case ValuePinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5322Parser();
		case ActionPinInStartClassifierBehaviorActionAsObjectLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5323Parser();
		case ActionPinInStartClassifierBehaviorActionAsObjectValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5324Parser();
		case ActionPinInStartClassifierBehaviorActionAsObjectAppliedStereotypeLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5325Parser();
		case ObjectFlowNameEditPart.VISUAL_ID:
			return getObjectFlowName_6001Parser();
		case ObjectFlowWeightEditPart.VISUAL_ID:
			return getObjectFlowLabel_6002Parser();
		case ObjectFlowSelectionEditPart.VISUAL_ID:
			return getObjectFlowLabel_6005Parser();
		case ObjectFlowTransformationEditPart.VISUAL_ID:
			return getObjectFlowLabel_6006Parser();
		case DecisionInputFlowEditPart.VISUAL_ID:
			return getObjectFlowLabel_6007Parser();
		case ObjectFlowGuardEditPart.VISUAL_ID:
			return getObjectFlowLabel_6008Parser();
		case ObjectFlowAppliedStereotypeEditPart.VISUAL_ID:
			return getObjectFlowLabel_6010Parser();
		case ControlFlowNameEditPart.VISUAL_ID:
			return getControlFlowName_6003Parser();
		case ControlFlowWeightEditPart.VISUAL_ID:
			return getControlFlowLabel_6004Parser();
		case ControlFlowGuardEditPart.VISUAL_ID:
			return getControlFlowLabel_6009Parser();
		case ControlFlowAppliedStereotypeEditPart.VISUAL_ID:
			return getControlFlowLabel_6011Parser();
		case ExceptionHandlerTypeEditPart.VISUAL_ID:
			return getExceptionHandlerLabel_6012Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 *
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	@Override
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		@Override
		public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}
}
