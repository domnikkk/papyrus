package org.eclipse.papyrus.uml.diagram.activity.providers;

import org.eclipse.papyrus.uml.diagram.activity.expressions.UMLOCLFactory;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.diagram.common.actions.LabelHelper;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.AddVariableValueAction;
import org.eclipse.uml2.uml.BroadcastSignalAction;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.CentralBufferNode;
import org.eclipse.uml2.uml.ClearAssociationAction;
import org.eclipse.uml2.uml.ClearStructuralFeatureAction;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConditionalNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.CreateLinkAction;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.DestroyLinkAction;
import org.eclipse.uml2.uml.DestroyObjectAction;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.DurationInterval;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.FlowFinalNode;
import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.Interval;
import org.eclipse.uml2.uml.IntervalConstraint;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ReadExtentAction;
import org.eclipse.uml2.uml.ReadIsClassifiedObjectAction;
import org.eclipse.uml2.uml.ReadLinkAction;
import org.eclipse.uml2.uml.ReadSelfAction;
import org.eclipse.uml2.uml.ReadStructuralFeatureAction;
import org.eclipse.uml2.uml.ReadVariableAction;
import org.eclipse.uml2.uml.ReclassifyObjectAction;
import org.eclipse.uml2.uml.ReduceAction;
import org.eclipse.uml2.uml.SendObjectAction;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.SequenceNode;
import org.eclipse.uml2.uml.StartClassifierBehaviorAction;
import org.eclipse.uml2.uml.StartObjectBehaviorAction;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.TestIdentityAction;
import org.eclipse.uml2.uml.TimeConstraint;
import org.eclipse.uml2.uml.TimeInterval;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.ValueSpecificationAction;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Activity_2001(Activity instance) {
		try {
			Object value_0 = name_Activity_2001(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Parameter_3001(Parameter instance) {
		try {
			Object value_0 = name_Parameter_3001(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_3002(Constraint instance) {
		try {
			Object value_0 = name_Constraint_3002(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_3003(Constraint instance) {
		try {
			Object value_0 = name_Constraint_3003(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InitialNode_3004(InitialNode instance) {
		try {
			Object value_0 = name_InitialNode_3004(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActivityFinalNode_3005(ActivityFinalNode instance) {
		try {
			Object value_0 = name_ActivityFinalNode_3005(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_FlowFinalNode_3006(FlowFinalNode instance) {
		try {
			Object value_0 = name_FlowFinalNode_3006(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OpaqueAction_3007(OpaqueAction instance) {
		try {
			Object value_0 = name_OpaqueAction_3007(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3015(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3015(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3016(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3016(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3013(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3013(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3014(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3014(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_CallBehaviorAction_3008(CallBehaviorAction instance) {
		try {
			Object value_0 = name_CallBehaviorAction_3008(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3017(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3017(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3018(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3018(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3019(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3019(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3020(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3020(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_CallOperationAction_3010(CallOperationAction instance) {
		try {
			Object value_0 = name_CallOperationAction_3010(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3021(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3021(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3022(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3022(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3023(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3023(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3024(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3024(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3025(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3025(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3026(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3026(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3027(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3027(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_DurationConstraint_3034(DurationConstraint instance) {
		try {
			Object value_0 = name_DurationConstraint_3034(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			DurationInterval newInstance_1_0 = UMLFactory.eINSTANCE.createDurationInterval();
			instance.setSpecification(newInstance_1_0);
			Object value_1_0_0 = name_specification_DurationConstraint_3034(newInstance_1_0);
			if (value_1_0_0 != null) {
				newInstance_1_0.setName((String) value_1_0_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_DurationConstraint_3035(DurationConstraint instance) {
		try {
			Object value_0 = name_DurationConstraint_3035(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			DurationInterval newInstance_1_0 = UMLFactory.eINSTANCE.createDurationInterval();
			instance.setSpecification(newInstance_1_0);
			Object value_1_0_0 = name_specification_DurationConstraint_3035(newInstance_1_0);
			if (value_1_0_0 != null) {
				newInstance_1_0.setName((String) value_1_0_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_TimeConstraint_3036(TimeConstraint instance) {
		try {
			Object value_0 = name_TimeConstraint_3036(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			TimeInterval newInstance_1_0 = UMLFactory.eINSTANCE.createTimeInterval();
			instance.setSpecification(newInstance_1_0);
			Object value_1_0_0 = name_specification_TimeConstraint_3036(newInstance_1_0);
			if (value_1_0_0 != null) {
				newInstance_1_0.setName((String) value_1_0_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_TimeConstraint_3037(TimeConstraint instance) {
		try {
			Object value_0 = name_TimeConstraint_3037(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			TimeInterval newInstance_1_0 = UMLFactory.eINSTANCE.createTimeInterval();
			instance.setSpecification(newInstance_1_0);
			Object value_1_0_0 = name_specification_TimeConstraint_3037(newInstance_1_0);
			if (value_1_0_0 != null) {
				newInstance_1_0.setName((String) value_1_0_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_IntervalConstraint_3032(IntervalConstraint instance) {
		try {
			Object value_0 = name_IntervalConstraint_3032(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			Interval newInstance_1_0 = UMLFactory.eINSTANCE.createInterval();
			instance.setSpecification(newInstance_1_0);
			Object value_1_0_0 = name_specification_IntervalConstraint_3032(newInstance_1_0);
			if (value_1_0_0 != null) {
				newInstance_1_0.setName((String) value_1_0_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_IntervalConstraint_3033(IntervalConstraint instance) {
		try {
			Object value_0 = name_IntervalConstraint_3033(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			Interval newInstance_1_0 = UMLFactory.eINSTANCE.createInterval();
			instance.setSpecification(newInstance_1_0);
			Object value_1_0_0 = name_specification_IntervalConstraint_3033(newInstance_1_0);
			if (value_1_0_0 != null) {
				newInstance_1_0.setName((String) value_1_0_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_3011(Constraint instance) {
		try {
			Object value_0 = name_Constraint_3011(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			OpaqueExpression newInstance_1_0 = UMLFactory.eINSTANCE.createOpaqueExpression();
			instance.setSpecification(newInstance_1_0);
			Object value_1_0_0 = name_specification_Constraint_3011(newInstance_1_0);
			if (value_1_0_0 != null) {
				newInstance_1_0.setName((String) value_1_0_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_3012(Constraint instance) {
		try {
			Object value_0 = name_Constraint_3012(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			OpaqueExpression newInstance_1_0 = UMLFactory.eINSTANCE.createOpaqueExpression();
			instance.setSpecification(newInstance_1_0);
			Object value_1_0_0 = name_specification_Constraint_3012(newInstance_1_0);
			if (value_1_0_0 != null) {
				newInstance_1_0.setName((String) value_1_0_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_DecisionNode_3038(DecisionNode instance) {
		try {
			Object value_0 = name_DecisionNode_3038(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_MergeNode_3039(MergeNode instance) {
		try {
			Object value_0 = name_MergeNode_3039(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ForkNode_3040(ForkNode instance) {
		try {
			Object value_0 = name_ForkNode_3040(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_JoinNode_3041(JoinNode instance) {
		try {
			Object value_0 = name_JoinNode_3041(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_DataStoreNode_3078(DataStoreNode instance) {
		try {
			Object value_0 = name_DataStoreNode_3078(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_SendObjectAction_3042(SendObjectAction instance) {
		try {
			Object value_0 = name_SendObjectAction_3042(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3046(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3046(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3047(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3047(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3048(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3048(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3049(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3049(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3050(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3050(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3051(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3051(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_SendSignalAction_3052(SendSignalAction instance) {
		try {
			Object value_0 = name_SendSignalAction_3052(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3053(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3053(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3054(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3054(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3055(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3055(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3060(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3060(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3061(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3061(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3062(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3062(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActivityParameterNode_3059(ActivityParameterNode instance) {
		try {
			Object value_0 = name_ActivityParameterNode_3059(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			Object value_1 = isControlType_ActivityParameterNode_3059(instance);
			if (value_1 != null) {
				instance.setIsControlType(((Boolean) value_1).booleanValue());
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_AcceptEventAction_3063(AcceptEventAction instance) {
		try {
			Object value_0 = name_AcceptEventAction_3063(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3064(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3064(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValueSpecificationAction_3076(ValueSpecificationAction instance) {
		try {
			Object value_0 = name_ValueSpecificationAction_3076(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3077(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3077(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ConditionalNode_3069(ConditionalNode instance) {
		try {
			Object value_0 = name_ConditionalNode_3069(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ExpansionRegion_3070(ExpansionRegion instance) {
		try {
			Object value_0 = name_ExpansionRegion_3070(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ExpansionNode_3074(ExpansionNode instance) {
		try {
			Object value_0 = name_ExpansionNode_3074(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ExpansionNode_3075(ExpansionNode instance) {
		try {
			Object value_0 = name_ExpansionNode_3075(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_LoopNode_3071(LoopNode instance) {
		try {
			Object value_0 = name_LoopNode_3071(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3109(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3109(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3110(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3110(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3111(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3111(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_SequenceNode_3073(SequenceNode instance) {
		try {
			Object value_0 = name_SequenceNode_3073(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredActivityNode_3065(StructuredActivityNode instance) {
		try {
			Object value_0 = name_StructuredActivityNode_3065(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3105(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3105(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActivityPartition_3067(ActivityPartition instance) {
		try {
			Object value_0 = name_ActivityPartition_3067(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Comment_3080(Comment instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(28, UMLPackage.eINSTANCE.getComment(), null).evaluate(instance);
			if (value_0 != null) {
				instance.setBody((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ReadSelfAction_3081(ReadSelfAction instance) {
		try {
			Object value_0 = name_ReadSelfAction_3081(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3084(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3084(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Activity_3083(Activity instance) {
		try {
			Object value_0 = name_Activity_3083(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_CreateObjectAction_3086(CreateObjectAction instance) {
		try {
			Object value_0 = name_CreateObjectAction_3086(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3087(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3087(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ReadStructuralFeatureAction_3088(ReadStructuralFeatureAction instance) {
		try {
			Object value_0 = name_ReadStructuralFeatureAction_3088(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3089(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3089(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3090(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3090(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_AddStructuralFeatureValueAction_3091(AddStructuralFeatureValueAction instance) {
		try {
			Object value_0 = name_AddStructuralFeatureValueAction_3091(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3092(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3092(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3093(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3093(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3094(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3094(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_DestroyObjectAction_3095(DestroyObjectAction instance) {
		try {
			Object value_0 = name_DestroyObjectAction_3095(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3096(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3096(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ReadVariableAction_3097(ReadVariableAction instance) {
		try {
			Object value_0 = name_ReadVariableAction_3097(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3098(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3098(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_AddVariableValueAction_3099(AddVariableValueAction instance) {
		try {
			Object value_0 = name_AddVariableValueAction_3099(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3100(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3100(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3101(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3101(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_BroadcastSignalAction_3102(BroadcastSignalAction instance) {
		try {
			Object value_0 = name_BroadcastSignalAction_3102(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3103(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3103(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_CentralBufferNode_3104(CentralBufferNode instance) {
		try {
			Object value_0 = name_CentralBufferNode_3104(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_3112(Constraint instance) {
		try {
			Object value_0 = name_Constraint_3112(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			Object value_1 = specification_Constraint_3112(instance);
			if (value_1 != null) {
				instance.setSpecification((ValueSpecification) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_StartObjectBehaviorAction_3113(StartObjectBehaviorAction instance) {
		try {
			Object value_0 = name_StartObjectBehaviorAction_3113(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3125(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3125(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3132(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3132(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3145(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3145(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3158(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3158(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3133(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3133(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3146(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3146(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3159(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3159(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_TestIdentityAction_3114(TestIdentityAction instance) {
		try {
			Object value_0 = name_TestIdentityAction_3114(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3126(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3126(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3134(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3134(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3135(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3135(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3147(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3147(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3148(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3148(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3160(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3160(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3161(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3161(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ClearStructuralFeatureAction_3115(ClearStructuralFeatureAction instance) {
		try {
			Object value_0 = name_ClearStructuralFeatureAction_3115(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3127(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3127(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3136(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3136(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3149(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3149(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3162(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3162(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_CreateLinkAction_3117(CreateLinkAction instance) {
		try {
			Object value_0 = name_CreateLinkAction_3117(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3137(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3137(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3151(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3151(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3163(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3163(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ReadLinkAction_3116(ReadLinkAction instance) {
		try {
			Object value_0 = name_ReadLinkAction_3116(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3128(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3128(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3138(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3138(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3150(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3150(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3164(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3164(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_DestroyLinkAction_3118(DestroyLinkAction instance) {
		try {
			Object value_0 = name_DestroyLinkAction_3118(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3139(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3139(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3152(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3152(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3165(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3165(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ClearAssociationAction_3119(ClearAssociationAction instance) {
		try {
			Object value_0 = name_ClearAssociationAction_3119(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3140(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3140(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3153(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3153(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3166(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3166(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ReadExtentAction_3120(ReadExtentAction instance) {
		try {
			Object value_0 = name_ReadExtentAction_3120(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3129(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3129(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ReclassifyObjectAction_3121(ReclassifyObjectAction instance) {
		try {
			Object value_0 = name_ReclassifyObjectAction_3121(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3141(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3141(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3154(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3154(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3167(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3167(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ReadIsClassifiedObjectAction_3122(ReadIsClassifiedObjectAction instance) {
		try {
			Object value_0 = name_ReadIsClassifiedObjectAction_3122(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3130(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3130(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3142(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3142(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3155(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3155(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3168(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3168(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ReduceAction_3123(ReduceAction instance) {
		try {
			Object value_0 = name_ReduceAction_3123(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3131(OutputPin instance) {
		try {
			Object value_0 = name_OutputPin_3131(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3143(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3143(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3156(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3156(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3169(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3169(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_StartClassifierBehaviorAction_3124(StartClassifierBehaviorAction instance) {
		try {
			Object value_0 = name_StartClassifierBehaviorAction_3124(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3144(InputPin instance) {
		try {
			Object value_0 = name_InputPin_3144(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ValuePin_3157(ValuePin instance) {
		try {
			Object value_0 = name_ValuePin_3157(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ActionInputPin_3170(ActionInputPin instance) {
		try {
			Object value_0 = name_ActionInputPin_3170(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ObjectFlow_4003(ObjectFlow instance) {
		try {
			Object value_0 = name_ObjectFlow_4003(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated NOT
	 */
	public void init_ControlFlow_4004(ControlFlow instance) {
		try {
			Object value_0 = name_ControlFlow_4004(instance);
			instance.setName((String) value_0);
			// Initialize the guard to true
			LiteralBoolean lBoolean = UMLFactory.eINSTANCE.createLiteralBoolean();
			lBoolean.setValue(true);
			instance.setGuard(lBoolean);
			// Initialize the weight to 0
			LiteralInteger lInteger = UMLFactory.eINSTANCE.createLiteralInteger();
			lInteger.setValue(0);
			instance.setWeight(lInteger);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String name_Activity_2001(Activity it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_Parameter_3001(Parameter it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_Constraint_3002(Constraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_Constraint_3003(Constraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InitialNode_3004(InitialNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActivityFinalNode_3005(ActivityFinalNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_FlowFinalNode_3006(FlowFinalNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OpaqueAction_3007(OpaqueAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3015(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3016(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3013(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3014(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_CallBehaviorAction_3008(CallBehaviorAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3017(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3018(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3019(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3020(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_CallOperationAction_3010(CallOperationAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3021(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3022(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3023(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3024(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3025(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3026(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3027(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_specification_DurationConstraint_3034(DurationInterval it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_DurationConstraint_3034(DurationConstraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_DurationConstraint_3035(DurationConstraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_specification_DurationConstraint_3035(DurationInterval it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_TimeConstraint_3036(TimeConstraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_specification_TimeConstraint_3036(TimeInterval it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_TimeConstraint_3037(TimeConstraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_specification_TimeConstraint_3037(TimeInterval it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_IntervalConstraint_3032(IntervalConstraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_specification_IntervalConstraint_3032(Interval it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_IntervalConstraint_3033(IntervalConstraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_specification_IntervalConstraint_3033(Interval it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_Constraint_3011(Constraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_specification_Constraint_3011(OpaqueExpression it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_Constraint_3012(Constraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_specification_Constraint_3012(OpaqueExpression it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_DecisionNode_3038(DecisionNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_MergeNode_3039(MergeNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ForkNode_3040(ForkNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_JoinNode_3041(JoinNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_DataStoreNode_3078(DataStoreNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_SendObjectAction_3042(SendObjectAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3046(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3047(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3048(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3049(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3050(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3051(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_SendSignalAction_3052(SendSignalAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3053(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3054(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3055(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3060(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3061(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3062(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActivityParameterNode_3059(ActivityParameterNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private Boolean isControlType_ActivityParameterNode_3059(ActivityParameterNode it) {
		return true;
	}

	/**
	 * @generated
	 */
	private String name_AcceptEventAction_3063(AcceptEventAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3064(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValueSpecificationAction_3076(ValueSpecificationAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3077(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ConditionalNode_3069(ConditionalNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ExpansionRegion_3070(ExpansionRegion it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ExpansionNode_3074(ExpansionNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ExpansionNode_3075(ExpansionNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_LoopNode_3071(LoopNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3109(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3110(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3111(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_SequenceNode_3073(SequenceNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_StructuredActivityNode_3065(StructuredActivityNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3105(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActivityPartition_3067(ActivityPartition it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ReadSelfAction_3081(ReadSelfAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3084(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_Activity_3083(Activity it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_CreateObjectAction_3086(CreateObjectAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3087(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ReadStructuralFeatureAction_3088(ReadStructuralFeatureAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3089(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3090(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_AddStructuralFeatureValueAction_3091(AddStructuralFeatureValueAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3092(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3093(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3094(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_DestroyObjectAction_3095(DestroyObjectAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3096(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ReadVariableAction_3097(ReadVariableAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3098(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_AddVariableValueAction_3099(AddVariableValueAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3100(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3101(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_BroadcastSignalAction_3102(BroadcastSignalAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3103(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_CentralBufferNode_3104(CentralBufferNode it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_Constraint_3112(Constraint it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private ValueSpecification specification_Constraint_3112(Constraint it) {
		LiteralString literalString = UMLFactory.eINSTANCE.createLiteralString();
		literalString.setValue("");
		return literalString;
	}

	/**
	 * @generated
	 */
	private String name_StartObjectBehaviorAction_3113(StartObjectBehaviorAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3125(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3132(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3145(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3158(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3133(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3146(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3159(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_TestIdentityAction_3114(TestIdentityAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3126(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3134(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3135(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3147(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3148(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3160(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3161(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ClearStructuralFeatureAction_3115(ClearStructuralFeatureAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3127(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3136(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3149(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3162(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_CreateLinkAction_3117(CreateLinkAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3137(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3151(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3163(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ReadLinkAction_3116(ReadLinkAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3128(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3138(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3150(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3164(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_DestroyLinkAction_3118(DestroyLinkAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3139(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3152(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3165(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ClearAssociationAction_3119(ClearAssociationAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3140(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3153(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3166(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ReadExtentAction_3120(ReadExtentAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3129(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ReclassifyObjectAction_3121(ReclassifyObjectAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3141(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3154(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3167(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ReadIsClassifiedObjectAction_3122(ReadIsClassifiedObjectAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3130(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3142(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3155(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3168(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ReduceAction_3123(ReduceAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_OutputPin_3131(OutputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3143(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3156(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3169(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_StartClassifierBehaviorAction_3124(StartClassifierBehaviorAction it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_InputPin_3144(InputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ValuePin_3157(ValuePin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ActionInputPin_3170(ActionInputPin it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ObjectFlow_4003(ObjectFlow it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	private String name_ControlFlow_4004(ControlFlow it) {
		return LabelHelper.INSTANCE.findName(it.eContainer(), it);
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = UMLDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			UMLDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
