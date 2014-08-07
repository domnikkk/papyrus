/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.service.types.helper.advice;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyDependentsRequest;
import org.eclipse.papyrus.uml.diagram.common.helper.DurationConstraintHelper;
import org.eclipse.papyrus.uml.diagram.common.helper.DurationObservationHelper;
import org.eclipse.papyrus.uml.diagram.common.helper.TimeConstraintHelper;
import org.eclipse.papyrus.uml.diagram.common.helper.TimeObservationHelper;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * Helper advice for all {@link OccurrenceSpecification} elements.
 */
public class OccurrenceSpecificationHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * <pre>
	 * Add a command to destroy :
	 * - related time elements
	 * - linked general ordering
	 * </pre>
	 * 
	 * @see org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice#getBeforeDestroyDependentsCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyDependentsRequest)
	 * 
	 * @param request
	 *        the request
	 * @return the command to execute before the edit helper work is done
	 */
	@Override
	protected ICommand getBeforeDestroyDependentsCommand(DestroyDependentsRequest request) {
		List<EObject> dependentsToDestroy = new ArrayList<EObject>();

		OccurrenceSpecification os = (OccurrenceSpecification)request.getElementToDestroy();

		// delete linked time elements
		dependentsToDestroy.addAll(TimeObservationHelper.getTimeObservations(os));
		dependentsToDestroy.addAll(TimeConstraintHelper.getTimeConstraintsOn(os));
		dependentsToDestroy.addAll(DurationObservationHelper.getDurationObservationsOn(os));
		dependentsToDestroy.addAll(DurationConstraintHelper.getDurationConstraintsOn(os));

		// delete linked general ordering
		/**
		 * Note: GeneralOrdering should be necessarily removed because the opposite
		 * references 'GeneralOrdering::before[1]' and 'GeneralOrdering::after[1]' which designate 
		 * this OccurrenceSpecification are mandatory 
		 */
		dependentsToDestroy.addAll(os.getToBefores());
		dependentsToDestroy.addAll(os.getToAfters());

		if(!dependentsToDestroy.isEmpty()) {
			return request.getDestroyDependentsCommand(dependentsToDestroy);
		}

		return null;
	}
}
