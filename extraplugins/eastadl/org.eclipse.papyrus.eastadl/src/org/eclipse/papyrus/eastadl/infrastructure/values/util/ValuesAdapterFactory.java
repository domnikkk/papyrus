/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.values.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAArrayValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EABooleanValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EACompositeValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAEnumerationValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.infrastructure.values.EANumericalValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAStringValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage
 * @generated
 */
public class ValuesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValuesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ValuesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuesSwitch<Adapter> modelSwitch =
		new ValuesSwitch<Adapter>() {
			@Override
			public Adapter caseEAArrayValue(EAArrayValue object) {
				return createEAArrayValueAdapter();
			}
			@Override
			public Adapter caseEAValue(EAValue object) {
				return createEAValueAdapter();
			}
			@Override
			public Adapter caseEABooleanValue(EABooleanValue object) {
				return createEABooleanValueAdapter();
			}
			@Override
			public Adapter caseEACompositeValue(EACompositeValue object) {
				return createEACompositeValueAdapter();
			}
			@Override
			public Adapter caseEAEnumerationValue(EAEnumerationValue object) {
				return createEAEnumerationValueAdapter();
			}
			@Override
			public Adapter caseEAExpression(EAExpression object) {
				return createEAExpressionAdapter();
			}
			@Override
			public Adapter caseEANumericalValue(EANumericalValue object) {
				return createEANumericalValueAdapter();
			}
			@Override
			public Adapter caseEAStringValue(EAStringValue object) {
				return createEAStringValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAArrayValue <em>EA Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAArrayValue
	 * @generated
	 */
	public Adapter createEAArrayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAValue <em>EA Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAValue
	 * @generated
	 */
	public Adapter createEAValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EABooleanValue <em>EA Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EABooleanValue
	 * @generated
	 */
	public Adapter createEABooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EACompositeValue <em>EA Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EACompositeValue
	 * @generated
	 */
	public Adapter createEACompositeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAEnumerationValue <em>EA Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAEnumerationValue
	 * @generated
	 */
	public Adapter createEAEnumerationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression <em>EA Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression
	 * @generated
	 */
	public Adapter createEAExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EANumericalValue <em>EA Numerical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EANumericalValue
	 * @generated
	 */
	public Adapter createEANumericalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAStringValue <em>EA String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.EAStringValue
	 * @generated
	 */
	public Adapter createEAStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ValuesAdapterFactory
