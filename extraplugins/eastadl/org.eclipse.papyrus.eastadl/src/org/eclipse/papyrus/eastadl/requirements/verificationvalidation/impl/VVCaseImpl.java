/**
 */
package org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVCase;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVLog;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVProcedure;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVTarget;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VV Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VVCaseImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VVCaseImpl#getAbstractVVCase <em>Abstract VV Case</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VVCaseImpl#getVvTarget <em>Vv Target</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VVCaseImpl#getVvSubject <em>Vv Subject</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VVCaseImpl#getVvLog <em>Vv Log</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VVCaseImpl#getVvProcedure <em>Vv Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VVCaseImpl extends TraceableSpecificationImpl implements VVCase {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getAbstractVVCase() <em>Abstract VV Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractVVCase()
	 * @generated
	 * @ordered
	 */
	protected VVCase abstractVVCase;

	/**
	 * The cached value of the '{@link #getVvTarget() <em>Vv Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<VVTarget> vvTarget;

	/**
	 * The cached value of the '{@link #getVvSubject() <em>Vv Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<VVCaseInstanceRef> vvSubject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VVCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerificationvalidationPackage.Literals.VV_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerificationvalidationPackage.VV_CASE__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerificationvalidationPackage.VV_CASE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCase getAbstractVVCase() {
		if (abstractVVCase != null && abstractVVCase.eIsProxy()) {
			InternalEObject oldAbstractVVCase = (InternalEObject)abstractVVCase;
			abstractVVCase = (VVCase)eResolveProxy(oldAbstractVVCase);
			if (abstractVVCase != oldAbstractVVCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE, oldAbstractVVCase, abstractVVCase));
			}
		}
		return abstractVVCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCase basicGetAbstractVVCase() {
		return abstractVVCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractVVCase(VVCase newAbstractVVCase) {
		VVCase oldAbstractVVCase = abstractVVCase;
		abstractVVCase = newAbstractVVCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE, oldAbstractVVCase, abstractVVCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVTarget> getVvTarget() {
		if (vvTarget == null) {
			vvTarget = new EObjectResolvingEList<VVTarget>(VVTarget.class, this, VerificationvalidationPackage.VV_CASE__VV_TARGET);
		}
		return vvTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCaseInstanceRef> getVvSubject() {
		if (vvSubject == null) {
			vvSubject = new EObjectContainmentEList<VVCaseInstanceRef>(VVCaseInstanceRef.class, this, VerificationvalidationPackage.VV_CASE__VV_SUBJECT);
		}
		return vvSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VVLog> getVvLog() {
		EList<VVLog> results = new BasicEList<VVLog>();
		VVLog adlVVLog = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlVVLog = (VVLog )UMLUtil.getStereotypeApplication(element, VVLog.class);
				if (adlVVLog != null)
					results.add(adlVVLog);
			}
		}
		
		return new BasicInternalEList<VVLog>(VVLog.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VVProcedure> getVvProcedure() {
		EList<VVProcedure> results = new BasicEList<VVProcedure>();
		VVProcedure adlVVProcedure = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlVVProcedure = (VVProcedure )UMLUtil.getStereotypeApplication(element, VVProcedure.class);
				if (adlVVProcedure != null)
					results.add(adlVVProcedure);
			}
		}
		
		return new BasicInternalEList<VVProcedure>(VVProcedure.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerificationvalidationPackage.VV_CASE__VV_SUBJECT:
				return ((InternalEList<?>)getVvSubject()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerificationvalidationPackage.VV_CASE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE:
				if (resolve) return getAbstractVVCase();
				return basicGetAbstractVVCase();
			case VerificationvalidationPackage.VV_CASE__VV_TARGET:
				return getVvTarget();
			case VerificationvalidationPackage.VV_CASE__VV_SUBJECT:
				return getVvSubject();
			case VerificationvalidationPackage.VV_CASE__VV_LOG:
				return getVvLog();
			case VerificationvalidationPackage.VV_CASE__VV_PROCEDURE:
				return getVvProcedure();
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
			case VerificationvalidationPackage.VV_CASE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE:
				setAbstractVVCase((VVCase)newValue);
				return;
			case VerificationvalidationPackage.VV_CASE__VV_TARGET:
				getVvTarget().clear();
				getVvTarget().addAll((Collection<? extends VVTarget>)newValue);
				return;
			case VerificationvalidationPackage.VV_CASE__VV_SUBJECT:
				getVvSubject().clear();
				getVvSubject().addAll((Collection<? extends VVCaseInstanceRef>)newValue);
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
			case VerificationvalidationPackage.VV_CASE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE:
				setAbstractVVCase((VVCase)null);
				return;
			case VerificationvalidationPackage.VV_CASE__VV_TARGET:
				getVvTarget().clear();
				return;
			case VerificationvalidationPackage.VV_CASE__VV_SUBJECT:
				getVvSubject().clear();
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
			case VerificationvalidationPackage.VV_CASE__BASE_CLASS:
				return base_Class != null;
			case VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE:
				return abstractVVCase != null;
			case VerificationvalidationPackage.VV_CASE__VV_TARGET:
				return vvTarget != null && !vvTarget.isEmpty();
			case VerificationvalidationPackage.VV_CASE__VV_SUBJECT:
				return vvSubject != null && !vvSubject.isEmpty();
			case VerificationvalidationPackage.VV_CASE__VV_LOG:
				return !getVvLog().isEmpty();
			case VerificationvalidationPackage.VV_CASE__VV_PROCEDURE:
				return !getVvProcedure().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VVCaseImpl
