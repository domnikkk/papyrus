/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.internalblock.compatibility;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.gmf.diagram.common.compatibility.IDiagramVersionUpdater;

/**
 * Diagram version updater for the Internal Block Diagram.*
 *
 * @Deprecated
 * @link org.eclipse.papyrus.sysml.diagram.internalblock.migration.InternalBlockDiagramReconcilierUndefinedTo100
 */
@Deprecated
public class DiagramVersionUpdater implements IDiagramVersionUpdater {

	public static final String VERSION_0_9_1 = "0.9.1";

	public final static String VERSION_0_8_1 = "0.8.1";

	/** Constructor */
	public DiagramVersionUpdater() {
	}

	public int update(Diagram diagram, String oldVersion, String newVersion) {
		// TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(diagram);
		//
		// if(DiagramVersioningUtils.UNDEFINED_VERSION.equals(oldVersion)) {
		// if(VERSION_0_8_1.equals(newVersion)) {
		// try {
		// editingDomain.getCommandStack().execute(getUpdateCommandFromUndefinedTo_081(diagram));
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// } else if(VERSION_0_9_1.equals(newVersion)) {
		// try {
		// CompoundCommand cc = new CompoundCommand("Update Diagram");
		// cc.append(getUpdateCommandFromUndefinedTo_081(diagram));
		// cc.append(getUpdateCommandFrom081To_091(diagram));
		// editingDomain.getCommandStack().execute(cc);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// }
		//
		// }
		//
		// if(VERSION_0_8_1.equals(oldVersion) && (VERSION_0_9_1.equals(newVersion))) {
		// try {
		// editingDomain.getCommandStack().execute(getUpdateCommandFrom081To_091(diagram));
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// }
		//
		return 0;
	}

}
