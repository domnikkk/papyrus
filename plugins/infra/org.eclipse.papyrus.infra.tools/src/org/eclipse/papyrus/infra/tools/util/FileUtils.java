/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.infra.tools.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

import org.eclipse.core.runtime.Assert;
import org.eclipse.papyrus.infra.tools.Activator;

/**
 * @author VL222926
 *
 */
public class FileUtils {

	public static final String PLATFORM_STRING = "platform"; //$NON-NLS-1$

	public static final String PLUGIN_STRING = "plugin"; //$NON-NLS-1$

	public static final String SLASH_STRING = "/"; //$NON-NLS-1$

	public static final String COLON_STRING = ":"; //$NON-NLS-1$

	public static final String DOT_STRING = ".";//$NON-NLS-1$

	public static final String TEXT_EXTENSION = "txt";//$NON-NLS-1$

	public static final String CSV_EXTENSIOn = "csv";//$NON-NLS-1$

	private FileUtils() {
		// to prevent instanciation
	}

	/**
	 * 
	 * @param pluginName
	 *            the name of the plugin owning the file
	 * @param filePath
	 *            the path of the file
	 * @param fileNameWithExtension
	 *            the name fo the file with its extension
	 * @return
	 */
	public static final String getStringFromPlatformFile(final String pluginName, final String filePath, final String fileNameWithExtension) {
		Assert.isNotNull(pluginName);
		Assert.isNotNull(filePath);
		Assert.isNotNull(fileNameWithExtension);
		StringBuilder pathBuilder = new StringBuilder();
		pathBuilder.append(PLATFORM_STRING);
		pathBuilder.append(COLON_STRING);
		pathBuilder.append(SLASH_STRING);
		pathBuilder.append(PLUGIN_STRING);
		pathBuilder.append(SLASH_STRING);
		pathBuilder.append(pluginName);
		if (!filePath.startsWith(SLASH_STRING)) {
			pathBuilder.append(SLASH_STRING);
		}
		pathBuilder.append(filePath);
		if (!filePath.endsWith(SLASH_STRING)) {
			pathBuilder.append(SLASH_STRING);
		}
		pathBuilder.append(fileNameWithExtension);
		StringBuilder builder = new StringBuilder();
		URL url;
		try {
			url = new URL(pathBuilder.toString());
			InputStream inputStream = url.openConnection().getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				builder.append(inputLine);
				builder.append(System.getProperty("line.separator")); //$NON-NLS-1$
			}

			in.close();

		} catch (IOException e) {
			Activator.log.error(e);
		}
		return builder.toString();
	}
}
