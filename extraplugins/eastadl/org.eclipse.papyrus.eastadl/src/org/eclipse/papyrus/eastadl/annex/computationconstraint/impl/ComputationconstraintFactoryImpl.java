/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintFactory;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ComputationconstraintFactoryImpl extends EFactoryImpl implements ComputationconstraintFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static ComputationconstraintFactory init() {
		try {
			ComputationconstraintFactory theComputationconstraintFactory = (ComputationconstraintFactory) EPackage.Registry.INSTANCE.getEFactory(ComputationconstraintPackage.eNS_URI);
			if (theComputationconstraintFactory != null) {
				return theComputationconstraintFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComputationconstraintFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ComputationconstraintFactoryImpl() {
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
		case ComputationconstraintPackage.COMPUTATION_CONSTRAINT:
			return createComputationConstraint();
		case ComputationconstraintPackage.LOGICAL_PATH:
			return createLogicalPath();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION:
			return createLogicalTransformation();
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE:
			return createTransformationOccurrence();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ComputationConstraint createComputationConstraint() {
		ComputationConstraintImpl computationConstraint = new ComputationConstraintImpl();
		return computationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public LogicalPath createLogicalPath() {
		LogicalPathImpl logicalPath = new LogicalPathImpl();
		return logicalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public LogicalTransformation createLogicalTransformation() {
		LogicalTransformationImpl logicalTransformation = new LogicalTransformationImpl();
		return logicalTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TransformationOccurrence createTransformationOccurrence() {
		TransformationOccurrenceImpl transformationOccurrence = new TransformationOccurrenceImpl();
		return transformationOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ComputationconstraintPackage getComputationconstraintPackage() {
		return (ComputationconstraintPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComputationconstraintPackage getPackage() {
		return ComputationconstraintPackage.eINSTANCE;
	}

} // ComputationconstraintFactoryImpl
