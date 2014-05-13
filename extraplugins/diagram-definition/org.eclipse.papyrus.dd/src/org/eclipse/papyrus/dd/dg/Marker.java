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

import org.eclipse.papyrus.dd.dc.Dimension;
import org.eclipse.papyrus.dd.dc.Point;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Marker</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Marker is a kind of group that is used as a
 * decoration (e.g. an arrowhead) for the vertices of a marked graphical
 * element. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Marker#getSize <em>Size</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Marker#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMarker()
 * @model
 * @generated
 */
public interface Marker extends Group {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the size of the marker <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Dimension)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMarker_Size()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Dimension getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Marker#getSize
	 * <em>Size</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Dimension value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> a point within the bounds of the marker that aligns
	 * exactly with the marked element's vertex. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Point)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMarker_Reference()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Point getReference();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Marker#getReference <em>Reference</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reference</em>' containment
	 *            reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Point value);

} // Marker
