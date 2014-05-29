/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - add support for conditional tests
 *  Christian W. Damus (CEA) - bug 432813
 *  Christian W. Damus (CEA) - bug 434993
 *  Christian W. Damus (CEA) - bug 436047
 *
 *****************************************************************************/
package org.eclipse.papyrus.junit.utils.classification;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.operations.DefaultOperationHistory;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Platform;
import org.eclipse.papyrus.infra.tools.util.ListHelper;
import org.eclipse.papyrus.junit.utils.rules.ConditionRule;
import org.eclipse.papyrus.junit.utils.rules.Conditional;
import org.eclipse.papyrus.junit.utils.rules.MemoryLeakRule;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

/**
 * A Test Runner which is aware of Classification-related annotations and {@link Conditional @Conditional} tests.
 *
 * It ignores the test methods according to their annotations, and the policy defined
 * in {@link ClassificationConfig}
 *
 *
 * @see {@link ClassificationConfig}
 * @see {@link TestCategory}
 * @see Conditional
 *
 * @author Camille Letavernier
 *
 */
public class ClassificationRunner extends BlockJUnit4ClassRunner {

	private static final Supplier<TestRule> uiFlusherRuleSupplier = createURIFlusherRuleSupplier();

	private final ThreadLocal<Object> preparedTest = new ThreadLocal<Object>();

	public ClassificationRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}

	@Override
	protected void runChild(FrameworkMethod method, RunNotifier notifier) {
		List<Annotation> allAnnotations = ListHelper.asList(method.getAnnotations());
		allAnnotations.addAll(Arrays.asList(method.getMethod().getDeclaringClass().getAnnotations()));
		if(ClassificationConfig.shouldRun(allAnnotations.toArray(new Annotation[allAnnotations.size()])) && conditionSatisfied(method)) {
			super.runChild(method, notifier);
		} else {
			Description description = describeChild(method);
			notifier.fireTestIgnored(description);
		}
	}

	@Override
	protected Object createTest() throws Exception {
		// Look for a prepared test instance
		Object result = preparedTest.get();
		if(result != null) {
			// We won't need this test instance again
			clearPreparedTest();
		} else {
			result = basicCreateTest();
		}

		return result;
	}

	protected final Object basicCreateTest() throws Exception {
		return super.createTest();
	}

	protected final Object prepareTest() throws Exception {
		// Prepare the test instance and stash it to return on the next invocation
		Object result = basicCreateTest();
		preparedTest.set(result);
		return result;
	}

	protected final void clearPreparedTest() {
		preparedTest.remove();
	}

	private boolean conditionSatisfied(FrameworkMethod method) {
		boolean result = true;

		// Does this test declare some precondition?
		Conditional conditional = method.getAnnotation(Conditional.class);
		if(conditional != null) {
			try {
				// We need the test instance to invoke the condition on it, so prepare it now
				Object test = prepareTest();
				result = ConditionRule.testCondition(method.getMethod().getDeclaringClass(), conditional, test);
			} catch (Throwable t) {
				// If we couldn't create the test, then we should just ignore it
				result = false;
			} finally {
				if(!result) {
					// We won't be running the test, so forget the prepared instance (if any)
					clearPreparedTest();
				}
			}
		}

		return result;
	}

	@Override
	protected List<TestRule> getTestRules(Object target) {
		// MemoryLeakRules must be the outer-most rules, because leak assertions must only happen after all possible tear-down actions have run
		return reorderForMemoryLeakRules(super.getTestRules(target));
	}

	private List<TestRule> reorderForMemoryLeakRules(List<TestRule> rules) {
		// Quick scan for memory rules
		if(!rules.isEmpty()) {
			int memoryRuleCount = Iterables.size(Iterables.filter(rules, Predicates.instanceOf(MemoryLeakRule.class)));
			if(memoryRuleCount > 0) {
				// Bubble the memory rules to the end
				int limit = rules.size() - memoryRuleCount;

				for(int i = 0; i < limit; i++) {
					if(rules.get(i) instanceof MemoryLeakRule) {
						// Move the rule to the end and take a step back to get the next element
						rules.add(rules.remove(i--));
					}
				}
			}
		}

		return rules;
	}

	@Override
	protected Statement classBlock(RunNotifier notifier) {
		Statement result = super.classBlock(notifier);

		// Wrap the class suite in a rule that flushes the UI thread to release memory referenced by UI runnables
		TestRule uiFlusher = uiFlusherRuleSupplier.get();
		if(uiFlusher != null) {
			// This rule doesn't need any actual test description
			result = uiFlusher.apply(result, Description.EMPTY);
		}

		return result;
	}

	private static Supplier<TestRule> createURIFlusherRuleSupplier() {
		Supplier<TestRule> result = Suppliers.ofInstance(null);

		try {
			if(PlatformUI.isWorkbenchRunning()) {
				result = Suppliers.memoize(new Supplier<TestRule>() {

					public TestRule get() {
						if(Display.getCurrent() != null) {
							return new TestWatcher() {

								@Override
								protected void finished(Description description) {
									final Display display = Display.getCurrent();
									if(display == null) {
										// Can't do UI manipulations and history listener hacking except on the UI thread
										return;
									}
									
									// Flush the UI thread's pending events
									while(!display.isDisposed()) {
										try {
											if(!display.readAndDispatch()) {
												break;
											}
										} catch (Exception e) {
											// Ignore it
										}
									}

									// If there are no editors open any longer, then all of the action handlers currently
									// listening to the operation history are leaked, so remove them. This ensures that we
									// do not end up wasting time in notifying thousands of dead/broken/useless listeners
									// every time a test case executes an operation on the history (which happens *a lot*)
									IWorkbench bench = PlatformUI.getWorkbench();
									IWorkbenchWindow window = (bench == null) ? null : bench.getActiveWorkbenchWindow();
									if((window == null) && (bench != null) && (bench.getWorkbenchWindowCount() > 0)) {
										window = bench.getWorkbenchWindows()[0];
									}
									if(window != null && window.getActivePage().getEditorReferences().length == 0) {
										final ListenerList historyListeners = OperationHistoryHelper.getOperationHistoryListeners();
										final Object[] listeners = historyListeners.getListeners();
										for(int i = 0; i < listeners.length; i++) {
											if(OperationHistoryHelper.shouldRemoveHistoryListener(listeners[i])) {
												historyListeners.remove(listeners[i]);
											}
										}
									}
								}
							};
						}

						return null;
					}
				});
			}
		} catch (LinkageError e) {
			// Not running in Eclipse UI context.  Fine
		}

		return result;
	}
	
	//
	// Nested types
	//
	
	static class OperationHistoryHelper {

		static final Field listenersField;

		static final Set<Class<?>> historyListenerClasses;
		static {
			try {
				listenersField = DefaultOperationHistory.class.getDeclaredField("listeners");
				listenersField.setAccessible(true);

				historyListenerClasses = Sets.<Class<?>> newHashSet( //
				Platform.getBundle("org.eclipse.gmf.runtime.diagram.ui.actions").loadClass("org.eclipse.gmf.runtime.diagram.ui.actions.internal.PropertyChangeContributionItem"), //
					Platform.getBundle("org.eclipse.ui.workbench").loadClass("org.eclipse.ui.operations.OperationHistoryActionHandler$HistoryListener"));
			} catch (Exception e) {
				throw new ExceptionInInitializerError(e);
			}
		}

		static ListenerList getOperationHistoryListeners() {
			try {
				return (ListenerList)listenersField.get(PlatformUI.getWorkbench().getOperationSupport().getOperationHistory());
			} catch (Exception e) {
				org.junit.Assert.fail(e.getLocalizedMessage());
				return null; // Unreachable
			}
		}

		static boolean shouldRemoveHistoryListener(Object listener) {
			boolean result = historyListenerClasses.contains(listener.getClass().getName());

			if(!result) {
				// Maybe it's a subclass
				for(Class<?> next : historyListenerClasses) {
					if(next.isInstance(listener)) {
						// Remember this
						historyListenerClasses.add(listener.getClass());
						result = true;
						break;
					}
				}
			}

			return result;
		}
	}
}
