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

import java.io.IOException;
import java.net.UnknownHostException;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.moka.communication.request.isuspendresume.Resume_Request;
import org.eclipse.papyrus.moka.communication.request.isuspendresume.Suspend_Request;
import org.eclipse.papyrus.moka.communication.request.iterminate.Terminate_Request;
import org.eclipse.papyrus.moka.debug.MokaBreakpoint;
import org.eclipse.papyrus.moka.debug.MokaDebugTarget;
import org.eclipse.papyrus.moka.debug.MokaThread;
import org.eclipse.papyrus.moka.engine.AbstractExecutionEngine;
import org.eclipse.papyrus.moka.engine.IExecutionEngine;
import org.eclipse.papyrus.moka.ui.presentation.AnimationUtils;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.uml2.uml.NamedElement;

public class DummyUMLExecutionEngine extends AbstractExecutionEngine implements IExecutionEngine {

	/**
	 * A static instance of this engine.
	 * This is initialized by method init.
	 */
	public static DummyUMLExecutionEngine eInstance ;

	/**
	 * A flag used to track if the execution is actually started
	 */
	protected boolean started = false ;

	/**
	 * The console associated with this engine
	 */
	protected static IOConsole console ;

	/**
	 * The output stream associated with the console of this engine
	 */
	protected static IOConsoleOutputStream out ;

	/**
	 * The name of the console associated with this engine
	 */
	protected static final String CONSOLE_NAME = "Console";

	/**
	 * The control delegate object associated with this engine
	 */
	protected ControlDelegate controlDelegate ;

	/**
	 * The DummyVisitor created for the execution of the eObjectToExecute model element
	 */
	protected DummyVisitor visitor ;

	//////////////////////////////////////
	// Initialization
	//////////////////////////////////////

	@Override
	public void init(EObject eObjectToExecute, String[] args, MokaDebugTarget debugTarget, int requestPort,
			int replyPort, int eventPort) throws UnknownHostException, IOException {
		super.init(eObjectToExecute, args, debugTarget, requestPort, replyPort, eventPort);
		// In addition to AbsractExecutionEngine initialization:
		// - Initializes the Animation Utils (enables a pre-execution retrieval of diagrams associated with the eObjectToExecute)
		// - Creates a DummyVisitor for the given eObjectToExecute
		if (eObjectToExecute instanceof NamedElement) {
			AnimationUtils.init(eObjectToExecute);
			if (this.debugTarget != null) {
				this.debugTarget.setName("Dummy Example Debug Target") ;
			}
			visitor = new DummyVisitor((NamedElement)eObjectToExecute, this.getThreads()[0]) ;
		}
		DummyUMLExecutionEngine.eInstance = this ;
	}

	@Override
	public void initializeArguments(String[] args) {
		// not specific initialization to perform
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////
	// Implementation of the debug event processing.
	// All debug events (except resume events) are processed by delegation to the control delegate object
	// Reminder: These methods are automatically called by the event dispatch loop implemented by
	// AbstractExecutionEngine
	//////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void addBreakpoint(MokaBreakpoint breakpoint) {
		this.getControlDelegate().addBreakpoint(breakpoint);
	}

	@Override
	public void removeBreakpoint(MokaBreakpoint breakpoint) {
		this.getControlDelegate().removeBreakpoint(breakpoint);
	}

	@Override
	public IStackFrame[] getStackFrames(IThread thread) {
		// Never called in this implementation
		// When the debug framework is notified, threads are already constructed with appropriate stack frames.
		return null;
	}
	
	@Override
	public MokaThread[] getThreads() {
		return this.getControlDelegate().getThreads() ;
	}

	@Override
	public void disconnect() {
		// Disconnection not supported by this dummy execution engine
	}

	@Override
	public void suspend(Suspend_Request request) {
		this.getControlDelegate().suspend(request);
	}

	@Override
	public void terminate(Terminate_Request request) {
		this.getControlDelegate().terminate(request);
	}

	@Override
	public void resume(Resume_Request request) {
		// In the case where the execution has not yet been started, starts the visitor behavior on a new thread.
		// Otherwise, delegates processing of the request to the control delegate object
		if (!this.started) {
			Runnable execution = new Runnable() {
				public void run() {
					if (visitor != null) {
						try {
							started = true ;
							visitor.visit();
						}
						catch (Exception e) {
							Activator.log.error(e);
						}
						if (!isTerminated()) {
							try {
								getDebugTarget().terminate();
							} catch (DebugException e) {
								Activator.log.error(e);
							}
						}
					}
				}
			};
			Thread mainThread = new Thread(execution);
			mainThread.start();
		} else {
			this.getControlDelegate().resume(request);
		}
	}

	//////////////////////////////////
	// Utils
	//////////////////////////////////

	/**
	 * Returns the control delegate object associated with this engine
	 * 
	 * @return The control delegate object associated with this engine
	 */
	public ControlDelegate getControlDelegate() {
		if (this.controlDelegate == null) {
			this.controlDelegate = new ControlDelegate(this) ;
		}
		return this.controlDelegate ;
	}

	/**
	 * Returns an output stream connected to the console associated with this execution engine
	 * 
	 * @return an output stream connected to the console associated with this execution engine
	 */
	public IOConsoleOutputStream getOutputStream() {
		if (console == null) {
			console = new IOConsole(CONSOLE_NAME, null);	
		}
		if (out == null) {
			IConsoleManager conMan = ConsolePlugin.getDefault().getConsoleManager();
			conMan.addConsoles(new IConsole[] { console });
			out = console.newOutputStream() ;
		}
		return out;
	}
}
