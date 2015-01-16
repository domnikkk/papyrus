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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.moka.debug.MokaThread;
import org.eclipse.uml2.uml.NamedElement;

/**
 * A simple visitor class, that simply displays the name of the model elements it visits.
 * The visited elements are those contained in the executionRoot element, given as a parameter of the constructor.
 *
 */
public class DummyVisitor {
	
	/**
	 * The list of all the elements to be visited
	 */
	protected List<NamedElement> elementsToVisit ;
	
	/**
	 * The currently visited element
	 */
	protected NamedElement currentlyVisited ;
	
	/**
	 * The IThread associated with this visitor.
	 */
	protected MokaThread thread ;

	/**
	 * Constructor
	 * 
	 * @param executionRoot The root execution element, from which elementsToVisit is determined (eAllContents)
	 * @param thread The thread to be associated with this visitor
	 */
	public DummyVisitor(NamedElement executionRoot, MokaThread thread) {
		this.thread = thread ;
		this.elementsToVisit = new ArrayList<NamedElement>() ; 
		Iterator<EObject> i = executionRoot.eAllContents() ;
		for ( ; i.hasNext() ; ) {
			EObject o = i.next() ;
			if (o instanceof NamedElement) {
				elementsToVisit.add((NamedElement)o) ;
			}
		}
	}

	/**
	 * The visitor behavior.
	 * It consists in iterating over elementsToVisit, and display the name of the visited elements.
	 * After each visit, inside of the iteration, the control is delegated to a ControlDelegate object,
	 * in order to determine if execution can go on, or shall be suspended, or shall be terminated, 
	 * or if some animation shall happen.
	 */
	public void visit() {
		try {
			boolean _continue = true ;
			for (Iterator<NamedElement> i = elementsToVisit.iterator() ; i.hasNext() && _continue ; ) {
				currentlyVisited = i.next() ;
				DummyUMLExecutionEngine.eInstance.getOutputStream().write("I am visiting " + currentlyVisited.getName() + "\n") ;
				// if _continue becomes false (which means that the execution shall terminate), the loop will exit 
				_continue = DummyUMLExecutionEngine.eInstance.getControlDelegate().control(this) ;
			}
		} catch (IOException e) {
			Activator.log.error(e);
		}
	}

}
