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


import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.req.reqif.Activator;
import org.eclipse.papyrus.req.reqif.I_SysMLStereotype;
import org.eclipse.papyrus.req.reqif.assistant.CreateOrSelectProfilDialog;
import org.eclipse.papyrus.req.reqif.integration.assistant.ChooseAttributeEnumerationDialog;
import org.eclipse.papyrus.req.reqif.preference.ReqIFPreferenceConstants;
import org.eclipse.papyrus.uml.extensionpoints.utils.Util;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * this class is used to realize the import of ReqIF file to UML
 *
 */
public abstract class ReqIFImporter extends ReqIFBaseTransformation {
	/**
	 * 
	 * Constructor.
	 *
	 * @param domain the domain  in order to execute command
	 * @param reqIFModel the reqIF model that is imported
	 * @param UMLModel the UML model that will contain the importation
	 */
	public ReqIFImporter(TransactionalEditingDomain domain, ReqIF reqIFModel, org.eclipse.uml2.uml.Package UMLModel ) {
		super(domain,UMLModel);
		this.reqIFModel= reqIFModel;
		//initiate Hashmap
		//mapping for the list of  specObjectTypes
		reqiFTypeMap=new HashMap<String, SpecType>();
		reqStereotypes= new HashMap<String,Stereotype>();

		//mapping stereotype for specification
		reqiFSpecificationTypeMap=new HashMap<String, SpecificationType>();
		reqstereotypeSpecification= new HashMap<String,Stereotype>();
		//mapping SpecRelationType
		reqiFSpecRelationTypeMap= new  HashMap<String, SpecType>(); 
		reqstereotypeSpecRelation= new HashMap<String, Stereotype>();
		profileEnumeration= new HashMap<String, Enumeration>();

	}
	/**
	 * this method could be overloaded, it is used to make a pre-processing on ReqIFModel
	 * @param reqIFModel
	 */
	public void preProcess( ReqIF reqIFModel){
		//1. first make sure that all reqIFelement have a name
		normalizeNames(reqIFModel);


		//2. patterns, if 1 type, maybe there is an enumeration?
		transformPatternEnumeration(reqIFModel,null);

	}
	/**
	 * set a name of all type of the ReqIF model if there is no name
	 * @param reqIFModel
	 */
	protected void normalizeNames(ReqIF reqIFModel) {
		Iterator<EObject> reqIFElementIterator= reqIFModel.eAllContents();
		int index =0;
		while(reqIFElementIterator.hasNext()) {
			EObject eObject = (EObject)reqIFElementIterator.next();
			if( eObject instanceof  Identifiable){
				Identifiable identifiable=(Identifiable)eObject;
				if( identifiable.getLongName()==null|| identifiable.getLongName().trim().equals("")){
					identifiable.setLongName(eObject.getClass().getSimpleName()+"_"+index);
					index++;
				}
				identifiable.setLongName(getNormalName(identifiable.getLongName()));
			}
		}
	}
	/**
	 * this method transform type with enumeration to set of types
	 * @param reqIFModel
	 * @param attributeEnumeration the name of attribute definition if the type in order to transform. (in this case no UI)
	 */
	protected void transformPatternEnumeration(ReqIF reqIFModel, String attributeEnumeration) {
		ArrayList<SpecObjectType> specObjectTypes= new ArrayList<SpecObjectType>();

		if(reqIFModel.getCoreContent().getSpecTypes()!=null&&reqIFModel.getCoreContent().getSpecTypes().size()>0){
			for(SpecType reqIFType : reqIFModel.getCoreContent().getSpecTypes()) {
				if(reqIFType instanceof SpecObjectType){
					specObjectTypes.add( (SpecObjectType) reqIFType);
				}
			}
		}

		//maybe the topology of element is coded by an enumeration
		if( specObjectTypes.size()==1){
			SpecObjectType theType=specObjectTypes.get(0);
			//find enumeration
			ArrayList<AttributeDefinitionEnumeration> attEnumeration= new ArrayList<AttributeDefinitionEnumeration>();
			AttributeDefinitionEnumeration patternEnumerationAtt= null;
			for (AttributeDefinition attDefinition : theType.getSpecAttributes()) {
				if( attDefinition instanceof AttributeDefinitionEnumeration){
					attEnumeration.add((AttributeDefinitionEnumeration)attDefinition);
					if(attributeEnumeration!=null&&attDefinition.getLongName().equals(attributeEnumeration)){
						patternEnumerationAtt=(AttributeDefinitionEnumeration)attDefinition;
					}
				}
			}

			if(patternEnumerationAtt==null){
				if(attEnumeration.size()>1){
					ChooseAttributeEnumerationDialog assistedDialog= new ChooseAttributeEnumerationDialog(new Shell(), attEnumeration);
					assistedDialog.open();
					ArrayList<Object> result=assistedDialog.getSelectedElements();
					patternEnumerationAtt=(AttributeDefinitionEnumeration) result.get(0);
				}
				else{
					patternEnumerationAtt=attEnumeration.get(0);
				}
			}
			//transform pseudo type from enumeration
			DatatypeDefinitionEnumeration enumeration= patternEnumerationAtt.getType();
			HashMap<String, SpecObjectType> newTypes= new HashMap<String, SpecObjectType> ();
			for (EnumValue enumValue : enumeration.getSpecifiedValues()) {
				SpecObjectType specObjectType=EcoreUtil.copy(theType);
				specObjectType.setLongName(enumValue.getLongName());
				specObjectType.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
				reqIFModel.getCoreContent().getSpecTypes().add(specObjectType);
				newTypes.put(enumValue.getLongName(), specObjectType);
			}
			for(SpecObject specObject : reqIFModel.getCoreContent().getSpecObjects()) {
				//get Attribute Value
				AttributeValueEnumeration attValue =(AttributeValueEnumeration)getAttributeValue(specObject, patternEnumerationAtt);
				if(attValue!=null){
					if( attValue.getValues().size()>0){
						specObject.setType(newTypes.get(attValue.getValues().get(0).getLongName()));
					}
				}
			}

		}
	}
	public static AttributeValue getAttributeValue(SpecElementWithAttributes specElement, AttributeDefinition attributeDefinition) {
		for (AttributeValue value : specElement.getValues()) {
			AttributeDefinition definition = ReqIF10Util.getAttributeDefinition(value);
			if (attributeDefinition.getLongName().equals(definition.getLongName())) {
				return value;
			}
		}
		return null;
	}

	/**
	 * import selected SpecObjectType and their instances into UML Model
	 * @param interactive open GUI for user if true
	 * @return true
	 */
	public boolean importReqIFModel ( boolean interactive){
		preProcess(reqIFModel);
		//look for all Stereotype that inherits of Requirements
		//import ReqIFHeader
		importReqIFHeader(reqIFModel, UMLModel);

		//specObject Types
		reqiFTypeMap= new HashMap<String, SpecType>();
		reqStereotypes=getAllPossibleRequirementType(  UMLModel);

		//specificationType
		reqiFSpecificationTypeMap= new HashMap<String, SpecificationType>();
		reqstereotypeSpecification= getAllPossibleSpecificationType(UMLModel);

		//SpecRelation
		reqiFSpecRelationTypeMap= new  HashMap<String, SpecType>(); 
		reqstereotypeSpecRelation= getAllPossibleSpecRelationType();

		//map between SpecObject and Element
		SpecObject_UMLElementMap= new HashMap<SpecObject, Element>();

		//get all types of ReqIF and SpecificationType
		if(reqIFModel.getCoreContent().getSpecTypes()!=null&&reqIFModel.getCoreContent().getSpecTypes().size()>0){
			for(SpecType reqIFType : reqIFModel.getCoreContent().getSpecTypes()) {
				if(reqIFType instanceof SpecObjectType){
					reqiFTypeMap.put(reqIFType.getLongName(), (SpecObjectType) reqIFType);
				}
				if(reqIFType instanceof SpecificationType){
					reqiFSpecificationTypeMap.put(reqIFType.getLongName(), (SpecificationType) reqIFType);
				}
				if(reqIFType instanceof SpecRelationType){
					reqiFSpecRelationTypeMap.put(reqIFType.getLongName(), (SpecRelationType) reqIFType);
				}

			}
		}
		//get All DataTypeEnumeration
		profileEnumeration=getAllPossibleEnumeration(UMLModel);
		reqifDatatTypeEnumeration= new HashMap<String, DatatypeDefinitionEnumeration>();
		getAllDataTypeDefinitionEnumeration();

		reqiFTypeMap= filterReqifAvailableType(reqiFTypeMap);
		//ask to the User all specObjectTypes to import
		if(interactive){
			reqiFTypeMap=selectReqIFType(reqiFTypeMap.values());
		}

		//analyze the list of existing stereotypes and the list of specObject Types to import 
		ArrayList<SpecType> specObjectTypesToCreate= new ArrayList<SpecType>();
		ArrayList<SpecificationType> specificationTypesToCreate= new ArrayList<SpecificationType>();
		ArrayList<SpecType> specRelationTypesToCreate= new ArrayList<SpecType>();
		ArrayList<DatatypeDefinitionEnumeration> dataTypeDefinitionToCreate= new ArrayList<DatatypeDefinitionEnumeration>();

		//find spec Object Types to create
		for(SpecType specObjectType : reqiFTypeMap.values()) {
			if( !reqStereotypes.containsKey(specObjectType.getLongName())){
				specObjectTypesToCreate.add(specObjectType);
			}
		}
		//find specificationTypess to create
		for(SpecificationType specificationType : reqiFSpecificationTypeMap.values()) {
			if( !reqstereotypeSpecification.containsKey(specificationType.getLongName())){
				specificationTypesToCreate.add(specificationType);
			}
		}
		//find specRelationTypes to create
		for(SpecType specRelationType : reqiFSpecRelationTypeMap.values()) {
			if( !reqstereotypeSpecRelation.containsKey(specRelationType.getLongName())){
				specRelationTypesToCreate.add(specRelationType);
			}
		}
		//find dataTypeDefinition Enumeration to create
		for(DatatypeDefinitionEnumeration definitionEnumeration : reqifDatatTypeEnumeration.values()) {
			if( !profileEnumeration.containsKey(definitionEnumeration.getLongName())){
				dataTypeDefinitionToCreate.add(definitionEnumeration);
			}
		}

		//test if a profile must be updated or created
		if( specObjectTypesToCreate.size()>0||specificationTypesToCreate.size()>0||specRelationTypesToCreate.size()>0||dataTypeDefinitionToCreate.size()>0){
			//stereotype must be created
			//testKind User
			IPreferenceStore store = Activator.getDefault().getPreferenceStore();
			String userkind_value=store.getString(ReqIFPreferenceConstants.USER_KIND);
			if(userkind_value.equals(ReqIFPreferenceConstants.ADVANCED_USER)){
				// Advanced USER
				CreateOrSelectProfilDialog profilDialog= new CreateOrSelectProfilDialog(new Shell(), getAllLocalProfiles(UMLModel));
				profilDialog.open();
				String profileName=profilDialog.getProfileName();
				Profile profile=getProfile(UMLModel, profileName);
				importReqIFHeader(reqIFModel, profile);
				importDataTypeDefinition(profile, dataTypeDefinitionToCreate);
				importReqIFSpecificationType(profile, specificationTypesToCreate);
				importReqIFSpecObjectTypes(profile, specObjectTypesToCreate);
				importReqIFspecRelationTypes(profile,specRelationTypesToCreate);
				postProcessProfile(profile);
				defineProfile(profile);
				UMLModel.applyProfile(profile);
			}
		}

		//all types has been created so import elspecifications and specObjects
		reqStereotypes=getAllPossibleRequirementType(UMLModel);

		HashMap<String,Stereotype> filteredreqStereotypes=new HashMap<String, Stereotype>();

		//filter Type to import, because reqstereotype may be too large
		for(SpecType specObjectType : reqiFTypeMap.values()) {
			if( reqStereotypes.containsKey(specObjectType.getLongName())){
				filteredreqStereotypes.put(specObjectType.getLongName(), reqStereotypes.get(specObjectType.getLongName()));
			}
		}
		reqStereotypes=filteredreqStereotypes;
		reqstereotypeSpecification= getAllPossibleSpecificationType(UMLModel);
		reqstereotypeSpecRelation= getAllPossibleSpecRelationType();
		importReqIFspecification(reqIFModel, UMLModel, reqStereotypes);
		importSpecRelation(reqIFModel, UMLModel,reqstereotypeSpecRelation);

		postProcess(UMLModel);
		return true;
	}

	/**
	 * this method is used to reduce the set of all ReqIF types that you want to import bt UI or not 
	 * @param reqiFTypeMap the given list of  of REQIF type availbale
	 * @return the new hashmap of reqif available. <string, specObjectype> the string is th elong name of the SpecObjectType
	 */
	public HashMap<String, SpecType> filterReqifAvailableType(
			HashMap<String, SpecType> reqiFTypeMap) {
		return reqiFTypeMap;
	}
	/**
	 * this action is used to add last action or transformation on the UML model after importing all things.
	 * @param UMLModel the obtained UML model after importing reqIF Model
	 */
	public void postProcess(Package UMLModel){

	}

	/**
	 * this agoal of this method is do add action before serialize, define and apply profile. 
	 * Pay attention: Make sure that the profile could be define at the end of this action
	 * @param profile the current profile
	 * 
	 */
	public void postProcessProfile(Profile profile){

	}
	/**
	 * define the given profile in order to apply it
	 * @param profile the given profile
	 */
	protected abstract void defineProfile(Profile profile);



	/**
	 * This method is used to get the list of wanted ReqIFType to import
	 * @param values list of Spec Type
	 * @return subset of Spec types
	 */
	protected abstract HashMap<String, SpecType> selectReqIFType(Collection<SpecType> values);



	/**
	 * from a list of DatatypedefinitionEnumeration create Enumeration in a given profile
	 * @param profile the profile where Enumeration will be created 
	 * @param dataTypeDefinitionToCreate list of enumeration definition
	 */

	protected void importDataTypeDefinition(Profile profile, ArrayList<DatatypeDefinitionEnumeration> dataTypeDefinitionToCreate) {
		for(DatatypeDefinitionEnumeration definitionEnumeration : dataTypeDefinitionToCreate) {
			if(definitionEnumeration.getLongName()!=null &&(!(definitionEnumeration.getLongName().trim().equals("") ))){
				Enumeration enumeration = profile.createOwnedEnumeration(getNormalName(definitionEnumeration.getLongName()));
				//import enumerationLiteral
				profileEnumeration.put(getNormalName(definitionEnumeration.getLongName()), enumeration);
				for(EnumValue enumValue : definitionEnumeration.getSpecifiedValues()) {
					if(enumValue.getLongName()!=null){
						EnumerationLiteral enumerationLiteral=enumeration.createOwnedLiteral(getNormalName(enumValue.getLongName()));
						if(enumValue.getDesc()!=null){
							Comment comment=enumerationLiteral.createOwnedComment();
							comment.setBody(enumValue.getDesc());
						}
					}
				}
				//create Comments
				if(definitionEnumeration.getDesc()!=null){
					Comment comment=enumeration.createOwnedComment();
					comment.setBody(definitionEnumeration.getDesc());
				}
			}
		}

	}


	/**
	 * from a list of SpecRelation create stereotypes in a given profile
	 * @param profile the profile where stereotypes will be created 
	 * @param specRelationTypesToCreate the list of relationTypes that will be created in the UML file
	 */
	protected void importReqIFspecRelationTypes(Profile profile, ArrayList<SpecType> specRelationTypesToCreate) {
		for(SpecType specRelationType : specRelationTypesToCreate) {
			if(specRelationType.getLongName()!=null &&(!(specRelationType.getLongName().trim().equals("") ))){
				Stereotype stereotype = profile.createOwnedStereotype(specRelationType.getLongName(), false);
				importSpecAttribute(specRelationType, stereotype);

				//create Comments
				if(specRelationType.getDesc()!=null){
					Comment comment=stereotype.createOwnedComment();
					comment.setBody(specRelationType.getDesc());
				}
				Class metaclass= (Class)umlMetamodel.getOwnedType("Dependency");
				profile.createMetaclassReference(metaclass);
				stereotype.createExtension(metaclass, false);
			}
		}
	}


	/**
	 * This method is used to import specification from ReqIF model
	 * @param reqIFModel the REQIF model
	 * @param UMLModel the UML model
	 * @param reqStereotypes the list of stereotypes
	 */
	protected void importReqIFspecification(ReqIF reqIFModel,Package UMLModel,HashMap<String,Stereotype> reqStereotypes){
		for(Specification specif : reqIFModel.getCoreContent().getSpecifications()) {
			Package apackage=UMLModel.createNestedPackage(specif.getLongName());
			if(reqstereotypeSpecification.get(specif.getType().getLongName())!=null){
				apackage.applyStereotype(reqstereotypeSpecification.get(specif.getType().getLongName()));
				importSpecAttributesValue(reqstereotypeSpecification, specif, apackage, specif.getType());
			}
			for(SpecHierarchy specHierarchy : specif.getChildren()) {
				importReqIFHyerarchy(specHierarchy, apackage, reqStereotypes);
			}
		}
	}

	/**
	 * get the property from a stereotype
	 * @param stereotype
	 * @param propertyName
	 * @return the property from a stereotype maybe null
	 */
	public Property getProperty(Stereotype stereotype, String propertyName){
		Property property=null;
		for (Property attribute : stereotype.getAllAttributes()) {
			if( attribute.getName().equals(propertyName)){
				return attribute;
			}

		}
		return property;
	}
	/**
	 * fill properties of stereotypes form the SpecElementWithAttributes and the map of stereotypes
	 * @param reqStereotypesMap map of stereotypes (specificationType, SpecObjectTypes)
	 * @param specif SpecElementWithAttributes that contains attributes
	 * @param umlElement the UmlElement that is stereotypes and  where properties will be filled
	 * @param specType the type of the  SpecElementWithAttributes
	 */
	protected void importSpecAttributesValue(HashMap<String, Stereotype> reqStereotypesMap, SpecElementWithAttributes specif, Element umlElement, SpecType specType) {
		for(AttributeValue att : specif.getValues()) {


			if(att instanceof AttributeValueString){
				String attributeName=((AttributeValueString)att).getDefinition().getLongName().trim();
				attributeName = getNormalName(attributeName);
				Stereotype stereotype=reqStereotypesMap.get(specType.getLongName());
				if( stereotype!=null){
					Property aProperty=getProperty(stereotype, attributeName);
					if(aProperty!=null){
						umlElement.setValue(
								reqStereotypesMap.get(specType.getLongName()),
								attributeName,
								((AttributeValueString)att).getTheValue());
						if( attributeName.equals("ID")){
							if(umlElement instanceof NamedElement){
								((NamedElement)umlElement).setName(((AttributeValueString)att).getTheValue());
							}
						}
					}
				}
			}
			if(att instanceof AttributeValueBoolean){
				String attributeName=((AttributeValueBoolean)att).getDefinition().getLongName().trim();
				attributeName = getNormalName(attributeName);
				Stereotype stereotype=reqStereotypesMap.get(specType.getLongName());
				if( stereotype!=null){
					Property aProperty=getProperty(stereotype, attributeName);
					if(aProperty!=null){
						umlElement.setValue(
								reqStereotypesMap.get(specType.getLongName()),
								attributeName,
								((AttributeValueBoolean)att).isTheValue());
					}
				}
			}
			if(att instanceof AttributeValueInteger){
				String attributeName=((AttributeValueInteger)att).getDefinition().getLongName().trim();
				attributeName = getNormalName(attributeName);
				Stereotype stereotype=reqStereotypesMap.get(specType.getLongName());
				if( stereotype!=null){
					Property aProperty=getProperty(stereotype, attributeName);
					if(aProperty!=null){
						umlElement.setValue(
								reqStereotypesMap.get(specType.getLongName()),
								attributeName,
								((AttributeValueInteger)att).getTheValue().intValue());
					}
				}
			}
			if(att instanceof AttributeValueReal){
				String attributeName=((AttributeValueReal)att).getDefinition().getLongName().trim();
				attributeName = getNormalName(attributeName);
				Stereotype stereotype=reqStereotypesMap.get(specType.getLongName());
				if( stereotype!=null){
					Property aProperty=getProperty(stereotype, attributeName);
					if(aProperty!=null){
						umlElement.setValue(
								reqStereotypesMap.get(specType.getLongName()),
								attributeName,
								((AttributeValueReal)att).getTheValue());
					}
				}
			}
			if(att instanceof AttributeValueEnumeration){
				String attributeName=((AttributeValueEnumeration)att).getDefinition().getLongName().trim();
				attributeName = getNormalName(attributeName);
				Stereotype stereotype=reqStereotypesMap.get(specType.getLongName());
				if( stereotype!=null){
					Property aProperty=getProperty(stereotype, attributeName);
					if(aProperty!=null){
						if(((AttributeValueEnumeration)att).getValues().size()>0){
							String EnumerationValue=getNormalName(((AttributeValueEnumeration)att).getValues().get(0).getLongName());
							//look for Enumeration literal
							Enumeration aEnumeration= null;
							//look for attribute
							Stereotype referedStereotype= reqStereotypesMap.get(specType.getLongName());
							Property referedAttribute=null;
							for(Property property:referedStereotype.getAllAttributes()){
								if(property.getName().equals(attributeName)){
									referedAttribute=property;
								}
							}
							aEnumeration= (Enumeration)referedAttribute.getType();
							EnumerationLiteral aEnumerationLiteral=null;
							for(EnumerationLiteral aLiteral:aEnumeration.getOwnedLiterals()){
								if(EnumerationValue.equals(aLiteral.getName())){
									aEnumerationLiteral=aLiteral;
								}
							}
							if( aEnumerationLiteral!=null){
								umlElement.setValue(
										reqStereotypesMap.get(specType.getLongName()),
										attributeName,
										aEnumerationLiteral);
							}
						}
					}
				}
			}

			if(att instanceof AttributeValueXHTML){
				String attributeName=((AttributeValueXHTML)att).getDefinition().getLongName().trim();
				attributeName = getNormalName(attributeName);
				Stereotype stereotype=reqStereotypesMap.get(specType.getLongName());
				if( stereotype!=null){
					Property aProperty=getProperty(stereotype, attributeName);
					if(aProperty!=null){
						if((((AttributeValueXHTML)att).getTheValue())!=null){
							if((((AttributeValueXHTML)att).getTheValue().getXhtmlSource())!=null){
								umlElement.setValue(
										reqStereotypesMap.get(specType.getLongName()),
										attributeName,
										((AttributeValueXHTML)att).getTheValue().getXhtmlSource());
							}
							else{
								try {
									umlElement.setValue(
											reqStereotypesMap.get(specType.getLongName()),
											attributeName,
											//ProrXhtmlSimplifiedHelper.generateXMLString((((AttributeValueXHTML)att).getTheValue())));
											getXmlOnlyString(((AttributeValueXHTML)att).getTheValue()));
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * transform a name that could be a anme without ' 'or '.'
	 * @param attributeName the string that will be transformed
	 * @return the normal String
	 */
	protected String getNormalName(String attributeName) {
		attributeName=attributeName.replace(' ', '_');
		attributeName=attributeName.replace('.', '_');
		return attributeName;
	}

	/**
	 * This static method generates the string representation of the given {@link XhtmlContent} and returns it.
	 * 
	 * @param xhtmlContent
	 *            , the ReqIF container that holds the xhtml content (See also: {@link XhtmlContent})
	 * @return the string representation of the given {@link XhtmlContent} or null if no root element exists.
	 * @throws IOException
	 */
	public static String getXmlOnlyString(XhtmlContent xhtmlContent) throws IOException {
		StringWriter str = new StringWriter();
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_DECLARE_XML, Boolean.FALSE);
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.FALSE);
		options.put(XMLResource.OPTION_FORMATTED, Boolean.FALSE);
		options.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.FALSE);
		options.put(XMLResource.OPTION_ROOT_OBJECTS, Collections.singletonList(xhtmlContent.getXhtml()));



		//		options.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);
		//		options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.FALSE);

		XMLResourceImpl ri = new XMLResourceImpl();
		ri.save(str, options);
		String out= str.toString();
		if( out.toLowerCase().contains("<html")|| out.toLowerCase().contains("<xhtml")){

			out=out.replaceAll("</xhtml:XhtmlDivType>", "");
			out=out.replaceAll("<xhtml:XhtmlDivType xmlns:xhtml=\"http://www.w3.org/1999/xhtml\">", "");
			out=out.replaceAll("<xhtml:XhtmlDivType>", "");

		}
		return out.toString();
	}
	/**
	 * Import a hyerarchy that comes from a specification
	 * @param specHierarchy
	 * @param UMLElement
	 * @param reqStereotypes
	 */
	protected void importReqIFHyerarchy(SpecHierarchy specHierarchy, Element UMLElement,HashMap<String,Stereotype> reqStereotypes){
		Element createdChild=importReqIFSpecObjects(specHierarchy.getObject(), UMLElement, reqStereotypes);
		if(createdChild==null){
			createdChild=UMLElement;
		}
		for(SpecHierarchy specHierarchyChild : specHierarchy.getChildren()) {
			importReqIFHyerarchy(specHierarchyChild, createdChild, reqStereotypes);

		}
	}

	/**
	 * this method transform specification type to stereotypes based on package
	 * @param profile that contains stereotypes
	 * @param reqiFSpecificationTypetoImport the list of specification type to import
	 */
	protected void importReqIFSpecificationType(Profile profile,List<SpecificationType> reqiFSpecificationTypetoImport) {
		Stereotype requirement=getRequirementStereotype(sysMLprofile);
		int index=0;
		for(SpecificationType specificationType : reqiFSpecificationTypetoImport) {
			Stereotype stereotype=profile.createOwnedStereotype("stereotypeSpecification"+ index, false);
			index++;
			if(specificationType.getLongName()!=null&&(!(specificationType.getLongName().trim().equals("")))){
				stereotype.setName(specificationType.getLongName());
			}
			stereotype.createGeneralization(requirement);
			importSpecAttribute(specificationType, stereotype);

			//create Comments
			if(specificationType.getDesc()!=null){
				Comment comment=stereotype.createOwnedComment();
				comment.setBody(specificationType.getDesc());
			}
			Class metaclass= (Class)umlMetamodel.getOwnedType("Package");
			profile.createMetaclassReference(metaclass);
			stereotype.createExtension(metaclass, false);

		}

	}

	/**
	 * import attribute definition form the specType, it create property in the stereotype
	 * @param specificationType the  specType
	 * @param stereotype the stereotype
	 */
	protected void importSpecAttribute(SpecType specificationType, Stereotype stereotype) {
		//create attributes
		for(AttributeDefinition attributeDef : specificationType.getSpecAttributes()) {
			Property attribute=null;
			String attributeName=attributeDef.getLongName().trim();
			attributeName = getNormalName(attributeName);
			if( attributeDef instanceof AttributeDefinitionString){
				if(!(attributeDef.getLongName().equals("text")&&!(attributeName.equals("id")))){
					attribute= stereotype.createOwnedAttribute(attributeName, umlPrimitiveTypes.getOwnedType("String"));
				}
			}
			if( attributeDef instanceof AttributeDefinitionInteger){
				attribute= stereotype.createOwnedAttribute(attributeName, umlPrimitiveTypes.getOwnedType("Integer"));
			}
			if( attributeDef instanceof AttributeDefinitionBoolean){
				attribute= stereotype.createOwnedAttribute(attributeName, umlPrimitiveTypes.getOwnedType("Boolean"));
			}
			if( attributeDef instanceof AttributeDefinitionReal){
				attribute= stereotype.createOwnedAttribute(attributeName, umlPrimitiveTypes.getOwnedType("Real"));
			}
			if(attributeDef instanceof AttributeDefinitionXHTML){
				attribute= stereotype.createOwnedAttribute(attributeName, umlPrimitiveTypes.getOwnedType("String"));
			}
			if(attributeDef instanceof AttributeDefinitionEnumeration){
				String name=getNormalName(((AttributeDefinitionEnumeration)attributeDef).getType().getLongName());
				attribute= stereotype.createOwnedAttribute(attributeName, profileEnumeration.get(name));
			}

			if(attributeDef.getDesc()!=null&& attribute!=null){
				Comment comment=attribute.createOwnedComment();
				comment.setBody(attributeDef.getDesc());
			}
		}
	}

	/**
	 *add comment to explain the origin of this model 
	 *@param reqIFModel the reqIF model
	 *@param thePackage that will contain the comment
	 */
	protected void importReqIFHeader(ReqIF reqIFModel, Package thePackage) {
		Comment headerComment= thePackage.createOwnedComment();
		String body="This model has been generated "+ GregorianCalendar.getInstance().getTime()+" ";
		body+= "from ReqIF file: "+reqIFModel.eResource().getURI().lastSegment()+".\n";
		body+=""+reqIFModel.getTheHeader().getComment();
		if(reqIFModel.getTheHeader().getTitle()!=null){
			body+=""+reqIFModel.getTheHeader().getTitle();
		}
		headerComment.setBody(body);

	}

	/**
	 * Create stereotyped Class from SpecObject defined in the ReqIF model 
	 * @param reqIFObject the ReqIF object that will be imported
	 * @param owner the owner of the imported element in the UML hierarchy
	 * @param reqStereotypes list of stereotypes that represent a requirement
	 * @return the a requirement with  a good stereotype or null if no object is created (it depends  if the type of specObject could be imported)
	 */
	protected Element importReqIFSpecObjects(SpecObject reqIFObject, org.eclipse.uml2.uml.Element owner, HashMap<String, Stereotype> reqStereotypes) {
		//test of the the specObject could be imported
		if(reqIFObject==null){
			return null;
		}
		if(reqIFObject.getType()==null){
			System.out.println(reqIFObject.getLongName() + " type is null");
			return null;
		}
		if(reqStereotypes.get(reqIFObject.getType().getLongName())!=null){
			Class reqClass=null;
			reqClass = createRequirementClass(owner);
			reqClass.applyStereotype(reqStereotypes.get(reqIFObject.getType().getLongName()));
			reqClass.unapplyStereotype(reqClass.getApplicableStereotype(I_SysMLStereotype.REQUIREMENT_STEREOTYPE));
			//setID
			reqClass.setValue(	reqStereotypes.get(reqIFObject.getType().getLongName()),
					I_SysMLStereotype.REQUIREMENT_ID_ATT,
					reqIFObject.getIdentifier());

			//setText
			reqClass.setValue(	reqStereotypes.get(reqIFObject.getType().getLongName()),
					I_SysMLStereotype.REQUIREMENT_TEXT_ATT,
					reqIFObject.getDesc());


			importSpecAttributesValue(reqStereotypes, reqIFObject, reqClass, reqIFObject.getType());
			SpecObject_UMLElementMap.put(reqIFObject, reqClass);
			return reqClass;


		}
		return null;
	}


	/**
	 * create a requirement 
	 * @param owner the container of the requirement
	 * @return  a requirement a class with the stereotype SySML requirement
	 */
	protected abstract Class createRequirementClass(Element owner);



	/**
	 * Create stereotyped Class from SpecRealtion defined in the ReqIF model 
	 * @param reqIFModel the ReqIF model
	 * @param UMLModel the UMl model
	 * @param reqstereotypeSpecRelation list of stereotypes that represent a dependency
	 */
	protected void importSpecRelation(ReqIF reqIFModel, Package UMLModel, HashMap<String, Stereotype> reqstereotypeSpecRelation) {
		for(SpecRelation specRelation : reqIFModel.getCoreContent().getSpecRelations()) {
			if(reqstereotypeSpecRelation.get(specRelation.getType().getLongName())!=null){
				if( (SpecObject_UMLElementMap.get(specRelation.getSource())!=null) &&(SpecObject_UMLElementMap.get(specRelation.getTarget()))!=null){
					Dependency reqDependency=null;
					reqDependency = createDependency(UMLModel);

					reqDependency.applyStereotype(reqstereotypeSpecRelation.get(specRelation.getType().getLongName()));
					importSpecAttributesValue(reqstereotypeSpecRelation, specRelation, reqDependency, specRelation.getType());
					reqDependency.getClients().add((NamedElement)SpecObject_UMLElementMap.get(specRelation.getSource()));
					reqDependency.getSuppliers().add((NamedElement)SpecObject_UMLElementMap.get(specRelation.getTarget()));
				}
			}
		}


	}

	/**
	 * create aDependency UML in the UML Model
	 * @param UMLModel
	 * @return the created dependency
	 */
	protected  abstract Dependency createDependency(Package UMLModel);



	/**
	 * from a list of SpecObject create stereotypes in a given profile
	 * @param profile the profile where stereotypes will be created 
	 * @param specObjectTypesToCreate
	 */
	protected void importReqIFSpecObjectTypes(Profile profile, ArrayList<SpecType> specObjectTypesToCreate) {
		Stereotype requirement=getRequirementStereotype(sysMLprofile);
		int index=0;
		for(SpecType specObjectType : specObjectTypesToCreate) {
			Stereotype stereotype = profile.createOwnedStereotype(specObjectType.getLongName(), false);

			if(specObjectType.getLongName()==null||(specObjectType.getLongName().trim().equals(""))){
				stereotype.setName("StereotypeSpecObjectType"+index);
			}
			index++;
			stereotype.createGeneralization(requirement);
			importSpecAttribute(specObjectType, stereotype);

			//create Comments
			if(specObjectType.getDesc()!=null){
				Comment comment=stereotype.createOwnedComment();
				comment.setBody(specObjectType.getDesc());
			}
		}
	}

	/**
	 * this method is use to  get the instance of a profile thanks to its name
	 * @param UMLmodel the UML model on which the profile will be applied
	 * @param profileName the name of the profile
	 * @return a profile (created or found)
	 */
	protected Profile getProfile(org.eclipse.uml2.uml.Package UMLmodel, String profileName) {
		Profile foundProfile=null;
		ArrayList<Profile> localProfiles=getAllLocalProfiles(UMLmodel);
		for(Profile profile : localProfiles) {
			if(profileName.equals(profile.getName())){
				foundProfile=profile;
			}
		}
		ResourceSet resourceSet = Util.createTemporaryResourceSet();
		if(foundProfile==null){
			URI umlModel_URI=UMLmodel.eResource().getURI();
			String tmpURI=umlModel_URI.toString().replaceAll(umlModel_URI.lastSegment().toString(), profileName+".profile.uml");
			URI profileURI=URI.createURI(tmpURI);
			Resource resource = resourceSet.createResource(profileURI);
			foundProfile=UMLFactory.eINSTANCE.createProfile();
			foundProfile.setName(profileName);
			resource.getContents().add(foundProfile);


			Resource resourceprimitiveType=resourceSet.getResource(URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI), true);
			umlPrimitiveTypes = (org.eclipse.uml2.uml.Package) (resourceprimitiveType.getContents().get(0));
			foundProfile.createPackageImport(umlPrimitiveTypes);
			Resource umlMetamodelResource=resourceSet.getResource(URI.createURI(UMLResource.UML_METAMODEL_URI), true);
			umlMetamodel = (org.eclipse.uml2.uml.Package) (umlMetamodelResource.getContents().get(0));
			foundProfile.createMetamodelReference(umlMetamodel);
			foundProfile.createPackageImport(sysMLprofile.getNestedPackage("Requirements"));
			foundProfile.createPackageImport(sysMLprofile);
			try {
				resource.save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return foundProfile;
	}


	//	protected void compare(ReqIF REQIFResource, ReqIF REQIFResource2) {
	//		IComparisonScope scope = new DefaultComparisonScope(REQIFResource,REQIFResource2,null);
	//		Comparison comparison = EMFCompare.builder().build().compare(scope);
	//		List<Diff> differences = comparison.getDifferences();
	//		for (Diff diff : differences) {
	//			System.out.println(diff);
	//		}
	//	}






}
