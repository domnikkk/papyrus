/**
 * Copyright (c) 2012 CEA LIST.
 * 
 *     
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * ttp://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) Vincent.Lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.table.papyrustableconfiguration.metamodel.papyrustableconfiguration.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.provider.CustomEditPlugin;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.provider.Efacet2EditPlugin;
import org.eclipse.emf.facet.widgets.celleditors.edit.CelleditorsEditPlugin;
import org.eclipse.papyrus.infra.table.metamodel.papyrustable.provider.PapyrustableEditPlugin;

/**
 * This is the central singleton for the Papyrustableconfiguration edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class PapyrustableconfigurationEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PapyrustableconfigurationEditPlugin INSTANCE = new PapyrustableconfigurationEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PapyrustableconfigurationEditPlugin() {
		super
		  (new ResourceLocator [] {
		     CelleditorsEditPlugin.INSTANCE,
		     CustomEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		     Efacet2EditPlugin.INSTANCE,
		     PapyrustableEditPlugin.INSTANCE,
		     //not necessary (and not visible from EMF-facet
//		     TableConfigurationEditPlugin.INSTANCE,
//		     Tableinstance02EditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
