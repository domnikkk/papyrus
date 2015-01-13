/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Quentin Le Menez (CEA LIST) quentin.lemenez@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;


public class MergeTableHandler extends AbstractTableHandler {

	/**
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// the complete merge of the table is not supported yet
		// TODO rewrite/fix the spanning behavior when applied to both columns and rows (cells hidden under others)

		// if(mergeOption.equals("Merge Table")) {
		// System.out.println(mergeOption);
		// resetSpan();
		// bodyLayerStack.getBodyLayerSpanProvider().setAutoColumnSpan(true);
		// bodyLayerStack.getBodyLayerSpanProvider().setAutoRowSpan(true);
		//
		// Integer[] testListColumn = { new Integer(11), new Integer(12), new Integer(13), new Integer(14) };
		// Integer[] testListRow = { new Integer(0), new Integer(1), new Integer(2), new Integer(3), new Integer(4), new Integer(5) };
		// bodyLayerStack.getBodyLayerSpanProvider().addAutoSpanningRowPositions(testListRow);
		// bodyLayerStack.getBodyLayerSpanProvider().addAutoSpanningColumnPositions(testListColumn);
		//
		// refreshTable();
		// }

		return null;
	}

}