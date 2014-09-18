/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.umlnotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationFactory
 * @model kind="package"
 * @generated
 */
public interface PapyrusUMLNotationPackage extends EPackage {

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "umlnotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/umlnotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "umlnotationext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	PapyrusUMLNotationPackage eINSTANCE = org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLDiagramImpl <em>UML Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLDiagramImpl
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLDiagram()
	 * @generated
	 */
	int UML_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__EANNOTATIONS = NotationPackage.DIAGRAM__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__VISIBLE = NotationPackage.DIAGRAM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__TYPE = NotationPackage.DIAGRAM__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__MUTABLE = NotationPackage.DIAGRAM__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SOURCE_EDGES = NotationPackage.DIAGRAM__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__TARGET_EDGES = NotationPackage.DIAGRAM__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__PERSISTED_CHILDREN = NotationPackage.DIAGRAM__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__STYLES = NotationPackage.DIAGRAM__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__ELEMENT = NotationPackage.DIAGRAM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__DIAGRAM = NotationPackage.DIAGRAM__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__TRANSIENT_CHILDREN = NotationPackage.DIAGRAM__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__NAME = NotationPackage.DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Measurement Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__MEASUREMENT_UNIT = NotationPackage.DIAGRAM__MEASUREMENT_UNIT;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PERSISTED_EDGES = NotationPackage.DIAGRAM__PERSISTED_EDGES;

	/**
	 * The feature id for the '<em><b>Transient Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__TRANSIENT_EDGES = NotationPackage.DIAGRAM__TRANSIENT_EDGES;

	/**
	 * The feature id for the '<em><b>Show Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SHOW_STEREOTYPE = NotationPackage.DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show List Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SHOW_LIST_VISIBILITY = NotationPackage.DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show List Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SHOW_LIST_SIGNATURE = NotationPackage.DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__ALIGNMENT = NotationPackage.DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Show Stereotype Attribute Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT = NotationPackage.DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>UML Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_FEATURE_COUNT = NotationPackage.DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLShapeImpl <em>UML Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLShapeImpl
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLShape()
	 * @generated
	 */
	int UML_SHAPE = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__EANNOTATIONS = NotationPackage.SHAPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__VISIBLE = NotationPackage.SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__TYPE = NotationPackage.SHAPE__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__MUTABLE = NotationPackage.SHAPE__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SOURCE_EDGES = NotationPackage.SHAPE__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__TARGET_EDGES = NotationPackage.SHAPE__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__PERSISTED_CHILDREN = NotationPackage.SHAPE__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__STYLES = NotationPackage.SHAPE__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__ELEMENT = NotationPackage.SHAPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__DIAGRAM = NotationPackage.SHAPE__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__TRANSIENT_CHILDREN = NotationPackage.SHAPE__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Layout Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__LAYOUT_CONSTRAINT = NotationPackage.SHAPE__LAYOUT_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__FONT_COLOR = NotationPackage.SHAPE__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__FONT_NAME = NotationPackage.SHAPE__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__FONT_HEIGHT = NotationPackage.SHAPE__FONT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__BOLD = NotationPackage.SHAPE__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__ITALIC = NotationPackage.SHAPE__ITALIC;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__UNDERLINE = NotationPackage.SHAPE__UNDERLINE;

	/**
	 * The feature id for the '<em><b>Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__STRIKE_THROUGH = NotationPackage.SHAPE__STRIKE_THROUGH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__DESCRIPTION = NotationPackage.SHAPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__FILL_COLOR = NotationPackage.SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__TRANSPARENCY = NotationPackage.SHAPE__TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__GRADIENT = NotationPackage.SHAPE__GRADIENT;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__LINE_COLOR = NotationPackage.SHAPE__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__LINE_WIDTH = NotationPackage.SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Rounded Bendpoints Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__ROUNDED_BENDPOINTS_RADIUS = NotationPackage.SHAPE__ROUNDED_BENDPOINTS_RADIUS;

	/**
	 * The feature id for the '<em><b>Show Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SHOW_STEREOTYPE = NotationPackage.SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show List Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SHOW_LIST_VISIBILITY = NotationPackage.SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show List Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SHOW_LIST_SIGNATURE = NotationPackage.SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__ALIGNMENT = NotationPackage.SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Show Stereotype Attribute Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT = NotationPackage.SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>UML Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_FEATURE_COUNT = NotationPackage.SHAPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLFrameImpl <em>UML Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLFrameImpl
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLFrame()
	 * @generated
	 */
	int UML_FRAME = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__EANNOTATIONS = UML_SHAPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__VISIBLE = UML_SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__TYPE = UML_SHAPE__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__MUTABLE = UML_SHAPE__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__SOURCE_EDGES = UML_SHAPE__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__TARGET_EDGES = UML_SHAPE__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__PERSISTED_CHILDREN = UML_SHAPE__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__STYLES = UML_SHAPE__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__ELEMENT = UML_SHAPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__DIAGRAM = UML_SHAPE__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__TRANSIENT_CHILDREN = UML_SHAPE__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Layout Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__LAYOUT_CONSTRAINT = UML_SHAPE__LAYOUT_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__FONT_COLOR = UML_SHAPE__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__FONT_NAME = UML_SHAPE__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__FONT_HEIGHT = UML_SHAPE__FONT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__BOLD = UML_SHAPE__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__ITALIC = UML_SHAPE__ITALIC;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__UNDERLINE = UML_SHAPE__UNDERLINE;

	/**
	 * The feature id for the '<em><b>Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__STRIKE_THROUGH = UML_SHAPE__STRIKE_THROUGH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__DESCRIPTION = UML_SHAPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__FILL_COLOR = UML_SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__TRANSPARENCY = UML_SHAPE__TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__GRADIENT = UML_SHAPE__GRADIENT;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__LINE_COLOR = UML_SHAPE__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__LINE_WIDTH = UML_SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Rounded Bendpoints Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__ROUNDED_BENDPOINTS_RADIUS = UML_SHAPE__ROUNDED_BENDPOINTS_RADIUS;

	/**
	 * The feature id for the '<em><b>Show Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__SHOW_STEREOTYPE = UML_SHAPE__SHOW_STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Show List Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__SHOW_LIST_VISIBILITY = UML_SHAPE__SHOW_LIST_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Show List Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__SHOW_LIST_SIGNATURE = UML_SHAPE__SHOW_LIST_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__ALIGNMENT = UML_SHAPE__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Show Stereotype Attribute Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT = UML_SHAPE__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>UML Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_FRAME_FEATURE_COUNT = UML_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLShapeCompartmentImpl <em>UML Shape Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLShapeCompartmentImpl
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLShapeCompartment()
	 * @generated
	 */
	int UML_SHAPE_COMPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__EANNOTATIONS = NotationPackage.COMPARTMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__VISIBLE = NotationPackage.COMPARTMENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__TYPE = NotationPackage.COMPARTMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__MUTABLE = NotationPackage.COMPARTMENT__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__SOURCE_EDGES = NotationPackage.COMPARTMENT__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__TARGET_EDGES = NotationPackage.COMPARTMENT__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__PERSISTED_CHILDREN = NotationPackage.COMPARTMENT__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__STYLES = NotationPackage.COMPARTMENT__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__ELEMENT = NotationPackage.COMPARTMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__DIAGRAM = NotationPackage.COMPARTMENT__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__TRANSIENT_CHILDREN = NotationPackage.COMPARTMENT__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Layout Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__LAYOUT_CONSTRAINT = NotationPackage.COMPARTMENT__LAYOUT_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__COLLAPSED = NotationPackage.COMPARTMENT__COLLAPSED;

	/**
	 * The feature id for the '<em><b>Canonical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__CANONICAL = NotationPackage.COMPARTMENT__CANONICAL;

	/**
	 * The feature id for the '<em><b>Show Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__SHOW_TITLE = NotationPackage.COMPARTMENT__SHOW_TITLE;

	/**
	 * The feature id for the '<em><b>Show Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__SHOW_STEREOTYPE = NotationPackage.COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show List Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__SHOW_LIST_VISIBILITY = NotationPackage.COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show List Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__SHOW_LIST_SIGNATURE = NotationPackage.COMPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__ALIGNMENT = NotationPackage.COMPARTMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Show Stereotype Attribute Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT = NotationPackage.COMPARTMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT__VERTICAL_ALIGNMENT = NotationPackage.COMPARTMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>UML Shape Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_SHAPE_COMPARTMENT_FEATURE_COUNT = NotationPackage.COMPARTMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl <em>UML Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLConnector()
	 * @generated
	 */
	int UML_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__EANNOTATIONS = NotationPackage.CONNECTOR__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__VISIBLE = NotationPackage.CONNECTOR__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__TYPE = NotationPackage.CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__MUTABLE = NotationPackage.CONNECTOR__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__SOURCE_EDGES = NotationPackage.CONNECTOR__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__TARGET_EDGES = NotationPackage.CONNECTOR__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__PERSISTED_CHILDREN = NotationPackage.CONNECTOR__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__STYLES = NotationPackage.CONNECTOR__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__ELEMENT = NotationPackage.CONNECTOR__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__DIAGRAM = NotationPackage.CONNECTOR__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__TRANSIENT_CHILDREN = NotationPackage.CONNECTOR__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__SOURCE = NotationPackage.CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__TARGET = NotationPackage.CONNECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__BENDPOINTS = NotationPackage.CONNECTOR__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Source Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__SOURCE_ANCHOR = NotationPackage.CONNECTOR__SOURCE_ANCHOR;

	/**
	 * The feature id for the '<em><b>Target Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__TARGET_ANCHOR = NotationPackage.CONNECTOR__TARGET_ANCHOR;

	/**
	 * The feature id for the '<em><b>Rounded Bendpoints Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__ROUNDED_BENDPOINTS_RADIUS = NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__ROUTING = NotationPackage.CONNECTOR__ROUTING;

	/**
	 * The feature id for the '<em><b>Smoothness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__SMOOTHNESS = NotationPackage.CONNECTOR__SMOOTHNESS;

	/**
	 * The feature id for the '<em><b>Avoid Obstructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__AVOID_OBSTRUCTIONS = NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Closest Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__CLOSEST_DISTANCE = NotationPackage.CONNECTOR__CLOSEST_DISTANCE;

	/**
	 * The feature id for the '<em><b>Jump Link Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__JUMP_LINK_STATUS = NotationPackage.CONNECTOR__JUMP_LINK_STATUS;

	/**
	 * The feature id for the '<em><b>Jump Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__JUMP_LINK_TYPE = NotationPackage.CONNECTOR__JUMP_LINK_TYPE;

	/**
	 * The feature id for the '<em><b>Jump Links Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__JUMP_LINKS_REVERSE = NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__LINE_COLOR = NotationPackage.CONNECTOR__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__LINE_WIDTH = NotationPackage.CONNECTOR__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__FONT_COLOR = NotationPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__FONT_NAME = NotationPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__FONT_HEIGHT = NotationPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__BOLD = NotationPackage.CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__ITALIC = NotationPackage.CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__UNDERLINE = NotationPackage.CONNECTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__STRIKE_THROUGH = NotationPackage.CONNECTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Show Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__SHOW_STEREOTYPE = NotationPackage.CONNECTOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Show List Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__SHOW_LIST_VISIBILITY = NotationPackage.CONNECTOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Show List Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__SHOW_LIST_SIGNATURE = NotationPackage.CONNECTOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__ALIGNMENT = NotationPackage.CONNECTOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Show Stereotype Attribute Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT = NotationPackage.CONNECTOR_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>UML Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CONNECTOR_FEATURE_COUNT = NotationPackage.CONNECTOR_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLViewImpl <em>UML View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLViewImpl
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLView()
	 * @generated
	 */
	int UML_VIEW = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__EANNOTATIONS = NotationPackage.VIEW__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__VISIBLE = NotationPackage.VIEW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__TYPE = NotationPackage.VIEW__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__MUTABLE = NotationPackage.VIEW__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__SOURCE_EDGES = NotationPackage.VIEW__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__TARGET_EDGES = NotationPackage.VIEW__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__PERSISTED_CHILDREN = NotationPackage.VIEW__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__STYLES = NotationPackage.VIEW__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__ELEMENT = NotationPackage.VIEW__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__DIAGRAM = NotationPackage.VIEW__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__TRANSIENT_CHILDREN = NotationPackage.VIEW__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Show Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__SHOW_STEREOTYPE = NotationPackage.VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show List Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__SHOW_LIST_VISIBILITY = NotationPackage.VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show List Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__SHOW_LIST_SIGNATURE = NotationPackage.VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__ALIGNMENT = NotationPackage.VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Show Stereotype Attribute Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT = NotationPackage.VIEW_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>UML View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_VIEW_FEATURE_COUNT = NotationPackage.VIEW_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLComponentImpl <em>UML Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLComponentImpl
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLComponent()
	 * @generated
	 */
	int UML_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__EANNOTATIONS = UML_SHAPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__VISIBLE = UML_SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__TYPE = UML_SHAPE__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__MUTABLE = UML_SHAPE__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__SOURCE_EDGES = UML_SHAPE__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__TARGET_EDGES = UML_SHAPE__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__CHILDREN = UML_SHAPE__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__STYLES = UML_SHAPE__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__ELEMENT = UML_SHAPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__DIAGRAM = UML_SHAPE__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__TRANSIENT_CHILDREN = UML_SHAPE__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Layout Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__LAYOUT_CONSTRAINT = UML_SHAPE__LAYOUT_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__FONT_COLOR = UML_SHAPE__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__FONT_NAME = UML_SHAPE__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__FONT_HEIGHT = UML_SHAPE__FONT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__BOLD = UML_SHAPE__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__ITALIC = UML_SHAPE__ITALIC;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__UNDERLINE = UML_SHAPE__UNDERLINE;

	/**
	 * The feature id for the '<em><b>Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__STRIKE_THROUGH = UML_SHAPE__STRIKE_THROUGH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__DESCRIPTION = UML_SHAPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__FILL_COLOR = UML_SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__TRANSPARENCY = UML_SHAPE__TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__GRADIENT = UML_SHAPE__GRADIENT;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__LINE_COLOR = UML_SHAPE__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__LINE_WIDTH = UML_SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Rounded Bendpoints Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__ROUNDED_BENDPOINTS_RADIUS = UML_SHAPE__ROUNDED_BENDPOINTS_RADIUS;

	/**
	 * The feature id for the '<em><b>Show Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__SHOW_STEREOTYPE = UML_SHAPE__SHOW_STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Show List Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__SHOW_LIST_VISIBILITY = UML_SHAPE__SHOW_LIST_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Show List Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__SHOW_LIST_SIGNATURE = UML_SHAPE__SHOW_LIST_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__ALIGNMENT = UML_SHAPE__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Show Stereotype Attribute Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT = UML_SHAPE__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Show Whitebox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT__SHOW_WHITEBOX = UML_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_COMPONENT_FEATURE_COUNT = UML_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLClassifierShapeImpl <em>UML Classifier Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLClassifierShapeImpl
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLClassifierShape()
	 * @generated
	 */
	int UML_CLASSIFIER_SHAPE = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__EANNOTATIONS = UML_SHAPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__VISIBLE = UML_SHAPE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__TYPE = UML_SHAPE__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__MUTABLE = UML_SHAPE__MUTABLE;

	/**
	 * The feature id for the '<em><b>Source Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__SOURCE_EDGES = UML_SHAPE__SOURCE_EDGES;

	/**
	 * The feature id for the '<em><b>Target Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__TARGET_EDGES = UML_SHAPE__TARGET_EDGES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__CHILDREN = UML_SHAPE__PERSISTED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__STYLES = UML_SHAPE__STYLES;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__ELEMENT = UML_SHAPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__DIAGRAM = UML_SHAPE__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Transient Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__TRANSIENT_CHILDREN = UML_SHAPE__TRANSIENT_CHILDREN;

	/**
	 * The feature id for the '<em><b>Layout Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__LAYOUT_CONSTRAINT = UML_SHAPE__LAYOUT_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__FONT_COLOR = UML_SHAPE__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__FONT_NAME = UML_SHAPE__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__FONT_HEIGHT = UML_SHAPE__FONT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__BOLD = UML_SHAPE__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__ITALIC = UML_SHAPE__ITALIC;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__UNDERLINE = UML_SHAPE__UNDERLINE;

	/**
	 * The feature id for the '<em><b>Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__STRIKE_THROUGH = UML_SHAPE__STRIKE_THROUGH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__DESCRIPTION = UML_SHAPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__FILL_COLOR = UML_SHAPE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__TRANSPARENCY = UML_SHAPE__TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__GRADIENT = UML_SHAPE__GRADIENT;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__LINE_COLOR = UML_SHAPE__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__LINE_WIDTH = UML_SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Rounded Bendpoints Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__ROUNDED_BENDPOINTS_RADIUS = UML_SHAPE__ROUNDED_BENDPOINTS_RADIUS;

	/**
	 * The feature id for the '<em><b>Show Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__SHOW_STEREOTYPE = UML_SHAPE__SHOW_STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Show List Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__SHOW_LIST_VISIBILITY = UML_SHAPE__SHOW_LIST_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Show List Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__SHOW_LIST_SIGNATURE = UML_SHAPE__SHOW_LIST_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__ALIGNMENT = UML_SHAPE__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Show Stereotype Attribute Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT = UML_SHAPE__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT;

	/**
	 * The feature id for the '<em><b>Use Classifier Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE__USE_CLASSIFIER_SHAPE = UML_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Classifier Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UML_CLASSIFIER_SHAPE_FEATURE_COUNT = UML_SHAPE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLDiagram <em>UML Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>UML Diagram</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLDiagram
	 * @generated
	 */
	EClass getUMLDiagram();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLFrame <em>UML Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>UML Frame</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLFrame
	 * @generated
	 */
	EClass getUMLFrame();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLShapeCompartment <em>UML Shape Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>UML Shape Compartment</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLShapeCompartment
	 * @generated
	 */
	EClass getUMLShapeCompartment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLShapeCompartment#isVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLShapeCompartment#isVerticalAlignment()
	 * @see #getUMLShapeCompartment()
	 * @generated
	 */
	EAttribute getUMLShapeCompartment_VerticalAlignment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLShape <em>UML Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>UML Shape</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLShape
	 * @generated
	 */
	EClass getUMLShape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLConnector <em>UML Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>UML Connector</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLConnector
	 * @generated
	 */
	EClass getUMLConnector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView <em>UML View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>UML View</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLView
	 * @generated
	 */
	EClass getUMLView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getShowStereotype <em>Show Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Show Stereotype</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getShowStereotype()
	 * @see #getUMLView()
	 * @generated
	 */
	EAttribute getUMLView_ShowStereotype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getShowListVisibility <em>Show List Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Show List Visibility</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getShowListVisibility()
	 * @see #getUMLView()
	 * @generated
	 */
	EAttribute getUMLView_ShowListVisibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#isShowListSignature <em>Show List Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Show List Signature</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#isShowListSignature()
	 * @see #getUMLView()
	 * @generated
	 */
	EAttribute getUMLView_ShowListSignature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getAlignment()
	 * @see #getUMLView()
	 * @generated
	 */
	EAttribute getUMLView_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getShowStereotypeAttributeCompartment <em>Show Stereotype Attribute Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Show Stereotype Attribute Compartment</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLView#getShowStereotypeAttributeCompartment()
	 * @see #getUMLView()
	 * @generated
	 */
	EAttribute getUMLView_ShowStereotypeAttributeCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent <em>UML Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>UML Component</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent
	 * @generated
	 */
	EClass getUMLComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent#isShowWhitebox <em>Show Whitebox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Show Whitebox</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent#isShowWhitebox()
	 * @see #getUMLComponent()
	 * @generated
	 */
	EAttribute getUMLComponent_ShowWhitebox();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape <em>UML Classifier Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>UML Classifier Shape</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape
	 * @generated
	 */
	EClass getUMLClassifierShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape#isUseClassifierShape <em>Use Classifier Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Use Classifier Shape</em>'.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape#isUseClassifierShape()
	 * @see #getUMLClassifierShape()
	 * @generated
	 */
	EAttribute getUMLClassifierShape_UseClassifierShape();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PapyrusUMLNotationFactory getPapyrusUMLNotationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLDiagramImpl <em>UML Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLDiagramImpl
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLDiagram()
		 * @generated
		 */
		EClass UML_DIAGRAM = eINSTANCE.getUMLDiagram();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLFrameImpl <em>UML Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLFrameImpl
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLFrame()
		 * @generated
		 */
		EClass UML_FRAME = eINSTANCE.getUMLFrame();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLShapeCompartmentImpl <em>UML Shape Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLShapeCompartmentImpl
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLShapeCompartment()
		 * @generated
		 */
		EClass UML_SHAPE_COMPARTMENT = eINSTANCE.getUMLShapeCompartment();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_SHAPE_COMPARTMENT__VERTICAL_ALIGNMENT = eINSTANCE.getUMLShapeCompartment_VerticalAlignment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLShapeImpl <em>UML Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLShapeImpl
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLShape()
		 * @generated
		 */
		EClass UML_SHAPE = eINSTANCE.getUMLShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl <em>UML Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLConnector()
		 * @generated
		 */
		EClass UML_CONNECTOR = eINSTANCE.getUMLConnector();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLViewImpl <em>UML View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLViewImpl
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLView()
		 * @generated
		 */
		EClass UML_VIEW = eINSTANCE.getUMLView();

		/**
		 * The meta object literal for the '<em><b>Show Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_VIEW__SHOW_STEREOTYPE = eINSTANCE.getUMLView_ShowStereotype();

		/**
		 * The meta object literal for the '<em><b>Show List Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_VIEW__SHOW_LIST_VISIBILITY = eINSTANCE.getUMLView_ShowListVisibility();

		/**
		 * The meta object literal for the '<em><b>Show List Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_VIEW__SHOW_LIST_SIGNATURE = eINSTANCE.getUMLView_ShowListSignature();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_VIEW__ALIGNMENT = eINSTANCE.getUMLView_Alignment();

		/**
		 * The meta object literal for the '<em><b>Show Stereotype Attribute Compartment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_VIEW__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT = eINSTANCE.getUMLView_ShowStereotypeAttributeCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLComponentImpl <em>UML Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLComponentImpl
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLComponent()
		 * @generated
		 */
		EClass UML_COMPONENT = eINSTANCE.getUMLComponent();

		/**
		 * The meta object literal for the '<em><b>Show Whitebox</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_COMPONENT__SHOW_WHITEBOX = eINSTANCE.getUMLComponent_ShowWhitebox();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLClassifierShapeImpl <em>UML Classifier Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLClassifierShapeImpl
		 * @see org.eclipse.papyrus.migration.rsa.umlnotation.impl.PapyrusUMLNotationPackageImpl#getUMLClassifierShape()
		 * @generated
		 */
		EClass UML_CLASSIFIER_SHAPE = eINSTANCE.getUMLClassifierShape();

		/**
		 * The meta object literal for the '<em><b>Use Classifier Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute UML_CLASSIFIER_SHAPE__USE_CLASSIFIER_SHAPE = eINSTANCE.getUMLClassifierShape_UseClassifierShape();

	}

} // PapyrusUMLNotationPackage
