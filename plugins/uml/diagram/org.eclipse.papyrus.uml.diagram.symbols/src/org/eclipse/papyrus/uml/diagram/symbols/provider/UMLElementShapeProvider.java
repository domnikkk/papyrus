/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		CEA LIST - Initial API and implementation
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
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.FlowFinalNode;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.w3c.dom.svg.SVGDocument;


/**
 * Shape Provider for {@link DurationObservation} or for {@link TypedElement} that are typed by an {@link DurationObservation}.
 */
public class UMLElementShapeProvider extends AbstractShapeProvider {

	private static final String FLAG_SVG_PATH = "/icons/symbols/flag.svg";

	private static final String HOURGLASS_SVG_PATH = "/icons/symbols/hourglass.svg";

	private static final String DURATION_OBSERVATION_SVG_PATH = "/icons/symbols/DurationObservation.svg";

	private static final String TIME_OBSERVATION_SVG_PATH = "/icons/symbols/TimeObservation.svg";

	/** The Constant SYMBOL_SVG_PATH. */
	private static final String ROUND_WITH_DOT_SVG_PATH = "/icons/symbols/round_with_dot.svg";

	/** The Constant SYMBOL_SVG_PATH. */
	private static final String ROUND_FULL_SVG_PATH = "/icons/symbols/round_full.svg";

	/** The Constant SYMBOL_SVG_PATH. */
	private static final String ROUND_WITH_CROSS_SVG_PATH = "/icons/symbols/round_with_cross.svg";

	/** The Constant SYMBOL_SVG_PATH. */
	private static final String ARROW_SVG_PATH = "/icons/symbols/arrow.svg";

	/** The Constant SYMBOL_SVG_PATH. */
	private static final String DIAMOND_SVG_PATH = "/icons/symbols/diamond.svg";

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

		if (element instanceof DurationObservation || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof DurationObservation)) {
			return true;
		}// duration
		if (element instanceof TimeObservation || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof TimeObservation)) {
			return true;
		}// time
		if (element instanceof SendSignalAction || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof SendSignalAction)) {
			return true;
		}// Arrow
		if (element instanceof DecisionNode || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof DecisionNode)) {
			return true;
		}// Diamond
		if (element instanceof MergeNode || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof MergeNode)) {
			return true;
		}// Diamond
		if (element instanceof AcceptEventAction || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof AcceptEventAction)) {
			return true;
		}// flag and hourglass
		if (element instanceof InitialNode || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof InitialNode)) {
			return true;
		}// roundfull
		if (element instanceof FlowFinalNode || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof FlowFinalNode)) {
			return true;
		}// roundWCross
		if (element instanceof ActivityFinalNode || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof ActivityFinalNode)) {
			return true;
		}// RoundWDot

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

		DurationObservationShapeProviderNotificationManager notificationManager = new DurationObservationShapeProviderNotificationManager(diagramEventBroker, view, listener);
		return notificationManager;
	}

	/**
	 * Notification Manager for the {@link UMLElementShapeProvider}.
	 */
	public class DurationObservationShapeProviderNotificationManager extends ProviderNotificationManager implements NotificationListener {

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
		public DurationObservationShapeProviderNotificationManager(DiagramEventBroker diagramEventBroker, EObject view, NotificationListener listener) {
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
			if (element instanceof DurationObservation || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof DurationObservation)) {
				uri = URI.createPlatformPluginURI(org.eclipse.papyrus.uml.diagram.common.Activator.ID + DURATION_OBSERVATION_SVG_PATH, true);
			}// duration
			if (element instanceof TimeObservation || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof TimeObservation)) {
				uri = URI.createPlatformPluginURI(org.eclipse.papyrus.uml.diagram.common.Activator.ID + TIME_OBSERVATION_SVG_PATH, true);
			}// time
			if (element instanceof SendSignalAction || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof SendSignalAction)) {
				uri = URI.createPlatformPluginURI(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID + ARROW_SVG_PATH, true);
			}// Arrow
			if (element instanceof DecisionNode || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof DecisionNode)) {
				uri = URI.createPlatformPluginURI(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID + DIAMOND_SVG_PATH, true);
			}// Diamond
			if (element instanceof MergeNode || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof MergeNode)) {
				uri = URI.createPlatformPluginURI(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID + DIAMOND_SVG_PATH, true);
			}// Diamond
			if (element instanceof AcceptEventAction || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof AcceptEventAction)) {
				if (isAcceptTimeEventAction((AcceptEventAction) element)) {
					uri = URI.createPlatformPluginURI(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID + HOURGLASS_SVG_PATH, true);
				} else {
					uri = URI.createPlatformPluginURI(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID + FLAG_SVG_PATH, true);
				}
			}// flag and hourglass
			if (element instanceof InitialNode || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof InitialNode)) {
				uri = URI.createPlatformPluginURI(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID + ROUND_FULL_SVG_PATH, true);
			}// roundfull
			if (element instanceof FlowFinalNode || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof FlowFinalNode)) {
				uri = URI.createPlatformPluginURI(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID + ROUND_WITH_CROSS_SVG_PATH, true);
			}// roundWCross
			if (element instanceof ActivityFinalNode || (element instanceof TypedElement && ((TypedElement) element).getType() instanceof ActivityFinalNode)) {
				uri = URI.createPlatformPluginURI(org.eclipse.papyrus.infra.gmfdiag.common.Activator.ID + ROUND_WITH_DOT_SVG_PATH, true);
			}// RoundWDot

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
