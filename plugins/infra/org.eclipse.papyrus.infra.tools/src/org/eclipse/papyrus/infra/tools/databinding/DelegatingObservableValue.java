/*
 * Copyright (c) 2014 CEA and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.infra.tools.databinding;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.ValueDiff;


/**
 * This is the DelegatingObservableValue type. Enjoy.
 */
public class DelegatingObservableValue extends DelegatingObservable<IObservableValue> implements IObservableValue {

	private static final Object VALUE_EVENT_TYPE = new Object();

	private IValueChangeListener forwardingValueChangeListener;

	DelegatingObservableValue(IObservableValue delegate) {
		super(delegate, IObservableValue.class);
	}

	DelegatingObservableValue(Realm realm) {
		super(realm, IObservableValue.class);
	}

	public static IObservableValue wrap(IObservableValue observable) {
		IObservableValue result;

		if (observable instanceof IDelegatingObservable) {
			// Already have a delegator. Just create another like it
			try {
				result = observable.getClass().getDeclaredConstructor(IObservableValue.class).newInstance(observable);
			} catch (Exception e) {
				// Seems unlikely as I must have created the observable in the first place
				throw new IllegalArgumentException("observable is an invalid implementation of IDelegatingObservable", e); //$NON-NLS-1$
			}
		} else {
			result = DelegatingInvocationHandler.wrap(new DelegatingObservableValue(observable), IObservableValue.class);
		}

		return result;
	}

	public static IObservableValue create(Realm realm, ClassLoader loader, Class<?>... mixins) {
		return DelegatingInvocationHandler.wrap(new DelegatingObservableValue(realm), IObservableValue.class, loader, mixins);
	}

	public void addValueChangeListener(IValueChangeListener listener) {
		addListener(VALUE_EVENT_TYPE, listener);
	}

	public void removeValueChangeListener(IValueChangeListener listener) {
		removeListener(VALUE_EVENT_TYPE, listener);
	}

	@Override
	protected void hookDelegate(IObservableValue delegate) {
		super.hookDelegate(delegate);
		delegate.addValueChangeListener(getForwardingValueChangeListener());
	}

	@Override
	protected void unhookDelegate(IObservableValue delegate) {
		delegate.removeValueChangeListener(getForwardingValueChangeListener());
		super.unhookDelegate(delegate);
	}

	@Override
	protected void delegateChanged(IObservableValue oldDelegate, IObservableValue newDelegate) {
		super.delegateChanged(oldDelegate, newDelegate);

		Object oldValue = ((oldDelegate == null) || oldDelegate.isDisposed()) ? null : oldDelegate.getValue();
		Object newValue = (newDelegate == null) ? null : newDelegate.getValue();

		fireEvent(new MyValueChangeEvent(Diffs.createValueDiff(oldValue, newValue)));
	}

	public Object getValueType() {
		return (getDelegate() == null) ? Void.class : getDelegate().getValueType();
	}

	public Object getValue() {
		getterCalled();

		return (getDelegate() == null) ? null : getDelegate().getValue();
	}

	public void setValue(Object value) {
		if (getDelegate() != null) {
			getDelegate().setValue(value);
		}
	}

	private IValueChangeListener getForwardingValueChangeListener() {
		if (forwardingValueChangeListener == null) {
			forwardingValueChangeListener = new IValueChangeListener() {

				public void handleValueChange(ValueChangeEvent event) {
					ValueChangeEvent myEvent = new MyValueChangeEvent(event.diff);
					fireEvent(myEvent);
				}
			};
		}

		return forwardingValueChangeListener;
	}

	//
	// Nested types
	//

	class MyValueChangeEvent extends ValueChangeEvent {

		private static final long serialVersionUID = 1L;

		MyValueChangeEvent(ValueDiff diff) {
			super(getRealObservable(), diff);
		}

		@Override
		protected Object getListenerType() {
			// We implement our own listener type because the type from the core framework is not accessible
			return VALUE_EVENT_TYPE;
		}
	}
}
