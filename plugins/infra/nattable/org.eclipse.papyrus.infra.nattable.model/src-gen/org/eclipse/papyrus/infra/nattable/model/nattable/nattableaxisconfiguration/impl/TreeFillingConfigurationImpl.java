/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.NattableaxisconfigurationPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.PasteEObjectConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablelabelprovider.ILabelProviderConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.StyledElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Filling Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.impl.TreeFillingConfigurationImpl#getAxisUsedAsAxisProvider <em>Axis Used As Axis Provider</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.impl.TreeFillingConfigurationImpl#getPasteConfiguration <em>Paste Configuration</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.impl.TreeFillingConfigurationImpl#getDepth <em>Depth</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.impl.TreeFillingConfigurationImpl#getLabelProvider <em>Label Provider</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.impl.TreeFillingConfigurationImpl#getLabelProviderContext <em>Label Provider Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreeFillingConfigurationImpl extends StyledElementImpl implements TreeFillingConfiguration {
	/**
	 * The cached value of the '{@link #getAxisUsedAsAxisProvider() <em>Axis Used As Axis Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAxisUsedAsAxisProvider()
	 * @generated
	 * @ordered
	 */
	protected IAxis axisUsedAsAxisProvider;

	/**
	 * The cached value of the '{@link #getPasteConfiguration() <em>Paste Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getPasteConfiguration()
	 * @generated
	 * @ordered
	 */
	protected PasteEObjectConfiguration pasteConfiguration;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected int depth = DEPTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabelProvider() <em>Label Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLabelProvider()
	 * @generated
	 * @ordered
	 */
	protected ILabelProviderConfiguration labelProvider;

	/**
	 * The default value of the '{@link #getLabelProviderContext() <em>Label Provider Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLabelProviderContext()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_PROVIDER_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelProviderContext() <em>Label Provider Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getLabelProviderContext()
	 * @generated
	 * @ordered
	 */
	protected String labelProviderContext = LABEL_PROVIDER_CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TreeFillingConfigurationImpl() {
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
		return NattableaxisconfigurationPackage.Literals.TREE_FILLING_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public IAxis getAxisUsedAsAxisProvider() {
		return axisUsedAsAxisProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetAxisUsedAsAxisProvider(IAxis newAxisUsedAsAxisProvider, NotificationChain msgs) {
		IAxis oldAxisUsedAsAxisProvider = axisUsedAsAxisProvider;
		axisUsedAsAxisProvider = newAxisUsedAsAxisProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER, oldAxisUsedAsAxisProvider, newAxisUsedAsAxisProvider);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAxisUsedAsAxisProvider(IAxis newAxisUsedAsAxisProvider) {
		if (newAxisUsedAsAxisProvider != axisUsedAsAxisProvider) {
			NotificationChain msgs = null;
			if (axisUsedAsAxisProvider != null) {
				msgs = ((InternalEObject) axisUsedAsAxisProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER, null, msgs);
			}
			if (newAxisUsedAsAxisProvider != null) {
				msgs = ((InternalEObject) newAxisUsedAsAxisProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER, null, msgs);
			}
			msgs = basicSetAxisUsedAsAxisProvider(newAxisUsedAsAxisProvider, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER, newAxisUsedAsAxisProvider, newAxisUsedAsAxisProvider));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PasteEObjectConfiguration getPasteConfiguration() {
		if (pasteConfiguration != null && pasteConfiguration.eIsProxy()) {
			InternalEObject oldPasteConfiguration = (InternalEObject) pasteConfiguration;
			pasteConfiguration = (PasteEObjectConfiguration) eResolveProxy(oldPasteConfiguration);
			if (pasteConfiguration != oldPasteConfiguration) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__PASTE_CONFIGURATION, oldPasteConfiguration, pasteConfiguration));
				}
			}
		}
		return pasteConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public PasteEObjectConfiguration basicGetPasteConfiguration() {
		return pasteConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPasteConfiguration(PasteEObjectConfiguration newPasteConfiguration) {
		PasteEObjectConfiguration oldPasteConfiguration = pasteConfiguration;
		pasteConfiguration = newPasteConfiguration;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__PASTE_CONFIGURATION, oldPasteConfiguration, pasteConfiguration));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDepth(int newDepth) {
		int oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__DEPTH, oldDepth, depth));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ILabelProviderConfiguration getLabelProvider() {
		if (labelProvider != null && labelProvider.eIsProxy()) {
			InternalEObject oldLabelProvider = (InternalEObject) labelProvider;
			labelProvider = (ILabelProviderConfiguration) eResolveProxy(oldLabelProvider);
			if (labelProvider != oldLabelProvider) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER, oldLabelProvider, labelProvider));
				}
			}
		}
		return labelProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ILabelProviderConfiguration basicGetLabelProvider() {
		return labelProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLabelProvider(ILabelProviderConfiguration newLabelProvider) {
		ILabelProviderConfiguration oldLabelProvider = labelProvider;
		labelProvider = newLabelProvider;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER, oldLabelProvider, labelProvider));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getLabelProviderContext() {
		return labelProviderContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setLabelProviderContext(String newLabelProviderContext) {
		String oldLabelProviderContext = labelProviderContext;
		labelProviderContext = newLabelProviderContext;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER_CONTEXT, oldLabelProviderContext, labelProviderContext));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER:
			return basicSetAxisUsedAsAxisProvider(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER:
			return getAxisUsedAsAxisProvider();
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__PASTE_CONFIGURATION:
			if (resolve) {
				return getPasteConfiguration();
			}
			return basicGetPasteConfiguration();
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__DEPTH:
			return getDepth();
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER:
			if (resolve) {
				return getLabelProvider();
			}
			return basicGetLabelProvider();
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER_CONTEXT:
			return getLabelProviderContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER:
			setAxisUsedAsAxisProvider((IAxis) newValue);
			return;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__PASTE_CONFIGURATION:
			setPasteConfiguration((PasteEObjectConfiguration) newValue);
			return;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__DEPTH:
			setDepth((Integer) newValue);
			return;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER:
			setLabelProvider((ILabelProviderConfiguration) newValue);
			return;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER_CONTEXT:
			setLabelProviderContext((String) newValue);
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
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER:
			setAxisUsedAsAxisProvider((IAxis) null);
			return;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__PASTE_CONFIGURATION:
			setPasteConfiguration((PasteEObjectConfiguration) null);
			return;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__DEPTH:
			setDepth(DEPTH_EDEFAULT);
			return;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER:
			setLabelProvider((ILabelProviderConfiguration) null);
			return;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER_CONTEXT:
			setLabelProviderContext(LABEL_PROVIDER_CONTEXT_EDEFAULT);
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
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__AXIS_USED_AS_AXIS_PROVIDER:
			return axisUsedAsAxisProvider != null;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__PASTE_CONFIGURATION:
			return pasteConfiguration != null;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__DEPTH:
			return depth != DEPTH_EDEFAULT;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER:
			return labelProvider != null;
		case NattableaxisconfigurationPackage.TREE_FILLING_CONFIGURATION__LABEL_PROVIDER_CONTEXT:
			return LABEL_PROVIDER_CONTEXT_EDEFAULT == null ? labelProviderContext != null : !LABEL_PROVIDER_CONTEXT_EDEFAULT.equals(labelProviderContext);
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
		result.append(" (depth: "); //$NON-NLS-1$
		result.append(depth);
		result.append(", labelProviderContext: "); //$NON-NLS-1$
		result.append(labelProviderContext);
		result.append(')');
		return result.toString();
	}

} // TreeFillingConfigurationImpl
