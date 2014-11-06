package org.eclipse.papyrus.uml.profile.drafter.utils;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.uml.extensionpoints.Registry;
import org.eclipse.papyrus.uml.extensionpoints.library.IRegisteredLibrary;
import org.eclipse.papyrus.uml.extensionpoints.profile.IRegisteredProfile;
import org.eclipse.papyrus.uml.profile.drafter.exceptions.NotFoundException;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Package;


/**
 * A class encapsulating the UMLPrimitiveTypes library.
 * 
 * @author cedric dumoulin
 *
 */
public class UMLPrimitiveTypesModel {

	/** constant to identify the type of a Boolean property */
	public Type UMLPrimitiveTypes_BOOLEAN; 

	/** constant to identify the type of an Integer property */
	public Type UMLPrimitiveTypes_INTEGER; 

	/** constant to identify the type of a String property */
	public Type UMLPrimitiveTypes_STRING;

	/** constant to identify the type of an Unlimited Natural property */
	public Type UMLPrimitiveTypes_UNLIMITED_NATURAL;

	/** constant to identify the type of an Unlimited Natural property */
	public Type UMLPrimitiveTypes_REAL;
	
	/** constant to identify the type of a Boolean property */
	final static public String UMLPrimitiveTypes_BOOLEAN_NAME = "PrimitiveTypes::Boolean"; //$NON-NLS-1$

	/** constant to identify the type of an Integer property */
	final static public String UMLPrimitiveTypes_INTEGER_NAME = "PrimitiveTypes::Integer"; //$NON-NLS-1$

	/** constant to identify the type of a String property */
	final static public String UMLPrimitiveTypes_STRING_NAME = "PrimitiveTypes::String"; //$NON-NLS-1$

	/** constant to identify the type of an Unlimited Natural property */
	final static public String UMLPrimitiveTypes_UNLIMITED_NATURAL_NAME = "PrimitiveTypes::UnlimitedNatural"; //$NON-NLS-1$

	/** constant to identify the type of an Unlimited Natural property */
	final static public String UMLPrimitiveTypes_REAL_NAME = "PrimitiveTypes::Real"; //$NON-NLS-1$
	
	final static public String UMLPrimitiveTypes_LIBRARY_NAME = "UMLPrimitiveTypes"; //$NON-NLS-1$

	private static final Object UMLPrimitiveTypes_PACKAGE_NAME = "PrimitiveTypes"; //$NON-NLS-1$;
	

	/**
	 * The resource containing the library.
	 */
	protected Resource libraryResource;

	private org.eclipse.uml2.uml.Package libraryPackage;
	
	/**
	 * Initialize the model from the specified ResourceSet.
	 * Try to find the library. Create it if needed.
	 * 
	 * Constructor.
	 *
	 * @param resourceSet
	 * @throws NotFoundException If the Model cannot be found.
	 */
	public UMLPrimitiveTypesModel(ResourceSet resourceSet) throws  NotFoundException {
		// TODO Auto-generated constructor stub
		
		libraryResource = lookupPrimitiveTypesResource(resourceSet);
		
		// Set types
		extractTypes();
	}
	
	/**
	 * Extract types from the resource
	 */
	private void extractTypes() {


		Iterator<EObject> iter = libraryResource.getAllContents();
		while( iter.hasNext()) {
			EObject obj = iter.next();
			if( obj instanceof Type ) {
				Type type = (Type)obj;
				if( UMLPrimitiveTypes_BOOLEAN_NAME.equals(type.getQualifiedName())) {
					UMLPrimitiveTypes_BOOLEAN = type;
				}
				else if( UMLPrimitiveTypes_INTEGER_NAME.equals(type.getQualifiedName())) {
					UMLPrimitiveTypes_INTEGER = type;
				}
				else if( UMLPrimitiveTypes_REAL_NAME.equals(type.getQualifiedName())) {
					UMLPrimitiveTypes_REAL = type;
				}
				else if( UMLPrimitiveTypes_STRING_NAME.equals(type.getQualifiedName())) {
					UMLPrimitiveTypes_STRING = type;
				}
				else if( UMLPrimitiveTypes_UNLIMITED_NATURAL_NAME.equals(type.getQualifiedName())) {
					UMLPrimitiveTypes_UNLIMITED_NATURAL = type;
				}
			}
			if( obj instanceof Package ) {
				Package p = (Package)obj;
				if( UMLPrimitiveTypes_PACKAGE_NAME.equals(p.getQualifiedName())) {
					libraryPackage = p;
				}
			}
		}
		
	}

	/**
	 * Lookup for the {@link Resource} containing the Library.
	 * 
	 * @param resourceSet The {@link ResourceSet} into which we lookup
	 * @return The {@link Resource}, or null if not found.
	 * @throws NotFoundException 
	 */
	private Resource lookupPrimitiveTypesResource(ResourceSet resourceSet) throws NotFoundException {
		// First lookup for the registration
		IRegisteredLibrary registeredLibrary = getIRegisteredLibrary(UMLPrimitiveTypes_LIBRARY_NAME);
		
		// 
		Resource resource = resourceSet.getResource(registeredLibrary.getUri(), true);
		return resource;
	}

	/**
	 * @throws NotFoundException 
	 * 
	 */
	private IRegisteredLibrary getIRegisteredLibrary( String libraryName) throws NotFoundException {
		List<IRegisteredLibrary>registeredLibraries = Registry.getRegisteredLibraries();
		
		for( IRegisteredLibrary regLib : registeredLibraries) {
			if(libraryName.equals(regLib.getName())) {
				return regLib;
			}
		}
		throw new NotFoundException("No Library is registered under the name '" + libraryName + "'.");
	}

	
	/**
	 * @return the libraryResource
	 */
	public Resource getLibraryResource() {
		return libraryResource;
	}

	/**
	 * @return the libraryResource
	 */
	public Package getLibraryPackage() {
		return libraryPackage;
	}

	
}
