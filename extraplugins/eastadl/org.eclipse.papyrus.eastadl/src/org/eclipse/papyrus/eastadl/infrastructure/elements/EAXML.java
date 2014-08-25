/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.elements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAXML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getAdmindocumentVersion <em>Admindocument Version</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getAutosardocumentVersion <em>Autosardocument Version</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#isXmlglobalelement <em>Xmlglobalelement</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getTopLevelPackage <em>Top Level Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage#getEAXML()
 * @model abstract="true"
 * @generated
 */
public interface EAXML extends EObject {
	/**
	 * Returns the value of the '<em><b>Admindocument Version</b></em>' attribute.
	 * The default value is <code>"2013-05-28"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admindocument Version</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Admindocument Version</em>' attribute.
	 * @see #setAdmindocumentVersion(String)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage#getEAXML_AdmindocumentVersion()
	 * @model default="2013-05-28" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='admin.documentVersion'"
	 * @generated
	 */
	String getAdmindocumentVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getAdmindocumentVersion <em>Admindocument Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Admindocument Version</em>' attribute.
	 * @see #getAdmindocumentVersion()
	 * @generated
	 */
	void setAdmindocumentVersion(String value);

	/**
	 * Returns the value of the '<em><b>Autosardocument Version</b></em>' attribute.
	 * The default value is <code>"4.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autosardocument Version</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Autosardocument Version</em>' attribute.
	 * @see #setAutosardocumentVersion(String)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage#getEAXML_AutosardocumentVersion()
	 * @model default="4.0" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='autosar.documentVersion'"
	 * @generated
	 */
	String getAutosardocumentVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#getAutosardocumentVersion <em>Autosardocument Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Autosardocument Version</em>' attribute.
	 * @see #getAutosardocumentVersion()
	 * @generated
	 */
	void setAutosardocumentVersion(String value);

	/**
	 * Returns the value of the '<em><b>Xmlglobalelement</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xmlglobalelement</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Xmlglobalelement</em>' attribute.
	 * @see #setXmlglobalelement(boolean)
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage#getEAXML_Xmlglobalelement()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='xml.globalelement'"
	 * @generated
	 */
	boolean isXmlglobalelement();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML#isXmlglobalelement <em>Xmlglobalelement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Xmlglobalelement</em>' attribute.
	 * @see #isXmlglobalelement()
	 * @generated
	 */
	void setXmlglobalelement(boolean value);

	/**
	 * Returns the value of the '<em><b>Top Level Package</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Level Package</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Top Level Package</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage#getEAXML_TopLevelPackage()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EAPackage> getTopLevelPackage();

} // EAXML
