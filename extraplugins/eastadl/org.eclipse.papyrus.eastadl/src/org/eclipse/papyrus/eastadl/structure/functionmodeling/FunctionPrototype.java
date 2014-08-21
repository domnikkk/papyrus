/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.structure.functionmodeling;


import org.eclipse.papyrus.eastadl.infrastructure.elements.EAElement;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPrototype;
import org.eclipse.uml2.uml.Image;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FunctionPrototype represents a reference to the occurrence of a FunctionType when it acts as a part.
 *
 * The FunctionPrototype is typed by a FunctionType.
 *
 * FunctionTrigger in the Behavior package is associated to a FunctionPrototype.
 *
 *
 *
 * Semantics:
 * The FunctionPrototype represents an occurrence of the FunctionType that types it.
 *
 * Notation:
 * Shall be shown in the same style as the class specified as type, however it shall be clear that this is a part.
 *
 * Changes:
 * Renamed from ADLFunctionPart
 *
 * Extension:
 * To specialize SysML::BlockProperty, which extends Property
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage#getFunctionPrototype()
 * @model abstract="true"
 * @generated
 */
public interface FunctionPrototype extends EAElement, EAPrototype {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Image getIcon();

} // FunctionPrototype
