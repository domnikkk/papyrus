/**
 * Copyright (c) 2014 Christian W. Damus and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 */
package org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ApplyProfiles;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.ProfileExternalizationPackage;
import org.eclipse.papyrus.uml.decoratormodel.profileExternalization.internal.operations.ApplyProfilesOperations;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Profile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Profiles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.uml.decoratormodel.profileExternalization.impl.ApplyProfilesImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyProfilesImpl extends MinimalEObjectImpl.Container implements ApplyProfiles
{
	/**
	 * The cached value of the '{@link #getBase_Dependency() <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Dependency()
	 * @generated
	 * @ordered
	 */
	protected Dependency base_Dependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ApplyProfilesImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ProfileExternalizationPackage.Literals.APPLY_PROFILES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Dependency getBase_Dependency()
	{
		if (base_Dependency != null && base_Dependency.eIsProxy())
		{
			InternalEObject oldBase_Dependency = (InternalEObject) base_Dependency;
			base_Dependency = (Dependency) eResolveProxy(oldBase_Dependency);
			if (base_Dependency != oldBase_Dependency)
			{
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfileExternalizationPackage.APPLY_PROFILES__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
				}
			}
		}
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Dependency basicGetBase_Dependency()
	{
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Dependency(Dependency newBase_Dependency)
	{
		Dependency oldBase_Dependency = base_Dependency;
		base_Dependency = newBase_Dependency;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ProfileExternalizationPackage.APPLY_PROFILES__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Profile> getAppliedProfiles()
	{
		return ApplyProfilesOperations.getAppliedProfiles(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<org.eclipse.uml2.uml.Package> getExternalizedAppliedProfilePackages()
	{
		return ApplyProfilesOperations.getExternalizedAppliedProfilePackages(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case ProfileExternalizationPackage.APPLY_PROFILES__BASE_DEPENDENCY:
			if (resolve) {
				return getBase_Dependency();
			}
			return basicGetBase_Dependency();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case ProfileExternalizationPackage.APPLY_PROFILES__BASE_DEPENDENCY:
			setBase_Dependency((Dependency) newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case ProfileExternalizationPackage.APPLY_PROFILES__BASE_DEPENDENCY:
			setBase_Dependency((Dependency) null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case ProfileExternalizationPackage.APPLY_PROFILES__BASE_DEPENDENCY:
			return base_Dependency != null;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
		case ProfileExternalizationPackage.APPLY_PROFILES___GET_APPLIED_PROFILES:
			return getAppliedProfiles();
		case ProfileExternalizationPackage.APPLY_PROFILES___GET_EXTERNALIZED_APPLIED_PROFILE_PACKAGES:
			return getExternalizedAppliedProfilePackages();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * Creates a new instance of the specified Ecore class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param eClass
	 *            The Ecore class of the instance to create.
	 * @return The new instance.
	 * @generated
	 */
	protected EObject create(EClass eClass)
	{
		return EcoreUtil.create(eClass);
	}

	/**
	 * Retrieves the cache adapter for this '<em><b>Apply Profiles</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return The cache adapter for this '<em><b>Apply Profiles</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter()
	{
		return CacheAdapter.getCacheAdapter(this);
	}

} // ApplyProfilesImpl
