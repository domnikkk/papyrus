/*****************************************************************************
 * Copyright (c) 2012 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.modelexplorer;

import java.lang.reflect.Field;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.facet.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.emf.facet.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.emf.facet.infra.browser.uicore.internal.model.LinkItem;

/**
 * Ugly hack because original LinkItems doesn't recompute the children even if the model has changed...
 * The cachedChildren fields which can be used to force the recompute are private
 * => use of reflection with setAccessible...
 * 
 * @author mvelten
 *
 */
public class PapyrusLinkItem extends LinkItem {
	protected static final Field cachedChildrenField;
	protected static final Field cachedChildrenElementsField;

	static {
		try {
			cachedChildrenField = LinkItem.class.getDeclaredField("cachedChildren");
			cachedChildrenField.setAccessible(true);
			cachedChildrenElementsField = LinkItem.class.getDeclaredField("cachedChildrenElements");
			cachedChildrenElementsField.setAccessible(true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public PapyrusLinkItem(EObject parent, ITreeElement treeParent, EReference reference, AppearanceConfiguration appearanceConfiguration) {
		super(parent, treeParent, reference, appearanceConfiguration);
	}

	@Override
	public List<?> getChildren() {
		try {
			cachedChildrenField.set(this, null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return super.getChildren();
	}

	@Override
	public List<Object> getChildrenElements() {
		try {
			cachedChildrenElementsField.set(this, null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return super.getChildrenElements();
	}
	
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter.isAssignableFrom(Setting.class)) {
			return new BasicSettingImpl(getParent(), getReference());
		}
		return super.getAdapter(adapter);
	}
}
