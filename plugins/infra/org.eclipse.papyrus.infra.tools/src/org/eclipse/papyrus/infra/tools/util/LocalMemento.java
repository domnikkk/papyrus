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
package org.eclipse.papyrus.infra.tools.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ui.IMemento;


/**
 * Invocation handler for the dynamic local memento implementation.
 */
class LocalMemento implements InvocationHandler {

	private static final Class<?>[] INTERFACES = { IMemento.class };

	private static final Map<Method, Method> delegates = createDelegates();

	private final String type;

	private final String id;

	private final List<IMemento> children = new ArrayList<IMemento>();

	private final Map<String, Object> attributes = new HashMap<String, Object>();

	private String textData;

	LocalMemento(String type, String id) {
		super();

		this.type = type;
		this.id = id;
	}

	static IMemento createMemento(String type, String id) {
		LocalMemento handler = new LocalMemento(type, id);
		return (IMemento) Proxy.newProxyInstance(LocalMemento.class.getClassLoader(), INTERFACES, handler);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;

		Method implementation = delegates.get(method);
		if (implementation == null) {
			throw new UnsupportedOperationException("dynamic proxy handler does not understand " + method.getName()); //$NON-NLS-1$
		} else {
			result = implementation.invoke(this, args);
		}

		return result;
	}

	@API
	String getType() {
		return type;
	}

	@API
	String getID() {
		return id;
	}

	@API
	IMemento createChild(String type) {
		return createChild(type, null);
	}

	@API
	IMemento createChild(String type, String id) {
		IMemento result = createMemento(type, id);
		children.add(result);
		return result;
	}

	@API
	IMemento getChild(String type) {
		IMemento result = null;
		for (IMemento next : children) {
			if (type.equals(next.getType())) {
				result = next;
				break;
			}
		}
		return result;
	}

	@API
	IMemento[] getChildren() {
		return children.toArray(new IMemento[children.size()]);
	}

	@API
	IMemento[] getChildren(String type) {
		List<IMemento> result = new ArrayList<IMemento>(children.size());
		for (IMemento next : children) {
			if (type.equals(next.getType())) {
				result.add(next);
			}
		}
		return result.toArray(new IMemento[result.size()]);
	}

	@API
	Float getFloat(String key) {
		return coerce(attributes.get(key), Float.class);
	}

	private <T> T coerce(Object value, Class<T> type) {
		Object result;

		if (value == null) {
			result = value;
		} else if (type.isInstance(value)) {
			result = value;
		} else if (Number.class.isAssignableFrom(type) && (value instanceof Number)) {
			Number number = (Number) value;
			if (type == Integer.class) {
				result = number.intValue();
			} else if (type == Float.class) {
				result = number.floatValue();
			} else {
				throw new IllegalArgumentException("unsupported numeric type: " + type.getSimpleName()); //$NON-NLS-1$
			}
		} else if (Number.class.isAssignableFrom(type) && (value instanceof String)) {
			String string = (String) value;
			if (type == Integer.class) {
				result = Integer.valueOf(string);
			} else if (type == Float.class) {
				result = Float.valueOf(string);
			} else {
				throw new IllegalArgumentException("unsupported numeric type: " + type.getSimpleName()); //$NON-NLS-1$
			}
		} else if (type == Boolean.class) {
			// We know the value isn't a Boolean, otherwise we would have handled it already
			if (value instanceof String) {
				result = Boolean.valueOf((String) value);
			} else {
				throw new IllegalArgumentException("unsupported boolean conversion from type: " + ((value == null) ? "null" : value.getClass().getSimpleName())); //$NON-NLS-1$
			}
		} else if (type == String.class) {
			result = String.valueOf(value);
		} else {
			throw new IllegalArgumentException("unsupported attribute type: " + type.getSimpleName()); //$NON-NLS-1$
		}

		return type.cast(result);
	}

	@API
	Integer getInteger(String key) {
		return coerce(attributes.get(key), Integer.class);
	}

	@API
	String getString(String key) {
		return coerce(attributes.get(key), String.class);
	}

	@API
	Boolean getBoolean(String key) {
		return coerce(attributes.get(key), Boolean.class);
	}

	@API
	String getTextData() {
		return textData;
	}

	@API
	String[] getAttributeKeys() {
		return attributes.keySet().toArray(new String[attributes.size()]);
	}

	@API
	void putFloat(String key, float value) {
		attributes.put(key, value);
	}

	@API
	void putInteger(String key, int value) {
		attributes.put(key, value);
	}

	@API
	void putString(String key, String value) {
		attributes.put(key, value);
	}

	@API
	void putBoolean(String key, boolean value) {
		attributes.put(key, value);
	}

	@API
	void putTextData(String data) {
		textData = data;
	}

	private boolean isLocalMemento(IMemento memento) {
		return (memento != null) && Proxy.isProxyClass(memento.getClass()) && ((Proxy.getInvocationHandler(memento) instanceof LocalMemento));
	}

	@API
	void putMemento(IMemento memento) {
		if (!isLocalMemento(memento)) {
			throw new IllegalArgumentException("memento is not a local memento"); //$NON-NLS-1$
		}
		children.add(memento);
	}

	@Override
	@API(owner = Object.class)
	public String toString() {
		StringBuilder result = new StringBuilder();

		append(result, 0);

		return result.toString();
	}

	private void append(StringBuilder buf, int depth) {
		// Indent
		for (int i = 0; i < depth; i++) {
			buf.append("  "); //$NON-NLS-1$
		}

		buf.append("LocalMemento(");//$NON-NLS-1$
		buf.append(type);
		if (id != null) {
			buf.append('[').append(id).append(']');
		}
		buf.append(") ").append(attributes); //$NON-NLS-1$
		buf.append('\n');

		final int nextDepth = depth + 1;
		for (IMemento next : children) {
			((LocalMemento) Proxy.getInvocationHandler(next)).append(buf, nextDepth);
		}
	}

	private static Map<Method, Method> createDelegates() {
		Map<Method, Method> result = new HashMap<Method, Method>();

		for (Method implementation : LocalMemento.class.getDeclaredMethods()) {
			if (implementation.isAnnotationPresent(API.class)) {
				try {
					Method api = implementation.getAnnotation(API.class).owner().getMethod(implementation.getName(), implementation.getParameterTypes());
					result.put(api, implementation);
				} catch (NoSuchMethodException e) {
					throw new LinkageError("Incompatible IMemento API change: " + implementation.getName());
				}
			}
		}

		return result;
	}

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	private @interface API {

		Class<?> owner() default IMemento.class;
	}
}
