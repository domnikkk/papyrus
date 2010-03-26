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
package org.eclipse.papyrus.diagram.activity.providers;

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
import org.eclipse.papyrus.diagram.activity.edit.parts.AcceptEventActionLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.AcceptTimeEventActionLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCBActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCBActValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCOActAsTargetLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCOActAsTargetValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCOActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInCOActValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInOActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInOActValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendObjActAsReqLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendObjActAsReqValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendObjActAsTargetLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendObjActAsTargetValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendSigActAsTargetLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendSigActAsTargetValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendSigActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActionInputPinInSendSigActValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityIsSingleExecutionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ActivityNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CallBehaviorActionNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CallOperationActionNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.CenteredWrappedLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintAsLocalPostcondNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintAsLocalPrecondNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintInActivityAsPostcondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ConstraintInActivityAsPrecondEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ControlFlowGuardEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ControlFlowNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ControlFlowWeightEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.DecisionInputEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.DecisionInputFlowEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.DurationConstraintAsLocalPostcondNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.DurationConstraintAsLocalPrecondNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCBActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCOActAsTargetLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInCOActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInOActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInSendObjActAsReqLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInSendObjActAsTargetLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInSendSigActAsTargetLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InputPinInSendSigActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InteractionConstraintAsLocalPostcondNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.InteractionConstraintAsLocalPrecondNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.IntervalConstraintAsLocalPostcondNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.IntervalConstraintAsLocalPrecondNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.JoinSpecEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowGuardEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowSelectionEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowTransformationEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ObjectFlowWeightEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OpaqueActionNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInAcceptEventActionLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInCBActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInCOActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.OutputPinInOActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ParameterEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.SendObjectActionNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.SendSignalActionNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.TimeConstraintAsLocalPostcondNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.TimeConstraintAsLocalPrecondNameEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCBActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCBActValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCOActAsTargetLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCOActAsTargetValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCOActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInCOActValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInOActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInOActValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendObjActAsReqLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendObjActAsReqValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendObjActAsTargetLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendObjActAsTargetValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendSigActAsTargetLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendSigActAsTargetValueEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendSigActLabelEditPart;
import org.eclipse.papyrus.diagram.activity.edit.parts.ValuePinInSendSigActValueEditPart;
import org.eclipse.papyrus.diagram.activity.parser.custom.AcceptEventActionParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.AcceptTimeEventActionParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.ActivityEdgeWeightParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.ActivityParameterNodeParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.ActivitySingleExecutionParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.CallBehaviorActionParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.CallOperationActionParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.DecisionInputFlowParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.EdgeGuardParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.InputDecisionParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.JoinSpecParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.ObjectFlowSelectionParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.ObjectFlowTransformationParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.ParameterParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.PinParser;
import org.eclipse.papyrus.diagram.activity.parser.custom.PinValueParser;
import org.eclipse.papyrus.diagram.activity.parsers.MessageFormatParser;
import org.eclipse.papyrus.diagram.activity.part.UMLVisualIDRegistry;
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
		if(activityName_5001Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityName_5001Parser = parser;
		}
		return activityName_5001Parser;
	}

	/**
	 * @generated
	 */
	private ActivitySingleExecutionParser activityIsSingleExecution_5002Parser;

	/**
	 * @generated
	 */
	private IParser getActivityIsSingleExecution_5002Parser() {
		if(activityIsSingleExecution_5002Parser == null) {
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
		if(parameter_3001Parser == null) {
			parameter_3001Parser = new ParameterParser();
		}
		return parameter_3001Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraint_3002Parser;

	/**
	 * @generated
	 */
	private IParser getConstraint_3002Parser() {
		if(constraint_3002Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<precondition>> {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			constraint_3002Parser = parser;
		}
		return constraint_3002Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraint_3003Parser;

	/**
	 * @generated
	 */
	private IParser getConstraint_3003Parser() {
		if(constraint_3003Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<postcondition>> {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			constraint_3003Parser = parser;
		}
		return constraint_3003Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActionName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActionName_5003Parser() {
		if(opaqueActionName_5003Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			opaqueActionName_5003Parser = parser;
		}
		return opaqueActionName_5003Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5011Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5011Parser() {
		if(valuePinLabel_5011Parser == null) {
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
		if(valuePinLabel_5024Parser == null) {
			valuePinLabel_5024Parser = new PinValueParser();
		}
		return valuePinLabel_5024Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5012Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5012Parser() {
		if(actionInputPinLabel_5012Parser == null) {
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
		if(actionInputPinLabel_5025Parser == null) {
			actionInputPinLabel_5025Parser = new PinValueParser();
		}
		return actionInputPinLabel_5025Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5009Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5009Parser() {
		if(inputPinLabel_5009Parser == null) {
			inputPinLabel_5009Parser = new PinParser();
		}
		return inputPinLabel_5009Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5010Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5010Parser() {
		if(outputPinLabel_5010Parser == null) {
			outputPinLabel_5010Parser = new PinParser();
		}
		return outputPinLabel_5010Parser;
	}

	/**
	 * @generated
	 */
	private CallBehaviorActionParser callBehaviorActionLabel_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCallBehaviorActionLabel_5004Parser() {
		if(callBehaviorActionLabel_5004Parser == null) {
			callBehaviorActionLabel_5004Parser = new CallBehaviorActionParser();
		}
		return callBehaviorActionLabel_5004Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5013Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5013Parser() {
		if(valuePinLabel_5013Parser == null) {
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
		if(valuePinLabel_5026Parser == null) {
			valuePinLabel_5026Parser = new PinValueParser();
		}
		return valuePinLabel_5026Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5014Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5014Parser() {
		if(actionInputPinLabel_5014Parser == null) {
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
		if(actionInputPinLabel_5027Parser == null) {
			actionInputPinLabel_5027Parser = new PinValueParser();
		}
		return actionInputPinLabel_5027Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5015Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5015Parser() {
		if(inputPinLabel_5015Parser == null) {
			inputPinLabel_5015Parser = new PinParser();
		}
		return inputPinLabel_5015Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5016Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5016Parser() {
		if(outputPinLabel_5016Parser == null) {
			outputPinLabel_5016Parser = new PinParser();
		}
		return outputPinLabel_5016Parser;
	}

	/**
	 * @generated
	 */
	private CallOperationActionParser callOperationActionLabel_5006Parser;

	/**
	 * @generated
	 */
	private IParser getCallOperationActionLabel_5006Parser() {
		if(callOperationActionLabel_5006Parser == null) {
			callOperationActionLabel_5006Parser = new CallOperationActionParser();
		}
		return callOperationActionLabel_5006Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5017Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5017Parser() {
		if(actionInputPinLabel_5017Parser == null) {
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
		if(actionInputPinLabel_5028Parser == null) {
			actionInputPinLabel_5028Parser = new PinValueParser();
		}
		return actionInputPinLabel_5028Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5018Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5018Parser() {
		if(valuePinLabel_5018Parser == null) {
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
		if(valuePinLabel_5029Parser == null) {
			valuePinLabel_5029Parser = new PinValueParser();
		}
		return valuePinLabel_5029Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5019Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5019Parser() {
		if(inputPinLabel_5019Parser == null) {
			inputPinLabel_5019Parser = new PinParser();
		}
		return inputPinLabel_5019Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5020Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5020Parser() {
		if(outputPinLabel_5020Parser == null) {
			outputPinLabel_5020Parser = new PinParser();
		}
		return outputPinLabel_5020Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5021Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5021Parser() {
		if(valuePinLabel_5021Parser == null) {
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
		if(valuePinLabel_5030Parser == null) {
			valuePinLabel_5030Parser = new PinValueParser();
		}
		return valuePinLabel_5030Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5022Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5022Parser() {
		if(actionInputPinLabel_5022Parser == null) {
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
		if(actionInputPinLabel_5031Parser == null) {
			actionInputPinLabel_5031Parser = new PinValueParser();
		}
		return actionInputPinLabel_5031Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5023Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5023Parser() {
		if(inputPinLabel_5023Parser == null) {
			inputPinLabel_5023Parser = new PinParser();
		}
		return inputPinLabel_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintName_5007Parser() {
		if(constraintName_5007Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<localPrecondition>>\n{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			constraintName_5007Parser = parser;
		}
		return constraintName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintName_5008Parser() {
		if(constraintName_5008Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<localPostcondition>>\n{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			constraintName_5008Parser = parser;
		}
		return constraintName_5008Parser;
	}

	/**
	 * @generated
	 */
	private InputDecisionParser decisionNodeLabel_5043Parser;

	/**
	 * @generated
	 */
	private IParser getDecisionNodeLabel_5043Parser() {
		if(decisionNodeLabel_5043Parser == null) {
			decisionNodeLabel_5043Parser = new InputDecisionParser();
		}
		return decisionNodeLabel_5043Parser;
	}

	/**
	 * @generated
	 */
	private JoinSpecParser joinNodeLabel_5042Parser;

	/**
	 * @generated
	 */
	private IParser getJoinNodeLabel_5042Parser() {
		if(joinNodeLabel_5042Parser == null) {
			joinNodeLabel_5042Parser = new JoinSpecParser();
		}
		return joinNodeLabel_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser sendObjectActionName_5059Parser;

	/**
	 * @generated
	 */
	private IParser getSendObjectActionName_5059Parser() {
		if(sendObjectActionName_5059Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendObjectActionName_5059Parser = parser;
		}
		return sendObjectActionName_5059Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5049Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5049Parser() {
		if(valuePinLabel_5049Parser == null) {
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
		if(valuePinLabel_5050Parser == null) {
			valuePinLabel_5050Parser = new PinValueParser();
		}
		return valuePinLabel_5050Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5051Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5051Parser() {
		if(actionInputPinLabel_5051Parser == null) {
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
		if(actionInputPinLabel_5052Parser == null) {
			actionInputPinLabel_5052Parser = new PinValueParser();
		}
		return actionInputPinLabel_5052Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5053Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5053Parser() {
		if(inputPinLabel_5053Parser == null) {
			inputPinLabel_5053Parser = new PinParser();
		}
		return inputPinLabel_5053Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5054Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5054Parser() {
		if(valuePinLabel_5054Parser == null) {
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
		if(valuePinLabel_5055Parser == null) {
			valuePinLabel_5055Parser = new PinValueParser();
		}
		return valuePinLabel_5055Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5056Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5056Parser() {
		if(actionInputPinLabel_5056Parser == null) {
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
		if(actionInputPinLabel_5057Parser == null) {
			actionInputPinLabel_5057Parser = new PinValueParser();
		}
		return actionInputPinLabel_5057Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5058Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5058Parser() {
		if(inputPinLabel_5058Parser == null) {
			inputPinLabel_5058Parser = new PinParser();
		}
		return inputPinLabel_5058Parser;
	}

	/**
	 * @generated
	 */
	private IParser sendSignalActionName_5060Parser;

	/**
	 * @generated
	 */
	private IParser getSendSignalActionName_5060Parser() {
		if(sendSignalActionName_5060Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sendSignalActionName_5060Parser = parser;
		}
		return sendSignalActionName_5060Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5061Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5061Parser() {
		if(actionInputPinLabel_5061Parser == null) {
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
		if(actionInputPinLabel_5062Parser == null) {
			actionInputPinLabel_5062Parser = new PinValueParser();
		}
		return actionInputPinLabel_5062Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5063Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5063Parser() {
		if(valuePinLabel_5063Parser == null) {
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
		if(valuePinLabel_5064Parser == null) {
			valuePinLabel_5064Parser = new PinValueParser();
		}
		return valuePinLabel_5064Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5065Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5065Parser() {
		if(inputPinLabel_5065Parser == null) {
			inputPinLabel_5065Parser = new PinParser();
		}
		return inputPinLabel_5065Parser;
	}

	/**
	 * @generated
	 */
	private PinParser valuePinLabel_5072Parser;

	/**
	 * @generated
	 */
	private IParser getValuePinLabel_5072Parser() {
		if(valuePinLabel_5072Parser == null) {
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
		if(valuePinLabel_5073Parser == null) {
			valuePinLabel_5073Parser = new PinValueParser();
		}
		return valuePinLabel_5073Parser;
	}

	/**
	 * @generated
	 */
	private PinParser actionInputPinLabel_5074Parser;

	/**
	 * @generated
	 */
	private IParser getActionInputPinLabel_5074Parser() {
		if(actionInputPinLabel_5074Parser == null) {
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
		if(actionInputPinLabel_5075Parser == null) {
			actionInputPinLabel_5075Parser = new PinValueParser();
		}
		return actionInputPinLabel_5075Parser;
	}

	/**
	 * @generated
	 */
	private PinParser inputPinLabel_5076Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinLabel_5076Parser() {
		if(inputPinLabel_5076Parser == null) {
			inputPinLabel_5076Parser = new PinParser();
		}
		return inputPinLabel_5076Parser;
	}

	/**
	 * @generated
	 */
	private ActivityParameterNodeParser activityParameterNodeLabel_5071Parser;

	/**
	 * @generated
	 */
	private IParser getActivityParameterNodeLabel_5071Parser() {
		if(activityParameterNodeLabel_5071Parser == null) {
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
		if(acceptEventActionLabel_5078Parser == null) {
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
		if(acceptEventActionLabel_5079Parser == null) {
			acceptEventActionLabel_5079Parser = new AcceptTimeEventActionParser();
		}
		return acceptEventActionLabel_5079Parser;
	}

	/**
	 * @generated
	 */
	private PinParser outputPinLabel_5077Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinLabel_5077Parser() {
		if(outputPinLabel_5077Parser == null) {
			outputPinLabel_5077Parser = new PinParser();
		}
		return outputPinLabel_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser interactionConstraintName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getInteractionConstraintName_5034Parser() {
		if(interactionConstraintName_5034Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<localPrecondition>>\n{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			interactionConstraintName_5034Parser = parser;
		}
		return interactionConstraintName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser interactionConstraintName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getInteractionConstraintName_5035Parser() {
		if(interactionConstraintName_5035Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<localPostcondition>>\n{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			interactionConstraintName_5035Parser = parser;
		}
		return interactionConstraintName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser intervalConstraintName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getIntervalConstraintName_5036Parser() {
		if(intervalConstraintName_5036Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<localPrecondition>>\n{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			intervalConstraintName_5036Parser = parser;
		}
		return intervalConstraintName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser intervalConstraintName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getIntervalConstraintName_5037Parser() {
		if(intervalConstraintName_5037Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<localPostcondition>>\n{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			intervalConstraintName_5037Parser = parser;
		}
		return intervalConstraintName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser durationConstraintName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getDurationConstraintName_5038Parser() {
		if(durationConstraintName_5038Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<localPrecondition>>\n{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			durationConstraintName_5038Parser = parser;
		}
		return durationConstraintName_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser durationConstraintName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getDurationConstraintName_5039Parser() {
		if(durationConstraintName_5039Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<localPostcondition>>\n{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			durationConstraintName_5039Parser = parser;
		}
		return durationConstraintName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeConstraintName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getTimeConstraintName_5040Parser() {
		if(timeConstraintName_5040Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<localPrecondition>>\n{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			timeConstraintName_5040Parser = parser;
		}
		return timeConstraintName_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeConstraintName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getTimeConstraintName_5041Parser() {
		if(timeConstraintName_5041Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("<<localPostcondition>>\n{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			timeConstraintName_5041Parser = parser;
		}
		return timeConstraintName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser objectFlowName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getObjectFlowName_6001Parser() {
		if(objectFlowName_6001Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
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
		if(objectFlowLabel_6002Parser == null) {
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
		if(objectFlowLabel_6005Parser == null) {
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
		if(objectFlowLabel_6006Parser == null) {
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
		if(objectFlowLabel_6007Parser == null) {
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
		if(objectFlowLabel_6008Parser == null) {
			objectFlowLabel_6008Parser = new EdgeGuardParser();
		}
		return objectFlowLabel_6008Parser;
	}

	/**
	 * @generated
	 */
	private IParser controlFlowName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getControlFlowName_6003Parser() {
		if(controlFlowName_6003Parser == null) {
			EAttribute[] features = new EAttribute[]{ UMLPackage.eINSTANCE.getNamedElement_Name() };
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
		if(controlFlowLabel_6004Parser == null) {
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
		if(controlFlowLabel_6009Parser == null) {
			controlFlowLabel_6009Parser = new EdgeGuardParser();
		}
		return controlFlowLabel_6009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch(visualID) {
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
		case OpaqueActionNameEditPart.VISUAL_ID:
			return getOpaqueActionName_5003Parser();
		case ValuePinInOActLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5011Parser();
		case ValuePinInOActValueEditPart.VISUAL_ID:
			return getValuePinLabel_5024Parser();
		case ActionInputPinInOActLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5012Parser();
		case ActionInputPinInOActValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5025Parser();
		case InputPinInOActLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5009Parser();
		case OutputPinInOActLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5010Parser();
		case CallBehaviorActionNameEditPart.VISUAL_ID:
			return getCallBehaviorActionLabel_5004Parser();
		case ValuePinInCBActLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5013Parser();
		case ValuePinInCBActValueEditPart.VISUAL_ID:
			return getValuePinLabel_5026Parser();
		case ActionInputPinInCBActLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5014Parser();
		case ActionInputPinInCBActValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5027Parser();
		case InputPinInCBActLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5015Parser();
		case OutputPinInCBActLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5016Parser();
		case CallOperationActionNameEditPart.VISUAL_ID:
			return getCallOperationActionLabel_5006Parser();
		case ActionInputPinInCOActLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5017Parser();
		case ActionInputPinInCOActValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5028Parser();
		case ValuePinInCOActLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5018Parser();
		case ValuePinInCOActValueEditPart.VISUAL_ID:
			return getValuePinLabel_5029Parser();
		case InputPinInCOActLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5019Parser();
		case OutputPinInCOActLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5020Parser();
		case ValuePinInCOActAsTargetLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5021Parser();
		case ValuePinInCOActAsTargetValueEditPart.VISUAL_ID:
			return getValuePinLabel_5030Parser();
		case ActionInputPinInCOActAsTargetLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5022Parser();
		case ActionInputPinInCOActAsTargetValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5031Parser();
		case InputPinInCOActAsTargetLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5023Parser();
		case DurationConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
			return getDurationConstraintName_5038Parser();
		case DurationConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
			return getDurationConstraintName_5039Parser();
		case TimeConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
			return getTimeConstraintName_5040Parser();
		case TimeConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
			return getTimeConstraintName_5041Parser();
		case InteractionConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
			return getInteractionConstraintName_5034Parser();
		case InteractionConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
			return getInteractionConstraintName_5035Parser();
		case IntervalConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
			return getIntervalConstraintName_5036Parser();
		case IntervalConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
			return getIntervalConstraintName_5037Parser();
		case ConstraintAsLocalPrecondNameEditPart.VISUAL_ID:
			return getConstraintName_5007Parser();
		case ConstraintAsLocalPostcondNameEditPart.VISUAL_ID:
			return getConstraintName_5008Parser();
		case DecisionInputEditPart.VISUAL_ID:
			return getDecisionNodeLabel_5043Parser();
		case JoinSpecEditPart.VISUAL_ID:
			return getJoinNodeLabel_5042Parser();
		case SendObjectActionNameEditPart.VISUAL_ID:
			return getSendObjectActionName_5059Parser();
		case ValuePinInSendObjActAsReqLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5049Parser();
		case ValuePinInSendObjActAsReqValueEditPart.VISUAL_ID:
			return getValuePinLabel_5050Parser();
		case ActionInputPinInSendObjActAsReqLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5051Parser();
		case ActionInputPinInSendObjActAsReqValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5052Parser();
		case InputPinInSendObjActAsReqLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5053Parser();
		case ValuePinInSendObjActAsTargetLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5054Parser();
		case ValuePinInSendObjActAsTargetValueEditPart.VISUAL_ID:
			return getValuePinLabel_5055Parser();
		case ActionInputPinInSendObjActAsTargetLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5056Parser();
		case ActionInputPinInSendObjActAsTargetValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5057Parser();
		case InputPinInSendObjActAsTargetLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5058Parser();
		case SendSignalActionNameEditPart.VISUAL_ID:
			return getSendSignalActionName_5060Parser();
		case ActionInputPinInSendSigActLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5061Parser();
		case ActionInputPinInSendSigActValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5062Parser();
		case ValuePinInSendSigActLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5063Parser();
		case ValuePinInSendSigActValueEditPart.VISUAL_ID:
			return getValuePinLabel_5064Parser();
		case InputPinInSendSigActLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5065Parser();
		case ValuePinInSendSigActAsTargetLabelEditPart.VISUAL_ID:
			return getValuePinLabel_5072Parser();
		case ValuePinInSendSigActAsTargetValueEditPart.VISUAL_ID:
			return getValuePinLabel_5073Parser();
		case ActionInputPinInSendSigActAsTargetLabelEditPart.VISUAL_ID:
			return getActionInputPinLabel_5074Parser();
		case ActionInputPinInSendSigActAsTargetValueEditPart.VISUAL_ID:
			return getActionInputPinLabel_5075Parser();
		case InputPinInSendSigActAsTargetLabelEditPart.VISUAL_ID:
			return getInputPinLabel_5076Parser();
		case CenteredWrappedLabelEditPart.VISUAL_ID:
			return getActivityParameterNodeLabel_5071Parser();
		case AcceptEventActionLabelEditPart.VISUAL_ID:
			return getAcceptEventActionLabel_5078Parser();
		case AcceptTimeEventActionLabelEditPart.VISUAL_ID:
			return getAcceptEventActionLabel_5079Parser();
		case OutputPinInAcceptEventActionLabelEditPart.VISUAL_ID:
			return getOutputPinLabel_5077Parser();
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
		case ControlFlowNameEditPart.VISUAL_ID:
			return getControlFlowName_6003Parser();
		case ControlFlowWeightEditPart.VISUAL_ID:
			return getControlFlowLabel_6004Parser();
		case ControlFlowGuardEditPart.VISUAL_ID:
			return getControlFlowLabel_6009Parser();
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
	public IParser getParser(IAdaptable hint) {
		String vid = (String)hint.getAdapter(String.class);
		if(vid != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View)hint.getAdapter(View.class);
		if(view != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if(operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation)operation).getHint();
			if(UMLElementTypes.getElement(hint) == null) {
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
		public Object getAdapter(Class adapter) {
			if(IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
