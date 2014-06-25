/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Saadia DHOUIB (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package com.cea.qompass.architect.optimization.ui.handler;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.Type;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.builders.CombinedPopupAndViewBuilder;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.builders.NotificationBuilder;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;
import com.cea.qompass.architect.optimization.codegen.main.Generate_data;


// TODO: Auto-generated Javadoc
/**
 * The Class AcceleoRTMapsCodeGenerator.
 */
public class AcceleoOptimizationCodeGenerator {

	/** The input model for the acceleo generator. */
	private EObject generationInputModel;

	/** the rtmaps source folder. */
	private File rtmapsTargetFolder;

	/**
	 * Instantiates a new acceleo rt maps code generator.
	 */
	public AcceleoOptimizationCodeGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	/**
	 * Run acceleo transformation.
	 * 
	 * @param generationInputModel
	 *        the generation input model
	 * @param rtmapsTargetFolderPath
	 *        the rtmaps target folder path
	 */
	public void runAcceleoTransformation(EObject generationInputModel, String rtmapsTargetFolderPath) {
		this.generationInputModel = generationInputModel;
		this.rtmapsTargetFolder = new File(rtmapsTargetFolderPath);
		if(this.generationInputModel != null && this.rtmapsTargetFolder != null) {
			try {

				File targetFolder = FileUtil.getWorkspaceFile(rtmapsTargetFolderPath); //$NON-NLS-1$ //$NON-NLS-2$
				if(!targetFolder.getParentFile().exists()) {
					targetFolder.getParentFile().mkdirs();
				}
				//Instantiate a new acceleo generator 
				Generate_data generate = new Generate_data(this.generationInputModel, targetFolder, Collections.EMPTY_LIST);

				generate.doGenerate(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			new NotificationBuilder().setBuilderClass(CombinedPopupAndViewBuilder.class).setType(Type.ERROR).setTitle("Acceleo genration error").setMessage("You have to set the parameters of the generation").run();
		}

	}

}
