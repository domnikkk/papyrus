/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Juan Cadavid (CEA LIST) juan.cadavid@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.modelexplorer.handler;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.papyrus.infra.core.utils.AdapterUtils;
import org.eclipse.papyrus.infra.widgets.util.IRevealSemanticElement;
import org.eclipse.papyrus.infra.widgets.util.NavigationTarget;
import org.eclipse.papyrus.infra.widgets.util.RevealSemanticElementWrapper;
import org.eclipse.papyrus.uml.modelexplorer.util.ModelExplorerUtils;
import org.eclipse.papyrus.uml.service.types.handlers.AbstractUmlCreateCommandHandler;
import org.eclipse.papyrus.uml.service.types.utils.ICommandContext;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Element;

import com.google.common.base.Optional;


/**
 * Abstract handler supertype for every generated handler for the creation of UML elements from the model explorer.
 * ("Create child")
 */
public abstract class AbstractUmlModelExplorerCreateCommandHandler extends AbstractUmlCreateCommandHandler {

	/**
	 *
	 * @see org.eclipse.papyrus.uml.service.types.handlers.AbstractCommandHandler#getCommandContext()
	 *
	 * @return
	 */
	@Override
	protected ICommandContext getCommandContext() {
		return ModelExplorerUtils.getSelectionCommandContext();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Object result = super.execute(event);

		if (result instanceof Element) {
			handleElementsCreated(Collections.singleton((Element) result), event);
		} else if (result instanceof Collection<?>) {
			handleElementsCreated((Collection<?>) result, event);
		}

		return result;
	}

	protected void handleElementsCreated(Collection<?> elements, ExecutionEvent event) {
		if (elements.isEmpty()) {
			return;
		}

		NavigationTarget target = getNavigationTarget(event);
		if (target == null) {
			return;
		}

		target.revealElement(elements);
	}

	protected NavigationTarget getNavigationTarget(ExecutionEvent event) {
		IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		if (activePart == null) {
			return null;
		}

		Optional<NavigationTarget> navigationTarget = AdapterUtils.adapt(activePart, NavigationTarget.class);
		if (navigationTarget.isPresent()) {
			return navigationTarget.get();
		}

		Optional<IRevealSemanticElement> revealSemantic = AdapterUtils.adapt(activePart, IRevealSemanticElement.class);
		if (revealSemantic.isPresent()) {
			return new RevealSemanticElementWrapper(revealSemantic.get());
		}

		return null;
	}

}
