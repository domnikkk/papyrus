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
package org.eclipse.papyrus.dd.dg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc --> The Diagram Graphics (DG)
 * package contains a model of graphical primitives that can be instantiated
 * when mapping from a language abstract syntax models and diagram interchange
 * (DI) models to visual presentations. The mapping effectively defines the
 * concrete syntax of a language. This specification does not restrict how the
 * mappings are done, or what languages are used to define them. <!--
 * end-model-doc -->
 * 
 * @see org.eclipse.papyrus.dd.dg.DGFactory
 * @model kind="package" annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface DGPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "dg";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/DD/20110901/DG";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "dg";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	DGPackage eINSTANCE = org.eclipse.papyrus.dd.dg.impl.DGPackageImpl.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.DefinitionImpl <em>Definition</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.DefinitionImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ID = 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Definition</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.GraphicalElementImpl
	 * <em>Graphical Element</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.GraphicalElementImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getGraphicalElement()
	 * @generated
	 */
	int GRAPHICAL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__ID = DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__CLIP_PATH = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__GROUP = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__CLASS = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__STYLE = DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__TRANSFORM = DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Graphical Element</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = DEFINITION___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graphical Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_OPERATION_COUNT = DEFINITION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.GroupImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP = GRAPHICAL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__CLASS = GRAPHICAL_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__STYLE = GRAPHICAL_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP__MEMBER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Group</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.CanvasImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS__CLIP_PATH = GROUP__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS__GROUP = GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS__CLASS = GROUP__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS__STYLE = GROUP__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS__TRANSFORM = GROUP__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS__MEMBER = GROUP__MEMBER;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS__BOUNDS = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = GROUP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GROUP___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GROUP___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Canvas Cannot Have Transforms</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS___CANVAS_CANNOT_HAVE_TRANSFORMS__DIAGNOSTICCHAIN_MAP = GROUP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Canvas</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CANVAS_OPERATION_COUNT = GROUP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.PathCommandImpl
	 * <em>Path Command</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.PathCommandImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPathCommand()
	 * @generated
	 */
	int PATH_COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_COMMAND__IS_RELATIVE = 0;

	/**
	 * The number of structural features of the '<em>Path Command</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_COMMAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path Command</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.MoveToImpl <em>Move To</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.MoveToImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getMoveTo()
	 * @generated
	 */
	int MOVE_TO = 4;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MOVE_TO__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MOVE_TO__POINT = PATH_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move To</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move To</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MOVE_TO_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.ClipPathImpl <em>Clip Path</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.ClipPathImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getClipPath()
	 * @generated
	 */
	int CLIP_PATH = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__CLIP_PATH = GROUP__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__GROUP = GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__CLASS = GROUP__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__STYLE = GROUP__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__TRANSFORM = GROUP__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH__MEMBER = GROUP__MEMBER;

	/**
	 * The number of structural features of the '<em>Clip Path</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GROUP___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GROUP___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Clip Path</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLIP_PATH_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.StyleImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 7;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__FILL = 0;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__FILL_OPACITY = 1;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__STROKE = 2;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__STROKE_WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__STROKE_OPACITY = 4;

	/**
	 * The feature id for the '<em><b>Stroke Dash Length</b></em>' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__STROKE_DASH_LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__FONT_SIZE = 6;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__FONT_NAME = 7;

	/**
	 * The feature id for the '<em><b>Font Italic</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__FONT_ITALIC = 8;

	/**
	 * The feature id for the '<em><b>Font Bold</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__FONT_BOLD = 9;

	/**
	 * The feature id for the '<em><b>Font Decoration</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE__FONT_DECORATION = 10;

	/**
	 * The number of structural features of the '<em>Style</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Valid Font Size</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Valid Fill Opacity</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Valid Stroke Width</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Valid Dash Length Size</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Valid Stroke Opacity</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>Style</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.PaintImpl <em>Paint</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.PaintImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPaint()
	 * @generated
	 */
	int PAINT = 8;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PAINT__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Paint Server</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PAINT__PAINT_SERVER = 1;

	/**
	 * The number of structural features of the '<em>Paint</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PAINT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Referenced Paint Server Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PAINT___REFERENCED_PAINT_SERVER_HAS_ID__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Paint</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PAINT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.PaintServerImpl
	 * <em>Paint Server</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.PaintServerImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPaintServer()
	 * @generated
	 */
	int PAINT_SERVER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PAINT_SERVER__ID = DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PAINT_SERVER__TRANSFORM = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paint Server</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PAINT_SERVER_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PAINT_SERVER___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = DEFINITION___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Paint Server</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PAINT_SERVER_OPERATION_COUNT = DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.TransformImpl <em>Transform</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.TransformImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getTransform()
	 * @generated
	 */
	int TRANSFORM = 10;

	/**
	 * The number of structural features of the '<em>Transform</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transform</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.CircleImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE__GROUP = GRAPHICAL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CLASS = GRAPHICAL_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE__STYLE = GRAPHICAL_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CENTER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Circle</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Non Negative Radius</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE___NON_NEGATIVE_RADIUS__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Circle</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.ClosePathImpl <em>Close Path</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.ClosePathImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getClosePath()
	 * @generated
	 */
	int CLOSE_PATH = 12;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLOSE_PATH__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

	/**
	 * The number of structural features of the '<em>Close Path</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLOSE_PATH_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Close Path</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLOSE_PATH_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.CubicCurveToImpl
	 * <em>Cubic Curve To</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.CubicCurveToImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getCubicCurveTo()
	 * @generated
	 */
	int CUBIC_CURVE_TO = 13;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CUBIC_CURVE_TO__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

	/**
	 * The feature id for the '<em><b>Start Control</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CUBIC_CURVE_TO__START_CONTROL = PATH_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Control</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CUBIC_CURVE_TO__END_CONTROL = PATH_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CUBIC_CURVE_TO__POINT = PATH_COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cubic Curve To</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CUBIC_CURVE_TO_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cubic Curve To</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CUBIC_CURVE_TO_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.DefinitionsImpl
	 * <em>Definitions</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.DefinitionsImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getDefinitions()
	 * @generated
	 */
	int DEFINITIONS = 14;

	/**
	 * The feature id for the '<em><b>Defnition</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__DEFNITION = 0;

	/**
	 * The feature id for the '<em><b>Style Sheet</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__STYLE_SHEET = 1;

	/**
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Definitions</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.StyleSheetImpl
	 * <em>Style Sheet</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.StyleSheetImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getStyleSheet()
	 * @generated
	 */
	int STYLE_SHEET = 15;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__RULE = 0;

	/**
	 * The number of structural features of the '<em>Style Sheet</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Style Sheet</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.StyleRuleImpl <em>Style Rule</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.StyleRuleImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getStyleRule()
	 * @generated
	 */
	int STYLE_RULE = 16;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_RULE__SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_RULE__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Style Rule</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Style Rule</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.StyleSelectorImpl
	 * <em>Style Selector</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.StyleSelectorImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getStyleSelector()
	 * @generated
	 */
	int STYLE_SELECTOR = 17;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR__KIND = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR__CLASS = 1;

	/**
	 * The number of structural features of the '<em>Style Selector</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Style Selector</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.EllipseImpl <em>Ellipse</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.EllipseImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__GROUP = GRAPHICAL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CLASS = GRAPHICAL_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STYLE = GRAPHICAL_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CENTER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radii</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__RADII = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Ellipse</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.EllipticalArcToImpl
	 * <em>Elliptical Arc To</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.EllipticalArcToImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getEllipticalArcTo()
	 * @generated
	 */
	int ELLIPTICAL_ARC_TO = 19;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_ARC_TO__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

	/**
	 * The feature id for the '<em><b>Radii</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_ARC_TO__RADII = PATH_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_ARC_TO__ROTATION = PATH_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Large Arc</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_ARC_TO__IS_LARGE_ARC = PATH_COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Sweep</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_ARC_TO__IS_SWEEP = PATH_COMMAND_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_ARC_TO__POINT = PATH_COMMAND_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Elliptical Arc To</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_ARC_TO_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Elliptical Arc To</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELLIPTICAL_ARC_TO_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.QuadraticCurveToImpl
	 * <em>Quadratic Curve To</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.QuadraticCurveToImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getQuadraticCurveTo()
	 * @generated
	 */
	int QUADRATIC_CURVE_TO = 20;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUADRATIC_CURVE_TO__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUADRATIC_CURVE_TO__CONTROL = PATH_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUADRATIC_CURVE_TO__POINT = PATH_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quadratic Curve To</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUADRATIC_CURVE_TO_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quadratic Curve To</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUADRATIC_CURVE_TO_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.GradientImpl <em>Gradient</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.GradientImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getGradient()
	 * @generated
	 */
	int GRADIENT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT__ID = PAINT_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT__TRANSFORM = PAINT_SERVER__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT__STOP = PAINT_SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gradient</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_FEATURE_COUNT = PAINT_SERVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = PAINT_SERVER___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Gradient</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_OPERATION_COUNT = PAINT_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.GradientStopImpl
	 * <em>Gradient Stop</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.GradientStopImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getGradientStop()
	 * @generated
	 */
	int GRADIENT_STOP = 22;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP__OFFSET = 1;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP__OPACITY = 2;

	/**
	 * The number of structural features of the '<em>Gradient Stop</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Valid Offset</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP___VALID_OFFSET__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Valid Opacity</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP___VALID_OPACITY__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Gradient Stop</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRADIENT_STOP_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.ImageImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__GROUP = GRAPHICAL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__CLASS = GRAPHICAL_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__STYLE = GRAPHICAL_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__SOURCE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__BOUNDS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Aspect Ratio Preserved</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE__IS_ASPECT_RATIO_PRESERVED = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Cannot Be Empty</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE___SOURCE_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.MarkedElementImpl
	 * <em>Marked Element</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.MarkedElementImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getMarkedElement()
	 * @generated
	 */
	int MARKED_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT__GROUP = GRAPHICAL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT__CLASS = GRAPHICAL_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT__STYLE = GRAPHICAL_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>End Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT__END_MARKER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mid Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT__MID_MARKER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT__START_MARKER = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Marked Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Start Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Referenced Mid Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Referenced End Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Marked Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKED_ELEMENT_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.LineImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__ID = MARKED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__CLIP_PATH = MARKED_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__GROUP = MARKED_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__CLASS = MARKED_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__STYLE = MARKED_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__TRANSFORM = MARKED_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>End Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__END_MARKER = MARKED_ELEMENT__END_MARKER;

	/**
	 * The feature id for the '<em><b>Mid Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__MID_MARKER = MARKED_ELEMENT__MID_MARKER;

	/**
	 * The feature id for the '<em><b>Start Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__START_MARKER = MARKED_ELEMENT__START_MARKER;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__START = MARKED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE__END = MARKED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = MARKED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Start Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Mid Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced End Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Line</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = MARKED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.MarkerImpl <em>Marker</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.MarkerImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getMarker()
	 * @generated
	 */
	int MARKER = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER__ID = GROUP__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER__CLIP_PATH = GROUP__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER__GROUP = GROUP__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER__CLASS = GROUP__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER__STYLE = GROUP__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER__TRANSFORM = GROUP__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER__MEMBER = GROUP__MEMBER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER__SIZE = GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER__REFERENCE = GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Marker</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER_FEATURE_COUNT = GROUP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GROUP___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GROUP___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Marker</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MARKER_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.LinearGradientImpl
	 * <em>Linear Gradient</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.LinearGradientImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getLinearGradient()
	 * @generated
	 */
	int LINEAR_GRADIENT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__ID = GRADIENT__ID;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__TRANSFORM = GRADIENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__STOP = GRADIENT__STOP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__START = GRADIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__END = GRADIENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Linear Gradient</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_FEATURE_COUNT = GRADIENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRADIENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Valid Gradient Vector</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT___VALID_GRADIENT_VECTOR__DIAGNOSTICCHAIN_MAP = GRADIENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linear Gradient</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_OPERATION_COUNT = GRADIENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.LineToImpl <em>Line To</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.LineToImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getLineTo()
	 * @generated
	 */
	int LINE_TO = 28;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE_TO__IS_RELATIVE = PATH_COMMAND__IS_RELATIVE;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE_TO__POINT = PATH_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line To</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE_TO_FEATURE_COUNT = PATH_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line To</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE_TO_OPERATION_COUNT = PATH_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.MatrixImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 29;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATRIX__A = TRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATRIX__B = TRANSFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATRIX__C = TRANSFORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATRIX__D = TRANSFORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>E</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATRIX__E = TRANSFORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>F</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATRIX__F = TRANSFORM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = TRANSFORM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Matrix</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = TRANSFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.PathImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH__ID = MARKED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH__CLIP_PATH = MARKED_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH__GROUP = MARKED_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH__CLASS = MARKED_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH__STYLE = MARKED_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH__TRANSFORM = MARKED_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>End Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH__END_MARKER = MARKED_ELEMENT__END_MARKER;

	/**
	 * The feature id for the '<em><b>Mid Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH__MID_MARKER = MARKED_ELEMENT__MID_MARKER;

	/**
	 * The feature id for the '<em><b>Start Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH__START_MARKER = MARKED_ELEMENT__START_MARKER;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH__COMMAND = MARKED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = MARKED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Start Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Mid Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced End Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>First Command Must Be Move</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH___FIRST_COMMAND_MUST_BE_MOVE__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Path</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = MARKED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.PatternImpl <em>Pattern</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.PatternImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATTERN__ID = PAINT_SERVER__ID;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATTERN__TRANSFORM = PAINT_SERVER__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATTERN__BOUNDS = PAINT_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tile</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATTERN__TILE = PAINT_SERVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = PAINT_SERVER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATTERN___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = PAINT_SERVER___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Pattern</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = PAINT_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.PolygonImpl <em>Polygon</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.PolygonImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON__ID = MARKED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON__CLIP_PATH = MARKED_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON__GROUP = MARKED_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON__CLASS = MARKED_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON__STYLE = MARKED_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON__TRANSFORM = MARKED_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>End Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON__END_MARKER = MARKED_ELEMENT__END_MARKER;

	/**
	 * The feature id for the '<em><b>Mid Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON__MID_MARKER = MARKED_ELEMENT__MID_MARKER;

	/**
	 * The feature id for the '<em><b>Start Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON__START_MARKER = MARKED_ELEMENT__START_MARKER;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON__POINT = MARKED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = MARKED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Start Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Mid Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced End Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Polygon</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = MARKED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.PolylineImpl <em>Polyline</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.PolylineImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPolyline()
	 * @generated
	 */
	int POLYLINE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE__ID = MARKED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE__CLIP_PATH = MARKED_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE__GROUP = MARKED_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE__CLASS = MARKED_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE__STYLE = MARKED_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE__TRANSFORM = MARKED_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>End Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE__END_MARKER = MARKED_ELEMENT__END_MARKER;

	/**
	 * The feature id for the '<em><b>Mid Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE__MID_MARKER = MARKED_ELEMENT__MID_MARKER;

	/**
	 * The feature id for the '<em><b>Start Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE__START_MARKER = MARKED_ELEMENT__START_MARKER;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE__POINT = MARKED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polyline</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE_FEATURE_COUNT = MARKED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Start Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Mid Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced End Marker Has Id</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = MARKED_ELEMENT___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Polyline</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POLYLINE_OPERATION_COUNT = MARKED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.RadialGradientImpl
	 * <em>Radial Gradient</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.RadialGradientImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getRadialGradient()
	 * @generated
	 */
	int RADIAL_GRADIENT = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__ID = GRADIENT__ID;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__TRANSFORM = GRADIENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__STOP = GRADIENT__STOP;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__CENTER = GRADIENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__FOCUS = GRADIENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__RADIUS = GRADIENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Radial Gradient</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_FEATURE_COUNT = GRADIENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRADIENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Valid Center Point</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT___VALID_CENTER_POINT__DIAGNOSTICCHAIN_MAP = GRADIENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Focus Point</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT___VALID_FOCUS_POINT__DIAGNOSTICCHAIN_MAP = GRADIENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Valid Radius</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT___VALID_RADIUS__DIAGNOSTICCHAIN_MAP = GRADIENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Radial Gradient</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_OPERATION_COUNT = GRADIENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.RectangleImpl <em>Rectangle</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.RectangleImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__GROUP = GRAPHICAL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CLASS = GRAPHICAL_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__STYLE = GRAPHICAL_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BOUNDS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corner Radius</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CORNER_RADIUS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Non Negative Corner Radius</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE___NON_NEGATIVE_CORNER_RADIUS__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.RootCanvasImpl
	 * <em>Root Canvas</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.RootCanvasImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getRootCanvas()
	 * @generated
	 */
	int ROOT_CANVAS = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__ID = CANVAS__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__CLIP_PATH = CANVAS__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__GROUP = CANVAS__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__CLASS = CANVAS__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__STYLE = CANVAS__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__TRANSFORM = CANVAS__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__MEMBER = CANVAS__MEMBER;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__BOUNDS = CANVAS__BOUNDS;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__BACKGROUND_COLOR = CANVAS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__DEFINITIONS = CANVAS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Style Sheet</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS__EXTERNAL_STYLE_SHEET = CANVAS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Root Canvas</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS_FEATURE_COUNT = CANVAS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = CANVAS___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = CANVAS___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Canvas Cannot Have Transforms</em>'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS___CANVAS_CANNOT_HAVE_TRANSFORMS__DIAGNOSTICCHAIN_MAP = CANVAS___CANVAS_CANNOT_HAVE_TRANSFORMS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Root Canvas</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROOT_CANVAS_OPERATION_COUNT = CANVAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.RotateImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 37;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROTATE__ANGLE = TRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROTATE__CENTER = TRANSFORM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = TRANSFORM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotate</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = TRANSFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.ScaleImpl <em>Scale</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.ScaleImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getScale()
	 * @generated
	 */
	int SCALE = 38;

	/**
	 * The feature id for the '<em><b>Factor X</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCALE__FACTOR_X = TRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factor Y</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCALE__FACTOR_Y = TRANSFORM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scale</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCALE_FEATURE_COUNT = TRANSFORM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Nonnegativescale</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCALE___NONNEGATIVESCALE__DIAGNOSTICCHAIN_MAP = TRANSFORM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scale</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCALE_OPERATION_COUNT = TRANSFORM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.SkewImpl <em>Skew</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.SkewImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getSkew()
	 * @generated
	 */
	int SKEW = 39;

	/**
	 * The feature id for the '<em><b>Angle X</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SKEW__ANGLE_X = TRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle Y</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SKEW__ANGLE_Y = TRANSFORM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skew</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SKEW_FEATURE_COUNT = TRANSFORM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Skew</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SKEW_OPERATION_COUNT = TRANSFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.TextImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__GROUP = GRAPHICAL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__CLASS = GRAPHICAL_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__STYLE = GRAPHICAL_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__DATA = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT__POSITION = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Data Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT___DATA_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.TranslateImpl <em>Translate</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.TranslateImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getTranslate()
	 * @generated
	 */
	int TRANSLATE = 41;

	/**
	 * The feature id for the '<em><b>Delta X</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__DELTA_X = TRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delta Y</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__DELTA_Y = TRANSFORM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Translate</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_FEATURE_COUNT = TRANSFORM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Translate</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_OPERATION_COUNT = TRANSFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.impl.UseImpl <em>Use</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.impl.UseImpl
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getUse()
	 * @generated
	 */
	int USE = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE__CLIP_PATH = GRAPHICAL_ELEMENT__CLIP_PATH;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE__GROUP = GRAPHICAL_ELEMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE__CLASS = GRAPHICAL_ELEMENT__CLASS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE__STYLE = GRAPHICAL_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE__TRANSFORM = GRAPHICAL_ELEMENT__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE__BOUNDS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE__REFERENCED_ELEMENT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Use</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Id Cannot Be Empty</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Clippath Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Referenced Element Has Id</em>' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE___REFERENCED_ELEMENT_HAS_ID__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Use</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int USE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.dg.FontDecoration <em>Font Decoration</em>}
	 * ' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.FontDecoration
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getFontDecoration()
	 * @generated
	 */
	int FONT_DECORATION = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.dd.dg.ElementKind
	 * <em>Element Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.papyrus.dd.dg.ElementKind
	 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getElementKind()
	 * @generated
	 */
	int ELEMENT_KIND = 44;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Canvas <em>Canvas</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Canvas#getBounds <em>Bounds</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Canvas#getBounds()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Bounds();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Canvas#canvasCannotHaveTransforms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Canvas Cannot Have Transforms</em>}' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Canvas Cannot Have Transforms</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.Canvas#canvasCannotHaveTransforms(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getCanvas__CanvasCannotHaveTransforms__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Group <em>Group</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.dg.Group#getMembers <em>Member</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Member</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Group#getMembers()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Member();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.GraphicalElement
	 * <em>Graphical Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Graphical Element</em>'.
	 * @see org.eclipse.papyrus.dd.dg.GraphicalElement
	 * @generated
	 */
	EClass getGraphicalElement();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.dg.GraphicalElement#getClipPath
	 * <em>Clip Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Clip Path</em>'.
	 * @see org.eclipse.papyrus.dd.dg.GraphicalElement#getClipPath()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EReference getGraphicalElement_ClipPath();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.papyrus.dd.dg.GraphicalElement#getGroup
	 * <em>Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see org.eclipse.papyrus.dd.dg.GraphicalElement#getGroup()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EReference getGraphicalElement_Group();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.eclipse.papyrus.dd.dg.GraphicalElement#getClasses
	 * <em>Class</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Class</em>'.
	 * @see org.eclipse.papyrus.dd.dg.GraphicalElement#getClasses()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_Class();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.GraphicalElement#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.papyrus.dd.dg.GraphicalElement#getStyle()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EReference getGraphicalElement_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.dg.GraphicalElement#getTransforms
	 * <em>Transform</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Transform</em>'.
	 * @see org.eclipse.papyrus.dd.dg.GraphicalElement#getTransforms()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EReference getGraphicalElement_Transform();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.GraphicalElement#referencedClippathHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced Clippath Has Id</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Referenced Clippath Has Id</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.GraphicalElement#referencedClippathHasId(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getGraphicalElement__ReferencedClippathHasId__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Definition <em>Definition</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Definition#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Definition#getId()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Id();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Definition#idCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Id Cannot Be Empty</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Id Cannot Be Empty</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.Definition#idCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getDefinition__IdCannotBeEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.MoveTo <em>Move To</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Move To</em>'.
	 * @see org.eclipse.papyrus.dd.dg.MoveTo
	 * @generated
	 */
	EClass getMoveTo();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.MoveTo#getPoint <em>Point</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see org.eclipse.papyrus.dd.dg.MoveTo#getPoint()
	 * @see #getMoveTo()
	 * @generated
	 */
	EReference getMoveTo_Point();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.PathCommand <em>Path Command</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Path Command</em>'.
	 * @see org.eclipse.papyrus.dd.dg.PathCommand
	 * @generated
	 */
	EClass getPathCommand();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.PathCommand#isRelative
	 * <em>Is Relative</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Relative</em>'.
	 * @see org.eclipse.papyrus.dd.dg.PathCommand#isRelative()
	 * @see #getPathCommand()
	 * @generated
	 */
	EAttribute getPathCommand_IsRelative();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.ClipPath <em>Clip Path</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Clip Path</em>'.
	 * @see org.eclipse.papyrus.dd.dg.ClipPath
	 * @generated
	 */
	EClass getClipPath();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Style <em>Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Style</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFill <em>Fill</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#getFill()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_Fill();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFillOpacity
	 * <em>Fill Opacity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#getFillOpacity()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_FillOpacity();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStroke <em>Stroke</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Stroke</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#getStroke()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_Stroke();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeWidth
	 * <em>Stroke Width</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#getStrokeWidth()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeOpacity
	 * <em>Stroke Opacity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#getStrokeOpacity()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_StrokeOpacity();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeDashLengths
	 * <em>Stroke Dash Length</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute list '
	 *         <em>Stroke Dash Length</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#getStrokeDashLengths()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_StrokeDashLength();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#getFontSize()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#getFontName()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_FontName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Style#isFontItalic <em>Font Italic</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Font Italic</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#isFontItalic()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_FontItalic();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Style#isFontBold <em>Font Bold</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Font Bold</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#isFontBold()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_FontBold();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontDecoration
	 * <em>Font Decoration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Font Decoration</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Style#getFontDecoration()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_FontDecoration();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#validFontSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Font Size</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Font Size</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.Style#validFontSize(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getStyle__ValidFontSize__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#validFillOpacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Fill Opacity</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Fill Opacity</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.Style#validFillOpacity(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getStyle__ValidFillOpacity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#validStrokeWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Stroke Width</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Stroke Width</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.Style#validStrokeWidth(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getStyle__ValidStrokeWidth__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#validDashLengthSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Dash Length Size</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Dash Length Size</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.Style#validDashLengthSize(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getStyle__ValidDashLengthSize__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#validStrokeOpacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Stroke Opacity</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Stroke Opacity</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.Style#validStrokeOpacity(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getStyle__ValidStrokeOpacity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Paint <em>Paint</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Paint</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Paint
	 * @generated
	 */
	EClass getPaint();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Paint#getColor <em>Color</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Paint#getColor()
	 * @see #getPaint()
	 * @generated
	 */
	EAttribute getPaint_Color();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.dg.Paint#getPaintServer
	 * <em>Paint Server</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Paint Server</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Paint#getPaintServer()
	 * @see #getPaint()
	 * @generated
	 */
	EReference getPaint_PaintServer();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Paint#referencedPaintServerHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced Paint Server Has Id</em>}' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Referenced Paint Server Has Id</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.Paint#referencedPaintServerHasId(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getPaint__ReferencedPaintServerHasId__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.PaintServer <em>Paint Server</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Paint Server</em>'.
	 * @see org.eclipse.papyrus.dd.dg.PaintServer
	 * @generated
	 */
	EClass getPaintServer();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.dg.PaintServer#getTransforms
	 * <em>Transform</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Transform</em>'.
	 * @see org.eclipse.papyrus.dd.dg.PaintServer#getTransforms()
	 * @see #getPaintServer()
	 * @generated
	 */
	EReference getPaintServer_Transform();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Transform <em>Transform</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Transform</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Transform
	 * @generated
	 */
	EClass getTransform();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Circle <em>Circle</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Circle#getCenter <em>Center</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Circle#getCenter()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_Center();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Circle#getRadius <em>Radius</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Circle#nonNegativeRadius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Non Negative Radius</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Non Negative Radius</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.Circle#nonNegativeRadius(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getCircle__NonNegativeRadius__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.ClosePath <em>Close Path</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Close Path</em>'.
	 * @see org.eclipse.papyrus.dd.dg.ClosePath
	 * @generated
	 */
	EClass getClosePath();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.CubicCurveTo <em>Cubic Curve To</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Cubic Curve To</em>'.
	 * @see org.eclipse.papyrus.dd.dg.CubicCurveTo
	 * @generated
	 */
	EClass getCubicCurveTo();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.CubicCurveTo#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see org.eclipse.papyrus.dd.dg.CubicCurveTo#getPoint()
	 * @see #getCubicCurveTo()
	 * @generated
	 */
	EReference getCubicCurveTo_Point();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.CubicCurveTo#getStartControl
	 * <em>Start Control</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Start Control</em>'.
	 * @see org.eclipse.papyrus.dd.dg.CubicCurveTo#getStartControl()
	 * @see #getCubicCurveTo()
	 * @generated
	 */
	EReference getCubicCurveTo_StartControl();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.CubicCurveTo#getEndControl
	 * <em>End Control</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>End Control</em>'.
	 * @see org.eclipse.papyrus.dd.dg.CubicCurveTo#getEndControl()
	 * @see #getCubicCurveTo()
	 * @generated
	 */
	EReference getCubicCurveTo_EndControl();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Definitions <em>Definitions</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Definitions</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Definitions
	 * @generated
	 */
	EClass getDefinitions();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.dg.Definitions#getDefnitions
	 * <em>Defnition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Defnition</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Definitions#getDefnitions()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Defnition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Definitions#getStyleSheet
	 * <em>Style Sheet</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Style Sheet</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Definitions#getStyleSheet()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_StyleSheet();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.StyleSheet <em>Style Sheet</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Style Sheet</em>'.
	 * @see org.eclipse.papyrus.dd.dg.StyleSheet
	 * @generated
	 */
	EClass getStyleSheet();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.dg.StyleSheet#getRules <em>Rule</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Rule</em>
	 *         '.
	 * @see org.eclipse.papyrus.dd.dg.StyleSheet#getRules()
	 * @see #getStyleSheet()
	 * @generated
	 */
	EReference getStyleSheet_Rule();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.StyleRule <em>Style Rule</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Style Rule</em>'.
	 * @see org.eclipse.papyrus.dd.dg.StyleRule
	 * @generated
	 */
	EClass getStyleRule();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.dg.StyleRule#getSelectors
	 * <em>Selector</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Selector</em>'.
	 * @see org.eclipse.papyrus.dd.dg.StyleRule#getSelectors()
	 * @see #getStyleRule()
	 * @generated
	 */
	EReference getStyleRule_Selector();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.StyleRule#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.papyrus.dd.dg.StyleRule#getStyle()
	 * @see #getStyleRule()
	 * @generated
	 */
	EReference getStyleRule_Style();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.StyleSelector <em>Style Selector</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Style Selector</em>'.
	 * @see org.eclipse.papyrus.dd.dg.StyleSelector
	 * @generated
	 */
	EClass getStyleSelector();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.StyleSelector#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.papyrus.dd.dg.StyleSelector#getKind()
	 * @see #getStyleSelector()
	 * @generated
	 */
	EAttribute getStyleSelector_Kind();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.eclipse.papyrus.dd.dg.StyleSelector#getClasses <em>Class</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Class</em>'.
	 * @see org.eclipse.papyrus.dd.dg.StyleSelector#getClasses()
	 * @see #getStyleSelector()
	 * @generated
	 */
	EAttribute getStyleSelector_Class();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Ellipse <em>Ellipse</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Ellipse#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Ellipse#getCenter()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Center();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Ellipse#getRadii <em>Radii</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Radii</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Ellipse#getRadii()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Radii();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalArcTo
	 * <em>Elliptical Arc To</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Elliptical Arc To</em>'.
	 * @see org.eclipse.papyrus.dd.dg.EllipticalArcTo
	 * @generated
	 */
	EClass getEllipticalArcTo();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalArcTo#getPoint <em>Point</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see org.eclipse.papyrus.dd.dg.EllipticalArcTo#getPoint()
	 * @see #getEllipticalArcTo()
	 * @generated
	 */
	EReference getEllipticalArcTo_Point();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalArcTo#getRadii <em>Radii</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Radii</em>'.
	 * @see org.eclipse.papyrus.dd.dg.EllipticalArcTo#getRadii()
	 * @see #getEllipticalArcTo()
	 * @generated
	 */
	EReference getEllipticalArcTo_Radii();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalArcTo#getRotation
	 * <em>Rotation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see org.eclipse.papyrus.dd.dg.EllipticalArcTo#getRotation()
	 * @see #getEllipticalArcTo()
	 * @generated
	 */
	EAttribute getEllipticalArcTo_Rotation();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalArcTo#isLargeArc
	 * <em>Is Large Arc</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Large Arc</em>'.
	 * @see org.eclipse.papyrus.dd.dg.EllipticalArcTo#isLargeArc()
	 * @see #getEllipticalArcTo()
	 * @generated
	 */
	EAttribute getEllipticalArcTo_IsLargeArc();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.EllipticalArcTo#isSweep
	 * <em>Is Sweep</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Sweep</em>'.
	 * @see org.eclipse.papyrus.dd.dg.EllipticalArcTo#isSweep()
	 * @see #getEllipticalArcTo()
	 * @generated
	 */
	EAttribute getEllipticalArcTo_IsSweep();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.QuadraticCurveTo
	 * <em>Quadratic Curve To</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Quadratic Curve To</em>'.
	 * @see org.eclipse.papyrus.dd.dg.QuadraticCurveTo
	 * @generated
	 */
	EClass getQuadraticCurveTo();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.QuadraticCurveTo#getPoint
	 * <em>Point</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see org.eclipse.papyrus.dd.dg.QuadraticCurveTo#getPoint()
	 * @see #getQuadraticCurveTo()
	 * @generated
	 */
	EReference getQuadraticCurveTo_Point();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.QuadraticCurveTo#getControl
	 * <em>Control</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see org.eclipse.papyrus.dd.dg.QuadraticCurveTo#getControl()
	 * @see #getQuadraticCurveTo()
	 * @generated
	 */
	EReference getQuadraticCurveTo_Control();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Gradient <em>Gradient</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Gradient</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Gradient
	 * @generated
	 */
	EClass getGradient();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.dg.Gradient#getStops <em>Stop</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Stop</em>
	 *         '.
	 * @see org.eclipse.papyrus.dd.dg.Gradient#getStops()
	 * @see #getGradient()
	 * @generated
	 */
	EReference getGradient_Stop();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.GradientStop <em>Gradient Stop</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Gradient Stop</em>'.
	 * @see org.eclipse.papyrus.dd.dg.GradientStop
	 * @generated
	 */
	EClass getGradientStop();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.GradientStop#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.papyrus.dd.dg.GradientStop#getColor()
	 * @see #getGradientStop()
	 * @generated
	 */
	EAttribute getGradientStop_Color();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.GradientStop#getOffset <em>Offset</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.papyrus.dd.dg.GradientStop#getOffset()
	 * @see #getGradientStop()
	 * @generated
	 */
	EAttribute getGradientStop_Offset();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.GradientStop#getOpacity
	 * <em>Opacity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see org.eclipse.papyrus.dd.dg.GradientStop#getOpacity()
	 * @see #getGradientStop()
	 * @generated
	 */
	EAttribute getGradientStop_Opacity();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.GradientStop#validOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Offset</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Offset</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.GradientStop#validOffset(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getGradientStop__ValidOffset__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.GradientStop#validOpacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Opacity</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Opacity</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.GradientStop#validOpacity(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getGradientStop__ValidOpacity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Image <em>Image</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Image#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Image#getSource()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Source();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Image#getBounds <em>Bounds</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Image#getBounds()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Bounds();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Image#isAspectRatioPreserved
	 * <em>Is Aspect Ratio Preserved</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the attribute '
	 *         <em>Is Aspect Ratio Preserved</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Image#isAspectRatioPreserved()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_IsAspectRatioPreserved();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Image#sourceCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Source Cannot Be Empty</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Source Cannot Be Empty</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.Image#sourceCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getImage__SourceCannotBeEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.dd.dg.Line
	 * <em>Line</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Line#getStart <em>Start</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Line#getStart()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Start();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Line#getEnd <em>End</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Line#getEnd()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_End();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.MarkedElement <em>Marked Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Marked Element</em>'.
	 * @see org.eclipse.papyrus.dd.dg.MarkedElement
	 * @generated
	 */
	EClass getMarkedElement();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.dg.MarkedElement#getEndMarker
	 * <em>End Marker</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>End Marker</em>'.
	 * @see org.eclipse.papyrus.dd.dg.MarkedElement#getEndMarker()
	 * @see #getMarkedElement()
	 * @generated
	 */
	EReference getMarkedElement_EndMarker();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.dg.MarkedElement#getMidMarker
	 * <em>Mid Marker</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Mid Marker</em>'.
	 * @see org.eclipse.papyrus.dd.dg.MarkedElement#getMidMarker()
	 * @see #getMarkedElement()
	 * @generated
	 */
	EReference getMarkedElement_MidMarker();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.dg.MarkedElement#getStartMarker
	 * <em>Start Marker</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Start Marker</em>'.
	 * @see org.eclipse.papyrus.dd.dg.MarkedElement#getStartMarker()
	 * @see #getMarkedElement()
	 * @generated
	 */
	EReference getMarkedElement_StartMarker();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.MarkedElement#referencedStartMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced Start Marker Has Id</em>}' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Referenced Start Marker Has Id</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.MarkedElement#referencedStartMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getMarkedElement__ReferencedStartMarkerHasId__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.MarkedElement#referencedMidMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced Mid Marker Has Id</em>}' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Referenced Mid Marker Has Id</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.MarkedElement#referencedMidMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getMarkedElement__ReferencedMidMarkerHasId__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.MarkedElement#referencedEndMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced End Marker Has Id</em>}' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Referenced End Marker Has Id</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.MarkedElement#referencedEndMarkerHasId(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getMarkedElement__ReferencedEndMarkerHasId__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Marker <em>Marker</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Marker</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Marker
	 * @generated
	 */
	EClass getMarker();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Marker#getSize <em>Size</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Marker#getSize()
	 * @see #getMarker()
	 * @generated
	 */
	EReference getMarker_Size();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Marker#getReference <em>Reference</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Reference</em>
	 *         '.
	 * @see org.eclipse.papyrus.dd.dg.Marker#getReference()
	 * @see #getMarker()
	 * @generated
	 */
	EReference getMarker_Reference();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.LinearGradient <em>Linear Gradient</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Linear Gradient</em>'.
	 * @see org.eclipse.papyrus.dd.dg.LinearGradient
	 * @generated
	 */
	EClass getLinearGradient();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.LinearGradient#getStart <em>Start</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.eclipse.papyrus.dd.dg.LinearGradient#getStart()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EReference getLinearGradient_Start();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.LinearGradient#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.eclipse.papyrus.dd.dg.LinearGradient#getEnd()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EReference getLinearGradient_End();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.LinearGradient#validGradientVector(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Gradient Vector</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Gradient Vector</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.LinearGradient#validGradientVector(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getLinearGradient__ValidGradientVector__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.LineTo <em>Line To</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Line To</em>'.
	 * @see org.eclipse.papyrus.dd.dg.LineTo
	 * @generated
	 */
	EClass getLineTo();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.LineTo#getPoint <em>Point</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see org.eclipse.papyrus.dd.dg.LineTo#getPoint()
	 * @see #getLineTo()
	 * @generated
	 */
	EReference getLineTo_Point();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Matrix <em>Matrix</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Matrix#getA <em>A</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Matrix#getA()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_A();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Matrix#getB <em>B</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Matrix#getB()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_B();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Matrix#getC <em>C</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Matrix#getC()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_C();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Matrix#getD <em>D</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Matrix#getD()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_D();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Matrix#getE <em>E</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>E</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Matrix#getE()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_E();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Matrix#getF <em>F</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>F</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Matrix#getF()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_F();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.dd.dg.Path
	 * <em>Path</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Path</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.dg.Path#getCommands <em>Command</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Command</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Path#getCommands()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Command();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Path#firstCommandMustBeMove(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>First Command Must Be Move</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>First Command Must Be Move</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.Path#firstCommandMustBeMove(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getPath__FirstCommandMustBeMove__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Pattern <em>Pattern</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Pattern#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Pattern#getBounds()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Bounds();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Pattern#getTile <em>Tile</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Tile</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Pattern#getTile()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Tile();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Polygon <em>Polygon</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.dg.Polygon#getPoints <em>Point</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Point</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Polygon#getPoints()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_Point();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Polyline <em>Polyline</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Polyline</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Polyline
	 * @generated
	 */
	EClass getPolyline();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.dg.Polyline#getPoints <em>Point</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Point</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Polyline#getPoints()
	 * @see #getPolyline()
	 * @generated
	 */
	EReference getPolyline_Point();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.RadialGradient <em>Radial Gradient</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Radial Gradient</em>'.
	 * @see org.eclipse.papyrus.dd.dg.RadialGradient
	 * @generated
	 */
	EClass getRadialGradient();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.RadialGradient#getCenter
	 * <em>Center</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see org.eclipse.papyrus.dd.dg.RadialGradient#getCenter()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EReference getRadialGradient_Center();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.RadialGradient#getFocus <em>Focus</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Focus</em>'.
	 * @see org.eclipse.papyrus.dd.dg.RadialGradient#getFocus()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EReference getRadialGradient_Focus();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.RadialGradient#getRadius
	 * <em>Radius</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.eclipse.papyrus.dd.dg.RadialGradient#getRadius()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EAttribute getRadialGradient_Radius();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.RadialGradient#validCenterPoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Center Point</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Center Point</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.RadialGradient#validCenterPoint(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getRadialGradient__ValidCenterPoint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.RadialGradient#validFocusPoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Focus Point</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Focus Point</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.RadialGradient#validFocusPoint(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getRadialGradient__ValidFocusPoint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.RadialGradient#validRadius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Radius</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Valid Radius</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.RadialGradient#validRadius(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getRadialGradient__ValidRadius__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Rectangle <em>Rectangle</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Rectangle#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Rectangle#getBounds()
	 * @see #getRectangle()
	 * @generated
	 */
	EReference getRectangle_Bounds();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Rectangle#getCornerRadius
	 * <em>Corner Radius</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Corner Radius</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Rectangle#getCornerRadius()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_CornerRadius();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Rectangle#nonNegativeCornerRadius(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Non Negative Corner Radius</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Non Negative Corner Radius</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.Rectangle#nonNegativeCornerRadius(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getRectangle__NonNegativeCornerRadius__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.RootCanvas <em>Root Canvas</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Root Canvas</em>'.
	 * @see org.eclipse.papyrus.dd.dg.RootCanvas
	 * @generated
	 */
	EClass getRootCanvas();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.RootCanvas#getBackgroundColor
	 * <em>Background Color</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.eclipse.papyrus.dd.dg.RootCanvas#getBackgroundColor()
	 * @see #getRootCanvas()
	 * @generated
	 */
	EAttribute getRootCanvas_BackgroundColor();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.RootCanvas#getDefinitions
	 * <em>Definitions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Definitions</em>'.
	 * @see org.eclipse.papyrus.dd.dg.RootCanvas#getDefinitions()
	 * @see #getRootCanvas()
	 * @generated
	 */
	EReference getRootCanvas_Definitions();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.papyrus.dd.dg.RootCanvas#getExternalStyleSheets
	 * <em>External Style Sheet</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the reference list '
	 *         <em>External Style Sheet</em>'.
	 * @see org.eclipse.papyrus.dd.dg.RootCanvas#getExternalStyleSheets()
	 * @see #getRootCanvas()
	 * @generated
	 */
	EReference getRootCanvas_ExternalStyleSheet();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Rotate <em>Rotate</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Rotate#getAngle <em>Angle</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Rotate#getAngle()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Angle();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Rotate#getCenter <em>Center</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Rotate#getCenter()
	 * @see #getRotate()
	 * @generated
	 */
	EReference getRotate_Center();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Scale <em>Scale</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Scale</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Scale
	 * @generated
	 */
	EClass getScale();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Scale#getFactorX <em>Factor X</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Factor X</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Scale#getFactorX()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_FactorX();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Scale#getFactorY <em>Factor Y</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Factor Y</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Scale#getFactorY()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_FactorY();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Scale#nonnegativescale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Nonnegativescale</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Nonnegativescale</em>' operation.
	 * @see org.eclipse.papyrus.dd.dg.Scale#nonnegativescale(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getScale__Nonnegativescale__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.dd.dg.Skew
	 * <em>Skew</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Skew</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Skew
	 * @generated
	 */
	EClass getSkew();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Skew#getAngleX <em>Angle X</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Angle X</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Skew#getAngleX()
	 * @see #getSkew()
	 * @generated
	 */
	EAttribute getSkew_AngleX();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Skew#getAngleY <em>Angle Y</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Angle Y</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Skew#getAngleY()
	 * @see #getSkew()
	 * @generated
	 */
	EAttribute getSkew_AngleY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.dd.dg.Text
	 * <em>Text</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Text#getData <em>Data</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Text#getData()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Data();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Text#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Position</em>
	 *         '.
	 * @see org.eclipse.papyrus.dd.dg.Text#getPosition()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Position();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Text#dataCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Data Cannot Be Empty</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Data Cannot Be Empty</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.Text#dataCannotBeEmpty(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getText__DataCannotBeEmpty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.dg.Translate <em>Translate</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Translate</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Translate
	 * @generated
	 */
	EClass getTranslate();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Translate#getDeltaX <em>Delta X</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Delta X</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Translate#getDeltaX()
	 * @see #getTranslate()
	 * @generated
	 */
	EAttribute getTranslate_DeltaX();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.dg.Translate#getDeltaY <em>Delta Y</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Delta Y</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Translate#getDeltaY()
	 * @see #getTranslate()
	 * @generated
	 */
	EAttribute getTranslate_DeltaY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.dd.dg.Use
	 * <em>Use</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Use</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Use
	 * @generated
	 */
	EClass getUse();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.dg.Use#getBounds <em>Bounds</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Use#getBounds()
	 * @see #getUse()
	 * @generated
	 */
	EReference getUse_Bounds();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.dg.Use#getReferencedElement
	 * <em>Referenced Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see org.eclipse.papyrus.dd.dg.Use#getReferencedElement()
	 * @see #getUse()
	 * @generated
	 */
	EReference getUse_ReferencedElement();

	/**
	 * Returns the meta object for the '
	 * {@link org.eclipse.papyrus.dd.dg.Use#referencedElementHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Referenced Element Has Id</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Referenced Element Has Id</em>'
	 *         operation.
	 * @see org.eclipse.papyrus.dd.dg.Use#referencedElementHasId(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	EOperation getUse__ReferencedElementHasId__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.papyrus.dd.dg.FontDecoration <em>Font Decoration</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Font Decoration</em>'.
	 * @see org.eclipse.papyrus.dd.dg.FontDecoration
	 * @generated
	 */
	EEnum getFontDecoration();

	/**
	 * Returns the meta object for enum '
	 * {@link org.eclipse.papyrus.dd.dg.ElementKind <em>Element Kind</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Element Kind</em>'.
	 * @see org.eclipse.papyrus.dd.dg.ElementKind
	 * @generated
	 */
	EEnum getElementKind();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DGFactory getDGFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
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
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.CanvasImpl <em>Canvas</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.CanvasImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getCanvas()
		 * @generated
		 */
		EClass CANVAS = eINSTANCE.getCanvas();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CANVAS__BOUNDS = eINSTANCE.getCanvas_Bounds();

		/**
		 * The meta object literal for the '
		 * <em><b>Canvas Cannot Have Transforms</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation CANVAS___CANVAS_CANNOT_HAVE_TRANSFORMS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCanvas__CanvasCannotHaveTransforms__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.GroupImpl <em>Group</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.GroupImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GROUP__MEMBER = eINSTANCE.getGroup_Member();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.GraphicalElementImpl
		 * <em>Graphical Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.GraphicalElementImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getGraphicalElement()
		 * @generated
		 */
		EClass GRAPHICAL_ELEMENT = eINSTANCE.getGraphicalElement();

		/**
		 * The meta object literal for the '<em><b>Clip Path</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPHICAL_ELEMENT__CLIP_PATH = eINSTANCE
				.getGraphicalElement_ClipPath();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPHICAL_ELEMENT__GROUP = eINSTANCE
				.getGraphicalElement_Group();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__CLASS = eINSTANCE
				.getGraphicalElement_Class();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPHICAL_ELEMENT__STYLE = eINSTANCE
				.getGraphicalElement_Style();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPHICAL_ELEMENT__TRANSFORM = eINSTANCE
				.getGraphicalElement_Transform();

		/**
		 * The meta object literal for the '
		 * <em><b>Referenced Clippath Has Id</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation GRAPHICAL_ELEMENT___REFERENCED_CLIPPATH_HAS_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getGraphicalElement__ReferencedClippathHasId__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.DefinitionImpl
		 * <em>Definition</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.DefinitionImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DEFINITION__ID = eINSTANCE.getDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Id Cannot Be Empty</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation DEFINITION___ID_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDefinition__IdCannotBeEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.MoveToImpl <em>Move To</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.MoveToImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getMoveTo()
		 * @generated
		 */
		EClass MOVE_TO = eINSTANCE.getMoveTo();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MOVE_TO__POINT = eINSTANCE.getMoveTo_Point();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.PathCommandImpl
		 * <em>Path Command</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.PathCommandImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPathCommand()
		 * @generated
		 */
		EClass PATH_COMMAND = eINSTANCE.getPathCommand();

		/**
		 * The meta object literal for the '<em><b>Is Relative</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PATH_COMMAND__IS_RELATIVE = eINSTANCE
				.getPathCommand_IsRelative();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.ClipPathImpl
		 * <em>Clip Path</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.ClipPathImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getClipPath()
		 * @generated
		 */
		EClass CLIP_PATH = eINSTANCE.getClipPath();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.StyleImpl <em>Style</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.StyleImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STYLE__FILL = eINSTANCE.getStyle_Fill();

		/**
		 * The meta object literal for the '<em><b>Fill Opacity</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE__FILL_OPACITY = eINSTANCE.getStyle_FillOpacity();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STYLE__STROKE = eINSTANCE.getStyle_Stroke();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE__STROKE_WIDTH = eINSTANCE.getStyle_StrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Stroke Opacity</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE__STROKE_OPACITY = eINSTANCE.getStyle_StrokeOpacity();

		/**
		 * The meta object literal for the '<em><b>Stroke Dash Length</b></em>'
		 * attribute list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE__STROKE_DASH_LENGTH = eINSTANCE
				.getStyle_StrokeDashLength();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE__FONT_SIZE = eINSTANCE.getStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE__FONT_NAME = eINSTANCE.getStyle_FontName();

		/**
		 * The meta object literal for the '<em><b>Font Italic</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE__FONT_ITALIC = eINSTANCE.getStyle_FontItalic();

		/**
		 * The meta object literal for the '<em><b>Font Bold</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE__FONT_BOLD = eINSTANCE.getStyle_FontBold();

		/**
		 * The meta object literal for the '<em><b>Font Decoration</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE__FONT_DECORATION = eINSTANCE.getStyle_FontDecoration();

		/**
		 * The meta object literal for the '<em><b>Valid Font Size</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getStyle__ValidFontSize__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Fill Opacity</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getStyle__ValidFillOpacity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Stroke Width</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getStyle__ValidStrokeWidth__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * <em><b>Valid Dash Length Size</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getStyle__ValidDashLengthSize__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Stroke Opacity</b></em>
		 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getStyle__ValidStrokeOpacity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.PaintImpl <em>Paint</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.PaintImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPaint()
		 * @generated
		 */
		EClass PAINT = eINSTANCE.getPaint();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PAINT__COLOR = eINSTANCE.getPaint_Color();

		/**
		 * The meta object literal for the '<em><b>Paint Server</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PAINT__PAINT_SERVER = eINSTANCE.getPaint_PaintServer();

		/**
		 * The meta object literal for the '
		 * <em><b>Referenced Paint Server Has Id</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation PAINT___REFERENCED_PAINT_SERVER_HAS_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPaint__ReferencedPaintServerHasId__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.PaintServerImpl
		 * <em>Paint Server</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.PaintServerImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPaintServer()
		 * @generated
		 */
		EClass PAINT_SERVER = eINSTANCE.getPaintServer();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PAINT_SERVER__TRANSFORM = eINSTANCE
				.getPaintServer_Transform();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.TransformImpl
		 * <em>Transform</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.TransformImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getTransform()
		 * @generated
		 */
		EClass TRANSFORM = eINSTANCE.getTransform();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.CircleImpl <em>Circle</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.CircleImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CIRCLE__CENTER = eINSTANCE.getCircle_Center();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '<em><b>Non Negative Radius</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation CIRCLE___NON_NEGATIVE_RADIUS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCircle__NonNegativeRadius__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.ClosePathImpl
		 * <em>Close Path</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.ClosePathImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getClosePath()
		 * @generated
		 */
		EClass CLOSE_PATH = eINSTANCE.getClosePath();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.CubicCurveToImpl
		 * <em>Cubic Curve To</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.CubicCurveToImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getCubicCurveTo()
		 * @generated
		 */
		EClass CUBIC_CURVE_TO = eINSTANCE.getCubicCurveTo();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CUBIC_CURVE_TO__POINT = eINSTANCE.getCubicCurveTo_Point();

		/**
		 * The meta object literal for the '<em><b>Start Control</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CUBIC_CURVE_TO__START_CONTROL = eINSTANCE
				.getCubicCurveTo_StartControl();

		/**
		 * The meta object literal for the '<em><b>End Control</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CUBIC_CURVE_TO__END_CONTROL = eINSTANCE
				.getCubicCurveTo_EndControl();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.DefinitionsImpl
		 * <em>Definitions</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.DefinitionsImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getDefinitions()
		 * @generated
		 */
		EClass DEFINITIONS = eINSTANCE.getDefinitions();

		/**
		 * The meta object literal for the '<em><b>Defnition</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DEFINITIONS__DEFNITION = eINSTANCE
				.getDefinitions_Defnition();

		/**
		 * The meta object literal for the '<em><b>Style Sheet</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DEFINITIONS__STYLE_SHEET = eINSTANCE
				.getDefinitions_StyleSheet();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.StyleSheetImpl
		 * <em>Style Sheet</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.StyleSheetImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getStyleSheet()
		 * @generated
		 */
		EClass STYLE_SHEET = eINSTANCE.getStyleSheet();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STYLE_SHEET__RULE = eINSTANCE.getStyleSheet_Rule();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.StyleRuleImpl
		 * <em>Style Rule</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.StyleRuleImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getStyleRule()
		 * @generated
		 */
		EClass STYLE_RULE = eINSTANCE.getStyleRule();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STYLE_RULE__SELECTOR = eINSTANCE.getStyleRule_Selector();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference STYLE_RULE__STYLE = eINSTANCE.getStyleRule_Style();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.StyleSelectorImpl
		 * <em>Style Selector</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.StyleSelectorImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getStyleSelector()
		 * @generated
		 */
		EClass STYLE_SELECTOR = eINSTANCE.getStyleSelector();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE_SELECTOR__KIND = eINSTANCE.getStyleSelector_Kind();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute STYLE_SELECTOR__CLASS = eINSTANCE.getStyleSelector_Class();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.EllipseImpl <em>Ellipse</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.EllipseImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getEllipse()
		 * @generated
		 */
		EClass ELLIPSE = eINSTANCE.getEllipse();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ELLIPSE__CENTER = eINSTANCE.getEllipse_Center();

		/**
		 * The meta object literal for the '<em><b>Radii</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ELLIPSE__RADII = eINSTANCE.getEllipse_Radii();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.EllipticalArcToImpl
		 * <em>Elliptical Arc To</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.EllipticalArcToImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getEllipticalArcTo()
		 * @generated
		 */
		EClass ELLIPTICAL_ARC_TO = eINSTANCE.getEllipticalArcTo();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ELLIPTICAL_ARC_TO__POINT = eINSTANCE
				.getEllipticalArcTo_Point();

		/**
		 * The meta object literal for the '<em><b>Radii</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ELLIPTICAL_ARC_TO__RADII = eINSTANCE
				.getEllipticalArcTo_Radii();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELLIPTICAL_ARC_TO__ROTATION = eINSTANCE
				.getEllipticalArcTo_Rotation();

		/**
		 * The meta object literal for the '<em><b>Is Large Arc</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELLIPTICAL_ARC_TO__IS_LARGE_ARC = eINSTANCE
				.getEllipticalArcTo_IsLargeArc();

		/**
		 * The meta object literal for the '<em><b>Is Sweep</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELLIPTICAL_ARC_TO__IS_SWEEP = eINSTANCE
				.getEllipticalArcTo_IsSweep();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.QuadraticCurveToImpl
		 * <em>Quadratic Curve To</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.QuadraticCurveToImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getQuadraticCurveTo()
		 * @generated
		 */
		EClass QUADRATIC_CURVE_TO = eINSTANCE.getQuadraticCurveTo();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUADRATIC_CURVE_TO__POINT = eINSTANCE
				.getQuadraticCurveTo_Point();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUADRATIC_CURVE_TO__CONTROL = eINSTANCE
				.getQuadraticCurveTo_Control();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.GradientImpl <em>Gradient</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.GradientImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getGradient()
		 * @generated
		 */
		EClass GRADIENT = eINSTANCE.getGradient();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRADIENT__STOP = eINSTANCE.getGradient_Stop();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.GradientStopImpl
		 * <em>Gradient Stop</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.GradientStopImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getGradientStop()
		 * @generated
		 */
		EClass GRADIENT_STOP = eINSTANCE.getGradientStop();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRADIENT_STOP__COLOR = eINSTANCE.getGradientStop_Color();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRADIENT_STOP__OFFSET = eINSTANCE.getGradientStop_Offset();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRADIENT_STOP__OPACITY = eINSTANCE.getGradientStop_Opacity();

		/**
		 * The meta object literal for the '<em><b>Valid Offset</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation GRADIENT_STOP___VALID_OFFSET__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getGradientStop__ValidOffset__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Opacity</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation GRADIENT_STOP___VALID_OPACITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getGradientStop__ValidOpacity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.ImageImpl <em>Image</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.ImageImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IMAGE__SOURCE = eINSTANCE.getImage_Source();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IMAGE__BOUNDS = eINSTANCE.getImage_Bounds();

		/**
		 * The meta object literal for the '
		 * <em><b>Is Aspect Ratio Preserved</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IMAGE__IS_ASPECT_RATIO_PRESERVED = eINSTANCE
				.getImage_IsAspectRatioPreserved();

		/**
		 * The meta object literal for the '
		 * <em><b>Source Cannot Be Empty</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation IMAGE___SOURCE_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getImage__SourceCannotBeEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.LineImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LINE__START = eINSTANCE.getLine_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LINE__END = eINSTANCE.getLine_End();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.MarkedElementImpl
		 * <em>Marked Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.MarkedElementImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getMarkedElement()
		 * @generated
		 */
		EClass MARKED_ELEMENT = eINSTANCE.getMarkedElement();

		/**
		 * The meta object literal for the '<em><b>End Marker</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MARKED_ELEMENT__END_MARKER = eINSTANCE
				.getMarkedElement_EndMarker();

		/**
		 * The meta object literal for the '<em><b>Mid Marker</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MARKED_ELEMENT__MID_MARKER = eINSTANCE
				.getMarkedElement_MidMarker();

		/**
		 * The meta object literal for the '<em><b>Start Marker</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MARKED_ELEMENT__START_MARKER = eINSTANCE
				.getMarkedElement_StartMarker();

		/**
		 * The meta object literal for the '
		 * <em><b>Referenced Start Marker Has Id</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation MARKED_ELEMENT___REFERENCED_START_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getMarkedElement__ReferencedStartMarkerHasId__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * <em><b>Referenced Mid Marker Has Id</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation MARKED_ELEMENT___REFERENCED_MID_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getMarkedElement__ReferencedMidMarkerHasId__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * <em><b>Referenced End Marker Has Id</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation MARKED_ELEMENT___REFERENCED_END_MARKER_HAS_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getMarkedElement__ReferencedEndMarkerHasId__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.MarkerImpl <em>Marker</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.MarkerImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getMarker()
		 * @generated
		 */
		EClass MARKER = eINSTANCE.getMarker();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MARKER__SIZE = eINSTANCE.getMarker_Size();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MARKER__REFERENCE = eINSTANCE.getMarker_Reference();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.LinearGradientImpl
		 * <em>Linear Gradient</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.LinearGradientImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getLinearGradient()
		 * @generated
		 */
		EClass LINEAR_GRADIENT = eINSTANCE.getLinearGradient();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LINEAR_GRADIENT__START = eINSTANCE.getLinearGradient_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LINEAR_GRADIENT__END = eINSTANCE.getLinearGradient_End();

		/**
		 * The meta object literal for the '
		 * <em><b>Valid Gradient Vector</b></em>' operation. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation LINEAR_GRADIENT___VALID_GRADIENT_VECTOR__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLinearGradient__ValidGradientVector__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.LineToImpl <em>Line To</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.LineToImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getLineTo()
		 * @generated
		 */
		EClass LINE_TO = eINSTANCE.getLineTo();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LINE_TO__POINT = eINSTANCE.getLineTo_Point();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.MatrixImpl <em>Matrix</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.MatrixImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MATRIX__A = eINSTANCE.getMatrix_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MATRIX__B = eINSTANCE.getMatrix_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MATRIX__C = eINSTANCE.getMatrix_C();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MATRIX__D = eINSTANCE.getMatrix_D();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MATRIX__E = eINSTANCE.getMatrix_E();

		/**
		 * The meta object literal for the '<em><b>F</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MATRIX__F = eINSTANCE.getMatrix_F();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.PathImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PATH__COMMAND = eINSTANCE.getPath_Command();

		/**
		 * The meta object literal for the '
		 * <em><b>First Command Must Be Move</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation PATH___FIRST_COMMAND_MUST_BE_MOVE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPath__FirstCommandMustBeMove__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.PatternImpl <em>Pattern</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.PatternImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PATTERN__BOUNDS = eINSTANCE.getPattern_Bounds();

		/**
		 * The meta object literal for the '<em><b>Tile</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PATTERN__TILE = eINSTANCE.getPattern_Tile();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.PolygonImpl <em>Polygon</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.PolygonImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference POLYGON__POINT = eINSTANCE.getPolygon_Point();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.PolylineImpl <em>Polyline</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.PolylineImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getPolyline()
		 * @generated
		 */
		EClass POLYLINE = eINSTANCE.getPolyline();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference POLYLINE__POINT = eINSTANCE.getPolyline_Point();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.RadialGradientImpl
		 * <em>Radial Gradient</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.RadialGradientImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getRadialGradient()
		 * @generated
		 */
		EClass RADIAL_GRADIENT = eINSTANCE.getRadialGradient();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RADIAL_GRADIENT__CENTER = eINSTANCE
				.getRadialGradient_Center();

		/**
		 * The meta object literal for the '<em><b>Focus</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RADIAL_GRADIENT__FOCUS = eINSTANCE.getRadialGradient_Focus();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT__RADIUS = eINSTANCE
				.getRadialGradient_Radius();

		/**
		 * The meta object literal for the '<em><b>Valid Center Point</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation RADIAL_GRADIENT___VALID_CENTER_POINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRadialGradient__ValidCenterPoint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Focus Point</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation RADIAL_GRADIENT___VALID_FOCUS_POINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRadialGradient__ValidFocusPoint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Radius</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation RADIAL_GRADIENT___VALID_RADIUS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRadialGradient__ValidRadius__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.RectangleImpl
		 * <em>Rectangle</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.RectangleImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RECTANGLE__BOUNDS = eINSTANCE.getRectangle_Bounds();

		/**
		 * The meta object literal for the '<em><b>Corner Radius</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RECTANGLE__CORNER_RADIUS = eINSTANCE
				.getRectangle_CornerRadius();

		/**
		 * The meta object literal for the '
		 * <em><b>Non Negative Corner Radius</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation RECTANGLE___NON_NEGATIVE_CORNER_RADIUS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRectangle__NonNegativeCornerRadius__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.RootCanvasImpl
		 * <em>Root Canvas</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.RootCanvasImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getRootCanvas()
		 * @generated
		 */
		EClass ROOT_CANVAS = eINSTANCE.getRootCanvas();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ROOT_CANVAS__BACKGROUND_COLOR = eINSTANCE
				.getRootCanvas_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ROOT_CANVAS__DEFINITIONS = eINSTANCE
				.getRootCanvas_Definitions();

		/**
		 * The meta object literal for the '<em><b>External Style Sheet</b></em>
		 * ' reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference ROOT_CANVAS__EXTERNAL_STYLE_SHEET = eINSTANCE
				.getRootCanvas_ExternalStyleSheet();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.RotateImpl <em>Rotate</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.RotateImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ROTATE__ANGLE = eINSTANCE.getRotate_Angle();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ROTATE__CENTER = eINSTANCE.getRotate_Center();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.ScaleImpl <em>Scale</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.ScaleImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getScale()
		 * @generated
		 */
		EClass SCALE = eINSTANCE.getScale();

		/**
		 * The meta object literal for the '<em><b>Factor X</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SCALE__FACTOR_X = eINSTANCE.getScale_FactorX();

		/**
		 * The meta object literal for the '<em><b>Factor Y</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SCALE__FACTOR_Y = eINSTANCE.getScale_FactorY();

		/**
		 * The meta object literal for the '<em><b>Nonnegativescale</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation SCALE___NONNEGATIVESCALE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getScale__Nonnegativescale__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.SkewImpl <em>Skew</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.SkewImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getSkew()
		 * @generated
		 */
		EClass SKEW = eINSTANCE.getSkew();

		/**
		 * The meta object literal for the '<em><b>Angle X</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SKEW__ANGLE_X = eINSTANCE.getSkew_AngleX();

		/**
		 * The meta object literal for the '<em><b>Angle Y</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute SKEW__ANGLE_Y = eINSTANCE.getSkew_AngleY();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.TextImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TEXT__DATA = eINSTANCE.getText_Data();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TEXT__POSITION = eINSTANCE.getText_Position();

		/**
		 * The meta object literal for the '<em><b>Data Cannot Be Empty</b></em>
		 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation TEXT___DATA_CANNOT_BE_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getText__DataCannotBeEmpty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.TranslateImpl
		 * <em>Translate</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.TranslateImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getTranslate()
		 * @generated
		 */
		EClass TRANSLATE = eINSTANCE.getTranslate();

		/**
		 * The meta object literal for the '<em><b>Delta X</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TRANSLATE__DELTA_X = eINSTANCE.getTranslate_DeltaX();

		/**
		 * The meta object literal for the '<em><b>Delta Y</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TRANSLATE__DELTA_Y = eINSTANCE.getTranslate_DeltaY();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.impl.UseImpl <em>Use</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.impl.UseImpl
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getUse()
		 * @generated
		 */
		EClass USE = eINSTANCE.getUse();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE__BOUNDS = eINSTANCE.getUse_Bounds();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference USE__REFERENCED_ELEMENT = eINSTANCE
				.getUse_ReferencedElement();

		/**
		 * The meta object literal for the '
		 * <em><b>Referenced Element Has Id</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation USE___REFERENCED_ELEMENT_HAS_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUse__ReferencedElementHasId__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.FontDecoration
		 * <em>Font Decoration</em>}' enum. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.FontDecoration
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getFontDecoration()
		 * @generated
		 */
		EEnum FONT_DECORATION = eINSTANCE.getFontDecoration();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.dg.ElementKind <em>Element Kind</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.dg.ElementKind
		 * @see org.eclipse.papyrus.dd.dg.impl.DGPackageImpl#getElementKind()
		 * @generated
		 */
		EEnum ELEMENT_KIND = eINSTANCE.getElementKind();

	}

} // DGPackage
