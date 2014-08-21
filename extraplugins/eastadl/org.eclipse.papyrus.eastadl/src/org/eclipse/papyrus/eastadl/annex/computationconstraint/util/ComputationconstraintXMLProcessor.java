/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ComputationconstraintXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComputationconstraintXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ComputationconstraintPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the ComputationconstraintResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ComputationconstraintResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ComputationconstraintResourceFactoryImpl());
		}
		return registrations;
	}

} // ComputationconstraintXMLProcessor
