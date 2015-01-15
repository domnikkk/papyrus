/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.modelelements.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.sysml14.modelelements.ModelelementsPackage;
import org.eclipse.papyrus.sysml14.modelelements.Stakeholder;
import org.eclipse.papyrus.sysml14.modelelements.ViewPoint;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ViewPointImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ViewPointImpl#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ViewPointImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ViewPointImpl#getConcernList <em>Concern List</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ViewPointImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ViewPointImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ViewPointImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.modelelements.internal.impl.ViewPointImpl#getConcern <em>Concern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewPointImpl extends MinimalEObjectImpl.Container implements ViewPoint {
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
	 * The cached value of the '{@link #getStakeholder() <em>Stakeholder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholder()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> stakeholder;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcernList() <em>Concern List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernList()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> concernList;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> presentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelelementsPackage.Literals.VIEW_POINT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelelementsPackage.VIEW_POINT__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelelementsPackage.VIEW_POINT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stakeholder> getStakeholder() {
		if (stakeholder == null) {
			stakeholder = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, ModelelementsPackage.VIEW_POINT__STAKEHOLDER);
		}
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelelementsPackage.VIEW_POINT__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getConcernList() {
		if (concernList == null) {
			concernList = new EObjectResolvingEList<Comment>(Comment.class, this, ModelelementsPackage.VIEW_POINT__CONCERN_LIST);
		}
		return concernList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, ModelelementsPackage.VIEW_POINT__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getMethod() {
		// TODO: implement this method to return the 'Method' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getMethod(String name) {
		return getMethod(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getMethod(String name, boolean ignoreCase, EClass eClass) {
		methodLoop: for (Behavior method : getMethod()) {
			if (eClass != null && !eClass.isInstance(method))
				continue methodLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(method.getName()) : name.equals(method.getName())))
				continue methodLoop;
			return method;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPresentation() {
		if (presentation == null) {
			presentation = new EDataTypeUniqueEList<String>(String.class, this, ModelelementsPackage.VIEW_POINT__PRESENTATION);
		}
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConcern() {
		// TODO: implement this method to return the 'Concern' attribute list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelelementsPackage.VIEW_POINT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ModelelementsPackage.VIEW_POINT__STAKEHOLDER:
				return getStakeholder();
			case ModelelementsPackage.VIEW_POINT__PURPOSE:
				return getPurpose();
			case ModelelementsPackage.VIEW_POINT__CONCERN_LIST:
				return getConcernList();
			case ModelelementsPackage.VIEW_POINT__LANGUAGE:
				return getLanguage();
			case ModelelementsPackage.VIEW_POINT__METHOD:
				return getMethod();
			case ModelelementsPackage.VIEW_POINT__PRESENTATION:
				return getPresentation();
			case ModelelementsPackage.VIEW_POINT__CONCERN:
				return getConcern();
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
			case ModelelementsPackage.VIEW_POINT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ModelelementsPackage.VIEW_POINT__STAKEHOLDER:
				getStakeholder().clear();
				getStakeholder().addAll((Collection<? extends Stakeholder>)newValue);
				return;
			case ModelelementsPackage.VIEW_POINT__PURPOSE:
				setPurpose((String)newValue);
				return;
			case ModelelementsPackage.VIEW_POINT__CONCERN_LIST:
				getConcernList().clear();
				getConcernList().addAll((Collection<? extends Comment>)newValue);
				return;
			case ModelelementsPackage.VIEW_POINT__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
				return;
			case ModelelementsPackage.VIEW_POINT__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Behavior>)newValue);
				return;
			case ModelelementsPackage.VIEW_POINT__PRESENTATION:
				getPresentation().clear();
				getPresentation().addAll((Collection<? extends String>)newValue);
				return;
			case ModelelementsPackage.VIEW_POINT__CONCERN:
				getConcern().clear();
				getConcern().addAll((Collection<? extends String>)newValue);
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
			case ModelelementsPackage.VIEW_POINT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ModelelementsPackage.VIEW_POINT__STAKEHOLDER:
				getStakeholder().clear();
				return;
			case ModelelementsPackage.VIEW_POINT__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case ModelelementsPackage.VIEW_POINT__CONCERN_LIST:
				getConcernList().clear();
				return;
			case ModelelementsPackage.VIEW_POINT__LANGUAGE:
				getLanguage().clear();
				return;
			case ModelelementsPackage.VIEW_POINT__METHOD:
				getMethod().clear();
				return;
			case ModelelementsPackage.VIEW_POINT__PRESENTATION:
				getPresentation().clear();
				return;
			case ModelelementsPackage.VIEW_POINT__CONCERN:
				getConcern().clear();
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
			case ModelelementsPackage.VIEW_POINT__BASE_CLASS:
				return base_Class != null;
			case ModelelementsPackage.VIEW_POINT__STAKEHOLDER:
				return stakeholder != null && !stakeholder.isEmpty();
			case ModelelementsPackage.VIEW_POINT__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case ModelelementsPackage.VIEW_POINT__CONCERN_LIST:
				return concernList != null && !concernList.isEmpty();
			case ModelelementsPackage.VIEW_POINT__LANGUAGE:
				return language != null && !language.isEmpty();
			case ModelelementsPackage.VIEW_POINT__METHOD:
				return !getMethod().isEmpty();
			case ModelelementsPackage.VIEW_POINT__PRESENTATION:
				return presentation != null && !presentation.isEmpty();
			case ModelelementsPackage.VIEW_POINT__CONCERN:
				return !getConcern().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (purpose: "); //$NON-NLS-1$
		result.append(purpose);
		result.append(", language: "); //$NON-NLS-1$
		result.append(language);
		result.append(", presentation: "); //$NON-NLS-1$
		result.append(presentation);
		result.append(')');
		return result.toString();
	}

} //ViewPointImpl
