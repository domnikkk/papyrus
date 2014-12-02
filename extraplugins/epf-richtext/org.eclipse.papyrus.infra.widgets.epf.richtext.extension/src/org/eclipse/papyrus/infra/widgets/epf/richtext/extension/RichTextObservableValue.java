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
package org.eclipse.papyrus.infra.widgets.epf.richtext.extension;

import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.ValueDiff;
import org.eclipse.papyrus.infra.tools.databinding.AggregatedObservable;
import org.eclipse.papyrus.infra.widgets.providers.UnchangedObject;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

/**
 * An ObservableValue for Rich Text field.
 *
 * @author Mickaël ADAM
 */
public class RichTextObservableValue extends AbstractObservableValue implements Listener {

	/** The rich text editor. */
	private RichTextEditor richTextEditor;

	/** The event type. */
	private int eventType;

	/** The current value. */
	private Object currentValue;

	/** If the Text field may represent more than one value, use an AggregatedObservable May be null. */
	protected AggregatedObservable modelProperty;

	/**
	 * Constructor.
	 *
	 * @param richTextEditor
	 *        the rich text editor to observe
	 * @param modelProperty
	 *        The model IObservableValue
	 * @param eventType
	 *        The eventType to listen to. When the event is fired by the
	 *        widget, this IObservableValue will fire a ChangeEvent
	 */
	public RichTextObservableValue(RichTextEditor richTextEditor, IObservableValue modelProperty, int eventType) {
		this.richTextEditor = richTextEditor;
		this.eventType = eventType;
		if(modelProperty instanceof AggregatedObservable) {
			this.modelProperty = (AggregatedObservable)modelProperty;
		}
		//add listener on the browser editor
		this.richTextEditor.addListener(eventType, this);
	}

	/**
	 * @see org.eclipse.core.databinding.observable.value.IObservableValue#getValueType()
	 *
	 * @return
	 */
	public Object getValueType() {
		return String.class;
	}

	/**
	 * @see org.eclipse.core.databinding.observable.value.AbstractObservableValue#doGetValue()
	 *
	 * @return
	 */
	@Override
	protected Object doGetValue() {
		if(UnchangedObject.instance.toString().equals(richTextEditor.getText())) {
			return null;
		} else {
			return richTextEditor.getText();
		}
	}

	/**
	 * @see org.eclipse.core.databinding.observable.value.AbstractObservableValue#doSetValue(java.lang.Object)
	 *
	 * @param value
	 */
	@Override
	protected void doSetValue(Object value) {
		if(modelProperty != null && modelProperty.hasDifferentValues()) {
			this.richTextEditor.setText(UnchangedObject.instance.toString());
			this.currentValue = UnchangedObject.instance;
		} else {
			if(value instanceof String) {
				this.richTextEditor.setText((String)value);
				this.currentValue = value;
			} else if(value == null) {
				this.richTextEditor.setText(""); //$NON-NLS-1$
				this.currentValue = null;
			}
		}
	}

	/**
	 * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
	 *
	 * @param event
	 */
	public void handleEvent(Event event) {
		final Object oldValue = currentValue;
		final Object newValue = getValue();
		if(newValue == null) {
			return;
		}
		currentValue = newValue;
		if((eventType & event.type) != 0) {
			fireValueChange(new ValueDiff() {

				@Override
				public Object getOldValue() {
					return oldValue;
				}

				@Override
				public Object getNewValue() {
					return newValue;
				}
			});
		}
	}

	/**
	 * @see org.eclipse.core.databinding.observable.AbstractObservable#dispose()
	 *
	 */
	@Override
	public synchronized void dispose() {
		richTextEditor.removeListener(eventType, this);
		super.dispose();
	}
}
