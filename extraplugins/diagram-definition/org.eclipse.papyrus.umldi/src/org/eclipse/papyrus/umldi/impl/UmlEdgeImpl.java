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
package org.eclipse.papyrus.umldi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.dd.dc.Point;

import org.eclipse.papyrus.dd.di.DIPackage;
import org.eclipse.papyrus.dd.di.DiagramElement;
import org.eclipse.papyrus.dd.di.Edge;

import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.papyrus.umldi.UmlEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlEdgeImpl#getSourceDiagramElement <em>Source Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlEdgeImpl#getTargetDiagramElement <em>Target Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlEdgeImpl#getWaypoint <em>Waypoint</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlEdgeImpl#getSourceUmlDiagramElement <em>Source Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlEdgeImpl#getTargetUmlDiagramElement <em>Target Uml Diagram Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlEdgeImpl extends UmlDiagramElementImpl implements UmlEdge {

	/**
	 * The cached value of the '{@link #getWaypoint() <em>Waypoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getWaypoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> waypoint;

	/**
	 * The cached value of the '{@link #getSourceUmlDiagramElement() <em>Source Uml Diagram Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSourceUmlDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected UmlDiagramElement sourceUmlDiagramElement;

	/**
	 * The cached value of the '{@link #getTargetUmlDiagramElement() <em>Target Uml Diagram Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTargetUmlDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected UmlDiagramElement targetUmlDiagramElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected UmlEdgeImpl() {
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
		return UMLDIPackage.Literals.UML_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DiagramElement getSourceDiagramElement() {
		DiagramElement sourceDiagramElement = basicGetSourceDiagramElement();
		return sourceDiagramElement != null && sourceDiagramElement.eIsProxy() ? (DiagramElement) eResolveProxy((InternalEObject) sourceDiagramElement) : sourceDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DiagramElement basicGetSourceDiagramElement() {
		if (eIsSet(UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT)) {
			return basicGetSourceUmlDiagramElement();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DiagramElement getTargetDiagramElement() {
		DiagramElement targetDiagramElement = basicGetTargetDiagramElement();
		return targetDiagramElement != null && targetDiagramElement.eIsProxy() ? (DiagramElement) eResolveProxy((InternalEObject) targetDiagramElement) : targetDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DiagramElement basicGetTargetDiagramElement() {
		if (eIsSet(UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT)) {
			return basicGetTargetUmlDiagramElement();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Point> getWaypoint() {
		if (waypoint == null) {
			waypoint = new EObjectContainmentEList<Point>(Point.class, this, UMLDIPackage.UML_EDGE__WAYPOINT);
		}
		return waypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UmlDiagramElement getSourceUmlDiagramElement() {
		if (sourceUmlDiagramElement != null && sourceUmlDiagramElement.eIsProxy()) {
			InternalEObject oldSourceUmlDiagramElement = (InternalEObject) sourceUmlDiagramElement;
			sourceUmlDiagramElement = (UmlDiagramElement) eResolveProxy(oldSourceUmlDiagramElement);
			if (sourceUmlDiagramElement != oldSourceUmlDiagramElement) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT, oldSourceUmlDiagramElement, sourceUmlDiagramElement));
				}
			}
		}
		return sourceUmlDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UmlDiagramElement basicGetSourceUmlDiagramElement() {
		return sourceUmlDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetSourceUmlDiagramElement(UmlDiagramElement newSourceUmlDiagramElement, NotificationChain msgs) {
		UmlDiagramElement oldSourceUmlDiagramElement = sourceUmlDiagramElement;
		sourceUmlDiagramElement = newSourceUmlDiagramElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT, oldSourceUmlDiagramElement, newSourceUmlDiagramElement);
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
	public void setSourceUmlDiagramElement(UmlDiagramElement newSourceUmlDiagramElement) {
		if (newSourceUmlDiagramElement != sourceUmlDiagramElement) {
			NotificationChain msgs = null;
			if (sourceUmlDiagramElement != null) {
				msgs = ((InternalEObject) sourceUmlDiagramElement).eInverseRemove(this, UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE, UmlDiagramElement.class, msgs);
			}
			if (newSourceUmlDiagramElement != null) {
				msgs = ((InternalEObject) newSourceUmlDiagramElement).eInverseAdd(this, UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE, UmlDiagramElement.class, msgs);
			}
			msgs = basicSetSourceUmlDiagramElement(newSourceUmlDiagramElement, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT, newSourceUmlDiagramElement, newSourceUmlDiagramElement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UmlDiagramElement getTargetUmlDiagramElement() {
		if (targetUmlDiagramElement != null && targetUmlDiagramElement.eIsProxy()) {
			InternalEObject oldTargetUmlDiagramElement = (InternalEObject) targetUmlDiagramElement;
			targetUmlDiagramElement = (UmlDiagramElement) eResolveProxy(oldTargetUmlDiagramElement);
			if (targetUmlDiagramElement != oldTargetUmlDiagramElement) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT, oldTargetUmlDiagramElement, targetUmlDiagramElement));
				}
			}
		}
		return targetUmlDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UmlDiagramElement basicGetTargetUmlDiagramElement() {
		return targetUmlDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetTargetUmlDiagramElement(UmlDiagramElement newTargetUmlDiagramElement, NotificationChain msgs) {
		UmlDiagramElement oldTargetUmlDiagramElement = targetUmlDiagramElement;
		targetUmlDiagramElement = newTargetUmlDiagramElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT, oldTargetUmlDiagramElement, newTargetUmlDiagramElement);
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
	public void setTargetUmlDiagramElement(UmlDiagramElement newTargetUmlDiagramElement) {
		if (newTargetUmlDiagramElement != targetUmlDiagramElement) {
			NotificationChain msgs = null;
			if (targetUmlDiagramElement != null) {
				msgs = ((InternalEObject) targetUmlDiagramElement).eInverseRemove(this, UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE, UmlDiagramElement.class, msgs);
			}
			if (newTargetUmlDiagramElement != null) {
				msgs = ((InternalEObject) newTargetUmlDiagramElement).eInverseAdd(this, UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE, UmlDiagramElement.class, msgs);
			}
			msgs = basicSetTargetUmlDiagramElement(newTargetUmlDiagramElement, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT, newTargetUmlDiagramElement, newTargetUmlDiagramElement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			if (sourceUmlDiagramElement != null) {
				msgs = ((InternalEObject) sourceUmlDiagramElement).eInverseRemove(this, UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE, UmlDiagramElement.class, msgs);
			}
			return basicSetSourceUmlDiagramElement((UmlDiagramElement) otherEnd, msgs);
		case UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			if (targetUmlDiagramElement != null) {
				msgs = ((InternalEObject) targetUmlDiagramElement).eInverseRemove(this, UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE, UmlDiagramElement.class, msgs);
			}
			return basicSetTargetUmlDiagramElement((UmlDiagramElement) otherEnd, msgs);
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
		case UMLDIPackage.UML_EDGE__WAYPOINT:
			return ((InternalEList<?>) getWaypoint()).basicRemove(otherEnd, msgs);
		case UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			return basicSetSourceUmlDiagramElement(null, msgs);
		case UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			return basicSetTargetUmlDiagramElement(null, msgs);
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
		case UMLDIPackage.UML_EDGE__SOURCE_DIAGRAM_ELEMENT:
			if (resolve) {
				return getSourceDiagramElement();
			}
			return basicGetSourceDiagramElement();
		case UMLDIPackage.UML_EDGE__TARGET_DIAGRAM_ELEMENT:
			if (resolve) {
				return getTargetDiagramElement();
			}
			return basicGetTargetDiagramElement();
		case UMLDIPackage.UML_EDGE__WAYPOINT:
			return getWaypoint();
		case UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			if (resolve) {
				return getSourceUmlDiagramElement();
			}
			return basicGetSourceUmlDiagramElement();
		case UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			if (resolve) {
				return getTargetUmlDiagramElement();
			}
			return basicGetTargetUmlDiagramElement();
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
		case UMLDIPackage.UML_EDGE__WAYPOINT:
			getWaypoint().clear();
			getWaypoint().addAll((Collection<? extends Point>) newValue);
			return;
		case UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			setSourceUmlDiagramElement((UmlDiagramElement) newValue);
			return;
		case UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			setTargetUmlDiagramElement((UmlDiagramElement) newValue);
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
		case UMLDIPackage.UML_EDGE__WAYPOINT:
			getWaypoint().clear();
			return;
		case UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			setSourceUmlDiagramElement((UmlDiagramElement) null);
			return;
		case UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			setTargetUmlDiagramElement((UmlDiagramElement) null);
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
		case UMLDIPackage.UML_EDGE__SOURCE_DIAGRAM_ELEMENT:
			return isSetSourceDiagramElement();
		case UMLDIPackage.UML_EDGE__TARGET_DIAGRAM_ELEMENT:
			return isSetTargetDiagramElement();
		case UMLDIPackage.UML_EDGE__WAYPOINT:
			return waypoint != null && !waypoint.isEmpty();
		case UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT:
			return sourceUmlDiagramElement != null;
		case UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT:
			return targetUmlDiagramElement != null;
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
		if (baseClass == Edge.class) {
			switch (derivedFeatureID) {
			case UMLDIPackage.UML_EDGE__SOURCE_DIAGRAM_ELEMENT:
				return DIPackage.EDGE__SOURCE_DIAGRAM_ELEMENT;
			case UMLDIPackage.UML_EDGE__WAYPOINT:
				return DIPackage.EDGE__WAYPOINT;
			case UMLDIPackage.UML_EDGE__TARGET_DIAGRAM_ELEMENT:
				return DIPackage.EDGE__TARGET_DIAGRAM_ELEMENT;
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
		if (baseClass == Edge.class) {
			switch (baseFeatureID) {
			case DIPackage.EDGE__SOURCE_DIAGRAM_ELEMENT:
				return UMLDIPackage.UML_EDGE__SOURCE_DIAGRAM_ELEMENT;
			case DIPackage.EDGE__WAYPOINT:
				return UMLDIPackage.UML_EDGE__WAYPOINT;
			case DIPackage.EDGE__TARGET_DIAGRAM_ELEMENT:
				return UMLDIPackage.UML_EDGE__TARGET_DIAGRAM_ELEMENT;
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
	public boolean isSetSourceDiagramElement() {
		return eIsSet(UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean isSetTargetDiagramElement() {
		return eIsSet(UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT);
	}
} // UmlEdgeImpl
