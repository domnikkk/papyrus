/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin cedric.dumoulin@lifl.fr - Initial API and implementation
 *  Yann Tanguy yann.tanguy@cea.fr - Adapted from Class Diagram
 *
 *****************************************************************************/

package org.eclipse.papyrus.diagram.composite;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.l10n.EditorMessages;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.papyrus.core.adaptor.gmf.GmfMultiDiagramDocumentProvider;
import org.eclipse.papyrus.core.editor.BackboneException;
import org.eclipse.papyrus.core.services.ServiceException;
import org.eclipse.papyrus.core.services.ServicesRegistry;
import org.eclipse.papyrus.diagram.common.listeners.DropTargetListener;
import org.eclipse.papyrus.diagram.composite.part.UMLDiagramEditor;
import org.eclipse.papyrus.diagram.composite.part.UMLDiagramEditorPlugin;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

/**
 * <pre>
 * An editor to be used in multitabs editor. 
 * This editor extends the original UMLDiagramEditor generated by GMF.
 * </pre>
 */
public class UmlCompositeDiagramForMultiEditor extends UMLDiagramEditor {

	/**
	 * The location of diagram icon in the plug-in
	 */
	private static final String DIAG_IMG_PATH = "icons/obj16/Diagram_CompositeStructureDiagram.gif"; //$NON-NLS-1$

	/**
	 * The EditingDomain ID for this diagram
	 */
	private static final String CSD_EDITING_DOMAIN_ID = "org.eclipse.papyrus.diagram.composite.EditingDomain"; //$NON-NLS-1$

	/**
	 * The image descriptor of the diagram icon
	 */
	private static final ImageDescriptor DIAG_IMG_DESC = UMLDiagramEditorPlugin.getBundledImageDescriptor(DIAG_IMG_PATH);

	/**
	 * Parent
	 */
	// private GmfEditorContext context;

	/** The editing domain. */
	private TransactionalEditingDomain editingDomain;

	private IDocumentProvider documentProvider;

	/**
	 * Constructor. Context and required objects are retrieved from the ServiceRegistry.
	 * 
	 * @throws BackboneException
	 * @throws ServiceException
	 * 
	 */
	public UmlCompositeDiagramForMultiEditor(ServicesRegistry servicesRegistry, Diagram diagram) throws BackboneException, ServiceException {
		super(servicesRegistry, diagram);

		editingDomain = servicesRegistry.getService(TransactionalEditingDomain.class);
		documentProvider = new GmfMultiDiagramDocumentProvider(editingDomain);

		// overrides editing domain created by super constructor
		setDocumentProvider(documentProvider);
	}

	/**
	 * Overrides createEditingDomain.
	 * 
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor#createEditingDomain()
	 */
	@Override
	protected TransactionalEditingDomain createEditingDomain() {
		return editingDomain;
	}

	/**
	 * Overrides getEditingDomain.
	 * 
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.diagram.clazz.part.UMLDiagramEditor#getEditingDomain()
	 */
	@Override
	public TransactionalEditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * Overrides doSave.
	 * 
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// The saving of the resource is done by the CoreMultiDiagramEditor
		// Just notify the command stack here
		getCommandStack().markSaveLocation();
	}

	/**
	 * Returns an editing domain id used to retrive an editing domain from the editing domain
	 * registry. Clients should override this if they wish to use a shared editing domain for this
	 * editor. If null is returned then a new editing domain will be created per editor instance.
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor#getEditingDomainID()
	 * 
	 */
	@Override
	public String getEditingDomainID() {
		return CSD_EDITING_DOMAIN_ID;
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public GraphicalViewer getGraphicalViewer() {
		return super.getGraphicalViewer();
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		// Set name after calling super.init()
		setPartName(getDiagram().getName());
		setTitleImage(DIAG_IMG_DESC.createImage());
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();

		// Enable Drop
		getDiagramGraphicalViewer().addDropTargetListener(new DropTargetListener(getDiagramGraphicalViewer(), LocalSelectionTransfer.getTransfer()) {

			@Override
			protected Object getJavaObject(TransferData data) {
				return LocalSelectionTransfer.getTransfer().nativeToJava(data);
			}

			@Override
			protected TransactionalEditingDomain getTransactionalEditingDomain() {
				return getEditingDomain();
			}
		});
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void setInput(IEditorInput input) {
		try {
			// We are in a nested editor.
			// Provide an URI with fragment in order to reuse the same Resource
			// and to set the diagram to the fragment.
			// First, compute the URI
			URIEditorInput uriInput = new URIEditorInput(EcoreUtil.getURI(getDiagram()));
			System.err.println(this.getClass().getSimpleName() + ".setInput(" + uriInput.toString() + ")"); //$NON-NLS-1$
			doSetInput(uriInput, true);
		} catch (CoreException x) {
			String title = EditorMessages.Editor_error_setinput_title;
			String msg = EditorMessages.Editor_error_setinput_message;
			Shell shell = getSite().getShell();
			ErrorDialog.openError(shell, title, msg, x.getStatus());
		}
	}
}
