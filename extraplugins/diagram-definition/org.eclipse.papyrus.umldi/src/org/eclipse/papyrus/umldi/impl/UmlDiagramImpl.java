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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.dd.di.DIPackage;
import org.eclipse.papyrus.dd.di.Diagram;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlDiagramImpl extends UmlShapeImpl implements UmlDiagram {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final double RESOLUTION_EDEFAULT = 300.0;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected double resolution = RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLDIPackage.Literals.UML_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(double newResolution) {
		double oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.UML_DIAGRAM__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLDIPackage.UML_DIAGRAM__NAME:
				return getName();
			case UMLDIPackage.UML_DIAGRAM__DOCUMENTATION:
				return getDocumentation();
			case UMLDIPackage.UML_DIAGRAM__RESOLUTION:
				return getResolution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLDIPackage.UML_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case UMLDIPackage.UML_DIAGRAM__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case UMLDIPackage.UML_DIAGRAM__RESOLUTION:
				setResolution((Double)newValue);
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
			case UMLDIPackage.UML_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UMLDIPackage.UML_DIAGRAM__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case UMLDIPackage.UML_DIAGRAM__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
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
			case UMLDIPackage.UML_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UMLDIPackage.UML_DIAGRAM__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case UMLDIPackage.UML_DIAGRAM__RESOLUTION:
				return resolution != RESOLUTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Diagram.class) {
			switch (derivedFeatureID) {
				case UMLDIPackage.UML_DIAGRAM__NAME: return DIPackage.DIAGRAM__NAME;
				case UMLDIPackage.UML_DIAGRAM__DOCUMENTATION: return DIPackage.DIAGRAM__DOCUMENTATION;
				case UMLDIPackage.UML_DIAGRAM__RESOLUTION: return DIPackage.DIAGRAM__RESOLUTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Diagram.class) {
			switch (baseFeatureID) {
				case DIPackage.DIAGRAM__NAME: return UMLDIPackage.UML_DIAGRAM__NAME;
				case DIPackage.DIAGRAM__DOCUMENTATION: return UMLDIPackage.UML_DIAGRAM__DOCUMENTATION;
				case DIPackage.DIAGRAM__RESOLUTION: return UMLDIPackage.UML_DIAGRAM__RESOLUTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(')');
		return result.toString();
	}

} //UmlDiagramImpl
