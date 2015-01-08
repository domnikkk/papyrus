/**
 */
package org.eclipse.papyrus.eastadl.requirements.usecases.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.papyrus.eastadl.requirements.usecases.Extend;
import org.eclipse.papyrus.eastadl.requirements.usecases.ExtensionPoint;
import org.eclipse.papyrus.eastadl.requirements.usecases.Include;
import org.eclipse.papyrus.eastadl.requirements.usecases.UseCase;
import org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.impl.UseCaseImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.impl.UseCaseImpl#getInclude <em>Include</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.impl.UseCaseImpl#getExtend <em>Extend</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.usecases.impl.UseCaseImpl#getExtensionPoint <em>Extension Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends TraceableSpecificationImpl implements UseCase {
	/**
	 * The cached value of the '{@link #getBase_UseCase() <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_UseCase()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.UseCase base_UseCase;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> include;

	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<Extend> extend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected UseCaseImpl() {
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
		return UsecasesPackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.UseCase getBase_UseCase() {
		if (base_UseCase != null && base_UseCase.eIsProxy()) {
			InternalEObject oldBase_UseCase = (InternalEObject) base_UseCase;
			base_UseCase = (org.eclipse.uml2.uml.UseCase) eResolveProxy(oldBase_UseCase);
			if (base_UseCase != oldBase_UseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsecasesPackage.USE_CASE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
			}
		}
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public org.eclipse.uml2.uml.UseCase basicGetBase_UseCase() {
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_UseCase(org.eclipse.uml2.uml.UseCase newBase_UseCase) {
		org.eclipse.uml2.uml.UseCase oldBase_UseCase = base_UseCase;
		base_UseCase = newBase_UseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasesPackage.USE_CASE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Include> getInclude() {
		if (include == null) {
			include = new EObjectResolvingEList<Include>(Include.class, this, UsecasesPackage.USE_CASE__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Extend> getExtend() {
		if (extend == null) {
			extend = new EObjectResolvingEList<Extend>(Extend.class, this, UsecasesPackage.USE_CASE__EXTEND);
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<ExtensionPoint> getExtensionPoint() {
		EList<ExtensionPoint> results = new BasicEList<ExtensionPoint>();
		ExtensionPoint adlExtensionPoint = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlExtensionPoint = UMLUtil.getStereotypeApplication(element, ExtensionPoint.class);
				if (adlExtensionPoint != null) {
					results.add(adlExtensionPoint);
				}
			}
		}

		return new BasicInternalEList<ExtensionPoint>(ExtensionPoint.class, results.size(), results.toArray());
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
		case UsecasesPackage.USE_CASE__BASE_USE_CASE:
			if (resolve)
				return getBase_UseCase();
			return basicGetBase_UseCase();
		case UsecasesPackage.USE_CASE__INCLUDE:
			return getInclude();
		case UsecasesPackage.USE_CASE__EXTEND:
			return getExtend();
		case UsecasesPackage.USE_CASE__EXTENSION_POINT:
			return getExtensionPoint();
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
		case UsecasesPackage.USE_CASE__BASE_USE_CASE:
			setBase_UseCase((org.eclipse.uml2.uml.UseCase) newValue);
			return;
		case UsecasesPackage.USE_CASE__INCLUDE:
			getInclude().clear();
			getInclude().addAll((Collection<? extends Include>) newValue);
			return;
		case UsecasesPackage.USE_CASE__EXTEND:
			getExtend().clear();
			getExtend().addAll((Collection<? extends Extend>) newValue);
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
		case UsecasesPackage.USE_CASE__BASE_USE_CASE:
			setBase_UseCase((org.eclipse.uml2.uml.UseCase) null);
			return;
		case UsecasesPackage.USE_CASE__INCLUDE:
			getInclude().clear();
			return;
		case UsecasesPackage.USE_CASE__EXTEND:
			getExtend().clear();
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
		case UsecasesPackage.USE_CASE__BASE_USE_CASE:
			return base_UseCase != null;
		case UsecasesPackage.USE_CASE__INCLUDE:
			return include != null && !include.isEmpty();
		case UsecasesPackage.USE_CASE__EXTEND:
			return extend != null && !extend.isEmpty();
		case UsecasesPackage.USE_CASE__EXTENSION_POINT:
			return !getExtensionPoint().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // UseCaseImpl
