package org.eclipse.papyrus.eastadl.nattable.menu;

import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StructuredClassifier;


public class PropertyTester extends org.eclipse.core.expressions.PropertyTester {

	public static final String isPackage = "isPackage";

	public static final String isNamedElement = "isNamedElement";

	public static final String isStructuredClassifier = "isStructuredClassifier";

	/**
	 * Checks whether each element in the StructuredSelection can be adapted to an org.eclipse.uml2.uml.StructuredClassifier
	 * 
	 * @param structuredSelection
	 * @return result of test
	 */
	private boolean isStructuredClassifier(IStructuredSelection structuredSelection) {
		if(structuredSelection != null) {
			@SuppressWarnings("rawtypes")
			Iterator iterator = structuredSelection.iterator();
			while(iterator.hasNext()) {
				Object selection = iterator.next();

				if(!(selection instanceof IAdaptable)) {
					return false;
				}
				EObject object = (EObject)((IAdaptable)selection).getAdapter(EObject.class);
				if(object == null) {
					return false;
				}
				if(!(object instanceof StructuredClassifier)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * Checks whether each element in the StructuredSelection can be adapted to an org.eclipse.uml2.uml.NamedElement
	 * 
	 * @param structuredSelection
	 * @return result of test
	 */
	private boolean isNamedElement(IStructuredSelection structuredSelection) {
		if(structuredSelection != null) {
			@SuppressWarnings("rawtypes")
			Iterator iterator = structuredSelection.iterator();
			while(iterator.hasNext()) {
				Object selection = iterator.next();

				if(!(selection instanceof IAdaptable)) {
					return false;
				}
				EObject object = (EObject)((IAdaptable)selection).getAdapter(EObject.class);
				if(object == null) {
					return false;
				}
				if(!(object instanceof NamedElement)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}


	/**
	 * Checks whether each element in the StructuredSelection can be adapted to an org.eclipse.uml2.uml.Package
	 * 
	 * @param structuredSelection
	 * @return result of test
	 */
	private boolean isPackage(IStructuredSelection structuredSelection) {
		if(structuredSelection != null) {
			@SuppressWarnings("rawtypes")
			Iterator iterator = structuredSelection.iterator();
			while(iterator.hasNext()) {
				Object selection = iterator.next();

				if(!(selection instanceof IAdaptable)) {
					return false;
				}
				EObject object = (EObject)((IAdaptable)selection).getAdapter(EObject.class);
				if(object == null) {
					return false;
				}
				if(!(object instanceof org.eclipse.uml2.uml.Package)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * This is the method called when displaying menu whose visibility is conditioned by the tester.
	 * The property to be tested is passed as a String parameter
	 * 
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Object)
	 * 
	 * @param receiver
	 * @param property
	 * @param args
	 * @param expectedValue
	 * @return
	 */
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if(isPackage.equals(property)) {
			boolean testResult = isPackage((IStructuredSelection)receiver);

			return expectedValue.equals(new Boolean(testResult));
		}
		if(isStructuredClassifier.equals(property)) {
			boolean testResult = isStructuredClassifier((IStructuredSelection)receiver);

			return expectedValue.equals(new Boolean(testResult));
		}
		if(isNamedElement.equals(property)) {
			boolean testResult = isNamedElement((IStructuredSelection)receiver);

			return expectedValue.equals(new Boolean(testResult));
		}
		// other tests can be implemented
		return false;
	}

}
