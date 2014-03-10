/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mickaël ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and implementation
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.css.properties.databinding;

import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.ModelStyleSheets;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StyleSheet;
import org.eclipse.papyrus.infra.gmfdiag.css.stylesheets.StylesheetsPackage;

/**
 * A Listener for ModelStyleSheet List
 * 
 * @author Mickaël ADAM
 */
public class CustomModelStyleSheetListener extends AdapterImpl {

	private final IChangeListener listener;

	private boolean disposed;

	/**
	 * Instantiates a new custom model styleSheet listener.
	 * 
	 * @param notationResource
	 *        the notation resource
	 * @param source
	 *        the source
	 * @param listener
	 *        the listener
	 */
	public CustomModelStyleSheetListener(Resource notationResource, ModelStyleSheets source, IChangeListener listener) {

		this.listener = listener;

		//add an eAdapter on it
		source.eAdapters().add(this);
		//Get all StyleSheets from the modelStyleSheet
		EList<StyleSheet> objectsFromModelSS = source.getStylesheets();

		for(StyleSheet styleSheet : objectsFromModelSS) {
			styleSheet.eAdapters().add(this);
		}
	}

	/**
	 * Notify changed.
	 *
	 * @param notification
	 *        the notification
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		//The listener has been disposed: remove it from the notifier
		//and ignore the notification
		if(disposed) {
			((Notifier)notification.getNotifier()).eAdapters().remove(this);
			return;
		}

		if(notification.getFeature() == StylesheetsPackage.eINSTANCE.getModelStyleSheets_Stylesheets()) {
			if(!notification.isTouch()) {
				handleChange(notification.getNotifier());
			}
		}
	}

	private void handleChange(Object value) {
		if(value instanceof ModelStyleSheets) {
			listener.handleChange(null);
		}
	}

	public void dispose() {
		this.disposed = true;
	}

}
