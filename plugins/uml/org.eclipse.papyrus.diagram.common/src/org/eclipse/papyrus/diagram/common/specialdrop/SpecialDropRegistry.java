/*****************************************************************************
 * Copyright (c) 2013 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.specialdrop;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class SpecialDropRegistry {
	
	// extension point ID
	private static final String EXTENSION_ID = "org.eclipse.papyrus.diagram.common.specialDropProvider"; //$NON-NLS-1$

	private static final String PRIORITY_ID = "priority"; //$NON-NLS-1$
	
	private static final String ID_ID = "id"; //$NON-NLS-1$

	private static final String CLASS_ID = "class"; //$NON-NLS-1$

	private List<ISpecialDropProvider> specialDrops;
	
	private static class SpecialDropRegistryHolder {

		public static final SpecialDropRegistry instance = new SpecialDropRegistry();
	}

	public static SpecialDropRegistry getInstance() {
		return SpecialDropRegistryHolder.instance;
	}

	SpecialDropRegistry() {
		initialize();
	}
	
	public List<ISpecialDropProvider> getSpecialDrops() {
		return Collections.unmodifiableList(specialDrops);
	}

	private void initialize() {
		// Reading data from plugins
		IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);
		final Map<String, Integer> currentPriorityMap = Maps.newHashMap();
		final Map<String, ISpecialDropProvider> currentImplementationMap = Maps.newHashMap();
		final List<ISpecialDropProvider> unidentifiedImplementations = Lists.newArrayList();
		
		for(IConfigurationElement iConfigurationElement : configElements) {
			try {
				String id = iConfigurationElement.getAttribute(ID_ID);
				ISpecialDropProvider specialDropInstance = (ISpecialDropProvider)iConfigurationElement.createExecutableExtension(CLASS_ID);

				if (id != null && !"".equals(id)) {
					String priorityStr = iConfigurationElement.getAttribute(PRIORITY_ID);
					int priority = 0;
					try {
						priority = Integer.decode(priorityStr);
					} catch (Exception e) {
					}

					Integer currentPriority = currentPriorityMap.get(id);
					if (currentPriority == null || priority > currentPriority) {
						currentPriorityMap.put(id, priority);
						currentImplementationMap.put(id, specialDropInstance);
					}
				} else {
					unidentifiedImplementations.add(specialDropInstance);
				}

			} catch (Throwable e) {
			}
		}

		specialDrops = Lists.newLinkedList();
		specialDrops.addAll(unidentifiedImplementations);
		specialDrops.addAll(currentImplementationMap.values());
	}

}
