/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Esterel Technologies - Implements adapter for listening to eAnnotation life cycle (add and remove operations) 
 *****************************************************************************/
package org.eclipse.papyrus.uml.properties.databinding;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.value.ValueDiff;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.emf.appearance.commands.SetNameLabelIconCommand;
import org.eclipse.papyrus.infra.emf.appearance.commands.SetQualifiedNameDepthCommand;
import org.eclipse.papyrus.infra.emf.appearance.commands.SetShadowFigureCommand;
import org.eclipse.papyrus.infra.emf.appearance.helper.AppearanceHelper;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.tools.databinding.AggregatedObservable;
import org.eclipse.papyrus.uml.properties.Activator;
import org.eclipse.papyrus.uml.tools.databinding.AbstractUMLAggregatedObservableValue;
import org.eclipse.papyrus.uml.tools.databinding.CommandBasedObservableValue;

/**
 * An IObservableValue for custom Papyrus properties.
 * This enables to edit a few preferences-based values.
 * 
 * @author Camille Letavernier
 */
public class ElementCustomizationObservableValue extends AbstractUMLAggregatedObservableValue implements CommandBasedObservableValue, AggregatedObservable {

	private Property property;

	private TransactionalEditingDomain transactionalDomain;

	private View notationElement;

	private Adapter eAnnotationAdapter;

	/**
	 * 
	 * Constructor.
	 * 
	 * @param sourceElement
	 *        The selected EditPart
	 * @param property
	 *        The Property to edit
	 */
	public ElementCustomizationObservableValue(EditPart sourceElement, Property property) {
		super(EMFHelper.resolveEditingDomain(sourceElement));
		this.property = property;
		notationElement = (View)sourceElement.getModel();
		notationElement.eAdapters().add(eAnnotationAdapter = new EAnnotationAdapter());
		if(domain instanceof TransactionalEditingDomain) {
			transactionalDomain = (TransactionalEditingDomain)domain;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public synchronized void dispose() {
		super.dispose();
		// remove the eAnnotation adapter when the observable is disposed
		notationElement.eAdapters().remove(eAnnotationAdapter);
	}

	public Object getValueType() {
		switch(property) {
		case QUALIFIED_NAME:
			return Integer.class;
		case ELEMENT_ICON:
		case SHADOW:
			return Boolean.class;
		}

		return Object.class;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Object doGetValue() {
		switch(property) {
		case ELEMENT_ICON:
			return AppearanceHelper.showElementIcon(notationElement);
		case SHADOW:
			return AppearanceHelper.showShadow(notationElement);
		case QUALIFIED_NAME:
			return AppearanceHelper.getQualifiedNameDepth(notationElement);
		}

		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doSetValue(Object value) {
		Command command = getCommand(value);
		domain.getCommandStack().execute(command);
	}

	/**
	 * {@inheritDoc}
	 */
	public Command getCommand(Object value) {
		switch(property) {
		case ELEMENT_ICON:
			if(value instanceof Boolean) {
				return new SetNameLabelIconCommand(transactionalDomain, notationElement, (Boolean)value);
			} else {
				Activator.log.warn(value + " is not a valid value for ElementIcon ; need a Boolean"); //$NON-NLS-1$
			}
			break;
		case SHADOW:
			if(value instanceof Boolean) {
				return new SetShadowFigureCommand(transactionalDomain, notationElement, (Boolean)value);
			} else {
				Activator.log.warn(value + " is not a valid value for Shadow ; need a Boolean"); //$NON-NLS-1$
			}
			break;
		case QUALIFIED_NAME:
			if(value instanceof Integer) {
				return new SetQualifiedNameDepthCommand(transactionalDomain, notationElement, (Integer)value);
			} else {
				Activator.log.warn(value + " is not a valid value for QualifiedNameDepth ; need an Integer"); //$NON-NLS-1$
			}
			break;
		}

		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * The list of valid properties for {@link ElementCustomizationObservableValue}
	 * 
	 * @author Camille Letavernier
	 * 
	 */
	public enum Property {

		/**
		 * Whether and how the element icon should be displayed
		 */
		ELEMENT_ICON,

		/**
		 * Whether the shadow should be displayed or not
		 */
		SHADOW,

		/**
		 * Whether and how the qualified name should be displayed
		 */
		QUALIFIED_NAME
	}

	/**
	 * Internal class for listening to add/remove operations of {@link EAnnotation} objects.
	 */
	private class EAnnotationAdapter extends AdapterImpl {

		/**
		 * {@inheritDoc}
		 */
		@Override
		public void notifyChanged(Notification notification) {
			if(notification.getFeature() == EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS) {
				switch(notification.getEventType()) {
				case Notification.ADD:
					fireValueChange(notification);
					break;
				case Notification.REMOVE:
					fireValueChange(notification);
				default:
					break;
				}
			}
		}

		/**
		 * Fires the value changes to the observable.
		 * 
		 * @param notification
		 *        The EMF notification to propagate
		 */
		private void fireValueChange(final Notification notification) {
			ValueDiff diff = Diffs.createValueDiff(notification.getOldValue(), notification.getNewValue());
			ElementCustomizationObservableValue.this.fireValueChange(diff);
		}
	}

}
