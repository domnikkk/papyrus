/*******************************************************************************
 * Copyright (c) 2013 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Dumoulin - cedric.dumoulin@lifl.fr
 ******************************************************************************/
package org.eclipse.papyrus.uml.profile.drafter.ui.handler;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForIEvaluationContext;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.ui.IEditorPart;

/**
 * Base class for Handlers .
 * This class provide utility methods.
 * @author cedric dumoulin
 *
 */
public abstract class AbstractBaseHandler extends AbstractHandler {

	/**
	 * Cached list of selections.
	 */
	private List<Object> cachedSelections;

	/**
	 * Constructor.
	 *
	 */
	public AbstractBaseHandler() {
		super();
	}

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 * @param event
	 * @return
	 * @throws ExecutionException
	 * 
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		resetCachedValues();
		
		// Get requested objects
		IEvaluationContext context;
		try {
			context = getIEvaluationContext(event);
		} catch (NotFoundException e) {
			// silently fails
			return null;
		}


		// Execute the command in 3 phases
		if (!preExecute(event, context) ) {
			return null;
		}
		executeTransaction(event, context);
		postExecute(event, context);

		return null;
	}

	/**
	 * Reset all cached values associated with this handlers.
	 * The handlers is reused across subsequent calls. So, it is needed to reset the cached values.
	 */
	protected void resetCachedValues() {
		cachedSelections = null;
	}

	/**
	 * Method call prior to doExecute
	 * This method should be overloaded by subclass wishing to initialize the command
	 * outside of the transaction.
	 * 
	 * @param event
	 * @param context 
	 * @return true if the doExecute() should be called, false if the command should stop
	 */
	protected boolean preExecute(ExecutionEvent event, IEvaluationContext context) throws ExecutionException {
		return true;
	}

	/**
	 * Method call after {@link #doExecute(ExecutionEvent, IEvaluationContext, List)}
	 * This method should be overloaded by subclass wishing to do some post-processing
	 * outside of the transaction.
	 * 
	 * @param event
	 * @param context 
	 */
	protected void postExecute(ExecutionEvent event, IEvaluationContext context) throws ExecutionException {
		// TODO Auto-generated method stub
		
	}


	/**
	 * Execute as transaction
	 * @param event 
	 * @param selections 
	 * @param context 
	 */
	private void executeTransaction(ExecutionEvent event, final IEvaluationContext context) {

		// Get requested objects
		final TransactionalEditingDomain editingDomain;
		final ExecutionEvent finalEvent = event;
		try {
			editingDomain = lookupTransactionalEditingDomain(context);
		} catch (ServiceException e) {
			// silently fails
			return;
		}


		Command cmd = new RecordingCommand(editingDomain, getCommandName()) {

			@Override
			protected void doExecute() {
				try {
					AbstractBaseHandler.this.doExecute(finalEvent, context);
				} catch (Exception e) {
					// TODO for debug. To be removed or logged
					e.printStackTrace();
				}
			}

			
		};

		editingDomain.getCommandStack().execute(cmd);

	}

	/**
	 * get the selected objects from the context.
	 * @param context
	 * @return
	 */
	protected List<Object> getCachedSelections(IEvaluationContext context) {

		if( cachedSelections == null) {
			cachedSelections = getSelections(context);
		}
		
		return cachedSelections;
	}
	
	/**
	 * get the selected objects from the context.
	 * @param context
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<Object> getSelections(IEvaluationContext context) {
		Object sel = context.getVariable("selection");
		if(! (sel instanceof IStructuredSelection)) {
			return Collections.emptyList();
		}

		IStructuredSelection structuredSelection = (IStructuredSelection)sel;

		return structuredSelection.toList();
	}

	/**
	 * Return a list of selected element of the expected type.
	 * If a selected element is not of the expected type, it is ignored.
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected <T> List<T> getSelectionsByType(IEvaluationContext context, Class<T> expectedType) {
		List<Object> selections = getCachedSelections(context);

		List<T> results = new ArrayList<T>();

		// create model with EList<EObject> objects
		for(Object obj : selections) {
			
			T ele = null;

			// Bug in Tree Explorer
			// ModelExplorer tree element do not implements IAdaptable. So, we should manually get the underlying adaptable object.
//			if( obj instanceof EObjectTreeElement ) {
//				obj = ((EObjectTreeElement)obj).getEObject();
//			}

			// Adapt object to NamedElement
			if(obj instanceof IAdaptable) {
				ele = (T)((IAdaptable)obj).getAdapter(expectedType);
			}
			if(ele == null) {
				ele = (T)Platform.getAdapterManager().getAdapter(obj, expectedType);
			}

			// Add uml element if found
			if(ele != null) {
				results.add(ele);
			}

		}

		return results;
	}

	/**
	 * Get the name used in the {@link RecordingCommand}. This name will be visible in 
	 * undo/redo.
	 * 
	 * @return The command name to show.
	 */
	public abstract String getCommandName();

	/**
	 * Do the execution of the command.
	 * Subclass should implements this method.
	 * 
	 * @param notationDiagramHelper
	 */
	protected abstract void doExecute(ExecutionEvent event, IEvaluationContext context);

//	/**
//	 * 
//	 * @return
//	 * @throws NotFoundException
//	 */
//	protected LayerStackMngr lookupLayerStackMngrChecked() throws NotFoundException {
//		
//		return lookupLayersViewChecked().getLayerStackMngrChecked();
//		
//	}

	
	protected IEvaluationContext getIEvaluationContext(ExecutionEvent event) throws NotFoundException {
		try {
			return (IEvaluationContext)event.getApplicationContext();
		} catch (ClassCastException e) {
			throw new NotFoundException("IEvaluationContext can't be found.");
		}
		
	}
	/**
	 * Try to lookup the TransactionalEditingDomain.
	 * @return
	 * @throws ServiceException If the Editing domain can't be found.
	 */
	protected TransactionalEditingDomain lookupTransactionalEditingDomain(IEvaluationContext context) throws ServiceException {

		// Get page from the event !
//	    IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
		
	    return ServiceUtilsForIEvaluationContext.getInstance().getTransactionalEditingDomain(context);
	}

	/**
	 * Lookup the {@link ServicesRegistry}.
	 * Misc method.
	 * 
	 * @param context
	 * @return
	 * @throws ServiceException 
	 */
	protected ServicesRegistry lookupServicesRegistry(IEvaluationContext context) throws ServiceException {
		return ServiceUtilsForIEvaluationContext.getInstance().getServiceRegistry(context);
	}


	/**
	 * Called by framework. Need to set the enabled flag.
	 * 
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		
		resetCachedValues();
		
		if( ! (evaluationContext instanceof IEvaluationContext)) {
			setBaseEnabled(false);
			return;
		}
		
		IEvaluationContext context = (IEvaluationContext)evaluationContext;

		List<Object> selections = getCachedSelections(context);
		// Ask the subclass
		setBaseEnabled(isEnabled(context, selections));
		
	}
	
	/**
	 * Return true if the action is enabled, false otherwise.
	 * Subclasses should implements this method. The default implementation return true.
	 * @param context
	 * @return
	 */
	public boolean isEnabled(IEvaluationContext context, List<Object> selections) {
		return true;
	}

	//	/**
	//	 * 
	//	 * @return
	//	 * @throws NotFoundException
	//	 */
	//	protected LayerStackMngr lookupLayerStackMngrChecked() throws NotFoundException {
	//		
	//		return lookupLayersViewChecked().getLayerStackMngrChecked();
	//		
	//	}
	
	/**
	 * lookup the notation diagram helper.
	 * This method can be used from {@link #execute(ExecutionEvent)} or {@link #setEnabled(Object)}.
	 * 
	 * @return The 
	 * @throws NotFoundException
	 * @throws ServiceException 
	 */
//	protected NotationDiagramHelper lookupNotationDiagramHelperChecked(IEvaluationContext context) throws NotFoundException, ServiceException {
//		
//		
//		// Get page from the event !
////	    IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
//		
//		IEditorPart editor = ServiceUtilsForIEvaluationContext.getInstance().getNestedActiveIEditorPart(context);
//
//		if( ! (editor instanceof DiagramDocumentEditor) ) {
//			throw new NotFoundException("Selected editor do not contains Diagram");
//		}
//		DiagramDocumentEditor diagramEditor = (DiagramDocumentEditor)editor;
//		
//		Diagram diagram = diagramEditor.getDiagram();
//		if(diagram == null) {
//			throw new NotFoundException("Selected editor do not contains Diagram");			
//		}
//		
//		// Lookup the Layer model
//		LayersModel layersModel = (LayersModel)ServiceUtilsForIEvaluationContext.getInstance().getModelSet(context).getModel(LayersModel.MODEL_ID);
//		// Return a new instance of the Helper
//		return new NotationDiagramHelper(layersModel, diagram);
//	}

	/**
	 * lookup the LayerStack application object from context..
	 * This method can be used from {@link #execute(ExecutionEvent)} or {@link #setEnabled(Object)}.
	 * 
	 * @return The 
	 * @throws NotFoundException
	 * @throws ServiceException 
	 * @throws org.eclipse.papyrus.infra.core.resource.NotFoundException 
	 */
//	protected LayersStackApplication lookupLayersStackApplicationChecked(IEvaluationContext context) throws NotFoundException, ServiceException, org.eclipse.papyrus.infra.core.resource.NotFoundException {
//		
//		ModelSet modelSet = ServiceUtilsForIEvaluationContext.getInstance().getModelSet(context);
//		LayersModel model = (LayersModel)modelSet.getModelChecked(LayersModel.MODEL_ID);
//
//		return model.lookupLayerStackApplication();
//	}

		//	/**
		//	 * 
		//	 * @return
		//	 * @throws NotFoundException
		//	 */
		//	protected LayerStackMngr lookupLayerStackMngrChecked() throws NotFoundException {
		//		
		//		return lookupLayersViewChecked().getLayerStackMngrChecked();
		//		
		//	}
		
		/**
		 * Get the notation diagram helper.
		 * This method can be used from {@link #execute(ExecutionEvent)} or {@link #setEnabled(Object)}.
		 * 
		 * @return The
		 * @throws NotFoundException
		 * @throws ServiceException
		 */
		protected Diagram lookupNotationDiagramChecked(IEvaluationContext context) throws NotFoundException, ServiceException {
		
			IEditorPart editor = ServiceUtilsForIEvaluationContext.getInstance().getNestedActiveIEditorPart(context);
		
			if(!(editor instanceof DiagramDocumentEditor)) {
				throw new NotFoundException("Selected editor do not contains Diagram"); //$NON-NLS-1$
			}
			DiagramDocumentEditor diagramEditor = (DiagramDocumentEditor)editor;
		
			Diagram diagram = diagramEditor.getDiagram();
			if(diagram == null) {
				throw new NotFoundException("Selected editor do not contains Diagram"); //$NON-NLS-1$
			}
		
			// Return a new instance of the Helper
			return diagram;
		}

		/**
		 * Return true if the first element of the selection is instance of the specified type.
		 */
		protected boolean selectionFirstElementInstanceOf(List<Object> selections, Class<?> type) {
	        if( selections.size() != 1) {
	        	return false;
	        }
	        Object first = selections.get(0);
			return type.isInstance(first);
		}

}
