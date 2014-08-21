/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation;

import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computation Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationConstraintImpl#getLogicalPath <em>Logical Path</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationConstraintImpl#getLogicalTransformation <em>Logical Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComputationConstraintImpl extends EAElementImpl implements ComputationConstraint {
	/**
	 * The cached value of the '{@link #getLogicalPath() <em>Logical Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLogicalPath()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalPath> logicalPath;

	/**
	 * The cached value of the '{@link #getLogicalTransformation() <em>Logical Transformation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLogicalTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalTransformation> logicalTransformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComputationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputationconstraintPackage.Literals.COMPUTATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<LogicalPath> getLogicalPath() {
		if (logicalPath == null) {
			logicalPath = new EObjectResolvingEList<LogicalPath>(LogicalPath.class, this, ComputationconstraintPackage.COMPUTATION_CONSTRAINT__LOGICAL_PATH);
		}
		return logicalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<LogicalTransformation> getLogicalTransformation() {
		if (logicalTransformation == null) {
			logicalTransformation = new EObjectResolvingEList<LogicalTransformation>(LogicalTransformation.class, this, ComputationconstraintPackage.COMPUTATION_CONSTRAINT__LOGICAL_TRANSFORMATION);
		}
		return logicalTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComputationconstraintPackage.COMPUTATION_CONSTRAINT__LOGICAL_PATH:
			return getLogicalPath();
		case ComputationconstraintPackage.COMPUTATION_CONSTRAINT__LOGICAL_TRANSFORMATION:
			return getLogicalTransformation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComputationconstraintPackage.COMPUTATION_CONSTRAINT__LOGICAL_PATH:
			getLogicalPath().clear();
			getLogicalPath().addAll((Collection<? extends LogicalPath>) newValue);
			return;
		case ComputationconstraintPackage.COMPUTATION_CONSTRAINT__LOGICAL_TRANSFORMATION:
			getLogicalTransformation().clear();
			getLogicalTransformation().addAll((Collection<? extends LogicalTransformation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ComputationconstraintPackage.COMPUTATION_CONSTRAINT__LOGICAL_PATH:
			getLogicalPath().clear();
			return;
		case ComputationconstraintPackage.COMPUTATION_CONSTRAINT__LOGICAL_TRANSFORMATION:
			getLogicalTransformation().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ComputationconstraintPackage.COMPUTATION_CONSTRAINT__LOGICAL_PATH:
			return logicalPath != null && !logicalPath.isEmpty();
		case ComputationconstraintPackage.COMPUTATION_CONSTRAINT__LOGICAL_TRANSFORMATION:
			return logicalTransformation != null && !logicalTransformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ComputationConstraintImpl
