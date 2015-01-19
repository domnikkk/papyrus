/*****************************************************************************
 * Copyright (c) 2014 Cedric Dumoulin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Cedric Dumoulin  Cedric.dumoulin@lifl.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.profile.drafter.tests;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.infra.core.resource.ModelMultiException;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.core.resource.sasheditor.SashModel;
import org.eclipse.papyrus.infra.core.resource.sasheditor.SashModelUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.uml.profile.drafter.tests.exception.NotFoundException;
import org.eclipse.papyrus.uml.profile.drafter.tests.exception.TestUtilsException;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;


/**
 * Class allowing to create a ModelSet, and to query object or models.
 * 
 * @author cedric dumoulin
 *
 */
public class ModelSetManager {

	
	public static int NOTATION_MODEL = 0x0001;
	public static int UML_MODEL = 0x0002;
	public static int SASH_MODEL = 0x0004;
	public static int ALL_MODEL = 0xFFFF;
	
	protected ModelSet modelSet;
	
	/**
	 * 
	 * Constructor.
	 *
	 * @param file
	 * @throws DraftProfileException
	 */
	public ModelSetManager( IFile file ) throws TestUtilsException {

		this(file, ALL_MODEL);
	}
	
	/**
	 * 
	 * Constructor.
	 *
	 * @param projectModelPath Path of the model to load. Must contains the project name.
	 * 
	 * @throws DraftProfileException
	 */
	public ModelSetManager( IFile file, int models ) throws TestUtilsException {
		URI modelUri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		try {
			loadModelSet(modelUri, models);
		} catch (ModelMultiException e) {
			throw new TestUtilsException(e);
		}
	}
	
	/**
	 * 
	 * Constructor.
	 *
	 * @param projectModelPath
	 * @throws DraftProfileException
	 */
	public ModelSetManager( String projectModelPath ) throws TestUtilsException {
		this(projectModelPath, ALL_MODEL);
	}
		
	/**
	 * 
	 * Constructor.
	 *
	 * @param projectModelPath Path of the model to load. Must contains the project name.
	 * 
	 * @throws DraftProfileException
	 */
	public ModelSetManager( String projectModelPath, int models ) throws TestUtilsException {
		URI modelUri = URI.createPlatformResourceURI(projectModelPath, true);
		try {
			loadModelSet(modelUri, models);
		} catch (ModelMultiException e) {
			throw new TestUtilsException(e);
		}
	}
	
	/**
	 * 
	 * Constructor.
	 *
	 * @param modelUri
	 * @throws DraftProfileException
	 */
	public ModelSetManager(URI modelUri) throws TestUtilsException {

		this(modelUri, ALL_MODEL);
	}
	
	/**
	 * 
	 * Constructor.
	 *
	 * @param modelUri {@link URI} of the model to load. Must contains the project name.
	 * @param models bitwise of requested models ( ex: UML_MODEL & DI_MODEL )
	 * @throws DraftProfileException
	 */
	public ModelSetManager(URI modelUri, int models) throws TestUtilsException {
		try {
			loadModelSet(modelUri, models);
		} catch (ModelMultiException e) {
			throw new TestUtilsException(e);
		}
	}
	
	/**
	 * @return the modelSet
	 */
	public ModelSet getModelSet() {
		return modelSet;
	}

	/**
	 * 
	 * @param modelUri
	 * @throws ModelMultiException
	 */
	protected void loadModelSet(URI modelUri, int models ) throws ModelMultiException {
		// Create ModelSet and Model
		modelSet = new ModelSet();
		
		// registers models
		if( (models & UML_MODEL)>1 ) {
			UmlModel umlModel = new UmlModel();
			modelSet.registerModel(umlModel);			
		}
		if( (models & NOTATION_MODEL)>1 ) {
			NotationModel notationModel = new NotationModel();
			modelSet.registerModel(notationModel);
		}
		if( (models & SASH_MODEL)>1 ) {
			DiModel diModel = new DiModel();
			modelSet.registerModel(diModel);
		}

		// Do load resources
		modelSet.loadModels(modelUri);
	}
	
	/**
	 * 
	 * @return
	 * @throws NotFoundException
	 */
	public UmlModel getUmlModel() throws NotFoundException {
		UmlModel model = UmlUtils.getUmlModel(modelSet);
		if(model == null) {
			throw new NotFoundException("UmlModel not found in ModelSet.");
		}
		return model;
	}
	
	public NotationModel getNotationModel() throws NotFoundException {
		NotationModel model = NotationUtils.getNotationModel(modelSet);
		if(model == null) {
			throw new NotFoundException("NotationModel not found in ModelSet.");
		}
		return model;
	}
	
	public SashModel getSashModel() throws NotFoundException {
		SashModel model = SashModelUtils.getSashModel(modelSet);
		if(model == null) {
			throw new NotFoundException("UmlModel not found in ModelSet.");
		}
		return model;
	}
	
	/**
	 * Get an element by its qualified name.
	 * Start search from the root model excluded.
	 * 
	 * @param qualifiedName
	 * @return
	 * @throws NotFoundException
	 */
	public NamedElement getNamedElementByName( String qualifiedName ) throws NotFoundException {
		
		UmlModel model = getUmlModel();
		Package modelRoot;
		try {
			modelRoot = (Package)model.lookupRoot();
		} catch (org.eclipse.papyrus.infra.core.resource.NotFoundException e) {
			throw new NotFoundException("Can't find model root", e);
		}

		return getNamedElementByName(modelRoot, qualifiedName);		
	}
	
	/**
	 * Get a named element by its qualified name. Lookup from the specified {@link Namespace} excluded.
	 * 
	 * @param namespace The namespace from which lookup is started. first segment of qualified name is searched inside this namespace.
	 * 
	 * @param qualifiedName The name of the element searched
	 * @return The requested element
	 * @throws NotFoundException If the element is not found.
	 */
	public NamedElement getNamedElementByName( Namespace namespace, String qualifiedName ) throws NotFoundException {
		if( qualifiedName == null || qualifiedName.length() == 0) {
			throw new NotFoundException("QualifiedName is empty"); 
		}

		String path[] = qualifiedName.split("::");

		NamedElement namedElement = namespace;
		for( int i=0; i<path.length; i++) {
			// lookup subelement
			if( namedElement instanceof Package ) {
				Package p = (Package)namedElement;
				namedElement = p.getPackagedElement(path[i], true, null, false);
			}
			else if( namedElement instanceof Namespace ) {
				Namespace n = (Namespace)namedElement;
				namedElement = n.getMember(path[i], true, null);
			} 
			else {
				throw new NotFoundException("Element '" + qualifiedName + "' not found."
						+ " Element '" + namedElement.getQualifiedName() 
						+ "' do not contains '" + path[i] + "'");
			}
		}

		// Return element
		return namedElement;
	}
	
	/**
	 * Dispose the ModelSet.
	 * Object should not be used anymore after dispose.
	 */
	public void dispose() {
		if(modelSet != null) {
			modelSet.unload();
			modelSet = null;
		}
	}
}
