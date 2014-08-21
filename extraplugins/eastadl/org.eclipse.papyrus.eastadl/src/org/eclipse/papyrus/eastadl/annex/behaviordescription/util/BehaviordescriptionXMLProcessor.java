/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BehaviordescriptionXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BehaviordescriptionXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		BehaviordescriptionPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the BehaviordescriptionResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new BehaviordescriptionResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new BehaviordescriptionResourceFactoryImpl());
		}
		return registrations;
	}

} // BehaviordescriptionXMLProcessor
