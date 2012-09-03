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

import org.eclipse.emf.facet.infra.browser.uicore.CustomizationManager;
import org.eclipse.emf.facet.infra.browser.uicore.internal.AppearanceConfiguration;

/**
 * Ugly hack..... It is cool to have made a factory for the items,
 * but not cool at all to have no way of overriding it........
 * 
 * @author mvelten
 *
 */
public class PapyrusCustomizationManager extends CustomizationManager {
	
    protected static final Field appearanceConfigurationField;

	static {
		try {
			appearanceConfigurationField = CustomizationManager.class.getDeclaredField("appearanceConfiguration");
			appearanceConfigurationField.setAccessible(true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public PapyrusCustomizationManager() {
		try {
			appearanceConfigurationField.set(this, new PapyrusAppearanceConfiguration());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public AppearanceConfiguration getAppearanceConfiguration() {
	    try
        {
            return (AppearanceConfiguration) appearanceConfigurationField.get(this);
        }
        catch (IllegalArgumentException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	    return null;
	}
}
