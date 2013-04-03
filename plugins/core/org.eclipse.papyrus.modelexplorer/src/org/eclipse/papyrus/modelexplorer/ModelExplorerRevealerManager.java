/*****************************************************************************
 * Copyright (c) 2013 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.modelexplorer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.modelexplorer.matching.IMatchingItem;
import org.eclipse.papyrus.modelexplorer.revealer.IChainLink;
import org.eclipse.papyrus.modelexplorer.revealer.IModelExplorerRevealerParticipant;

import com.google.common.collect.Iterables;

/**
 * This manager create a chain of {@link IMatchingItem} used to reveal a Target {@link EObject} in the model explorer view
 * 
 * @author adaussy
 * 
 */
public class ModelExplorerRevealerManager {

	private static final String OVERRIDABLE_PRIORITY_EXT_ATTRIBUTE = "overridablePriority";////$NON-NLS-0$

	private static final String REVEALER_EXT_ELEM = "Participant";////$NON-NLS-0$

	private static final String EXT_POINT_ID = "org.eclipse.papyrus.modelexplorer.modelExplorerRevealer";////$NON-NLS-0$

	private static final String IMPL_REAVEALER_EXT_ATTRIBUTE = "impl";////$NON-NLS-0$

	private static final String PRIORITY_EXT_ATTRIBUTE = "priority";////$NON-NLS-0$

	private static final String ID_EXT_ATTRIBUTE = "id";////$NON-NLS-0$

	/**
	 * All Revealer participants (ordered by priority)
	 */
	protected static final IModelExplorerRevealerParticipant[] orderedMERevealer;

	/**
	 * Participant wrapper
	 * 
	 * @author adaussy
	 * 
	 */
	protected static class ModelExplorerRevealerPriorityWrapper implements Comparable<ModelExplorerRevealerPriorityWrapper> {

		public IModelExplorerRevealerParticipant handler;

		/**
		 * Priority used to compute the order in which revealer will be called
		 */
		public int priority;

		/**
		 * Priority used to override an existing revealer
		 */
		public int overidablePriority;

		public int compareTo(ModelExplorerRevealerPriorityWrapper o) {
			if(o.priority > priority) {
				return 1;
			} else if(o.priority < priority) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	static {
		IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXT_POINT_ID);
		List<ModelExplorerRevealerPriorityWrapper> handlerPriorityPairs = new LinkedList<ModelExplorerRevealerPriorityWrapper>();
		Map<String, ModelExplorerRevealerPriorityWrapper> idMap = new HashMap<String, ModelExplorerRevealerManager.ModelExplorerRevealerPriorityWrapper>();
		for(IConfigurationElement elem : configElements) {
			if(REVEALER_EXT_ELEM.equals(elem.getName())) {
				try {
					ModelExplorerRevealerPriorityWrapper handlerPriorityPair = new ModelExplorerRevealerPriorityWrapper();
					handlerPriorityPair.handler = (IModelExplorerRevealerParticipant)elem.createExecutableExtension(IMPL_REAVEALER_EXT_ATTRIBUTE);
					handlerPriorityPair.priority = Integer.parseInt(elem.getAttribute(PRIORITY_EXT_ATTRIBUTE));
					handlerPriorityPair.overidablePriority = Integer.parseInt(elem.getAttribute(OVERRIDABLE_PRIORITY_EXT_ATTRIBUTE));
					//Look for an id.
					String id = elem.getAttribute(ID_EXT_ATTRIBUTE);
					if(id != null) {
						//if any then the handler could be overrided by another registration
						ModelExplorerRevealerPriorityWrapper oldHandler = idMap.get(id);
						if(oldHandler == null) {
							idMap.put(id, handlerPriorityPair);
							handlerPriorityPairs.add(handlerPriorityPair);
						} else {
							if(oldHandler.overidablePriority < handlerPriorityPair.overidablePriority) {
								handlerPriorityPairs.remove(oldHandler);
								handlerPriorityPairs.add(handlerPriorityPair);
							}
						}
					} else {
						//If none the handler can not be overrided
						handlerPriorityPairs.add(handlerPriorityPair);
					}
				} catch (Exception e) {
				}
			}
		}
		Collections.sort(handlerPriorityPairs);
		orderedMERevealer = new IModelExplorerRevealerParticipant[handlerPriorityPairs.size()];
		for(int i = 0; i < orderedMERevealer.length; i++) {
			orderedMERevealer[i] = handlerPriorityPairs.get(i).handler;
		}
	}

	/**
	 * Find the correct participant to create a {@link IChainLink} for this input
	 * 
	 * @param targetEObject
	 * @return
	 */
	protected static IChainLink getRevealerChain(EObject targetEObject) {
		for(int i = 0; i < orderedMERevealer.length; i++) {
			IModelExplorerRevealerParticipant revealer = orderedMERevealer[i];
			IChainLink chain = revealer.getRevealerChain(targetEObject);
			if(chain != null) {
				return chain;
			}
		}
		return null;
	}

	/**
	 * Return the list of element to reveal to reach the target EObject. (The target EObject is not included in the chain)
	 * 
	 * @param targetEObject
	 * @return
	 */
	public static Iterable<IMatchingItem> getChainToReveal(EObject targetEObject) {
		List<IMatchingItem> matchinELements = new ArrayList<IMatchingItem>();
		IChainLink chainLink = ModelExplorerRevealerManager.getRevealerChain(targetEObject);
		while(chainLink != null && chainLink.getNextObject() != null) {
			matchinELements.addAll(chainLink.getMatchingObjects());
			chainLink = ModelExplorerRevealerManager.getRevealerChain(chainLink.getNextObject());
		}
		Iterable<IMatchingItem> reverseParents = Iterables.reverse(matchinELements);
		return reverseParents;
	}
}
