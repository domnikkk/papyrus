/*******************************************************************************
 * Copyright (c) 2013 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cedric Dumoulin - cedric.dumoulin@lifl.fr
 ******************************************************************************/
package org.eclipse.papyrus.uml.profile.drafter.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;


/**
 * This class is used to record a list of traces.
 * Traces are for event triggered by a method.
 * This class is for tests purpose.
 * 
 * @author cedric dumoulin
 *
 */
public class TracesRecorder<T1, T2>  {


	/**
	 * List of recorded events
	 */
	public List<TraceRecord<T1, T2>> traces = new ArrayList<TraceRecord<T1, T2>>();

	/**
	 * Clear all traces.
	 */
	public void clear() {
		traces.clear();
	}
	
	/**
	 * Add a trace to the list of traces
	 * @param name
	 * @param notification
	 */
	public void records(String name, T1 obj1) {
		traces.add(new TraceRecord<T1, T2>(name, obj1));
	}

	/**
	 * Add a trace to the list of traces
	 * @param name
	 * @param notification
	 */
	public void records(String name, T1 obj1, T2 obj2) {
		traces.add(new TraceRecord<T1, T2>(name, obj1, obj2));
	}

	/**
	 * Return true if one of the trace has the specified name.
	 * @param name
	 * @return
	 */
	public boolean contains(String name) {
		if( name == null)
			return false;
		
		for(TraceRecord<T1, T2> event : traces) {
			if(name.equals(event.name))
				return true;
		}
		return false;
	}

	/**
	 * Return true if one of the trace has the specified name.
	 * @param name Name of the event to found
	 * @return the first event with the specified name, or null if nothing is found.
	 */
	public TraceRecord<T1, T2> getFirstEvent(String name) {
		if( name == null)
			return null;
		
		for(TraceRecord<T1, T2> event : traces) {
			if(name.equals(event.name))
				return event;
		}
		return null;
	}


	/**
	 * A record of an event
	 *
	 */
	public class TraceRecord<T1, T2> {
		public String name;
		public T1 obj1;
		public T2 obj2;
		
		/**
		 * Constructor.
		 *
		 * @param name
		 * @param notifier
		 */
		public TraceRecord(String name, T1 notifier) {
			this.name = name;
			this.obj1 = notifier;
		}
		/**
		 * Constructor.
		 *
		 * @param name
		 * @param object
		 */
		public TraceRecord(String name,  T1 obj1, T2 obj2) {
			this.name = name;
			this.obj1 = obj1;
			this.obj2 = obj2;
		}
		
	}


	/**
	 * Return the number of traces
	 * @return
	 */
	public int size() {
		return traces.size();
	}

	/**
	 * Get the specified trace.
	 * @param i
	 * @return
	 */
	public TraceRecord<T1, T2> get(int index) {
		return traces.get(index);
	}
}
