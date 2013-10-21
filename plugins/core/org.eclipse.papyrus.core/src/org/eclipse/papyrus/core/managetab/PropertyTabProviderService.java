/*****************************************************************************
 * Copyright (c) 2013 ATOS.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  EL AYADI Abdellah <abdellah.elayadi@atos.net> - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.core.managetab;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.papyrus.core.editor.BackboneException;
import org.eclipse.papyrus.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.core.extension.NotFoundException;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

public class PropertyTabProviderService {
	
	
	private static class SingletonHolder {
		private static final PropertyTabProviderService INSTANCE = new PropertyTabProviderService();
	}
	
	public static PropertyTabProviderService getInstance(){
		return SingletonHolder.INSTANCE;
	}
	
	
	/** ID of the editor extension (schema filename) */
	public static final String EDITOR_EXTENSION_ID = "manageTab";
	
	private int priority = 0;


	/**
	 * Constructor. defaultContext, input and site are explicitly required in
	 * order be sure that they are initialized. The multiEditor should be
	 * initialized. In particular, getEditorSite(), getEditorInput() and
	 * getDefaultContext() should return initialized values.
	 * 
	 * @param multiEditor
	 * @param defaultContext
	 * @param input
	 * @param site
	 * @param extensionPointNamespace
	 */
	protected PropertyTabProviderService() {
	}
	
	private List<IPropertyTabProvider> providers = null;

	public List<IPropertyTabProvider> getProviders() {
		IPropertyTabProvider higherPriority = null;
		if(providers == null){
			providers = new ArrayList<IPropertyTabProvider>();
			//init
			IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
			IConfigurationElement[] configElements = extensionRegistry.getConfigurationElementsFor("org.eclipse.papyrus.core", EDITOR_EXTENSION_ID);
			for(IConfigurationElement ele : configElements) {
				if(ele.getName().equals(EDITOR_EXTENSION_ID)) {
					Object newInstance;
					try {
						//todo order this by priority
						newInstance = ele.createExecutableExtension("class");
						if (newInstance instanceof IPropertyTabProvider) {
							int newPriority = 0;
							try {
								newPriority = Integer.parseInt(ele.getAttribute("priority"));
							} catch (NumberFormatException e) {
								newPriority = 0;
							}
							if(this.priority < newPriority){
								this.priority = newPriority;
								higherPriority = (IPropertyTabProvider) newInstance;
							}
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
		if(higherPriority!=null)
			providers.add(higherPriority);
		return providers;
	}

	/**
	 * Return the {@link ContentOutlineDescriptor} with the highest priority.
	 * 
	 * @return IPropertySheetPage
	 * @throws BackboneException
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws NotFoundException
	 *         If no ContentOutline can be found in extensions
	 */
	public IPropertySheetPage getPropertySheetPageDescriptor(IMultiDiagramEditor multiEditor){
		for (IPropertyTabProvider p : getProviders()){
			if(p.provider(multiEditor)){
				if (multiEditor instanceof ITabbedPropertySheetPageContributor) {
					 IPropertySheetPage propertyPage = p.getProvider((ITabbedPropertySheetPageContributor) multiEditor);
					 return propertyPage;
				}
			}
		}
		return null;
	}

}
