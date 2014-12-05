/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:

 * Saadia DHOUIB (CEA LIST) saadia.dhouib@cea.fr
 * Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - use of rounded compartment edit part as super type.
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.communication.custom.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.helper.NotificationHelper;
import org.eclipse.papyrus.uml.diagram.common.providers.UIAdapterImpl;
import org.eclipse.papyrus.uml.diagram.communication.edit.parts.LifelineEditPartCN;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;

/**
 *
 * CustomLifelineEditPartCN
 *
 */
public class CustomLifelineEditPartCN extends LifelineEditPartCN {

	/**
	 *
	 * Constructor.
	 *
	 * @param view
	 */
	public CustomLifelineEditPartCN(View view) {
		super(view);
	}

	/**
	 * Return the inner ConnectableElements of the Lifeline
	 *
	 * @param lifeline
	 *            The lifeline
	 * @return inner ConnectableElements
	 */
	// TODO Extract in a helper
	public static List<Property> getProperties(Lifeline lifeline) {
		if (lifeline != null) {
			ConnectableElement represents = lifeline.getRepresents();
			if (represents != null) {
				Type type = represents.getType();
				if (type instanceof StructuredClassifier) {
					StructuredClassifier structuredClassifier = (StructuredClassifier) type;

					if (!structuredClassifier.getAllAttributes().isEmpty()) {
						return new ArrayList<Property>(((StructuredClassifier) type).getAllAttributes());
					}
				}
			}
		}

		return null;
	}

	/**
	 * True if the lifeline is in inline mode
	 */
	private boolean inlineMode;

	/**
	 * Notfier for listen and unlistend model element.
	 */
	private final NotificationHelper notifier = new NotificationHelper(new UIAdapterImpl() {

		@Override
		protected void safeNotifyChanged(Notification msg) {
			handleNotificationEvent(msg);
		}
	});

	/**
	 * Desactivate listeners for Lifeline to handle notification in the message
	 * occurence specification
	 */
	@Override
	public void deactivate() {
		notifier.unlistenAll();
		super.deactivate();
	}

	/**
	 * Get available properties
	 *
	 * @return Only not already used properties
	 */
	@SuppressWarnings("unchecked")
	public List<Property> getAvailableProperties() {
		List<Property> properties = getProperties();
		if (properties != null) {
			for (EditPart editPart : (List<EditPart>) getChildren()) {
				if (editPart instanceof LifelineEditPartCN) {
					Lifeline lifeline = (Lifeline) ((LifelineEditPartCN) editPart).resolveSemanticElement();
					ConnectableElement represents = lifeline.getRepresents();
					if (properties.contains(represents)) {
						properties.remove(represents);
					}
				}
			}
		}
		return properties;
	}

	/**
	 * Determine inline capability
	 *
	 * @return True if inline mode is possible
	 */
	public boolean isInlineCapability() {
		List<Property> properties = getAvailableProperties();
		if (properties != null && !properties.isEmpty()) {
			return inlineMode || getChildren().size() < 2;
		}

		return false;
	}

	/**
	 * This operation returns the InnerConnectableElement EditParts contained in
	 * the Lifeline EditPart
	 *
	 * @return the list of InnerConnectableElement EditParts
	 */
	public List<LifelineEditPartCN> getInnerConnectableElementList() {
		List<LifelineEditPartCN> propertyList = new ArrayList<LifelineEditPartCN>();
		for (Object obj : getChildren()) {
			if (obj instanceof LifelineEditPartCN) {
				propertyList.add((LifelineEditPartCN) obj);
			}
		}
		return propertyList;
	}

	/**
	 * Return the inner ConnectableElements of the lifeline
	 *
	 * @return inner ConnectableElements
	 */
	public List<Property> getProperties() {
		Lifeline lifeline = (Lifeline) resolveSemanticElement();
		return getProperties(lifeline);
	}

	/**
	 * Remove listeners for Lifeline to handle notification in the message
	 * occurence specification
	 */
	@Override
	public void removeNotify() {
		notifier.unlistenAll();
		super.removeNotify();
	}

}
