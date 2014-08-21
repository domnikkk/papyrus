/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.values.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValuesXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValuesXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ValuesPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the ValuesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ValuesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ValuesResourceFactoryImpl());
		}
		return registrations;
	}

} // ValuesXMLProcessor
