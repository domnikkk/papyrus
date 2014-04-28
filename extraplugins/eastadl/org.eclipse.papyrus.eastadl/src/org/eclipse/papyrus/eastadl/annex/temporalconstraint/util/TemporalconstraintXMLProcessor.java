/**
 */
package org.eclipse.papyrus.eastadl.annex.temporalconstraint.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalconstraintXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalconstraintXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		TemporalconstraintPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the TemporalconstraintResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TemporalconstraintResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TemporalconstraintResourceFactoryImpl());
		}
		return registrations;
	}

} //TemporalconstraintXMLProcessor
