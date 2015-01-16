/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.eclipse.project.editors.file;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.papyrus.eclipse.project.editors.Activator;
import org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor;
import org.eclipse.papyrus.eclipse.project.editors.project.ProjectEditor;

public class ManifestEditor extends ProjectEditor implements IManifestEditor {

	// string constants
	private static final String CRNL = "\r\n"; //$NON-NLS-1$

	private static final String CRNLSP = "\r\n "; //$NON-NLS-1$

	private static final String SEMICOLON = ";"; //$NON-NLS-1$

	private static final String COMMA = ","; //$NON-NLS-1$

	private static final String ASSIGN = "="; //$NON-NLS-1$

	private static final String BUNDLE_SYMBOLIC_NAME = "bundle-symbolicName"; //$NON-NLS-1$

	private static final String SINGLETON = "singleton:="; //$NON-NLS-1$

	/** the manifest file */
	private IFile manifestFile;

	/** the manifest itself */
	private Manifest manifest;

	/**
	 *
	 * Constructor.
	 *
	 * @param project
	 * @throws IOException
	 * @throws CoreException
	 */
	public ManifestEditor(final IProject project) throws IOException, CoreException {
		super(project);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#initOk()
	 *
	 *      {@inheritDoc}
	 */
	public boolean initOk() {
		return (manifest != null) && (manifestFile != null);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#addDependency(java.lang.String)
	 *
	 *      {@inheritDoc}
	 */
	public void addDependency(final String dependency) {
		addDependency(dependency, null);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.project.ProjectEditor#init()
	 *
	 *      {@inheritDoc}
	 */
	@Override
	public void init() {
		super.init();
		if ((this.manifest != null) && (this.manifestFile != null)) {
			return;
		}
		if (this.manifestFile == null) {
			this.manifestFile = getManifestFile();
		}
		if (this.manifestFile != null) {
			try {
				this.manifest = new Manifest(this.manifestFile.getContents());
			} catch (final IOException e) {
				Activator.log.error(e);
				// assure that exception is not silently captured (for users not examining the error log)
				throw new RuntimeException(e);
			} catch (final CoreException e) {
				Activator.log.error(e);
				// assure that exception is not silently captured (for users not examining the error log)
				throw new RuntimeException(e);
			}
		}

	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#addDependency(java.lang.String, java.lang.String)
	 *
	 *      {@inheritDoc}
	 */
	public void addDependency(final String dependency, final String version) {
		final Name rqBundle = new Name(REQUIRED_BUNDLE);
		String requireBundle = this.manifest.getMainAttributes().getValue(rqBundle);

		// TODO : Improve the detection of existing dependency
		// If a.b.c exists, then a.b cannot be added (Because it is already contained)
		// Moreover, the Manifest allows newlines anywhere (Including in the
		// middle of a word) : check if these newlines appear in this map,
		// or if they have already been parsed. If the manifest value is copied as-is in the map,
		// then we need to take care of newlines when parsing it

		if (requireBundle == null) {
			requireBundle = dependency;
			if (version != null) {
				requireBundle += SEMICOLON + version;
			}
		} else if (!requireBundle.contains(dependency)) {
			requireBundle += COMMA + dependency;
			if (version != null) {
				requireBundle += SEMICOLON + version;
			}
		}

		this.manifest.getMainAttributes().put(rqBundle, requireBundle);
	}

	public void setDependenciesVersion(final String dependencyPattern, final String newVersion) {
		final Name rqBundle = new Name(REQUIRED_BUNDLE);
		final String requireBundles = this.manifest.getMainAttributes().getValue(rqBundle);
		final String[] bundles = requireBundles.split(COMMA);
		String newRequiredBundles = ""; //$NON-NLS-1$
		for (int ii = 0; ii < bundles.length; ii++) {// we iterate on the declared dependencies
			final String currentDependency = bundles[ii];
			final String[] dependencyValue = currentDependency.split(SEMICOLON);
			if (dependencyValue[0].contains(dependencyPattern)) {
				final String newBundleVersion = BUNDLE_VERSION + ASSIGN + '"' + newVersion + '"';
				newRequiredBundles += dependencyValue[0] + SEMICOLON + newBundleVersion;
				for (int i = 1; i < dependencyValue.length; i++) {
					final String declaration = dependencyValue[i];
					if (declaration.contains(BUNDLE_VERSION + ASSIGN)) {
						// we ignore it
					} else {
						newRequiredBundles += SEMICOLON + dependencyValue[i];// we add the others declaration
					}
				}
			} else {
				newRequiredBundles += currentDependency;// we copy the existing declaration
			}
			if (ii < (bundles.length - 1)) {
				newRequiredBundles += COMMA;
			}
		}
		setValue(REQUIRED_BUNDLE, newRequiredBundles);

	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#setValue(java.lang.String, java.lang.String)
	 *
	 *      {@inheritDoc}
	 */
	public void setValue(final String key, final String value) {
		setValue(key, "", value); //$NON-NLS-1$
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#setValue(java.lang.String, java.lang.String, java.lang.String)
	 *
	 *      {@inheritDoc}
	 */
	public void setValue(final String key, final String name, final String value) {
		this.manifest.getMainAttributes().putValue(key, value);
		// this.manifest.getAttributes(key).put(name, value);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#removeValue(java.lang.String, java.lang.String)
	 *
	 *      {@inheritDoc}
	 */
	public void removeValue(final String key, final String value) {

	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#removeValue(java.lang.String)
	 *
	 *      {@inheritDoc}
	 */
	public void removeValue(final String key) {
		this.manifest.getAttributes(key).remove(key);
	}

	/**
	 *
	 * @return
	 */
	private IFile getManifestFile() {
		final IFile manifest = getProject().getFile("META-INF/MANIFEST.MF"); //$NON-NLS-1$
		if (manifest.exists()) {
			return manifest;
		}
		return null;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.project.AbstractProjectEditor#exists()
	 *
	 *      {@inheritDoc}
	 */
	@Override
	public boolean exists() {
		return super.exists() && (getManifestFile() != null) && (getSymbolicBundleName() != null) && (getBundleVersion() != null);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.project.ProjectEditor#save()
	 *
	 *      {@inheritDoc}
	 */
	@Override
	public void save() {

		final ByteArrayOutputStream os = new ByteArrayOutputStream();

		try {
			this.manifest.write(os);

			final StringReader reader = new StringReader(format(os.toString("UTF-8"))); //$NON-NLS-1$
			this.manifestFile.setContents(new InputStream() {

				@Override
				public int read() throws IOException {
					return reader.read();
				}
			}, true, true, null);

		} catch (final IOException ex) {
			Activator.log.error(ex);
		} catch (final CoreException ex) {
			Activator.log.error(ex);
		}
	}

	/**
	 * Simple formatting of the MANIFEST. Do not use the PDE formatter, since this makes an already opened
	 * MANIFEST editor dirty (see bug 447548 [OCL for Papyrus] Buggy DSML plugin generator)
	 */
	protected String format(String text) {
		// 1. undo 72safe formatting
		String[] lines = text.split(CRNLSP);
		String non72safe = ""; //$NON-NLS-1$
		for (String line : lines) {
			non72safe += line;
		}
		// 2. split lines on comma
		lines = non72safe.split(COMMA);
		String newText = ""; //$NON-NLS-1$
		for (int i = 0; i < lines.length; i++) {
			newText += lines[i].trim();
			if (i < lines.length - 1) {
				newText += COMMA + CRNLSP;
			}
		}
		return newText + CRNL;
	}

	@Override
	public Set<String> getMissingFiles() {
		final Set<String> files = super.getMissingFiles();
		final IFile classpath = getProject().getFile(MANIFEST_PATH);
		if (!classpath.exists()) {
			files.add(MANIFEST_PATH);
		}
		return files;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.project.ProjectEditor#createFiles(java.util.Set)
	 *
	 *      {@inheritDoc}
	 */
	@Override
	public void createFiles(final Set<String> files) {
		if (files.contains(MANIFEST_PATH)) {
			this.manifestFile = getProject().getFile(MANIFEST_PATH);
			if (!this.manifestFile.exists()) {
				try {
					final String input = "Manifest-Version: 1.0\n"; //without the "/n", it doesn't work!!!!! //$NON-NLS-1$
					if (!this.manifestFile.getParent().exists()) {
						final IContainer parent = this.manifestFile.getParent();
						if (parent instanceof IFolder) {
							if (!parent.exists()) {
								((IFolder) parent).create(true, false, null);
							}
						}
					}
					this.manifestFile.create(getInputStream(input), true, null);
					this.manifestFile = getProject().getFile(MANIFEST_PATH);

					this.manifest = new Manifest(this.manifestFile.getContents());

					// final int i;
					// InputStream is = this.manifestFile.getContents();
					// while((i = is.read()) > 0) {
					// System.out.println(i);
					// }
					// this.manifest = new Manifest(this.manifestFile.getContents());

				} catch (final CoreException ex) {
					Activator.log.error(ex);
				} catch (final IOException e) {
					Activator.log.error(e);
				}

			}
		}

		if (getSymbolicBundleName() == null) {
			setSymbolicBundleName(getProject().getName());
		}

		if (getBundleVersion() == null) {
			setBundleVersion("0.0.1"); //$NON-NLS-1$
		}
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#setSymbolicBundleName(java.lang.String)
	 *
	 *      {@inheritDoc}
	 */
	public void setSymbolicBundleName(String newName) {
		if (newName == null) {
			newName = "noName"; //$NON-NLS-1$
		}
		final Name symbolicName = new Name(BUNDLE_SYMBOLIC_NAME);
		this.manifest.getMainAttributes().put(symbolicName, newName);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#getSymbolicBundleName()
	 *
	 *      {@inheritDoc}
	 */
	public String getSymbolicBundleName() {
		if (this.manifest != null) {
			final Name symbolicName = new Name(BUNDLE_SYMBOLIC_NAME);
			final String name = this.manifest.getMainAttributes().getValue(symbolicName);
			int semiColon = name.indexOf(SEMICOLON);
			if (semiColon != -1) {
				return name.substring(0, semiColon);
			}
			else {
				return name;
			}
		}
		return null;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#getBundleVersion()
	 *
	 *      {@inheritDoc}
	 */
	public String getBundleVersion() {
		if (this.manifest != null) {
			final Name symbolicName = new Name(BUNDLE_VERSION);
			final String version = this.manifest.getMainAttributes().getValue(symbolicName);
			return version;
		}
		return null;
	}

	/**
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#setBundleVersion(java.lang.String)
	 *
	 *      {@inheritDoc}
	 */
	public void setBundleVersion(final String version) {
		if (this.manifest != null) {
			final Name bundleVersion = new Name(BUNDLE_VERSION);
			if (version == null) {
				this.manifest.getMainAttributes().remove(bundleVersion);
			} else {
				this.manifest.getMainAttributes().put(bundleVersion, version);
			}
		}
	}

	/**
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#getBundleVendor()
	 *
	 *      {@inheritDoc}
	 */
	public String getBundleVendor() {
		if (this.manifest != null) {
			final Name bundleVendor = new Name(BUNDLE_VENDOR);
			return this.manifest.getMainAttributes().getValue(bundleVendor);
		}
		return null;
	}

	/**
	 * @see org.eclipse.papyrus.eclipse.project.editors.interfaces.IManifestEditor#setBundleVendor(java.lang.String)
	 *
	 *      {@inheritDoc}
	 */
	public void setBundleVendor(final String vendor) {
		if (this.manifest != null) {
			final Name bundleVendor = new Name(BUNDLE_VENDOR);
			if (vendor == null) {
				this.manifest.getMainAttributes().remove(bundleVendor);
			} else {
				this.manifest.getMainAttributes().put(bundleVendor, vendor);
			}
		}
	}

	public String getValue(final String key) {
		if (this.manifest != null) {
			String value = this.manifest.getMainAttributes().getValue(key);
			if (value == null) {
				final Attributes attributes = this.manifest.getAttributes(key);
				if (attributes != null) {
					value = attributes.getValue(key);
				}
			}
			return value;
		}
		return null;
	}

	public String getBundleName() {
		if (this.manifest != null) {
			final Name bundleName = new Name(BUNDLE_NAME);
			final String name = this.manifest.getMainAttributes().getValue(bundleName);
			return name;
		}
		return null;
	}

	public void setBundleName(String newName) {
		if (newName == null) {
			newName = "noName"; //$NON-NLS-1$
		}
		final Name bundleNameName = new Name(BUNDLE_SYMBOLIC_NAME);
		this.manifest.getMainAttributes().put(bundleNameName, newName);

	}

	public String getBundleLocalization() {
		if (this.manifest != null) {
			final Name bundleLocalization = new Name(BUNDLE_LOCALIZATION);
			final String name = this.manifest.getMainAttributes().getValue(bundleLocalization);
			return name;
		}
		return null;
	}

	public void setSingleton(final boolean singleton) {
		String value = this.manifest.getMainAttributes().getValue(BUNDLE_SYMBOLIC_NAME);
		final String[] directives = value.split(SEMICOLON);

		if (directives.length == 0) {
			return; // This should not happen if the Manifest is well-formed
		} else {
			value = directives[0];
			boolean isDefined = false;
			for (int i = 1; i < directives.length; i++) {
				String directive = directives[i];
				if (directive.startsWith(SINGLETON)) {
					directive = SINGLETON + singleton;
					isDefined = true;
				}
				value += SEMICOLON + directive;
			}
			if (!isDefined) {
				value += SEMICOLON + SINGLETON + singleton;
			}
		}

		this.manifest.getMainAttributes().putValue(BUNDLE_SYMBOLIC_NAME, value);
	}
}
