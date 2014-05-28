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
package org.eclipse.papyrus.dd.dg.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.Matrix;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Matrix</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.MatrixImpl#getA <em>A</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.MatrixImpl#getB <em>B</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.MatrixImpl#getC <em>C</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.MatrixImpl#getD <em>D</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.MatrixImpl#getE <em>E</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.impl.MatrixImpl#getF <em>F</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MatrixImpl extends TransformImpl implements Matrix {
	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final double A_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected double a = A_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final double B_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected double b = B_EDEFAULT;

	/**
	 * The default value of the '{@link #getC() <em>C</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final double C_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected double c = C_EDEFAULT;

	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final double D_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected double d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getE() <em>E</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected static final double E_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE() <em>E</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected double e = E_EDEFAULT;

	/**
	 * The default value of the '{@link #getF() <em>F</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getF()
	 * @generated
	 * @ordered
	 */
	protected static final double F_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getF() <em>F</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getF()
	 * @generated
	 * @ordered
	 */
	protected double f = F_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.MATRIX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setA(double newA) {
		double oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.MATRIX__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setB(double newB) {
		double oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.MATRIX__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setC(double newC) {
		double oldC = c;
		c = newC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.MATRIX__C, oldC, c));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setD(double newD) {
		double oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.MATRIX__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getE() {
		return e;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setE(double newE) {
		double oldE = e;
		e = newE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.MATRIX__E, oldE, e));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getF() {
		return f;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setF(double newF) {
		double oldF = f;
		f = newF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DGPackage.MATRIX__F, oldF, f));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DGPackage.MATRIX__A:
			return getA();
		case DGPackage.MATRIX__B:
			return getB();
		case DGPackage.MATRIX__C:
			return getC();
		case DGPackage.MATRIX__D:
			return getD();
		case DGPackage.MATRIX__E:
			return getE();
		case DGPackage.MATRIX__F:
			return getF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DGPackage.MATRIX__A:
			setA((Double) newValue);
			return;
		case DGPackage.MATRIX__B:
			setB((Double) newValue);
			return;
		case DGPackage.MATRIX__C:
			setC((Double) newValue);
			return;
		case DGPackage.MATRIX__D:
			setD((Double) newValue);
			return;
		case DGPackage.MATRIX__E:
			setE((Double) newValue);
			return;
		case DGPackage.MATRIX__F:
			setF((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DGPackage.MATRIX__A:
			setA(A_EDEFAULT);
			return;
		case DGPackage.MATRIX__B:
			setB(B_EDEFAULT);
			return;
		case DGPackage.MATRIX__C:
			setC(C_EDEFAULT);
			return;
		case DGPackage.MATRIX__D:
			setD(D_EDEFAULT);
			return;
		case DGPackage.MATRIX__E:
			setE(E_EDEFAULT);
			return;
		case DGPackage.MATRIX__F:
			setF(F_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DGPackage.MATRIX__A:
			return a != A_EDEFAULT;
		case DGPackage.MATRIX__B:
			return b != B_EDEFAULT;
		case DGPackage.MATRIX__C:
			return c != C_EDEFAULT;
		case DGPackage.MATRIX__D:
			return d != D_EDEFAULT;
		case DGPackage.MATRIX__E:
			return e != E_EDEFAULT;
		case DGPackage.MATRIX__F:
			return f != F_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (a: ");
		result.append(a);
		result.append(", b: ");
		result.append(b);
		result.append(", c: ");
		result.append(c);
		result.append(", d: ");
		result.append(d);
		result.append(", e: ");
		result.append(e);
		result.append(", f: ");
		result.append(f);
		result.append(')');
		return result.toString();
	}

} // MatrixImpl
