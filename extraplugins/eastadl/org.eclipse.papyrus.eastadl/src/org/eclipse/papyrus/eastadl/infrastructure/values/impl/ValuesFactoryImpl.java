/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.values.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAArrayValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EABooleanValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EACompositeValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAEnumerationValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.infrastructure.values.EANumericalValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAStringValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesFactory;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValuesFactoryImpl extends EFactoryImpl implements ValuesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static ValuesFactory init() {
		try {
			ValuesFactory theValuesFactory = (ValuesFactory) EPackage.Registry.INSTANCE.getEFactory(ValuesPackage.eNS_URI);
			if (theValuesFactory != null) {
				return theValuesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValuesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValuesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ValuesPackage.EA_ARRAY_VALUE:
			return createEAArrayValue();
		case ValuesPackage.EA_BOOLEAN_VALUE:
			return createEABooleanValue();
		case ValuesPackage.EA_COMPOSITE_VALUE:
			return createEACompositeValue();
		case ValuesPackage.EA_ENUMERATION_VALUE:
			return createEAEnumerationValue();
		case ValuesPackage.EA_EXPRESSION:
			return createEAExpression();
		case ValuesPackage.EA_NUMERICAL_VALUE:
			return createEANumericalValue();
		case ValuesPackage.EA_STRING_VALUE:
			return createEAStringValue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAArrayValue createEAArrayValue() {
		EAArrayValueImpl eaArrayValue = new EAArrayValueImpl();
		return eaArrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EABooleanValue createEABooleanValue() {
		EABooleanValueImpl eaBooleanValue = new EABooleanValueImpl();
		return eaBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EACompositeValue createEACompositeValue() {
		EACompositeValueImpl eaCompositeValue = new EACompositeValueImpl();
		return eaCompositeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAEnumerationValue createEAEnumerationValue() {
		EAEnumerationValueImpl eaEnumerationValue = new EAEnumerationValueImpl();
		return eaEnumerationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAExpression createEAExpression() {
		EAExpressionImpl eaExpression = new EAExpressionImpl();
		return eaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EANumericalValue createEANumericalValue() {
		EANumericalValueImpl eaNumericalValue = new EANumericalValueImpl();
		return eaNumericalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAStringValue createEAStringValue() {
		EAStringValueImpl eaStringValue = new EAStringValueImpl();
		return eaStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ValuesPackage getValuesPackage() {
		return (ValuesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValuesPackage getPackage() {
		return ValuesPackage.eINSTANCE;
	}

} // ValuesFactoryImpl
