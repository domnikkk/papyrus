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
package org.eclipse.papyrus.dd.di.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.dd.di.DIPackage;
import org.eclipse.papyrus.dd.di.Diagram;
import org.eclipse.papyrus.dd.di.Edge;
import org.eclipse.papyrus.dd.di.Shape;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.dd.di.DIPackage
 * @generated
 */
public class DIDerivedUnionAdapter extends AdapterImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static DIPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DIDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = DIPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> with the appropriate model class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof EObject) {
			EClass eClass = ((EObject) notifier).eClass();
			if (eClass.eContainer() == modelPackage) {
				notifyChanged(notification, eClass);
			}
		}
	}

	/**
	 * Calls <code>notifyXXXChanged</code> for the corresponding class of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChanged(Notification notification, EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DIPackage.EDGE:
			notifyEdgeChanged(notification, eClass);
			break;
		case DIPackage.DIAGRAM:
			notifyDiagramChanged(notification, eClass);
			break;
		case DIPackage.SHAPE:
			notifyShapeChanged(notification, eClass);
			break;
		}
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @param derivedUnion
	 *            the derived union affected by the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification, EClass eClass, EStructuralFeature derivedUnion) {
		// Do nothing.
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyEdgeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Edge.class)) {
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDiagramChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Diagram.class)) {
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param notification
	 *            a description of the change.
	 * @param eClass
	 *            the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyShapeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Shape.class)) {
		}
	}
} // DIDerivedUnionAdapter
