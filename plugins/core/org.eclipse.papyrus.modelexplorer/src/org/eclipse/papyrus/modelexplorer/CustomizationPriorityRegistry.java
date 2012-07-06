/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos - Initial API and implementation
 *   384459: [Model Explorer] Should provide a way to give priority to a customization
 *
 *****************************************************************************/
package org.eclipse.papyrus.modelexplorer;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.commands.contexts.Context;
import org.eclipse.core.commands.contexts.ContextEvent;
import org.eclipse.core.commands.contexts.IContextListener;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.facet.infra.browser.custom.MetamodelView;
import org.eclipse.emf.facet.infra.browser.uicore.CustomizationManager;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.contexts.IContextService;

/**
 * COmpartor of model explorer customization.
 * The priority is define with throught an extension point
 * 
 * @author adaussy
 * 
 */
public class CustomizationPriorityRegistry implements Comparator<MetamodelView>, IContextListener {

	/**
	 * Defautl value for non register customization
	 */
	private static Integer DEFAULT_VALUE = 0;

	/**
	 * Extension point id
	 */
	public static final String CUSTOMIZATION_PRIORITY_EXTENSION_POINT_ID = "org.eclipse.papyrus.modelexplorer.customizationPriority";

	/**
	 * Registry for context aware priority
	 */
	private Map<String, SortedSet<ContextPriority>> custoRegistry = new HashMap<String, SortedSet<ContextPriority>>();

	/**
	 * Context service
	 */
	private final IContextService service = (IContextService)PlatformUI.getWorkbench().getService(IContextService.class);

	/**
	 * List of all listenned context
	 */
	private Set<String> listeningContext = new HashSet<String>();
	
	/*
	 * Will be used later in order to make customization context aware
	 */
	private CustomizationManager custoManger;
	/**
	 * Constructor.
	 *
	 */
	public CustomizationPriorityRegistry(CustomizationManager custoManger) {
		this.custoManger = custoManger;
		initFromExtension();
		
	}

	/**
	 * Init priority from extension point
	 */
	protected void initFromExtension() {
		IConfigurationElement[] registry = Platform.getExtensionRegistry().getConfigurationElementsFor(CUSTOMIZATION_PRIORITY_EXTENSION_POINT_ID);
		for(IConfigurationElement elt : registry) {
			try {
				final String customName = elt.getAttribute("currrentCustomizationName");
				final String custoPriority = elt.getAttribute("priority");
				final String contextID = elt.getAttribute("contextID");
				ContextPriority prirityContext;
				Integer priorityValue = Integer.parseInt(custoPriority);
				if(customName != null && priorityValue != null) {
					if(contextID == null) {
						prirityContext = ContextPriority.createAllContextPriority(priorityValue,service);
					} else {
						prirityContext = ContextPriority.createContextSpecificPriority(priorityValue, contextID,service);
						listeningContext.add(contextID);
					}
					/*
					 * Should be implemented later in order to make customization depending of context
					 */
//					if(custoRegistry.containsKey(customName)) {
//						custoRegistry.get(customName).add(prirityContext);
//					} else {
						custoRegistry.put(customName, new TreeSet<CustomizationPriorityRegistry.ContextPriority>(Collections.singleton(prirityContext)));
//					}
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}

	/**
	 * Return the priority of an customization or DEFAULT VALUE if non register
	 * 
	 * @param custoName
	 * @return
	 */
	public Integer getCustomizationPriority(String custoName) {
		SortedSet<ContextPriority> values = custoRegistry.get(custoName);
		if (values != null){
			Iterator<ContextPriority> ite = values.iterator();
			while(ite.hasNext()) {
				ContextPriority next = ite.next();
				if(next.isCorrectContext()) {
					return next.getPriority();
				}
			}
		}
		return DEFAULT_VALUE;
	}

	/**
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 *
	 * @param o1
	 * @param o2
	 * @return
	 */
	public int compare(MetamodelView o1, MetamodelView o2) {
		Integer prio1 = getCustomizationPriority(o1.getName());
		Integer prio2 = getCustomizationPriority(o2.getName());
		return prio1.compareTo(prio2)*-1;
	}

	/**
	 * Represent the priority of a customization depending active context
	 * 
	 * @author adaussy
	 * 
	 */
	private static class ContextPriority implements Comparable<ContextPriority> {

		/**
		 * Priority in the given context
		 */
		private Integer priority;

		/**
		 * Context ID
		 */
		private String contextID;
		
		
		private IContextService service;

		/**
		 * Create a context specific priority
		 * @param priority
		 * @param contextID
		 * @return
		 */
		public static ContextPriority createContextSpecificPriority(Integer priority, String contextID,IContextService service) {
			return new ContextPriority(priority, contextID,service);
		}

		/**
		 * Create a priority for all context
		 * @param priority
		 * @return
		 */
		public static ContextPriority createAllContextPriority(Integer priority,IContextService service) {
			return new ContextPriority(priority,service);
		}

		/**
		 * Constructor.
		 *
		 * @param priority
		 * @param contextID
		 * @param service2 
		 */
		private ContextPriority(Integer priority, String contextID, IContextService service2) {
			super();
			this.priority = priority;
			this.contextID = contextID;
			this.service = service2;
		}

		/**
		 * Constructor.
		 *
		 * @param priority
		 */
		private ContextPriority(Integer priority, IContextService service2) {
			super();
			this.priority = priority;
			this.contextID = null;
			this.service = service2;
		}

		/**
		 * @return the priority
		 */
		protected Integer getPriority() {
			return priority;
		}

		/**
		 * @return the contextID
		 */
		protected String getContextID() {
			return contextID;
		}

		/**
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 * 
		 * @param o
		 * @return
		 */
		public int compareTo(ContextPriority o) {
			if(contextID == null) {
				return -1;
			}
			if(o.getContextID() == null) {
				return 1;
			}
			Context context0 = service.getContext(contextID);
			Context context1 = service.getContext(o.getContextID());
			return context0.compareTo(context1);
		}

		public boolean isCorrectContext() {
			/*
			 * Should be implemented later in order to be able to change customization depending of activating context
			 */
//			if (contextID != null){
//				return service.getActiveContextIds().contains(contextID);
//			}
			return true;
		}
	}

	public void contextChanged(ContextEvent contextEvent) {
		//is a listenning context
		/*
		 * Should be implemented later in oreder to listen context changes
		 */
//		if (listeningContext.contains(contextEvent.getContext().getId())){
//			List<MetamodelView> selectedCustomizations = custoManger.getRegisteredCustomizations();
//			custoManger.clearCustomizations();
//			//before loading, clean all facet to prevent to let not interesting facets.
//			custoManger.clearFacets();
//			loadFacetsForCustomizations(selectedCustomizations,
//						customizationManager);
//			for (MetamodelView metamodelView : selectedCustomizations) {
//				customizationManager
//						.registerCustomization(metamodelView);
//			}
//		}
		
	}
}
