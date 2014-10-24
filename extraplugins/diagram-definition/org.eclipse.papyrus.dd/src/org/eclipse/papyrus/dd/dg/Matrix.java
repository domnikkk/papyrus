/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dd.dg;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Matrix</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Matrix is a kind of transform that represents any transform operation with a 3x3 transformation matrix.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Matrix#getA <em>A</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Matrix#getB <em>B</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Matrix#getC <em>C</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Matrix#getD <em>D</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Matrix#getE <em>E</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Matrix#getF <em>F</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends Transform {

	/**
	 * Returns the value of the '<em><b>A</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the a
	 * value of the transform matrix. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>A</em>' attribute.
	 * @see #setA(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMatrix_A()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getA();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Matrix#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>A</em>' attribute.
	 * @see #getA()
	 * @generated
	 */
	void setA(double value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the b
	 * value of the transform matrix. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMatrix_B()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getB();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Matrix#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(double value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the c
	 * value of the transform matrix. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>C</em>' attribute.
	 * @see #setC(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMatrix_C()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getC();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Matrix#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>C</em>' attribute.
	 * @see #getC()
	 * @generated
	 */
	void setC(double value);

	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the d
	 * value of the transform matrix. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #setD(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMatrix_D()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getD();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Matrix#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(double value);

	/**
	 * Returns the value of the '<em><b>E</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the e
	 * value of the transform matrix. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>E</em>' attribute.
	 * @see #setE(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMatrix_E()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getE();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Matrix#getE <em>E</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>E</em>' attribute.
	 * @see #getE()
	 * @generated
	 */
	void setE(double value);

	/**
	 * Returns the value of the '<em><b>F</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the f
	 * value of the transform matrix. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>F</em>' attribute.
	 * @see #setF(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getMatrix_F()
	 * @model dataType="org.eclipse.papyrus.dd.dc.Real" required="true"
	 *        ordered="false"
	 * @generated
	 */
	double getF();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Matrix#getF <em>F</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>F</em>' attribute.
	 * @see #getF()
	 * @generated
	 */
	void setF(double value);
} // Matrix
