/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.moka.dummyexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.moka.MokaConstants;
import org.eclipse.papyrus.moka.communication.event.isuspendresume.Suspend_Event;
import org.eclipse.papyrus.moka.communication.request.isuspendresume.Resume_Request;
import org.eclipse.papyrus.moka.communication.request.isuspendresume.Suspend_Request;
import org.eclipse.papyrus.moka.communication.request.iterminate.Terminate_Request;
import org.eclipse.papyrus.moka.debug.MokaBreakpoint;
import org.eclipse.papyrus.moka.debug.MokaStackFrame;
import org.eclipse.papyrus.moka.debug.MokaThread;
import org.eclipse.papyrus.moka.engine.AbstractExecutionEngine;
import org.eclipse.papyrus.moka.ui.presentation.AnimationUtils;

public class ControlDelegate {

	/// FIXME Problem when the variable panel is visible
	
	/**
	 * The execution engine associated with this ControlDelegate object
	 */
	protected AbstractExecutionEngine engine;

	/**
	 * The list of threads implied by current execution
	 */
	protected List<MokaThread> threads;

	/**
	 * Determines if execution is suspended
	 */
	protected boolean suspended = false;

	/**
	 * The reason for suspending execution
	 */
	protected int reasonForSuspending = -1;

	/**
	 * The reason for resuming execution
	 */
	protected int reasonForResuming = -1;

	/**
	 * The execution mode (i.e., Debug or Run)
	 */
	protected String mode;

	/**
	 * Semantic elements associated with a breakpoint
	 */
	protected Set<EObject> elementsWithBreakpoints;

	/**
	 * 
	 * 
	 * @param engine The engine associated with this ControlDelegate object
	 */
	public ControlDelegate(AbstractExecutionEngine engine) {
		this.engine = engine;
		this.mode = this.engine.getDebugTarget().getLaunch().getLaunchMode();
		this.elementsWithBreakpoints = new HashSet<EObject>();
	}

	/**
	 * Manages addition of a breakpoint in the course of execution
	 *
	 * @param breakpoint
	 *            The added breakpoint
	 */
	public void addBreakpoint(MokaBreakpoint breakpoint) {
		EObject modelElement = breakpoint.getModelElement();
		if (modelElement != null) {
			if (modelElement.eIsProxy()) {
				modelElement = AnimationUtils.resolve(modelElement);
			}
			this.elementsWithBreakpoints.add(modelElement);
		}
	}

	/**
	 * Manages removal of a breakpoint in the course of execution
	 *
	 * @param breakpoint
	 *            The removed breakpoint
	 */
	public void removeBreakpoint(MokaBreakpoint breakpoint) {
		EObject modelElement = breakpoint.getModelElement();
		if (modelElement != null) {
			if (modelElement.eIsProxy()) {
				modelElement = AnimationUtils.resolve(modelElement);
			}
			this.elementsWithBreakpoints.remove(modelElement);
		}
	}

	/**
	 * Manages resuming of execution
	 *
	 * @param request
	 *            The request underlying this resume
	 */
	public void resume(Resume_Request request) {
		this.suspended = false;
		this.reasonForResuming = request.getResumeDetail();
		if (reasonForResuming != DebugEvent.CLIENT_REQUEST) {
			reasonForResuming = DebugEvent.STEP_OVER;
		}
		this.getThreads()[0].setSuspended(false);
		synchronized (this) {
			notify();
			this.threads.get(0).setStackFrames(new IStackFrame[] {});
		}
	}

	/**
	 * Manages suspension of execution
	 *
	 * @param request
	 *            The request underlying this suspension
	 */
	public void suspend(Suspend_Request request) {
		this.suspended = true;
		this.reasonForSuspending = DebugEvent.CLIENT_REQUEST;
	}

	/**
	 * Manages termination of execution
	 *
	 * @param request
	 *            The request underlying this termination
	 */
	public void terminate(Terminate_Request request) {
		engine.setIsTerminated(true);
		synchronized (this) {
			notify();
		}
	}

	/**
	 * Returns the threads underlying this execution
	 * The semantics implemented by this engine makes the hypothesis that the execution occurs on a single thread, 
	 * so that there will be only one thread visible in the thread/stack view when execution is suspended
	 *
	 * @return The threads underlying this execution
	 */
	public MokaThread[] getThreads() {
		if (this.threads == null) {
			this.threads = new ArrayList<MokaThread>();
			if (this.engine.getDebugTarget().getLaunch().getLaunchMode().equals(ILaunchManager.DEBUG_MODE)) {
				MokaThread thread = new MokaThread(this.engine.getDebugTarget());
				thread.setName("Main Thread");
				thread.setStackFrames(new IStackFrame[] {});
				this.threads.add(thread);
			}
		}
		return threads.toArray(new MokaThread[threads.size()]);
	}

	/**
	 * Method that can be called by a particular execution engine to delegate control of execution flow.
	 *
	 * @param object
	 *            An object from the execution flow from which control has to be delegated
	 * @return False if execution shall stop, True if execution shall continue
	 */
	public boolean control(Object object) {
		if (this.engine.isTerminated()) {
			return false;
		}

		// Retrieves the semantic element
		EObject semanticElement = ((DummyVisitor)object).currentlyVisited ;

		// Manages animation
		if (semanticElement != null && MokaConstants.MOKA_AUTOMATIC_ANIMATION && this.mode.equals(ILaunchManager.DEBUG_MODE)) {
			this.animate(semanticElement);
		}

		if (this.suspended) { /* Client request */
			try {
				synchronized (this) {
					this.getThreads(); // To make sure that this.threads is neither null nor empty
					MokaThread mainThread = this.threads.get(0);
					mainThread.setSuspended(true);
					MokaStackFrame stackFrame = PresentationUtils.getMokaStackFrame((DummyVisitor)object);
					stackFrame.setThread(mainThread);
					mainThread.setStackFrames(new IStackFrame[] { stackFrame });
					Suspend_Event suspendEvent = new Suspend_Event(mainThread, DebugEvent.CLIENT_REQUEST, this.getThreads());
					engine.sendEvent(suspendEvent);
					wait();
				}
			} catch (InterruptedException e) {
				Activator.log.error(e);
			}
		} else { // Tries to check if a breakpoint applies, or if execution was resumed due to a Step Over
			if (this.elementsWithBreakpoints.contains(semanticElement) || this.reasonForResuming == DebugEvent.STEP_OVER) {
				try {
					synchronized (this) {
						this.getThreads(); // To make sure that this.threads is neither null nor empty
						MokaThread mainThread = this.threads.get(0);
						mainThread.setSuspended(true);
						MokaStackFrame stackFrame = PresentationUtils.getMokaStackFrame((DummyVisitor)object);
						stackFrame.setThread(mainThread);
						mainThread.setStackFrames(new IStackFrame[] { stackFrame });
						Suspend_Event suspendEvent = new Suspend_Event(mainThread, DebugEvent.BREAKPOINT, this.getThreads());
						engine.sendEvent(suspendEvent);
						wait();
					}
				} catch (InterruptedException e) {
					Activator.log.error(e);
				}
			}
		}
		return !this.engine.isTerminated();
	}

	/**
	 * A utility method to perform some animation on a model element
	 * 
	 * @param element
	 */
	protected void animate(EObject element) {
		try {
			// Animates the element
			if ((AnimationUtils.getInstance().diagramsExistFor(element))) {
				AnimationUtils.getInstance().addAnimationMarker(element);
				Thread.sleep(MokaConstants.MOKA_ANIMATION_DELAY);
				AnimationUtils.getInstance().removeAnimationMarker(element);
			}
		} catch (InterruptedException e) {
			Activator.log.error(e);
		}

	}

}
