/**
 * Copyright (c) 2007, 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 * 	  Gabriel Pascual (ALL4TEC) -  Bug 372322
 */
package aspects.xpt.diagram.updater

import com.google.inject.Singleton
import org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater

@Singleton class Extensions extends xpt.diagram.updater.extensions{
	
	override def extensions(GenDiagramUpdater it) {
		// Override Refresh contribution
	}
	
}

