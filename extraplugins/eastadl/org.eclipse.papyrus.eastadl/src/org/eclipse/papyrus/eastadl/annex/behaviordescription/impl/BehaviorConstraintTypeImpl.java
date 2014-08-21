/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintInternalBinding;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintParameter;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalConstraint;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ContextImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTypeImpl#getSharedVariable <em>Shared Variable</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTypeImpl#getInterfaceVariable <em>Interface Variable</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTypeImpl#getPart <em>Part</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTypeImpl#getAttributeQuantificationconstraint <em>Attribute Quantificationconstraint</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTypeImpl#getTemporalConstraint <em>Temporal Constraint</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviorConstraintTypeImpl#getComputationConstraint <em>Computation Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorConstraintTypeImpl extends ContextImpl implements BehaviorConstraintType {
	/**
	 * The cached value of the '{@link #getSharedVariable() <em>Shared Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSharedVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorConstraintInternalBinding> sharedVariable;

	/**
	 * The cached value of the '{@link #getInterfaceVariable() <em>Interface Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInterfaceVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorConstraintParameter> interfaceVariable;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorConstraintPrototype> part;

	/**
	 * The cached value of the '{@link #getAttributeQuantificationconstraint() <em>Attribute Quantificationconstraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAttributeQuantificationconstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeQuantificationconstraint> attributeQuantificationconstraint;

	/**
	 * The cached value of the '{@link #getTemporalConstraint() <em>Temporal Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTemporalConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalConstraint> temporalConstraint;

	/**
	 * The cached value of the '{@link #getComputationConstraint() <em>Computation Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getComputationConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputationConstraint> computationConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BehaviorConstraintTypeImpl() {
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
		return BehaviordescriptionPackage.Literals.BEHAVIOR_CONSTRAINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<BehaviorConstraintInternalBinding> getSharedVariable() {
		if (sharedVariable == null) {
			sharedVariable = new EObjectResolvingEList<BehaviorConstraintInternalBinding>(BehaviorConstraintInternalBinding.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__SHARED_VARIABLE);
		}
		return sharedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<BehaviorConstraintParameter> getInterfaceVariable() {
		if (interfaceVariable == null) {
			interfaceVariable = new EObjectResolvingEList<BehaviorConstraintParameter>(BehaviorConstraintParameter.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__INTERFACE_VARIABLE);
		}
		return interfaceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<BehaviorConstraintPrototype> getPart() {
		if (part == null) {
			part = new EObjectResolvingEList<BehaviorConstraintPrototype>(BehaviorConstraintPrototype.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<AttributeQuantificationconstraint> getAttributeQuantificationconstraint() {
		if (attributeQuantificationconstraint == null) {
			attributeQuantificationconstraint = new EObjectResolvingEList<AttributeQuantificationconstraint>(AttributeQuantificationconstraint.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__ATTRIBUTE_QUANTIFICATIONCONSTRAINT);
		}
		return attributeQuantificationconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<TemporalConstraint> getTemporalConstraint() {
		if (temporalConstraint == null) {
			temporalConstraint = new EObjectResolvingEList<TemporalConstraint>(TemporalConstraint.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__TEMPORAL_CONSTRAINT);
		}
		return temporalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<ComputationConstraint> getComputationConstraint() {
		if (computationConstraint == null) {
			computationConstraint = new EObjectResolvingEList<ComputationConstraint>(ComputationConstraint.class, this, BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__COMPUTATION_CONSTRAINT);
		}
		return computationConstraint;
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
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__SHARED_VARIABLE:
			return getSharedVariable();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__INTERFACE_VARIABLE:
			return getInterfaceVariable();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__PART:
			return getPart();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__ATTRIBUTE_QUANTIFICATIONCONSTRAINT:
			return getAttributeQuantificationconstraint();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__TEMPORAL_CONSTRAINT:
			return getTemporalConstraint();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__COMPUTATION_CONSTRAINT:
			return getComputationConstraint();
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
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__SHARED_VARIABLE:
			getSharedVariable().clear();
			getSharedVariable().addAll((Collection<? extends BehaviorConstraintInternalBinding>) newValue);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__INTERFACE_VARIABLE:
			getInterfaceVariable().clear();
			getInterfaceVariable().addAll((Collection<? extends BehaviorConstraintParameter>) newValue);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__PART:
			getPart().clear();
			getPart().addAll((Collection<? extends BehaviorConstraintPrototype>) newValue);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__ATTRIBUTE_QUANTIFICATIONCONSTRAINT:
			getAttributeQuantificationconstraint().clear();
			getAttributeQuantificationconstraint().addAll((Collection<? extends AttributeQuantificationconstraint>) newValue);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__TEMPORAL_CONSTRAINT:
			getTemporalConstraint().clear();
			getTemporalConstraint().addAll((Collection<? extends TemporalConstraint>) newValue);
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__COMPUTATION_CONSTRAINT:
			getComputationConstraint().clear();
			getComputationConstraint().addAll((Collection<? extends ComputationConstraint>) newValue);
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
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__SHARED_VARIABLE:
			getSharedVariable().clear();
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__INTERFACE_VARIABLE:
			getInterfaceVariable().clear();
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__PART:
			getPart().clear();
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__ATTRIBUTE_QUANTIFICATIONCONSTRAINT:
			getAttributeQuantificationconstraint().clear();
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__TEMPORAL_CONSTRAINT:
			getTemporalConstraint().clear();
			return;
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__COMPUTATION_CONSTRAINT:
			getComputationConstraint().clear();
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
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__SHARED_VARIABLE:
			return sharedVariable != null && !sharedVariable.isEmpty();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__INTERFACE_VARIABLE:
			return interfaceVariable != null && !interfaceVariable.isEmpty();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__PART:
			return part != null && !part.isEmpty();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__ATTRIBUTE_QUANTIFICATIONCONSTRAINT:
			return attributeQuantificationconstraint != null && !attributeQuantificationconstraint.isEmpty();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__TEMPORAL_CONSTRAINT:
			return temporalConstraint != null && !temporalConstraint.isEmpty();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE__COMPUTATION_CONSTRAINT:
			return computationConstraint != null && !computationConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BehaviorConstraintTypeImpl
