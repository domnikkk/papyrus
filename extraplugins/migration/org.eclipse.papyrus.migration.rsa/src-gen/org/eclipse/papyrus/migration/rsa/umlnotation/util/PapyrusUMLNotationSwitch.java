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

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage
 * @generated
 */
public class PapyrusUMLNotationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static PapyrusUMLNotationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public PapyrusUMLNotationSwitch() {
		if (modelPackage == null) {
			modelPackage = PapyrusUMLNotationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PapyrusUMLNotationPackage.UML_DIAGRAM: {
			UMLDiagram umlDiagram = (UMLDiagram) theEObject;
			T result = caseUMLDiagram(umlDiagram);
			if (result == null) {
				result = caseDiagram(umlDiagram);
			}
			if (result == null) {
				result = caseUMLView(umlDiagram);
			}
			if (result == null) {
				result = caseView(umlDiagram);
			}
			if (result == null) {
				result = caseEModelElement(umlDiagram);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case PapyrusUMLNotationPackage.UML_FRAME: {
			UMLFrame umlFrame = (UMLFrame) theEObject;
			T result = caseUMLFrame(umlFrame);
			if (result == null) {
				result = caseUMLShape(umlFrame);
			}
			if (result == null) {
				result = caseShape(umlFrame);
			}
			if (result == null) {
				result = caseUMLView(umlFrame);
			}
			if (result == null) {
				result = caseNode(umlFrame);
			}
			if (result == null) {
				result = caseShapeStyle(umlFrame);
			}
			if (result == null) {
				result = caseView(umlFrame);
			}
			if (result == null) {
				result = caseFontStyle(umlFrame);
			}
			if (result == null) {
				result = caseDescriptionStyle(umlFrame);
			}
			if (result == null) {
				result = caseFillStyle(umlFrame);
			}
			if (result == null) {
				result = caseLineStyle(umlFrame);
			}
			if (result == null) {
				result = caseRoundedCornersStyle(umlFrame);
			}
			if (result == null) {
				result = caseEModelElement(umlFrame);
			}
			if (result == null) {
				result = caseStyle(umlFrame);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case PapyrusUMLNotationPackage.UML_SHAPE_COMPARTMENT: {
			UMLShapeCompartment umlShapeCompartment = (UMLShapeCompartment) theEObject;
			T result = caseUMLShapeCompartment(umlShapeCompartment);
			if (result == null) {
				result = caseCompartment(umlShapeCompartment);
			}
			if (result == null) {
				result = caseUMLView(umlShapeCompartment);
			}
			if (result == null) {
				result = caseBasicCompartment(umlShapeCompartment);
			}
			if (result == null) {
				result = caseCanonicalStyle(umlShapeCompartment);
			}
			if (result == null) {
				result = caseTitleStyle(umlShapeCompartment);
			}
			if (result == null) {
				result = caseDecorationNode(umlShapeCompartment);
			}
			if (result == null) {
				result = caseDrawerStyle(umlShapeCompartment);
			}
			if (result == null) {
				result = caseBasicDecorationNode(umlShapeCompartment);
			}
			if (result == null) {
				result = caseStyle(umlShapeCompartment);
			}
			if (result == null) {
				result = caseNode(umlShapeCompartment);
			}
			if (result == null) {
				result = caseView(umlShapeCompartment);
			}
			if (result == null) {
				result = caseEModelElement(umlShapeCompartment);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case PapyrusUMLNotationPackage.UML_SHAPE: {
			UMLShape umlShape = (UMLShape) theEObject;
			T result = caseUMLShape(umlShape);
			if (result == null) {
				result = caseShape(umlShape);
			}
			if (result == null) {
				result = caseUMLView(umlShape);
			}
			if (result == null) {
				result = caseNode(umlShape);
			}
			if (result == null) {
				result = caseShapeStyle(umlShape);
			}
			if (result == null) {
				result = caseView(umlShape);
			}
			if (result == null) {
				result = caseFontStyle(umlShape);
			}
			if (result == null) {
				result = caseDescriptionStyle(umlShape);
			}
			if (result == null) {
				result = caseFillStyle(umlShape);
			}
			if (result == null) {
				result = caseLineStyle(umlShape);
			}
			if (result == null) {
				result = caseRoundedCornersStyle(umlShape);
			}
			if (result == null) {
				result = caseEModelElement(umlShape);
			}
			if (result == null) {
				result = caseStyle(umlShape);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case PapyrusUMLNotationPackage.UML_CONNECTOR: {
			UMLConnector umlConnector = (UMLConnector) theEObject;
			T result = caseUMLConnector(umlConnector);
			if (result == null) {
				result = caseConnector(umlConnector);
			}
			if (result == null) {
				result = caseFontStyle(umlConnector);
			}
			if (result == null) {
				result = caseUMLView(umlConnector);
			}
			if (result == null) {
				result = caseEdge(umlConnector);
			}
			if (result == null) {
				result = caseConnectorStyle(umlConnector);
			}
			if (result == null) {
				result = caseView(umlConnector);
			}
			if (result == null) {
				result = caseRoutingStyle(umlConnector);
			}
			if (result == null) {
				result = caseLineStyle(umlConnector);
			}
			if (result == null) {
				result = caseEModelElement(umlConnector);
			}
			if (result == null) {
				result = caseRoundedCornersStyle(umlConnector);
			}
			if (result == null) {
				result = caseStyle(umlConnector);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case PapyrusUMLNotationPackage.UML_VIEW: {
			UMLView umlView = (UMLView) theEObject;
			T result = caseUMLView(umlView);
			if (result == null) {
				result = caseView(umlView);
			}
			if (result == null) {
				result = caseEModelElement(umlView);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case PapyrusUMLNotationPackage.UML_COMPONENT: {
			UMLComponent umlComponent = (UMLComponent) theEObject;
			T result = caseUMLComponent(umlComponent);
			if (result == null) {
				result = caseUMLShape(umlComponent);
			}
			if (result == null) {
				result = caseShape(umlComponent);
			}
			if (result == null) {
				result = caseUMLView(umlComponent);
			}
			if (result == null) {
				result = caseNode(umlComponent);
			}
			if (result == null) {
				result = caseShapeStyle(umlComponent);
			}
			if (result == null) {
				result = caseView(umlComponent);
			}
			if (result == null) {
				result = caseFontStyle(umlComponent);
			}
			if (result == null) {
				result = caseDescriptionStyle(umlComponent);
			}
			if (result == null) {
				result = caseFillStyle(umlComponent);
			}
			if (result == null) {
				result = caseLineStyle(umlComponent);
			}
			if (result == null) {
				result = caseRoundedCornersStyle(umlComponent);
			}
			if (result == null) {
				result = caseEModelElement(umlComponent);
			}
			if (result == null) {
				result = caseStyle(umlComponent);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case PapyrusUMLNotationPackage.UML_CLASSIFIER_SHAPE: {
			UMLClassifierShape umlClassifierShape = (UMLClassifierShape) theEObject;
			T result = caseUMLClassifierShape(umlClassifierShape);
			if (result == null) {
				result = caseUMLShape(umlClassifierShape);
			}
			if (result == null) {
				result = caseShape(umlClassifierShape);
			}
			if (result == null) {
				result = caseUMLView(umlClassifierShape);
			}
			if (result == null) {
				result = caseNode(umlClassifierShape);
			}
			if (result == null) {
				result = caseShapeStyle(umlClassifierShape);
			}
			if (result == null) {
				result = caseView(umlClassifierShape);
			}
			if (result == null) {
				result = caseFontStyle(umlClassifierShape);
			}
			if (result == null) {
				result = caseDescriptionStyle(umlClassifierShape);
			}
			if (result == null) {
				result = caseFillStyle(umlClassifierShape);
			}
			if (result == null) {
				result = caseLineStyle(umlClassifierShape);
			}
			if (result == null) {
				result = caseRoundedCornersStyle(umlClassifierShape);
			}
			if (result == null) {
				result = caseEModelElement(umlClassifierShape);
			}
			if (result == null) {
				result = caseStyle(umlClassifierShape);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLDiagram(UMLDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLFrame(UMLFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Shape Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Shape Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLShapeCompartment(UMLShapeCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLShape(UMLShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLConnector(UMLConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLView(UMLView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLComponent(UMLComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Classifier Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Classifier Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLClassifierShape(UMLClassifierShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyle(Style object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontStyle(FontStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionStyle(DescriptionStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fill Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fill Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFillStyle(FillStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStyle(LineStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rounded Corners Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rounded Corners Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundedCornersStyle(RoundedCornersStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeStyle(ShapeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Decoration Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Decoration Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicDecorationNode(BasicDecorationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decoration Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decoration Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecorationNode(DecorationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawer Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawer Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawerStyle(DrawerStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicCompartment(BasicCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canonical Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canonical Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanonicalStyle(CanonicalStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleStyle(TitleStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartment(Compartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routing Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routing Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutingStyle(RoutingStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorStyle(ConnectorStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // PapyrusUMLNotationSwitch
