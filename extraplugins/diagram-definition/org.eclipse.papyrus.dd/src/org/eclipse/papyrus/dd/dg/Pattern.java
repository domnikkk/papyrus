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

import org.eclipse.papyrus.dd.dc.Bounds;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Pattern</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pattern is a kind of paint server that paints a graphical element (a tile) repeatedly at fixed intervals in x and y axes to cover the areas to be filled.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.dd.dg.Pattern#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.Pattern#getTile <em>Tile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends PaintServer {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the bounds of the pattern that define a private coordinate system for the
	 * pattern's tile. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPattern_Bounds()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Pattern#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

	/**
	 * Returns the value of the '<em><b>Tile</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * reference to a graphical element, owned by the pattern, that works as a
	 * tile to be painted repeatedly at a fixed interval to fill an closed area.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Tile</em>' containment reference.
	 * @see #setTile(GraphicalElement)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getPattern_Tile()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	GraphicalElement getTile();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Pattern#getTile <em>Tile</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Tile</em>' containment reference.
	 * @see #getTile()
	 * @generated
	 */
	void setTile(GraphicalElement value);

} // Pattern
