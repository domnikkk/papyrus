/*******************************************************************************
 * Copyright (c) 2008 Conselleria de Infraestructuras y Transporte, Generalitat
 * de la Comunitat Valenciana, CEA, and others . All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Francisco Javier Cano Muñoz (Prodevelop) – Initial implementation.
 * 				 Gabriel Merin Cubero (Prodevelop) – Added version to diagrams
 *               Christian W. Damus (CEA) - bug 422257
 *
 ******************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.common.core.util.Log;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

/**
 * The Class MultiDiagramUtil.
 *
 * @author <a href="fjcano@prodevelop.es">Francisco Javier Cano Muñoz</a>
 * @author <a href="gmerin@prodevelop.es">Grabriel Merin Cubero</a>
 *
 */
public class MultiDiagramUtil {

	/**
	 * Gets the save options.
	 *
	 * @return the save options
	 */
	public static Map getSaveOptions() {
		Map saveOptions = new HashMap();
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		return saveOptions;
	}

	/**
	 * Checks if is diagram active.
	 *
	 * @param diagram
	 *            the diagram
	 *
	 * @return true, if is diagram active
	 */
	public static boolean isDiagramActive(Diagram diagram) {
		IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (activeEditor instanceof DiagramEditor) {
			DiagramEditor diagramEditor = (DiagramEditor) activeEditor;
			Diagram activeDiagram = diagramEditor.getDiagram();
			if (diagram.equals(activeDiagram)) {
				return true;
			}
		} else if (activeEditor != null) {
			Diagram activeDiagram = (Diagram) activeEditor.getAdapter(Diagram.class);
			if (activeDiagram != null && activeDiagram.equals(diagram)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Adds a diagram to a resource and saves the resource.
	 *
	 * @param diagram
	 * @param resource
	 * @param save
	 * @return
	 */
	public static boolean addDiagramAndSave(Diagram diagram, Resource resource, boolean save) {
		if (diagram == null || resource == null) {
			return false;
		}
		resource.getContents().add(diagram);
		if (save) {
			try {
				resource.save(getSaveOptions());
			} catch (IOException ex) {
				IStatus status = new Status(IStatus.ERROR, Activator.ID, "Error saving resource");
				Activator.getDefault().getLog().log(status);
				return false;
			}
		}
		return true;
	}

	/**
	 * Deletes a <Diagram> in the given <Resource>.
	 *
	 * @param diagram
	 *            the diagram
	 * @param resource
	 *            the resource
	 *
	 * @return true, if delete diagram from resource
	 */
	public static boolean deleteDiagramFromResource(Diagram diagram, Resource resource) {
		if (diagram == null || resource == null) {
			return false;
		}
		resource.getContents().remove(diagram);
		return resource.getContents().contains(diagram) == false;
	}

	/**
	 * Closes all diagram editors that are showing the given <Diagram>.
	 *
	 * @param diagram
	 *            diagram to be closed
	 */
	public static void closeEditorsThatShowDiagram(Diagram diagram) {
		if (diagram == null) {
			return;
		}
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorReference[] editors = page.getEditorReferences();
		for (IEditorReference editorReference : editors) {
			IEditorPart editorPart = editorReference.getEditor(false);
			if (editorPart instanceof DiagramEditor) {
				DiagramEditor diagramEditor = (DiagramEditor) editorPart;
				Diagram editorDiagram = diagramEditor.getDiagram();
				if (diagram.equals(editorDiagram)) {
					page.closeEditor(diagramEditor, true);
				}
			}
		}
	}

	/**
	 * Delete and save e object in resource.
	 *
	 * @param uri
	 *            the uri
	 * @param fragment
	 *            the fragment
	 *
	 * @return true, if successful
	 */
	// @unused
	public static boolean deleteAndSaveEObjectInResource(URI uri, String fragment) {
		URI resourceURI = uri;
		final ResourceSet resourceSet = new ResourceSetImpl();

		try {
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			Resource resource = resourceSet.getResource(resourceURI, true);
			EObject toDelete = resource.getEObject(fragment);
			if (toDelete != null && resource.getContents().contains(toDelete)) {
				resource.getContents().remove(toDelete);
				try {
					resource.save(getSaveOptions());
				} catch (IOException e) {
					Log.error(null, 0, "Error saving resource " + resource.toString(), e);
					return false;
				}
			}
		} finally {
			EMFHelper.unload(resourceSet);
		}

		return true;
	}

	/**
	 * Gets the other diagram.
	 *
	 * @param diagram
	 *            the diagram
	 *
	 * @return the other diagram
	 */
	public static Diagram getOtherDiagram(Diagram diagram) {
		if (diagram == null) {
			return null;
		}

		EObject domainElement = diagram.getElement();
		Resource gmfResource = diagram.eResource();
		for (EObject eObject : gmfResource.getContents()) {
			if (eObject instanceof Diagram) {
				Diagram newDiagram = (Diagram) eObject;
				if (diagram.equals(newDiagram) == false && domainElement.equals(newDiagram.getElement())) {
					return newDiagram;
				}
			}
		}
		// no diagram that includes this element was found
		// search for diagrams that include the parent element
		domainElement = domainElement.eContainer();

		return null;
	}

}
