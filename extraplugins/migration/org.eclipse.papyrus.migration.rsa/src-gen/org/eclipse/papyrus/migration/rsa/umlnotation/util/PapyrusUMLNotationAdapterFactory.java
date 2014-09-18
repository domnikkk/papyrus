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
package org.eclipse.papyrus.migration.rsa.umlnotation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.BasicDecorationNode;
import org.eclipse.gmf.runtime.notation.CanonicalStyle;
import org.eclipse.gmf.runtime.notation.Compartment;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.RoundedCornersStyle;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLConnector;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLDiagram;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLFrame;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLShape;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLShapeCompartment;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLView;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage
 * @generated
 */
public class PapyrusUMLNotationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static PapyrusUMLNotationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public PapyrusUMLNotationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PapyrusUMLNotationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected PapyrusUMLNotationSwitch<Adapter> modelSwitch =
			new PapyrusUMLNotationSwitch<Adapter>() {
				@Override
				public Adapter caseUMLDiagram(UMLDiagram object) {
					return createUMLDiagramAdapter();
				}

				@Override
				public Adapter caseUMLFrame(UMLFrame object) {
					return createUMLFrameAdapter();
				}

				@Override
				public Adapter caseUMLShapeCompartment(UMLShapeCompartment object) {
					return createUMLShapeCompartmentAdapter();
				}

				@Override
				public Adapter caseUMLShape(UMLShape object) {
					return createUMLShapeAdapter();
				}

				@Override
				public Adapter caseUMLConnector(UMLConnector object) {
					return createUMLConnectorAdapter();
				}

				@Override
				public Adapter caseUMLView(UMLView object) {
					return createUMLViewAdapter();
				}

				@Override
				public Adapter caseUMLComponent(UMLComponent object) {
					return createUMLComponentAdapter();
				}

				@Override
				public Adapter caseUMLClassifierShape(UMLClassifierShape object) {
					return createUMLClassifierShapeAdapter();
				}

				@Override
				public Adapter caseEModelElement(EModelElement object) {
					return createEModelElementAdapter();
				}

				@Override
				public Adapter caseView(View object) {
					return createViewAdapter();
				}

				@Override
				public Adapter caseDiagram(Diagram object) {
					return createDiagramAdapter();
				}

				@Override
				public Adapter caseNode(Node object) {
					return createNodeAdapter();
				}

				@Override
				public Adapter caseStyle(Style object) {
					return createStyleAdapter();
				}

				@Override
				public Adapter caseFontStyle(FontStyle object) {
					return createFontStyleAdapter();
				}

				@Override
				public Adapter caseDescriptionStyle(DescriptionStyle object) {
					return createDescriptionStyleAdapter();
				}

				@Override
				public Adapter caseFillStyle(FillStyle object) {
					return createFillStyleAdapter();
				}

				@Override
				public Adapter caseLineStyle(LineStyle object) {
					return createLineStyleAdapter();
				}

				@Override
				public Adapter caseRoundedCornersStyle(RoundedCornersStyle object) {
					return createRoundedCornersStyleAdapter();
				}

				@Override
				public Adapter caseShapeStyle(ShapeStyle object) {
					return createShapeStyleAdapter();
				}

				@Override
				public Adapter caseShape(Shape object) {
					return createShapeAdapter();
				}

				@Override
				public Adapter caseBasicDecorationNode(BasicDecorationNode object) {
					return createBasicDecorationNodeAdapter();
				}

				@Override
				public Adapter caseDecorationNode(DecorationNode object) {
					return createDecorationNodeAdapter();
				}

				@Override
				public Adapter caseDrawerStyle(DrawerStyle object) {
					return createDrawerStyleAdapter();
				}

				@Override
				public Adapter caseBasicCompartment(BasicCompartment object) {
					return createBasicCompartmentAdapter();
				}

				@Override
				public Adapter caseCanonicalStyle(CanonicalStyle object) {
					return createCanonicalStyleAdapter();
				}

				@Override
				public Adapter caseTitleStyle(TitleStyle object) {
					return createTitleStyleAdapter();
				}

				@Override
				public Adapter caseCompartment(Compartment object) {
					return createCompartmentAdapter();
				}

				@Override
				public Adapter caseEdge(Edge object) {
					return createEdgeAdapter();
				}

				@Override
				public Adapter caseRoutingStyle(RoutingStyle object) {
					return createRoutingStyleAdapter();
				}

				@Override
				public Adapter caseConnectorStyle(ConnectorStyle object) {
					return createConnectorStyleAdapter();
				}

				@Override
				public Adapter caseConnector(Connector object) {
					return createConnectorAdapter();
				}

				@Override
				public Adapter defaultCase(EObject object) {
					return createEObjectAdapter();
				}
			};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLDiagram <em>UML Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLDiagram
	 * @generated
	 */
	public Adapter createUMLDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLFrame <em>UML Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLFrame
	 * @generated
	 */
	public Adapter createUMLFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLShapeCompartment <em>UML Shape Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLShapeCompartment
	 * @generated
	 */
	public Adapter createUMLShapeCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLShape <em>UML Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLShape
	 * @generated
	 */
	public Adapter createUMLShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLConnector <em>UML Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLConnector
	 * @generated
	 */
	public Adapter createUMLConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLView <em>UML View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLView
	 * @generated
	 */
	public Adapter createUMLViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent <em>UML Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLComponent
	 * @generated
	 */
	public Adapter createUMLComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape <em>UML Classifier Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.migration.rsa.umlnotation.UMLClassifierShape
	 * @generated
	 */
	public Adapter createUMLClassifierShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.Style
	 * @generated
	 */
	public Adapter createStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.FontStyle
	 * @generated
	 */
	public Adapter createFontStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.DescriptionStyle <em>Description Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.DescriptionStyle
	 * @generated
	 */
	public Adapter createDescriptionStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.FillStyle <em>Fill Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.FillStyle
	 * @generated
	 */
	public Adapter createFillStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.LineStyle
	 * @generated
	 */
	public Adapter createLineStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.RoundedCornersStyle <em>Rounded Corners Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.RoundedCornersStyle
	 * @generated
	 */
	public Adapter createRoundedCornersStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.ShapeStyle <em>Shape Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.ShapeStyle
	 * @generated
	 */
	public Adapter createShapeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.BasicDecorationNode <em>Basic Decoration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.BasicDecorationNode
	 * @generated
	 */
	public Adapter createBasicDecorationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.DecorationNode <em>Decoration Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.DecorationNode
	 * @generated
	 */
	public Adapter createDecorationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.DrawerStyle <em>Drawer Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.DrawerStyle
	 * @generated
	 */
	public Adapter createDrawerStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.BasicCompartment <em>Basic Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.BasicCompartment
	 * @generated
	 */
	public Adapter createBasicCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.CanonicalStyle <em>Canonical Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.CanonicalStyle
	 * @generated
	 */
	public Adapter createCanonicalStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.TitleStyle <em>Title Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.TitleStyle
	 * @generated
	 */
	public Adapter createTitleStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.Compartment
	 * @generated
	 */
	public Adapter createCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.RoutingStyle <em>Routing Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.RoutingStyle
	 * @generated
	 */
	public Adapter createRoutingStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.ConnectorStyle <em>Connector Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.ConnectorStyle
	 * @generated
	 */
	public Adapter createConnectorStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // PapyrusUMLNotationAdapterFactory
