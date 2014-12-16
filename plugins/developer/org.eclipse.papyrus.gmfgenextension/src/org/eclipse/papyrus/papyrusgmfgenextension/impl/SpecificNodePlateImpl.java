/**
 */
package org.eclipse.papyrus.papyrusgmfgenextension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.papyrus.papyrusgmfgenextension.PapyrusgmfgenextensionPackage;
import org.eclipse.papyrus.papyrusgmfgenextension.SpecificNodePlate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Node Plate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.papyrusgmfgenextension.impl.SpecificNodePlateImpl#getEditParts <em>Edit Parts</em>}</li>
 * <li>{@link org.eclipse.papyrus.papyrusgmfgenextension.impl.SpecificNodePlateImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.papyrusgmfgenextension.impl.SpecificNodePlateImpl#getNodePlateQualifiedName <em>Node Plate Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificNodePlateImpl extends CommentedElementImpl implements SpecificNodePlate {
	/**
	 * The cached value of the '{@link #getEditParts() <em>Edit Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getEditParts()
	 * @generated
	 * @ordered
	 */
	protected EList<GenNode> editParts;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodePlateQualifiedName() <em>Node Plate Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getNodePlateQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_PLATE_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodePlateQualifiedName() <em>Node Plate Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getNodePlateQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String nodePlateQualifiedName = NODE_PLATE_QUALIFIED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected SpecificNodePlateImpl() {
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
		return PapyrusgmfgenextensionPackage.Literals.SPECIFIC_NODE_PLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<GenNode> getEditParts() {
		if (editParts == null) {
			editParts = new EObjectResolvingEList<GenNode>(GenNode.class, this, PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__EDIT_PARTS);
		}
		return editParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getNodePlateQualifiedName() {
		return nodePlateQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setNodePlateQualifiedName(String newNodePlateQualifiedName) {
		String oldNodePlateQualifiedName = nodePlateQualifiedName;
		nodePlateQualifiedName = newNodePlateQualifiedName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__NODE_PLATE_QUALIFIED_NAME, oldNodePlateQualifiedName, nodePlateQualifiedName));
		}
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
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__EDIT_PARTS:
			return getEditParts();
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__NAME:
			return getName();
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__NODE_PLATE_QUALIFIED_NAME:
			return getNodePlateQualifiedName();
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
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__EDIT_PARTS:
			getEditParts().clear();
			getEditParts().addAll((Collection<? extends GenNode>) newValue);
			return;
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__NAME:
			setName((String) newValue);
			return;
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__NODE_PLATE_QUALIFIED_NAME:
			setNodePlateQualifiedName((String) newValue);
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
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__EDIT_PARTS:
			getEditParts().clear();
			return;
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__NODE_PLATE_QUALIFIED_NAME:
			setNodePlateQualifiedName(NODE_PLATE_QUALIFIED_NAME_EDEFAULT);
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
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__EDIT_PARTS:
			return editParts != null && !editParts.isEmpty();
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PapyrusgmfgenextensionPackage.SPECIFIC_NODE_PLATE__NODE_PLATE_QUALIFIED_NAME:
			return NODE_PLATE_QUALIFIED_NAME_EDEFAULT == null ? nodePlateQualifiedName != null : !NODE_PLATE_QUALIFIED_NAME_EDEFAULT.equals(nodePlateQualifiedName);
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", nodePlateQualifiedName: ");
		result.append(nodePlateQualifiedName);
		result.append(')');
		return result.toString();
	}

} // SpecificNodePlateImpl
