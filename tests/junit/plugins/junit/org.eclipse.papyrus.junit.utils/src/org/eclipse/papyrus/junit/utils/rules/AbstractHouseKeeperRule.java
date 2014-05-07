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
package org.eclipse.papyrus.junit.utils.rules;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.junit.utils.Duck;
import org.eclipse.papyrus.junit.utils.PapyrusProjectUtils;
import org.eclipse.papyrus.junit.utils.ProjectUtils;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper.Disposer;
import org.osgi.framework.FrameworkUtil;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public abstract class AbstractHouseKeeperRule {

	private static final Function<Object, Disposer<Object>> DISPOSER_FUNCTION;

	Object test;

	String testName;

	private List<Runnable> cleanUpActions;

	static {
		final Map<Class<?>, Function<Object, Disposer<?>>> disposers = Maps.newLinkedHashMap();

		ResourceSetDisposer.register(disposers);
		TransactionalEditingDomainDisposer.register(disposers);
		WorkspaceResourceDisposer.register(disposers);

		// This one must be last because it matches any object
		ReflectiveDisposer.register(disposers);

		DISPOSER_FUNCTION = new Function<Object, Disposer<Object>>() {

			private final Function<Object, Disposer<?>> nullFunction = Functions.constant(null);

			public Disposer<Object> apply(Object input) {
				Function<Object, Disposer<?>> resultFunction = nullFunction;

				for(Map.Entry<Class<?>, Function<Object, Disposer<?>>> next : disposers.entrySet()) {
					if(next.getKey().isInstance(input)) {
						resultFunction = next.getValue();
						break;
					}
				}

				@SuppressWarnings("unchecked")
				Disposer<Object> result = (Disposer<Object>)resultFunction.apply(input);
				return result;
			}
		};
	}

	AbstractHouseKeeperRule() {
		super();
	}

	/**
	 * Obtains the test name (may as well provide it, since we are a test rule).
	 * 
	 * @return the current test name
	 */
	public final String getTestName() {
		return testName;
	}

	/**
	 * Adds an {@code object} to clean up later, with a {@code disposer} method that is invoked reflectively to do the cleaning up.
	 * 
	 * @param object
	 *        an object to dispose after the test has completed
	 * @param disposer
	 *        the disposal method name
	 * @param arg
	 *        arguments (if any) to the {@code disposer} method
	 * 
	 * @return the {@code object}, for convenience
	 */
	public <T> T cleanUpLater(T object, String disposer, Object... arg) {
		assertThat("No such disposal method", new Duck(object).understands(disposer, arg), is(true));
		return cleanUpLater(object, new ReflectiveDisposer(disposer, arg));
	}

	/**
	 * Adds an {@code object} to clean up later, with a {@code disposer} that does the cleaning up.
	 * 
	 * @param object
	 *        an object to dispose after the test has completed
	 * @param disposer
	 *        the disposal behaviour
	 * 
	 * @return the {@code object}, for convenience
	 */
	public <T> T cleanUpLater(T object, Disposer<? super T> disposer) {
		if(cleanUpActions == null) {
			cleanUpActions = Lists.newLinkedList();
		}

		// Clean up in reverse order to best manage dependencies between cleaned-up objects
		cleanUpActions.add(0, new CleanUpAction(object, disposer));
		return object;
	}

	/**
	 * Adds an {@code object} to clean up later, using the appropriate built-in disposer.
	 * Fails if the {@code object} does not have a corresponding built-in disposer.
	 * 
	 * @param object
	 *        an object to dispose after the test has completed
	 * 
	 * @return the {@code object}, for convenience
	 */
	public <T> T cleanUpLater(T object) {
		@SuppressWarnings("unchecked")
		Disposer<T> disposer = (Disposer<T>)DISPOSER_FUNCTION.apply(object);
		assertThat("No built-in disposer available", disposer, notNullValue());
		return cleanUpLater(object, disposer);
	}

	/**
	 * Obtains a new resource set that will be disposed of automatically after the test completes.
	 * 
	 * @return the new resource set
	 */
	public ResourceSet createResourceSet() {
		return cleanUpLater(new ResourceSetImpl(), ResourceSetDisposer.INSTANCE);
	}

	/**
	 * Creates a new editing domain that will be disposed of automatically after the test completes.
	 * 
	 * @return the editing domain
	 */
	public TransactionalEditingDomain createSimpleEditingDomain() {
		return createSimpleEditingDomain(null);
	}

	/**
	 * Creates a new editing domain that will be disposed of automatically after the test completes.
	 * 
	 * @param resourceSet
	 *        the resource set on which to create the editing domain (or {@code null} to create a default one)
	 * 
	 * @return the editing domain
	 */
	public TransactionalEditingDomain createSimpleEditingDomain(ResourceSet resourceSet) {
		if(resourceSet == null) {
			resourceSet = createResourceSet();
		}

		return cleanUpLater(TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet), TransactionalEditingDomainDisposer.INSTANCE);
	}

	/**
	 * Creates a project that will be disposed of automatically after the test completes.
	 * 
	 * @param name
	 *        the name of the project
	 * 
	 * @return the project
	 */
	public IProject createProject(String name) {
		try {
			return cleanUpLater(ProjectUtils.createProject(name), WorkspaceResourceDisposer.INSTANCE);
		} catch (Exception e) {
			fail(e.getMessage());
			return null; // Unreachable
		}
	}

	/**
	 * Creates a file in the specified {@code project} with the given {@code fileName}, initialized by copying a
	 * template resource from the test class's originating bundle.
	 * 
	 * @param project
	 *        the test project in which to create the file
	 * @param fileName
	 *        the name of the file to create
	 * @param templatePath
	 *        the path in the test bundle of the template file to copy
	 * 
	 * @return the new file
	 */
	public IFile createFile(IProject project, String fileName, String templatePath) {
		Class<?> testClass = (test instanceof Class<?>) ? (Class<?>)test : test.getClass();

		try {
			return cleanUpLater(PapyrusProjectUtils.copyIFile("/resource/TestPureUMLModel.uml", FrameworkUtil.getBundle(testClass), project, fileName), //
				WorkspaceResourceDisposer.INSTANCE);
		} catch (Exception e) {
			fail(e.getMessage());
			return null; // Unreachable
		}
	}

	/**
	 * Obtains the value of the named field of the test instance and ensures that it will be automatically cleared after the test completes.
	 * 
	 * @param fieldName
	 *        the field to access now and clear later
	 * 
	 * @return the value of the field
	 */
	public <T> T getField(String fieldName) {
		try {
			Field field = field(fieldName);

			@SuppressWarnings("unchecked")
			T result = (T)field.get(test);
			cleanUpLater(field, new FieldDisposer());

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			fail(String.format("Could not access field %s of test instance.", fieldName));
			return null; // Unreachable
		}
	}

	Field field(String fieldName) {
		Field result = null;

		try {
			result = getTestClass().getDeclaredField(fieldName);
			result.setAccessible(true);
			assertThat(String.format("Field is not %sstatic", isStatic() ? "" : "non-"), Modifier.isStatic(result.getModifiers()), is(isStatic()));
		} catch (Exception e) {
			e.printStackTrace();
			fail(String.format("Could not access field %s of test instance.", fieldName));
		}

		return result;
	}

	/**
	 * Sets the value of the named field of the test instance and ensures that it will be automatically cleared after the test completes.
	 * 
	 * @param fieldName
	 *        the field to access now and clear later
	 * @param value
	 *        the value to set
	 * 
	 * @return the new value of the field
	 */
	public <T> T setField(String fieldName, T value) {
		try {
			Field field = field(fieldName);
			field.set(test, value);
			cleanUpLater(field, new FieldDisposer());
		} catch (Exception e) {
			e.printStackTrace();
			fail(String.format("Could not access field %s of test instance.", fieldName));
		}

		return value;
	}

	abstract boolean isStatic();

	abstract Class<?> getTestClass();


	void cleanUp() throws Exception {
		cleanUpEObjectFields();

		if(cleanUpActions != null) {
			Exception toThrow = null;

			for(Runnable next : cleanUpActions) {
				try {
					next.run();
				} catch (Exception e) {
					// Unwrap
					if(e instanceof WrappedException) {
						e = ((WrappedException)e).exception();
					}

					e.printStackTrace();
					if(toThrow == null) {
						toThrow = e;
					}
				}
			}

			cleanUpActions = null;

			if(toThrow != null) {
				throw toThrow;
			}
		}
	}

	/**
	 * Automatically clear all fields of the test instance that are of some {@link EObject} type.
	 */
	private void cleanUpEObjectFields() {
		final int requiredModifiers = isStatic() ? Modifier.STATIC : 0;

		for(Field field : getTestClass().getDeclaredFields()) {
			if(EObject.class.isAssignableFrom(field.getType()) && ((field.getModifiers() & (Modifier.FINAL | Modifier.STATIC)) == requiredModifiers)) {
				try {
					field.setAccessible(true);
					field.set(test, null);
				} catch (Exception e) {
					// We tried our best. Don't propagate as a test failure because the test didn't ask for this
				}
			}
		}
	}

	//
	// Nested types
	//

	private static final class CleanUpAction implements Runnable {

		private final Object target;

		private final Disposer<Object> disposer;

		@SuppressWarnings("unchecked")
		<T> CleanUpAction(T object, Disposer<? super T> disposer) {
			this.target = object;
			this.disposer = (Disposer<Object>)disposer;
		}

		public void run() {
			try {
				disposer.dispose(target);
			} catch (Exception e) {
				throw new WrappedException(e);
			}
		}
	}

	private static final class ResourceSetDisposer implements Disposer<ResourceSet> {

		static final ResourceSetDisposer INSTANCE = new ResourceSetDisposer();

		private ResourceSetDisposer() {
			super();
		}

		static void register(Map<Class<?>, Function<Object, Disposer<?>>> disposers) {
			disposers.put(ResourceSet.class, Functions.<Disposer<?>> constant(INSTANCE));
		}

		public void dispose(ResourceSet object) {
			EMFHelper.unload(object);
		}
	}

	private static final class TransactionalEditingDomainDisposer implements Disposer<TransactionalEditingDomain> {

		static final TransactionalEditingDomainDisposer INSTANCE = new TransactionalEditingDomainDisposer();

		private TransactionalEditingDomainDisposer() {
			super();
		}

		static void register(Map<Class<?>, Function<Object, Disposer<?>>> disposers) {
			disposers.put(TransactionalEditingDomain.class, Functions.<Disposer<?>> constant(INSTANCE));
		}

		public void dispose(TransactionalEditingDomain object) {
			object.dispose();
		}
	}

	private final class FieldDisposer implements Disposer<Field> {

		public void dispose(Field object) throws Exception {
			object.set(test, null);
		}
	}

	private static final class WorkspaceResourceDisposer implements Disposer<IResource> {

		static final WorkspaceResourceDisposer INSTANCE = new WorkspaceResourceDisposer();

		static void register(Map<Class<?>, Function<Object, Disposer<?>>> disposers) {
			disposers.put(IResource.class, Functions.<Disposer<?>> constant(INSTANCE));
		}

		public void dispose(IResource object) throws Exception {
			switch(object.getType()) {
			case IResource.PROJECT:
			case IResource.FOLDER:
			case IResource.FILE:
				object.delete(true, null);
				break;
			default:
				// Delete the workspace? No, I don't think so
				fail("Cannot delete resource " + object);
				break;
			}
		}
	}

	private static final class ReflectiveDisposer implements Disposer<Object> {

		static final ReflectiveDisposer INSTANCE = new ReflectiveDisposer("dispose");

		private final String disposeMethod;

		private final Object[] arguments;

		ReflectiveDisposer(String methodName, Object... arguments) {
			this.disposeMethod = methodName;
			this.arguments = arguments;
		}

		static void register(Map<Class<?>, Function<Object, Disposer<?>>> disposers) {
			disposers.put(Object.class, new Function<Object, Disposer<?>>() {

				public Disposer<?> apply(Object input) {
					Duck duck = new Duck(input);

					return duck.understands(INSTANCE.disposeMethod, INSTANCE.arguments) ? INSTANCE : null;
				}
			});
		}

		public void dispose(Object object) throws Exception {
			new Duck(object).quack("dispose", arguments);
		}
	}
}
