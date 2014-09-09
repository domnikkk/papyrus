/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
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
package org.eclipse.papyrus.infra.gmfdiag.common.editpolicies;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.gef.ui.internal.editpolicies.GraphicalEditPolicyEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.databinding.custom.CustomStringStyleObservableValue;

/**
 * this edit policy has in charge to refresh the edit part when text alignment change.
 */
public class RefreshTextAlignmentEditPolicy extends GraphicalEditPolicyEx implements IChangeListener, NotificationListener {

	/** The Constant TEXT_ALIGNMENT. */
	public static final String TEXT_ALIGNMENT = "textAlignment";

	/** key for this edit policy. */
	public final static String REFRESH_TEXT_ALIGNMENT_EDITPOLICY = "REFRESH_TEXT_ALIGNMENT_EDITPOLICY";

	/** The style observable. */
	protected IObservableValue styleObservable;

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void activate() {
		// retrieve the view and the element managed by the edit part
		View view = (View) getHost().getModel();
		if (view == null) {
			return;
		}

		styleObservable = new CustomStringStyleObservableValue(view, EMFHelper.resolveEditingDomain(view), TEXT_ALIGNMENT);
		styleObservable.addChangeListener(this);

		// adds a listener on the view and the element controlled by the editpart
		getDiagramEventBroker().addNotificationListener(view, this);
		getDiagramEventBroker().addNotificationListener(view.eContainer(), this);

		EObject semanticElement = EMFHelper.getEObject(getHost());
		if (semanticElement != null) {
			getDiagramEventBroker().addNotificationListener(semanticElement, this);
		}
		getHost().refresh();
	}

	/**
	 * Gets the diagram event broker from the editing domain.
	 *
	 * @return the diagram event broker
	 */
	protected DiagramEventBroker getDiagramEventBroker() {
		TransactionalEditingDomain theEditingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		if (theEditingDomain != null) {
			return DiagramEventBroker.getInstance(theEditingDomain);
		}
		return null;
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void deactivate() {
		if (styleObservable != null) {
			styleObservable.removeChangeListener(this);
			styleObservable.dispose();
			styleObservable = null;
		}
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 *
	 * @param notification
	 */
	@Override
	public void notifyChanged(Notification notification) {
		getHost().refresh();
	}

	/**
	 * @see org.eclipse.core.databinding.observable.IChangeListener#handleChange(org.eclipse.core.databinding.observable.ChangeEvent)
	 *
	 * @param event
	 */
	@Override
	public void handleChange(ChangeEvent event) {
		getHost().refresh();
	}
}
