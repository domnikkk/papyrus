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
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.req.reqif.transformation;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.req.reqif.I_SysMLStereotype;
import org.eclipse.papyrus.uml.extensionpoints.profile.IRegisteredProfile;
import org.eclipse.papyrus.uml.extensionpoints.profile.RegisteredProfile;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.resource.UMLResource;


/**
 * 
 *  this class is a base to make the import export of Reqif Files
 *
 */
public abstract class ReqIFBaseTransformation {

	/** the transactional Editing doamin to acces to the service edit**/
	public TransactionalEditingDomain domain = null;
	protected ReqIF reqIFModel;
	protected org.eclipse.uml2.uml.Package UMLModel;
	protected HashMap<String,Stereotype> reqStereotypes;
	protected HashMap<String, Stereotype> reqstereotypeSpecRelation;
	/** The UML primitive  Type */
	protected org.eclipse.uml2.uml.Package umlPrimitiveTypes;
	/** The UML metamodel**/
	protected Package umlMetamodel;
	/** The SysML profile*/
	protected Profile sysMLprofile;
	protected HashMap<String, SpecType> reqiFTypeMap;
	protected HashMap<String, SpecType> reqiFSpecRelationTypeMap;
	protected HashMap<String, SpecificationType> reqiFSpecificationTypeMap;
	protected HashMap<String, DatatypeDefinitionEnumeration> reqifDatatTypeEnumeration;
	protected HashMap<String, Stereotype> reqstereotypeSpecification;
	protected HashMap<SpecObject, Element> SpecObject_UMLElementMap;
	protected HashMap<String, Enumeration> profileEnumeration;

	/**
	 * 
	 * Constructor.
	 *
	 * @param domain the domain to execute command
	 * @param UMLModel the UML model that has bee selected to import or export
	 */
	public ReqIFBaseTransformation( TransactionalEditingDomain domain,Package UMLModel) {
		this.domain=domain;
		this.UMLModel=UMLModel;
		//get reference to Sysml Profile
		IRegisteredProfile registeredProfile = RegisteredProfile.getRegisteredProfile("SysML");
		URI sysMLUri = registeredProfile.getUri();
		final Resource modelResource = EMFHelper.getResourceSet(UMLModel).getResource(sysMLUri, true);
		sysMLprofile = (Profile)modelResource.getContents().get(0);

		//get reference to UML primitive Type
		Resource resourceprimitiveType=EMFHelper.getResourceSet(UMLModel).getResource(URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI), true);
		umlPrimitiveTypes = (org.eclipse.uml2.uml.Package) (resourceprimitiveType.getContents().get(0));

		// get reference to  UML metamodel
		Resource umlMetamodelResource=EMFHelper.getResourceSet(UMLModel).getResource(URI.createURI(UMLResource.UML_METAMODEL_URI), true);
		umlMetamodel = (org.eclipse.uml2.uml.Package) (umlMetamodelResource.getContents().get(0));
		reqStereotypes = new HashMap<String,Stereotype>();
		reqstereotypeSpecRelation= new HashMap<String, Stereotype>();
	}

	/**
	 * get All Enumeration contained in applied profile
	 * @param uMLModel the current UML Model
	 * @return the hashmap (name, element) that can be empty
	 */
	protected HashMap<String, Enumeration> getAllPossibleEnumeration(Package uMLModel) {
		HashMap<String, Enumeration> enumerationList= new  HashMap<String, Enumeration>();
		for(Profile currentProfile : UMLModel.getAppliedProfiles()) {

			for(PackageableElement packageableElement : currentProfile.getPackagedElements()) {
				if( packageableElement instanceof Enumeration){
					enumerationList.put(packageableElement.getName(),(Enumeration)packageableElement);
				}
			}

		}
		return enumerationList;
	}

	/**
	 * test if the stereotype is a SysML Requirement Stereotype
	 * @param stereotype a given stereotype
	 * @return return true if this is a SysML stereotype or inherits directly or indirectly from requirement
	 */
	protected boolean isRequirementStereotype(Stereotype stereotype) {
		if( I_SysMLStereotype.REQUIREMENT_STEREOTYPE.equals(stereotype.getQualifiedName())){
			return true;
		}
		for(org.eclipse.uml2.uml.Class superStereotype : stereotype.getSuperClasses()) {
			if( superStereotype instanceof Stereotype){
				if(isRequirementStereotype((Stereotype)superStereotype)){
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * from a UML Model, go through all applied profile and look for a stereotype that represent a resuirement
	 * @param UMLModel
	 * @return the list of requirement
	 */

	protected HashMap<String,Stereotype> getAllPossibleRequirementType(org.eclipse.uml2.uml.Package  UMLModel) {
		HashMap<String,Stereotype> requirementStereotypes= new HashMap<String,Stereotype>();
		for(Profile currentProfile : UMLModel.getAppliedProfiles()) {
			if(currentProfile.getQualifiedName().equals("SysML::Requirements")){
				requirementStereotypes.put("SysML_Requirement",currentProfile.getOwnedStereotype("Requirement"));
			}
			for(Stereotype stereotype : currentProfile.getOwnedStereotypes()) {
				if( isRequirementStereotype(stereotype)){
					if(!stereotype.getName().equals("Requirement")){
						requirementStereotypes.put(stereotype.getName(),stereotype);
					}
				}
			}

		}
		return requirementStereotypes;
	}

	/**
	 * get all possible stereotype that extends Dependency metaclasses
	 * @param uMLModel
	 * @return map of all stereotypes that extends packages
	 */
	protected HashMap<String, Stereotype> getAllPossibleSpecRelationType() {
		HashMap<String,Stereotype> SpecRelationStereotypes= new HashMap<String,Stereotype>();
		for(Profile currentProfile : UMLModel.getAppliedProfiles()) {

			for(Stereotype stereotype : currentProfile.getOwnedStereotypes()) {
				if( isPossibleSpecRelationTypeStereotype(stereotype)){
					SpecRelationStereotypes.put(stereotype.getName(),stereotype);
				}
			}

		}
		return SpecRelationStereotypes;
	}

	/**
	 * test if the stereotype extends a dependency or inherits of stereotypes that extends a dependency
	 * @param stereotype
	 * @return true if the stereotype extends a package or inherits of stereotypes that extends a package
	 */
	protected boolean isPossibleSpecRelationTypeStereotype(Stereotype stereotype) {
		Class packageMetaclass= (Class)umlMetamodel.getOwnedType("Dependency");
		if( stereotype.getExtendedMetaclasses().contains(packageMetaclass)){
			return true;
		}
		for(org.eclipse.uml2.uml.Class superStereotype : stereotype.getSuperClasses()) {
			if( superStereotype instanceof Stereotype){
				if(isPossibleSpecificationTypeStereotype((Stereotype)superStereotype)){
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * get all possible stereotype that extends Package metaclasses
	 * @param uMLModel
	 * @return map of all stereotypes that extends packages
	 */
	protected HashMap<String, Stereotype> getAllPossibleSpecificationType(Package uMLModel) {
		HashMap<String,Stereotype> specificationStereotypes= new HashMap<String,Stereotype>();
		for(Profile currentProfile : UMLModel.getAppliedProfiles()) {

			for(Stereotype stereotype : currentProfile.getOwnedStereotypes()) {
				if( isPossibleSpecificationTypeStereotype(stereotype)){
					specificationStereotypes.put(stereotype.getName(),stereotype);
				}
			}

		}
		return specificationStereotypes;
	}

	/**
	 * test if the stereotype extends a package or inherits of stereotypes that extends a package
	 * @param stereotype
	 * @return true if the stereotype extends a package or inherits of stereotypes that extends a package
	 */
	protected boolean isPossibleSpecificationTypeStereotype(Stereotype stereotype) {
		Class packageMetaclass= (Class)umlMetamodel.getOwnedType("Package");
		if( stereotype.getExtendedMetaclasses().contains(packageMetaclass)){
			return true;
		}
		for(org.eclipse.uml2.uml.Class superStereotype : stereotype.getSuperClasses()) {
			if( superStereotype instanceof Stereotype){
				if(isPossibleSpecificationTypeStereotype((Stereotype)superStereotype)){
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * form SysML profile return the Requirement stereotype
	 * @param sysMLprofile
	 * @return return the requirement stereotype
	 */
	protected Stereotype getRequirementStereotype(Profile sysMLprofile) {
		Profile requirementProfile=(Profile)sysMLprofile.getPackagedElement("Requirements");
		return (Stereotype)requirementProfile.getPackagedElement("Requirement");
	}

	/**
	 * 
	 * @param UMLModel the UML model
	 * @return all applied profile that are local profiles
	 */
	protected ArrayList<Profile> getAllLocalProfiles(org.eclipse.uml2.uml.Package  UMLModel) {
		ArrayList<Profile> localProfile= new ArrayList<Profile>();
		for(Profile currentProfile : UMLModel.getAppliedProfiles()) {
			if(currentProfile.eResource().getURI().isPlatformResource()){
				localProfile.add(currentProfile);
			}

		}
		return localProfile;
	}

	/**
	 * fill the hashmap to get all dataTypeEnumerationDefinition from ReqIF file
	 */
	protected void getAllDataTypeDefinitionEnumeration() {
		if(reqIFModel.getCoreContent().getSpecTypes()!=null&&reqIFModel.getCoreContent().getDatatypes().size()>0){
			for(DatatypeDefinition reqIFType : reqIFModel.getCoreContent().getDatatypes()) {
				if(reqIFType instanceof DatatypeDefinitionEnumeration){
					reqifDatatTypeEnumeration.put(reqIFType.getLongName(), (DatatypeDefinitionEnumeration) reqIFType);
				}

			}
		}
	}
}
