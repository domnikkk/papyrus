/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.values.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.values.util.ValuesResourceImpl
 * @generated
 */
public class ValuesResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValuesResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new ValuesResourceImpl(uri);
		return result;
	}

} // ValuesResourceFactoryImpl
