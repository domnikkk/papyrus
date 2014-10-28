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
package org.eclipse.papyrus.uml.diagram.usecase.providers;

import org.eclipse.papyrus.uml.diagram.usecase.expressions.UMLOCLFactory;
import org.eclipse.papyrus.uml.diagram.usecase.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.UseCase;
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
	public void init_Actor_2011(Actor instance) {
		try {
			Object value_0 = name_Actor_2011(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Actor_2012(Actor instance) {
		try {
			Object value_0 = name_Actor_2012(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_UseCase_2013(UseCase instance) {
		try {
			Object value_0 = name_UseCase_2013(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_UseCase_2014(UseCase instance) {
		try {
			Object value_0 = name_UseCase_2014(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Classifier_2015(Classifier instance) {
		try {
			Object value_0 = name_Classifier_2015(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Package_2016(Package instance) {
		try {
			Object value_0 = name_Package_2016(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_2017(Constraint instance) {
		try {
			Object value_0 = name_Constraint_2017(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
			Object value_1 = specification_Constraint_2017(instance);
			if (value_1 != null) {
				instance.setSpecification(
						(ValueSpecification) value_1
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Comment_2018(Comment instance) {
		try {
			Object value_0 = body_Comment_2018(instance);
			if (value_0 != null) {
				instance.setBody(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ExtensionPoint_3007(ExtensionPoint instance) {
		try {
			Object value_0 = name_ExtensionPoint_3007(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_ExtensionPoint_3008(ExtensionPoint instance) {
		try {
			Object value_0 = name_ExtensionPoint_3008(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_UseCase_3009(UseCase instance) {
		try {
			Object value_0 = name_UseCase_3009(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Component_3016(Component instance) {
		try {
			Object value_0 = name_Component_3016(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Comment_3015(Comment instance) {
		try {
			Object value_0 = body_Comment_3015(instance);
			if (value_0 != null) {
				instance.setBody(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_3017(Constraint instance) {
		try {
			Object value_0 = name_Constraint_3017(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
			Object value_1 = specification_Constraint_3017(instance);
			if (value_1 != null) {
				instance.setSpecification(
						(ValueSpecification) value_1
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Actor_3018(Actor instance) {
		try {
			Object value_0 = name_Actor_3018(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_3010(Constraint instance) {
		try {
			Object value_0 = name_Constraint_3010(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
			Object value_1 = specification_Constraint_3010(instance);
			if (value_1 != null) {
				instance.setSpecification(
						(ValueSpecification) value_1
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Actor_3011(Actor instance) {
		try {
			Object value_0 = name_Actor_3011(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_UseCase_3012(UseCase instance) {
		try {
			Object value_0 = name_UseCase_3012(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Component_3013(Component instance) {
		try {
			Object value_0 = name_Component_3013(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Package_3014(Package instance) {
		try {
			Object value_0 = name_Package_3014(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Association_4011(Association instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getAssociation(), null).evaluate(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Dependency_4013(Dependency instance) {
		try {
			Object value_0 = name_Dependency_4013(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Abstraction_4015(Abstraction instance) {
		try {
			Object value_0 = name_Abstraction_4015(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Usage_4016(Usage instance) {
		try {
			Object value_0 = name_Usage_4016(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public void init_Realization_4017(Realization instance) {
		try {
			Object value_0 = name_Realization_4017(instance);
			if (value_0 != null) {
				instance.setName(
						(String) value_0
						);
			}
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String name_Actor_2011(Actor it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Actor_2012(Actor it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_UseCase_2013(UseCase it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_UseCase_2014(UseCase it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Classifier_2015(Classifier it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Package_2016(Package it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Constraint_2017(Constraint it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private ValueSpecification specification_Constraint_2017(Constraint it) {
		// Constraint specification init
		LiteralString value = UMLFactory.eINSTANCE.createLiteralString();
		value.setValue("");
		return value;
	}

	/**
	 * @generated
	 */
	private String body_Comment_2018(Comment it) {
		// Comment body init
		return "";
	}

	/**
	 * @generated
	 */
	private String name_ExtensionPoint_3007(ExtensionPoint it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_ExtensionPoint_3008(ExtensionPoint it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_UseCase_3009(UseCase it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Component_3016(Component it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String body_Comment_3015(Comment it) {
		// Comment body init
		return "";
	}

	/**
	 * @generated
	 */
	private String name_Constraint_3017(Constraint it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private ValueSpecification specification_Constraint_3017(Constraint it) {
		// Constraint specification init
		LiteralString value = UMLFactory.eINSTANCE.createLiteralString();
		value.setValue("");
		return value;
	}

	/**
	 * @generated
	 */
	private String name_Actor_3018(Actor it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Constraint_3010(Constraint it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private ValueSpecification specification_Constraint_3010(Constraint it) {
		// Constraint specification init
		LiteralString value = UMLFactory.eINSTANCE.createLiteralString();
		value.setValue("");
		return value;
	}

	/**
	 * @generated
	 */
	private String name_Actor_3011(Actor it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_UseCase_3012(UseCase it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Component_3013(Component it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Package_3014(Package it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Dependency_4013(Dependency it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Abstraction_4015(Abstraction it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Usage_4016(Usage it) {
		return NamedElementUtil.getDefaultNameWithIncrement(it, it.getOwner().eContents());
	}

	/**
	 * @generated
	 */
	private String name_Realization_4017(Realization it) {
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
