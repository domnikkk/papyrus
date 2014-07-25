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

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Marked Element</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MarkedElement is a graphic element that can be decorated at its vertices with markers (e.g. arrowheads).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.dd.dg.MarkedElement#getEndMarker <em>End Marker</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.MarkedElement#getMidMarker <em>Mid Marker</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.MarkedElement#getStartMarker <em>Start Marker</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMarkedElement()
 * @model abstract="true"
 * @generated
 */
public interface MarkedElement extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>End Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> an
	 * optional end marker that aligns with the last vertex of the marked
	 * element. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>End Marker</em>' reference.
	 * @see #setEndMarker(Marker)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMarkedElement_EndMarker()
	 * @model ordered="false"
	 * @generated
	 */
	Marker getEndMarker();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.MarkedElement#getEndMarker <em>End Marker</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>End Marker</em>' reference.
	 * @see #getEndMarker()
	 * @generated
	 */
	void setEndMarker(Marker value);

	/**
	 * Returns the value of the '<em><b>Mid Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> an
	 * optional mid marker that aligns with all vertices of the marked element
	 * except the first and the last. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Mid Marker</em>' reference.
	 * @see #setMidMarker(Marker)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMarkedElement_MidMarker()
	 * @model ordered="false"
	 * @generated
	 */
	Marker getMidMarker();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.MarkedElement#getMidMarker <em>Mid Marker</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Mid Marker</em>' reference.
	 * @see #getMidMarker()
	 * @generated
	 */
	void setMidMarker(Marker value);

	/**
	 * Returns the value of the '<em><b>Start Marker</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> an
	 * optional start marker that aligns with the first vertex of the marked
	 * element. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Start Marker</em>' reference.
	 * @see #setStartMarker(Marker)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMarkedElement_StartMarker()
	 * @model ordered="false"
	 * @generated
	 */
	Marker getStartMarker();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.MarkedElement#getStartMarker <em>Start Marker</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Start Marker</em>' reference.
	 * @see #getStartMarker()
	 * @generated
	 */
	void setStartMarker(Marker value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='startMarker->notEmpty() implies startMarker.id->notEmpty()'"
	 * @generated
	 */
	boolean referencedStartMarkerHasId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='midMarker->notEmpty() implies midMarker.id->notEmpty()'"
	 * @generated
	 */
	boolean referencedMidMarkerHasId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='endMarker->notEmpty() implies endMarker.id->notEmpty()'"
	 * @generated
	 */
	boolean referencedEndMarkerHasId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // MarkedElement
