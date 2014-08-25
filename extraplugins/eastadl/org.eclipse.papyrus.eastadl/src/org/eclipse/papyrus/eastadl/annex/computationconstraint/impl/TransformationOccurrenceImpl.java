/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.TransformationOccurrenceImpl#getInQuantification <em>In Quantification</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.TransformationOccurrenceImpl#getOutQuantification <em>Out Quantification</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.TransformationOccurrenceImpl#getInvokedLogicalTransformation <em>Invoked Logical Transformation</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.TransformationOccurrenceImpl#getTimeCondition <em>Time Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationOccurrenceImpl extends EAElementImpl implements TransformationOccurrence {
	/**
	 * The cached value of the '{@link #getInQuantification() <em>In Quantification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getInQuantification()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantification> inQuantification;

	/**
	 * The cached value of the '{@link #getOutQuantification() <em>Out Quantification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOutQuantification()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantification> outQuantification;

	/**
	 * The cached value of the '{@link #getInvokedLogicalTransformation() <em>Invoked Logical Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getInvokedLogicalTransformation()
	 * @generated
	 * @ordered
	 */
	protected LogicalTransformation invokedLogicalTransformation;

	/**
	 * The cached value of the '{@link #getTimeCondition() <em>Time Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTimeCondition()
	 * @generated
	 * @ordered
	 */
	protected LogicalTimeCondition timeCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TransformationOccurrenceImpl() {
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
		return ComputationconstraintPackage.Literals.TRANSFORMATION_OCCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Quantification> getInQuantification() {
		if (inQuantification == null) {
			inQuantification = new EObjectResolvingEList<Quantification>(Quantification.class, this, ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__IN_QUANTIFICATION);
		}
		return inQuantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Quantification> getOutQuantification() {
		if (outQuantification == null) {
			outQuantification = new EObjectResolvingEList<Quantification>(Quantification.class, this, ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__OUT_QUANTIFICATION);
		}
		return outQuantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public LogicalTransformation getInvokedLogicalTransformation() {
		if (invokedLogicalTransformation != null && invokedLogicalTransformation.eIsProxy()) {
			InternalEObject oldInvokedLogicalTransformation = (InternalEObject) invokedLogicalTransformation;
			invokedLogicalTransformation = (LogicalTransformation) eResolveProxy(oldInvokedLogicalTransformation);
			if (invokedLogicalTransformation != oldInvokedLogicalTransformation) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__INVOKED_LOGICAL_TRANSFORMATION, oldInvokedLogicalTransformation, invokedLogicalTransformation));
				}
			}
		}
		return invokedLogicalTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public LogicalTransformation basicGetInvokedLogicalTransformation() {
		return invokedLogicalTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setInvokedLogicalTransformation(LogicalTransformation newInvokedLogicalTransformation) {
		LogicalTransformation oldInvokedLogicalTransformation = invokedLogicalTransformation;
		invokedLogicalTransformation = newInvokedLogicalTransformation;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__INVOKED_LOGICAL_TRANSFORMATION, oldInvokedLogicalTransformation, invokedLogicalTransformation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public LogicalTimeCondition getTimeCondition() {
		if (timeCondition != null && timeCondition.eIsProxy()) {
			InternalEObject oldTimeCondition = (InternalEObject) timeCondition;
			timeCondition = (LogicalTimeCondition) eResolveProxy(oldTimeCondition);
			if (timeCondition != oldTimeCondition) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__TIME_CONDITION, oldTimeCondition, timeCondition));
				}
			}
		}
		return timeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public LogicalTimeCondition basicGetTimeCondition() {
		return timeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTimeCondition(LogicalTimeCondition newTimeCondition) {
		LogicalTimeCondition oldTimeCondition = timeCondition;
		timeCondition = newTimeCondition;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__TIME_CONDITION, oldTimeCondition, timeCondition));
		}
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
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__IN_QUANTIFICATION:
			return getInQuantification();
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__OUT_QUANTIFICATION:
			return getOutQuantification();
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__INVOKED_LOGICAL_TRANSFORMATION:
			if (resolve) {
				return getInvokedLogicalTransformation();
			}
			return basicGetInvokedLogicalTransformation();
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__TIME_CONDITION:
			if (resolve) {
				return getTimeCondition();
			}
			return basicGetTimeCondition();
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
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__IN_QUANTIFICATION:
			getInQuantification().clear();
			getInQuantification().addAll((Collection<? extends Quantification>) newValue);
			return;
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__OUT_QUANTIFICATION:
			getOutQuantification().clear();
			getOutQuantification().addAll((Collection<? extends Quantification>) newValue);
			return;
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__INVOKED_LOGICAL_TRANSFORMATION:
			setInvokedLogicalTransformation((LogicalTransformation) newValue);
			return;
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__TIME_CONDITION:
			setTimeCondition((LogicalTimeCondition) newValue);
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
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__IN_QUANTIFICATION:
			getInQuantification().clear();
			return;
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__OUT_QUANTIFICATION:
			getOutQuantification().clear();
			return;
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__INVOKED_LOGICAL_TRANSFORMATION:
			setInvokedLogicalTransformation((LogicalTransformation) null);
			return;
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__TIME_CONDITION:
			setTimeCondition((LogicalTimeCondition) null);
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
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__IN_QUANTIFICATION:
			return inQuantification != null && !inQuantification.isEmpty();
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__OUT_QUANTIFICATION:
			return outQuantification != null && !outQuantification.isEmpty();
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__INVOKED_LOGICAL_TRANSFORMATION:
			return invokedLogicalTransformation != null;
		case ComputationconstraintPackage.TRANSFORMATION_OCCURRENCE__TIME_CONDITION:
			return timeCondition != null;
		}
		return super.eIsSet(featureID);
	}

} // TransformationOccurrenceImpl
