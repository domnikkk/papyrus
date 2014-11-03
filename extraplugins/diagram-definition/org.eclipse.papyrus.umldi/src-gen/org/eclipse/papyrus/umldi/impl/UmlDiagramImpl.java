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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.dd.dc.Bounds;
import org.eclipse.papyrus.dd.di.DIPackage;
import org.eclipse.papyrus.dd.di.Diagram;
import org.eclipse.papyrus.dd.di.Shape;
import org.eclipse.papyrus.umldi.TopUmlDiagramElement;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagram;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl#getBounds <em>Bounds</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl#getResolution <em>Resolution</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl#getTopUmlDiagramElement <em>Top Uml Diagram Element</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class UmlDiagramImpl extends UmlDiagramElementImpl implements UmlDiagram {

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Bounds bounds;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final double RESOLUTION_EDEFAULT = 300.0;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected double resolution = RESOLUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopUmlDiagramElement() <em>Top Uml Diagram Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTopUmlDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected EList<TopUmlDiagramElement> topUmlDiagramElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UmlDiagramImpl() {
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
		return UMLDIPackage.Literals.UML_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Bounds getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBounds(Bounds newBounds, NotificationChain msgs) {
		Bounds oldBounds = bounds;
		bounds = newBounds;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM__BOUNDS, oldBounds, newBounds);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBounds(Bounds newBounds) {
		if(newBounds != bounds) {
			NotificationChain msgs = null;
			if(bounds != null)
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.UML_DIAGRAM__BOUNDS, null, msgs);
			if(newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.UML_DIAGRAM__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolution(double newResolution) {
		double oldResolution = resolution;
		resolution = newResolution;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOwnedUmlDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TopUmlDiagramElement> getTopUmlDiagramElement() {
		if(topUmlDiagramElement == null) {
			topUmlDiagramElement = new EObjectContainmentWithInverseEList<TopUmlDiagramElement>(TopUmlDiagramElement.class, this, UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT, UMLDIPackage.TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM);
		}
		return topUmlDiagramElement;
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
		switch(featureID) {
		case UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopUmlDiagramElement()).basicAdd(otherEnd, msgs);
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
		switch(featureID) {
		case UMLDIPackage.UML_DIAGRAM__BOUNDS:
			return basicSetBounds(null, msgs);
		case UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT:
			return ((InternalEList<?>)getTopUmlDiagramElement()).basicRemove(otherEnd, msgs);
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
		switch(featureID) {
		case UMLDIPackage.UML_DIAGRAM__BOUNDS:
			return getBounds();
		case UMLDIPackage.UML_DIAGRAM__NAME:
			return getName();
		case UMLDIPackage.UML_DIAGRAM__DOCUMENTATION:
			return getDocumentation();
		case UMLDIPackage.UML_DIAGRAM__RESOLUTION:
			return getResolution();
		case UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT:
			return getTopUmlDiagramElement();
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
		switch(featureID) {
		case UMLDIPackage.UML_DIAGRAM__BOUNDS:
			setBounds((Bounds)newValue);
			return;
		case UMLDIPackage.UML_DIAGRAM__NAME:
			setName((String)newValue);
			return;
		case UMLDIPackage.UML_DIAGRAM__DOCUMENTATION:
			setDocumentation((String)newValue);
			return;
		case UMLDIPackage.UML_DIAGRAM__RESOLUTION:
			setResolution((Double)newValue);
			return;
		case UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT:
			getTopUmlDiagramElement().clear();
			getTopUmlDiagramElement().addAll((Collection<? extends TopUmlDiagramElement>)newValue);
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
		switch(featureID) {
		case UMLDIPackage.UML_DIAGRAM__BOUNDS:
			setBounds((Bounds)null);
			return;
		case UMLDIPackage.UML_DIAGRAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UMLDIPackage.UML_DIAGRAM__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case UMLDIPackage.UML_DIAGRAM__RESOLUTION:
			setResolution(RESOLUTION_EDEFAULT);
			return;
		case UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT:
			getTopUmlDiagramElement().clear();
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
		switch(featureID) {
		case UMLDIPackage.UML_DIAGRAM__BOUNDS:
			return bounds != null;
		case UMLDIPackage.UML_DIAGRAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UMLDIPackage.UML_DIAGRAM__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
		case UMLDIPackage.UML_DIAGRAM__RESOLUTION:
			return resolution != RESOLUTION_EDEFAULT;
		case UMLDIPackage.UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT:
			return topUmlDiagramElement != null && !topUmlDiagramElement.isEmpty();
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
		if(baseClass == Shape.class) {
			switch(derivedFeatureID) {
			case UMLDIPackage.UML_DIAGRAM__BOUNDS:
				return DIPackage.SHAPE__BOUNDS;
			default:
				return -1;
			}
		}
		if(baseClass == Diagram.class) {
			switch(derivedFeatureID) {
			case UMLDIPackage.UML_DIAGRAM__NAME:
				return DIPackage.DIAGRAM__NAME;
			case UMLDIPackage.UML_DIAGRAM__DOCUMENTATION:
				return DIPackage.DIAGRAM__DOCUMENTATION;
			case UMLDIPackage.UML_DIAGRAM__RESOLUTION:
				return DIPackage.DIAGRAM__RESOLUTION;
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
		if(baseClass == Shape.class) {
			switch(baseFeatureID) {
			case DIPackage.SHAPE__BOUNDS:
				return UMLDIPackage.UML_DIAGRAM__BOUNDS;
			default:
				return -1;
			}
		}
		if(baseClass == Diagram.class) {
			switch(baseFeatureID) {
			case DIPackage.DIAGRAM__NAME:
				return UMLDIPackage.UML_DIAGRAM__NAME;
			case DIPackage.DIAGRAM__DOCUMENTATION:
				return UMLDIPackage.UML_DIAGRAM__DOCUMENTATION;
			case DIPackage.DIAGRAM__RESOLUTION:
				return UMLDIPackage.UML_DIAGRAM__RESOLUTION;
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
		if(eIsProxy())
			return super.toString();
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetOwnedUmlDiagramElement() {
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT);
	}
} //UmlDiagramImpl
