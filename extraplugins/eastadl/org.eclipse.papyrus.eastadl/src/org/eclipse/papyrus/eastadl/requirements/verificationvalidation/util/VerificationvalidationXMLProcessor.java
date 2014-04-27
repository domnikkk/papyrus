/**
 */
package org.eclipse.papyrus.eastadl.requirements.verificationvalidation.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VerificationvalidationXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationvalidationXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		VerificationvalidationPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the VerificationvalidationResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new VerificationvalidationResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new VerificationvalidationResourceFactoryImpl());
		}
		return registrations;
	}

} //VerificationvalidationXMLProcessor
