/**
 */
package org.eclipse.papyrus.eastadl.timing.timingconstraints.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.timing.Event;
import org.eclipse.papyrus.eastadl.timing.TimingExpression;
import org.eclipse.papyrus.eastadl.timing.impl.TimingConstraintImpl;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.SynchronizationConstraint;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SynchronizationConstraintImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.SynchronizationConstraintImpl#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizationConstraintImpl extends TimingConstraintImpl implements SynchronizationConstraint {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingconstraintsPackage.Literals.SYNCHRONIZATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectResolvingEList<Event>(Event.class, this, TimingconstraintsPackage.SYNCHRONIZATION_CONSTRAINT__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingExpression getTolerance() {
		TimingExpression tolerance = basicGetTolerance();
		return tolerance != null && tolerance.eIsProxy() ? (TimingExpression)eResolveProxy((InternalEObject)tolerance) : tolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimingExpression basicGetTolerance() {
		TimingExpression adlBehavior = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlBehavior = (TimingExpression )UMLUtil.getStereotypeApplication(element, TimingExpression.class);
				if (adlBehavior != null)
					return adlBehavior;
			}
		}
		
		return adlBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingconstraintsPackage.SYNCHRONIZATION_CONSTRAINT__EVENT:
				return getEvent();
			case TimingconstraintsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				if (resolve) return getTolerance();
				return basicGetTolerance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingconstraintsPackage.SYNCHRONIZATION_CONSTRAINT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimingconstraintsPackage.SYNCHRONIZATION_CONSTRAINT__EVENT:
				getEvent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimingconstraintsPackage.SYNCHRONIZATION_CONSTRAINT__EVENT:
				return event != null && !event.isEmpty();
			case TimingconstraintsPackage.SYNCHRONIZATION_CONSTRAINT__TOLERANCE:
				return basicGetTolerance() != null;
		}
		return super.eIsSet(featureID);
	}

} //SynchronizationConstraintImpl
