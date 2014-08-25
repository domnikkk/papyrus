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
package org.eclipse.papyrus.umldi.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlCompartment;
import org.eclipse.papyrus.umldi.UmlCompartmentKind;
import org.eclipse.papyrus.umldi.UmlDiagram;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.papyrus.umldi.UmlEdge;
import org.eclipse.papyrus.umldi.UmlLabel;
import org.eclipse.papyrus.umldi.UmlLabelKind;
import org.eclipse.papyrus.umldi.UmlShape;
import org.eclipse.papyrus.umldi.UmlStyle;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.umldi.UMLDIPackage
 * @generated
 */
public class UMLDIValidator extends EObjectValidator {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final UMLDIValidator INSTANCE = new UMLDIValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.umldi";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Fontsize Positive' of 'Uml Style'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final int UML_STYLE__FONTSIZE_POSITIVE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Delegates evaluation of the given invariant expression against the object in the given context.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context, String validationDelegate, EOperation invariant, String expression, int severity, String source, int code) {
		return EObjectValidator.validate(eClass, eObject, diagnostics, context, validationDelegate, invariant, expression, severity, source, code);
	}

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UMLDIValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return UMLDIPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case UMLDIPackage.UML_DIAGRAM:
			return validateUmlDiagram((UmlDiagram) value, diagnostics, context);
		case UMLDIPackage.UML_SHAPE:
			return validateUmlShape((UmlShape) value, diagnostics, context);
		case UMLDIPackage.UML_DIAGRAM_ELEMENT:
			return validateUmlDiagramElement((UmlDiagramElement) value, diagnostics, context);
		case UMLDIPackage.UML_STYLE:
			return validateUmlStyle((UmlStyle) value, diagnostics, context);
		case UMLDIPackage.UML_EDGE:
			return validateUmlEdge((UmlEdge) value, diagnostics, context);
		case UMLDIPackage.UML_COMPARTMENT:
			return validateUmlCompartment((UmlCompartment) value, diagnostics, context);
		case UMLDIPackage.UML_LABEL:
			return validateUmlLabel((UmlLabel) value, diagnostics, context);
		case UMLDIPackage.UML_COMPARTMENT_KIND:
			return validateUmlCompartmentKind((UmlCompartmentKind) value, diagnostics, context);
		case UMLDIPackage.UML_LABEL_KIND:
			return validateUmlLabelKind((UmlLabelKind) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateUmlDiagram(UmlDiagram umlDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlDiagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateUmlDiagramElement(UmlDiagramElement umlDiagramElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlDiagramElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateUmlStyle(UmlStyle umlStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlStyle, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(umlStyle, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(umlStyle, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(umlStyle, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(umlStyle, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(umlStyle, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(umlStyle, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(umlStyle, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(umlStyle, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateUmlStyle_fontsizePositive(umlStyle, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the fontsizePositive constraint of '<em>Uml Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateUmlStyle_fontsizePositive(UmlStyle umlStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return umlStyle.fontsizePositive(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateUmlEdge(UmlEdge umlEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateUmlCompartment(UmlCompartment umlCompartment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlCompartment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateUmlLabel(UmlLabel umlLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateUmlCompartmentKind(UmlCompartmentKind umlCompartmentKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateUmlLabelKind(UmlLabelKind umlLabelKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateUmlShape(UmlShape umlShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(umlShape, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}
} // UMLDIValidator
