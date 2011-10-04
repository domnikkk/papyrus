/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.blocks.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.papyrus.sysml.blocks.util.BlocksAdapterFactory;
import org.eclipse.papyrus.sysml.edit.provider.IComposableAdapterFactory;
import org.eclipse.papyrus.sysml.edit.provider.IRootAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class BlocksItemProviderAdapterFactory extends BlocksAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IComposableAdapterFactory, IDisposable {

	/**
	 * Get the root adapter factory ( SysMLOverULM layer )
	 * 
	 * @generated
	 */
	protected IRootAdapterFactory rootAdapterFactory;

	/**
	 * {@link this#rootAdapterFactory}
	 * 
	 * @generated
	 */
	public IRootAdapterFactory getIRootAdapterFactory() {
		return rootAdapterFactory;
	}

	/**
	 * {@link this#rootAdapterFactory}
	 * 
	 * @generated
	 */
	public void setRootAdapterFactory(IRootAdapterFactory root) {
		if(root instanceof IRootAdapterFactory) {
			rootAdapterFactory = (IRootAdapterFactory)root;
		} else {
			throw new RuntimeException(root + " do not implement IRootAdapterFactory");
		}
	}

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public BlocksItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml.blocks.Block} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BlockItemProvider blockItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml.blocks.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createBlockAdapter() {
		if(blockItemProvider == null) {
			blockItemProvider = new BlockItemProvider(this);
		}

		return blockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml.blocks.DistributedProperty} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DistributedPropertyItemProvider distributedPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml.blocks.DistributedProperty}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createDistributedPropertyAdapter() {
		if(distributedPropertyItemProvider == null) {
			distributedPropertyItemProvider = new DistributedPropertyItemProvider(this);
		}

		return distributedPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml.blocks.Dimension} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DimensionItemProvider dimensionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml.blocks.Dimension}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createDimensionAdapter() {
		if(dimensionItemProvider == null) {
			dimensionItemProvider = new DimensionItemProvider(this);
		}

		return dimensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml.blocks.Unit} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UnitItemProvider unitItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml.blocks.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createUnitAdapter() {
		if(unitItemProvider == null) {
			unitItemProvider = new UnitItemProvider(this);
		}

		return unitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml.blocks.ValueType} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueTypeItemProvider valueTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml.blocks.ValueType}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createValueTypeAdapter() {
		if(valueTypeItemProvider == null) {
			valueTypeItemProvider = new ValueTypeItemProvider(this);
		}

		return valueTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml.blocks.NestedConnectorEnd} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NestedConnectorEndItemProvider nestedConnectorEndItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml.blocks.NestedConnectorEnd}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createNestedConnectorEndAdapter() {
		if(nestedConnectorEndItemProvider == null) {
			nestedConnectorEndItemProvider = new NestedConnectorEndItemProvider(this);
		}

		return nestedConnectorEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml.blocks.ParticipantProperty} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ParticipantPropertyItemProvider participantPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml.blocks.ParticipantProperty}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createParticipantPropertyAdapter() {
		if(participantPropertyItemProvider == null) {
			participantPropertyItemProvider = new ParticipantPropertyItemProvider(this);
		}

		return participantPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml.blocks.ConnectorProperty} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConnectorPropertyItemProvider connectorPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml.blocks.ConnectorProperty}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createConnectorPropertyAdapter() {
		if(connectorPropertyItemProvider == null) {
			connectorPropertyItemProvider = new ConnectorPropertyItemProvider(this);
		}

		return connectorPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml.blocks.BindingConnector} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BindingConnectorItemProvider bindingConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml.blocks.BindingConnector}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createBindingConnectorAdapter() {
		if(bindingConnectorItemProvider == null) {
			bindingConnectorItemProvider = new BindingConnectorItemProvider(this);
		}

		return bindingConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrus.sysml.blocks.PropertySpecificType} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PropertySpecificTypeItemProvider propertySpecificTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrus.sysml.blocks.PropertySpecificType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createPropertySpecificTypeAdapter() {
		if(propertySpecificTypeItemProvider == null) {
			propertySpecificTypeItemProvider = new PropertySpecificTypeItemProvider(this);
		}

		return propertySpecificTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if(isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if(!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if(parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		if(blockItemProvider != null)
			blockItemProvider.dispose();
		if(distributedPropertyItemProvider != null)
			distributedPropertyItemProvider.dispose();
		if(dimensionItemProvider != null)
			dimensionItemProvider.dispose();
		if(unitItemProvider != null)
			unitItemProvider.dispose();
		if(valueTypeItemProvider != null)
			valueTypeItemProvider.dispose();
		if(nestedConnectorEndItemProvider != null)
			nestedConnectorEndItemProvider.dispose();
		if(participantPropertyItemProvider != null)
			participantPropertyItemProvider.dispose();
		if(connectorPropertyItemProvider != null)
			connectorPropertyItemProvider.dispose();
		if(bindingConnectorItemProvider != null)
			bindingConnectorItemProvider.dispose();
		if(propertySpecificTypeItemProvider != null)
			propertySpecificTypeItemProvider.dispose();
	}

}
