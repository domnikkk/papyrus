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
package org.eclipse.papyrus.dd.editor;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.papyrus.dd.edit.DDEditPlugin;

/**
 * This is the central singleton for the DD editor plugin.
 */
public final class DDEditorPlugin extends EMFPlugin {

	public static final String IMAGE_HELP = "Help";

	/**
	 * Keep track of the singleton.
	 */
	public static final DDEditorPlugin INSTANCE = new DDEditorPlugin();

	/**
	 * Keep track of the singleton.
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 */
	public DDEditorPlugin() {
		super(new ResourceLocator[] { DDEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE, });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * 
	 * @return the singleton instance.
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * 
	 * @return the singleton instance.
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 */
	public static class Implementation extends EclipseUIPlugin {

		/**
		 * Creates an instance.
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			plugin = this;
		}

		@Override
		protected void initializeImageRegistry(ImageRegistry reg) {
			super.initializeImageRegistry(reg);
			reg.put(IMAGE_HELP,
					ImageDescriptor.createFromURL(getBundle().getEntry(
							"icons/help.gif")));
		}

	}

	public static ImageDescriptor getImageDescriptor(String id) {
		return getPlugin().getImageRegistry().getDescriptor(id);
	}

}
