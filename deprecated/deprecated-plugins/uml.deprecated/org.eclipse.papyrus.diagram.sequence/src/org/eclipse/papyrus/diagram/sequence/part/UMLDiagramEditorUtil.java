/***************************************************************************
 * Copyright (c) 2007 Conselleria de Infraestructuras y Transporte,
 * Generalitat de la Comunitat Valenciana . All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Gabriel Merin Cubero (Prodevelop) – Sequence Diagram implementation
 *
 ******************************************************************************/
package org.eclipse.papyrus.diagram.sequence.part;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;

import org.eclipse.papyrus.diagram.common.providers.IMOSKittEditorFactory;
import org.eclipse.papyrus.diagram.common.util.DiagramEditPartsUtil;
import org.eclipse.papyrus.diagram.common.util.MultiDiagramUtil;
import org.eclipse.papyrus.diagram.sequence.edit.parts.PackageEditPart;

/**
 * @generated
 */
public class UMLDiagramEditorUtil implements IMOSKittEditorFactory {

	/**
	 * @generated
	 */
	public static Map getSaveOptions() {
		Map saveOptions = new HashMap();
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		return saveOptions;
	}

	/**
	 * @generated
	 */
	public static boolean openDiagram(Resource diagram)
			throws PartInitException {
		String path = diagram.getURI().toPlatformString(true);
		IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(path));
		if (workspaceResource instanceof IFile) {
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			return null != page.openEditor(new FileEditorInput(
					(IFile) workspaceResource), UMLDiagramEditor.ID);
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static void setCharset(IFile file) {
		if (file == null) {
			return;
		}
		try {
			file.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		} catch (CoreException e) {
			UMLDiagramEditorPlugin.getInstance().logError(
					"Unable to set charset for file " + file.getFullPath(), e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public static String getUniqueFileName(IPath containerFullPath,
			String fileName, String extension) {
		if (containerFullPath == null) {
			containerFullPath = new Path(""); //$NON-NLS-1$
		}
		if (fileName == null || fileName.trim().length() == 0) {
			fileName = "default"; //$NON-NLS-1$
		}

		extension = "." + extension;
		if (fileName.endsWith(extension)) {
			fileName = fileName.substring(0, fileName.length()
					- extension.length());
		}
		int i = 1;
		IPath filePath = containerFullPath.append(fileName + extension);
		while (ResourcesPlugin.getWorkspace().getRoot().exists(filePath)) {
			i++;
			filePath = containerFullPath.append(fileName + i + extension);
		}
		return filePath.lastSegment();
	}

	/**
	 * Runs the wizard in a dialog.
	 * 
	 * @generated
	 */
	public static void runWizard(Shell shell, Wizard wizard, String settingsKey) {
		IDialogSettings pluginDialogSettings = UMLDiagramEditorPlugin
				.getInstance().getDialogSettings();
		IDialogSettings wizardDialogSettings = pluginDialogSettings
				.getSection(settingsKey);
		if (wizardDialogSettings == null) {
			wizardDialogSettings = pluginDialogSettings
					.addNewSection(settingsKey);
		}
		wizard.setDialogSettings(wizardDialogSettings);
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.create();
		dialog.getShell().setSize(Math.max(500, dialog.getShell().getSize().x),
				500);
		dialog.open();
	}

	/**
	 * This method should be called within a workspace modify operation since it creates resources.
	 * @generated
	 */
	public static Resource createDiagram(URI diagramURI, URI modelURI,
			IProgressMonitor progressMonitor) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor.beginTask(
				Messages.UMLDiagramEditorUtil_CreateDiagramProgressTask, 3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		final Resource modelResource = editingDomain.getResourceSet()
				.createResource(modelURI);
		final String diagramName = diagramURI.lastSegment();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.UMLDiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				Package model = createInitialModel();

				Diagram diagram = ViewService.createDiagram(model,
						PackageEditPart.MODEL_ID,
						UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					attachModelToResource(model, modelResource, diagram);
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}

				try {
					modelResource
							.save(org.eclipse.papyrus.diagram.sequence.part.UMLDiagramEditorUtil
									.getSaveOptions());
					diagramResource
							.save(org.eclipse.papyrus.diagram.sequence.part.UMLDiagramEditorUtil
									.getSaveOptions());
				} catch (IOException e) {

					UMLDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			UMLDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		setCharset(WorkspaceSynchronizer.getFile(modelResource));
		setCharset(WorkspaceSynchronizer.getFile(diagramResource));
		return diagramResource;
	}

	/**
	 * Create a new instance of domain element associated with canvas.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Package createInitialModel() {
		return UMLFactory.eINSTANCE.createPackage();
	}

	/**
	 * Store model element in the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static void attachModelToResource(Package model, Resource resource,
			Diagram diagram) {
		resource.getContents().add(model);
		loadDefaultImports(model, diagram);

	}

	/**
	 * @generated
	 */
	public static void selectElementsInDiagram(
			IDiagramWorkbenchPart diagramPart, List/*EditPart*/editParts) {
		diagramPart.getDiagramGraphicalViewer().deselectAll();

		EditPart firstPrimary = null;
		for (Iterator it = editParts.iterator(); it.hasNext();) {
			EditPart nextPart = (EditPart) it.next();
			diagramPart.getDiagramGraphicalViewer().appendSelection(nextPart);
			if (firstPrimary == null && nextPart instanceof IPrimaryEditPart) {
				firstPrimary = nextPart;
			}
		}

		if (!editParts.isEmpty()) {
			diagramPart.getDiagramGraphicalViewer().reveal(
					firstPrimary != null ? firstPrimary : (EditPart) editParts
							.get(0));
		}
	}

	/**
	 * @generated
	 */
	private static int findElementsInDiagramByID(DiagramEditPart diagramPart,
			EObject element, List editPartCollector) {
		IDiagramGraphicalViewer viewer = (IDiagramGraphicalViewer) diagramPart
				.getViewer();
		final int intialNumOfEditParts = editPartCollector.size();

		if (element instanceof View) { // support notation element lookup
			EditPart editPart = (EditPart) viewer.getEditPartRegistry().get(
					element);
			if (editPart != null) {
				editPartCollector.add(editPart);
				return 1;
			}
		}

		String elementID = EMFCoreUtil.getProxyID(element);
		List associatedParts = viewer.findEditPartsForElement(elementID,
				IGraphicalEditPart.class);
		// perform the possible hierarchy disjoint -> take the top-most parts only
		for (Iterator editPartIt = associatedParts.iterator(); editPartIt
				.hasNext();) {
			EditPart nextPart = (EditPart) editPartIt.next();
			EditPart parentPart = nextPart.getParent();
			while (parentPart != null && !associatedParts.contains(parentPart)) {
				parentPart = parentPart.getParent();
			}
			if (parentPart == null) {
				editPartCollector.add(nextPart);
			}
		}

		if (intialNumOfEditParts == editPartCollector.size()) {
			if (!associatedParts.isEmpty()) {
				editPartCollector.add(associatedParts.iterator().next());
			} else {
				if (element.eContainer() != null) {
					return findElementsInDiagramByID(diagramPart, element
							.eContainer(), editPartCollector);
				}
			}
		}
		return editPartCollector.size() - intialNumOfEditParts;
	}

	/**
	 * @generated
	 */
	public static View findView(DiagramEditPart diagramEditPart,
			EObject targetElement, LazyElement2ViewMap lazyElement2ViewMap) {
		boolean hasStructuralURI = false;
		if (targetElement.eResource() instanceof XMLResource) {
			hasStructuralURI = ((XMLResource) targetElement.eResource())
					.getID(targetElement) == null;
		}

		View view = null;
		if (hasStructuralURI
				&& !lazyElement2ViewMap.getElement2ViewMap().isEmpty()) {
			view = (View) lazyElement2ViewMap.getElement2ViewMap().get(
					targetElement);
		} else if (findElementsInDiagramByID(diagramEditPart, targetElement,
				lazyElement2ViewMap.editPartTmpHolder) > 0) {
			EditPart editPart = (EditPart) lazyElement2ViewMap.editPartTmpHolder
					.get(0);
			lazyElement2ViewMap.editPartTmpHolder.clear();
			view = editPart.getModel() instanceof View ? (View) editPart
					.getModel() : null;
		}

		return (view == null) ? diagramEditPart.getDiagramView() : view;
	}

	/**
	 * @generated
	 */
	public static class LazyElement2ViewMap {
		/**
		 * @generated
		 */
		private Map element2ViewMap;

		/**
		 * @generated
		 */
		private View scope;

		/**
		 * @generated
		 */
		private Set elementSet;

		/**
		 * @generated
		 */
		public final List editPartTmpHolder = new ArrayList();

		/**
		 * @generated
		 */
		public LazyElement2ViewMap(View scope, Set elements) {
			this.scope = scope;
			this.elementSet = elements;
		}

		/**
		 * @generated
		 */
		public final Map getElement2ViewMap() {
			if (element2ViewMap == null) {
				element2ViewMap = new HashMap();
				// map possible notation elements to itself as these can't be found by view.getElement()
				for (Iterator it = elementSet.iterator(); it.hasNext();) {
					EObject element = (EObject) it.next();
					if (element instanceof View) {
						View view = (View) element;
						if (view.getDiagram() == scope.getDiagram()) {
							element2ViewMap.put(element, element); // take only those that part of our diagram
						}
					}
				}

				buildElement2ViewMap(scope, element2ViewMap, elementSet);
			}
			return element2ViewMap;
		}

		/**
		 * @generated
		 */
		static Map buildElement2ViewMap(View parentView, Map element2ViewMap,
				Set elements) {
			if (elements.size() == element2ViewMap.size())
				return element2ViewMap;

			if (parentView.isSetElement()
					&& !element2ViewMap.containsKey(parentView.getElement())
					&& elements.contains(parentView.getElement())) {
				element2ViewMap.put(parentView.getElement(), parentView);
				if (elements.size() == element2ViewMap.size())
					return element2ViewMap;
			}

			for (Iterator it = parentView.getChildren().iterator(); it
					.hasNext();) {
				buildElement2ViewMap((View) it.next(), element2ViewMap,
						elements);
				if (elements.size() == element2ViewMap.size())
					return element2ViewMap;
			}
			for (Iterator it = parentView.getSourceEdges().iterator(); it
					.hasNext();) {
				buildElement2ViewMap((View) it.next(), element2ViewMap,
						elements);
				if (elements.size() == element2ViewMap.size())
					return element2ViewMap;
			}
			for (Iterator it = parentView.getSourceEdges().iterator(); it
					.hasNext();) {
				buildElement2ViewMap((View) it.next(), element2ViewMap,
						elements);
				if (elements.size() == element2ViewMap.size())
					return element2ViewMap;
			}
			return element2ViewMap;
		}
	} //LazyElement2ViewMap	

	/**
	 * @generated
	 */
	public static IFile getFile(URI uri) {
		if (uri.toString().startsWith("platform:/resource")) { //$NON-NLS-1$
			String path = uri.toString().substring(
					"platform:/resource".length()); //$NON-NLS-1$
			IResource workspaceResource = ResourcesPlugin.getWorkspace()
					.getRoot().findMember(new Path(path));
			if (workspaceResource instanceof IFile) {
				return (IFile) workspaceResource;
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	private static void loadDefaultImports(Package model, Diagram diagram) {
		ResourceSet resourceSet = model.eResource().getResourceSet();
		Model umlLibrary = (Model) resourceSet.getResource(
				URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI),
				true).getContents().get(0);
		ElementImport elementImport = null;
		elementImport = model.createElementImport(umlLibrary
				.getOwnedType("Boolean"));
		if (!MultiDiagramUtil.findEObjectReferencedInEAnnotation(diagram,
				elementImport)) {
			MultiDiagramUtil.AddEAnnotationReferenceToDiagram(diagram,
					elementImport);
		}
		elementImport = model.createElementImport(umlLibrary
				.getOwnedType("String"));
		if (!MultiDiagramUtil.findEObjectReferencedInEAnnotation(diagram,
				elementImport)) {
			MultiDiagramUtil.AddEAnnotationReferenceToDiagram(diagram,
					elementImport);
		}
		elementImport = model.createElementImport(umlLibrary
				.getOwnedType("UnlimitedNatural"));
		if (!MultiDiagramUtil.findEObjectReferencedInEAnnotation(diagram,
				elementImport)) {
			MultiDiagramUtil.AddEAnnotationReferenceToDiagram(diagram,
					elementImport);
		}
		elementImport = model.createElementImport(umlLibrary
				.getOwnedType("Integer"));
		if (!MultiDiagramUtil.findEObjectReferencedInEAnnotation(diagram,
				elementImport)) {
			MultiDiagramUtil.AddEAnnotationReferenceToDiagram(diagram,
					elementImport);
		}
	}

	/**
	 * @generated
	 */
	public boolean providesFor(Object object) {
		return true;
	}

	/**
	 * @generated
	 */
	public IEditorPart createEditorFor(Object object) {
		return new UMLDiagramEditor();
	}

}