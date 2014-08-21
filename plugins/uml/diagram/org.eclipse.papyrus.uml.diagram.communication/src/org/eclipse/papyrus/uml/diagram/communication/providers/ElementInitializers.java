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
package org.eclipse.papyrus.uml.diagram.communication.providers;

import org.eclipse.papyrus.uml.diagram.communication.expressions.UMLOCLFactory;
import org.eclipse.papyrus.uml.diagram.communication.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.TimeObservation;
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
	public void init_Interaction_8002(Interaction instance) {
		try {
			Object value_0 = name_Interaction_8002(instance);
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
	public void init_Lifeline_8001(Lifeline instance) {
		try {
			Object value_0 = name_Lifeline_8001(instance);
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
	public void init_Constraint_8004(Constraint instance) {
		try {
			Object value_0 = name_Constraint_8004(instance);
			if (value_0 != null) {
				instance.setName((String) value_0);
			}
			Object value_1 = specification_Constraint_8004(instance);
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
	public void init_Comment_8005(Comment instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(7, UMLPackage.eINSTANCE.getComment(), null).evaluate(instance);
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
	public void init_TimeObservation_8006(TimeObservation instance) {
		try {
			Object value_0 = name_TimeObservation_8006(instance);
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
	public void init_DurationObservation_8007(DurationObservation instance) {
		try {
			Object value_0 = name_DurationObservation_8007(instance);
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
	public void init_Message_8009(Message instance) {
		try {
			Object value_0 = name_Message_8009(instance);
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
	private String name_Interaction_8002(Interaction it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Lifeline_8001(Lifeline it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Constraint_8004(Constraint it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private ValueSpecification specification_Constraint_8004(Constraint it) {
		LiteralString literalString = UMLFactory.eINSTANCE.createLiteralString();
		literalString.setValue("");
		return literalString;
	}

	/**
	 * @generated
	 */
	private String name_TimeObservation_8006(TimeObservation it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_DurationObservation_8007(DurationObservation it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Message_8009(Message it) {
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
