package org.eclipse.papyrus.controlmode.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.controlmode.interfaces.ControlModeRequestParameters;
import org.eclipse.papyrus.controlmode.request.ControlModeRequest;
import org.eclipse.papyrus.core.utils.PapyrusEcoreUtils;
import org.eclipse.papyrus.resource.notation.NotationModel;
import org.eclipse.papyrus.resource.notation.NotationUtils;

/**
 * Command handling control/uncontrol of diagram in new resource
 * 
 * @author adaussy
 * 
 */
public class ControlDiagramsCommand extends AbstractControlCommandRequest {


	/**
	 * @param request
	 */
	@SuppressWarnings("unchecked")
	public ControlDiagramsCommand(ControlModeRequest request) {
		super("Move diagram to new resource", null, request);
		try {
			getAffectedFiles().addAll(getWorkspaceFiles(getDiagrams()));
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Reference the diagram about to be moved into the request in order to be used by other particpants
	 * @param diags
	 */
	@SuppressWarnings("unchecked")
	public void addMovedDiagramToRequest(List<Diagram> diags) {
		Collection<Diagram> diagrams = (Collection<Diagram>)getRequest().getParameter(ControlModeRequestParameters.MOVED_DIAGRAM);
		if(diagrams == null) {
			diagrams = new ArrayList<Diagram>(diags);
		} else {
			diagrams.addAll(diags);
		}
		getRequest().addParameters(Collections.singletonMap(ControlModeRequestParameters.MOVED_DIAGRAM, diagrams));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		EObject objectTOControl = getRequest().getTargetObject();
		PapyrusEcoreUtils.getUsages(objectTOControl);
		//Retrieve new notation resource created previously
		Resource newNotationResource = getRequest().getTargetResource(NotationModel.NOTATION_FILE_EXTENSION);
		if(newNotationResource == null) {
			return CommandResult.newErrorCommandResult("The notation model has not been created");
		}
		List<Diagram> diagrams = getDiagrams();
		if(!diagrams.isEmpty()) {
			newNotationResource.getContents().addAll(diagrams);
			addMovedDiagramToRequest(diagrams);
		}
		return CommandResult.newOKCommandResult(newNotationResource);
	}

	/**
	 * Get the list of all the diagrams to move
	 * @return
	 * @throws ExecutionException
	 */
	protected List<Diagram> getDiagrams() throws ExecutionException {
		Resource notationResource = getRequest().getModelSet().getResource(getOldNotationURI(), false);
		if(notationResource == null) {
			throw new ExecutionException("unable to retreive old notation resource");
		}
		return NotationUtils.getAllDescendantDiagramsInResource(getRequest().getTargetObject(), notationResource);
	}

	/**
	 * Get the old notation URI for request
	 * @return
	 * @throws ExecutionException
	 */
	public URI getOldNotationURI() throws ExecutionException {
		URI uri = getRequest().getSourceURI();
		if(uri != null) {
			return uri.trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION);
		}
		throw new ExecutionException("Unable to retreive URI of the old notation model");
	}
}