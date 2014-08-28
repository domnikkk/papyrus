/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
 * All rights reserved.
 * This code is the property of CEA LIST, this use is subject to specific
 * agreement with the CEA LIST.
 * Contributors:
 *     CEA LIST. - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.uml.diagram.synchronizeview.customization;

import java.util.HashMap;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPart;
import org.eclipse.papyrus.infra.gmfdiag.common.Activator;
import org.osgi.framework.Bundle;

/**
 * This the registry of to get the class that can give info about childreen of an editpart. this is a singleton.
 */
public class SynchroSemanticChildRegistry {

	private static final String SEMANTICCHILD_EXTENSION_ID = "org.eclipse.papyrus.uml.diagram.synchronizeview.semanticchild";

	private static final String EDITPART = "editPart";

	private static final String GET_SEMANTIC_CHILDREN = "getSemanticChildren";

	private static final String PRIORITY = "priority";

	protected HashMap<Class<? extends EditPart>, SemanticChild> semanticMap = new HashMap<Class<? extends EditPart>, SemanticChild>();

	protected static SynchroSemanticChildRegistry eInstance = null;

	/**
	 *
	 * @return the instance of SynchroSemanticChildRegistry
	 */
	public static SynchroSemanticChildRegistry getInstance() {
		if (eInstance == null) {
			eInstance = new SynchroSemanticChildRegistry();
		}
		return eInstance;
	}

	public SynchroSemanticChildRegistry() {
		init();
	}

	/**
	 * this method init loading of extension points
	 */
	public void init() {
		// Reading data from plugins
		IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(SEMANTICCHILD_EXTENSION_ID);
		for (int i = 0; i < configElements.length; i++) {
			SemanticChild semanticChild = createSemanticChild(configElements[i]);
			if (semanticMap.get(semanticChild.getEditPart()) != null) {
				if (semanticMap.get(semanticChild.getEditPart()).getPriority() <= semanticChild.getPriority()) {
					semanticMap.remove(semanticChild.getEditPart());
					semanticMap.put(semanticChild.getEditPart(), semanticChild);
				}
			} else {
				semanticMap.put(semanticChild.getEditPart(), semanticChild);
			}
		}
	}




	/**
	 * Load one semanticChild
	 *
	 * @param element
	 *            the extension point
	 */
	protected SemanticChild createSemanticChild(IConfigurationElement element) {
		Class<? extends EditPart> editPart = null;
		ISynchroSemanticChild synchroSemanticChild = null;
		int priority = 0;
		SemanticChild semanticChild = null;
		try {
			editPart = LoadExtension(element, element.getAttribute(EDITPART));
			synchroSemanticChild = (ISynchroSemanticChild) createExtension(element, element.getAttribute(GET_SEMANTIC_CHILDREN));
			if (element.getAttribute(PRIORITY) != null) {
				priority = Integer.getInteger(element.getAttribute(PRIORITY)).intValue();
			}
			semanticChild = new SemanticChild(editPart, synchroSemanticChild, priority);
		} catch (Exception e) {
			Activator.log.error("" + element + " can not be loaded ", e);
		}
		return semanticChild;
	}


	/**
	 * Load an the class
	 *
	 * @param element
	 *            the extension point
	 * @param classAttribute
	 *            the name of the class to load
	 * @return the loaded Class
	 * @throws Exception
	 *             if the class is not loaded
	 */
	@SuppressWarnings("unchecked")
	protected static Class<? extends EditPart> LoadExtension(final IConfigurationElement element, final String classAttribute) throws Exception {
		try {
			Bundle extensionBundle = Platform.getBundle(element.getDeclaringExtension().getNamespaceIdentifier());
			Class<?> clazz = extensionBundle.loadClass(classAttribute);
			return ((Class<? extends EditPart>) clazz);
		} catch (Exception e) {
			throw new Exception("unable to create Extension" + e);
		}
	}

	/**
	 * Load an instance of a class
	 *
	 * @param element
	 *            the extension point
	 * @param classAttribute
	 *            the name of the class to load
	 * @return the loaded Class
	 * @throws Exception
	 *             if the class is not loaded
	 */
	protected static Object createExtension(final IConfigurationElement element, final String classAttribute) throws Exception {
		try {
			Bundle extensionBundle = Platform.getBundle(element.getDeclaringExtension().getNamespaceIdentifier());
			@SuppressWarnings("rawtypes")
			Class clazz = extensionBundle.loadClass(classAttribute);
			Object obj = clazz.newInstance();
			return obj;
		} catch (Exception e) {
			throw new Exception("unable to create Extension" + e);
		}
	}

	/**
	 * @param editPart
	 * @return {@link ISynchroSemanticChild} from a editpart or null
	 */
	public ISynchroSemanticChild getSynchroSemanticChild(Class<? extends EditPart> editPart) {
		if (semanticMap.get(editPart) != null) {
			return semanticMap.get(editPart).getSynchroSemanticChild();
		}
		return null;
	}


}
