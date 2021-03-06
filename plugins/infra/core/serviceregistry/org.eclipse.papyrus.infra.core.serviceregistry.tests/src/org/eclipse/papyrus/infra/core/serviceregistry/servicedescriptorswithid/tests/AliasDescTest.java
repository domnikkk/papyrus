/**
 */
package org.eclipse.papyrus.infra.core.serviceregistry.servicedescriptorswithid.tests;

import junit.textui.TestRunner;

import org.eclipse.papyrus.infra.core.serviceregistry.servicedescriptorswithid.AliasIdDesc;
import org.eclipse.papyrus.infra.core.serviceregistry.servicedescriptorswithid.ServicedescriptorswithidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alias Desc</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AliasDescTest extends AbstractServiceDescTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AliasDescTest.class);
	}

	/**
	 * Constructs a new Alias Desc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public AliasDescTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Alias Desc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected AliasIdDesc getFixture() {
		return (AliasIdDesc) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServicedescriptorswithidFactory.eINSTANCE.createAliasIdDesc());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} // AliasDescTest
