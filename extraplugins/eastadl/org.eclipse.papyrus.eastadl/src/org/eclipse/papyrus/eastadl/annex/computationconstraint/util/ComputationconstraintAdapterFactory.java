/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage
 * @generated
 */
public class ComputationconstraintAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static ComputationconstraintPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ComputationconstraintAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComputationconstraintPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ComputationconstraintSwitch<Adapter> modelSwitch =
			new ComputationconstraintSwitch<Adapter>() {
				@Override
				public Adapter caseComputationConstraint(ComputationConstraint object) {
					return createComputationConstraintAdapter();
				}

				@Override
				public Adapter caseLogicalPath(LogicalPath object) {
					return createLogicalPathAdapter();
				}

				@Override
				public Adapter caseLogicalTransformation(LogicalTransformation object) {
					return createLogicalTransformationAdapter();
				}

				@Override
				public Adapter caseTransformationOccurrence(TransformationOccurrence object) {
					return createTransformationOccurrenceAdapter();
				}

				@Override
				public Adapter caseEAElement(EAElement object) {
					return createEAElementAdapter();
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
	 *
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint <em>Computation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint
	 * @generated
	 */
	public Adapter createComputationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath <em>Logical Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath
	 * @generated
	 */
	public Adapter createLogicalPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation <em>Logical Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation
	 * @generated
	 */
	public Adapter createLogicalTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence <em>Transformation Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence
	 * @generated
	 */
	public Adapter createTransformationOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement <em>EA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement
	 * @generated
	 */
	public Adapter createEAElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ComputationconstraintAdapterFactory
