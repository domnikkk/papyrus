/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Styled Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StyledElementImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StyledElementImpl extends EModelElementImpl implements StyledElement {

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<Style> styles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected StyledElementImpl() {
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
		return NattablestylePackage.Literals.STYLED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Style> getStyles() {
		if (styles == null) {
			styles = new EObjectContainmentEList<Style>(Style.class, this, NattablestylePackage.STYLED_ELEMENT__STYLES);
		}
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public NamedStyle getNamedStyle(EClass eClass, String name) {
		if (eClass != null && eIsSet(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES) && NattablestylePackage.eINSTANCE.getNamedStyle().isSuperTypeOf(eClass)) {
			for (Iterator i = getStyles().iterator(); i.hasNext();) {
				Style style = (Style) i.next();
				if (style.eClass() == eClass || eClass.isInstance(style)) {
					if (style.eGet(NattablestylePackage.eINSTANCE.getNamedStyle_Name()).equals(name)) {
						return (NamedStyle) style;
					}
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public Style getStyle(EClass eClass) {
		if (eClass != null && NattablestylePackage.eINSTANCE.getStyle().isSuperTypeOf(eClass)) {
			if (eClass.isSuperTypeOf(eClass())) {
				return (Style) this;
			}
			if (eIsSet(NattablestylePackage.Literals.STYLED_ELEMENT__STYLES)) {
				for (Iterator<?> i = getStyles().iterator(); i.hasNext();) {
					Style style = (Style) i.next();
					if (style.eClass() == eClass || eClass.isInstance(style)) {
						return style;
					}
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public Style createStyle(EClass eClass) {
		Style newStyle = (Style) eClass.getEPackage().getEFactoryInstance().create(eClass);
		getStyles().add(newStyle);
		return newStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NattablestylePackage.STYLED_ELEMENT__STYLES:
			return ((InternalEList<?>) getStyles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case NattablestylePackage.STYLED_ELEMENT__STYLES:
			return getStyles();
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
		case NattablestylePackage.STYLED_ELEMENT__STYLES:
			getStyles().clear();
			getStyles().addAll((Collection<? extends Style>) newValue);
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
		case NattablestylePackage.STYLED_ELEMENT__STYLES:
			getStyles().clear();
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
		case NattablestylePackage.STYLED_ELEMENT__STYLES:
			return styles != null && !styles.isEmpty();
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case NattablestylePackage.STYLED_ELEMENT___GET_NAMED_STYLE__ECLASS_STRING:
			return getNamedStyle((EClass) arguments.get(0), (String) arguments.get(1));
		case NattablestylePackage.STYLED_ELEMENT___GET_STYLE__ECLASS:
			return getStyle((EClass) arguments.get(0));
		case NattablestylePackage.STYLED_ELEMENT___CREATE_STYLE__ECLASS:
			return createStyle((EClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
} // StyledElementImpl
