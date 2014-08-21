/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AttributequantificationconstraintXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributequantificationconstraintXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		AttributequantificationconstraintPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the AttributequantificationconstraintResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AttributequantificationconstraintResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AttributequantificationconstraintResourceFactoryImpl());
		}
		return registrations;
	}

} // AttributequantificationconstraintXMLProcessor
