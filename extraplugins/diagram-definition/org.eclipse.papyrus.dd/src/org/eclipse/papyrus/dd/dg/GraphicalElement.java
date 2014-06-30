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
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Graphical Element</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> GraphicalElement is the abstract superclass of all
 * graphical elements that can be nested in a canvas. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.GraphicalElement#getClipPath <em>Clip
 * Path</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.GraphicalElement#getGroup <em>Group
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.GraphicalElement#getClasses <em>Class
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.GraphicalElement#getStyle <em>Style
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.GraphicalElement#getTransforms <em>
 * Transform</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGraphicalElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphicalElement extends Definition {
	/**
	 * Returns the value of the '<em><b>Clip Path</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A clip
	 * path that masks the painting of this graphical element. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Clip Path</em>' reference.
	 * @see #setClipPath(ClipPath)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGraphicalElement_ClipPath()
	 * @model ordered="false"
	 * @generated
	 */
	ClipPath getClipPath();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.GraphicalElement#getClipPath
	 * <em>Clip Path</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Clip Path</em>' reference.
	 * @see #getClipPath()
	 * @generated
	 */
	void setClipPath(ClipPath value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference. It
	 * is bidirectional and its opposite is '
	 * {@link org.eclipse.papyrus.dd.dg.Group#getMembers <em>Member</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
	 * group that owns this graphical element. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(Group)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGraphicalElement_Group()
	 * @see org.eclipse.papyrus.dd.dg.Group#getMembers
	 * @model opposite="member" transient="false" ordered="false"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.GraphicalElement#getGroup
	 * <em>Group</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute list. The list
	 * contents are of type {@link java.lang.String}. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> A list of strings
	 * representing classes of the graphical element. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Class</em>' attribute list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGraphicalElement_Class()
	 * @model dataType="org.eclipse.papyrus.dd.dc.String"
	 * @generated
	 */
	EList<String> getClasses();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An
	 * inline style that applies on this graphical element. <!-- end-model-doc
	 * -->
	 * 
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(Style)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGraphicalElement_Style()
	 * @model containment="true"
	 * @generated
	 */
	Style getStyle();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.GraphicalElement#getStyle
	 * <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Style value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.eclipse.papyrus.dd.dg.Transform}. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> A list of transforms that apply
	 * to this graphical element. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Transform</em>' containment reference list.
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getGraphicalElement_Transform()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transform> getTransforms();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='clipPath->notEmpty() implies clipPath.id->notEmpty()'"
	 * @generated
	 */
	boolean referencedClippathHasId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // GraphicalElement
