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
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.junit.utils.PapyrusProjectUtils;
import org.eclipse.papyrus.junit.utils.ProjectUtils;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper.Disposer;
import org.osgi.framework.FrameworkUtil;

import com.google.common.collect.Lists;

public abstract class AbstractHouseKeeperRule {

	Object test;

	String testName;

	private List<Runnable> cleanUpActions;

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
			Field field = getTestClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			assertThat(String.format("Field is not %sstatic", isStatic() ? "" : "non-"), field.getModifiers() & Modifier.STATIC, is(isStatic() ? Modifier.STATIC : 0));

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

		public void dispose(ResourceSet object) {
			EMFHelper.unload(object);
		}
	}

	private static final class TransactionalEditingDomainDisposer implements Disposer<TransactionalEditingDomain> {

		static final TransactionalEditingDomainDisposer INSTANCE = new TransactionalEditingDomainDisposer();

		private TransactionalEditingDomainDisposer() {
			super();
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
}
