/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.elements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.EAXML;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAXML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAXMLImpl#getAdmindocumentVersion <em>Admindocument Version</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAXMLImpl#getAutosardocumentVersion <em>Autosardocument Version</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAXMLImpl#isXmlglobalelement <em>Xmlglobalelement</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAXMLImpl#getTopLevelPackage <em>Top Level Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EAXMLImpl extends MinimalEObjectImpl.Container implements EAXML {
	/**
	 * The default value of the '{@link #getAdmindocumentVersion() <em>Admindocument Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAdmindocumentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMINDOCUMENT_VERSION_EDEFAULT = "2013-05-28";

	/**
	 * The cached value of the '{@link #getAdmindocumentVersion() <em>Admindocument Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAdmindocumentVersion()
	 * @generated
	 * @ordered
	 */
	protected String admindocumentVersion = ADMINDOCUMENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutosardocumentVersion() <em>Autosardocument Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAutosardocumentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOSARDOCUMENT_VERSION_EDEFAULT = "4.0";

	/**
	 * The cached value of the '{@link #getAutosardocumentVersion() <em>Autosardocument Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAutosardocumentVersion()
	 * @generated
	 * @ordered
	 */
	protected String autosardocumentVersion = AUTOSARDOCUMENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isXmlglobalelement() <em>Xmlglobalelement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isXmlglobalelement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XMLGLOBALELEMENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isXmlglobalelement() <em>Xmlglobalelement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isXmlglobalelement()
	 * @generated
	 * @ordered
	 */
	protected boolean xmlglobalelement = XMLGLOBALELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopLevelPackage() <em>Top Level Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getTopLevelPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackage> topLevelPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EAXMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElementsPackage.Literals.EAXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getAdmindocumentVersion() {
		return admindocumentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAdmindocumentVersion(String newAdmindocumentVersion) {
		String oldAdmindocumentVersion = admindocumentVersion;
		admindocumentVersion = newAdmindocumentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.EAXML__ADMINDOCUMENT_VERSION, oldAdmindocumentVersion, admindocumentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getAutosardocumentVersion() {
		return autosardocumentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAutosardocumentVersion(String newAutosardocumentVersion) {
		String oldAutosardocumentVersion = autosardocumentVersion;
		autosardocumentVersion = newAutosardocumentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.EAXML__AUTOSARDOCUMENT_VERSION, oldAutosardocumentVersion, autosardocumentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isXmlglobalelement() {
		return xmlglobalelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setXmlglobalelement(boolean newXmlglobalelement) {
		boolean oldXmlglobalelement = xmlglobalelement;
		xmlglobalelement = newXmlglobalelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.EAXML__XMLGLOBALELEMENT, oldXmlglobalelement, xmlglobalelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EAPackage> getTopLevelPackage() {
		if (topLevelPackage == null) {
			topLevelPackage = new EObjectResolvingEList<EAPackage>(EAPackage.class, this, ElementsPackage.EAXML__TOP_LEVEL_PACKAGE);
		}
		return topLevelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ElementsPackage.EAXML__ADMINDOCUMENT_VERSION:
			return getAdmindocumentVersion();
		case ElementsPackage.EAXML__AUTOSARDOCUMENT_VERSION:
			return getAutosardocumentVersion();
		case ElementsPackage.EAXML__XMLGLOBALELEMENT:
			return isXmlglobalelement();
		case ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
			return getTopLevelPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ElementsPackage.EAXML__ADMINDOCUMENT_VERSION:
			setAdmindocumentVersion((String) newValue);
			return;
		case ElementsPackage.EAXML__AUTOSARDOCUMENT_VERSION:
			setAutosardocumentVersion((String) newValue);
			return;
		case ElementsPackage.EAXML__XMLGLOBALELEMENT:
			setXmlglobalelement((Boolean) newValue);
			return;
		case ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
			getTopLevelPackage().clear();
			getTopLevelPackage().addAll((Collection<? extends EAPackage>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ElementsPackage.EAXML__ADMINDOCUMENT_VERSION:
			setAdmindocumentVersion(ADMINDOCUMENT_VERSION_EDEFAULT);
			return;
		case ElementsPackage.EAXML__AUTOSARDOCUMENT_VERSION:
			setAutosardocumentVersion(AUTOSARDOCUMENT_VERSION_EDEFAULT);
			return;
		case ElementsPackage.EAXML__XMLGLOBALELEMENT:
			setXmlglobalelement(XMLGLOBALELEMENT_EDEFAULT);
			return;
		case ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
			getTopLevelPackage().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ElementsPackage.EAXML__ADMINDOCUMENT_VERSION:
			return ADMINDOCUMENT_VERSION_EDEFAULT == null ? admindocumentVersion != null : !ADMINDOCUMENT_VERSION_EDEFAULT.equals(admindocumentVersion);
		case ElementsPackage.EAXML__AUTOSARDOCUMENT_VERSION:
			return AUTOSARDOCUMENT_VERSION_EDEFAULT == null ? autosardocumentVersion != null : !AUTOSARDOCUMENT_VERSION_EDEFAULT.equals(autosardocumentVersion);
		case ElementsPackage.EAXML__XMLGLOBALELEMENT:
			return xmlglobalelement != XMLGLOBALELEMENT_EDEFAULT;
		case ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
			return topLevelPackage != null && !topLevelPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (admindocumentVersion: "); //$NON-NLS-1$
		result.append(admindocumentVersion);
		result.append(", autosardocumentVersion: "); //$NON-NLS-1$
		result.append(autosardocumentVersion);
		result.append(", xmlglobalelement: "); //$NON-NLS-1$
		result.append(xmlglobalelement);
		result.append(')');
		return result.toString();
	}

} // EAXMLImpl
