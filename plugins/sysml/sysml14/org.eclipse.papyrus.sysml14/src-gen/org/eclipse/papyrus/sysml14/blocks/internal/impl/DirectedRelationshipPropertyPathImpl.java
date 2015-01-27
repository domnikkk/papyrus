/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.blocks.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml14.blocks.DirectedRelationshipPropertyPath;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Relationship Property Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.DirectedRelationshipPropertyPathImpl#getBase_DirectedRelationship <em>Base Directed Relationship</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.DirectedRelationshipPropertyPathImpl#getSourcePropertyPath <em>Source Property Path</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.DirectedRelationshipPropertyPathImpl#getTargetPropertyPath <em>Target Property Path</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.DirectedRelationshipPropertyPathImpl#getSourceContext <em>Source Context</em>}</li>
 *   <li>{@link org.eclipse.papyrus.sysml14.blocks.internal.impl.DirectedRelationshipPropertyPathImpl#getTargetContext <em>Target Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DirectedRelationshipPropertyPathImpl extends MinimalEObjectImpl.Container implements DirectedRelationshipPropertyPath {
	/**
	 * The cached value of the '{@link #getBase_DirectedRelationship() <em>Base Directed Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_DirectedRelationship()
	 * @generated
	 * @ordered
	 */
	protected DirectedRelationship base_DirectedRelationship;

	/**
	 * The cached value of the '{@link #getSourcePropertyPath() <em>Source Property Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePropertyPath()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> sourcePropertyPath;

	/**
	 * The cached value of the '{@link #getTargetPropertyPath() <em>Target Property Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> targetPropertyPath;

	/**
	 * The cached value of the '{@link #getSourceContext() <em>Source Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceContext()
	 * @generated
	 * @ordered
	 */
	protected Classifier sourceContext;

	/**
	 * The cached value of the '{@link #getTargetContext() <em>Target Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetContext()
	 * @generated
	 * @ordered
	 */
	protected Classifier targetContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectedRelationshipPropertyPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlocksPackage.Literals.DIRECTED_RELATIONSHIP_PROPERTY_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedRelationship getBase_DirectedRelationship() {
		if (base_DirectedRelationship != null && base_DirectedRelationship.eIsProxy()) {
			InternalEObject oldBase_DirectedRelationship = (InternalEObject)base_DirectedRelationship;
			base_DirectedRelationship = (DirectedRelationship)eResolveProxy(oldBase_DirectedRelationship);
			if (base_DirectedRelationship != oldBase_DirectedRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP, oldBase_DirectedRelationship, base_DirectedRelationship));
			}
		}
		return base_DirectedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedRelationship basicGetBase_DirectedRelationship() {
		return base_DirectedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_DirectedRelationship(DirectedRelationship newBase_DirectedRelationship) {
		DirectedRelationship oldBase_DirectedRelationship = base_DirectedRelationship;
		base_DirectedRelationship = newBase_DirectedRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP, oldBase_DirectedRelationship, base_DirectedRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getSourcePropertyPath() {
		if (sourcePropertyPath == null) {
			sourcePropertyPath = new EObjectResolvingEList<Property>(Property.class, this, BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH);
		}
		return sourcePropertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getSourcePropertyPath(String name, Type type) {
		return getSourcePropertyPath(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getSourcePropertyPath(String name, Type type, boolean ignoreCase, EClass eClass) {
		sourcePropertyPathLoop: for (Property sourcePropertyPath : getSourcePropertyPath()) {
			if (eClass != null && !eClass.isInstance(sourcePropertyPath))
				continue sourcePropertyPathLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(sourcePropertyPath.getName()) : name.equals(sourcePropertyPath.getName())))
				continue sourcePropertyPathLoop;
			if (type != null && !type.equals(sourcePropertyPath.getType()))
				continue sourcePropertyPathLoop;
			return sourcePropertyPath;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getTargetPropertyPath() {
		if (targetPropertyPath == null) {
			targetPropertyPath = new EObjectResolvingEList<Property>(Property.class, this, BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH);
		}
		return targetPropertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getTargetPropertyPath(String name, Type type) {
		return getTargetPropertyPath(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getTargetPropertyPath(String name, Type type, boolean ignoreCase, EClass eClass) {
		targetPropertyPathLoop: for (Property targetPropertyPath : getTargetPropertyPath()) {
			if (eClass != null && !eClass.isInstance(targetPropertyPath))
				continue targetPropertyPathLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(targetPropertyPath.getName()) : name.equals(targetPropertyPath.getName())))
				continue targetPropertyPathLoop;
			if (type != null && !type.equals(targetPropertyPath.getType()))
				continue targetPropertyPathLoop;
			return targetPropertyPath;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSourceContext() {
		if (sourceContext != null && sourceContext.eIsProxy()) {
			InternalEObject oldSourceContext = (InternalEObject)sourceContext;
			sourceContext = (Classifier)eResolveProxy(oldSourceContext);
			if (sourceContext != oldSourceContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT, oldSourceContext, sourceContext));
			}
		}
		return sourceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSourceContext() {
		return sourceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceContext(Classifier newSourceContext) {
		Classifier oldSourceContext = sourceContext;
		sourceContext = newSourceContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT, oldSourceContext, sourceContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getTargetContext() {
		if (targetContext != null && targetContext.eIsProxy()) {
			InternalEObject oldTargetContext = (InternalEObject)targetContext;
			targetContext = (Classifier)eResolveProxy(oldTargetContext);
			if (targetContext != oldTargetContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT, oldTargetContext, targetContext));
			}
		}
		return targetContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetTargetContext() {
		return targetContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetContext(Classifier newTargetContext) {
		Classifier oldTargetContext = targetContext;
		targetContext = newTargetContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT, oldTargetContext, targetContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP:
				if (resolve) return getBase_DirectedRelationship();
				return basicGetBase_DirectedRelationship();
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH:
				return getSourcePropertyPath();
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH:
				return getTargetPropertyPath();
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT:
				if (resolve) return getSourceContext();
				return basicGetSourceContext();
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT:
				if (resolve) return getTargetContext();
				return basicGetTargetContext();
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
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP:
				setBase_DirectedRelationship((DirectedRelationship)newValue);
				return;
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH:
				getSourcePropertyPath().clear();
				getSourcePropertyPath().addAll((Collection<? extends Property>)newValue);
				return;
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH:
				getTargetPropertyPath().clear();
				getTargetPropertyPath().addAll((Collection<? extends Property>)newValue);
				return;
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT:
				setSourceContext((Classifier)newValue);
				return;
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT:
				setTargetContext((Classifier)newValue);
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
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP:
				setBase_DirectedRelationship((DirectedRelationship)null);
				return;
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH:
				getSourcePropertyPath().clear();
				return;
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH:
				getTargetPropertyPath().clear();
				return;
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT:
				setSourceContext((Classifier)null);
				return;
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT:
				setTargetContext((Classifier)null);
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
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__BASE_DIRECTED_RELATIONSHIP:
				return base_DirectedRelationship != null;
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_PROPERTY_PATH:
				return sourcePropertyPath != null && !sourcePropertyPath.isEmpty();
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_PROPERTY_PATH:
				return targetPropertyPath != null && !targetPropertyPath.isEmpty();
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__SOURCE_CONTEXT:
				return sourceContext != null;
			case BlocksPackage.DIRECTED_RELATIONSHIP_PROPERTY_PATH__TARGET_CONTEXT:
				return targetContext != null;
		}
		return super.eIsSet(featureID);
	}

} //DirectedRelationshipPropertyPathImpl
