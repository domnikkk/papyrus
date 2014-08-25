/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dd.dg.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.dd.dg.ClipPath;
import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.GraphicalElement;
import org.eclipse.papyrus.dd.dg.Group;
import org.eclipse.papyrus.dd.dg.Style;
import org.eclipse.papyrus.dd.dg.Transform;
import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Graphical Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.GraphicalElementImpl#getClipPath <em>Clip Path</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.GraphicalElementImpl#getGroup <em>Group</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.GraphicalElementImpl#getClasses <em>Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.GraphicalElementImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.GraphicalElementImpl#getTransforms <em>Transform</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.GraphicalElementImpl#getLayoutData <em>Layout Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GraphicalElementImpl extends DefinitionImpl implements GraphicalElement {

	/**
	 * The cached value of the '{@link #getClipPath() <em>Clip Path</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getClipPath()
	 * @generated
	 * @ordered
	 */
	protected ClipPath clipPath;

	/**
	 * The cached value of the '{@link #getClasses() <em>Class</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classes;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected Style style;

	/**
	 * The cached value of the '{@link #getTransforms() <em>Transform</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTransforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Transform> transforms;

	/**
	 * The default value of the '{@link #getLayoutData() <em>Layout Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLayoutData()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayoutData() <em>Layout Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLayoutData()
	 * @generated
	 * @ordered
	 */
	protected String layoutData = LAYOUT_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected GraphicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.GRAPHICAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ClipPath getClipPath() {
		if (clipPath != null && clipPath.eIsProxy()) {
			InternalEObject oldClipPath = (InternalEObject) clipPath;
			clipPath = (ClipPath) eResolveProxy(oldClipPath);
			if (clipPath != oldClipPath) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH, oldClipPath, clipPath));
				}
			}
		}
		return clipPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ClipPath basicGetClipPath() {
		return clipPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setClipPath(ClipPath newClipPath) {
		ClipPath oldClipPath = clipPath;
		clipPath = newClipPath;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH, oldClipPath, clipPath));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Group getGroup() {
		if (eContainerFeatureID() != DGPackage.GRAPHICAL_ELEMENT__GROUP) {
			return null;
		}
		return (Group) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newGroup, DGPackage.GRAPHICAL_ELEMENT__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGroup(Group newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != DGPackage.GRAPHICAL_ELEMENT__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			}
			NotificationChain msgs = null;
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (newGroup != null) {
				msgs = ((InternalEObject) newGroup).eInverseAdd(this, DGPackage.GROUP__MEMBER, Group.class, msgs);
			}
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.GRAPHICAL_ELEMENT__GROUP, newGroup, newGroup));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<String> getClasses() {
		if (classes == null) {
			classes = new EDataTypeUniqueEList<String>(String.class, this, DGPackage.GRAPHICAL_ELEMENT__CLASS);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Style getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetStyle(Style newStyle, NotificationChain msgs) {
		Style oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.GRAPHICAL_ELEMENT__STYLE, oldStyle, newStyle);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setStyle(Style newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null) {
				msgs = ((InternalEObject) style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.GRAPHICAL_ELEMENT__STYLE, null, msgs);
			}
			if (newStyle != null) {
				msgs = ((InternalEObject) newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.GRAPHICAL_ELEMENT__STYLE, null, msgs);
			}
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.GRAPHICAL_ELEMENT__STYLE, newStyle, newStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Transform> getTransforms() {
		if (transforms == null) {
			transforms = new EObjectContainmentEList<Transform>(Transform.class, this, DGPackage.GRAPHICAL_ELEMENT__TRANSFORM);
		}
		return transforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getLayoutData() {
		return layoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLayoutData(String newLayoutData) {
		String oldLayoutData = layoutData;
		layoutData = newLayoutData;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.GRAPHICAL_ELEMENT__LAYOUT_DATA, oldLayoutData, layoutData));
		}
	}

	/**
	 * The cached validation expression for the ' {@link #referencedClippathHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced Clippath Has Id</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #referencedClippathHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_CLIPPATH_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "clipPath->notEmpty() implies clipPath.id->notEmpty()";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean referencedClippathHasId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DGValidator.validate(DGPackage.Literals.GRAPHICAL_ELEMENT, this, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", DGPackage.Literals.GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP,
				REFERENCED_CLIPPATH_HAS_ID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR, DGValidator.DIAGNOSTIC_SOURCE, DGValidator.GRAPHICAL_ELEMENT__REFERENCED_CLIPPATH_HAS_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DGPackage.GRAPHICAL_ELEMENT__GROUP:
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			return basicSetGroup((Group) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DGPackage.GRAPHICAL_ELEMENT__GROUP:
			return basicSetGroup(null, msgs);
		case DGPackage.GRAPHICAL_ELEMENT__STYLE:
			return basicSetStyle(null, msgs);
		case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
			return ((InternalEList<?>) getTransforms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case DGPackage.GRAPHICAL_ELEMENT__GROUP:
			return eInternalContainer().eInverseRemove(this, DGPackage.GROUP__MEMBER, Group.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH:
			if (resolve) {
				return getClipPath();
			}
			return basicGetClipPath();
		case DGPackage.GRAPHICAL_ELEMENT__GROUP:
			return getGroup();
		case DGPackage.GRAPHICAL_ELEMENT__CLASS:
			return getClasses();
		case DGPackage.GRAPHICAL_ELEMENT__STYLE:
			return getStyle();
		case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
			return getTransforms();
		case DGPackage.GRAPHICAL_ELEMENT__LAYOUT_DATA:
			return getLayoutData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH:
			setClipPath((ClipPath) newValue);
			return;
		case DGPackage.GRAPHICAL_ELEMENT__GROUP:
			setGroup((Group) newValue);
			return;
		case DGPackage.GRAPHICAL_ELEMENT__CLASS:
			getClasses().clear();
			getClasses().addAll((Collection<? extends String>) newValue);
			return;
		case DGPackage.GRAPHICAL_ELEMENT__STYLE:
			setStyle((Style) newValue);
			return;
		case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
			getTransforms().clear();
			getTransforms().addAll((Collection<? extends Transform>) newValue);
			return;
		case DGPackage.GRAPHICAL_ELEMENT__LAYOUT_DATA:
			setLayoutData((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH:
			setClipPath((ClipPath) null);
			return;
		case DGPackage.GRAPHICAL_ELEMENT__GROUP:
			setGroup((Group) null);
			return;
		case DGPackage.GRAPHICAL_ELEMENT__CLASS:
			getClasses().clear();
			return;
		case DGPackage.GRAPHICAL_ELEMENT__STYLE:
			setStyle((Style) null);
			return;
		case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
			getTransforms().clear();
			return;
		case DGPackage.GRAPHICAL_ELEMENT__LAYOUT_DATA:
			setLayoutData(LAYOUT_DATA_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DGPackage.GRAPHICAL_ELEMENT__CLIP_PATH:
			return clipPath != null;
		case DGPackage.GRAPHICAL_ELEMENT__GROUP:
			return getGroup() != null;
		case DGPackage.GRAPHICAL_ELEMENT__CLASS:
			return classes != null && !classes.isEmpty();
		case DGPackage.GRAPHICAL_ELEMENT__STYLE:
			return style != null;
		case DGPackage.GRAPHICAL_ELEMENT__TRANSFORM:
			return transforms != null && !transforms.isEmpty();
		case DGPackage.GRAPHICAL_ELEMENT__LAYOUT_DATA:
			return LAYOUT_DATA_EDEFAULT == null ? layoutData != null : !LAYOUT_DATA_EDEFAULT.equals(layoutData);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DGPackage.GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP:
			return referencedClippathHasId((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (class: ");
		result.append(classes);
		result.append(", layoutData: ");
		result.append(layoutData);
		result.append(')');
		return result.toString();
	}
} // GraphicalElementImpl
