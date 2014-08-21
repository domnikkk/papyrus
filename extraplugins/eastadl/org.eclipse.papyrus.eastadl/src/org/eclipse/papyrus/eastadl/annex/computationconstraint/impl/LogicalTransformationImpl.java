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

import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;

import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation;

import org.eclipse.papyrus.eastadl.annex.temporalconstraint.LogicalTimeCondition;

import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;

import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;

import org.eclipse.papyrus.eastadl.structure.functionmodeling.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl#isIsClientServerInterface <em>Is Client Server Interface</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl#getClientServerinterfaceOperation <em>Client Serverinterface Operation</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl#getContained <em>Contained</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl#getOut <em>Out</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl#getIn <em>In</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl#getExpression <em>Expression</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl#getQuantificationInvariant <em>Quantification Invariant</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl#getPreCondition <em>Pre Condition</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl#getPostCondition <em>Post Condition</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl#getTimeInvariant <em>Time Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalTransformationImpl extends EAElementImpl implements LogicalTransformation {
	/**
	 * The default value of the '{@link #isIsClientServerInterface() <em>Is Client Server Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isIsClientServerInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLIENT_SERVER_INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsClientServerInterface() <em>Is Client Server Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isIsClientServerInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean isClientServerInterface = IS_CLIENT_SERVER_INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientServerinterfaceOperation() <em>Client Serverinterface Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getClientServerinterfaceOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> clientServerinterfaceOperation;

	/**
	 * The cached value of the '{@link #getContained() <em>Contained</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContained()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> contained;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> out;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> in;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EAExpression expression;

	/**
	 * The cached value of the '{@link #getQuantificationInvariant() <em>Quantification Invariant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getQuantificationInvariant()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantification> quantificationInvariant;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantification> preCondition;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantification> postCondition;

	/**
	 * The cached value of the '{@link #getTimeInvariant() <em>Time Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTimeInvariant()
	 * @generated
	 * @ordered
	 */
	protected LogicalTimeCondition timeInvariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LogicalTransformationImpl() {
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
		return ComputationconstraintPackage.Literals.LOGICAL_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isIsClientServerInterface() {
		return isClientServerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsClientServerInterface(boolean newIsClientServerInterface) {
		boolean oldIsClientServerInterface = isClientServerInterface;
		isClientServerInterface = newIsClientServerInterface;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__IS_CLIENT_SERVER_INTERFACE, oldIsClientServerInterface, isClientServerInterface));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Operation> getClientServerinterfaceOperation() {
		if (clientServerinterfaceOperation == null) {
			clientServerinterfaceOperation = new EObjectResolvingEList<Operation>(Operation.class, this, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__CLIENT_SERVERINTERFACE_OPERATION);
		}
		return clientServerinterfaceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Attribute> getContained() {
		if (contained == null) {
			contained = new EObjectResolvingEList<Attribute>(Attribute.class, this, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__CONTAINED);
		}
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Attribute> getOut() {
		if (out == null) {
			out = new EObjectResolvingEList<Attribute>(Attribute.class, this, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__OUT);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Attribute> getIn() {
		if (in == null) {
			in = new EObjectResolvingEList<Attribute>(Attribute.class, this, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__IN);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAExpression getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject) expression;
			expression = (EAExpression) eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__EXPRESSION, oldExpression, expression));
				}
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAExpression basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setExpression(EAExpression newExpression) {
		EAExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__EXPRESSION, oldExpression, expression));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Quantification> getQuantificationInvariant() {
		if (quantificationInvariant == null) {
			quantificationInvariant = new EObjectResolvingEList<Quantification>(Quantification.class, this, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__QUANTIFICATION_INVARIANT);
		}
		return quantificationInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Quantification> getPreCondition() {
		if (preCondition == null) {
			preCondition = new EObjectResolvingEList<Quantification>(Quantification.class, this, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__PRE_CONDITION);
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Quantification> getPostCondition() {
		if (postCondition == null) {
			postCondition = new EObjectResolvingEList<Quantification>(Quantification.class, this, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__POST_CONDITION);
		}
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public LogicalTimeCondition getTimeInvariant() {
		if (timeInvariant != null && timeInvariant.eIsProxy()) {
			InternalEObject oldTimeInvariant = (InternalEObject) timeInvariant;
			timeInvariant = (LogicalTimeCondition) eResolveProxy(oldTimeInvariant);
			if (timeInvariant != oldTimeInvariant) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__TIME_INVARIANT, oldTimeInvariant, timeInvariant));
				}
			}
		}
		return timeInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogicalTimeCondition basicGetTimeInvariant() {
		return timeInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTimeInvariant(LogicalTimeCondition newTimeInvariant) {
		LogicalTimeCondition oldTimeInvariant = timeInvariant;
		timeInvariant = newTimeInvariant;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ComputationconstraintPackage.LOGICAL_TRANSFORMATION__TIME_INVARIANT, oldTimeInvariant, timeInvariant));
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
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__IS_CLIENT_SERVER_INTERFACE:
			return isIsClientServerInterface();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__CLIENT_SERVERINTERFACE_OPERATION:
			return getClientServerinterfaceOperation();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__CONTAINED:
			return getContained();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__OUT:
			return getOut();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__IN:
			return getIn();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__EXPRESSION:
			if (resolve) {
				return getExpression();
			}
			return basicGetExpression();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__QUANTIFICATION_INVARIANT:
			return getQuantificationInvariant();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__PRE_CONDITION:
			return getPreCondition();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__POST_CONDITION:
			return getPostCondition();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__TIME_INVARIANT:
			if (resolve) {
				return getTimeInvariant();
			}
			return basicGetTimeInvariant();
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
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__IS_CLIENT_SERVER_INTERFACE:
			setIsClientServerInterface((Boolean) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__CLIENT_SERVERINTERFACE_OPERATION:
			getClientServerinterfaceOperation().clear();
			getClientServerinterfaceOperation().addAll((Collection<? extends Operation>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__CONTAINED:
			getContained().clear();
			getContained().addAll((Collection<? extends Attribute>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__OUT:
			getOut().clear();
			getOut().addAll((Collection<? extends Attribute>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__IN:
			getIn().clear();
			getIn().addAll((Collection<? extends Attribute>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__EXPRESSION:
			setExpression((EAExpression) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__QUANTIFICATION_INVARIANT:
			getQuantificationInvariant().clear();
			getQuantificationInvariant().addAll((Collection<? extends Quantification>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__PRE_CONDITION:
			getPreCondition().clear();
			getPreCondition().addAll((Collection<? extends Quantification>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__POST_CONDITION:
			getPostCondition().clear();
			getPostCondition().addAll((Collection<? extends Quantification>) newValue);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__TIME_INVARIANT:
			setTimeInvariant((LogicalTimeCondition) newValue);
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
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__IS_CLIENT_SERVER_INTERFACE:
			setIsClientServerInterface(IS_CLIENT_SERVER_INTERFACE_EDEFAULT);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__CLIENT_SERVERINTERFACE_OPERATION:
			getClientServerinterfaceOperation().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__CONTAINED:
			getContained().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__OUT:
			getOut().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__IN:
			getIn().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__EXPRESSION:
			setExpression((EAExpression) null);
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__QUANTIFICATION_INVARIANT:
			getQuantificationInvariant().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__PRE_CONDITION:
			getPreCondition().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__POST_CONDITION:
			getPostCondition().clear();
			return;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__TIME_INVARIANT:
			setTimeInvariant((LogicalTimeCondition) null);
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
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__IS_CLIENT_SERVER_INTERFACE:
			return isClientServerInterface != IS_CLIENT_SERVER_INTERFACE_EDEFAULT;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__CLIENT_SERVERINTERFACE_OPERATION:
			return clientServerinterfaceOperation != null && !clientServerinterfaceOperation.isEmpty();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__CONTAINED:
			return contained != null && !contained.isEmpty();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__OUT:
			return out != null && !out.isEmpty();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__IN:
			return in != null && !in.isEmpty();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__EXPRESSION:
			return expression != null;
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__QUANTIFICATION_INVARIANT:
			return quantificationInvariant != null && !quantificationInvariant.isEmpty();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__PRE_CONDITION:
			return preCondition != null && !preCondition.isEmpty();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__POST_CONDITION:
			return postCondition != null && !postCondition.isEmpty();
		case ComputationconstraintPackage.LOGICAL_TRANSFORMATION__TIME_INVARIANT:
			return timeInvariant != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isClientServerInterface: ");
		result.append(isClientServerInterface);
		result.append(')');
		return result.toString();
	}

} // LogicalTransformationImpl
