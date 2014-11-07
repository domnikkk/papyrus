/*****************************************************************************
 * Copyright (c) 2014 CEA LIST, Christian W. Damus, and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.fr - Initial API and implementation
 *   Christian W. Damus - bug 436954
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.widgets.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;

/**
 * Wrapper to reveal the results (using with reveal semantic protocol) after a command in View.
 * 
 * @author Gabriel Pascual
 */
public class RevealResultCommand extends CommandWrapper {

	/** The view part. */
	private IViewPart viewPart = null;

	/** The source object. */
	private Object sourceObject = null;

	/** The reveal all results. */
	private boolean revealAllResults = false;

	/**
	 * Constructor.
	 *
	 * @param command
	 */
	public RevealResultCommand(Command command, IViewPart part, Object editObject) {
		super(command);
		viewPart = part;
		sourceObject = editObject;
	}

	/**
	 * Sets the reveal all results.
	 *
	 * @param revealAllResults
	 *            the revealAllResults to set
	 */
	private void setRevealAllResults(boolean revealAllResults) {
		this.revealAllResults = revealAllResults;
	}

	/**
	 * Wrap.
	 *
	 * @param command
	 *            the command
	 * @param part
	 *            the part
	 * @param container
	 *            the container
	 * @param revealAllResults
	 *            the reveal all results
	 * @return the command
	 */
	public static Command wrap(Command command, IViewPart part, EObject container, boolean revealAllResults) {
		RevealResultCommand wrappedCommand = new RevealResultCommand(command, part, container);
		wrappedCommand.setRevealAllResults(revealAllResults);
		return wrappedCommand;
	}

	/**
	 * Wrap.
	 *
	 * @param command
	 *            the command
	 * @param part
	 *            the part
	 * @param container
	 *            the container
	 * @return the command
	 */
	public static Command wrap(Command command, IViewPart part, EObject container) {
		return new RevealResultCommand(command, part, container);
	}

	/**
	 * Wrap.
	 *
	 * @param command
	 *            the command
	 * @param part
	 *            the part
	 * @return the command
	 */
	public static Command wrap(Command command, IViewPart part) {
		return wrap(command, part, null);
	}

	/**
	 * @see org.eclipse.emf.common.command.CommandWrapper#execute()
	 *
	 */
	@Override
	public void execute() {

		super.execute();
		selectResult();
	}

	/**
	 * @see org.eclipse.emf.common.command.CommandWrapper#undo()
	 *
	 */
	@Override
	public void undo() {
		super.undo();
		selectSource();
	}

	/**
	 * @see org.eclipse.emf.common.command.CommandWrapper#redo()
	 *
	 */
	@Override
	public void redo() {
		super.redo();
		selectResult();
	}

	/**
	 * Reveal target.
	 *
	 * @param target
	 *            the target
	 */
	private void revealTarget(final List<?> target) {
		Display.getCurrent().asyncExec(new Runnable() {

			@Override
			public void run() {

				if (viewPart instanceof IRevealSemanticElement) {
					((IRevealSemanticElement) viewPart).revealSemanticElement(target);

				}

			}
		});
	}

	/**
	 * Select command result.
	 */
	private void selectResult() {
		Collection<?> results = getResultsCommand();
		if (!results.isEmpty()) {
			if (revealAllResults) {
				revealTarget(Arrays.asList(results.toArray()));

			} else {


				Iterator<?> resultIterator = results.iterator();

				// Get first result
				final Object result = resultIterator.next();
				revealTarget(Arrays.asList(new Object[] { result }));
			}

		}
	}

	/**
	 * Gets the results command.
	 *
	 * @return the results command
	 */
	private Collection<?> getResultsCommand() {

		// Get results list
		Collection<?> resultsCommand = getResult();
		if (getResult().isEmpty()) {

			// Get affected objects list if it is not a command with result
			resultsCommand = getAffectedObjects();
		}

		return resultsCommand;
	}

	/**
	 * Select source.
	 */
	private void selectSource() {

		if (sourceObject != null) {
			revealTarget(Arrays.asList(new Object[] { sourceObject }));

		} else if (!getAffectedObjects().isEmpty()) {

			// Try with the affected objects
			revealTarget(Arrays.asList(getAffectedObjects().toArray()));
		}
	}


}