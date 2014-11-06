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
	int UML_DIAGRAM_ELEMENT = 1;

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
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
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
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT = DIPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

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
	int UML_STYLE = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlEdgeImpl <em>Uml Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.UmlEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlEdge()
	 * @generated
	 */
	int UML_EDGE = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlShapeImpl <em>Uml Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.UmlShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlShape()
	 * @generated
	 */
	int UML_SHAPE = 10;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__OWNING_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__OWNED_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__LOCAL_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SHARED_STYLE = UML_DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__TARGET_EDGE = UML_DIAGRAM_ELEMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SOURCE_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__UML_MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SHARED_UML_STYLE = UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__LOCAL_UML_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__OWNING_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__TARGET_UML_EDGE = UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SOURCE_UML_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__BOUNDS = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__NAME = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__DOCUMENTATION = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__RESOLUTION = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Top Uml Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Uml Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_FEATURE_COUNT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Uml Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_OPERATION_COUNT = UML_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.TopUmlDiagramElementImpl <em>Top Uml Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.TopUmlDiagramElementImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getTopUmlDiagramElement()
	 * @generated
	 */
	int TOP_UML_DIAGRAM_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__LOCAL_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__SHARED_STYLE = UML_DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__TARGET_EDGE = UML_DIAGRAM_ELEMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__SOURCE_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE = UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE = UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Top Uml Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT_FEATURE_COUNT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Top Uml Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOP_UML_DIAGRAM_ELEMENT_OPERATION_COUNT = UML_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__MODEL_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__OWNING_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__OWNED_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__LOCAL_STYLE = TOP_UML_DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SHARED_STYLE = TOP_UML_DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__TARGET_EDGE = TOP_UML_DIAGRAM_ELEMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SOURCE_EDGE = TOP_UML_DIAGRAM_ELEMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__UML_MODEL_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SHARED_UML_STYLE = TOP_UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__LOCAL_UML_STYLE = TOP_UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__OWNED_UML_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__OWNING_UML_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__TARGET_UML_EDGE = TOP_UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SOURCE_UML_EDGE = TOP_UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__PACKAGE_COMPARTMENT = TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__UML_DIAGRAM = TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SOURCE_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__WAYPOINT = TOP_UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__TARGET_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Uml Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE_FEATURE_COUNT = TOP_UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Uml Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_EDGE_OPERATION_COUNT = TOP_UML_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlCompartmentImpl <em>Uml Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.UmlCompartmentImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlCompartment()
	 * @generated
	 */
	int UML_COMPARTMENT = 6;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__OWNING_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__OWNED_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__LOCAL_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__SHARED_STYLE = UML_DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__TARGET_EDGE = UML_DIAGRAM_ELEMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__SOURCE_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__UML_MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__SHARED_UML_STYLE = UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__LOCAL_UML_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__TARGET_UML_EDGE = UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__SOURCE_UML_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT__BOUNDS = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT_FEATURE_COUNT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uml Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_COMPARTMENT_OPERATION_COUNT = UML_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UmlLabelImpl <em>Uml Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.UmlLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUmlLabel()
	 * @generated
	 */
	int UML_LABEL = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ClassDiagramImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassDiagram()
	 * @generated
	 */
	int CLASS_DIAGRAM = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ClassifierShapeImpl <em>Classifier Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ClassifierShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassifierShape()
	 * @generated
	 */
	int CLASSIFIER_SHAPE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.PackageShapeImpl <em>Package Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.PackageShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPackageShape()
	 * @generated
	 */
	int PACKAGE_SHAPE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ConstraintShapeImpl <em>Constraint Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ConstraintShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getConstraintShape()
	 * @generated
	 */
	int CONSTRAINT_SHAPE = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.AttributeCompartmentImpl <em>Attribute Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.AttributeCompartmentImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAttributeCompartment()
	 * @generated
	 */
	int ATTRIBUTE_COMPARTMENT = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.OperationCompartmentImpl <em>Operation Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.OperationCompartmentImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getOperationCompartment()
	 * @generated
	 */
	int OPERATION_COMPARTMENT = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ReceptionCompartmentImpl <em>Reception Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ReceptionCompartmentImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getReceptionCompartment()
	 * @generated
	 */
	int RECEPTION_COMPARTMENT = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.LiteralCompartmentImpl <em>Literal Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.LiteralCompartmentImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getLiteralCompartment()
	 * @generated
	 */
	int LITERAL_COMPARTMENT = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.PackagedElementCompartmentImpl <em>Packaged Element Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.PackagedElementCompartmentImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPackagedElementCompartment()
	 * @generated
	 */
	int PACKAGED_ELEMENT_COMPARTMENT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.NameLabelImpl <em>Name Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.NameLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getNameLabel()
	 * @generated
	 */
	int NAME_LABEL = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.BodyLabelImpl <em>Body Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.BodyLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getBodyLabel()
	 * @generated
	 */
	int BODY_LABEL = 21;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__MODEL_ELEMENT = UML_COMPARTMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__OWNING_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__OWNED_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__LOCAL_STYLE = UML_COMPARTMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__SHARED_STYLE = UML_COMPARTMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__TARGET_EDGE = UML_COMPARTMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__SOURCE_EDGE = UML_COMPARTMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__UML_MODEL_ELEMENT = UML_COMPARTMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__SHARED_UML_STYLE = UML_COMPARTMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__LOCAL_UML_STYLE = UML_COMPARTMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__TARGET_UML_EDGE = UML_COMPARTMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__SOURCE_UML_EDGE = UML_COMPARTMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__BOUNDS = UML_COMPARTMENT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Package Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE = UML_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top Uml Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Packaged Element Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT_FEATURE_COUNT = UML_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Packaged Element Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_COMPARTMENT_OPERATION_COUNT = UML_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__MODEL_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__OWNING_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__OWNED_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__LOCAL_STYLE = TOP_UML_DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SHARED_STYLE = TOP_UML_DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__TARGET_EDGE = TOP_UML_DIAGRAM_ELEMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SOURCE_EDGE = TOP_UML_DIAGRAM_ELEMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__UML_MODEL_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SHARED_UML_STYLE = TOP_UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__LOCAL_UML_STYLE = TOP_UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = TOP_UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__TARGET_UML_EDGE = TOP_UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SOURCE_UML_EDGE = TOP_UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__PACKAGE_COMPARTMENT = TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__UML_DIAGRAM = TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__BOUNDS = TOP_UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_FEATURE_COUNT = TOP_UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uml Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_OPERATION_COUNT = TOP_UML_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.NamedShapeImpl <em>Named Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.NamedShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getNamedShape()
	 * @generated
	 */
	int NAMED_SHAPE = 9;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__MODEL_ELEMENT = UML_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__OWNING_DIAGRAM_ELEMENT = UML_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__OWNED_DIAGRAM_ELEMENT = UML_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__LOCAL_STYLE = UML_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__SHARED_STYLE = UML_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__TARGET_EDGE = UML_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__SOURCE_EDGE = UML_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__UML_MODEL_ELEMENT = UML_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__SHARED_UML_STYLE = UML_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__LOCAL_UML_STYLE = UML_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = UML_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = UML_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__TARGET_UML_EDGE = UML_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__SOURCE_UML_EDGE = UML_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__PACKAGE_COMPARTMENT = UML_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__UML_DIAGRAM = UML_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__BOUNDS = UML_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE__NAME_LABEL = UML_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE_FEATURE_COUNT = UML_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_SHAPE_OPERATION_COUNT = UML_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.TemplateableElementShapeImpl <em>Templateable Element Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.TemplateableElementShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getTemplateableElementShape()
	 * @generated
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE = 8;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__MODEL_ELEMENT = NAMED_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__OWNING_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__OWNED_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__LOCAL_STYLE = NAMED_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__SHARED_STYLE = NAMED_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__TARGET_EDGE = NAMED_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__SOURCE_EDGE = NAMED_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__UML_MODEL_ELEMENT = NAMED_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__SHARED_UML_STYLE = NAMED_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__LOCAL_UML_STYLE = NAMED_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__TARGET_UML_EDGE = NAMED_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__SOURCE_UML_EDGE = NAMED_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__PACKAGE_COMPARTMENT = NAMED_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__UML_DIAGRAM = NAMED_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__BOUNDS = NAMED_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__NAME_LABEL = NAMED_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = NAMED_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Templateable Element Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE_FEATURE_COUNT = NAMED_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Templateable Element Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_SHAPE_OPERATION_COUNT = NAMED_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__MODEL_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__OWNING_DIAGRAM_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__OWNED_DIAGRAM_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__LOCAL_STYLE = TEMPLATEABLE_ELEMENT_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__SHARED_STYLE = TEMPLATEABLE_ELEMENT_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__TARGET_EDGE = TEMPLATEABLE_ELEMENT_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__SOURCE_EDGE = TEMPLATEABLE_ELEMENT_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__UML_MODEL_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__SHARED_UML_STYLE = TEMPLATEABLE_ELEMENT_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__LOCAL_UML_STYLE = TEMPLATEABLE_ELEMENT_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__TARGET_UML_EDGE = TEMPLATEABLE_ELEMENT_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__SOURCE_UML_EDGE = TEMPLATEABLE_ELEMENT_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__PACKAGE_COMPARTMENT = TEMPLATEABLE_ELEMENT_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__UML_DIAGRAM = TEMPLATEABLE_ELEMENT_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__BOUNDS = TEMPLATEABLE_ELEMENT_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__NAME_LABEL = TEMPLATEABLE_ELEMENT_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Packaged Element Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT = TEMPLATEABLE_ELEMENT_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE_FEATURE_COUNT = TEMPLATEABLE_ELEMENT_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SHAPE_OPERATION_COUNT = TEMPLATEABLE_ELEMENT_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__OWNING_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__OWNED_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__LOCAL_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__SHARED_STYLE = UML_DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__TARGET_EDGE = UML_DIAGRAM_ELEMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__SOURCE_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__UML_MODEL_ELEMENT = UML_DIAGRAM_ELEMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__SHARED_UML_STYLE = UML_DIAGRAM_ELEMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__LOCAL_UML_STYLE = UML_DIAGRAM_ELEMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__OWNED_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__OWNING_UML_DIAGRAM_ELEMENT = UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__TARGET_UML_EDGE = UML_DIAGRAM_ELEMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__SOURCE_UML_EDGE = UML_DIAGRAM_ELEMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL__BOUNDS = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL_FEATURE_COUNT = UML_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uml Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_LABEL_OPERATION_COUNT = UML_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__MODEL_ELEMENT = UML_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__OWNING_DIAGRAM_ELEMENT = UML_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__OWNED_DIAGRAM_ELEMENT = UML_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__LOCAL_STYLE = UML_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__SHARED_STYLE = UML_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__TARGET_EDGE = UML_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__SOURCE_EDGE = UML_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__UML_MODEL_ELEMENT = UML_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__SHARED_UML_STYLE = UML_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__LOCAL_UML_STYLE = UML_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__OWNED_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__OWNING_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__TARGET_UML_EDGE = UML_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__SOURCE_UML_EDGE = UML_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__BOUNDS = UML_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Named Element Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__NAMED_ELEMENT_EDGE = UML_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Named Element Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL__NAMED_ELEMENT_SHAPE = UML_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Name Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL_FEATURE_COUNT = UML_LABEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Name Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_LABEL_OPERATION_COUNT = UML_LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.NamedEdgeImpl <em>Named Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.NamedEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getNamedEdge()
	 * @generated
	 */
	int NAMED_EDGE = 13;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__MODEL_ELEMENT = UML_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__OWNING_DIAGRAM_ELEMENT = UML_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__OWNED_DIAGRAM_ELEMENT = UML_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__LOCAL_STYLE = UML_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__SHARED_STYLE = UML_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__TARGET_EDGE = UML_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__SOURCE_EDGE = UML_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__UML_MODEL_ELEMENT = UML_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__SHARED_UML_STYLE = UML_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__LOCAL_UML_STYLE = UML_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT = UML_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT = UML_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__TARGET_UML_EDGE = UML_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__SOURCE_UML_EDGE = UML_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__PACKAGE_COMPARTMENT = UML_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__UML_DIAGRAM = UML_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT = UML_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__WAYPOINT = UML_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__TARGET_DIAGRAM_ELEMENT = UML_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT = UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE__NAME_LABEL = UML_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE_FEATURE_COUNT = UML_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_EDGE_OPERATION_COUNT = UML_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.StructureDiagramImpl <em>Structure Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.StructureDiagramImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getStructureDiagram()
	 * @generated
	 */
	int STRUCTURE_DIAGRAM = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.BodyShapeImpl <em>Body Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.BodyShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getBodyShape()
	 * @generated
	 */
	int BODY_SHAPE = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.InstanceSpecificationShapeImpl <em>Instance Specification Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.InstanceSpecificationShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInstanceSpecificationShape()
	 * @generated
	 */
	int INSTANCE_SPECIFICATION_SHAPE = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.SlotCompartmentImpl <em>Slot Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.SlotCompartmentImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getSlotCompartment()
	 * @generated
	 */
	int SLOT_COMPARTMENT = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ClassifierWithOperationsShapeImpl <em>Classifier With Operations Shape</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ClassifierWithOperationsShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassifierWithOperationsShape()
	 * @generated
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ClassShapeImpl <em>Class Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ClassShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassShape()
	 * @generated
	 */
	int CLASS_SHAPE = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ClassifierWithAttributesShapeImpl <em>Classifier With Attributes Shape</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ClassifierWithAttributesShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassifierWithAttributesShape()
	 * @generated
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.PropertyLabelImpl <em>Property Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.PropertyLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPropertyLabel()
	 * @generated
	 */
	int PROPERTY_LABEL = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.OperationLabelImpl <em>Operation Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.OperationLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getOperationLabel()
	 * @generated
	 */
	int OPERATION_LABEL = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ClassifierWithReceptionsShapeImpl <em>Classifier With Receptions Shape</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ClassifierWithReceptionsShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassifierWithReceptionsShape()
	 * @generated
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ReceptionLabelImpl <em>Reception Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ReceptionLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getReceptionLabel()
	 * @generated
	 */
	int RECEPTION_LABEL = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.InterfaceShapeImpl <em>Interface Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.InterfaceShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInterfaceShape()
	 * @generated
	 */
	int INTERFACE_SHAPE = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.DataTypeShapeImpl <em>Data Type Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.DataTypeShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getDataTypeShape()
	 * @generated
	 */
	int DATA_TYPE_SHAPE = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.PrimitiveTypeShapeImpl <em>Primitive Type Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.PrimitiveTypeShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPrimitiveTypeShape()
	 * @generated
	 */
	int PRIMITIVE_TYPE_SHAPE = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.EnumerationShapeImpl <em>Enumeration Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.EnumerationShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getEnumerationShape()
	 * @generated
	 */
	int ENUMERATION_SHAPE = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.LiteralLabelImpl <em>Literal Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.LiteralLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getLiteralLabel()
	 * @generated
	 */
	int LITERAL_LABEL = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.SignalShapeImpl <em>Signal Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.SignalShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getSignalShape()
	 * @generated
	 */
	int SIGNAL_SHAPE = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ModelShapeImpl <em>Model Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ModelShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getModelShape()
	 * @generated
	 */
	int MODEL_SHAPE = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ContainmentEdgeImpl <em>Containment Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ContainmentEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getContainmentEdge()
	 * @generated
	 */
	int CONTAINMENT_EDGE = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.GeneralizationEdgeImpl <em>Generalization Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.GeneralizationEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getGeneralizationEdge()
	 * @generated
	 */
	int GENERALIZATION_EDGE = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.AssociationEdgeImpl <em>Association Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.AssociationEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAssociationEdge()
	 * @generated
	 */
	int ASSOCIATION_EDGE = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.InstanceSpecificationEdgeImpl <em>Instance Specification Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.InstanceSpecificationEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInstanceSpecificationEdge()
	 * @generated
	 */
	int INSTANCE_SPECIFICATION_EDGE = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.SlotLabelImpl <em>Slot Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.SlotLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getSlotLabel()
	 * @generated
	 */
	int SLOT_LABEL = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.DependencyEdgeImpl <em>Dependency Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.DependencyEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getDependencyEdge()
	 * @generated
	 */
	int DEPENDENCY_EDGE = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.AbstractionEdgeImpl <em>Abstraction Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.AbstractionEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAbstractionEdge()
	 * @generated
	 */
	int ABSTRACTION_EDGE = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.RealizationEdgeImpl <em>Realization Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.RealizationEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getRealizationEdge()
	 * @generated
	 */
	int REALIZATION_EDGE = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.InterfaceRealizationEdgeImpl <em>Interface Realization Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.InterfaceRealizationEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInterfaceRealizationEdge()
	 * @generated
	 */
	int INTERFACE_REALIZATION_EDGE = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.UsageEdgeImpl <em>Usage Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.UsageEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUsageEdge()
	 * @generated
	 */
	int USAGE_EDGE = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ElementImportEdgeImpl <em>Element Import Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ElementImportEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getElementImportEdge()
	 * @generated
	 */
	int ELEMENT_IMPORT_EDGE = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.PackageImportEdgeImpl <em>Package Import Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.PackageImportEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPackageImportEdge()
	 * @generated
	 */
	int PACKAGE_IMPORT_EDGE = 59;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.PackageMergeEdgeImpl <em>Package Merge Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.PackageMergeEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPackageMergeEdge()
	 * @generated
	 */
	int PACKAGE_MERGE_EDGE = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.SubstitutionEdgeImpl <em>Substitution Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.SubstitutionEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getSubstitutionEdge()
	 * @generated
	 */
	int SUBSTITUTION_EDGE = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.InformationFlowEdgeImpl <em>Information Flow Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.InformationFlowEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInformationFlowEdge()
	 * @generated
	 */
	int INFORMATION_FLOW_EDGE = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.AssociationClassEdgeImpl <em>Association Class Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.AssociationClassEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAssociationClassEdge()
	 * @generated
	 */
	int ASSOCIATION_CLASS_EDGE = 64;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.GeneralizationSetEdgeImpl <em>Generalization Set Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.GeneralizationSetEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getGeneralizationSetEdge()
	 * @generated
	 */
	int GENERALIZATION_SET_EDGE = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.CommentShapeImpl <em>Comment Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.CommentShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getCommentShape()
	 * @generated
	 */
	int COMMENT_SHAPE = 65;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.AssociationClassShapeImpl <em>Association Class Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.AssociationClassShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAssociationClassShape()
	 * @generated
	 */
	int ASSOCIATION_CLASS_SHAPE = 67;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ComponentShapeImpl <em>Component Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ComponentShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getComponentShape()
	 * @generated
	 */
	int COMPONENT_SHAPE = 68;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.InformationItemShapeImpl <em>Information Item Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.InformationItemShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInformationItemShape()
	 * @generated
	 */
	int INFORMATION_ITEM_SHAPE = 69;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.RepresentationEdgeImpl <em>Representation Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.RepresentationEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getRepresentationEdge()
	 * @generated
	 */
	int REPRESENTATION_EDGE = 70;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.AssociationShapeImpl <em>Association Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.AssociationShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAssociationShape()
	 * @generated
	 */
	int ASSOCIATION_SHAPE = 71;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.DependencyShapeImpl <em>Dependency Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.DependencyShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getDependencyShape()
	 * @generated
	 */
	int DEPENDENCY_SHAPE = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.TimeObservationShapeImpl <em>Time Observation Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.TimeObservationShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getTimeObservationShape()
	 * @generated
	 */
	int TIME_OBSERVATION_SHAPE = 73;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.DurationObservationShapeImpl <em>Duration Observation Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.DurationObservationShapeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getDurationObservationShape()
	 * @generated
	 */
	int DURATION_OBSERVATION_SHAPE = 74;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.TemplateParameterCompartmentImpl <em>Template Parameter Compartment</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.TemplateParameterCompartmentImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getTemplateParameterCompartment()
	 * @generated
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.TemplateParameterLabelImpl <em>Template Parameter Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.TemplateParameterLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getTemplateParameterLabel()
	 * @generated
	 */
	int TEMPLATE_PARAMETER_LABEL = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.MultiplicityLabelImpl <em>Multiplicity Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.MultiplicityLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getMultiplicityLabel()
	 * @generated
	 */
	int MULTIPLICITY_LABEL = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.PropertyEdgeImpl <em>Property Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.PropertyEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPropertyEdge()
	 * @generated
	 */
	int PROPERTY_EDGE = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ModifierLabelImpl <em>Modifier Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ModifierLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getModifierLabel()
	 * @generated
	 */
	int MODIFIER_LABEL = 38;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__MODEL_ELEMENT = UML_COMPARTMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__OWNING_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__OWNED_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__LOCAL_STYLE = UML_COMPARTMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__SHARED_STYLE = UML_COMPARTMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__TARGET_EDGE = UML_COMPARTMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__SOURCE_EDGE = UML_COMPARTMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__UML_MODEL_ELEMENT = UML_COMPARTMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__SHARED_UML_STYLE = UML_COMPARTMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__LOCAL_UML_STYLE = UML_COMPARTMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__TARGET_UML_EDGE = UML_COMPARTMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__SOURCE_UML_EDGE = UML_COMPARTMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__BOUNDS = UML_COMPARTMENT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Template Parameter Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATE_PARAMETER_LABEL = UML_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Templateable Element Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATEABLE_ELEMENT_SHAPE = UML_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Parameter Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT_FEATURE_COUNT = UML_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Template Parameter Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_COMPARTMENT_OPERATION_COUNT = UML_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__MODEL_ELEMENT = NAME_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__OWNING_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__OWNED_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__LOCAL_STYLE = NAME_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__SHARED_STYLE = NAME_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__TARGET_EDGE = NAME_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__SOURCE_EDGE = NAME_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__UML_MODEL_ELEMENT = NAME_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__SHARED_UML_STYLE = NAME_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__LOCAL_UML_STYLE = NAME_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__OWNED_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__OWNING_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__TARGET_UML_EDGE = NAME_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__SOURCE_UML_EDGE = NAME_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__BOUNDS = NAME_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Named Element Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__NAMED_ELEMENT_EDGE = NAME_LABEL__NAMED_ELEMENT_EDGE;

	/**
	 * The feature id for the '<em><b>Named Element Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__NAMED_ELEMENT_SHAPE = NAME_LABEL__NAMED_ELEMENT_SHAPE;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT = NAME_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Parameter Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL_FEATURE_COUNT = NAME_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Parameter Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_LABEL_OPERATION_COUNT = NAME_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__MODEL_ELEMENT = UML_DIAGRAM__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__OWNING_DIAGRAM_ELEMENT = UML_DIAGRAM__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__OWNED_DIAGRAM_ELEMENT = UML_DIAGRAM__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__LOCAL_STYLE = UML_DIAGRAM__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__SHARED_STYLE = UML_DIAGRAM__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__TARGET_EDGE = UML_DIAGRAM__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__SOURCE_EDGE = UML_DIAGRAM__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__UML_MODEL_ELEMENT = UML_DIAGRAM__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__SHARED_UML_STYLE = UML_DIAGRAM__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__LOCAL_UML_STYLE = UML_DIAGRAM__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT = UML_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__OWNING_UML_DIAGRAM_ELEMENT = UML_DIAGRAM__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__TARGET_UML_EDGE = UML_DIAGRAM__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__SOURCE_UML_EDGE = UML_DIAGRAM__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__BOUNDS = UML_DIAGRAM__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__NAME = UML_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__DOCUMENTATION = UML_DIAGRAM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__RESOLUTION = UML_DIAGRAM__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Top Uml Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT = UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Structure Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM_FEATURE_COUNT = UML_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Structure Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DIAGRAM_OPERATION_COUNT = UML_DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__MODEL_ELEMENT = STRUCTURE_DIAGRAM__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__OWNING_DIAGRAM_ELEMENT = STRUCTURE_DIAGRAM__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__OWNED_DIAGRAM_ELEMENT = STRUCTURE_DIAGRAM__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__LOCAL_STYLE = STRUCTURE_DIAGRAM__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__SHARED_STYLE = STRUCTURE_DIAGRAM__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__TARGET_EDGE = STRUCTURE_DIAGRAM__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__SOURCE_EDGE = STRUCTURE_DIAGRAM__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__UML_MODEL_ELEMENT = STRUCTURE_DIAGRAM__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__SHARED_UML_STYLE = STRUCTURE_DIAGRAM__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__LOCAL_UML_STYLE = STRUCTURE_DIAGRAM__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT = STRUCTURE_DIAGRAM__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__OWNING_UML_DIAGRAM_ELEMENT = STRUCTURE_DIAGRAM__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__TARGET_UML_EDGE = STRUCTURE_DIAGRAM__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__SOURCE_UML_EDGE = STRUCTURE_DIAGRAM__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__BOUNDS = STRUCTURE_DIAGRAM__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__NAME = STRUCTURE_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__DOCUMENTATION = STRUCTURE_DIAGRAM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__RESOLUTION = STRUCTURE_DIAGRAM__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Top Uml Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT = STRUCTURE_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_FEATURE_COUNT = STRUCTURE_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_OPERATION_COUNT = STRUCTURE_DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__MODEL_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__OWNING_DIAGRAM_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__OWNED_DIAGRAM_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__LOCAL_STYLE = TEMPLATEABLE_ELEMENT_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__SHARED_STYLE = TEMPLATEABLE_ELEMENT_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__TARGET_EDGE = TEMPLATEABLE_ELEMENT_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__SOURCE_EDGE = TEMPLATEABLE_ELEMENT_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__UML_MODEL_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__SHARED_UML_STYLE = TEMPLATEABLE_ELEMENT_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__LOCAL_UML_STYLE = TEMPLATEABLE_ELEMENT_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = TEMPLATEABLE_ELEMENT_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__TARGET_UML_EDGE = TEMPLATEABLE_ELEMENT_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__SOURCE_UML_EDGE = TEMPLATEABLE_ELEMENT_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__PACKAGE_COMPARTMENT = TEMPLATEABLE_ELEMENT_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__UML_DIAGRAM = TEMPLATEABLE_ELEMENT_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__BOUNDS = TEMPLATEABLE_ELEMENT_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__NAME_LABEL = TEMPLATEABLE_ELEMENT_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE__IS_ICON = TEMPLATEABLE_ELEMENT_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE_FEATURE_COUNT = TEMPLATEABLE_ELEMENT_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classifier Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_SHAPE_OPERATION_COUNT = TEMPLATEABLE_ELEMENT_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__MODEL_ELEMENT = UML_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__OWNING_DIAGRAM_ELEMENT = UML_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__OWNED_DIAGRAM_ELEMENT = UML_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__LOCAL_STYLE = UML_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__SHARED_STYLE = UML_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__TARGET_EDGE = UML_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__SOURCE_EDGE = UML_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__UML_MODEL_ELEMENT = UML_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__SHARED_UML_STYLE = UML_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__LOCAL_UML_STYLE = UML_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = UML_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = UML_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__TARGET_UML_EDGE = UML_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__SOURCE_UML_EDGE = UML_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__PACKAGE_COMPARTMENT = UML_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__UML_DIAGRAM = UML_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__BOUNDS = UML_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Body Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE__BODY_LABEL = UML_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Body Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE_FEATURE_COUNT = UML_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Body Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_SHAPE_OPERATION_COUNT = UML_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__MODEL_ELEMENT = BODY_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__OWNING_DIAGRAM_ELEMENT = BODY_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__OWNED_DIAGRAM_ELEMENT = BODY_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__LOCAL_STYLE = BODY_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__SHARED_STYLE = BODY_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__TARGET_EDGE = BODY_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__SOURCE_EDGE = BODY_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__UML_MODEL_ELEMENT = BODY_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__SHARED_UML_STYLE = BODY_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__LOCAL_UML_STYLE = BODY_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = BODY_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = BODY_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__TARGET_UML_EDGE = BODY_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__SOURCE_UML_EDGE = BODY_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__PACKAGE_COMPARTMENT = BODY_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__UML_DIAGRAM = BODY_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__BOUNDS = BODY_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Body Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__BODY_LABEL = BODY_SHAPE__BODY_LABEL;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE__NAME_LABEL = BODY_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE_FEATURE_COUNT = BODY_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_SHAPE_OPERATION_COUNT = BODY_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__MODEL_ELEMENT = UML_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__OWNING_DIAGRAM_ELEMENT = UML_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__OWNED_DIAGRAM_ELEMENT = UML_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__LOCAL_STYLE = UML_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__SHARED_STYLE = UML_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__TARGET_EDGE = UML_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__SOURCE_EDGE = UML_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__UML_MODEL_ELEMENT = UML_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__SHARED_UML_STYLE = UML_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__LOCAL_UML_STYLE = UML_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__OWNED_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__OWNING_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__TARGET_UML_EDGE = UML_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__SOURCE_UML_EDGE = UML_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__BOUNDS = UML_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Constraint Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL__CONSTRAINT_SHAPE = UML_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Body Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL_FEATURE_COUNT = UML_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Body Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BODY_LABEL_OPERATION_COUNT = UML_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__MODEL_ELEMENT = UML_COMPARTMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__OWNING_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__OWNED_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__LOCAL_STYLE = UML_COMPARTMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__SHARED_STYLE = UML_COMPARTMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__TARGET_EDGE = UML_COMPARTMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__SOURCE_EDGE = UML_COMPARTMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__UML_MODEL_ELEMENT = UML_COMPARTMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__SHARED_UML_STYLE = UML_COMPARTMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__LOCAL_UML_STYLE = UML_COMPARTMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__TARGET_UML_EDGE = UML_COMPARTMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__SOURCE_UML_EDGE = UML_COMPARTMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__BOUNDS = UML_COMPARTMENT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Classifier With Attributes Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE = UML_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL = UML_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT_FEATURE_COUNT = UML_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_COMPARTMENT_OPERATION_COUNT = UML_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__MODEL_ELEMENT = CLASSIFIER_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__LOCAL_STYLE = CLASSIFIER_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SHARED_STYLE = CLASSIFIER_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__TARGET_EDGE = CLASSIFIER_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SOURCE_EDGE = CLASSIFIER_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__UML_MODEL_ELEMENT = CLASSIFIER_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SHARED_UML_STYLE = CLASSIFIER_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__LOCAL_UML_STYLE = CLASSIFIER_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__TARGET_UML_EDGE = CLASSIFIER_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SOURCE_UML_EDGE = CLASSIFIER_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__PACKAGE_COMPARTMENT = CLASSIFIER_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__UML_DIAGRAM = CLASSIFIER_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__BOUNDS = CLASSIFIER_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__NAME_LABEL = CLASSIFIER_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASSIFIER_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__IS_ICON = CLASSIFIER_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT = CLASSIFIER_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier With Attributes Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE_FEATURE_COUNT = CLASSIFIER_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classifier With Attributes Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_ATTRIBUTES_SHAPE_OPERATION_COUNT = CLASSIFIER_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__MODEL_ELEMENT = NAME_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__OWNING_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__OWNED_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__LOCAL_STYLE = NAME_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__SHARED_STYLE = NAME_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__TARGET_EDGE = NAME_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__SOURCE_EDGE = NAME_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__UML_MODEL_ELEMENT = NAME_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__SHARED_UML_STYLE = NAME_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__LOCAL_UML_STYLE = NAME_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__OWNED_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__OWNING_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__TARGET_UML_EDGE = NAME_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__SOURCE_UML_EDGE = NAME_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__BOUNDS = NAME_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Named Element Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__NAMED_ELEMENT_EDGE = NAME_LABEL__NAMED_ELEMENT_EDGE;

	/**
	 * The feature id for the '<em><b>Named Element Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__NAMED_ELEMENT_SHAPE = NAME_LABEL__NAMED_ELEMENT_SHAPE;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL__ATTRIBUTE_COMPARTMENT = NAME_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL_FEATURE_COUNT = NAME_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LABEL_OPERATION_COUNT = NAME_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__MODEL_ELEMENT = UML_COMPARTMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__OWNING_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__OWNED_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__LOCAL_STYLE = UML_COMPARTMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__SHARED_STYLE = UML_COMPARTMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__TARGET_EDGE = UML_COMPARTMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__SOURCE_EDGE = UML_COMPARTMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__UML_MODEL_ELEMENT = UML_COMPARTMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__SHARED_UML_STYLE = UML_COMPARTMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__LOCAL_UML_STYLE = UML_COMPARTMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__TARGET_UML_EDGE = UML_COMPARTMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__SOURCE_UML_EDGE = UML_COMPARTMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__BOUNDS = UML_COMPARTMENT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Classifier With Operations Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE = UML_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT__OPERATION_LABEL = UML_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT_FEATURE_COUNT = UML_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_COMPARTMENT_OPERATION_COUNT = UML_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__MODEL_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__LOCAL_STYLE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__SHARED_STYLE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__TARGET_EDGE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__SOURCE_EDGE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__UML_MODEL_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__SHARED_UML_STYLE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__LOCAL_UML_STYLE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__TARGET_UML_EDGE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__SOURCE_UML_EDGE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__PACKAGE_COMPARTMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__UML_DIAGRAM = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__BOUNDS = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__NAME_LABEL = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__IS_ICON = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__ATTRIBUTE_COMPARTMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Operation Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier With Operations Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE_FEATURE_COUNT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classifier With Operations Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_OPERATIONS_SHAPE_OPERATION_COUNT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__MODEL_ELEMENT = NAME_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__OWNING_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__OWNED_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__LOCAL_STYLE = NAME_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__SHARED_STYLE = NAME_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__TARGET_EDGE = NAME_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__SOURCE_EDGE = NAME_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__UML_MODEL_ELEMENT = NAME_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__SHARED_UML_STYLE = NAME_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__LOCAL_UML_STYLE = NAME_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__OWNED_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__OWNING_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__TARGET_UML_EDGE = NAME_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__SOURCE_UML_EDGE = NAME_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__BOUNDS = NAME_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Named Element Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__NAMED_ELEMENT_EDGE = NAME_LABEL__NAMED_ELEMENT_EDGE;

	/**
	 * The feature id for the '<em><b>Named Element Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__NAMED_ELEMENT_SHAPE = NAME_LABEL__NAMED_ELEMENT_SHAPE;

	/**
	 * The feature id for the '<em><b>Operation Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL__OPERATION_COMPARTMENT = NAME_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL_FEATURE_COUNT = NAME_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATION_LABEL_OPERATION_COUNT = NAME_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__MODEL_ELEMENT = UML_COMPARTMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__OWNING_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__OWNED_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__LOCAL_STYLE = UML_COMPARTMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__SHARED_STYLE = UML_COMPARTMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__TARGET_EDGE = UML_COMPARTMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__SOURCE_EDGE = UML_COMPARTMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__UML_MODEL_ELEMENT = UML_COMPARTMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__SHARED_UML_STYLE = UML_COMPARTMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__LOCAL_UML_STYLE = UML_COMPARTMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__TARGET_UML_EDGE = UML_COMPARTMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__SOURCE_UML_EDGE = UML_COMPARTMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__BOUNDS = UML_COMPARTMENT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Signal Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__SIGNAL_SHAPE = UML_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reception Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT__RECEPTION_LABEL = UML_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reception Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT_FEATURE_COUNT = UML_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reception Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_COMPARTMENT_OPERATION_COUNT = UML_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__MODEL_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__LOCAL_STYLE = CLASSIFIER_WITH_OPERATIONS_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__SHARED_STYLE = CLASSIFIER_WITH_OPERATIONS_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__TARGET_EDGE = CLASSIFIER_WITH_OPERATIONS_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__SOURCE_EDGE = CLASSIFIER_WITH_OPERATIONS_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__UML_MODEL_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__SHARED_UML_STYLE = CLASSIFIER_WITH_OPERATIONS_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__LOCAL_UML_STYLE = CLASSIFIER_WITH_OPERATIONS_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__TARGET_UML_EDGE = CLASSIFIER_WITH_OPERATIONS_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__SOURCE_UML_EDGE = CLASSIFIER_WITH_OPERATIONS_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__PACKAGE_COMPARTMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__UML_DIAGRAM = CLASSIFIER_WITH_OPERATIONS_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__BOUNDS = CLASSIFIER_WITH_OPERATIONS_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__NAME_LABEL = CLASSIFIER_WITH_OPERATIONS_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__IS_ICON = CLASSIFIER_WITH_OPERATIONS_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__ATTRIBUTE_COMPARTMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__ATTRIBUTE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Operation Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__OPERATION_COMPARTMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Reception Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier With Receptions Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE_FEATURE_COUNT = CLASSIFIER_WITH_OPERATIONS_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classifier With Receptions Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_WITH_RECEPTIONS_SHAPE_OPERATION_COUNT = CLASSIFIER_WITH_OPERATIONS_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__MODEL_ELEMENT = NAME_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__OWNING_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__OWNED_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__LOCAL_STYLE = NAME_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__SHARED_STYLE = NAME_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__TARGET_EDGE = NAME_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__SOURCE_EDGE = NAME_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__UML_MODEL_ELEMENT = NAME_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__SHARED_UML_STYLE = NAME_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__LOCAL_UML_STYLE = NAME_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__OWNED_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__OWNING_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__TARGET_UML_EDGE = NAME_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__SOURCE_UML_EDGE = NAME_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__BOUNDS = NAME_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Named Element Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__NAMED_ELEMENT_EDGE = NAME_LABEL__NAMED_ELEMENT_EDGE;

	/**
	 * The feature id for the '<em><b>Named Element Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__NAMED_ELEMENT_SHAPE = NAME_LABEL__NAMED_ELEMENT_SHAPE;

	/**
	 * The feature id for the '<em><b>Reception Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL__RECEPTION_COMPARTMENT = NAME_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reception Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL_FEATURE_COUNT = NAME_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reception Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECEPTION_LABEL_OPERATION_COUNT = NAME_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__MODEL_ELEMENT = UML_COMPARTMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__OWNING_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__OWNED_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__LOCAL_STYLE = UML_COMPARTMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__SHARED_STYLE = UML_COMPARTMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__TARGET_EDGE = UML_COMPARTMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__SOURCE_EDGE = UML_COMPARTMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__UML_MODEL_ELEMENT = UML_COMPARTMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__SHARED_UML_STYLE = UML_COMPARTMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__LOCAL_UML_STYLE = UML_COMPARTMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__TARGET_UML_EDGE = UML_COMPARTMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__SOURCE_UML_EDGE = UML_COMPARTMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__BOUNDS = UML_COMPARTMENT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Enumeration Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__ENUMERATION_SHAPE = UML_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT__LITERAL_LABEL = UML_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT_FEATURE_COUNT = UML_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Literal Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_COMPARTMENT_OPERATION_COUNT = UML_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__MODEL_ELEMENT = CLASSIFIER_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__LOCAL_STYLE = CLASSIFIER_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__SHARED_STYLE = CLASSIFIER_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__TARGET_EDGE = CLASSIFIER_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__SOURCE_EDGE = CLASSIFIER_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__UML_MODEL_ELEMENT = CLASSIFIER_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__SHARED_UML_STYLE = CLASSIFIER_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__LOCAL_UML_STYLE = CLASSIFIER_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__TARGET_UML_EDGE = CLASSIFIER_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__SOURCE_UML_EDGE = CLASSIFIER_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__PACKAGE_COMPARTMENT = CLASSIFIER_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__UML_DIAGRAM = CLASSIFIER_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__BOUNDS = CLASSIFIER_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__NAME_LABEL = CLASSIFIER_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASSIFIER_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__IS_ICON = CLASSIFIER_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Literal Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE__LITERAL_COMPARTMENT = CLASSIFIER_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE_FEATURE_COUNT = CLASSIFIER_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SHAPE_OPERATION_COUNT = CLASSIFIER_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__MODEL_ELEMENT = NAME_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__OWNING_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__OWNED_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__LOCAL_STYLE = NAME_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__SHARED_STYLE = NAME_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__TARGET_EDGE = NAME_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__SOURCE_EDGE = NAME_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__UML_MODEL_ELEMENT = NAME_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__SHARED_UML_STYLE = NAME_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__LOCAL_UML_STYLE = NAME_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__OWNED_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__OWNING_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__TARGET_UML_EDGE = NAME_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__SOURCE_UML_EDGE = NAME_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__BOUNDS = NAME_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Named Element Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__NAMED_ELEMENT_EDGE = NAME_LABEL__NAMED_ELEMENT_EDGE;

	/**
	 * The feature id for the '<em><b>Named Element Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__NAMED_ELEMENT_SHAPE = NAME_LABEL__NAMED_ELEMENT_SHAPE;

	/**
	 * The feature id for the '<em><b>Literal Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL__LITERAL_COMPARTMENT = NAME_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL_FEATURE_COUNT = NAME_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_LABEL_OPERATION_COUNT = NAME_LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.RoleLabelImpl <em>Role Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.RoleLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getRoleLabel()
	 * @generated
	 */
	int ROLE_LABEL = 34;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__MODEL_ELEMENT = NAME_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__OWNING_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__OWNED_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__LOCAL_STYLE = NAME_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__SHARED_STYLE = NAME_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__TARGET_EDGE = NAME_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__SOURCE_EDGE = NAME_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__UML_MODEL_ELEMENT = NAME_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__SHARED_UML_STYLE = NAME_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__LOCAL_UML_STYLE = NAME_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__OWNED_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__OWNING_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__TARGET_UML_EDGE = NAME_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__SOURCE_UML_EDGE = NAME_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__BOUNDS = NAME_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Named Element Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__NAMED_ELEMENT_EDGE = NAME_LABEL__NAMED_ELEMENT_EDGE;

	/**
	 * The feature id for the '<em><b>Named Element Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__NAMED_ELEMENT_SHAPE = NAME_LABEL__NAMED_ELEMENT_SHAPE;

	/**
	 * The feature id for the '<em><b>Association Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__ASSOCIATION_EDGE = NAME_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Specification Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE = NAME_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL_FEATURE_COUNT = NAME_LABEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Role Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROLE_LABEL_OPERATION_COUNT = NAME_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>End Multiplicity Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Modifier Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__END_MODIFIER_LABEL = NAMED_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Role Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE__END_ROLE_LABEL = NAMED_EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Association Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__MODEL_ELEMENT = UML_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__OWNING_DIAGRAM_ELEMENT = UML_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__OWNED_DIAGRAM_ELEMENT = UML_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__LOCAL_STYLE = UML_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__SHARED_STYLE = UML_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__TARGET_EDGE = UML_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__SOURCE_EDGE = UML_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__UML_MODEL_ELEMENT = UML_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__SHARED_UML_STYLE = UML_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__LOCAL_UML_STYLE = UML_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__OWNED_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__OWNING_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__TARGET_UML_EDGE = UML_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__SOURCE_UML_EDGE = UML_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__BOUNDS = UML_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Property Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__PROPERTY_EDGE = UML_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL__ASSOCIATION_EDGE = UML_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiplicity Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL_FEATURE_COUNT = UML_LABEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiplicity Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_LABEL_OPERATION_COUNT = UML_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Modifier Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__MODIFIER_LABEL = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE__MULTIPLICITY_LABEL = NAMED_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__MODEL_ELEMENT = UML_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__OWNING_DIAGRAM_ELEMENT = UML_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__OWNED_DIAGRAM_ELEMENT = UML_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__LOCAL_STYLE = UML_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__SHARED_STYLE = UML_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__TARGET_EDGE = UML_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__SOURCE_EDGE = UML_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__UML_MODEL_ELEMENT = UML_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__SHARED_UML_STYLE = UML_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__LOCAL_UML_STYLE = UML_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__OWNED_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__OWNING_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__TARGET_UML_EDGE = UML_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__SOURCE_UML_EDGE = UML_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__BOUNDS = UML_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Association Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__ASSOCIATION_EDGE = UML_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generalization Set Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__GENERALIZATION_SET_EDGE = UML_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL__PROPERTY_EDGE = UML_LABEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Modifier Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL_FEATURE_COUNT = UML_LABEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Modifier Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODIFIER_LABEL_OPERATION_COUNT = UML_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Power Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__POWER_LABEL = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifier Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE__MODIFIER_LABEL = NAMED_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization Set Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generalization Set Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.PowerLabelImpl <em>Power Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.PowerLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPowerLabel()
	 * @generated
	 */
	int POWER_LABEL = 40;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__MODEL_ELEMENT = UML_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__OWNING_DIAGRAM_ELEMENT = UML_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__OWNED_DIAGRAM_ELEMENT = UML_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__LOCAL_STYLE = UML_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__SHARED_STYLE = UML_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__TARGET_EDGE = UML_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__SOURCE_EDGE = UML_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__UML_MODEL_ELEMENT = UML_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__SHARED_UML_STYLE = UML_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__LOCAL_UML_STYLE = UML_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__OWNED_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__OWNING_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__TARGET_UML_EDGE = UML_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__SOURCE_UML_EDGE = UML_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__BOUNDS = UML_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Generalization Set Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL__GENERALIZATION_SET_EDGE = UML_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL_FEATURE_COUNT = UML_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Power Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POWER_LABEL_OPERATION_COUNT = UML_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>End Role Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE__END_ROLE_LABEL = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Specification Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Specification Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__MODEL_ELEMENT = NAMED_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__OWNING_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__OWNED_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__LOCAL_STYLE = NAMED_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__SHARED_STYLE = NAMED_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__TARGET_EDGE = NAMED_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__SOURCE_EDGE = NAMED_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__UML_MODEL_ELEMENT = NAMED_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__SHARED_UML_STYLE = NAMED_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__LOCAL_UML_STYLE = NAMED_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__TARGET_UML_EDGE = NAMED_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__SOURCE_UML_EDGE = NAMED_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__PACKAGE_COMPARTMENT = NAMED_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__UML_DIAGRAM = NAMED_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__BOUNDS = NAMED_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__NAME_LABEL = NAMED_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Slot Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT = NAMED_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Specification Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE_FEATURE_COUNT = NAMED_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Specification Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_SHAPE_OPERATION_COUNT = NAMED_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__MODEL_ELEMENT = UML_COMPARTMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__OWNING_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__OWNED_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__LOCAL_STYLE = UML_COMPARTMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__SHARED_STYLE = UML_COMPARTMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__TARGET_EDGE = UML_COMPARTMENT__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__SOURCE_EDGE = UML_COMPARTMENT__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__UML_MODEL_ELEMENT = UML_COMPARTMENT__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__SHARED_UML_STYLE = UML_COMPARTMENT__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__LOCAL_UML_STYLE = UML_COMPARTMENT__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT = UML_COMPARTMENT__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__TARGET_UML_EDGE = UML_COMPARTMENT__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__SOURCE_UML_EDGE = UML_COMPARTMENT__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__BOUNDS = UML_COMPARTMENT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Slot Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__SLOT_LABEL = UML_COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Specification Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE = UML_COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slot Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT_FEATURE_COUNT = UML_COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Slot Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_COMPARTMENT_OPERATION_COUNT = UML_COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__MODEL_ELEMENT = NAME_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__OWNING_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__OWNED_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__LOCAL_STYLE = NAME_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__SHARED_STYLE = NAME_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__TARGET_EDGE = NAME_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__SOURCE_EDGE = NAME_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__UML_MODEL_ELEMENT = NAME_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__SHARED_UML_STYLE = NAME_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__LOCAL_UML_STYLE = NAME_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__OWNED_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__OWNING_UML_DIAGRAM_ELEMENT = NAME_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__TARGET_UML_EDGE = NAME_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__SOURCE_UML_EDGE = NAME_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__BOUNDS = NAME_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Named Element Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__NAMED_ELEMENT_EDGE = NAME_LABEL__NAMED_ELEMENT_EDGE;

	/**
	 * The feature id for the '<em><b>Named Element Shape</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__NAMED_ELEMENT_SHAPE = NAME_LABEL__NAMED_ELEMENT_SHAPE;

	/**
	 * The feature id for the '<em><b>Slot Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL__SLOT_COMPARTMENT = NAME_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slot Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL_FEATURE_COUNT = NAME_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Slot Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SLOT_LABEL_OPERATION_COUNT = NAME_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__MODEL_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__LOCAL_STYLE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__SHARED_STYLE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__TARGET_EDGE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__SOURCE_EDGE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__UML_MODEL_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__SHARED_UML_STYLE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__LOCAL_UML_STYLE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__TARGET_UML_EDGE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__SOURCE_UML_EDGE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__PACKAGE_COMPARTMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__UML_DIAGRAM = CLASSIFIER_WITH_RECEPTIONS_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__BOUNDS = CLASSIFIER_WITH_RECEPTIONS_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__NAME_LABEL = CLASSIFIER_WITH_RECEPTIONS_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__IS_ICON = CLASSIFIER_WITH_RECEPTIONS_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__ATTRIBUTE_COMPARTMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__ATTRIBUTE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Operation Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__OPERATION_COMPARTMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__OPERATION_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Reception Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE__RECEPTION_COMPARTMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>Class Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE_FEATURE_COUNT = CLASSIFIER_WITH_RECEPTIONS_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_SHAPE_OPERATION_COUNT = CLASSIFIER_WITH_RECEPTIONS_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__MODEL_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__LOCAL_STYLE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__SHARED_STYLE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__TARGET_EDGE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__SOURCE_EDGE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__UML_MODEL_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__SHARED_UML_STYLE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__LOCAL_UML_STYLE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__TARGET_UML_EDGE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__SOURCE_UML_EDGE = CLASSIFIER_WITH_RECEPTIONS_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__PACKAGE_COMPARTMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__UML_DIAGRAM = CLASSIFIER_WITH_RECEPTIONS_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__BOUNDS = CLASSIFIER_WITH_RECEPTIONS_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__NAME_LABEL = CLASSIFIER_WITH_RECEPTIONS_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__IS_ICON = CLASSIFIER_WITH_RECEPTIONS_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__ATTRIBUTE_COMPARTMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__ATTRIBUTE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Operation Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__OPERATION_COMPARTMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__OPERATION_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Reception Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE__RECEPTION_COMPARTMENT = CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>Interface Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE_FEATURE_COUNT = CLASSIFIER_WITH_RECEPTIONS_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SHAPE_OPERATION_COUNT = CLASSIFIER_WITH_RECEPTIONS_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__MODEL_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__LOCAL_STYLE = CLASSIFIER_WITH_OPERATIONS_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__SHARED_STYLE = CLASSIFIER_WITH_OPERATIONS_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__TARGET_EDGE = CLASSIFIER_WITH_OPERATIONS_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__SOURCE_EDGE = CLASSIFIER_WITH_OPERATIONS_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__UML_MODEL_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__SHARED_UML_STYLE = CLASSIFIER_WITH_OPERATIONS_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__LOCAL_UML_STYLE = CLASSIFIER_WITH_OPERATIONS_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__TARGET_UML_EDGE = CLASSIFIER_WITH_OPERATIONS_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__SOURCE_UML_EDGE = CLASSIFIER_WITH_OPERATIONS_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__PACKAGE_COMPARTMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__UML_DIAGRAM = CLASSIFIER_WITH_OPERATIONS_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__BOUNDS = CLASSIFIER_WITH_OPERATIONS_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__NAME_LABEL = CLASSIFIER_WITH_OPERATIONS_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__IS_ICON = CLASSIFIER_WITH_OPERATIONS_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__ATTRIBUTE_COMPARTMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__ATTRIBUTE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Operation Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE__OPERATION_COMPARTMENT = CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>Data Type Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE_FEATURE_COUNT = CLASSIFIER_WITH_OPERATIONS_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_SHAPE_OPERATION_COUNT = CLASSIFIER_WITH_OPERATIONS_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__MODEL_ELEMENT = DATA_TYPE_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__OWNING_DIAGRAM_ELEMENT = DATA_TYPE_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__OWNED_DIAGRAM_ELEMENT = DATA_TYPE_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__LOCAL_STYLE = DATA_TYPE_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__SHARED_STYLE = DATA_TYPE_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__TARGET_EDGE = DATA_TYPE_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__SOURCE_EDGE = DATA_TYPE_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__UML_MODEL_ELEMENT = DATA_TYPE_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__SHARED_UML_STYLE = DATA_TYPE_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__LOCAL_UML_STYLE = DATA_TYPE_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = DATA_TYPE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = DATA_TYPE_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__TARGET_UML_EDGE = DATA_TYPE_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__SOURCE_UML_EDGE = DATA_TYPE_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__PACKAGE_COMPARTMENT = DATA_TYPE_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__UML_DIAGRAM = DATA_TYPE_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__BOUNDS = DATA_TYPE_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__NAME_LABEL = DATA_TYPE_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = DATA_TYPE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__IS_ICON = DATA_TYPE_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__ATTRIBUTE_COMPARTMENT = DATA_TYPE_SHAPE__ATTRIBUTE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Operation Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE__OPERATION_COMPARTMENT = DATA_TYPE_SHAPE__OPERATION_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>Primitive Type Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE_FEATURE_COUNT = DATA_TYPE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHAPE_OPERATION_COUNT = DATA_TYPE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__MODEL_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__LOCAL_STYLE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__SHARED_STYLE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__TARGET_EDGE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__SOURCE_EDGE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__UML_MODEL_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__SHARED_UML_STYLE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__LOCAL_UML_STYLE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__TARGET_UML_EDGE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__SOURCE_UML_EDGE = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__PACKAGE_COMPARTMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__UML_DIAGRAM = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__BOUNDS = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__NAME_LABEL = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__IS_ICON = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE__ATTRIBUTE_COMPARTMENT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>Signal Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE_FEATURE_COUNT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIGNAL_SHAPE_OPERATION_COUNT = CLASSIFIER_WITH_ATTRIBUTES_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__MODEL_ELEMENT = PACKAGE_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__OWNING_DIAGRAM_ELEMENT = PACKAGE_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__OWNED_DIAGRAM_ELEMENT = PACKAGE_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__LOCAL_STYLE = PACKAGE_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__SHARED_STYLE = PACKAGE_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__TARGET_EDGE = PACKAGE_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__SOURCE_EDGE = PACKAGE_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__UML_MODEL_ELEMENT = PACKAGE_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__SHARED_UML_STYLE = PACKAGE_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__LOCAL_UML_STYLE = PACKAGE_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = PACKAGE_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = PACKAGE_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__TARGET_UML_EDGE = PACKAGE_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__SOURCE_UML_EDGE = PACKAGE_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__PACKAGE_COMPARTMENT = PACKAGE_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__UML_DIAGRAM = PACKAGE_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__BOUNDS = PACKAGE_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__NAME_LABEL = PACKAGE_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = PACKAGE_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Packaged Element Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE__PACKAGED_ELEMENT_COMPARTMENT = PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>Model Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE_FEATURE_COUNT = PACKAGE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODEL_SHAPE_OPERATION_COUNT = PACKAGE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__MODEL_ELEMENT = UML_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__OWNING_DIAGRAM_ELEMENT = UML_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__OWNED_DIAGRAM_ELEMENT = UML_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__LOCAL_STYLE = UML_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__SHARED_STYLE = UML_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__TARGET_EDGE = UML_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__SOURCE_EDGE = UML_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__UML_MODEL_ELEMENT = UML_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__SHARED_UML_STYLE = UML_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__LOCAL_UML_STYLE = UML_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__OWNED_UML_DIAGRAM_ELEMENT = UML_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__OWNING_UML_DIAGRAM_ELEMENT = UML_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__TARGET_UML_EDGE = UML_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__SOURCE_UML_EDGE = UML_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__PACKAGE_COMPARTMENT = UML_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__UML_DIAGRAM = UML_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__SOURCE_DIAGRAM_ELEMENT = UML_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__WAYPOINT = UML_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__TARGET_DIAGRAM_ELEMENT = UML_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE__TARGET_UML_DIAGRAM_ELEMENT = UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Containment Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE_FEATURE_COUNT = UML_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Containment Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE_OPERATION_COUNT = UML_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Generalization Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generalization Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Dependency Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__MODEL_ELEMENT = DEPENDENCY_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__OWNING_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__OWNED_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__LOCAL_STYLE = DEPENDENCY_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__SHARED_STYLE = DEPENDENCY_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__TARGET_EDGE = DEPENDENCY_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__SOURCE_EDGE = DEPENDENCY_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__UML_MODEL_ELEMENT = DEPENDENCY_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__SHARED_UML_STYLE = DEPENDENCY_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__LOCAL_UML_STYLE = DEPENDENCY_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__OWNED_UML_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__OWNING_UML_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__TARGET_UML_EDGE = DEPENDENCY_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__SOURCE_UML_EDGE = DEPENDENCY_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__PACKAGE_COMPARTMENT = DEPENDENCY_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__UML_DIAGRAM = DEPENDENCY_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__SOURCE_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__WAYPOINT = DEPENDENCY_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__TARGET_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__TARGET_UML_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE__NAME_LABEL = DEPENDENCY_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Abstraction Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE_FEATURE_COUNT = DEPENDENCY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstraction Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_EDGE_OPERATION_COUNT = DEPENDENCY_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__MODEL_ELEMENT = ABSTRACTION_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__OWNING_DIAGRAM_ELEMENT = ABSTRACTION_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__OWNED_DIAGRAM_ELEMENT = ABSTRACTION_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__LOCAL_STYLE = ABSTRACTION_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__SHARED_STYLE = ABSTRACTION_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__TARGET_EDGE = ABSTRACTION_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__SOURCE_EDGE = ABSTRACTION_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__UML_MODEL_ELEMENT = ABSTRACTION_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__SHARED_UML_STYLE = ABSTRACTION_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__LOCAL_UML_STYLE = ABSTRACTION_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT = ABSTRACTION_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT = ABSTRACTION_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__TARGET_UML_EDGE = ABSTRACTION_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__SOURCE_UML_EDGE = ABSTRACTION_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__PACKAGE_COMPARTMENT = ABSTRACTION_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__UML_DIAGRAM = ABSTRACTION_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__SOURCE_DIAGRAM_ELEMENT = ABSTRACTION_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__WAYPOINT = ABSTRACTION_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__TARGET_DIAGRAM_ELEMENT = ABSTRACTION_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = ABSTRACTION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT = ABSTRACTION_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE__NAME_LABEL = ABSTRACTION_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Realization Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE_FEATURE_COUNT = ABSTRACTION_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Realization Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REALIZATION_EDGE_OPERATION_COUNT = ABSTRACTION_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__MODEL_ELEMENT = REALIZATION_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__OWNING_DIAGRAM_ELEMENT = REALIZATION_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__OWNED_DIAGRAM_ELEMENT = REALIZATION_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__LOCAL_STYLE = REALIZATION_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__SHARED_STYLE = REALIZATION_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__TARGET_EDGE = REALIZATION_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__SOURCE_EDGE = REALIZATION_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__UML_MODEL_ELEMENT = REALIZATION_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__SHARED_UML_STYLE = REALIZATION_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__LOCAL_UML_STYLE = REALIZATION_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT = REALIZATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT = REALIZATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__TARGET_UML_EDGE = REALIZATION_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__SOURCE_UML_EDGE = REALIZATION_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__PACKAGE_COMPARTMENT = REALIZATION_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__UML_DIAGRAM = REALIZATION_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__SOURCE_DIAGRAM_ELEMENT = REALIZATION_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__WAYPOINT = REALIZATION_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__TARGET_DIAGRAM_ELEMENT = REALIZATION_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = REALIZATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT = REALIZATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE__NAME_LABEL = REALIZATION_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Interface Realization Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE_FEATURE_COUNT = REALIZATION_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Realization Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REALIZATION_EDGE_OPERATION_COUNT = REALIZATION_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__MODEL_ELEMENT = DEPENDENCY_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__OWNING_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__OWNED_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__LOCAL_STYLE = DEPENDENCY_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__SHARED_STYLE = DEPENDENCY_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__TARGET_EDGE = DEPENDENCY_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__SOURCE_EDGE = DEPENDENCY_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__UML_MODEL_ELEMENT = DEPENDENCY_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__SHARED_UML_STYLE = DEPENDENCY_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__LOCAL_UML_STYLE = DEPENDENCY_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__OWNED_UML_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__OWNING_UML_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__TARGET_UML_EDGE = DEPENDENCY_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__SOURCE_UML_EDGE = DEPENDENCY_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__PACKAGE_COMPARTMENT = DEPENDENCY_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__UML_DIAGRAM = DEPENDENCY_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__SOURCE_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__WAYPOINT = DEPENDENCY_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__TARGET_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__TARGET_UML_DIAGRAM_ELEMENT = DEPENDENCY_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE__NAME_LABEL = DEPENDENCY_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Usage Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE_FEATURE_COUNT = DEPENDENCY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Usage Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USAGE_EDGE_OPERATION_COUNT = DEPENDENCY_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Element Import Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element Import Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Package Import Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package Import Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Package Merge Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package Merge Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__MODEL_ELEMENT = REALIZATION_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__OWNING_DIAGRAM_ELEMENT = REALIZATION_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__OWNED_DIAGRAM_ELEMENT = REALIZATION_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__LOCAL_STYLE = REALIZATION_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__SHARED_STYLE = REALIZATION_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__TARGET_EDGE = REALIZATION_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__SOURCE_EDGE = REALIZATION_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__UML_MODEL_ELEMENT = REALIZATION_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__SHARED_UML_STYLE = REALIZATION_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__LOCAL_UML_STYLE = REALIZATION_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__OWNED_UML_DIAGRAM_ELEMENT = REALIZATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__OWNING_UML_DIAGRAM_ELEMENT = REALIZATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__TARGET_UML_EDGE = REALIZATION_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__SOURCE_UML_EDGE = REALIZATION_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__PACKAGE_COMPARTMENT = REALIZATION_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__UML_DIAGRAM = REALIZATION_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__SOURCE_DIAGRAM_ELEMENT = REALIZATION_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__WAYPOINT = REALIZATION_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__TARGET_DIAGRAM_ELEMENT = REALIZATION_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = REALIZATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__TARGET_UML_DIAGRAM_ELEMENT = REALIZATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE__NAME_LABEL = REALIZATION_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Substitution Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE_FEATURE_COUNT = REALIZATION_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Substitution Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_EDGE_OPERATION_COUNT = REALIZATION_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Item Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE__ITEM_LABEL = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Information Flow Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Information Flow Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.ItemLabelImpl <em>Item Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.ItemLabelImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getItemLabel()
	 * @generated
	 */
	int ITEM_LABEL = 63;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__MODEL_ELEMENT = UML_LABEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__OWNING_DIAGRAM_ELEMENT = UML_LABEL__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__OWNED_DIAGRAM_ELEMENT = UML_LABEL__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__LOCAL_STYLE = UML_LABEL__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__SHARED_STYLE = UML_LABEL__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__TARGET_EDGE = UML_LABEL__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__SOURCE_EDGE = UML_LABEL__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__UML_MODEL_ELEMENT = UML_LABEL__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__SHARED_UML_STYLE = UML_LABEL__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__LOCAL_UML_STYLE = UML_LABEL__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__OWNED_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__OWNING_UML_DIAGRAM_ELEMENT = UML_LABEL__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__TARGET_UML_EDGE = UML_LABEL__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__SOURCE_UML_EDGE = UML_LABEL__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__BOUNDS = UML_LABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Information Flow Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL__INFORMATION_FLOW_EDGE = UML_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL_FEATURE_COUNT = UML_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Item Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_LABEL_OPERATION_COUNT = UML_LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__MODEL_ELEMENT = ASSOCIATION_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__OWNING_DIAGRAM_ELEMENT = ASSOCIATION_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__OWNED_DIAGRAM_ELEMENT = ASSOCIATION_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__LOCAL_STYLE = ASSOCIATION_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__SHARED_STYLE = ASSOCIATION_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__TARGET_EDGE = ASSOCIATION_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__SOURCE_EDGE = ASSOCIATION_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__UML_MODEL_ELEMENT = ASSOCIATION_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__SHARED_UML_STYLE = ASSOCIATION_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__LOCAL_UML_STYLE = ASSOCIATION_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__OWNED_UML_DIAGRAM_ELEMENT = ASSOCIATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__OWNING_UML_DIAGRAM_ELEMENT = ASSOCIATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__TARGET_UML_EDGE = ASSOCIATION_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__SOURCE_UML_EDGE = ASSOCIATION_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__PACKAGE_COMPARTMENT = ASSOCIATION_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__UML_DIAGRAM = ASSOCIATION_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__SOURCE_DIAGRAM_ELEMENT = ASSOCIATION_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__WAYPOINT = ASSOCIATION_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__TARGET_DIAGRAM_ELEMENT = ASSOCIATION_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = ASSOCIATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__TARGET_UML_DIAGRAM_ELEMENT = ASSOCIATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__NAME_LABEL = ASSOCIATION_EDGE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>End Multiplicity Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__END_MULTIPLICITY_LABEL = ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL;

	/**
	 * The feature id for the '<em><b>End Modifier Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__END_MODIFIER_LABEL = ASSOCIATION_EDGE__END_MODIFIER_LABEL;

	/**
	 * The feature id for the '<em><b>End Role Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE__END_ROLE_LABEL = ASSOCIATION_EDGE__END_ROLE_LABEL;

	/**
	 * The number of structural features of the '<em>Association Class Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE_FEATURE_COUNT = ASSOCIATION_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Association Class Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_EDGE_OPERATION_COUNT = ASSOCIATION_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__MODEL_ELEMENT = BODY_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__OWNING_DIAGRAM_ELEMENT = BODY_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__OWNED_DIAGRAM_ELEMENT = BODY_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__LOCAL_STYLE = BODY_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__SHARED_STYLE = BODY_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__TARGET_EDGE = BODY_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__SOURCE_EDGE = BODY_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__UML_MODEL_ELEMENT = BODY_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__SHARED_UML_STYLE = BODY_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__LOCAL_UML_STYLE = BODY_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = BODY_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = BODY_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__TARGET_UML_EDGE = BODY_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__SOURCE_UML_EDGE = BODY_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__PACKAGE_COMPARTMENT = BODY_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__UML_DIAGRAM = BODY_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__BOUNDS = BODY_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Body Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE__BODY_LABEL = BODY_SHAPE__BODY_LABEL;

	/**
	 * The number of structural features of the '<em>Comment Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE_FEATURE_COUNT = BODY_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comment Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_SHAPE_OPERATION_COUNT = BODY_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umldi.impl.AttachmentEdgeImpl <em>Attachment Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.umldi.impl.AttachmentEdgeImpl
	 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAttachmentEdge()
	 * @generated
	 */
	int ATTACHMENT_EDGE = 66;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__MODEL_ELEMENT = UML_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__OWNING_DIAGRAM_ELEMENT = UML_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__OWNED_DIAGRAM_ELEMENT = UML_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__LOCAL_STYLE = UML_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__SHARED_STYLE = UML_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__TARGET_EDGE = UML_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__SOURCE_EDGE = UML_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__UML_MODEL_ELEMENT = UML_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__SHARED_UML_STYLE = UML_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__LOCAL_UML_STYLE = UML_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__OWNED_UML_DIAGRAM_ELEMENT = UML_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__OWNING_UML_DIAGRAM_ELEMENT = UML_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__TARGET_UML_EDGE = UML_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__SOURCE_UML_EDGE = UML_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__PACKAGE_COMPARTMENT = UML_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__UML_DIAGRAM = UML_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__SOURCE_DIAGRAM_ELEMENT = UML_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__WAYPOINT = UML_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__TARGET_DIAGRAM_ELEMENT = UML_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = UML_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE__TARGET_UML_DIAGRAM_ELEMENT = UML_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The number of structural features of the '<em>Attachment Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE_FEATURE_COUNT = UML_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_EDGE_OPERATION_COUNT = UML_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__MODEL_ELEMENT = CLASS_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASS_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASS_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__LOCAL_STYLE = CLASS_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__SHARED_STYLE = CLASS_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__TARGET_EDGE = CLASS_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__SOURCE_EDGE = CLASS_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__UML_MODEL_ELEMENT = CLASS_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__SHARED_UML_STYLE = CLASS_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__LOCAL_UML_STYLE = CLASS_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__TARGET_UML_EDGE = CLASS_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__SOURCE_UML_EDGE = CLASS_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__PACKAGE_COMPARTMENT = CLASS_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__UML_DIAGRAM = CLASS_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__BOUNDS = CLASS_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__NAME_LABEL = CLASS_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__IS_ICON = CLASS_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__ATTRIBUTE_COMPARTMENT = CLASS_SHAPE__ATTRIBUTE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Operation Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__OPERATION_COMPARTMENT = CLASS_SHAPE__OPERATION_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Reception Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE__RECEPTION_COMPARTMENT = CLASS_SHAPE__RECEPTION_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>Association Class Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE_FEATURE_COUNT = CLASS_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Association Class Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_SHAPE_OPERATION_COUNT = CLASS_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__MODEL_ELEMENT = CLASS_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASS_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASS_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__LOCAL_STYLE = CLASS_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__SHARED_STYLE = CLASS_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__TARGET_EDGE = CLASS_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__SOURCE_EDGE = CLASS_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__UML_MODEL_ELEMENT = CLASS_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__SHARED_UML_STYLE = CLASS_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__LOCAL_UML_STYLE = CLASS_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASS_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASS_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__TARGET_UML_EDGE = CLASS_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__SOURCE_UML_EDGE = CLASS_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__PACKAGE_COMPARTMENT = CLASS_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__UML_DIAGRAM = CLASS_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__BOUNDS = CLASS_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__NAME_LABEL = CLASS_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASS_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__IS_ICON = CLASS_SHAPE__IS_ICON;

	/**
	 * The feature id for the '<em><b>Attribute Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__ATTRIBUTE_COMPARTMENT = CLASS_SHAPE__ATTRIBUTE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Operation Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__OPERATION_COMPARTMENT = CLASS_SHAPE__OPERATION_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Reception Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE__RECEPTION_COMPARTMENT = CLASS_SHAPE__RECEPTION_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>Component Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE_FEATURE_COUNT = CLASS_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SHAPE_OPERATION_COUNT = CLASS_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__MODEL_ELEMENT = CLASSIFIER_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__LOCAL_STYLE = CLASSIFIER_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__SHARED_STYLE = CLASSIFIER_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__TARGET_EDGE = CLASSIFIER_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__SOURCE_EDGE = CLASSIFIER_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__UML_MODEL_ELEMENT = CLASSIFIER_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__SHARED_UML_STYLE = CLASSIFIER_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__LOCAL_UML_STYLE = CLASSIFIER_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__TARGET_UML_EDGE = CLASSIFIER_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__SOURCE_UML_EDGE = CLASSIFIER_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__PACKAGE_COMPARTMENT = CLASSIFIER_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__UML_DIAGRAM = CLASSIFIER_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__BOUNDS = CLASSIFIER_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__NAME_LABEL = CLASSIFIER_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASSIFIER_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE__IS_ICON = CLASSIFIER_SHAPE__IS_ICON;

	/**
	 * The number of structural features of the '<em>Information Item Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE_FEATURE_COUNT = CLASSIFIER_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Information Item Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_SHAPE_OPERATION_COUNT = CLASSIFIER_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__MODEL_ELEMENT = NAMED_EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__OWNING_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__OWNED_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__LOCAL_STYLE = NAMED_EDGE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__SHARED_STYLE = NAMED_EDGE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__TARGET_EDGE = NAMED_EDGE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__SOURCE_EDGE = NAMED_EDGE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__UML_MODEL_ELEMENT = NAMED_EDGE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__SHARED_UML_STYLE = NAMED_EDGE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__LOCAL_UML_STYLE = NAMED_EDGE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_EDGE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__TARGET_UML_EDGE = NAMED_EDGE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__SOURCE_UML_EDGE = NAMED_EDGE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__PACKAGE_COMPARTMENT = NAMED_EDGE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__UML_DIAGRAM = NAMED_EDGE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__SOURCE_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__WAYPOINT = NAMED_EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Target Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__TARGET_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__SOURCE_UML_DIAGRAM_ELEMENT = NAMED_EDGE__SOURCE_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__TARGET_UML_DIAGRAM_ELEMENT = NAMED_EDGE__TARGET_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE__NAME_LABEL = NAMED_EDGE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Representation Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE_FEATURE_COUNT = NAMED_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Representation Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_EDGE_OPERATION_COUNT = NAMED_EDGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__MODEL_ELEMENT = CLASSIFIER_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__OWNING_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__OWNED_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__LOCAL_STYLE = CLASSIFIER_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__SHARED_STYLE = CLASSIFIER_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__TARGET_EDGE = CLASSIFIER_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__SOURCE_EDGE = CLASSIFIER_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__UML_MODEL_ELEMENT = CLASSIFIER_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__SHARED_UML_STYLE = CLASSIFIER_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__LOCAL_UML_STYLE = CLASSIFIER_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = CLASSIFIER_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__TARGET_UML_EDGE = CLASSIFIER_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__SOURCE_UML_EDGE = CLASSIFIER_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__PACKAGE_COMPARTMENT = CLASSIFIER_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__UML_DIAGRAM = CLASSIFIER_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__BOUNDS = CLASSIFIER_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__NAME_LABEL = CLASSIFIER_SHAPE__NAME_LABEL;

	/**
	 * The feature id for the '<em><b>Template Parameter Compartment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = CLASSIFIER_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Is Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE__IS_ICON = CLASSIFIER_SHAPE__IS_ICON;

	/**
	 * The number of structural features of the '<em>Association Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE_FEATURE_COUNT = CLASSIFIER_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Association Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_SHAPE_OPERATION_COUNT = CLASSIFIER_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__MODEL_ELEMENT = NAMED_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__OWNING_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__OWNED_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__LOCAL_STYLE = NAMED_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__SHARED_STYLE = NAMED_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__TARGET_EDGE = NAMED_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__SOURCE_EDGE = NAMED_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__UML_MODEL_ELEMENT = NAMED_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__SHARED_UML_STYLE = NAMED_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__LOCAL_UML_STYLE = NAMED_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__TARGET_UML_EDGE = NAMED_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__SOURCE_UML_EDGE = NAMED_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__PACKAGE_COMPARTMENT = NAMED_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__UML_DIAGRAM = NAMED_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__BOUNDS = NAMED_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE__NAME_LABEL = NAMED_SHAPE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Dependency Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE_FEATURE_COUNT = NAMED_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_SHAPE_OPERATION_COUNT = NAMED_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__MODEL_ELEMENT = NAMED_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__OWNING_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__OWNED_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__LOCAL_STYLE = NAMED_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__SHARED_STYLE = NAMED_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__TARGET_EDGE = NAMED_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__SOURCE_EDGE = NAMED_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__UML_MODEL_ELEMENT = NAMED_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__SHARED_UML_STYLE = NAMED_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__LOCAL_UML_STYLE = NAMED_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__TARGET_UML_EDGE = NAMED_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__SOURCE_UML_EDGE = NAMED_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__PACKAGE_COMPARTMENT = NAMED_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__UML_DIAGRAM = NAMED_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__BOUNDS = NAMED_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE__NAME_LABEL = NAMED_SHAPE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Time Observation Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE_FEATURE_COUNT = NAMED_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Observation Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_SHAPE_OPERATION_COUNT = NAMED_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__MODEL_ELEMENT = NAMED_SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__OWNING_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNING_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__OWNED_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNED_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__LOCAL_STYLE = NAMED_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__SHARED_STYLE = NAMED_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Target Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__TARGET_EDGE = NAMED_SHAPE__TARGET_EDGE;

	/**
	 * The feature id for the '<em><b>Source Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__SOURCE_EDGE = NAMED_SHAPE__SOURCE_EDGE;

	/**
	 * The feature id for the '<em><b>Uml Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__UML_MODEL_ELEMENT = NAMED_SHAPE__UML_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Shared Uml Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__SHARED_UML_STYLE = NAMED_SHAPE__SHARED_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__LOCAL_UML_STYLE = NAMED_SHAPE__LOCAL_UML_STYLE;

	/**
	 * The feature id for the '<em><b>Owned Uml Diagram Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__OWNED_UML_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNED_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Uml Diagram Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__OWNING_UML_DIAGRAM_ELEMENT = NAMED_SHAPE__OWNING_UML_DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__TARGET_UML_EDGE = NAMED_SHAPE__TARGET_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Source Uml Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__SOURCE_UML_EDGE = NAMED_SHAPE__SOURCE_UML_EDGE;

	/**
	 * The feature id for the '<em><b>Package Compartment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__PACKAGE_COMPARTMENT = NAMED_SHAPE__PACKAGE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__UML_DIAGRAM = NAMED_SHAPE__UML_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__BOUNDS = NAMED_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE__NAME_LABEL = NAMED_SHAPE__NAME_LABEL;

	/**
	 * The number of structural features of the '<em>Duration Observation Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE_FEATURE_COUNT = NAMED_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration Observation Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_SHAPE_OPERATION_COUNT = NAMED_SHAPE_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.UmlDiagram#getTopUmlDiagramElement
	 * <em>Top Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Top Uml Diagram Element</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagram#getTopUmlDiagramElement()
	 * @see #getUmlDiagram()
	 * @generated
	 */
	EReference getUmlDiagram_TopUmlDiagramElement();

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
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getUmlModelElement <em>Uml Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Uml Model Element</em>'.
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
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement
	 * <em>Owning Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owning Uml Diagram Element</em>'.
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement()
	 * @see #getUmlDiagramElement()
	 * @generated
	 */
	EReference getUmlDiagramElement_OwningUmlDiagramElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement
	 * <em>Owned Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Uml Diagram Element</em>'.
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
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.umldi.UmlStyle#fontsizePositive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
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
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.TopUmlDiagramElement <em>Top Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Top Uml Diagram Element</em>'.
	 * @see org.eclipse.papyrus.umldi.TopUmlDiagramElement
	 * @generated
	 */
	EClass getTopUmlDiagramElement();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.TopUmlDiagramElement#getPackageCompartment
	 * <em>Package Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Package Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.TopUmlDiagramElement#getPackageCompartment()
	 * @see #getTopUmlDiagramElement()
	 * @generated
	 */
	EReference getTopUmlDiagramElement_PackageCompartment();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.TopUmlDiagramElement#getUmlDiagram <em>Uml Diagram</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Uml Diagram</em>'.
	 * @see org.eclipse.papyrus.umldi.TopUmlDiagramElement#getUmlDiagram()
	 * @see #getTopUmlDiagramElement()
	 * @generated
	 */
	EReference getTopUmlDiagramElement_UmlDiagram();

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
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ClassDiagram <em>Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Class Diagram</em>'.
	 * @see org.eclipse.papyrus.umldi.ClassDiagram
	 * @generated
	 */
	EClass getClassDiagram();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.StructureDiagram <em>Structure Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Structure Diagram</em>'.
	 * @see org.eclipse.papyrus.umldi.StructureDiagram
	 * @generated
	 */
	EClass getStructureDiagram();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ClassifierShape <em>Classifier Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Classifier Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.ClassifierShape
	 * @generated
	 */
	EClass getClassifierShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umldi.ClassifierShape#isIcon <em>Is Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Icon</em>'.
	 * @see org.eclipse.papyrus.umldi.ClassifierShape#isIcon()
	 * @see #getClassifierShape()
	 * @generated
	 */
	EAttribute getClassifierShape_IsIcon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.PackageShape <em>Package Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Package Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.PackageShape
	 * @generated
	 */
	EClass getPackageShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.PackageShape#getPackagedElementCompartment
	 * <em>Packaged Element Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Packaged Element Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.PackageShape#getPackagedElementCompartment()
	 * @see #getPackageShape()
	 * @generated
	 */
	EReference getPackageShape_PackagedElementCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.TemplateableElementShape <em>Templateable Element Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Templateable Element Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.TemplateableElementShape
	 * @generated
	 */
	EClass getTemplateableElementShape();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.umldi.TemplateableElementShape#getTemplateParameterCompartment <em>Template Parameter Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Template Parameter Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.TemplateableElementShape#getTemplateParameterCompartment()
	 * @see #getTemplateableElementShape()
	 * @generated
	 */
	EReference getTemplateableElementShape_TemplateParameterCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.NamedShape <em>Named Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.NamedShape
	 * @generated
	 */
	EClass getNamedShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.NamedShape#getNameLabel <em>Name Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Name Label</em>'.
	 * @see org.eclipse.papyrus.umldi.NamedShape#getNameLabel()
	 * @see #getNamedShape()
	 * @generated
	 */
	EReference getNamedShape_NameLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ConstraintShape <em>Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Constraint Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.ConstraintShape
	 * @generated
	 */
	EClass getConstraintShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.BodyShape <em>Body Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Body Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.BodyShape
	 * @generated
	 */
	EClass getBodyShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.BodyShape#getBodyLabel <em>Body Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Body Label</em>'.
	 * @see org.eclipse.papyrus.umldi.BodyShape#getBodyLabel()
	 * @see #getBodyShape()
	 * @generated
	 */
	EReference getBodyShape_BodyLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.AttributeCompartment <em>Attribute Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Attribute Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.AttributeCompartment
	 * @generated
	 */
	EClass getAttributeCompartment();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.AttributeCompartment#getClassifierWithAttributesShape
	 * <em>Classifier With Attributes Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Classifier With Attributes Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.AttributeCompartment#getClassifierWithAttributesShape()
	 * @see #getAttributeCompartment()
	 * @generated
	 */
	EReference getAttributeCompartment_ClassifierWithAttributesShape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.AttributeCompartment#getAttributeLabel
	 * <em>Attribute Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Attribute Label</em>'.
	 * @see org.eclipse.papyrus.umldi.AttributeCompartment#getAttributeLabel()
	 * @see #getAttributeCompartment()
	 * @generated
	 */
	EReference getAttributeCompartment_AttributeLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.OperationCompartment <em>Operation Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Operation Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.OperationCompartment
	 * @generated
	 */
	EClass getOperationCompartment();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.OperationCompartment#getClassifierWithOperationsShape
	 * <em>Classifier With Operations Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Classifier With Operations Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.OperationCompartment#getClassifierWithOperationsShape()
	 * @see #getOperationCompartment()
	 * @generated
	 */
	EReference getOperationCompartment_ClassifierWithOperationsShape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.OperationCompartment#getOperationLabel
	 * <em>Operation Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Operation Label</em>'.
	 * @see org.eclipse.papyrus.umldi.OperationCompartment#getOperationLabel()
	 * @see #getOperationCompartment()
	 * @generated
	 */
	EReference getOperationCompartment_OperationLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ReceptionCompartment <em>Reception Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Reception Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.ReceptionCompartment
	 * @generated
	 */
	EClass getReceptionCompartment();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.ReceptionCompartment#getSignalShape
	 * <em>Signal Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Signal Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.ReceptionCompartment#getSignalShape()
	 * @see #getReceptionCompartment()
	 * @generated
	 */
	EReference getReceptionCompartment_SignalShape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.ReceptionCompartment#getReceptionLabel
	 * <em>Reception Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Reception Label</em>'.
	 * @see org.eclipse.papyrus.umldi.ReceptionCompartment#getReceptionLabel()
	 * @see #getReceptionCompartment()
	 * @generated
	 */
	EReference getReceptionCompartment_ReceptionLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.LiteralCompartment <em>Literal Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.LiteralCompartment
	 * @generated
	 */
	EClass getLiteralCompartment();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.LiteralCompartment#getEnumerationShape
	 * <em>Enumeration Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Enumeration Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.LiteralCompartment#getEnumerationShape()
	 * @see #getLiteralCompartment()
	 * @generated
	 */
	EReference getLiteralCompartment_EnumerationShape();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.LiteralCompartment#getLiteralLabel
	 * <em>Literal Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Literal Label</em>'.
	 * @see org.eclipse.papyrus.umldi.LiteralCompartment#getLiteralLabel()
	 * @see #getLiteralCompartment()
	 * @generated
	 */
	EReference getLiteralCompartment_LiteralLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.PackagedElementCompartment <em>Packaged Element Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Packaged Element Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.PackagedElementCompartment
	 * @generated
	 */
	EClass getPackagedElementCompartment();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.PackagedElementCompartment#getPackageShape
	 * <em>Package Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Package Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.PackagedElementCompartment#getPackageShape()
	 * @see #getPackagedElementCompartment()
	 * @generated
	 */
	EReference getPackagedElementCompartment_PackageShape();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.umldi.PackagedElementCompartment#getTopUmlDiagramElement <em>Top Uml Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Top Uml Diagram Element</em>'.
	 * @see org.eclipse.papyrus.umldi.PackagedElementCompartment#getTopUmlDiagramElement()
	 * @see #getPackagedElementCompartment()
	 * @generated
	 */
	EReference getPackagedElementCompartment_TopUmlDiagramElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.NameLabel <em>Name Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Name Label</em>'.
	 * @see org.eclipse.papyrus.umldi.NameLabel
	 * @generated
	 */
	EClass getNameLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.NameLabel#getNamedElementEdge
	 * <em>Named Element Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Named Element Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.NameLabel#getNamedElementEdge()
	 * @see #getNameLabel()
	 * @generated
	 */
	EReference getNameLabel_NamedElementEdge();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.NameLabel#getNamedElementShape
	 * <em>Named Element Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Named Element Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.NameLabel#getNamedElementShape()
	 * @see #getNameLabel()
	 * @generated
	 */
	EReference getNameLabel_NamedElementShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.NamedEdge <em>Named Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.NamedEdge
	 * @generated
	 */
	EClass getNamedEdge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.NamedEdge#getNameLabel <em>Name Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Name Label</em>'.
	 * @see org.eclipse.papyrus.umldi.NamedEdge#getNameLabel()
	 * @see #getNamedEdge()
	 * @generated
	 */
	EReference getNamedEdge_NameLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.PropertyEdge <em>Property Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.PropertyEdge
	 * @generated
	 */
	EClass getPropertyEdge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.PropertyEdge#getModifierLabel <em>Modifier Label</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Modifier Label</em>'.
	 * @see org.eclipse.papyrus.umldi.PropertyEdge#getModifierLabel()
	 * @see #getPropertyEdge()
	 * @generated
	 */
	EReference getPropertyEdge_ModifierLabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.PropertyEdge#getMultiplicityLabel
	 * <em>Multiplicity Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Multiplicity Label</em>'.
	 * @see org.eclipse.papyrus.umldi.PropertyEdge#getMultiplicityLabel()
	 * @see #getPropertyEdge()
	 * @generated
	 */
	EReference getPropertyEdge_MultiplicityLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ModifierLabel <em>Modifier Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Modifier Label</em>'.
	 * @see org.eclipse.papyrus.umldi.ModifierLabel
	 * @generated
	 */
	EClass getModifierLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.ModifierLabel#getAssociationEdge
	 * <em>Association Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Association Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.ModifierLabel#getAssociationEdge()
	 * @see #getModifierLabel()
	 * @generated
	 */
	EReference getModifierLabel_AssociationEdge();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.ModifierLabel#getGeneralizationSetEdge
	 * <em>Generalization Set Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Generalization Set Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.ModifierLabel#getGeneralizationSetEdge()
	 * @see #getModifierLabel()
	 * @generated
	 */
	EReference getModifierLabel_GeneralizationSetEdge();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.ModifierLabel#getPropertyEdge <em>Property Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Property Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.ModifierLabel#getPropertyEdge()
	 * @see #getModifierLabel()
	 * @generated
	 */
	EReference getModifierLabel_PropertyEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.InstanceSpecificationEdge <em>Instance Specification Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Instance Specification Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.InstanceSpecificationEdge
	 * @generated
	 */
	EClass getInstanceSpecificationEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.InstanceSpecificationEdge#getEndRoleLabel
	 * <em>End Role Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>End Role Label</em>'.
	 * @see org.eclipse.papyrus.umldi.InstanceSpecificationEdge#getEndRoleLabel()
	 * @see #getInstanceSpecificationEdge()
	 * @generated
	 */
	EReference getInstanceSpecificationEdge_EndRoleLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.BodyLabel <em>Body Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Body Label</em>'.
	 * @see org.eclipse.papyrus.umldi.BodyLabel
	 * @generated
	 */
	EClass getBodyLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.BodyLabel#getConstraintShape <em>Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Constraint Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.BodyLabel#getConstraintShape()
	 * @see #getBodyLabel()
	 * @generated
	 */
	EReference getBodyLabel_ConstraintShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.InstanceSpecificationShape <em>Instance Specification Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Instance Specification Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.InstanceSpecificationShape
	 * @generated
	 */
	EClass getInstanceSpecificationShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.InstanceSpecificationShape#getSlotCompartment
	 * <em>Slot Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Slot Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.InstanceSpecificationShape#getSlotCompartment()
	 * @see #getInstanceSpecificationShape()
	 * @generated
	 */
	EReference getInstanceSpecificationShape_SlotCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.SlotCompartment <em>Slot Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Slot Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.SlotCompartment
	 * @generated
	 */
	EClass getSlotCompartment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.SlotCompartment#getSlotLabel <em>Slot Label</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Slot Label</em>'.
	 * @see org.eclipse.papyrus.umldi.SlotCompartment#getSlotLabel()
	 * @see #getSlotCompartment()
	 * @generated
	 */
	EReference getSlotCompartment_SlotLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.SlotCompartment#getInstanceSpecificationShape
	 * <em>Instance Specification Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Instance Specification Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.SlotCompartment#getInstanceSpecificationShape()
	 * @see #getSlotCompartment()
	 * @generated
	 */
	EReference getSlotCompartment_InstanceSpecificationShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.SlotLabel <em>Slot Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Slot Label</em>'.
	 * @see org.eclipse.papyrus.umldi.SlotLabel
	 * @generated
	 */
	EClass getSlotLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.SlotLabel#getSlotCompartment <em>Slot Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Slot Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.SlotLabel#getSlotCompartment()
	 * @see #getSlotLabel()
	 * @generated
	 */
	EReference getSlotLabel_SlotCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ClassShape <em>Class Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Class Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.ClassShape
	 * @generated
	 */
	EClass getClassShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape <em>Classifier With Receptions Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Classifier With Receptions Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape
	 * @generated
	 */
	EClass getClassifierWithReceptionsShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape#getReceptionCompartment
	 * <em>Reception Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Reception Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.ClassifierWithReceptionsShape#getReceptionCompartment()
	 * @see #getClassifierWithReceptionsShape()
	 * @generated
	 */
	EReference getClassifierWithReceptionsShape_ReceptionCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ReceptionLabel <em>Reception Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Reception Label</em>'.
	 * @see org.eclipse.papyrus.umldi.ReceptionLabel
	 * @generated
	 */
	EClass getReceptionLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.ReceptionLabel#getReceptionCompartment
	 * <em>Reception Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Reception Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.ReceptionLabel#getReceptionCompartment()
	 * @see #getReceptionLabel()
	 * @generated
	 */
	EReference getReceptionLabel_ReceptionCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ClassifierWithAttributesShape <em>Classifier With Attributes Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Classifier With Attributes Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.ClassifierWithAttributesShape
	 * @generated
	 */
	EClass getClassifierWithAttributesShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.ClassifierWithAttributesShape#getAttributeCompartment
	 * <em>Attribute Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Attribute Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.ClassifierWithAttributesShape#getAttributeCompartment()
	 * @see #getClassifierWithAttributesShape()
	 * @generated
	 */
	EReference getClassifierWithAttributesShape_AttributeCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.PropertyLabel <em>Property Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property Label</em>'.
	 * @see org.eclipse.papyrus.umldi.PropertyLabel
	 * @generated
	 */
	EClass getPropertyLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.PropertyLabel#getAttributeCompartment
	 * <em>Attribute Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Attribute Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.PropertyLabel#getAttributeCompartment()
	 * @see #getPropertyLabel()
	 * @generated
	 */
	EReference getPropertyLabel_AttributeCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ClassifierWithOperationsShape <em>Classifier With Operations Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Classifier With Operations Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.ClassifierWithOperationsShape
	 * @generated
	 */
	EClass getClassifierWithOperationsShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.ClassifierWithOperationsShape#getOperationCompartment
	 * <em>Operation Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Operation Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.ClassifierWithOperationsShape#getOperationCompartment()
	 * @see #getClassifierWithOperationsShape()
	 * @generated
	 */
	EReference getClassifierWithOperationsShape_OperationCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.OperationLabel <em>Operation Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Operation Label</em>'.
	 * @see org.eclipse.papyrus.umldi.OperationLabel
	 * @generated
	 */
	EClass getOperationLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.OperationLabel#getOperationCompartment
	 * <em>Operation Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Operation Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.OperationLabel#getOperationCompartment()
	 * @see #getOperationLabel()
	 * @generated
	 */
	EReference getOperationLabel_OperationCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.InterfaceShape <em>Interface Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Interface Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.InterfaceShape
	 * @generated
	 */
	EClass getInterfaceShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.DataTypeShape <em>Data Type Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Type Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.DataTypeShape
	 * @generated
	 */
	EClass getDataTypeShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.PrimitiveTypeShape <em>Primitive Type Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Primitive Type Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.PrimitiveTypeShape
	 * @generated
	 */
	EClass getPrimitiveTypeShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.EnumerationShape <em>Enumeration Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enumeration Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.EnumerationShape
	 * @generated
	 */
	EClass getEnumerationShape();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.EnumerationShape#getLiteralCompartment
	 * <em>Literal Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Literal Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.EnumerationShape#getLiteralCompartment()
	 * @see #getEnumerationShape()
	 * @generated
	 */
	EReference getEnumerationShape_LiteralCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.LiteralLabel <em>Literal Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal Label</em>'.
	 * @see org.eclipse.papyrus.umldi.LiteralLabel
	 * @generated
	 */
	EClass getLiteralLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.LiteralLabel#getLiteralCompartment
	 * <em>Literal Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Literal Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.LiteralLabel#getLiteralCompartment()
	 * @see #getLiteralLabel()
	 * @generated
	 */
	EReference getLiteralLabel_LiteralCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.RoleLabel <em>Role Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Role Label</em>'.
	 * @see org.eclipse.papyrus.umldi.RoleLabel
	 * @generated
	 */
	EClass getRoleLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.RoleLabel#getAssociationEdge <em>Association Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Association Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.RoleLabel#getAssociationEdge()
	 * @see #getRoleLabel()
	 * @generated
	 */
	EReference getRoleLabel_AssociationEdge();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.RoleLabel#getInstanceSpecificationEdge
	 * <em>Instance Specification Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Instance Specification Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.RoleLabel#getInstanceSpecificationEdge()
	 * @see #getRoleLabel()
	 * @generated
	 */
	EReference getRoleLabel_InstanceSpecificationEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.SignalShape <em>Signal Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Signal Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.SignalShape
	 * @generated
	 */
	EClass getSignalShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ModelShape <em>Model Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Model Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.ModelShape
	 * @generated
	 */
	EClass getModelShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ContainmentEdge <em>Containment Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Containment Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.ContainmentEdge
	 * @generated
	 */
	EClass getContainmentEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.GeneralizationEdge <em>Generalization Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Generalization Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.GeneralizationEdge
	 * @generated
	 */
	EClass getGeneralizationEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.AssociationEdge <em>Association Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Association Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.AssociationEdge
	 * @generated
	 */
	EClass getAssociationEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.MultiplicityLabel <em>Multiplicity Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Multiplicity Label</em>'.
	 * @see org.eclipse.papyrus.umldi.MultiplicityLabel
	 * @generated
	 */
	EClass getMultiplicityLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.MultiplicityLabel#getPropertyEdge <em>Property Edge</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Property Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.MultiplicityLabel#getPropertyEdge()
	 * @see #getMultiplicityLabel()
	 * @generated
	 */
	EReference getMultiplicityLabel_PropertyEdge();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.MultiplicityLabel#getAssociationEdge
	 * <em>Association Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Association Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.MultiplicityLabel#getAssociationEdge()
	 * @see #getMultiplicityLabel()
	 * @generated
	 */
	EReference getMultiplicityLabel_AssociationEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.AssociationEdge#getEndMultiplicityLabel
	 * <em>End Multiplicity Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>End Multiplicity Label</em>'.
	 * @see org.eclipse.papyrus.umldi.AssociationEdge#getEndMultiplicityLabel()
	 * @see #getAssociationEdge()
	 * @generated
	 */
	EReference getAssociationEdge_EndMultiplicityLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.AssociationEdge#getEndModifierLabel
	 * <em>End Modifier Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>End Modifier Label</em>'.
	 * @see org.eclipse.papyrus.umldi.AssociationEdge#getEndModifierLabel()
	 * @see #getAssociationEdge()
	 * @generated
	 */
	EReference getAssociationEdge_EndModifierLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.umldi.AssociationEdge#getEndRoleLabel
	 * <em>End Role Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>End Role Label</em>'.
	 * @see org.eclipse.papyrus.umldi.AssociationEdge#getEndRoleLabel()
	 * @see #getAssociationEdge()
	 * @generated
	 */
	EReference getAssociationEdge_EndRoleLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.RealizationEdge <em>Realization Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Realization Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.RealizationEdge
	 * @generated
	 */
	EClass getRealizationEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.AbstractionEdge <em>Abstraction Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Abstraction Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.AbstractionEdge
	 * @generated
	 */
	EClass getAbstractionEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.DependencyEdge <em>Dependency Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Dependency Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.DependencyEdge
	 * @generated
	 */
	EClass getDependencyEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.InterfaceRealizationEdge <em>Interface Realization Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Interface Realization Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.InterfaceRealizationEdge
	 * @generated
	 */
	EClass getInterfaceRealizationEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.UsageEdge <em>Usage Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Usage Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.UsageEdge
	 * @generated
	 */
	EClass getUsageEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ElementImportEdge <em>Element Import Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Element Import Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.ElementImportEdge
	 * @generated
	 */
	EClass getElementImportEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.PackageImportEdge <em>Package Import Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Package Import Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.PackageImportEdge
	 * @generated
	 */
	EClass getPackageImportEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.PackageMergeEdge <em>Package Merge Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Package Merge Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.PackageMergeEdge
	 * @generated
	 */
	EClass getPackageMergeEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.SubstitutionEdge <em>Substitution Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Substitution Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.SubstitutionEdge
	 * @generated
	 */
	EClass getSubstitutionEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.InformationFlowEdge <em>Information Flow Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Information Flow Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.InformationFlowEdge
	 * @generated
	 */
	EClass getInformationFlowEdge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.InformationFlowEdge#getItemLabel <em>Item Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Item Label</em>'.
	 * @see org.eclipse.papyrus.umldi.InformationFlowEdge#getItemLabel()
	 * @see #getInformationFlowEdge()
	 * @generated
	 */
	EReference getInformationFlowEdge_ItemLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ItemLabel <em>Item Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Item Label</em>'.
	 * @see org.eclipse.papyrus.umldi.ItemLabel
	 * @generated
	 */
	EClass getItemLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.ItemLabel#getInformationFlowEdge
	 * <em>Information Flow Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Information Flow Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.ItemLabel#getInformationFlowEdge()
	 * @see #getItemLabel()
	 * @generated
	 */
	EReference getItemLabel_InformationFlowEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.AssociationClassEdge <em>Association Class Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Association Class Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.AssociationClassEdge
	 * @generated
	 */
	EClass getAssociationClassEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.GeneralizationSetEdge <em>Generalization Set Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Generalization Set Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.GeneralizationSetEdge
	 * @generated
	 */
	EClass getGeneralizationSetEdge();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.GeneralizationSetEdge#getPowerLabel
	 * <em>Power Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Power Label</em>'.
	 * @see org.eclipse.papyrus.umldi.GeneralizationSetEdge#getPowerLabel()
	 * @see #getGeneralizationSetEdge()
	 * @generated
	 */
	EReference getGeneralizationSetEdge_PowerLabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.papyrus.umldi.GeneralizationSetEdge#getModifierLabel
	 * <em>Modifier Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Modifier Label</em>'.
	 * @see org.eclipse.papyrus.umldi.GeneralizationSetEdge#getModifierLabel()
	 * @see #getGeneralizationSetEdge()
	 * @generated
	 */
	EReference getGeneralizationSetEdge_ModifierLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.PowerLabel <em>Power Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Power Label</em>'.
	 * @see org.eclipse.papyrus.umldi.PowerLabel
	 * @generated
	 */
	EClass getPowerLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.PowerLabel#getGeneralizationSetEdge
	 * <em>Generalization Set Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Generalization Set Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.PowerLabel#getGeneralizationSetEdge()
	 * @see #getPowerLabel()
	 * @generated
	 */
	EReference getPowerLabel_GeneralizationSetEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.CommentShape <em>Comment Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Comment Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.CommentShape
	 * @generated
	 */
	EClass getCommentShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.AttachmentEdge <em>Attachment Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Attachment Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.AttachmentEdge
	 * @generated
	 */
	EClass getAttachmentEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.AssociationClassShape <em>Association Class Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Association Class Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.AssociationClassShape
	 * @generated
	 */
	EClass getAssociationClassShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.ComponentShape <em>Component Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Component Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.ComponentShape
	 * @generated
	 */
	EClass getComponentShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.InformationItemShape <em>Information Item Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Information Item Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.InformationItemShape
	 * @generated
	 */
	EClass getInformationItemShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.RepresentationEdge <em>Representation Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Representation Edge</em>'.
	 * @see org.eclipse.papyrus.umldi.RepresentationEdge
	 * @generated
	 */
	EClass getRepresentationEdge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.AssociationShape <em>Association Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Association Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.AssociationShape
	 * @generated
	 */
	EClass getAssociationShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.DependencyShape <em>Dependency Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Dependency Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.DependencyShape
	 * @generated
	 */
	EClass getDependencyShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.TimeObservationShape <em>Time Observation Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Time Observation Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.TimeObservationShape
	 * @generated
	 */
	EClass getTimeObservationShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.DurationObservationShape <em>Duration Observation Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Duration Observation Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.DurationObservationShape
	 * @generated
	 */
	EClass getDurationObservationShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.TemplateParameterCompartment <em>Template Parameter Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Template Parameter Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.TemplateParameterCompartment
	 * @generated
	 */
	EClass getTemplateParameterCompartment();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.umldi.TemplateParameterCompartment#getTemplateParameterLabel <em>Template Parameter Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Template Parameter Label</em>'.
	 * @see org.eclipse.papyrus.umldi.TemplateParameterCompartment#getTemplateParameterLabel()
	 * @see #getTemplateParameterCompartment()
	 * @generated
	 */
	EReference getTemplateParameterCompartment_TemplateParameterLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.TemplateParameterCompartment#getTemplateableElementShape
	 * <em>Templateable Element Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Templateable Element Shape</em>'.
	 * @see org.eclipse.papyrus.umldi.TemplateParameterCompartment#getTemplateableElementShape()
	 * @see #getTemplateParameterCompartment()
	 * @generated
	 */
	EReference getTemplateParameterCompartment_TemplateableElementShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umldi.TemplateParameterLabel <em>Template Parameter Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Template Parameter Label</em>'.
	 * @see org.eclipse.papyrus.umldi.TemplateParameterLabel
	 * @generated
	 */
	EClass getTemplateParameterLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.papyrus.umldi.TemplateParameterLabel#getTemplateParameterCompartment
	 * <em>Template Parameter Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Template Parameter Compartment</em>'.
	 * @see org.eclipse.papyrus.umldi.TemplateParameterLabel#getTemplateParameterCompartment()
	 * @see #getTemplateParameterLabel()
	 * @generated
	 */
	EReference getTemplateParameterLabel_TemplateParameterCompartment();

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
		 * The meta object literal for the '<em><b>Top Uml Diagram Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UML_DIAGRAM__TOP_UML_DIAGRAM_ELEMENT = eINSTANCE.getUmlDiagram_TopUmlDiagramElement();

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
		 * The meta object literal for the '<em><b>Uml Model Element</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Owning Uml Diagram Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UML_DIAGRAM_ELEMENT__OWNING_UML_DIAGRAM_ELEMENT = eINSTANCE.getUmlDiagramElement_OwningUmlDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Owned Uml Diagram Element</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.TopUmlDiagramElementImpl <em>Top Uml Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.TopUmlDiagramElementImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getTopUmlDiagramElement()
		 * @generated
		 */
		EClass TOP_UML_DIAGRAM_ELEMENT = eINSTANCE.getTopUmlDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Package Compartment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TOP_UML_DIAGRAM_ELEMENT__PACKAGE_COMPARTMENT = eINSTANCE.getTopUmlDiagramElement_PackageCompartment();

		/**
		 * The meta object literal for the '<em><b>Uml Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TOP_UML_DIAGRAM_ELEMENT__UML_DIAGRAM = eINSTANCE.getTopUmlDiagramElement_UmlDiagram();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ClassDiagramImpl <em>Class Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ClassDiagramImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassDiagram()
		 * @generated
		 */
		EClass CLASS_DIAGRAM = eINSTANCE.getClassDiagram();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.StructureDiagramImpl <em>Structure Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.StructureDiagramImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getStructureDiagram()
		 * @generated
		 */
		EClass STRUCTURE_DIAGRAM = eINSTANCE.getStructureDiagram();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ClassifierShapeImpl <em>Classifier Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ClassifierShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassifierShape()
		 * @generated
		 */
		EClass CLASSIFIER_SHAPE = eINSTANCE.getClassifierShape();

		/**
		 * The meta object literal for the '<em><b>Is Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CLASSIFIER_SHAPE__IS_ICON = eINSTANCE.getClassifierShape_IsIcon();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.PackageShapeImpl <em>Package Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.PackageShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPackageShape()
		 * @generated
		 */
		EClass PACKAGE_SHAPE = eINSTANCE.getPackageShape();

		/**
		 * The meta object literal for the '<em><b>Packaged Element Compartment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE_SHAPE__PACKAGED_ELEMENT_COMPARTMENT = eINSTANCE.getPackageShape_PackagedElementCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.TemplateableElementShapeImpl <em>Templateable Element Shape</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.TemplateableElementShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getTemplateableElementShape()
		 * @generated
		 */
		EClass TEMPLATEABLE_ELEMENT_SHAPE = eINSTANCE.getTemplateableElementShape();

		/**
		 * The meta object literal for the '<em><b>Template Parameter Compartment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TEMPLATEABLE_ELEMENT_SHAPE__TEMPLATE_PARAMETER_COMPARTMENT = eINSTANCE.getTemplateableElementShape_TemplateParameterCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.NamedShapeImpl <em>Named Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.NamedShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getNamedShape()
		 * @generated
		 */
		EClass NAMED_SHAPE = eINSTANCE.getNamedShape();

		/**
		 * The meta object literal for the '<em><b>Name Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NAMED_SHAPE__NAME_LABEL = eINSTANCE.getNamedShape_NameLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ConstraintShapeImpl <em>Constraint Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ConstraintShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getConstraintShape()
		 * @generated
		 */
		EClass CONSTRAINT_SHAPE = eINSTANCE.getConstraintShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.BodyShapeImpl <em>Body Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.BodyShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getBodyShape()
		 * @generated
		 */
		EClass BODY_SHAPE = eINSTANCE.getBodyShape();

		/**
		 * The meta object literal for the '<em><b>Body Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BODY_SHAPE__BODY_LABEL = eINSTANCE.getBodyShape_BodyLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.AttributeCompartmentImpl <em>Attribute Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.AttributeCompartmentImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAttributeCompartment()
		 * @generated
		 */
		EClass ATTRIBUTE_COMPARTMENT = eINSTANCE.getAttributeCompartment();

		/**
		 * The meta object literal for the '<em><b>Classifier With Attributes Shape</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ATTRIBUTE_COMPARTMENT__CLASSIFIER_WITH_ATTRIBUTES_SHAPE = eINSTANCE.getAttributeCompartment_ClassifierWithAttributesShape();

		/**
		 * The meta object literal for the '<em><b>Attribute Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ATTRIBUTE_COMPARTMENT__ATTRIBUTE_LABEL = eINSTANCE.getAttributeCompartment_AttributeLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.OperationCompartmentImpl <em>Operation Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.OperationCompartmentImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getOperationCompartment()
		 * @generated
		 */
		EClass OPERATION_COMPARTMENT = eINSTANCE.getOperationCompartment();

		/**
		 * The meta object literal for the '<em><b>Classifier With Operations Shape</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION_COMPARTMENT__CLASSIFIER_WITH_OPERATIONS_SHAPE = eINSTANCE.getOperationCompartment_ClassifierWithOperationsShape();

		/**
		 * The meta object literal for the '<em><b>Operation Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION_COMPARTMENT__OPERATION_LABEL = eINSTANCE.getOperationCompartment_OperationLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ReceptionCompartmentImpl <em>Reception Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ReceptionCompartmentImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getReceptionCompartment()
		 * @generated
		 */
		EClass RECEPTION_COMPARTMENT = eINSTANCE.getReceptionCompartment();

		/**
		 * The meta object literal for the '<em><b>Signal Shape</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RECEPTION_COMPARTMENT__SIGNAL_SHAPE = eINSTANCE.getReceptionCompartment_SignalShape();

		/**
		 * The meta object literal for the '<em><b>Reception Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RECEPTION_COMPARTMENT__RECEPTION_LABEL = eINSTANCE.getReceptionCompartment_ReceptionLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.LiteralCompartmentImpl <em>Literal Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.LiteralCompartmentImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getLiteralCompartment()
		 * @generated
		 */
		EClass LITERAL_COMPARTMENT = eINSTANCE.getLiteralCompartment();

		/**
		 * The meta object literal for the '<em><b>Enumeration Shape</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LITERAL_COMPARTMENT__ENUMERATION_SHAPE = eINSTANCE.getLiteralCompartment_EnumerationShape();

		/**
		 * The meta object literal for the '<em><b>Literal Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LITERAL_COMPARTMENT__LITERAL_LABEL = eINSTANCE.getLiteralCompartment_LiteralLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.PackagedElementCompartmentImpl
		 * <em>Packaged Element Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.PackagedElementCompartmentImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPackagedElementCompartment()
		 * @generated
		 */
		EClass PACKAGED_ELEMENT_COMPARTMENT = eINSTANCE.getPackagedElementCompartment();

		/**
		 * The meta object literal for the '<em><b>Package Shape</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGED_ELEMENT_COMPARTMENT__PACKAGE_SHAPE = eINSTANCE.getPackagedElementCompartment_PackageShape();

		/**
		 * The meta object literal for the '<em><b>Top Uml Diagram Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGED_ELEMENT_COMPARTMENT__TOP_UML_DIAGRAM_ELEMENT = eINSTANCE.getPackagedElementCompartment_TopUmlDiagramElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.NameLabelImpl <em>Name Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.NameLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getNameLabel()
		 * @generated
		 */
		EClass NAME_LABEL = eINSTANCE.getNameLabel();

		/**
		 * The meta object literal for the '<em><b>Named Element Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NAME_LABEL__NAMED_ELEMENT_EDGE = eINSTANCE.getNameLabel_NamedElementEdge();

		/**
		 * The meta object literal for the '<em><b>Named Element Shape</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NAME_LABEL__NAMED_ELEMENT_SHAPE = eINSTANCE.getNameLabel_NamedElementShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.NamedEdgeImpl <em>Named Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.NamedEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getNamedEdge()
		 * @generated
		 */
		EClass NAMED_EDGE = eINSTANCE.getNamedEdge();

		/**
		 * The meta object literal for the '<em><b>Name Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NAMED_EDGE__NAME_LABEL = eINSTANCE.getNamedEdge_NameLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.PropertyEdgeImpl <em>Property Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.PropertyEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPropertyEdge()
		 * @generated
		 */
		EClass PROPERTY_EDGE = eINSTANCE.getPropertyEdge();

		/**
		 * The meta object literal for the '<em><b>Modifier Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY_EDGE__MODIFIER_LABEL = eINSTANCE.getPropertyEdge_ModifierLabel();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY_EDGE__MULTIPLICITY_LABEL = eINSTANCE.getPropertyEdge_MultiplicityLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ModifierLabelImpl <em>Modifier Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ModifierLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getModifierLabel()
		 * @generated
		 */
		EClass MODIFIER_LABEL = eINSTANCE.getModifierLabel();

		/**
		 * The meta object literal for the '<em><b>Association Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODIFIER_LABEL__ASSOCIATION_EDGE = eINSTANCE.getModifierLabel_AssociationEdge();

		/**
		 * The meta object literal for the '<em><b>Generalization Set Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODIFIER_LABEL__GENERALIZATION_SET_EDGE = eINSTANCE.getModifierLabel_GeneralizationSetEdge();

		/**
		 * The meta object literal for the '<em><b>Property Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MODIFIER_LABEL__PROPERTY_EDGE = eINSTANCE.getModifierLabel_PropertyEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.InstanceSpecificationEdgeImpl <em>Instance Specification Edge</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.InstanceSpecificationEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInstanceSpecificationEdge()
		 * @generated
		 */
		EClass INSTANCE_SPECIFICATION_EDGE = eINSTANCE.getInstanceSpecificationEdge();

		/**
		 * The meta object literal for the '<em><b>End Role Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTANCE_SPECIFICATION_EDGE__END_ROLE_LABEL = eINSTANCE.getInstanceSpecificationEdge_EndRoleLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.BodyLabelImpl <em>Body Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.BodyLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getBodyLabel()
		 * @generated
		 */
		EClass BODY_LABEL = eINSTANCE.getBodyLabel();

		/**
		 * The meta object literal for the '<em><b>Constraint Shape</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BODY_LABEL__CONSTRAINT_SHAPE = eINSTANCE.getBodyLabel_ConstraintShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.InstanceSpecificationShapeImpl
		 * <em>Instance Specification Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.InstanceSpecificationShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInstanceSpecificationShape()
		 * @generated
		 */
		EClass INSTANCE_SPECIFICATION_SHAPE = eINSTANCE.getInstanceSpecificationShape();

		/**
		 * The meta object literal for the '<em><b>Slot Compartment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTANCE_SPECIFICATION_SHAPE__SLOT_COMPARTMENT = eINSTANCE.getInstanceSpecificationShape_SlotCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.SlotCompartmentImpl <em>Slot Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.SlotCompartmentImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getSlotCompartment()
		 * @generated
		 */
		EClass SLOT_COMPARTMENT = eINSTANCE.getSlotCompartment();

		/**
		 * The meta object literal for the '<em><b>Slot Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SLOT_COMPARTMENT__SLOT_LABEL = eINSTANCE.getSlotCompartment_SlotLabel();

		/**
		 * The meta object literal for the '<em><b>Instance Specification Shape</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SLOT_COMPARTMENT__INSTANCE_SPECIFICATION_SHAPE = eINSTANCE.getSlotCompartment_InstanceSpecificationShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.SlotLabelImpl <em>Slot Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.SlotLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getSlotLabel()
		 * @generated
		 */
		EClass SLOT_LABEL = eINSTANCE.getSlotLabel();

		/**
		 * The meta object literal for the '<em><b>Slot Compartment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SLOT_LABEL__SLOT_COMPARTMENT = eINSTANCE.getSlotLabel_SlotCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ClassShapeImpl <em>Class Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ClassShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassShape()
		 * @generated
		 */
		EClass CLASS_SHAPE = eINSTANCE.getClassShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ClassifierWithReceptionsShapeImpl
		 * <em>Classifier With Receptions Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ClassifierWithReceptionsShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassifierWithReceptionsShape()
		 * @generated
		 */
		EClass CLASSIFIER_WITH_RECEPTIONS_SHAPE = eINSTANCE.getClassifierWithReceptionsShape();

		/**
		 * The meta object literal for the '<em><b>Reception Compartment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASSIFIER_WITH_RECEPTIONS_SHAPE__RECEPTION_COMPARTMENT = eINSTANCE.getClassifierWithReceptionsShape_ReceptionCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ReceptionLabelImpl <em>Reception Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ReceptionLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getReceptionLabel()
		 * @generated
		 */
		EClass RECEPTION_LABEL = eINSTANCE.getReceptionLabel();

		/**
		 * The meta object literal for the '<em><b>Reception Compartment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RECEPTION_LABEL__RECEPTION_COMPARTMENT = eINSTANCE.getReceptionLabel_ReceptionCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ClassifierWithAttributesShapeImpl
		 * <em>Classifier With Attributes Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ClassifierWithAttributesShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassifierWithAttributesShape()
		 * @generated
		 */
		EClass CLASSIFIER_WITH_ATTRIBUTES_SHAPE = eINSTANCE.getClassifierWithAttributesShape();

		/**
		 * The meta object literal for the '<em><b>Attribute Compartment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASSIFIER_WITH_ATTRIBUTES_SHAPE__ATTRIBUTE_COMPARTMENT = eINSTANCE.getClassifierWithAttributesShape_AttributeCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.PropertyLabelImpl <em>Property Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.PropertyLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPropertyLabel()
		 * @generated
		 */
		EClass PROPERTY_LABEL = eINSTANCE.getPropertyLabel();

		/**
		 * The meta object literal for the '<em><b>Attribute Compartment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY_LABEL__ATTRIBUTE_COMPARTMENT = eINSTANCE.getPropertyLabel_AttributeCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ClassifierWithOperationsShapeImpl
		 * <em>Classifier With Operations Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ClassifierWithOperationsShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getClassifierWithOperationsShape()
		 * @generated
		 */
		EClass CLASSIFIER_WITH_OPERATIONS_SHAPE = eINSTANCE.getClassifierWithOperationsShape();

		/**
		 * The meta object literal for the '<em><b>Operation Compartment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASSIFIER_WITH_OPERATIONS_SHAPE__OPERATION_COMPARTMENT = eINSTANCE.getClassifierWithOperationsShape_OperationCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.OperationLabelImpl <em>Operation Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.OperationLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getOperationLabel()
		 * @generated
		 */
		EClass OPERATION_LABEL = eINSTANCE.getOperationLabel();

		/**
		 * The meta object literal for the '<em><b>Operation Compartment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATION_LABEL__OPERATION_COMPARTMENT = eINSTANCE.getOperationLabel_OperationCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.InterfaceShapeImpl <em>Interface Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.InterfaceShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInterfaceShape()
		 * @generated
		 */
		EClass INTERFACE_SHAPE = eINSTANCE.getInterfaceShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.DataTypeShapeImpl <em>Data Type Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.DataTypeShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getDataTypeShape()
		 * @generated
		 */
		EClass DATA_TYPE_SHAPE = eINSTANCE.getDataTypeShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.PrimitiveTypeShapeImpl <em>Primitive Type Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.PrimitiveTypeShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPrimitiveTypeShape()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_SHAPE = eINSTANCE.getPrimitiveTypeShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.EnumerationShapeImpl <em>Enumeration Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.EnumerationShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getEnumerationShape()
		 * @generated
		 */
		EClass ENUMERATION_SHAPE = eINSTANCE.getEnumerationShape();

		/**
		 * The meta object literal for the '<em><b>Literal Compartment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENUMERATION_SHAPE__LITERAL_COMPARTMENT = eINSTANCE.getEnumerationShape_LiteralCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.LiteralLabelImpl <em>Literal Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.LiteralLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getLiteralLabel()
		 * @generated
		 */
		EClass LITERAL_LABEL = eINSTANCE.getLiteralLabel();

		/**
		 * The meta object literal for the '<em><b>Literal Compartment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LITERAL_LABEL__LITERAL_COMPARTMENT = eINSTANCE.getLiteralLabel_LiteralCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.RoleLabelImpl <em>Role Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.RoleLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getRoleLabel()
		 * @generated
		 */
		EClass ROLE_LABEL = eINSTANCE.getRoleLabel();

		/**
		 * The meta object literal for the '<em><b>Association Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ROLE_LABEL__ASSOCIATION_EDGE = eINSTANCE.getRoleLabel_AssociationEdge();

		/**
		 * The meta object literal for the '<em><b>Instance Specification Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ROLE_LABEL__INSTANCE_SPECIFICATION_EDGE = eINSTANCE.getRoleLabel_InstanceSpecificationEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.SignalShapeImpl <em>Signal Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.SignalShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getSignalShape()
		 * @generated
		 */
		EClass SIGNAL_SHAPE = eINSTANCE.getSignalShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ModelShapeImpl <em>Model Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ModelShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getModelShape()
		 * @generated
		 */
		EClass MODEL_SHAPE = eINSTANCE.getModelShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ContainmentEdgeImpl <em>Containment Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ContainmentEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getContainmentEdge()
		 * @generated
		 */
		EClass CONTAINMENT_EDGE = eINSTANCE.getContainmentEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.GeneralizationEdgeImpl <em>Generalization Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.GeneralizationEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getGeneralizationEdge()
		 * @generated
		 */
		EClass GENERALIZATION_EDGE = eINSTANCE.getGeneralizationEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.AssociationEdgeImpl <em>Association Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.AssociationEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAssociationEdge()
		 * @generated
		 */
		EClass ASSOCIATION_EDGE = eINSTANCE.getAssociationEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.MultiplicityLabelImpl <em>Multiplicity Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.MultiplicityLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getMultiplicityLabel()
		 * @generated
		 */
		EClass MULTIPLICITY_LABEL = eINSTANCE.getMultiplicityLabel();

		/**
		 * The meta object literal for the '<em><b>Property Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MULTIPLICITY_LABEL__PROPERTY_EDGE = eINSTANCE.getMultiplicityLabel_PropertyEdge();

		/**
		 * The meta object literal for the '<em><b>Association Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MULTIPLICITY_LABEL__ASSOCIATION_EDGE = eINSTANCE.getMultiplicityLabel_AssociationEdge();

		/**
		 * The meta object literal for the '<em><b>End Multiplicity Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL = eINSTANCE.getAssociationEdge_EndMultiplicityLabel();

		/**
		 * The meta object literal for the '<em><b>End Modifier Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_EDGE__END_MODIFIER_LABEL = eINSTANCE.getAssociationEdge_EndModifierLabel();

		/**
		 * The meta object literal for the '<em><b>End Role Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_EDGE__END_ROLE_LABEL = eINSTANCE.getAssociationEdge_EndRoleLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.RealizationEdgeImpl <em>Realization Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.RealizationEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getRealizationEdge()
		 * @generated
		 */
		EClass REALIZATION_EDGE = eINSTANCE.getRealizationEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.AbstractionEdgeImpl <em>Abstraction Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.AbstractionEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAbstractionEdge()
		 * @generated
		 */
		EClass ABSTRACTION_EDGE = eINSTANCE.getAbstractionEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.DependencyEdgeImpl <em>Dependency Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.DependencyEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getDependencyEdge()
		 * @generated
		 */
		EClass DEPENDENCY_EDGE = eINSTANCE.getDependencyEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.InterfaceRealizationEdgeImpl <em>Interface Realization Edge</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.InterfaceRealizationEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInterfaceRealizationEdge()
		 * @generated
		 */
		EClass INTERFACE_REALIZATION_EDGE = eINSTANCE.getInterfaceRealizationEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.UsageEdgeImpl <em>Usage Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.UsageEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getUsageEdge()
		 * @generated
		 */
		EClass USAGE_EDGE = eINSTANCE.getUsageEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ElementImportEdgeImpl <em>Element Import Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ElementImportEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getElementImportEdge()
		 * @generated
		 */
		EClass ELEMENT_IMPORT_EDGE = eINSTANCE.getElementImportEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.PackageImportEdgeImpl <em>Package Import Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.PackageImportEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPackageImportEdge()
		 * @generated
		 */
		EClass PACKAGE_IMPORT_EDGE = eINSTANCE.getPackageImportEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.PackageMergeEdgeImpl <em>Package Merge Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.PackageMergeEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPackageMergeEdge()
		 * @generated
		 */
		EClass PACKAGE_MERGE_EDGE = eINSTANCE.getPackageMergeEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.SubstitutionEdgeImpl <em>Substitution Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.SubstitutionEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getSubstitutionEdge()
		 * @generated
		 */
		EClass SUBSTITUTION_EDGE = eINSTANCE.getSubstitutionEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.InformationFlowEdgeImpl <em>Information Flow Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.InformationFlowEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInformationFlowEdge()
		 * @generated
		 */
		EClass INFORMATION_FLOW_EDGE = eINSTANCE.getInformationFlowEdge();

		/**
		 * The meta object literal for the '<em><b>Item Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INFORMATION_FLOW_EDGE__ITEM_LABEL = eINSTANCE.getInformationFlowEdge_ItemLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ItemLabelImpl <em>Item Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ItemLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getItemLabel()
		 * @generated
		 */
		EClass ITEM_LABEL = eINSTANCE.getItemLabel();

		/**
		 * The meta object literal for the '<em><b>Information Flow Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ITEM_LABEL__INFORMATION_FLOW_EDGE = eINSTANCE.getItemLabel_InformationFlowEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.AssociationClassEdgeImpl <em>Association Class Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.AssociationClassEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAssociationClassEdge()
		 * @generated
		 */
		EClass ASSOCIATION_CLASS_EDGE = eINSTANCE.getAssociationClassEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.GeneralizationSetEdgeImpl <em>Generalization Set Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.GeneralizationSetEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getGeneralizationSetEdge()
		 * @generated
		 */
		EClass GENERALIZATION_SET_EDGE = eINSTANCE.getGeneralizationSetEdge();

		/**
		 * The meta object literal for the '<em><b>Power Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GENERALIZATION_SET_EDGE__POWER_LABEL = eINSTANCE.getGeneralizationSetEdge_PowerLabel();

		/**
		 * The meta object literal for the '<em><b>Modifier Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GENERALIZATION_SET_EDGE__MODIFIER_LABEL = eINSTANCE.getGeneralizationSetEdge_ModifierLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.PowerLabelImpl <em>Power Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.PowerLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getPowerLabel()
		 * @generated
		 */
		EClass POWER_LABEL = eINSTANCE.getPowerLabel();

		/**
		 * The meta object literal for the '<em><b>Generalization Set Edge</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference POWER_LABEL__GENERALIZATION_SET_EDGE = eINSTANCE.getPowerLabel_GeneralizationSetEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.CommentShapeImpl <em>Comment Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.CommentShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getCommentShape()
		 * @generated
		 */
		EClass COMMENT_SHAPE = eINSTANCE.getCommentShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.AttachmentEdgeImpl <em>Attachment Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.AttachmentEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAttachmentEdge()
		 * @generated
		 */
		EClass ATTACHMENT_EDGE = eINSTANCE.getAttachmentEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.AssociationClassShapeImpl <em>Association Class Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.AssociationClassShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAssociationClassShape()
		 * @generated
		 */
		EClass ASSOCIATION_CLASS_SHAPE = eINSTANCE.getAssociationClassShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.ComponentShapeImpl <em>Component Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.ComponentShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getComponentShape()
		 * @generated
		 */
		EClass COMPONENT_SHAPE = eINSTANCE.getComponentShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.InformationItemShapeImpl <em>Information Item Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.InformationItemShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getInformationItemShape()
		 * @generated
		 */
		EClass INFORMATION_ITEM_SHAPE = eINSTANCE.getInformationItemShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.RepresentationEdgeImpl <em>Representation Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.RepresentationEdgeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getRepresentationEdge()
		 * @generated
		 */
		EClass REPRESENTATION_EDGE = eINSTANCE.getRepresentationEdge();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.AssociationShapeImpl <em>Association Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.AssociationShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getAssociationShape()
		 * @generated
		 */
		EClass ASSOCIATION_SHAPE = eINSTANCE.getAssociationShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.DependencyShapeImpl <em>Dependency Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.DependencyShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getDependencyShape()
		 * @generated
		 */
		EClass DEPENDENCY_SHAPE = eINSTANCE.getDependencyShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.TimeObservationShapeImpl <em>Time Observation Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.TimeObservationShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getTimeObservationShape()
		 * @generated
		 */
		EClass TIME_OBSERVATION_SHAPE = eINSTANCE.getTimeObservationShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.DurationObservationShapeImpl <em>Duration Observation Shape</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.DurationObservationShapeImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getDurationObservationShape()
		 * @generated
		 */
		EClass DURATION_OBSERVATION_SHAPE = eINSTANCE.getDurationObservationShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.TemplateParameterCompartmentImpl
		 * <em>Template Parameter Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.TemplateParameterCompartmentImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getTemplateParameterCompartment()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER_COMPARTMENT = eINSTANCE.getTemplateParameterCompartment();

		/**
		 * The meta object literal for the '<em><b>Template Parameter Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATE_PARAMETER_LABEL = eINSTANCE.getTemplateParameterCompartment_TemplateParameterLabel();

		/**
		 * The meta object literal for the '<em><b>Templateable Element Shape</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER_COMPARTMENT__TEMPLATEABLE_ELEMENT_SHAPE = eINSTANCE.getTemplateParameterCompartment_TemplateableElementShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umldi.impl.TemplateParameterLabelImpl <em>Template Parameter Label</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.umldi.impl.TemplateParameterLabelImpl
		 * @see org.eclipse.papyrus.umldi.impl.UMLDIPackageImpl#getTemplateParameterLabel()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER_LABEL = eINSTANCE.getTemplateParameterLabel();

		/**
		 * The meta object literal for the '<em><b>Template Parameter Compartment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER_LABEL__TEMPLATE_PARAMETER_COMPARTMENT = eINSTANCE.getTemplateParameterLabel_TemplateParameterCompartment();

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
} //UMLDIPackage
