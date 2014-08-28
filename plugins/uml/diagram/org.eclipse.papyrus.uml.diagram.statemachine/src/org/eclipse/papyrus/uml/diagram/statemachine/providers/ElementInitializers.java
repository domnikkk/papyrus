/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.statemachine.providers;

import org.eclipse.papyrus.uml.diagram.statemachine.custom.expressions.UMLAbstractExpression;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

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
	public void init_StateMachine_2000(StateMachine instance) {
		try {
			Object value_0 = name_StateMachine_2000(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			Region newInstance_1_0 = UMLFactory.eINSTANCE.createRegion();
			instance.getRegions().add(newInstance_1_0);
			Object value_1_0_0 = name_region_StateMachine_2000(newInstance_1_0);
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
	public void init_Region_3000(Region instance) {
		try {
			Object value_0 = name_Region_3000(instance);
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
	public void init_FinalState_5000(FinalState instance) {
		try {
			Object value_0 = name_FinalState_5000(instance);
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
	public void init_State_6000(State instance) {
		try {
			Object value_0 = name_State_6000(instance);
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
	public void init_Pseudostate_8000(Pseudostate instance) {
		try {
			Object value_0 = kind_Pseudostate_8000(instance);
			if (value_0 != null) {
				value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
				instance.setKind((PseudostateKind) value_0);
			}
			Object value_1 = name_Pseudostate_8000(instance);
			if (value_1 != null) {
				instance.setName((String) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_9000(Pseudostate instance) {
		try {
			Object value_0 = kind_Pseudostate_9000(instance);
			if (value_0 != null) {
				value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
				instance.setKind((PseudostateKind) value_0);
			}
			Object value_1 = name_Pseudostate_9000(instance);
			if (value_1 != null) {
				instance.setName((String) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_10000(Pseudostate instance) {
		try {
			Object value_0 = kind_Pseudostate_10000(instance);
			if (value_0 != null) {
				value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
				instance.setKind((PseudostateKind) value_0);
			}
			Object value_1 = name_Pseudostate_10000(instance);
			if (value_1 != null) {
				instance.setName((String) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_11000(Pseudostate instance) {
		try {
			Object value_0 = kind_Pseudostate_11000(instance);
			if (value_0 != null) {
				value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
				instance.setKind((PseudostateKind) value_0);
			}
			Object value_1 = name_Pseudostate_11000(instance);
			if (value_1 != null) {
				instance.setName((String) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_12000(Pseudostate instance) {
		try {
			Object value_0 = kind_Pseudostate_12000(instance);
			if (value_0 != null) {
				value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
				instance.setKind((PseudostateKind) value_0);
			}
			Object value_1 = name_Pseudostate_12000(instance);
			if (value_1 != null) {
				instance.setName((String) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_13000(Pseudostate instance) {
		try {
			Object value_0 = kind_Pseudostate_13000(instance);
			if (value_0 != null) {
				value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
				instance.setKind((PseudostateKind) value_0);
			}
			Object value_1 = name_Pseudostate_13000(instance);
			if (value_1 != null) {
				instance.setName((String) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_14000(Pseudostate instance) {
		try {
			Object value_0 = kind_Pseudostate_14000(instance);
			if (value_0 != null) {
				value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
				instance.setKind((PseudostateKind) value_0);
			}
			Object value_1 = name_Pseudostate_14000(instance);
			if (value_1 != null) {
				instance.setName((String) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_15000(Pseudostate instance) {
		try {
			Object value_0 = kind_Pseudostate_15000(instance);
			if (value_0 != null) {
				value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
				instance.setKind((PseudostateKind) value_0);
			}
			Object value_1 = name_Pseudostate_15000(instance);
			if (value_1 != null) {
				instance.setName((String) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_16000(Pseudostate instance) {
		try {
			Object value_0 = kind_Pseudostate_16000(instance);
			if (value_0 != null) {
				value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
				instance.setKind((PseudostateKind) value_0);
			}
			Object value_1 = name_Pseudostate_16000(instance);
			if (value_1 != null) {
				instance.setName((String) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_17000(Pseudostate instance) {
		try {
			Object value_0 = kind_Pseudostate_17000(instance);
			if (value_0 != null) {
				value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
				instance.setKind((PseudostateKind) value_0);
			}
			Object value_1 = name_Pseudostate_17000(instance);
			if (value_1 != null) {
				instance.setName((String) value_1);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ConnectionPointReference_18000(ConnectionPointReference instance) {
		try {
			Object value_0 = name_ConnectionPointReference_18000(instance);
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
	public void init_Comment_666(Comment instance) {
		try {
			Object value_0 = body_Comment_666(instance);
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
	public void init_Constraint_668(Constraint instance) {
		try {
			Object value_0 = name_Constraint_668(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			Object value_1 = specification_Constraint_668(instance);
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
	public void init_Transition_680(Transition instance) {
		try {
			Object value_0 = name_Transition_680(instance);
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
	public void init_Transition_7000(Transition instance) {
		try {
			Object value_0 = name_Transition_7000(instance);
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
	private String name_StateMachine_2000(StateMachine it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_region_StateMachine_2000(Region it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Region_3000(Region it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_FinalState_5000(FinalState it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_State_6000(State it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private PseudostateKind kind_Pseudostate_8000(Pseudostate it) {
		return PseudostateKind.INITIAL_LITERAL;
	}

	/**
	 * @generated
	 */
	private String name_Pseudostate_8000(Pseudostate it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private PseudostateKind kind_Pseudostate_9000(Pseudostate it) {
		return PseudostateKind.JOIN_LITERAL;
	}

	/**
	 * @generated
	 */
	private String name_Pseudostate_9000(Pseudostate it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private PseudostateKind kind_Pseudostate_10000(Pseudostate it) {
		return PseudostateKind.FORK_LITERAL;
	}

	/**
	 * @generated
	 */
	private String name_Pseudostate_10000(Pseudostate it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private PseudostateKind kind_Pseudostate_11000(Pseudostate it) {
		return PseudostateKind.CHOICE_LITERAL;
	}

	/**
	 * @generated
	 */
	private String name_Pseudostate_11000(Pseudostate it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private PseudostateKind kind_Pseudostate_12000(Pseudostate it) {
		return PseudostateKind.JUNCTION_LITERAL;
	}

	/**
	 * @generated
	 */
	private String name_Pseudostate_12000(Pseudostate it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private PseudostateKind kind_Pseudostate_13000(Pseudostate it) {
		return PseudostateKind.SHALLOW_HISTORY_LITERAL;
	}

	/**
	 * @generated
	 */
	private String name_Pseudostate_13000(Pseudostate it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private PseudostateKind kind_Pseudostate_14000(Pseudostate it) {
		return PseudostateKind.DEEP_HISTORY_LITERAL;
	}

	/**
	 * @generated
	 */
	private String name_Pseudostate_14000(Pseudostate it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private PseudostateKind kind_Pseudostate_15000(Pseudostate it) {
		return PseudostateKind.TERMINATE_LITERAL;
	}

	/**
	 * @generated
	 */
	private String name_Pseudostate_15000(Pseudostate it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private PseudostateKind kind_Pseudostate_16000(Pseudostate it) {
		return PseudostateKind.ENTRY_POINT_LITERAL;
	}

	/**
	 * @generated
	 */
	private String name_Pseudostate_16000(Pseudostate it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private PseudostateKind kind_Pseudostate_17000(Pseudostate it) {
		return PseudostateKind.EXIT_POINT_LITERAL;
	}

	/**
	 * @generated
	 */
	private String name_Pseudostate_17000(Pseudostate it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_ConnectionPointReference_18000(ConnectionPointReference it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String body_Comment_666(Comment it) {
		return "";
	}

	/**
	 * @generated
	 */
	private String name_Constraint_668(Constraint it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private ValueSpecification specification_Constraint_668(Constraint it) {
		LiteralString literalString = UMLFactory.eINSTANCE.createLiteralString();
		literalString.setValue("");
		return literalString;
	}

	/**
	 * @generated
	 */
	private String name_Transition_680(Transition it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Transition_7000(Transition it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
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
