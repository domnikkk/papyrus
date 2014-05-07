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
package org.eclipse.papyrus.junit.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.WrappedException;

import com.google.common.primitives.Primitives;


/**
 * A clumsy Java implementation of <em>Duck Typing</em>, in which objects are manipulated reflectively according to their public interface (the
 * operations they provide) rather than their types.
 */
public class Duck {

	private final Object target;

	/**
	 * Wraps an object as a duck.
	 * 
	 * @param target
	 *        the object to wrap. Must not be {@code null}
	 * 
	 * @throws NullPointerException
	 *         on attempt to duck-wrap a {@code null}
	 */
	public Duck(Object target) {
		super();

		if(target == null) {
			throw new NullPointerException();
		}

		this.target = target;
	}

	/**
	 * Queries whether the duck understands the named message (implying that it can {@linkplain #quack(String, Object...) quack} it.
	 * This accounts for signature overloading by finding the first method that accepts the given arguments.
	 * 
	 * @param methodName
	 *        the method name
	 * @param arg
	 *        the arguments to the method
	 * @return whether I can invoke the named method with these arguments
	 */
	public boolean understands(String methodName, Object... arg) {
		return lookup(methodName, null, arg) != null;
	}

	/**
	 * Queries whether the duck understands a message matching the given regex(implying that it can {@linkplain #quackp(String, Object...) quack} it.
	 * This accounts for signature overloading by finding the first method that accepts the given arguments.
	 * 
	 * @param methodPattern
	 *        the method name pattern
	 * @param arg
	 *        the arguments to the method
	 * @return whether I can invoke the indicated method with these arguments
	 */
	public boolean understandsp(String methodPattern, Object... arg) {
		return lookup(Pattern.compile(methodPattern), null, arg) != null;
	}

	/**
	 * Reflectively invokes a method by name. This accounts for signature overloading by finding the first method that accepts the given arguments.
	 * 
	 * @param methodName
	 *        the method name
	 * @param arg
	 *        the arguments to the method
	 * @return the method result, which would be {@code null} in the case of a {@code void} method
	 */
	public <T> T quack(String methodName, Object... arg) {
		return invoke(lookup(methodName, null, arg), arg);
	}

	/**
	 * Reflectively invokes a method by regex (matching the method name). This accounts for signature overloading by finding the first method that
	 * accepts the given arguments.
	 * 
	 * @param methodPattern
	 *        the method name pattern
	 * @param arg
	 *        the arguments to the method
	 * @return the method result, which would be {@code null} in the case of a {@code void} method
	 */
	public <T> T quackp(String methodPattern, Object... arg) {
		return invoke(lookup(Pattern.compile(methodPattern), null, arg), arg);
	}

	/**
	 * Reflectively invokes a method by name {@code returning} a type conforming to the given type. This accounts for signature overloading by finding
	 * the first method that accepts the given arguments.
	 * 
	 * @param methodName
	 *        the method name
	 * @param returning
	 *        the required return type, or {@code null} if the return type doesn't matter
	 * @param arg
	 *        the arguments to the method
	 * @return the method result, which would be {@code null} in the case of a {@code void} method
	 */
	public <T> T quack(String methodName, Class<T> returning, Object... arg) {
		return invoke(lookup(methodName, returning, arg), arg);
	}

	/**
	 * Reflectively invokes a method by regex (matching the method name) {@code returning} a type conforming to the given type. This accounts for
	 * signature overloading by finding the first method that
	 * accepts the given arguments.
	 * 
	 * @param methodPattern
	 *        the method name pattern
	 * @param returning
	 *        the required return type, or {@code null} if the return type doesn't matter
	 * @param arg
	 *        the arguments to the method
	 * @return the method result, which would be {@code null} in the case of a {@code void} method
	 */
	public <T> T quackp(String methodPattern, Class<T> returning, Object... arg) {
		return invoke(lookup(Pattern.compile(methodPattern), returning, arg), arg);
	}

	@SuppressWarnings("unchecked")
	private <T> T invoke(Method method, Object[] args) {
		try {
			return (method == null) ? null : (T)method.invoke(target, args);
		} catch (IllegalAccessException e) {
			throw new WrappedException(e);
		} catch (InvocationTargetException e) {
			Throwable toThrow = e.getTargetException();
			if(toThrow instanceof Error) {
				throw (Error)toThrow;
			}
			throw new WrappedException((Exception)toThrow);
		}
	}

	private Method lookup(String methodName, Class<?> returning, Object[] args) {
		Method result = null;
		final Class<?>[] signature = signature(args);

		Method[] scope = target.getClass().getMethods();
		for(int i = 0; (result == null) && (i < scope.length); i++) {
			Method next = scope[i];
			if(next.getName().equals(methodName) && (returning == null) && match(next, signature)) {
				result = next;
			}
		}

		return result;
	}

	private Method lookup(Pattern methodPattern, Class<?> returning, Object[] args) {
		final Matcher m = methodPattern.matcher(""); //$NON-NLS-1$

		Method result = null;
		final Class<?>[] signature = signature(args);

		Method[] scope = target.getClass().getMethods();
		for(int i = 0; (result == null) && (i < scope.length); i++) {
			Method next = scope[i];
			m.reset(next.getName());
			if(m.matches() && matchReturn(next.getReturnType(), returning) && match(next, signature)) {
				result = next;
			}
		}

		return result;
	}

	private static boolean match(Method method, Class<?>[] signature) {
		Class<?>[] params = method.getParameterTypes();
		boolean result = params.length == signature.length;

		if(result) {
			for(int i = 0; result && (i < signature.length); i++) {
				result = matchParameter(params[i], signature[i]);
			}
		}

		return result;
	}

	private static boolean matchReturn(Class<?> returnType, Class<?> expectedType) {
		boolean result;

		if(expectedType == null) {
			// Wildcard: take any method
			result = true;
		} else if((returnType == void.class) || (returnType == Void.class)) {
			// Handle void methods
			result = (expectedType == void.class) || (expectedType == Void.class);
		} else {
			// Compare the unwrapped primitive types
			result = Primitives.unwrap(expectedType).isAssignableFrom(Primitives.unwrap(expectedType));
		}

		return result;
	}

	private static boolean matchParameter(Class<?> paramType, Class<?> argType) {
		boolean result;

		if(argType == Void.class) {
			// Handle null arguments: null is assignable to any object type (not primitive)
			result = !paramType.isPrimitive();
		} else if(paramType.isPrimitive()) {
			// Compare the wrapper type
			result = Primitives.wrap(paramType).isAssignableFrom(argType);
		} else {
			// Straight-forward object types
			result = paramType.isAssignableFrom(argType);
		}

		return result;
	}

	private static Class<?>[] signature(Object[] args) {
		Class<?>[] result = new Class<?>[args.length];

		for(int i = 0; i < args.length; i++) {
			result[i] = (args[i] == null) ? Void.class : args[i].getClass();
		}

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Duck) && target.equals(((Duck)obj).target);
	}

	@Override
	public int hashCode() {
		return target.hashCode();
	}
}
