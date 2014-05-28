/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net -  Bug 435995
 *****************************************************************************/
package org.eclipse.papyrus.uml.profile.providers;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.papyrus.uml.profile.utils.Util;
import org.eclipse.papyrus.uml.tools.profile.definition.IPapyrusVersionConstants;
import org.eclipse.papyrus.uml.tools.profile.definition.Version;
import org.eclipse.papyrus.uml.tools.providers.UMLLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * Label provider for Profile application. It decorates structure returned by {@link ProfileApplicationContentProvider}.
 */
public class ProfileApplicationLabelProvider extends StyledCellLabelProvider {

	/** The Constant PACKAGE_ELEMENT_COLUMN_INDEX. */
	private static final int PACKAGE_ELEMENT_COLUMN_INDEX = 0;

	/** The Constant PROFILE_APPLICATION_UPDATE_VERSION_COLUMN_INDEX. */
	private static final int PROFILE_APPLICATION_UPDATE_VERSION_COLUMN_INDEX = 3;

	/** The Constant PROFILE_APPLICATION_NAME_COLUMN_INDEX. */
	private static final int PROFILE_APPLICATION_NAME_COLUMN_INDEX = 2;

	/** The Constant PROFILE_APPLICATION_VERSION_COLUMN_INDEX. */
	private static final int PROFILE_APPLICATION_VERSION_COLUMN_INDEX = 1;

	/** The UML label provider. */
	private final ILabelProvider umlLabelProvider = new UMLLabelProvider();


	/**
	 * Update.
	 *
	 * @param cell
	 *        the cell
	 * @see org.eclipse.jface.viewers.StyledCellLabelProvider#update(org.eclipse.jface.viewers.ViewerCell)
	 */
	@Override
	public void update(ViewerCell cell) {
		Object element = cell.getElement();
		int columnIndex = cell.getColumnIndex();

		StyledString styledText = getStyledText(element, columnIndex);

		cell.setText(styledText.getString());
		cell.setStyleRanges(styledText.getStyleRanges());
		cell.setImage(getImage(element, columnIndex));
	}

	/**
	 * Gets the styled text.
	 *
	 * @param element
	 *        the element
	 * @param columnIndex
	 *        the column index
	 * @return the styled text
	 */
	protected StyledString getStyledText(Object element, int columnIndex) {
		return  new StyledString(getText(element, columnIndex));
	}

	/**
	 * Return the last version of profile applied to UML model.
	 *
	 * @param profileApplication
	 *        the profile application
	 * @return Known applied version
	 */
	private Version extractProfileApplicationVersion(ProfileApplication profileApplication) {
		Version version = null;

		EAnnotation versionAnnotation = profileApplication.getEAnnotation(IPapyrusVersionConstants.PAPYRUS_EANNOTATION_SOURCE);
		if(versionAnnotation == null) {
			EPackage appliedDefinition = profileApplication.getAppliedDefinition();
			if(appliedDefinition != null) {
				versionAnnotation = appliedDefinition.getEAnnotation(IPapyrusVersionConstants.PAPYRUS_EANNOTATION_SOURCE);
			}
		}

		if(versionAnnotation != null) {
			String versionValue = versionAnnotation.getDetails().get(IPapyrusVersionConstants.PAPYRUS_VERSION_KEY);
			version = new Version(versionValue);
		}

		if(version == null) {
			version = Version.emptyVersion;
		}

		return version;
	}

	/**
	 * Gets the text.
	 *
	 * @param element
	 *        the element
	 * @param columnIndex
	 *        the column index
	 * @return the text
	 */
	protected String getText(Object element, int columnIndex) {
		String result = null;

		// Case 1:  Element is a Profile Application
		if(element instanceof ProfileApplication) {
			ProfileApplication profileApplication = (ProfileApplication)element;

			switch(columnIndex) {
			case PACKAGE_ELEMENT_COLUMN_INDEX:
				result = umlLabelProvider.getText(profileApplication.getAppliedProfile());
				break;
			case PROFILE_APPLICATION_VERSION_COLUMN_INDEX:
				Version profileVersion = extractProfileApplicationVersion(profileApplication);
				result = profileVersion.toString();
				break;
			case PROFILE_APPLICATION_NAME_COLUMN_INDEX:
				Profile appliedProfile = profileApplication.getAppliedProfile();
				
				if(appliedProfile == null) {
					result = "<Missing Profile>";
				} else if (appliedProfile.eIsProxy()) {
					EPackage definition = profileApplication.getAppliedDefinition();
					if(definition != null) {
						result = umlLabelProvider.getText(definition);
					} else {
						result = "<Unresolved Profile>";
					}
				} else {
					result = appliedProfile.getQualifiedName();
				}
				break;
			case PROFILE_APPLICATION_UPDATE_VERSION_COLUMN_INDEX:
				Version latestProfileVersion = Util.getProfileDefinitionVersion(profileApplication.getAppliedProfile());
				result = latestProfileVersion.toString();
				break;
			default:
				//Nothing to do
				break;
			}
		} else {
			switch(columnIndex) {
			case PACKAGE_ELEMENT_COLUMN_INDEX:
				result = umlLabelProvider.getText(element);
				break;
			default:
				//Nothing to do
				break;
			}
		}

		return (result == null) ? "" : result; //$NON-NLS-1$
	}

	/**
	 * Gets the image.
	 *
	 * @param element
	 *        the element
	 * @param columnIndex
	 *        the column index
	 * @return the image
	 */
	protected Image getImage(Object element, int columnIndex) {
		switch(columnIndex) {
		case PACKAGE_ELEMENT_COLUMN_INDEX:
			return umlLabelProvider.getImage(element);
		case PROFILE_APPLICATION_NAME_COLUMN_INDEX:
			if(element instanceof ProfileApplication) {
				return umlLabelProvider.getImage(((ProfileApplication)element).getAppliedProfile());
			}
		default:
			return null;
		}
	}

	/**
	 * @see org.eclipse.jface.viewers.StyledCellLabelProvider#dispose()
	 *
	 */
	@Override
	public void dispose() {
		umlLabelProvider.dispose();
		super.dispose();
	}
}
