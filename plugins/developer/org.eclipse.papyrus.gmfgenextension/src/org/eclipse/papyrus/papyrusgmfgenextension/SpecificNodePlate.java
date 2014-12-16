/**
 */
package org.eclipse.papyrus.papyrusgmfgenextension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmf.codegen.gmfgen.GenNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Node Plate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element is always linked to a genView (topLevel, or child)
 * Used set if an editPart is abstract.
 * SuperGenViews is a list of all superEditPart.
 *
 * Thanks to this, it is possible to factorize code and to decrease the number of generated classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.papyrusgmfgenextension.SpecificNodePlate#getEditParts <em>Edit Parts</em>}</li>
 * <li>{@link org.eclipse.papyrus.papyrusgmfgenextension.SpecificNodePlate#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.papyrusgmfgenextension.SpecificNodePlate#getNodePlateQualifiedName <em>Node Plate Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.papyrusgmfgenextension.PapyrusgmfgenextensionPackage#getSpecificNodePlate()
 * @model
 * @generated
 */
public interface SpecificNodePlate extends CommentedElement {
	/**
	 * Returns the value of the '<em><b>Edit Parts</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Parts</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Edit Parts</em>' reference list.
	 * @see org.eclipse.papyrus.papyrusgmfgenextension.PapyrusgmfgenextensionPackage#getSpecificNodePlate_EditParts()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<GenNode> getEditParts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.papyrus.papyrusgmfgenextension.PapyrusgmfgenextensionPackage#getSpecificNodePlate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.papyrusgmfgenextension.SpecificNodePlate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node Plate Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Plate Qualified Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Node Plate Qualified Name</em>' attribute.
	 * @see #setNodePlateQualifiedName(String)
	 * @see org.eclipse.papyrus.papyrusgmfgenextension.PapyrusgmfgenextensionPackage#getSpecificNodePlate_NodePlateQualifiedName()
	 * @model
	 * @generated
	 */
	String getNodePlateQualifiedName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.papyrusgmfgenextension.SpecificNodePlate#getNodePlateQualifiedName <em>Node Plate Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Node Plate Qualified Name</em>' attribute.
	 * @see #getNodePlateQualifiedName()
	 * @generated
	 */
	void setNodePlateQualifiedName(String value);

} // SpecificNodePlate
