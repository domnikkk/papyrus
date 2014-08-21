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
package org.eclipse.papyrus.umldi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.dd.di.DIPackage;

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
 * @see org.eclipse.papyrus.umldi.UMLDIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface UMLDIPackage extends EPackage {

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "umldi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/UML/20131001/UMLDI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "umldi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	UMLDIPackage eINSTANCE = org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl <em>Uml Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlDiagramElement()
	 * @generated
	 */
	int UML_DIAGRAM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__MODEL_ELEMENT = DIPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__LOCAL_STYLE = DIPackage.DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__SHARED_STYLE = DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__TARGET_EDGE = DIPackage.DIAGRAM_ELEMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__SOURCE_EDGE = DIPackage.DIAGRAM_ELEMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Uml Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT_FEATURE_COUNT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Uml Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT_OPERATION_COUNT = DIPackage.DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl <em>Uml Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.umldi.impl.UmlDiagramImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlDiagram()
	 * @generated
	 */
	int UML_DIAGRAM = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlStyleImpl <em>Uml Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.umldi.impl.UmlStyleImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlStyle()
	 * @generated
	 */
	int UML_STYLE = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlEdgeImpl <em>Uml Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.umldi.impl.UmlEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlEdge()
	 * @generated
	 */
	int UML_EDGE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlShapeImpl <em>Uml Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.umldi.impl.UmlShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlShape()
	 * @generated
	 */
	int UML_SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__OWNING_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__OWNED_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__LOCAL_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SHARED_STYLE = UML_DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__TARGET_EDGE = UML_DIAGRAM_ELEMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SOURCE_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__UML_MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SHARED_UML_STYLE = UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__LOCAL_UML_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__TARGET_UML_EDGE = UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SOURCE_UML_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__BOUNDS = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_FEATURE_COUNT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uml Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_OPERATION_COUNT = UML_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__MODEL_ELEMENT = UML_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__OWNING_DIAGRAM_ELEMENT = UML_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__OWNED_DIAGRAM_ELEMENT = UML_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__LOCAL_STYLE = UML_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SHARED_STYLE = UML_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__TARGET_EDGE = UML_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SOURCE_EDGE = UML_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__UML_MODEL_ELEMENT = UML_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SHARED_UML_STYLE = UML_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__LOCAL_UML_STYLE = UML_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__OWNING_UML_DIAGRAM_ELEMENT = UML_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT = UML_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__TARGET_UML_EDGE = UML_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SOURCE_UML_EDGE = UML_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__BOUNDS = UML_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__NAME = UML_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__DOCUMENTATION = UML_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__RESOLUTION = UML_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Uml Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_FEATURE_COUNT = UML_SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Uml Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_OPERATION_COUNT = UML_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_STYLE__FONT_NAME = DIPackage.STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_STYLE__FONT_SIZE = DIPackage.STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uml Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_STYLE_FEATURE_COUNT = DIPackage.STYLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Fontsize Positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_STYLE___FONTSIZE_POSITIVE__DIAGNOSTICCHAIN_MAP = DIPackage.STYLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uml Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_STYLE_OPERATION_COUNT = DIPackage.STYLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__OWNING_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__OWNED_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__LOCAL_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SHARED_STYLE = UML_DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__TARGET_EDGE = UML_DIAGRAM_ELEMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SOURCE_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__UML_MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SHARED_UML_STYLE = UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__LOCAL_UML_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__OWNING_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__OWNED_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__TARGET_UML_EDGE = UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SOURCE_UML_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SOURCE_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__WAYPOINT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__TARGET_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Uml Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE_FEATURE_COUNT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Uml Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_EDGE_OPERATION_COUNT = UML_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlCompartmentImpl <em>Uml Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.umldi.impl.UmlCompartmentImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlCompartment()
	 * @generated
	 */
	int UML_COMPARTMENT = 5;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__MODEL_ELEMENT = UML_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__OWNING_DIAGRAM_ELEMENT = UML_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__OWNED_DIAGRAM_ELEMENT = UML_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__LOCAL_STYLE = UML_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__SHARED_STYLE = UML_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__TARGET_EDGE = UML_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__SOURCE_EDGE = UML_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__UML_MODEL_ELEMENT = UML_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__SHARED_UML_STYLE = UML_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__LOCAL_UML_STYLE = UML_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT = UML_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT = UML_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__TARGET_UML_EDGE = UML_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__SOURCE_UML_EDGE = UML_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__BOUNDS = UML_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__KIND = UML_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT_FEATURE_COUNT = UML_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uml Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT_OPERATION_COUNT = UML_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlLabelImpl <em>Uml Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.umldi.impl.UmlLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlLabel()
	 * @generated
	 */
	int UML_LABEL = 6;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__MODEL_ELEMENT = UML_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__OWNING_DIAGRAM_ELEMENT = UML_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__OWNED_DIAGRAM_ELEMENT = UML_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__LOCAL_STYLE = UML_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__SHARED_STYLE = UML_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__TARGET_EDGE = UML_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__SOURCE_EDGE = UML_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__UML_MODEL_ELEMENT = UML_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__SHARED_UML_STYLE = UML_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__LOCAL_UML_STYLE = UML_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__OWNING_UML_DIAGRAM_ELEMENT = UML_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__OWNED_UML_DIAGRAM_ELEMENT = UML_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__TARGET_UML_EDGE = UML_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__SOURCE_UML_EDGE = UML_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__BOUNDS = UML_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__KIND = UML_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL_FEATURE_COUNT = UML_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uml Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_LABEL_OPERATION_COUNT = UML_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.UmlCompartmentKind <em>Uml Compartment Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.umldi.UmlCompartmentKind
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlCompartmentKind()
	 * @generated
	 */
	int UML_COMPARTMENT_KIND = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.UmlLabelKind <em>Uml Label Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.umldi.UmlLabelKind
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlLabelKind()
	 * @generated
	 */
	int UML_LABEL_KIND = 8;

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.UmlDiagram <em>Uml Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Uml Diagram</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagram
	 * @generated
	 */
	EClass getUmlDiagram();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.UmlDiagramElement <em>Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Uml Diagram Element</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement
	 * @generated
	 */
	EClass getUmlDiagramElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getUmlModelElement
	 * <em>Uml Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Uml Model Element</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getUmlModelElement()
	 * @see #getUmlDiagramElement()
	 * @generated
	 */
	EReference getUmlDiagramElement_UmlModelElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getSharedUmlStyle <em>Shared Uml Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Shared Uml Style</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getSharedUmlStyle()
	 * @see #getUmlDiagramElement()
	 * @generated
	 */
	EReference getUmlDiagramElement_SharedUmlStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getLocalUmlStyle
	 * <em>Local Uml Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Local Uml Style</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getLocalUmlStyle()
	 * @see #getUmlDiagramElement()
	 * @generated
	 */
	EReference getUmlDiagramElement_LocalUmlStyle();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement
	 * <em>Owning Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the container reference '<em>Owning Uml Diagram Element</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement()
	 * @see #getUmlDiagramElement()
	 * @generated
	 */
	EReference getUmlDiagramElement_OwningUmlDiagramElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement
	 * <em>Owned Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Owned Uml Diagram Element</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement()
	 * @see #getUmlDiagramElement()
	 * @generated
	 */
	EReference getUmlDiagramElement_OwnedUmlDiagramElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getTargetUmlEdge <em>Target Uml Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Target Uml Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getTargetUmlEdge()
	 * @see #getUmlDiagramElement()
	 * @generated
	 */
	EReference getUmlDiagramElement_TargetUmlEdge();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getSourceUmlEdge <em>Source Uml Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Source Uml Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getSourceUmlEdge()
	 * @see #getUmlDiagramElement()
	 * @generated
	 */
	EReference getUmlDiagramElement_SourceUmlEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.UmlStyle <em>Uml Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Uml Style</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlStyle
	 * @generated
	 */
	EClass getUmlStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umldi.UmlStyle#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlStyle#getFontName()
	 * @see #getUmlStyle()
	 * @generated
	 */
	EAttribute getUmlStyle_FontName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umldi.UmlStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlStyle#getFontSize()
	 * @see #getUmlStyle()
	 * @generated
	 */
	EAttribute getUmlStyle_FontSize();

	/**
	 * Returns the meta object for the ' {@link org.eclipse.papyrus.umldi.UmlStyle#fontsizePositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Fontsize Positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the '<em>Fontsize Positive</em>' operation.
	 * @see org.eclipse.papyrus.umldi.UmlStyle#fontsizePositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUmlStyle__FontsizePositive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.UmlEdge <em>Uml Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Uml Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlEdge
	 * @generated
	 */
	EClass getUmlEdge();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umldi.UmlEdge#getSourceUmlDiagramElement
	 * <em>Source Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Source Uml Diagram Element</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlEdge#getSourceUmlDiagramElement()
	 * @see #getUmlEdge()
	 * @generated
	 */
	EReference getUmlEdge_SourceUmlDiagramElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umldi.UmlEdge#getTargetUmlDiagramElement
	 * <em>Target Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Target Uml Diagram Element</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlEdge#getTargetUmlDiagramElement()
	 * @see #getUmlEdge()
	 * @generated
	 */
	EReference getUmlEdge_TargetUmlDiagramElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.UmlCompartment <em>Uml Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Uml Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlCompartment
	 * @generated
	 */
	EClass getUmlCompartment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umldi.UmlCompartment#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlCompartment#getKind()
	 * @see #getUmlCompartment()
	 * @generated
	 */
	EAttribute getUmlCompartment_Kind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.UmlLabel <em>Uml Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Uml Label</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlLabel
	 * @generated
	 */
	EClass getUmlLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umldi.UmlLabel#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlLabel#getKind()
	 * @see #getUmlLabel()
	 * @generated
	 */
	EAttribute getUmlLabel_Kind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.umldi.UmlCompartmentKind <em>Uml Compartment Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Uml Compartment Kind</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlCompartmentKind
	 * @generated
	 */
	EEnum getUmlCompartmentKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.umldi.UmlLabelKind <em>Uml Label Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Uml Label Kind</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlLabelKind
	 * @generated
	 */
	EEnum getUmlLabelKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.UmlShape <em>Uml Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Uml Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlShape
	 * @generated
	 */
	EClass getUmlShape();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMLDIFactory getUMLDIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.UmlDiagramImpl <em>Uml Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.umldi.impl.UmlDiagramImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlDiagram()
		 * @generated
		 */
		EClass UML_DIAGRAM = eINSTANCE.getUmlDiagram();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl <em>Uml Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.umldi.impl.UmlDiagramElementImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlDiagramElement()
		 * @generated
		 */
		EClass UML_DIAGRAM_ELEMENT = eINSTANCE.getUmlDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Uml Model Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT = eINSTANCE.getUmlDiagramElement_UmlModelElement();

		/**
		 * The meta object literal for the '<em><b>Shared Uml Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE = eINSTANCE.getUmlDiagramElement_SharedUmlStyle();

		/**
		 * The meta object literal for the '<em><b>Local Uml Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE = eINSTANCE.getUmlDiagramElement_LocalUmlStyle();

		/**
		 * The meta object literal for the '<em><b>Owning Uml Diagram Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT = eINSTANCE.getUmlDiagramElement_OwningUmlDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT = eINSTANCE.getUmlDiagramElement_OwnedUmlDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Target Uml Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE = eINSTANCE.getUmlDiagramElement_TargetUmlEdge();

		/**
		 * The meta object literal for the '<em><b>Source Uml Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE = eINSTANCE.getUmlDiagramElement_SourceUmlEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.UmlStyleImpl <em>Uml Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.umldi.impl.UmlStyleImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlStyle()
		 * @generated
		 */
		EClass UML_STYLE = eINSTANCE.getUmlStyle();

		/**
		 * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_STYLE__FONT_NAME = eINSTANCE.getUmlStyle_FontName();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_STYLE__FONT_SIZE = eINSTANCE.getUmlStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Fontsize Positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EOperation UML_STYLE___FONTSIZE_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUmlStyle__FontsizePositive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.UmlEdgeImpl <em>Uml Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.umldi.impl.UmlEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlEdge()
		 * @generated
		 */
		EClass UML_EDGE = eINSTANCE.getUmlEdge();

		/**
		 * The meta object literal for the '<em><b>Source Uml Diagram Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = eINSTANCE.getUmlEdge_SourceUmlDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Target Uml Diagram Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT = eINSTANCE.getUmlEdge_TargetUmlDiagramElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.UmlCompartmentImpl <em>Uml Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.umldi.impl.UmlCompartmentImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlCompartment()
		 * @generated
		 */
		EClass UML_COMPARTMENT = eINSTANCE.getUmlCompartment();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_COMPARTMENT__KIND = eINSTANCE.getUmlCompartment_Kind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.UmlLabelImpl <em>Uml Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.umldi.impl.UmlLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlLabel()
		 * @generated
		 */
		EClass UML_LABEL = eINSTANCE.getUmlLabel();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_LABEL__KIND = eINSTANCE.getUmlLabel_Kind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.UmlCompartmentKind <em>Uml Compartment Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.umldi.UmlCompartmentKind
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlCompartmentKind()
		 * @generated
		 */
		EEnum UML_COMPARTMENT_KIND = eINSTANCE.getUmlCompartmentKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.UmlLabelKind <em>Uml Label Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.umldi.UmlLabelKind
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlLabelKind()
		 * @generated
		 */
		EEnum UML_LABEL_KIND = eINSTANCE.getUmlLabelKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.UmlShapeImpl <em>Uml Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.umldi.impl.UmlShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlShape()
		 * @generated
		 */
		EClass UML_SHAPE = eINSTANCE.getUmlShape();
	}
} // UMLDIPackage
