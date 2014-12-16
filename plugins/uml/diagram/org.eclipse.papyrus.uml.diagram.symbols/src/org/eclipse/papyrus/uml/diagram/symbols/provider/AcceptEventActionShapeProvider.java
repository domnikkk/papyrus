/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.symbols.provider;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.emf.utils.BusinessModelResolver;
import org.eclipse.papyrus.infra.gmfdiag.common.service.shape.AbstractShapeProvider;
import org.eclipse.papyrus.infra.gmfdiag.common.service.shape.ProviderNotificationManager;
import org.eclipse.papyrus.uml.diagram.symbols.Activator;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.w3c.dom.svg.SVGDocument;


/**
 * Shape Provider for {@link DurationObservation} or for {@link TypedElement} that are typed by an {@link DurationObservation}.
 */
public class AcceptEventActionShapeProvider extends AbstractShapeProvider {

	/** The Constant FLAG_SVG_PATH. */
	private static final String FLAG_SVG_PATH = "/icons/symbols/flag.svg";

	/** The Constant HOURGLASS_SVG_PATH. */
	private static final String HOURGLASS_SVG_PATH = "/icons/symbols/hourglass.svg";

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<RenderedImage> getShapes(EObject view) {
		if (providesShapes(view)) {
			List<SVGDocument> documents = getSVGDocument(view);

			if (documents != null) {
				List<RenderedImage> result = new LinkedList<RenderedImage>();
				for (SVGDocument document : documents) {
					try {
						result.add(renderSVGDocument(view, document));
					} catch (IOException ex) {
						Activator.log.error(ex);
						continue;
					}
				}
				return result;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean providesShapes(EObject view) {
		if (!(view instanceof View)) {
			return false;
		}

		EObject element = ((View) view).getElement();

		if (element instanceof AcceptEventAction || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof AcceptEventAction)) {
			return true;
		}// flag and hourglass

		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProviderNotificationManager createProviderNotificationManager(DiagramEventBroker diagramEventBroker, EObject view, NotificationListener listener) {
		// retrieve semantic element from the view and add a notification listener on the Type feature if the semantic element is a TypedElement
		if (view == null || !(view instanceof View)) {
			return null;
		}

		ShapeProviderNotificationManager notificationManager = new ShapeProviderNotificationManager(diagramEventBroker, view, listener);
		return notificationManager;
	}

	/**
	 * Notification Manager for the {@link AcceptEventActionShapeProvider}.
	 */
	public class ShapeProviderNotificationManager extends ProviderNotificationManager implements NotificationListener {

		/**
		 * Creates a new DurationObservationShapeProviderNotificationManager.
		 * 
		 * @param diagramEventBroker
		 *            event broker specific to the diargam displaying the shapes.
		 * @param view
		 *            the view from which all elements to listen will be computed.
		 * @param listener
		 *            the listener to which notifications will be forwarded.
		 */
		public ShapeProviderNotificationManager(DiagramEventBroker diagramEventBroker, EObject view, NotificationListener listener) {
			super(diagramEventBroker, view, listener);
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		protected void registerListeners() {
			if (view == null || !(view instanceof View)) {
				return;
			}
			Object semanticElement = BusinessModelResolver.getInstance().getBusinessModel(view);
			if (semanticElement instanceof Element) {
				diagramEventBroker.addNotificationListener((Element) semanticElement, this);
			}
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public void dispose() {
			if (view == null || !(view instanceof View)) {
				return;
			}
			Object semanticElement = BusinessModelResolver.getInstance().getBusinessModel(view);
			if (semanticElement instanceof Element) {
				diagramEventBroker.removeNotificationListener((Element) semanticElement, this);
			}
			super.dispose();
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public void notifyChanged(Notification notification) {
			if (listener == null) {
				return;
			}
			if (UMLPackage.eINSTANCE.getTypedElement_Type().equals(notification.getFeature())) {
				listener.notifyChanged(notification);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<SVGDocument> getSVGDocument(EObject view) {
		if (providesShapes(view)) {
			EObject element = ((View) view).getElement();
			URI uri = URI.createPlatformPluginURI("", true);
			if (element instanceof AcceptEventAction || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof AcceptEventAction)) {
				if (isAcceptTimeEventAction((AcceptEventAction) element)) {
					uri = URI.createPlatformPluginURI(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID + HOURGLASS_SVG_PATH, true);
				} else {
					uri = URI.createPlatformPluginURI(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID + FLAG_SVG_PATH, true);
				}
			}// flag and hourglass

			String path = uri.toString();
			SVGDocument document = getSVGDocument(path);
			if (document == null) {
				return null;
			}

			return Arrays.asList(document);
		}
		return null;
	}

	/**
	 * For AcceptEventAction, test whether the action may be considered as a time event action
	 * Come from org.eclipse.papyrus.uml.diagram.activity.helper.CustomAcceptEventActionEditHelper
	 * 
	 * @param action
	 *            the action to test
	 * @return true if action is a time event action
	 */
	public static boolean isAcceptTimeEventAction(AcceptEventAction action) {
		if (action.getTriggers() != null) {
			boolean hasTimeEvent = false;
			for (Trigger trigger : action.getTriggers()) {
				if (trigger != null) {
					Event event = trigger.getEvent();
					if (event instanceof TimeEvent) {
						hasTimeEvent = true;
					} else {
						return false;
					}
				}
			}
			// only time events have been encountered, but maybe no event at all.
			return hasTimeEvent;
		}
		return false;
	}
}
