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
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.IdentityAnchor;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageRef;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForHandlers;
import org.eclipse.papyrus.uml.diagram.sequence.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.diagram.sequence.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.sequence.providers.UMLViewProvider;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.UMLPackage;


public class CreateSequenceDiagramElementsCommand extends AbstractEMFOperation {

	public CreateSequenceDiagramElementsCommand(TransactionalEditingDomain domain, ExecutionEvent event, Class context) {
		super(domain, "add lifelines and message"); //$NON-NLS-1$
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
					View interactionView = null;
					// get first view
					for(Object child : diagram.getChildren()) {
						if(child instanceof View) {
							if(((View)child).getElement() == m_context) {
								interactionView = (View)child;
							}
						}
					}
		
					// create UML elements first
					Interaction interaction = (Interaction) m_context;
					Lifeline lifeline1 = interaction.createLifeline("TestLifeline1"); //$NON-NLS-1$
					Lifeline lifeline2 = interaction.createLifeline("TestLifeline2"); //$NON-NLS-1$
					MessageOccurrenceSpecification mosSrc = (MessageOccurrenceSpecification)
							interaction.createFragment("source", //$NON-NLS-1$
							UMLPackage.eINSTANCE.getMessageOccurrenceSpecification());
					MessageOccurrenceSpecification mosDst = (MessageOccurrenceSpecification)
							interaction.createFragment("target", //$NON-NLS-1$
							UMLPackage.eINSTANCE.getMessageOccurrenceSpecification());
					Message message = interaction.createMessage("from l1 to l2"); //$NON-NLS-1$
					mosSrc.setMessage(message);
					mosSrc.setCovered(lifeline1);
					mosDst.setMessage(message);
					mosDst.setCovered(lifeline2);
					message.setSendEvent(mosSrc);
					message.setReceiveEvent(mosDst);
	
					DurationConstraint durationConstraint = (DurationConstraint)
							interaction.createOwnedRule("constraint", UMLPackage.eINSTANCE.getDurationConstraint()); //$NON-NLS-1$
					// DurationInterval di = (DurationInterval)
							// durationConstraint.createSpecification("", null, UMLPackage.eINSTANCE.getDurationInterval()); //$NON-NLS-1$
					
					// now add graphical elements
					View lifelineV1 = addLifeline(lifeline1, interactionView, 40, 40);
					View lifelineV2 = addLifeline(lifeline2, interactionView, 170, 40);
					addDurationConstraint(durationConstraint, interactionView, 250, 100);
					addMessage(message, diagram, lifelineV1, lifelineV2);
				}
			}
		}
		catch (ServiceException svcE) {
			System.err.println(svcE.toString());
		}
		return Status.OK_STATUS;
	}

	/**
	 * Add a lifeline view for a given UML lifeline within an interaction view
	 * @param lifeline the UML lifeline
	 * @param interactionView the view associated with the interaction	
	 * @param x layout hint
	 * @param y layout hint
	 * @return the created view
	 */
	public View addLifeline(Lifeline lifeline, View interactionView, int x, int y)
	{
		// get first compartment of view
		Object compartment = interactionView.getChildren().get(1);
		// use the view service to create the types. This is a bit cleaner than using the sequence-diagram view provider directly
		final String nodeType = UMLVisualIDRegistry.getType( org.eclipse.papyrus.uml.diagram.sequence.edit.parts.LifelineEditPart.VISUAL_ID);
		Node lifelineView = ViewService.createNode((View) compartment, lifeline, nodeType, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		Bounds location = NotationFactory.eINSTANCE.createBounds();
		location.setX(x);
		location.setY(y);
		if(lifelineView instanceof Node) {
			((Node)lifelineView).setLayoutConstraint(location);
			//((Node)lifelineView).setLayoutConstraint(value);(location);
		}
		if(lifelineView instanceof Shape) {
			Shape lifelineShape = (Shape) lifelineView;
			lifelineShape.setLineWidth(2);
			lifelineShape.setLineColor(11579568);
		}
		return lifelineView;
	}

	/**
	 * Add a duration-constraint view for a given UML constraint within an interaction view
	 * @param durationContraint a duration constraint
	 * @param interactionView the view associated with the interaction	
	 * @param x layout hint
	 * @param y layout hint
	 * @return the created view
	 */
	public View addDurationConstraint(DurationConstraint durationContraint, View interactionView, int x, int y)
	{
		// get first compartment of view
		Object compartment = interactionView.getChildren().get(1);
		Node lifelineView = sequenceDiagViewProvider.createDurationConstraint_3021(durationContraint, (View) compartment, -1, true,
			UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		Bounds location = NotationFactory.eINSTANCE.createBounds();
		location.setX(x);
		location.setY(y);
		if(lifelineView instanceof Node) {
			((Node)lifelineView).setLayoutConstraint(location);
		}
		return lifelineView;
	}
	
	/**
	 * Add a message view for a given UML message within a given diagram
	 * @param message UML message
	 * @param diagram Sequence diagram
	 * @param lifelineSrcV view of source lifeline
	 * @param lifelineDstV view of destination lifeline
	 */
	public void addMessage(Message message, Diagram diagram, View lifelineSrcV, View lifelineDstV)
	{
		View messageView = sequenceDiagViewProvider.createMessage_4004(message, diagram, -1, true,
				UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		if(messageView instanceof Edge) {
			Edge messageEdge = (Edge) messageView;
			messageEdge.setSource(lifelineSrcV);
			messageEdge.setTarget(lifelineDstV);
			IdentityAnchor sourceAnchor = (IdentityAnchor)
				messageEdge.createSourceAnchor(NotationPackage.eINSTANCE.getIdentityAnchor());
			IdentityAnchor targetAnchor = (IdentityAnchor)
					messageEdge.createSourceAnchor(NotationPackage.eINSTANCE.getIdentityAnchor());
			sourceAnchor.setId("(1.0,0.7){R}"); //$NON-NLS-1$
			targetAnchor.setId("(1.1,0.7){R}"); //$NON-NLS-1$
		}
	}
	
	public static UMLViewProvider sequenceDiagViewProvider = new UMLViewProvider();
	
	protected ExecutionEvent m_event;
	
	protected Class m_context;
}
