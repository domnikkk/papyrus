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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.dd.di.DiagramElement;
import org.eclipse.papyrus.dd.di.Edge;
import org.eclipse.papyrus.dd.di.Style;
import org.eclipse.papyrus.dd.di.impl.DiagramElementImpl;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.papyrus.umldi.UmlEdge;
import org.eclipse.papyrus.umldi.UmlStyle;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getModelElement <em>Model Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getSharedStyle <em>Shared Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getLocalStyle <em>Local Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getOwningDiagramElement <em>Owning Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getOwnedDiagramElement <em>Owned Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getTargetEdge <em>Target Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getSourceEdge <em>Source Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getUmlModelElement <em>Uml Model Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getSharedUmlStyle <em>Shared Uml Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getLocalUmlStyle <em>Local Uml Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getTargetUmlEdge <em>Target Uml Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl#getSourceUmlEdge <em>Source Uml Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UmlDiagramElementImpl extends DiagramElementImpl implements UmlDiagramElement {

	/**
	 * The cached value of the '{@link #getUmlModelElement() <em>Uml Model Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getUmlModelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> umlModelElement;

	/**
	 * The cached value of the '{@link #getSharedUmlStyle() <em>Shared Uml Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSharedUmlStyle()
	 * @generated
	 * @ordered
	 */
	protected UmlStyle sharedUmlStyle;

	/**
	 * The cached value of the '{@link #getLocalUmlStyle() <em>Local Uml Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLocalUmlStyle()
	 * @generated
	 * @ordered
	 */
	protected UmlStyle localUmlStyle;

	/**
	 * The cached value of the '{@link #getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOwnedUmlDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlDiagramElement> ownedUmlDiagramElement;

	/**
	 * The cached value of the '{@link #getTargetUmlEdge() <em>Target Uml Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTargetUmlEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlEdge> targetUmlEdge;

	/**
	 * The cached value of the '{@link #getSourceUmlEdge() <em>Source Uml Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSourceUmlEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlEdge> sourceUmlEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected UmlDiagramElementImpl() {
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
		return UMLDIPackage.Literals.UML_DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EObject> getModelElement() {
		return new DerivedUnionEObjectEList<EObject>(EObject.class, this, UMLDIPackage.UML_DIAGRAM_ELEMENT__MODEL_ELEMENT, MODEL_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getModelElement() <em>Model Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MODEL_ELEMENT_ESUBSETS = new int[] { UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Style getSharedStyle() {
		Style sharedStyle = basicGetSharedStyle();
		return sharedStyle != null && sharedStyle.eIsProxy() ? (Style) eResolveProxy((InternalEObject) sharedStyle) : sharedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Style basicGetSharedStyle() {
		if (eIsSet(UMLDIPackage.UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE)) {
			return basicGetSharedUmlStyle();
		}
		return super.basicGetSharedStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Style getLocalStyle() {
		Style localStyle = basicGetLocalStyle();
		return localStyle != null && localStyle.eIsProxy() ? (Style) eResolveProxy((InternalEObject) localStyle) : localStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Style basicGetLocalStyle() {
		if (eIsSet(UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE)) {
			return getLocalUmlStyle();
		}
		return super.basicGetLocalStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DiagramElement getOwningDiagramElement() {
		DiagramElement owningDiagramElement = basicGetOwningDiagramElement();
		return owningDiagramElement != null && owningDiagramElement.eIsProxy() ? (DiagramElement) eResolveProxy((InternalEObject) owningDiagramElement) : owningDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DiagramElement basicGetOwningDiagramElement() {
		UmlDiagramElement owningUmlDiagramElement = getOwningUmlDiagramElement();
		if (owningUmlDiagramElement != null) {
			return owningUmlDiagramElement;
		}
		return super.basicGetOwningDiagramElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<DiagramElement> getOwnedDiagramElement() {
		return new DerivedUnionEObjectEList<DiagramElement>(DiagramElement.class, this, UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT, OWNED_DIAGRAM_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedDiagramElement() <em>Owned Diagram Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getOwnedDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_DIAGRAM_ELEMENT_ESUBSETS = new int[] { UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Edge> getTargetEdge() {
		return new DerivedUnionEObjectEList<Edge>(Edge.class, this, UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_EDGE, TARGET_EDGE_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargetEdge() <em>Target Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTargetEdge()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_EDGE_ESUBSETS = new int[] { UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Edge> getSourceEdge() {
		return new DerivedUnionEObjectEList<Edge>(Edge.class, this, UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_EDGE, SOURCE_EDGE_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSourceEdge() <em>Source Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getSourceEdge()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_EDGE_ESUBSETS = new int[] { UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Element> getUmlModelElement() {
		if (umlModelElement == null) {
			umlModelElement = new EObjectResolvingEList<Element>(Element.class, this, UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT);
		}
		return umlModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UmlStyle getSharedUmlStyle() {
		if (sharedUmlStyle != null && sharedUmlStyle.eIsProxy()) {
			InternalEObject oldSharedUmlStyle = (InternalEObject) sharedUmlStyle;
			sharedUmlStyle = (UmlStyle) eResolveProxy(oldSharedUmlStyle);
			if (sharedUmlStyle != oldSharedUmlStyle) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLDIPackage.UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE, oldSharedUmlStyle, sharedUmlStyle));
				}
			}
		}
		return sharedUmlStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UmlStyle basicGetSharedUmlStyle() {
		return sharedUmlStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSharedUmlStyle(UmlStyle newSharedUmlStyle) {
		UmlStyle oldSharedUmlStyle = sharedUmlStyle;
		sharedUmlStyle = newSharedUmlStyle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE, oldSharedUmlStyle, sharedUmlStyle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UmlStyle getLocalUmlStyle() {
		return localUmlStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetLocalUmlStyle(UmlStyle newLocalUmlStyle, NotificationChain msgs) {
		UmlStyle oldLocalUmlStyle = localUmlStyle;
		localUmlStyle = newLocalUmlStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE, oldLocalUmlStyle, newLocalUmlStyle);
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
	public void setLocalUmlStyle(UmlStyle newLocalUmlStyle) {
		if (newLocalUmlStyle != localUmlStyle) {
			NotificationChain msgs = null;
			if (localUmlStyle != null) {
				msgs = ((InternalEObject) localUmlStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE, null, msgs);
			}
			if (newLocalUmlStyle != null) {
				msgs = ((InternalEObject) newLocalUmlStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE, null, msgs);
			}
			msgs = basicSetLocalUmlStyle(newLocalUmlStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE, newLocalUmlStyle, newLocalUmlStyle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UmlDiagramElement getOwningUmlDiagramElement() {
		if (eContainerFeatureID() != UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT) {
			return null;
		}
		return (UmlDiagramElement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetOwningUmlDiagramElement(UmlDiagramElement newOwningUmlDiagramElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningUmlDiagramElement, UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOwningUmlDiagramElement(UmlDiagramElement newOwningUmlDiagramElement) {
		if (newOwningUmlDiagramElement != eInternalContainer() || (eContainerFeatureID() != UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT && newOwningUmlDiagramElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwningUmlDiagramElement)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			}
			NotificationChain msgs = null;
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (newOwningUmlDiagramElement != null) {
				msgs = ((InternalEObject) newOwningUmlDiagramElement).eInverseAdd(this, UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT, UmlDiagramElement.class, msgs);
			}
			msgs = basicSetOwningUmlDiagramElement(newOwningUmlDiagramElement, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT, newOwningUmlDiagramElement, newOwningUmlDiagramElement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		if (ownedUmlDiagramElement == null) {
			ownedUmlDiagramElement = new EObjectContainmentWithInverseEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT, UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
		}
		return ownedUmlDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<UmlEdge> getTargetUmlEdge() {
		if (targetUmlEdge == null) {
			targetUmlEdge = new EObjectWithInverseResolvingEList<UmlEdge>(UmlEdge.class, this, UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE, UMLDIPackage.UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT);
		}
		return targetUmlEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<UmlEdge> getSourceUmlEdge() {
		if (sourceUmlEdge == null) {
			sourceUmlEdge = new EObjectWithInverseResolvingEList<UmlEdge>(UmlEdge.class, this, UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE, UMLDIPackage.UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT);
		}
		return sourceUmlEdge;
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
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT:
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			return basicSetOwningUmlDiagramElement((UmlDiagramElement) otherEnd, msgs);
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedUmlDiagramElement()).basicAdd(otherEnd, msgs);
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargetUmlEdge()).basicAdd(otherEnd, msgs);
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSourceUmlEdge()).basicAdd(otherEnd, msgs);
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
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE:
			return basicSetLocalUmlStyle(null, msgs);
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return basicSetOwningUmlDiagramElement(null, msgs);
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT:
			return ((InternalEList<?>) getOwnedUmlDiagramElement()).basicRemove(otherEnd, msgs);
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE:
			return ((InternalEList<?>) getTargetUmlEdge()).basicRemove(otherEnd, msgs);
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE:
			return ((InternalEList<?>) getSourceUmlEdge()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return eInternalContainer().eInverseRemove(this, UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT, UmlDiagramElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT:
			return getUmlModelElement();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE:
			if (resolve) {
				return getSharedUmlStyle();
			}
			return basicGetSharedUmlStyle();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE:
			return getLocalUmlStyle();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return getOwningUmlDiagramElement();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT:
			return getOwnedUmlDiagramElement();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE:
			return getTargetUmlEdge();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE:
			return getSourceUmlEdge();
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
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT:
			getUmlModelElement().clear();
			getUmlModelElement().addAll((Collection<? extends Element>) newValue);
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE:
			setSharedUmlStyle((UmlStyle) newValue);
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE:
			setLocalUmlStyle((UmlStyle) newValue);
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT:
			setOwningUmlDiagramElement((UmlDiagramElement) newValue);
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT:
			getOwnedUmlDiagramElement().clear();
			getOwnedUmlDiagramElement().addAll((Collection<? extends UmlDiagramElement>) newValue);
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE:
			getTargetUmlEdge().clear();
			getTargetUmlEdge().addAll((Collection<? extends UmlEdge>) newValue);
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE:
			getSourceUmlEdge().clear();
			getSourceUmlEdge().addAll((Collection<? extends UmlEdge>) newValue);
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
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT:
			getUmlModelElement().clear();
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE:
			setSharedUmlStyle((UmlStyle) null);
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE:
			setLocalUmlStyle((UmlStyle) null);
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT:
			setOwningUmlDiagramElement((UmlDiagramElement) null);
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT:
			getOwnedUmlDiagramElement().clear();
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE:
			getTargetUmlEdge().clear();
			return;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE:
			getSourceUmlEdge().clear();
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
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__MODEL_ELEMENT:
			return isSetModelElement();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SHARED_STYLE:
			return isSetSharedStyle();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_STYLE:
			return isSetLocalStyle();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT:
			return isSetOwningDiagramElement();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT:
			return isSetOwnedDiagramElement();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_EDGE:
			return isSetTargetEdge();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_EDGE:
			return isSetSourceEdge();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT:
			return umlModelElement != null && !umlModelElement.isEmpty();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE:
			return sharedUmlStyle != null;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE:
			return localUmlStyle != null;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT:
			return getOwningUmlDiagramElement() != null;
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT:
			return ownedUmlDiagramElement != null && !ownedUmlDiagramElement.isEmpty();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE:
			return targetUmlEdge != null && !targetUmlEdge.isEmpty();
		case UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE:
			return sourceUmlEdge != null && !sourceUmlEdge.isEmpty();
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
	public boolean isSetModelElement() {
		return super.isSetModelElement() || eIsSet(UMLDIPackage.UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSetSharedStyle() {
		return super.isSetSharedStyle() || eIsSet(UMLDIPackage.UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSetLocalStyle() {
		return super.isSetLocalStyle() || eIsSet(UMLDIPackage.UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSetOwningDiagramElement() {
		return super.isSetOwningDiagramElement() || eIsSet(UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSetOwnedDiagramElement() {
		return super.isSetOwnedDiagramElement() || eIsSet(UMLDIPackage.UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSetTargetEdge() {
		return super.isSetTargetEdge() || eIsSet(UMLDIPackage.UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isSetSourceEdge() {
		return super.isSetSourceEdge() || eIsSet(UMLDIPackage.UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE);
	}
} // UmlDiagramElementImpl
