/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling;


import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.uml2.uml.DataType;


/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Deviation Attribute Set</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DeviationAttributeSet specifies the set of rules of allowed deviations from the reference model in a referring model. These rules are important, because they make sure that the different FeatureModels, referring to one reference model, follow specific rules for deviation, so a later integration into one FeatureModel might be possible.
 * 
 * Extension:
 * DataType
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeAttribute <em>Allow Change Attribute</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeCardinality <em>Allow Change Cardinality</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeDescription <em>Allow Change Description</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeName <em>Allow Change Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowMove <em>Allow Move</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowReduction <em>Allow Reduction</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRefinement <em>Allow Refinement</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRegrouping <em>Allow Regrouping</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRemoval <em>Allow Removal</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getBase_DataType <em>Base Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet()
 * @model
 * @generated
 */
public interface DeviationAttributeSet extends EAElement {

	/**
	 * Returns the value of the '<em><b>Allow Change Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Change Attribute</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Change Attribute</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #setAllowChangeAttribute(DeviationPermissionKind)
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowChangeAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviationPermissionKind getAllowChangeAttribute();

	/**
	 * Returns the value of the '<em><b>Allow Change Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Change Cardinality</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Change Cardinality</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #setAllowChangeCardinality(DeviationPermissionKind)
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowChangeCardinality()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviationPermissionKind getAllowChangeCardinality();

	/**
	 * Returns the value of the '<em><b>Allow Change Description</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Change Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Change Description</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #setAllowChangeDescription(DeviationPermissionKind)
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowChangeDescription()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviationPermissionKind getAllowChangeDescription();

	/**
	 * Returns the value of the '<em><b>Allow Change Name</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Change Name</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Change Name</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #setAllowChangeName(DeviationPermissionKind)
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowChangeName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviationPermissionKind getAllowChangeName();

	/**
	 * Returns the value of the '<em><b>Allow Move</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Move</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Move</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #setAllowMove(DeviationPermissionKind)
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowMove()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviationPermissionKind getAllowMove();

	/**
	 * Returns the value of the '<em><b>Allow Reduction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Reduction</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Reduction</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #setAllowReduction(DeviationPermissionKind)
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowReduction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviationPermissionKind getAllowReduction();

	/**
	 * Returns the value of the '<em><b>Allow Refinement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Refinement</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Refinement</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #setAllowRefinement(DeviationPermissionKind)
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowRefinement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviationPermissionKind getAllowRefinement();

	/**
	 * Returns the value of the '<em><b>Allow Regrouping</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Regrouping</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Regrouping</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #setAllowRegrouping(DeviationPermissionKind)
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowRegrouping()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviationPermissionKind getAllowRegrouping();

	/**
	 * Returns the value of the '<em><b>Allow Removal</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Removal</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Removal</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #setAllowRemoval(DeviationPermissionKind)
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowRemoval()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviationPermissionKind getAllowRemoval();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeAttribute <em>Allow Change Attribute</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Change Attribute</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #getAllowChangeAttribute()
	 * @generated
	 */
	void setAllowChangeAttribute(DeviationPermissionKind value);

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeCardinality <em>Allow Change Cardinality</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Change Cardinality</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #getAllowChangeCardinality()
	 * @generated
	 */
	void setAllowChangeCardinality(DeviationPermissionKind value);

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeDescription <em>Allow Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Change Description</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #getAllowChangeDescription()
	 * @generated
	 */
	void setAllowChangeDescription(DeviationPermissionKind value);

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeName <em>Allow Change Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Change Name</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #getAllowChangeName()
	 * @generated
	 */
	void setAllowChangeName(DeviationPermissionKind value);

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowMove <em>Allow Move</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Move</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #getAllowMove()
	 * @generated
	 */
	void setAllowMove(DeviationPermissionKind value);

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowReduction <em>Allow Reduction</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Reduction</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #getAllowReduction()
	 * @generated
	 */
	void setAllowReduction(DeviationPermissionKind value);

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRefinement <em>Allow Refinement</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Refinement</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #getAllowRefinement()
	 * @generated
	 */
	void setAllowRefinement(DeviationPermissionKind value);

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRegrouping <em>Allow Regrouping</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Regrouping</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #getAllowRegrouping()
	 * @generated
	 */
	void setAllowRegrouping(DeviationPermissionKind value);

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRemoval <em>Allow Removal</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Removal</em>' attribute.
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #getAllowRemoval()
	 * @generated
	 */
	void setAllowRemoval(DeviationPermissionKind value);

	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

} // DeviationAttributeSet
