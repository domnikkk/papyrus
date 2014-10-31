/*******************************************************************************
 * All rights reserved. This program and the accompanying materials
 * are property of the CEA, their use is subject to specific agreement 
 * with the CEA.
 * 
 * Contributors:
 *    CEA LIST - initial API and implementation
 *******************************************************************************/

package org.eclipse.papyrus.uml.diagram.example.programmaticcreation;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageRef;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForHandlers;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLViewProvider;
import org.eclipse.papyrus.uml.diagram.sequence.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.StructuredClassifier;



public class CreateCompositeDiagramElementsCommand extends AbstractEMFOperation {

	public CreateCompositeDiagramElementsCommand(TransactionalEditingDomain domain, ExecutionEvent event, Class context) {
		super(domain, "add collaboration use"); //$NON-NLS-1$
		m_context = context;
		m_event = event;
	}

	/**
	 * Create a collaboration use element
	 * 
	 * @param m_context
	 */
	@Override
	protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {

		try {
			ISashWindowsContainer windowsContainer =
				ServiceUtilsForHandlers.getInstance().getISashWindowsContainer(m_event);
			Object model = windowsContainer.getActiveSashWindowsPage().getRawModel();
			if(model instanceof PageRef) {
				EObject diagramEObj = ((PageRef)model).getEmfPageIdentifier();
				if(diagramEObj instanceof Diagram) {
					Diagram diagram = (Diagram)diagramEObj;
					View view = null;
					// get first view
					for(Object child : diagram.getChildren()) {
						if(child instanceof View) {
							if(((View)child).getElement() == m_context) {
								view = (View)child;
							}
						}
					}
					CollaborationUse cu = ((Class)m_context).createCollaborationUse("testCollaboration"); //$NON-NLS-1$
					addCuToCompositeDiagram((Class) m_context, (Class) m_context, cu, view, diagram);
				}
			}
		}
		catch (ServiceException svcE) {
			System.err.println(svcE.toString());
		}
		return Status.OK_STATUS;
	}

	public View addCuToCompositeDiagram(Class context, StructuredClassifier solutionClass, CollaborationUse cu, View view, Diagram diagram)
	{
		// add CU to compartment
		Object compartment = view.getChildren().get(1);
		View roleBindingView = compViewProvider.createCollaborationUse_3071(cu, (BasicCompartment)compartment, -1, true,
			UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		Location location = NotationFactory.eINSTANCE.createLocation();
		location.setX(50);
		location.setY(40);
		if(roleBindingView instanceof Node) {
			((Node)roleBindingView).setLayoutConstraint(location);
		}
		return roleBindingView;
	}
	
	public static UMLViewProvider compViewProvider = new UMLViewProvider();
	
	protected ExecutionEvent m_event;
	
	protected Class m_context;
}
