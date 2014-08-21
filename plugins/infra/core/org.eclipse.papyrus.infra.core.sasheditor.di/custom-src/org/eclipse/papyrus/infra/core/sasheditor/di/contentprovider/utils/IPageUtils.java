/*****************************************************************************
 * Copyright (c) 2010, 2014 LIFL, CEA LIST, and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin (LIFL) cedric.dumoulin@lifl.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 433371
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.internal.PageManagerImpl;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.internal.PageManagerImpl.SashModelOperation;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageRef;
import org.eclipse.papyrus.infra.core.sashwindows.di.SashModel;
import org.eclipse.papyrus.infra.core.sashwindows.di.SashWindowsMngr;
import org.eclipse.papyrus.infra.core.sashwindows.di.TabFolder;
import org.eclipse.papyrus.infra.core.sashwindows.di.util.DiSwitch;


/**
 * Class providing a utility methods allowing to get the real Model from the {@link IPage#getRawModel()}.
 * The utility takes into account the bug 309943.
 *
 * @author cedric dumoulin
 *
 */
public class IPageUtils {

	/**
	 * Get the real model rather than the PageRef. This method is a trick to temporally solve the bug 309943.
	 * 
	 * @param page
	 * @return
	 */
	public static Object getRawModel(IPage page) {

		if (page == null) {
			return null;
		}

		Object pageModel = page.getRawModel();
		// Get the real model because of bug
		if (pageModel instanceof PageRef)
		{
			return ((PageRef) pageModel).getPageIdentifier();
		}
		// do not use trick
		return pageModel;
	}

	/**
	 * Lookup the IPage model corresponding to the identifier from the {@link ISashWindowsContainer}.
	 * The identifier can be either a {@link PageRef} or a emf Diagram. <br>
	 * This method can be used as a hack to bug 401107
	 *
	 * @param container
	 * @param identifier
	 * @return The corresponding IPage, or null if not found.
	 */
	public static IPage lookupModelPage(ISashWindowsContainer container, Object identifier) {

		LookupIPageVisitor visitor = new LookupIPageVisitor(identifier);
		container.visit(visitor);
		return visitor.getResult();
	}

	/**
	 * Obtains a command that will close all of the pages in the given {@code pageManager} that reference the specified {@code pageIdentifier},
	 * regardless of whether they still reference that identifier at the time of execution (this is the "memoization").
	 *
	 * @param domain
	 *            the editing domain in which the command will be executed
	 * @param pageManager
	 *            the page manager for which to construct the command
	 * @param pageIdentifier
	 *            the identifier of the page(s) to be removed
	 *
	 * @return the memoized close-all-pages command, or {@code null} if there are no pages to close
	 */
	public static Command getMemoizedCloseAllPagesCommand(final TransactionalEditingDomain domain, final IPageManager pageManager, final Object pageIdentifier) {
		Command result = null;

		final PageManagerImpl pageMan = (PageManagerImpl) pageManager;

		final Map<PageRef, TabFolder> pages = execute(pageMan, new SashModelOperation<Map<PageRef, TabFolder>>() {

			@Override
			public Map<PageRef, TabFolder> execute(SashWindowsMngr sashWindowsManager) {
				return new DiSwitch<Map<PageRef, TabFolder>>() {

					private Map<PageRef, TabFolder> pages = new HashMap<PageRef, TabFolder>();

					@Override
					public Map<PageRef, TabFolder> defaultCase(EObject object) {
						for (EObject next : object.eContents()) {
							doSwitch(next);
						}
						return pages;
					}

					@Override
					public Map<PageRef, TabFolder> casePageRef(PageRef object) {
						if (object.getPageIdentifier() == pageIdentifier) {
							pages.put(object, object.getParent());
						}
						return pages;
					}
				}.doSwitch(sashWindowsManager.getSashModel());
			}
		});


		if (!pages.isEmpty()) {
			final SashModelOperation<Void> removeOp = new SashModelOperation<Void>() {

				@Override
				public Void execute(SashWindowsMngr sashWindowsManager) {
					SashModel sashModel = sashWindowsManager.getSashModel();
					for (Map.Entry<PageRef, TabFolder> next : pages.entrySet()) {
						PageRef page = next.getKey();
						TabFolder folder = next.getValue();

						folder.getChildren().remove(page);
						sashModel.removeEmptyFolder(folder);
					}
					return null;
				}
			};

			result = new RecordingCommand(domain, "Remove Editor Page(s)") { //$NON-NLS-1$

				@Override
				protected void doExecute() {
					IPageUtils.execute(pageMan, removeOp);
				}
			};
		}

		return result;
	}

	private static <T> T execute(PageManagerImpl pageManager, SashModelOperation<T> sashOperation) {
		try {
			return pageManager.execute(sashOperation);
		} catch (IllegalAccessException e) {
			// Won't happen because this is our own operation
			throw new IllegalAccessError(e.getLocalizedMessage());
		}
	}
}
