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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectIdTreeItemAxis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Id Tree Item Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdTreeItemAxisImpl#getParent <em>Parent</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdTreeItemAxisImpl#isExpanded <em>Expanded</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdTreeItemAxisImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectIdTreeItemAxisImpl extends ObjectIdAxisImpl implements ObjectIdTreeItemAxis {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ITreeItemAxis parent;

	/**
	 * The default value of the '{@link #isExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPANDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isExpanded()
	 * @generated
	 * @ordered
	 */
	protected boolean expanded = EXPANDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ITreeItemAxis> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ObjectIdTreeItemAxisImpl() {
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
		return NattableaxisPackage.Literals.OBJECT_ID_TREE_ITEM_AXIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ITreeItemAxis getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (ITreeItemAxis) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT, oldParent, parent));
				}
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ITreeItemAxis basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetParent(ITreeItemAxis newParent, NotificationChain msgs) {
		ITreeItemAxis oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT, oldParent, newParent);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setParent(ITreeItemAxis newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null) {
				msgs = ((InternalEObject) parent).eInverseRemove(this, NattableaxisPackage.ITREE_ITEM_AXIS__CHILDREN, ITreeItemAxis.class, msgs);
			}
			if (newParent != null) {
				msgs = ((InternalEObject) newParent).eInverseAdd(this, NattableaxisPackage.ITREE_ITEM_AXIS__CHILDREN, ITreeItemAxis.class, msgs);
			}
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT, newParent, newParent));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isExpanded() {
		return expanded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setExpanded(boolean newExpanded) {
		boolean oldExpanded = expanded;
		expanded = newExpanded;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__EXPANDED, oldExpanded, expanded));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<ITreeItemAxis> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<ITreeItemAxis>(ITreeItemAxis.class, this, NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__CHILDREN, NattableaxisPackage.ITREE_ITEM_AXIS__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT:
			if (parent != null) {
				msgs = ((InternalEObject) parent).eInverseRemove(this, NattableaxisPackage.ITREE_ITEM_AXIS__CHILDREN, ITreeItemAxis.class, msgs);
			}
			return basicSetParent((ITreeItemAxis) otherEnd, msgs);
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__CHILDREN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT:
			return basicSetParent(null, msgs);
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
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
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT:
			if (resolve) {
				return getParent();
			}
			return basicGetParent();
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__EXPANDED:
			return isExpanded();
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__CHILDREN:
			return getChildren();
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
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT:
			setParent((ITreeItemAxis) newValue);
			return;
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__EXPANDED:
			setExpanded((Boolean) newValue);
			return;
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends ITreeItemAxis>) newValue);
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
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT:
			setParent((ITreeItemAxis) null);
			return;
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__EXPANDED:
			setExpanded(EXPANDED_EDEFAULT);
			return;
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__CHILDREN:
			getChildren().clear();
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
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT:
			return parent != null;
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__EXPANDED:
			return expanded != EXPANDED_EDEFAULT;
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__CHILDREN:
			return children != null && !children.isEmpty();
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ITreeItemAxis.class) {
			switch (derivedFeatureID) {
			case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT:
				return NattableaxisPackage.ITREE_ITEM_AXIS__PARENT;
			case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__EXPANDED:
				return NattableaxisPackage.ITREE_ITEM_AXIS__EXPANDED;
			case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__CHILDREN:
				return NattableaxisPackage.ITREE_ITEM_AXIS__CHILDREN;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ITreeItemAxis.class) {
			switch (baseFeatureID) {
			case NattableaxisPackage.ITREE_ITEM_AXIS__PARENT:
				return NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__PARENT;
			case NattableaxisPackage.ITREE_ITEM_AXIS__EXPANDED:
				return NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__EXPANDED;
			case NattableaxisPackage.ITREE_ITEM_AXIS__CHILDREN:
				return NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS__CHILDREN;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (expanded: "); //$NON-NLS-1$
		result.append(expanded);
		result.append(')');
		return result.toString();
	}

} // ObjectIdTreeItemAxisImpl
