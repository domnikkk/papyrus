/*****************************************************************************
 * Copyright (c) 2009, 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *  Christian W. Damus - bug 454578
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.common.core.service.ProviderChangeEvent;
import org.eclipse.papyrus.commands.Activator;
import org.eclipse.papyrus.infra.core.listenerservice.IPapyrusListener;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * Listener for the palette Service that updates palette contribution in case of
 * profile application/unapplication
 */
public class PaletteProfileApplicationListener implements IPapyrusListener {

	/**
	 * Creates a new PaletteProfileApplicationListener.
	 */
	public PaletteProfileApplicationListener() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void notifyChanged(Notification notification) {
		// check notification is relevant for us
		// notifier shoud be instance of profileApplication. In this case,
		// reload the palette
		if (notification.getNotifier() instanceof ProfileApplication) {
			if (Notification.SET == notification.getEventType()) {
				try {
					ProfileApplication profileApplication = (ProfileApplication) notification.getNotifier();
					IEditorPart editor = ServiceUtilsForEObject.getInstance().getNestedActiveIEditorPart(profileApplication);
					if (editor == null) {
						return;
					}

					Display display = editor.getSite().getWorkbenchWindow().getShell().getDisplay();
					if ((display != null) && (display != Display.getCurrent())) {
						// Update the palette service on the UI thread because it may need to add/remove palette content,
						// which implies changing SWT controls
						display.asyncExec(new Runnable() {

							@Override
							public void run() {
								updatePaletteService();
							}
						});
					} else {
						// Just do it synchronously
						updatePaletteService();
					}
				} catch (ServiceException ex) {
					// Nothing to do. The ServiceRegistry is not available or there is no active editor. Don't update the palette
				} catch (Exception ex) {
					// Bug 407849: If a listener throws an exception, the operation is rolled back. In this case, we simply want to update the palettes and exceptions should only be logged
					Activator.log.error(ex);
				}
			}
		}
	}

	protected void updatePaletteService() {
		PapyrusPaletteService.getInstance().providerChanged(new ProviderChangeEvent(PapyrusPaletteService.getInstance()));
	}
}
