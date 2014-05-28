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
package org.eclipse.papyrus.dd.di;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * <!-- end-user-doc --> <!-- begin-model-doc --> The Diagram Interchange (DI)
 * package enables interchange of graphical information that language users have
 * control over, such as position of nodes and line routing points. Language
 * specifications specialize elements of DI to define diagram interchange
 * elements for a language. <!-- end-model-doc -->
 * 
 * @see org.eclipse.papyrus.dd.di.DIFactory
 * @model kind="package"
 * @generated
 */
public interface DIPackage extends EPackage {

	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "di";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/DD/20110901/DI";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "di";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	DIPackage eINSTANCE = org.eclipse.papyrus.dd.di.impl.DIPackageImpl.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.di.impl.DiagramElementImpl
	 * <em>Diagram Element</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.di.impl.DiagramElementImpl
	 * @see org.eclipse.papyrus.dd.di.impl.DIPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__OWNING_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__OWNED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__LOCAL_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__SHARED_STYLE = 4;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Diagram Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.di.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.di.impl.StyleImpl
	 * @see org.eclipse.papyrus.dd.di.impl.DIPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 1;

	/**
	 * The number of structural features of the '<em>Style</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Style</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.di.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.di.impl.EdgeImpl
	 * @see org.eclipse.papyrus.dd.di.impl.DIPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EDGE__MODEL_ELEMENT = DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EDGE__OWNING_ELEMENT = DIAGRAM_ELEMENT__OWNING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EDGE__OWNED_ELEMENT = DIAGRAM_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EDGE__LOCAL_STYLE = DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EDGE__SHARED_STYLE = DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EDGE__WAYPOINT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.di.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.di.impl.ShapeImpl
	 * @see org.eclipse.papyrus.dd.di.impl.DIPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 4;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__MODEL_ELEMENT = DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__OWNING_ELEMENT = DIAGRAM_ELEMENT__OWNING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__OWNED_ELEMENT = DIAGRAM_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__LOCAL_STYLE = DIAGRAM_ELEMENT__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__SHARED_STYLE = DIAGRAM_ELEMENT__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE__BOUNDS = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shape</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.papyrus.dd.di.impl.DiagramImpl <em>Diagram</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.dd.di.impl.DiagramImpl
	 * @see org.eclipse.papyrus.dd.di.impl.DIPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__MODEL_ELEMENT = SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNING_ELEMENT = SHAPE__OWNING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_ELEMENT = SHAPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LOCAL_STYLE = SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SHARED_STYLE = SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DOCUMENTATION = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__RESOLUTION = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diagram</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement <em>Diagram Element</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see org.eclipse.papyrus.dd.di.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement#getModelElement
	 * <em>Model Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getModelElement()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_ModelElement();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement#getOwningElement
	 * <em>Owning Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owning Element</em>'.
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getOwningElement()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_OwningElement();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement#getOwnedElement
	 * <em>Owned Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Element</em>'.
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getOwnedElement()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_OwnedElement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement#getLocalStyle
	 * <em>Local Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Local Style</em>'.
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getLocalStyle()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_LocalStyle();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement#getSharedStyle
	 * <em>Shared Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Shared Style</em>'.
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getSharedStyle()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_SharedStyle();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.di.Style <em>Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Style</em>'.
	 * @see org.eclipse.papyrus.dd.di.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.dd.di.Edge
	 * <em>Edge</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.eclipse.papyrus.dd.di.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.di.Edge#getSource <em>Source</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.papyrus.dd.di.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.papyrus.dd.di.Edge#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.papyrus.dd.di.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.papyrus.dd.di.Edge#getWaypoint <em>Waypoint</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Waypoint</em>'.
	 * @see org.eclipse.papyrus.dd.di.Edge#getWaypoint()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Waypoint();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.di.Diagram <em>Diagram</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.eclipse.papyrus.dd.di.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.di.Diagram#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.dd.di.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.di.Diagram#getDocumentation
	 * <em>Documentation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.papyrus.dd.di.Diagram#getDocumentation()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Documentation();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.papyrus.dd.di.Diagram#getResolution
	 * <em>Resolution</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.eclipse.papyrus.dd.di.Diagram#getResolution()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Resolution();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.papyrus.dd.di.Shape <em>Shape</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.eclipse.papyrus.dd.di.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.papyrus.dd.di.Shape#getBounds <em>Bounds</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.eclipse.papyrus.dd.di.Shape#getBounds()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Bounds();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DIFactory getDIFactory();

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
		 * {@link org.eclipse.papyrus.dd.di.impl.DiagramElementImpl
		 * <em>Diagram Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.di.impl.DiagramElementImpl
		 * @see org.eclipse.papyrus.dd.di.impl.DIPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__MODEL_ELEMENT = eINSTANCE
				.getDiagramElement_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Owning Element</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__OWNING_ELEMENT = eINSTANCE
				.getDiagramElement_OwningElement();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__OWNED_ELEMENT = eINSTANCE
				.getDiagramElement_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Local Style</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__LOCAL_STYLE = eINSTANCE
				.getDiagramElement_LocalStyle();

		/**
		 * The meta object literal for the '<em><b>Shared Style</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__SHARED_STYLE = eINSTANCE
				.getDiagramElement_SharedStyle();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.di.impl.StyleImpl <em>Style</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.di.impl.StyleImpl
		 * @see org.eclipse.papyrus.dd.di.impl.DIPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.di.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.di.impl.EdgeImpl
		 * @see org.eclipse.papyrus.dd.di.impl.DIPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Waypoint</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EDGE__WAYPOINT = eINSTANCE.getEdge_Waypoint();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.di.impl.DiagramImpl <em>Diagram</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.di.impl.DiagramImpl
		 * @see org.eclipse.papyrus.dd.di.impl.DIPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGRAM__DOCUMENTATION = eINSTANCE
				.getDiagram_Documentation();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGRAM__RESOLUTION = eINSTANCE.getDiagram_Resolution();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.papyrus.dd.di.impl.ShapeImpl <em>Shape</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.dd.di.impl.ShapeImpl
		 * @see org.eclipse.papyrus.dd.di.impl.DIPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SHAPE__BOUNDS = eINSTANCE.getShape_Bounds();

	}

} // DIPackage
