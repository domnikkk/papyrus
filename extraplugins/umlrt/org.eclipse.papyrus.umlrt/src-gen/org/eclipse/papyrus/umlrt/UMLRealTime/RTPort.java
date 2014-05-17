/**
 */
package org.eclipse.papyrus.umlrt.UMLRealTime;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RT Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isNotification <em>Is Notification</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isPublish <em>Is Publish</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isWired <em>Is Wired</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getRegistration <em>Registration</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getRegistrationOverride <em>Registration Override</em>}</li>
 *   <li>{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getBase_Port <em>Base Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getRTPort()
 * @model
 * @generated
 */
public interface RTPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Notification</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Notification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Notification</em>' attribute.
	 * @see #setIsNotification(boolean)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getRTPort_IsNotification()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNotification();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isNotification <em>Is Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Notification</em>' attribute.
	 * @see #isNotification()
	 * @generated
	 */
	void setIsNotification(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Publish</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Publish</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Publish</em>' attribute.
	 * @see #setIsPublish(boolean)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getRTPort_IsPublish()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPublish();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isPublish <em>Is Publish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Publish</em>' attribute.
	 * @see #isPublish()
	 * @generated
	 */
	void setIsPublish(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Wired</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Wired</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Wired</em>' attribute.
	 * @see #setIsWired(boolean)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getRTPort_IsWired()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isWired();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#isWired <em>Is Wired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Wired</em>' attribute.
	 * @see #isWired()
	 * @generated
	 */
	void setIsWired(boolean value);

	/**
	 * Returns the value of the '<em><b>Registration</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration</em>' attribute.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType
	 * @see #setRegistration(PortRegistrationType)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getRTPort_Registration()
	 * @model ordered="false"
	 * @generated
	 */
	PortRegistrationType getRegistration();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getRegistration <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration</em>' attribute.
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.PortRegistrationType
	 * @see #getRegistration()
	 * @generated
	 */
	void setRegistration(PortRegistrationType value);

	/**
	 * Returns the value of the '<em><b>Registration Override</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Override</em>' attribute.
	 * @see #setRegistrationOverride(String)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getRTPort_RegistrationOverride()
	 * @model default="" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRegistrationOverride();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getRegistrationOverride <em>Registration Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Override</em>' attribute.
	 * @see #getRegistrationOverride()
	 * @generated
	 */
	void setRegistrationOverride(String value);

	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see org.eclipse.papyrus.umlrt.UMLRealTime.UMLRealTimePackage#getRTPort_Base_Port()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.UMLRealTime.RTPort#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isWired implies not isPublish
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='A wired port cannot publish its name'"
	 * @generated
	 */
	boolean Awiredportcannotpublishitsname(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (base_Port.visibility = UML::VisibilityKind::public) 
	 *     implies base_Port.isService  
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='A public port must be defined as a service port'"
	 * @generated
	 */
	boolean Apublicportmustbedefinedasaserviceport(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not isWired and not isPublish) 
	 *    implies (base_Port.visibility = UML::VisibilityKind::protected)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='A SAP (unwired & unpublished) must have protected visibility '"
	 * @generated
	 */
	boolean ASAPunwiredunpublishedmusthaveprotectedvisibility(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not isWired and isPublish) implies 
	 *    (base_Port.visibility = UML::VisibilityKind::public)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='An SPP (unwired and published) must have public visibility'"
	 * @generated
	 */
	boolean AnSPPunwiredandpublishedmusthavepublicvisibility(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RTPort
