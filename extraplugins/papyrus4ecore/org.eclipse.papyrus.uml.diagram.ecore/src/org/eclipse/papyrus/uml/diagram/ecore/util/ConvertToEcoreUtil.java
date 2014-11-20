/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi benoit.maggi@cea.fr  - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.ecore.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.utils.DiResourceSet;
import org.eclipse.papyrus.infra.onefile.providers.PapyrusLabelProvider;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * 
 * Utility class to convert uml to ecore
 * @author Benoit Maggi
 *
 */
public class ConvertToEcoreUtil {

	/**
	 * A utily class should'nt be instancied
	 */
	private ConvertToEcoreUtil() {} 

	/**
	 * Convert the uml package and its contents to ecore
	 * @param package_
	 * @param options
	 */
	public static boolean convertToEcore(Package package_, Map<String, String> options) {
		final BasicDiagnostic diagnostics = new BasicDiagnostic(UMLValidator.DIAGNOSTIC_SOURCE, 0, EcorePlugin.INSTANCE.getString("_UI_DiagnosticRoot_diagnostic", //$NON-NLS-1$
			new Object[]{ package_.getName() }), new Object[]{ package_ });
		Map<Object, Object> context = new HashMap<Object, Object>();
		context.put(UML2Util.QualifiedTextProvider.class, qualifiedTextProvider);
		return convertToEcore(package_, context, diagnostics, options);
	}

	/**
	 * Convert the uml package and its contents to ecore
	 * @param package_
	 * @param context
	 * @param diagnostics
	 * @param options
	 */
	public static boolean convertToEcore(Package package_, Map<Object, Object> context, BasicDiagnostic diagnostics, Map<String, String> options) {
		Resource resource = package_.eResource();
		ResourceSet resourceSet = resource.getResourceSet();
		URI uri = resourceSet.getURIConverter().normalize(resource.getURI()).trimFileExtension().trimSegments(1);
		List<Resource> resources = new ArrayList<Resource>();
		ModelSet modelSet = new DiResourceSet();
		for(EPackage ePackage : UMLUtil.convertToEcore(package_, options, diagnostics, context)) {
			URI appendSegment = uri.appendSegment(ePackage.getName());
			URI appendFileExtension = appendSegment.appendFileExtension(EcoreEditor.ECORE_FILE_EXTENSION);
			resource = modelSet.createResource(appendFileExtension);
			resources.add(resource);
			resource.getContents().add(ePackage);
		}
		
		for(Resource r : resources) {
			try {
				r.save(null);
			} catch (Exception e) {
				UMLExamplesUIPlugin.INSTANCE.log(e);
			}
		}
		return diagnostics.getSeverity() == BasicDiagnostic.OK;
	}
	
	protected final static UMLUtil.QualifiedTextProvider qualifiedTextProvider = new UMLUtil.QualifiedTextProvider() {

		PapyrusLabelProvider papyrusLabelProvider= new PapyrusLabelProvider();
		
		@Override
		public String getFeatureText(EStructuralFeature eStructuralFeature) {
			return getLabelProvider().getText(eStructuralFeature);
		}

		public PapyrusLabelProvider getLabelProvider() {
			return papyrusLabelProvider;
		}

		@Override
		public String getClassText(EObject eObject) {
			return getLabelProvider().getText(eObject.eClass());
		}
	};
	
}
