/**
 * Copyright (c) 2015 CEA LIST.
 * 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.papyrus.sysml14.constraintblocks;

import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint block is a block that packages the statement of a constraint so it may be applied in a reusable way to constrain properties of other blocks. A constraint block typically defines one or more constraint parameters, which are bound to properties of other blocks in a surrounding context where the constraint is used. Binding connectors, as defined in Chapter 8: Blocks, are used to bind each parameter of the constraint block to a property in the surrounding context. All properties of a constraint block are constraint parameters, with the exception of constraint properties that hold internally nested usages of other constraint blocks.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.papyrus.sysml14.constraintblocks.ConstraintblocksPackage#getConstraintBlock()
 * @model
 * @generated
 */
public interface ConstraintBlock extends Block {
} // ConstraintBlock
