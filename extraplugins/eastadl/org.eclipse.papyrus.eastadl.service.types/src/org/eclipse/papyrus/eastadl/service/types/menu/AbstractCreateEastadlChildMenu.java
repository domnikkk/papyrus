package org.eclipse.papyrus.eastadl.service.types.menu;

import org.eclipse.papyrus.infra.tools.util.AbstractCreateMenuFromCommandCategory;

public class AbstractCreateEastadlChildMenu extends AbstractCreateMenuFromCommandCategory {

	/** the cateogory of the command used to create SysML elements */
	public static final String SYSML_CREATION_COMMAND_CATEGORY = "org.eclipse.papyrus.eastadl.service.types.eastadlElementCreationCommands"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	public AbstractCreateEastadlChildMenu() {
		super(SYSML_CREATION_COMMAND_CATEGORY);
	}
}
