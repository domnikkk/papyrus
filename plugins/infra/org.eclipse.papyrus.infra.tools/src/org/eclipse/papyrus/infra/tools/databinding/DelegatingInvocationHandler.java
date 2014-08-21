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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.databinding.observable.IObservable;


/**
 * An invocation handler for dynamic proxies that wrap {@link DelegatingObservable}s to implement other interfaces of those delegators' delegates,
 * such as the papyrus {@code ICommitListener} interface from the Widgets API.
 */
class DelegatingInvocationHandler implements InvocationHandler {

	private final IDelegatingObservable delegator;

	private final Class<? extends IObservable> delegatedInterface;

	private DelegatingInvocationHandler(IDelegatingObservable delegator, Class<? extends IObservable> delegatedInterface) {
		super();

		this.delegator = delegator;
		this.delegatedInterface = delegatedInterface;
	}

	public static <T extends IObservable> T wrap(IDelegatingObservable delegator, Class<T> delegatedInterface) {
		T result;

		List<Class<?>> mixins = null;

		IObservable delegate = delegator.getDelegate();

		for (Class<?> next : allInterfaces(delegate.getClass())) {
			// Already have the core observable interfaces covered
			if (!next.isAssignableFrom(delegatedInterface)) {
				if (mixins == null) {
					mixins = new ArrayList<Class<?>>(1);
				}
				mixins.add(next);
			}
		}

		if (mixins == null) {
			result = delegatedInterface.cast(delegator);
		} else {
			// This class loader is sure to be able to see all of the interfaces implemented by the delegate.
			// But the question is, can it see the IDelegatingObservable interface?
			ClassLoader loader = delegator.getDelegate().getClass().getClassLoader();
			try {
				if (loader.loadClass(IDelegatingObservable.class.getName()) != IDelegatingObservable.class) {
					// This loader can't see the same class. Use my loader, instead
					loader = DelegatingInvocationHandler.class.getClassLoader();
				}
			} catch (Exception e) {
				// This loader can't see the class. Use my loader, instead
				loader = DelegatingInvocationHandler.class.getClassLoader();
			}

			result = wrap(delegator, delegatedInterface, loader, mixins.toArray(new Class<?>[mixins.size()]));
		}

		return result;
	}

	static Set<Class<?>> allInterfaces(Class<?> clazz) {
		Set<Class<?>> result = new HashSet<Class<?>>();
		collectAllInterfaces(clazz, result);
		return result;
	}

	private static void collectAllInterfaces(Class<?> clazz, Collection<Class<?>> result) {
		Class<?>[] interfaces = clazz.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			// Don't need to collect super-interfaces because they are inherited
			result.add(interfaces[i]);
		}

		// Climb the type hierarchy to get interfaces of superclasses (which may be unrelated to direct interfaces)
		Class<?> zuper = clazz.getSuperclass();
		if (zuper != null) {
			collectAllInterfaces(zuper, result);
		}
	}

	@SuppressWarnings("unchecked")
	public static <T extends IObservable> T wrap(IDelegatingObservable delegator, Class<T> delegatedInterface, ClassLoader loader, Class<?>... mixins) {
		T result;

		if ((loader == null) || (mixins.length == 0)) {
			// Nothing to wrap
			result = delegatedInterface.cast(delegator);
		} else {
			List<Class<?>> interfaces = new ArrayList<Class<?>>(mixins.length + 2);
			interfaces.add(delegatedInterface);
			interfaces.add(IDelegatingObservable.class);
			interfaces.addAll(Arrays.asList(mixins));
			InvocationHandler handler = new DelegatingInvocationHandler(delegator, delegatedInterface);

			result = delegatedInterface.cast(Proxy.newProxyInstance(loader, interfaces.toArray(new Class<?>[interfaces.size()]), handler));
			((DelegatingObservable<T>) delegator).setRealObservable(result);
		}

		return result;
	}

	/**
	 * The interesting case of wrapping an observable that is already one of our delegating dynamic proxies.
	 *
	 * @param proxy
	 *            a dynamic proxy implementing the {@link IDelegatingObservable} interface
	 *
	 * @return another dynamic proxy of the same class, which delegates to the supplied {@code proxy}
	 *
	 * @throws Exception
	 *             on failure to create a new dynamic proxy of the same kind as the delegate {@code proxy}
	 */
	@SuppressWarnings("unchecked")
	static <T extends IObservable> T wrapDynamicProxy(T proxy) throws Exception {
		final DelegatingInvocationHandler proxyHandler = (DelegatingInvocationHandler) Proxy.getInvocationHandler(proxy);

		// Create a new delegator of the appropriate class
		DelegatingObservable<T> proxyDelegator = (DelegatingObservable<T>) proxyHandler.delegator;
		DelegatingObservable<T> delegator = proxyDelegator.getClass().getDeclaredConstructor(proxyHandler.delegatedInterface).newInstance(proxy);

		// Create an invocation handler for the same delegated interface as the wrapped proxy
		DelegatingInvocationHandler handler = new DelegatingInvocationHandler(delegator, proxyHandler.delegatedInterface);

		// And create a new delegating proxy of the same class
		return (T) proxy.getClass().getDeclaredConstructor(InvocationHandler.class).newInstance(handler);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;

		Class<?> owner = method.getDeclaringClass();

		try {
			if ((owner == delegatedInterface) || (owner == IDelegatingObservable.class) || (owner == ReferenceCountedObservable.class) || (owner == Object.class) || owner.isAssignableFrom(delegatedInterface)) {
				// Refer this to our delegate
				result = method.invoke(delegator, args);
			} else {
				// Refer this to the delegator's delegate
				result = method.invoke(delegator.getDelegate(), args);
			}
		} catch (InvocationTargetException e) {
			// Don't just re-throw this because chances are it's triggered by a run-time exception (doesn't need to
			// be declared) or by a declared exception. The ITE type is not usually declared in API signatures
			// (in fact, it really should only be declared by the Method::invoke(...) API!)
			throw e.getTargetException();
		}

		return result;
	}
}
