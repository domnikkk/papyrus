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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisFactory
 * @model kind="package"
 * @generated
 */
public interface NattableaxisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "nattableaxis"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/nattable/model/table/nattableaxis"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "nattableaxis"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	NattableaxisPackage eINSTANCE = org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis <em>IAxis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getIAxis()
	 * @generated
	 */
	int IAXIS = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS__EANNOTATIONS = NattablestylePackage.STYLED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS__STYLES = NattablestylePackage.STYLED_ELEMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS__MANAGER = NattablestylePackage.STYLED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS__ALIAS = NattablestylePackage.STYLED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IAxis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS_FEATURE_COUNT = NattablestylePackage.STYLED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS___GET_EANNOTATION__STRING = NattablestylePackage.STYLED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS___GET_NAMED_STYLE__ECLASS_STRING = NattablestylePackage.STYLED_ELEMENT___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS___GET_STYLE__ECLASS = NattablestylePackage.STYLED_ELEMENT___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS___CREATE_STYLE__ECLASS = NattablestylePackage.STYLED_ELEMENT___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS___GET_ELEMENT = NattablestylePackage.STYLED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS___GET_LOCAL_LABEL_CONFIGURATION = NattablestylePackage.STYLED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>IAxis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IAXIS_OPERATION_COUNT = NattablestylePackage.STYLED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis <em>ITree Item Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getITreeItemAxis()
	 * @generated
	 */
	int ITREE_ITEM_AXIS = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS__EANNOTATIONS = IAXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS__STYLES = IAXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS__MANAGER = IAXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS__ALIAS = IAXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS__PARENT = IAXIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS__EXPANDED = IAXIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS__CHILDREN = IAXIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ITree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS_FEATURE_COUNT = IAXIS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS___GET_EANNOTATION__STRING = IAXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS___GET_NAMED_STYLE__ECLASS_STRING = IAXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS___GET_STYLE__ECLASS = IAXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS___CREATE_STYLE__ECLASS = IAXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS___GET_ELEMENT = IAXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS___GET_LOCAL_LABEL_CONFIGURATION = IAXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>ITree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ITREE_ITEM_AXIS_OPERATION_COUNT = IAXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.IdAxisImpl <em>Id Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.IdAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getIdAxis()
	 * @generated
	 */
	int ID_AXIS = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS__EANNOTATIONS = IAXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS__STYLES = IAXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS__MANAGER = IAXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS__ALIAS = IAXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS__ELEMENT = IAXIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Id Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS_FEATURE_COUNT = IAXIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS___GET_EANNOTATION__STRING = IAXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS___GET_NAMED_STYLE__ECLASS_STRING = IAXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS___GET_STYLE__ECLASS = IAXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS___CREATE_STYLE__ECLASS = IAXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS___GET_ELEMENT = IAXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS___GET_LOCAL_LABEL_CONFIGURATION = IAXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Id Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_AXIS_OPERATION_COUNT = IAXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.IdTreeItemAxisImpl <em>Id Tree Item Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.IdTreeItemAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getIdTreeItemAxis()
	 * @generated
	 */
	int ID_TREE_ITEM_AXIS = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS__EANNOTATIONS = ID_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS__STYLES = ID_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS__MANAGER = ID_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS__ALIAS = ID_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS__ELEMENT = ID_AXIS__ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS__PARENT = ID_AXIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS__EXPANDED = ID_AXIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS__CHILDREN = ID_AXIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Id Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS_FEATURE_COUNT = ID_AXIS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS___GET_EANNOTATION__STRING = ID_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS___GET_NAMED_STYLE__ECLASS_STRING = ID_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS___GET_STYLE__ECLASS = ID_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS___CREATE_STYLE__ECLASS = ID_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS___GET_ELEMENT = ID_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS___GET_LOCAL_LABEL_CONFIGURATION = ID_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Id Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ID_TREE_ITEM_AXIS_OPERATION_COUNT = ID_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectAxisImpl <em>Object Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getObjectAxis()
	 * @generated
	 */
	int OBJECT_AXIS = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS__EANNOTATIONS = IAXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS__STYLES = IAXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS__MANAGER = IAXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS__ALIAS = IAXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS__LOCAL_LABEL_CONFIGURATION = IAXIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS_FEATURE_COUNT = IAXIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS___GET_EANNOTATION__STRING = IAXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS___GET_NAMED_STYLE__ECLASS_STRING = IAXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS___GET_STYLE__ECLASS = IAXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS___CREATE_STYLE__ECLASS = IAXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS___GET_ELEMENT = IAXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS___GET_LOCAL_LABEL_CONFIGURATION = IAXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Object Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_AXIS_OPERATION_COUNT = IAXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EObjectAxisImpl <em>EObject Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EObjectAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getEObjectAxis()
	 * @generated
	 */
	int EOBJECT_AXIS = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS__EANNOTATIONS = OBJECT_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS__STYLES = OBJECT_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS__MANAGER = OBJECT_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS__ALIAS = OBJECT_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS__LOCAL_LABEL_CONFIGURATION = OBJECT_AXIS__LOCAL_LABEL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS__ELEMENT = OBJECT_AXIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS_FEATURE_COUNT = OBJECT_AXIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS___GET_EANNOTATION__STRING = OBJECT_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS___GET_NAMED_STYLE__ECLASS_STRING = OBJECT_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS___GET_STYLE__ECLASS = OBJECT_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS___CREATE_STYLE__ECLASS = OBJECT_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS___GET_ELEMENT = OBJECT_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS___GET_LOCAL_LABEL_CONFIGURATION = OBJECT_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>EObject Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_AXIS_OPERATION_COUNT = OBJECT_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EObjectTreeItemAxisImpl <em>EObject Tree Item Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EObjectTreeItemAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getEObjectTreeItemAxis()
	 * @generated
	 */
	int EOBJECT_TREE_ITEM_AXIS = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS__EANNOTATIONS = EOBJECT_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS__STYLES = EOBJECT_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS__MANAGER = EOBJECT_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS__ALIAS = EOBJECT_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS__LOCAL_LABEL_CONFIGURATION = EOBJECT_AXIS__LOCAL_LABEL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS__ELEMENT = EOBJECT_AXIS__ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS__PARENT = EOBJECT_AXIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS__EXPANDED = EOBJECT_AXIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS__CHILDREN = EOBJECT_AXIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EObject Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS_FEATURE_COUNT = EOBJECT_AXIS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS___GET_EANNOTATION__STRING = EOBJECT_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS___GET_NAMED_STYLE__ECLASS_STRING = EOBJECT_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS___GET_STYLE__ECLASS = EOBJECT_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS___CREATE_STYLE__ECLASS = EOBJECT_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS___GET_ELEMENT = EOBJECT_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS___GET_LOCAL_LABEL_CONFIGURATION = EOBJECT_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>EObject Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TREE_ITEM_AXIS_OPERATION_COUNT = EOBJECT_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureAxisImpl <em>Feature Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getFeatureAxis()
	 * @generated
	 */
	int FEATURE_AXIS = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS__EANNOTATIONS = IAXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS__STYLES = IAXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS__MANAGER = IAXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS__ALIAS = IAXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS__LOCAL_LABEL_CONFIGURATION = IAXIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS_FEATURE_COUNT = IAXIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS___GET_EANNOTATION__STRING = IAXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS___GET_NAMED_STYLE__ECLASS_STRING = IAXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS___GET_STYLE__ECLASS = IAXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS___CREATE_STYLE__ECLASS = IAXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS___GET_ELEMENT = IAXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS___GET_LOCAL_LABEL_CONFIGURATION = IAXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Feature Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_AXIS_OPERATION_COUNT = IAXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureTreeItemAxisImpl <em>Feature Tree Item Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureTreeItemAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getFeatureTreeItemAxis()
	 * @generated
	 */
	int FEATURE_TREE_ITEM_AXIS = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS__EANNOTATIONS = FEATURE_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS__STYLES = FEATURE_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS__MANAGER = FEATURE_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS__ALIAS = FEATURE_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS__LOCAL_LABEL_CONFIGURATION = FEATURE_AXIS__LOCAL_LABEL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS__PARENT = FEATURE_AXIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS__EXPANDED = FEATURE_AXIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS__CHILDREN = FEATURE_AXIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS_FEATURE_COUNT = FEATURE_AXIS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS___GET_EANNOTATION__STRING = FEATURE_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS___GET_NAMED_STYLE__ECLASS_STRING = FEATURE_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS___GET_STYLE__ECLASS = FEATURE_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS___CREATE_STYLE__ECLASS = FEATURE_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS___GET_ELEMENT = FEATURE_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS___GET_LOCAL_LABEL_CONFIGURATION = FEATURE_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Feature Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_ITEM_AXIS_OPERATION_COUNT = FEATURE_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectTreeItemAxisImpl <em>Object Tree Item Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectTreeItemAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getObjectTreeItemAxis()
	 * @generated
	 */
	int OBJECT_TREE_ITEM_AXIS = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS__EANNOTATIONS = OBJECT_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS__STYLES = OBJECT_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS__MANAGER = OBJECT_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS__ALIAS = OBJECT_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS__LOCAL_LABEL_CONFIGURATION = OBJECT_AXIS__LOCAL_LABEL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS__PARENT = OBJECT_AXIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS__EXPANDED = OBJECT_AXIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS__CHILDREN = OBJECT_AXIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS_FEATURE_COUNT = OBJECT_AXIS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS___GET_EANNOTATION__STRING = OBJECT_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS___GET_NAMED_STYLE__ECLASS_STRING = OBJECT_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS___GET_STYLE__ECLASS = OBJECT_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS___CREATE_STYLE__ECLASS = OBJECT_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS___GET_ELEMENT = OBJECT_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS___GET_LOCAL_LABEL_CONFIGURATION = OBJECT_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Object Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_TREE_ITEM_AXIS_OPERATION_COUNT = OBJECT_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureIdAxisImpl <em>Feature Id Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureIdAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getFeatureIdAxis()
	 * @generated
	 */
	int FEATURE_ID_AXIS = 10;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS__EANNOTATIONS = ID_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS__STYLES = ID_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS__MANAGER = ID_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS__ALIAS = ID_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS__ELEMENT = ID_AXIS__ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS__LOCAL_LABEL_CONFIGURATION = ID_AXIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Id Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS_FEATURE_COUNT = ID_AXIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS___GET_EANNOTATION__STRING = ID_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS___GET_NAMED_STYLE__ECLASS_STRING = ID_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS___GET_STYLE__ECLASS = ID_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS___CREATE_STYLE__ECLASS = ID_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS___GET_ELEMENT = ID_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS___GET_LOCAL_LABEL_CONFIGURATION = ID_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Feature Id Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_AXIS_OPERATION_COUNT = ID_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureIdTreeItemAxisImpl <em>Feature Id Tree Item Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureIdTreeItemAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getFeatureIdTreeItemAxis()
	 * @generated
	 */
	int FEATURE_ID_TREE_ITEM_AXIS = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS__EANNOTATIONS = FEATURE_ID_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS__STYLES = FEATURE_ID_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS__MANAGER = FEATURE_ID_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS__ALIAS = FEATURE_ID_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS__ELEMENT = FEATURE_ID_AXIS__ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS__LOCAL_LABEL_CONFIGURATION = FEATURE_ID_AXIS__LOCAL_LABEL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS__PARENT = FEATURE_ID_AXIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS__EXPANDED = FEATURE_ID_AXIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS__CHILDREN = FEATURE_ID_AXIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Id Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS_FEATURE_COUNT = FEATURE_ID_AXIS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS___GET_EANNOTATION__STRING = FEATURE_ID_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS___GET_NAMED_STYLE__ECLASS_STRING = FEATURE_ID_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS___GET_STYLE__ECLASS = FEATURE_ID_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS___CREATE_STYLE__ECLASS = FEATURE_ID_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS___GET_ELEMENT = FEATURE_ID_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS___GET_LOCAL_LABEL_CONFIGURATION = FEATURE_ID_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Feature Id Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TREE_ITEM_AXIS_OPERATION_COUNT = FEATURE_ID_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EStructuralFeatureAxisImpl <em>EStructural Feature Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EStructuralFeatureAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getEStructuralFeatureAxis()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_AXIS = 12;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS__EANNOTATIONS = FEATURE_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS__STYLES = FEATURE_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS__MANAGER = FEATURE_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS__ALIAS = FEATURE_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS__LOCAL_LABEL_CONFIGURATION = FEATURE_AXIS__LOCAL_LABEL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS__ELEMENT = FEATURE_AXIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EStructural Feature Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS_FEATURE_COUNT = FEATURE_AXIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS___GET_EANNOTATION__STRING = FEATURE_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS___GET_NAMED_STYLE__ECLASS_STRING = FEATURE_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS___GET_STYLE__ECLASS = FEATURE_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS___CREATE_STYLE__ECLASS = FEATURE_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS___GET_ELEMENT = FEATURE_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS___GET_LOCAL_LABEL_CONFIGURATION = FEATURE_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>EStructural Feature Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_AXIS_OPERATION_COUNT = FEATURE_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EStructuralFeatureTreeItemAxisImpl <em>EStructural Feature Tree Item Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EStructuralFeatureTreeItemAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getEStructuralFeatureTreeItemAxis()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS = 13;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS__EANNOTATIONS = ESTRUCTURAL_FEATURE_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS__STYLES = ESTRUCTURAL_FEATURE_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS__MANAGER = ESTRUCTURAL_FEATURE_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS__ALIAS = ESTRUCTURAL_FEATURE_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS__LOCAL_LABEL_CONFIGURATION = ESTRUCTURAL_FEATURE_AXIS__LOCAL_LABEL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS__ELEMENT = ESTRUCTURAL_FEATURE_AXIS__ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS__PARENT = ESTRUCTURAL_FEATURE_AXIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS__EXPANDED = ESTRUCTURAL_FEATURE_AXIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS__CHILDREN = ESTRUCTURAL_FEATURE_AXIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EStructural Feature Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS_FEATURE_COUNT = ESTRUCTURAL_FEATURE_AXIS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS___GET_EANNOTATION__STRING = ESTRUCTURAL_FEATURE_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS___GET_NAMED_STYLE__ECLASS_STRING = ESTRUCTURAL_FEATURE_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS___GET_STYLE__ECLASS = ESTRUCTURAL_FEATURE_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS___CREATE_STYLE__ECLASS = ESTRUCTURAL_FEATURE_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS___GET_ELEMENT = ESTRUCTURAL_FEATURE_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS___GET_LOCAL_LABEL_CONFIGURATION = ESTRUCTURAL_FEATURE_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>EStructural Feature Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS_OPERATION_COUNT = ESTRUCTURAL_FEATURE_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdAxisImpl <em>Object Id Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getObjectIdAxis()
	 * @generated
	 */
	int OBJECT_ID_AXIS = 14;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS__EANNOTATIONS = ID_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS__STYLES = ID_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS__MANAGER = ID_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS__ALIAS = ID_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS__ELEMENT = ID_AXIS__ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS__LOCAL_LABEL_CONFIGURATION = ID_AXIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Id Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS_FEATURE_COUNT = ID_AXIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS___GET_EANNOTATION__STRING = ID_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS___GET_NAMED_STYLE__ECLASS_STRING = ID_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS___GET_STYLE__ECLASS = ID_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS___CREATE_STYLE__ECLASS = ID_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS___GET_ELEMENT = ID_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS___GET_LOCAL_LABEL_CONFIGURATION = ID_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Object Id Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_AXIS_OPERATION_COUNT = ID_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdTreeItemAxisImpl <em>Object Id Tree Item Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdTreeItemAxisImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getObjectIdTreeItemAxis()
	 * @generated
	 */
	int OBJECT_ID_TREE_ITEM_AXIS = 15;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS__EANNOTATIONS = OBJECT_ID_AXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS__STYLES = OBJECT_ID_AXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS__MANAGER = OBJECT_ID_AXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS__ALIAS = OBJECT_ID_AXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS__ELEMENT = OBJECT_ID_AXIS__ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS__LOCAL_LABEL_CONFIGURATION = OBJECT_ID_AXIS__LOCAL_LABEL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS__PARENT = OBJECT_ID_AXIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS__EXPANDED = OBJECT_ID_AXIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS__CHILDREN = OBJECT_ID_AXIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Id Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS_FEATURE_COUNT = OBJECT_ID_AXIS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS___GET_EANNOTATION__STRING = OBJECT_ID_AXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS___GET_NAMED_STYLE__ECLASS_STRING = OBJECT_ID_AXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS___GET_STYLE__ECLASS = OBJECT_ID_AXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS___CREATE_STYLE__ECLASS = OBJECT_ID_AXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS___GET_ELEMENT = OBJECT_ID_AXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS___GET_LOCAL_LABEL_CONFIGURATION = OBJECT_ID_AXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Object Id Tree Item Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_ID_TREE_ITEM_AXIS_OPERATION_COUNT = OBJECT_ID_AXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.AxisGroupImpl <em>Axis Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.AxisGroupImpl
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getAxisGroup()
	 * @generated
	 */
	int AXIS_GROUP = 16;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP__EANNOTATIONS = IAXIS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP__STYLES = IAXIS__STYLES;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP__MANAGER = IAXIS__MANAGER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP__ALIAS = IAXIS__ALIAS;

	/**
	 * The feature id for the '<em><b>Grouped Axis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP__GROUPED_AXIS = IAXIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Axis Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP_FEATURE_COUNT = IAXIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP___GET_EANNOTATION__STRING = IAXIS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Named Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP___GET_NAMED_STYLE__ECLASS_STRING = IAXIS___GET_NAMED_STYLE__ECLASS_STRING;

	/**
	 * The operation id for the '<em>Get Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP___GET_STYLE__ECLASS = IAXIS___GET_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Create Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP___CREATE_STYLE__ECLASS = IAXIS___CREATE_STYLE__ECLASS;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP___GET_ELEMENT = IAXIS___GET_ELEMENT;

	/**
	 * The operation id for the '<em>Get Local Label Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP___GET_LOCAL_LABEL_CONFIGURATION = IAXIS___GET_LOCAL_LABEL_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Axis Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int AXIS_GROUP_OPERATION_COUNT = IAXIS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis <em>IAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>IAxis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis
	 * @generated
	 */
	EClass getIAxis();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis#getManager()
	 * @see #getIAxis()
	 * @generated
	 */
	EReference getIAxis_Manager();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis#getAlias()
	 * @see #getIAxis()
	 * @generated
	 */
	EAttribute getIAxis_Alias();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis#getElement() <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Element</em>' operation.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis#getElement()
	 * @generated
	 */
	EOperation getIAxis__GetElement();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis#getLocalLabelConfiguration() <em>Get Local Label Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Get Local Label Configuration</em>' operation.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis#getLocalLabelConfiguration()
	 * @generated
	 */
	EOperation getIAxis__GetLocalLabelConfiguration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis <em>ITree Item Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>ITree Item Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis
	 * @generated
	 */
	EClass getITreeItemAxis();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis#getParent()
	 * @see #getITreeItemAxis()
	 * @generated
	 */
	EReference getITreeItemAxis_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis#isExpanded <em>Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Expanded</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis#isExpanded()
	 * @see #getITreeItemAxis()
	 * @generated
	 */
	EAttribute getITreeItemAxis_Expanded();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis#getChildren()
	 * @see #getITreeItemAxis()
	 * @generated
	 */
	EReference getITreeItemAxis_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdAxis <em>Id Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Id Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdAxis
	 * @generated
	 */
	EClass getIdAxis();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdAxis#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdAxis#getElement()
	 * @see #getIdAxis()
	 * @generated
	 */
	EAttribute getIdAxis_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdTreeItemAxis <em>Id Tree Item Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Id Tree Item Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdTreeItemAxis
	 * @generated
	 */
	EClass getIdTreeItemAxis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectAxis <em>EObject Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EObject Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectAxis
	 * @generated
	 */
	EClass getEObjectAxis();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectAxis#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectAxis#getElement()
	 * @see #getEObjectAxis()
	 * @generated
	 */
	EReference getEObjectAxis_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectTreeItemAxis <em>EObject Tree Item Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EObject Tree Item Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectTreeItemAxis
	 * @generated
	 */
	EClass getEObjectTreeItemAxis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureAxis <em>Feature Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Feature Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureAxis
	 * @generated
	 */
	EClass getFeatureAxis();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureAxis#getLocalLabelConfiguration <em>Local Label Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Local Label Configuration</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureAxis#getLocalLabelConfiguration()
	 * @see #getFeatureAxis()
	 * @generated
	 */
	EReference getFeatureAxis_LocalLabelConfiguration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureTreeItemAxis <em>Feature Tree Item Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Feature Tree Item Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureTreeItemAxis
	 * @generated
	 */
	EClass getFeatureTreeItemAxis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectAxis <em>Object Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Object Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectAxis
	 * @generated
	 */
	EClass getObjectAxis();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectAxis#getLocalLabelConfiguration <em>Local Label Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Local Label Configuration</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectAxis#getLocalLabelConfiguration()
	 * @see #getObjectAxis()
	 * @generated
	 */
	EReference getObjectAxis_LocalLabelConfiguration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectTreeItemAxis <em>Object Tree Item Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Object Tree Item Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectTreeItemAxis
	 * @generated
	 */
	EClass getObjectTreeItemAxis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureIdAxis <em>Feature Id Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Feature Id Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureIdAxis
	 * @generated
	 */
	EClass getFeatureIdAxis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureIdTreeItemAxis <em>Feature Id Tree Item Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Feature Id Tree Item Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureIdTreeItemAxis
	 * @generated
	 */
	EClass getFeatureIdTreeItemAxis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureAxis <em>EStructural Feature Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EStructural Feature Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureAxis
	 * @generated
	 */
	EClass getEStructuralFeatureAxis();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureAxis#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureAxis#getElement()
	 * @see #getEStructuralFeatureAxis()
	 * @generated
	 */
	EReference getEStructuralFeatureAxis_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureTreeItemAxis <em>EStructural Feature Tree Item Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EStructural Feature Tree Item Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureTreeItemAxis
	 * @generated
	 */
	EClass getEStructuralFeatureTreeItemAxis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectIdAxis <em>Object Id Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Object Id Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectIdAxis
	 * @generated
	 */
	EClass getObjectIdAxis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectIdTreeItemAxis <em>Object Id Tree Item Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Object Id Tree Item Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectIdTreeItemAxis
	 * @generated
	 */
	EClass getObjectIdTreeItemAxis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.AxisGroup <em>Axis Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Axis Group</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.AxisGroup
	 * @generated
	 */
	EClass getAxisGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.AxisGroup#getGroupedAxis <em>Grouped Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Grouped Axis</em>'.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.AxisGroup#getGroupedAxis()
	 * @see #getAxisGroup()
	 * @generated
	 */
	EReference getAxisGroup_GroupedAxis();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NattableaxisFactory getNattableaxisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis <em>IAxis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getIAxis()
		 * @generated
		 */
		EClass IAXIS = eINSTANCE.getIAxis();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference IAXIS__MANAGER = eINSTANCE.getIAxis_Manager();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IAXIS__ALIAS = eINSTANCE.getIAxis_Alias();

		/**
		 * The meta object literal for the '<em><b>Get Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation IAXIS___GET_ELEMENT = eINSTANCE.getIAxis__GetElement();

		/**
		 * The meta object literal for the '<em><b>Get Local Label Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation IAXIS___GET_LOCAL_LABEL_CONFIGURATION = eINSTANCE.getIAxis__GetLocalLabelConfiguration();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis <em>ITree Item Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getITreeItemAxis()
		 * @generated
		 */
		EClass ITREE_ITEM_AXIS = eINSTANCE.getITreeItemAxis();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ITREE_ITEM_AXIS__PARENT = eINSTANCE.getITreeItemAxis_Parent();

		/**
		 * The meta object literal for the '<em><b>Expanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ITREE_ITEM_AXIS__EXPANDED = eINSTANCE.getITreeItemAxis_Expanded();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ITREE_ITEM_AXIS__CHILDREN = eINSTANCE.getITreeItemAxis_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.IdAxisImpl <em>Id Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.IdAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getIdAxis()
		 * @generated
		 */
		EClass ID_AXIS = eINSTANCE.getIdAxis();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute ID_AXIS__ELEMENT = eINSTANCE.getIdAxis_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.IdTreeItemAxisImpl <em>Id Tree Item Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.IdTreeItemAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getIdTreeItemAxis()
		 * @generated
		 */
		EClass ID_TREE_ITEM_AXIS = eINSTANCE.getIdTreeItemAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EObjectAxisImpl <em>EObject Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EObjectAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getEObjectAxis()
		 * @generated
		 */
		EClass EOBJECT_AXIS = eINSTANCE.getEObjectAxis();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EOBJECT_AXIS__ELEMENT = eINSTANCE.getEObjectAxis_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EObjectTreeItemAxisImpl <em>EObject Tree Item Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EObjectTreeItemAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getEObjectTreeItemAxis()
		 * @generated
		 */
		EClass EOBJECT_TREE_ITEM_AXIS = eINSTANCE.getEObjectTreeItemAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureAxisImpl <em>Feature Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getFeatureAxis()
		 * @generated
		 */
		EClass FEATURE_AXIS = eINSTANCE.getFeatureAxis();

		/**
		 * The meta object literal for the '<em><b>Local Label Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FEATURE_AXIS__LOCAL_LABEL_CONFIGURATION = eINSTANCE.getFeatureAxis_LocalLabelConfiguration();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureTreeItemAxisImpl <em>Feature Tree Item Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureTreeItemAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getFeatureTreeItemAxis()
		 * @generated
		 */
		EClass FEATURE_TREE_ITEM_AXIS = eINSTANCE.getFeatureTreeItemAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectAxisImpl <em>Object Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getObjectAxis()
		 * @generated
		 */
		EClass OBJECT_AXIS = eINSTANCE.getObjectAxis();

		/**
		 * The meta object literal for the '<em><b>Local Label Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference OBJECT_AXIS__LOCAL_LABEL_CONFIGURATION = eINSTANCE.getObjectAxis_LocalLabelConfiguration();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectTreeItemAxisImpl <em>Object Tree Item Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectTreeItemAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getObjectTreeItemAxis()
		 * @generated
		 */
		EClass OBJECT_TREE_ITEM_AXIS = eINSTANCE.getObjectTreeItemAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureIdAxisImpl <em>Feature Id Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureIdAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getFeatureIdAxis()
		 * @generated
		 */
		EClass FEATURE_ID_AXIS = eINSTANCE.getFeatureIdAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureIdTreeItemAxisImpl <em>Feature Id Tree Item Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.FeatureIdTreeItemAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getFeatureIdTreeItemAxis()
		 * @generated
		 */
		EClass FEATURE_ID_TREE_ITEM_AXIS = eINSTANCE.getFeatureIdTreeItemAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EStructuralFeatureAxisImpl <em>EStructural Feature Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EStructuralFeatureAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getEStructuralFeatureAxis()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE_AXIS = eINSTANCE.getEStructuralFeatureAxis();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE_AXIS__ELEMENT = eINSTANCE.getEStructuralFeatureAxis_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EStructuralFeatureTreeItemAxisImpl <em>EStructural Feature Tree Item Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.EStructuralFeatureTreeItemAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getEStructuralFeatureTreeItemAxis()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS = eINSTANCE.getEStructuralFeatureTreeItemAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdAxisImpl <em>Object Id Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getObjectIdAxis()
		 * @generated
		 */
		EClass OBJECT_ID_AXIS = eINSTANCE.getObjectIdAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdTreeItemAxisImpl <em>Object Id Tree Item Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.ObjectIdTreeItemAxisImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getObjectIdTreeItemAxis()
		 * @generated
		 */
		EClass OBJECT_ID_TREE_ITEM_AXIS = eINSTANCE.getObjectIdTreeItemAxis();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.AxisGroupImpl <em>Axis Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.AxisGroupImpl
		 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl#getAxisGroup()
		 * @generated
		 */
		EClass AXIS_GROUP = eINSTANCE.getAxisGroup();

		/**
		 * The meta object literal for the '<em><b>Grouped Axis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference AXIS_GROUP__GROUPED_AXIS = eINSTANCE.getAxisGroup_GroupedAxis();

	}

} // NattableaxisPackage
