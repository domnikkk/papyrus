package org.eclipse.papyrus.uml.service.types.command;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.emf.core.util.PackageUtil;
import org.eclipse.gmf.runtime.emf.type.core.commands.MoveElementsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;

/**
 * This command handles the move of the elements from the graphical containers different from 
 * semantic containers. Examples are {@link ActivityPartition} or 
 * {@link InterruptibleActivityRegion} which both graphically contains nodes semantically 
 * contained in {@link Activity}.
 * <p/>
 * Standard {@link MoveElementsCommand} does not work for these cases because it moves children 
 * only from one semantic container to another.
 * <p/>
 * So the main purpose of this command is to override useless check of different source and target 
 * semantic containers in {@link #canExecute()} method. 
 */
public class NotContainmentMoveCommand extends MoveElementsCommand {

	/**
	 * Default constructor
	 * @param request
	 */
	public NotContainmentMoveCommand(MoveRequest request) {
		super(request);
	}
	
	/**
	 * For ability to move children from one container to this same container
	 *	we need to remove this check from base canExecute command
	 *	<code>
	 *	if (container.equals(element.eContainer())
	 *			&& feature == element.eContainmentFeature()) {
	 *		// Don't allow the reparenting
	 *		return false;
	 *	}
	 *	</code>
	 */
	@Override
	public boolean canExecute() {
		EObject container = getTargetContainer();

		if(container == null || getElementsToMove() == null || getElementsToMove().isEmpty()) {
			return false;
		}

		for(Iterator i = getElementsToMove().keySet().iterator(); i.hasNext();) {
			EObject element = (EObject)i.next();
			EReference feature = getTargetFeature(element);

			if(feature == null || !container.eClass().getEAllReferences().contains(feature)) {
				// If the target feature doesn't exist in the target container,
				// don't allow the move.
				return false;
			}

			// IF the element is the parent of the target container...
			if(EcoreUtil.isAncestor(element, getTargetContainer())) {
				// Don't allow the reparenting
				return false;
			}

			// IF the container can not contain the element...
			if(!PackageUtil.canContain(getTargetContainer().eClass(), feature, element.eClass(), false)) {
				// Don't allow the reparenting
				return false;
			}
		}

		return true;
	}
}
