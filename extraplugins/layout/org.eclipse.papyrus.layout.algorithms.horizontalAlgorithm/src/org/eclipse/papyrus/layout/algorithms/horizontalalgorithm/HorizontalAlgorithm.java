/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Allanic Alexia (Atos Origin) alexia.allanic@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.layout.algorithms.horizontalalgorithm;

import org.eclipse.papyrus.layout.managealgorithms.AlgorithmFactory;

/**
 * The Class HorizontalAlgorithm.
 */
public class HorizontalAlgorithm implements AlgorithmFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.layout.managealgorithms.AlgorithmFactory#createAlgorithm()
	 */
	@Override
	public AbstractLayoutAlgorithm createAlgorithm() {
		return new HorizontalLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
	}

}
