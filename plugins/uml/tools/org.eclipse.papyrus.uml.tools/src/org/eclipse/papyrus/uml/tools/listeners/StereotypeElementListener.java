/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.listeners;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * Listener of all stereotype application actions in Resource set.
 * 
 * @author Gabriel Pascual
 *
 */
public class StereotypeElementListener extends ResourceSetListenerImpl {

	/** The stereotype filter notification. */
	private StereotypeNotificationFilter stereotypeFilter = StereotypeNotificationFilter.create();

	/**
	 * Instantiates a new stereotype element listener.
	 */
	public StereotypeElementListener() {
		super();
	}

	/**
	 * Resource set changed.
	 *
	 * @param event
	 *            the event
	 * @see org.eclipse.emf.transaction.ResourceSetListenerImpl#resourceSetChanged(org.eclipse.emf.transaction.ResourceSetChangeEvent)
	 */
	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {

		// Get filtered notifications
		List<Notification> filteredNotificationsList = event.getNotifications();

		// Handle each filtered notification
		for (Notification notification : filteredNotificationsList) {
			handleFilteredNotification(notification);
		}


	}

	/**
	 * Handle filtered notification.
	 *
	 * @param notification
	 *            the notification
	 */
	private void handleFilteredNotification(Notification notification) {

		Object notifier = notification.getNotifier();
		Element baseElement = null;
		Stereotype stereotype = null;

		// Use UML tools to get Stereotype and Based Element
		if (notifier instanceof EObject) {
			stereotype = UMLUtil.getStereotype((EObject) notifier);
			baseElement = UMLUtil.getBaseElement((EObject) notifier);
		}


		int eventType = 0;
		// Check if notifier is an stereotype
		if (stereotype != null) {

			// Check state of base Element on stereotype application
			if (baseElement == null) {
				baseElement = (Element) notification.getOldValue();
				eventType = StereotypeExtensionNotification.STEREOTYPE_UNAPPLIED_FROM_ELEMENT;
			} else {
				baseElement = (Element) notification.getNewValue();
				eventType = StereotypeExtensionNotification.STEREOTYPE_APPLIED_TO_ELEMENT;
			}
		}

		if (baseElement != null) {
			Stereotype oldValue = null;
			Stereotype newValue = null;
			if (eventType == StereotypeExtensionNotification.STEREOTYPE_UNAPPLIED_FROM_ELEMENT) {
				oldValue = stereotype;
			} else {
				newValue = stereotype;
			}

			baseElement.eNotify(
					new StereotypeExtensionNotification(baseElement, eventType, oldValue, newValue));
		}

	}

	/**
	 * Gets the filter.
	 *
	 * @return the filter
	 * @see org.eclipse.emf.transaction.ResourceSetListenerImpl#getFilter()
	 */
	@Override
	public NotificationFilter getFilter() {
		return stereotypeFilter.and(NotificationFilter.createEventTypeFilter(Notification.SET));
	}

	/**
	 * The Class StereotypeExtensionFinder.
	 */
	static class StereotypeExtensionFinder extends UMLUtil {

		static Property getExtensionEnd(EObject stereotypeApplication, EStructuralFeature ecoreDefinition) {
			Property result = null;

			NamedElement umlDefinition = getNamedElement(ecoreDefinition, stereotypeApplication);
			if (umlDefinition instanceof Property) {
				Property property = (Property) umlDefinition;

				// Is the property a member end of a metaclass extension?
				if (property.getAssociation() instanceof Extension) {
					result = property;
				}
			}

			return result;
		}
	}

	/**
	 * Notification filter on Stereotype application.
	 * <ul>
	 * <li>Set a {@link Stereotype} to {@link Element}</li>
	 * <li>Unset a {@link Stereotype} on {@link Element}</li>
	 * </ul>
	 */
	public static class StereotypeNotificationFilter extends NotificationFilter.Custom {

		/**
		 * Instantiates a new stereotype notification filter.
		 */
		protected StereotypeNotificationFilter() {
			super();
		}

		/**
		 * Matches.
		 *
		 * @param notification
		 *            the notification
		 * @return true, if successful
		 * @see org.eclipse.emf.transaction.NotificationFilter#matches(org.eclipse.emf.common.notify.Notification)
		 */
		@Override
		public boolean matches(Notification notification) {

			// Get notification field to filter
			Object notifier = notification.getNotifier();
			Object feature = notification.getFeature();

			boolean isBaseFeature = false;

			// Check if feature is a based feature of a stereotype extension
			if (feature instanceof EStructuralFeature) {
				isBaseFeature = ((EStructuralFeature) feature).getName().startsWith(Extension.METACLASS_ROLE_PREFIX);
			}


			// Fields of a stereotype extension
			Property extensionProperty = null;

			// Use UML tools to get extension property
			if (notifier instanceof EObject) {
				Stereotype stereotype = UMLUtil.getStereotype((EObject) notifier);
				if (stereotype != null) {
					extensionProperty = StereotypeExtensionFinder.getExtensionEnd((EObject) notifier, (EStructuralFeature) feature);

				}

			}

			return extensionProperty != null && isBaseFeature;
		}

		/**
		 * Creates notification filter for Stereotype.
		 *
		 * @return the stereotype notification filter
		 */
		public static StereotypeNotificationFilter create() {
			return new StereotypeNotificationFilter();
		}
	}

	/**
	 * Specific notification handled by this listener.
	 * <p>
	 * It implements the {@link ENotificationImpl} notification.
	 * </p>
	 */
	public class StereotypeExtensionNotification extends ENotificationImpl {

		/** Event type notification for stereotype application action. */
		public static final int STEREOTYPE_APPLIED_TO_ELEMENT = Notification.EVENT_TYPE_COUNT + 21;

		/** Event type notification for stereotype unapplication action. */
		public static final int STEREOTYPE_UNAPPLIED_FROM_ELEMENT = Notification.EVENT_TYPE_COUNT + 22;

		/**
		 * Creates a new StereotypeExtensionNotification.
		 *
		 * @param notifier
		 *            the notifier that sends this notification
		 * @param eventType
		 *            the type of event
		 * @param oldValue
		 *            the {@link Stereotype} that was unapplied, or {@code null} if this is notification of a stereotype application
		 * @param newValue
		 *            the {@link Stereotype} that was applied, or {@code null} if this is notification of a stereotype unapplication
		 */
		public StereotypeExtensionNotification(Element notifier, int eventType, Object oldValue, Object newValue) {
			super((InternalEObject) notifier, eventType, null, oldValue, newValue);
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public boolean isTouch() {
			return false;
		}

	}

}
