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
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.uml.extensionpoints.utils.Util;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.ReqIFHeader;
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
import org.eclipse.rmf.reqif10.pror.util.ProrXhtmlSimplifiedHelper;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This class has in charge to realize export of ReqIF 
 *
 */
public class ReqIFExporter extends ReqIFBaseTransformation{


	protected DatatypeDefinitionString datatypeDefinitionString;
	protected DatatypeDefinitionBoolean datatypeDefinitionBoolean;
	protected DatatypeDefinitionReal datatypeDefinitionReal;
	protected DatatypeDefinitionInteger datatypeDefinitionInteger;
	protected DatatypeDefinitionXHTML datatypeDefinitionXHTML;
	protected HashMap<Element, SpecObject> element_SpecObject;

	/**
	 * 
	 * Constructor.
	 *
	 * @param domain  in order to execute command
	 * @param UMLModel the selected UML model that will be exported
	 */
	public ReqIFExporter(TransactionalEditingDomain domain,org.eclipse.uml2.uml.Package UMLModel) {
		super(domain,UMLModel);
	}

	/**
	 * launch the export of the REqIF model
	 * @param withGUI if true dialog will appear, false there is no dialog
	 * @param reqIFpath the path of the Reqif File  for example:"projectName/fileReqif"
	 */
	public void exportReqIFModel(boolean withGUI, String reqIFpath) {
		reqIFModel=createReqIFResource(reqIFpath);
		//get all information form stereotypes
		reqStereotypes=getAllPossibleRequirementType(UMLModel);
		reqstereotypeSpecRelation= getAllPossibleSpecRelationType();
		//create All reqIF Types
		reqiFTypeMap = new HashMap<String, SpecType>();
		reqiFSpecRelationTypeMap= new HashMap<String, SpecType >();

		element_SpecObject = new HashMap<Element, SpecObject>();

		//Enumeration
		reqifDatatTypeEnumeration= new HashMap<String, DatatypeDefinitionEnumeration>() ;
		profileEnumeration= getAllPossibleEnumeration(UMLModel);
		//creation of Enumerations dataType
		exportEnumeration();
		getAllDataTypeDefinitionEnumeration();
		//export specRealtionType
		for(Stereotype adependencyStereotype:reqstereotypeSpecRelation.values()){
			exportSpecRelationType(reqIFModel, adependencyStereotype);
		}


		//export specType
		for(Stereotype stereotype : reqStereotypes.values()) {
			exportSpecObjectTypes(reqIFModel, reqiFTypeMap, stereotype);
		}
		HashSet<Package> packageContainers=getRequirementContainers(UMLModel);
		for(Package aPackage : packageContainers) {
			//create a specificationType
			SpecificationType aSpecificationType= ReqIF10Factory.eINSTANCE.createSpecificationType();
			aSpecificationType.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
			aSpecificationType.setLongName(aPackage.getName());
			reqIFModel.getCoreContent().getSpecTypes().add(aSpecificationType);
			//create a Specification
			Specification aSpecification= ReqIF10Factory.eINSTANCE.createSpecification();
			aSpecification.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
			aSpecification.setLongName(aPackage.getName());
			aSpecification.setType(aSpecificationType);

			reqIFModel.getCoreContent().getSpecifications().add(aSpecification);
			for(PackageableElement aPackageableElement: aPackage.getPackagedElements()){
				exportAHierarchy(aSpecification, reqIFModel,aPackageableElement);
			}
		}
		exportSpecRelation();

		try {
			reqIFModel.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


/**
 * export stereotyped dependency to Spec Relation
 */
	protected void exportSpecRelation() {
		Iterator<EObject> containedElementIterator= UMLModel.eAllContents();
		while(containedElementIterator.hasNext()) {
			EObject eObject = (EObject)containedElementIterator.next();
			if( eObject instanceof Dependency){
				Dependency aDependency= (Dependency)eObject;
				List<Stereotype> appliedStereotypes=aDependency.getAppliedStereotypes();
				for(Stereotype appliedstereotype : appliedStereotypes) {
					if(reqstereotypeSpecRelation.values().contains(appliedstereotype)){
						if((element_SpecObject.containsKey(aDependency.getClients().get(0)))&&(element_SpecObject.containsKey(aDependency.getSuppliers().get(0)))){
							SpecRelation specRelation=ReqIF10Factory.eINSTANCE.createSpecRelation();
							specRelation.setType((SpecRelationType)reqiFSpecRelationTypeMap.get(appliedstereotype.getName()));
							specRelation.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
							specRelation.setLongName(aDependency.getName());
							specRelation.setSource((element_SpecObject.get(aDependency.getClients().get(0))));
							specRelation.setTarget(element_SpecObject.get(aDependency.getSuppliers().get(0)));
							exportAttributeValues(reqiFSpecRelationTypeMap,(Element) aDependency, appliedstereotype, specRelation);
							reqIFModel.getCoreContent().getSpecRelations().add(specRelation);
						}
					}
				}
			}
		}

	}




	/**
	 * transform UML Enumeration to ReqIF enumeration
	 */
	protected void exportEnumeration() {
		for(Enumeration theEnumeration:profileEnumeration.values()){
			DatatypeDefinitionEnumeration definitionEnumeration= ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration();
			definitionEnumeration.setLongName(theEnumeration.getName());
			definitionEnumeration.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
			int i=0;
			for(EnumerationLiteral theEnumerationLiteral: theEnumeration.getOwnedLiterals()){
				EnumValue theEnumValue= ReqIF10Factory.eINSTANCE.createEnumValue();
				theEnumValue.setLongName(theEnumerationLiteral.getName());
				theEnumValue.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
				EmbeddedValue embeddedValue= ReqIF10Factory.eINSTANCE.createEmbeddedValue();
				embeddedValue.setKey(new BigInteger(""+i));
				embeddedValue.setOtherContent(theEnumeration.getName()+"_"+theEnumerationLiteral.getName());
				theEnumValue.setProperties(embeddedValue);
				definitionEnumeration.getSpecifiedValues().add(theEnumValue);
				i++;
			}
			reqIFModel.getCoreContent().getDatatypes().add(definitionEnumeration);
		}
	}

	/**
	 * export a hierarchy from a packaged element
	 * @param aSpecification that will contain a hierarchy
	 * @param reqIFModel the reqiModel that contain the specification
	 * @param aPackageableElement the packageable element that will be exported ( package or requirement)
	 */
	protected  void exportAHierarchy(Specification aSpecification, ReqIF reqIFModel, PackageableElement aPackageableElement) {
		List<Stereotype> appliedStereotypes=aPackageableElement.getAppliedStereotypes();
		for(Stereotype appliedstereotype : appliedStereotypes) {
			if(reqStereotypes.values().contains(appliedstereotype)){
				SpecHierarchy hierarchy=ReqIF10Factory.eINSTANCE.createSpecHierarchy();
				hierarchy.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
				SpecObject specObject=exportSpecObjects(reqIFModel, reqStereotypes, reqiFTypeMap, ((Class)aPackageableElement));
				hierarchy.setObject(specObject);
				aSpecification.getChildren().add(hierarchy);
				for(Element containedElement: aPackageableElement.getOwnedElements()){
					exportAHierarchy(hierarchy, reqIFModel, containedElement);
				}
			}
		}

	}

	/**
	 * form a UML element (requirement) create a hierarchy in REqIF
	 * @param hierarchy an existed Hierarchy where sub hierarchy will be created
	 * @param reqIFModel the ReqIF model
	 * @param containedElement the container of elements that will be exported
	 */
	protected void exportAHierarchy(SpecHierarchy hierarchy, ReqIF reqIFModel, Element containedElement) {
		//test if the current element is a requirement
		List<Stereotype> appliedStereotypes=containedElement.getAppliedStereotypes();
		for(Stereotype appliedstereotype : appliedStereotypes) {
			if(reqStereotypes.values().contains(appliedstereotype)){
				//this is a requirement
				SpecHierarchy childhierarchy=ReqIF10Factory.eINSTANCE.createSpecHierarchy();
				childhierarchy.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
				SpecObject specObject=exportSpecObjects(reqIFModel, reqStereotypes, reqiFTypeMap, ((Class)containedElement));
				childhierarchy.setObject(specObject);
				hierarchy.getChildren().add(childhierarchy);
				for(Element childcontainedElement: containedElement.getOwnedElements()){
					exportAHierarchy(childhierarchy, reqIFModel, childcontainedElement);
				}
			}
		}

	}

	/**
	 * get the list of  requirement container
	 * @param UMLModel
	 * @return the list of package that contain requirements
	 */
	public HashSet<org.eclipse.uml2.uml.Package> getRequirementContainers(org.eclipse.uml2.uml.Package UMLModel){
		HashSet<Package> requirementContainers= new HashSet<Package>();
		Iterator<EObject> modelIterator=UMLModel.eAllContents();
		while(modelIterator.hasNext()) {
			EObject eObject = (EObject)modelIterator.next();
			if( eObject instanceof org.eclipse.uml2.uml.Class){
				Class clazz=(Class)eObject;
				List<Stereotype> appliedStereotypes=clazz.getAppliedStereotypes();
				for(Stereotype appliedstereotype : appliedStereotypes) {
					if(reqStereotypes.values().contains(appliedstereotype)){
						if(clazz.eContainer() instanceof Package){
							requirementContainers.add((Package)clazz.eContainer());
						}
					}
				}
			}
		}
		return requirementContainers;
	}

	/**
	 * Initiate ReqIF resource
	 * @param reqIFpath
	 * @return
	 */
	protected ReqIF createReqIFResource(String reqIFpath) {
		URI reqIFURI=URI.createPlatformResourceURI(reqIFpath,true);
		ResourceSet resourceSet = Util.createTemporaryResourceSet();
		Resource reqIFResource= resourceSet.createResource(reqIFURI);
		reqIFModel=ReqIF10Factory.eINSTANCE.createReqIF();
		ReqIFHeader header=ReqIF10Factory.eINSTANCE.createReqIFHeader();
		header.setSourceToolId("Papyrus Req");
		header.setReqIFVersion("1.0.1");
		header.setCreationTime((GregorianCalendar) GregorianCalendar.getInstance());
		header.setComment("generated by Papyrus Requirement from "+UMLModel.eResource().getURI().lastSegment());
		header.setTitle(UMLModel.getName());
		header.setReqIFToolId("Papyrus Req");
		reqIFModel.setTheHeader(header);
		ReqIFContent reqIFContent= ReqIF10Factory.eINSTANCE.createReqIFContent();
		reqIFModel.setCoreContent(reqIFContent);
		reqIFResource.getContents().add(reqIFModel);
		createBasicDataType(reqIFModel);
		try {
			reqIFResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return reqIFModel;
	}

	/**create Basic Dataty
	 * 
	 * @param reqIFModel the given ReqIF model
	 */
	protected void createBasicDataType(ReqIF reqIFModel) {
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setLongName("String");
		datatypeDefinitionString.setDesc("String that been written by Papyrus Req");
		datatypeDefinitionString.setMaxLength(new BigInteger(""+Integer.MAX_VALUE));
		datatypeDefinitionString.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
		reqIFModel.getCoreContent().getDatatypes().add(datatypeDefinitionString);


		datatypeDefinitionBoolean = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionBoolean();
		datatypeDefinitionBoolean.setLongName("Boolean");
		datatypeDefinitionBoolean.setDesc("Boolean that been written by Papyrus Req");
		datatypeDefinitionBoolean.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
		reqIFModel.getCoreContent().getDatatypes().add(datatypeDefinitionBoolean);


		datatypeDefinitionReal = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionReal();
		datatypeDefinitionReal.setLongName("Real");
		datatypeDefinitionReal.setDesc("Real that been written by Papyrus Req");
		datatypeDefinitionReal.setAccuracy(new BigInteger(""+Double.SIZE));
		datatypeDefinitionReal.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
		datatypeDefinitionReal.setMax(Double.MAX_VALUE);
		datatypeDefinitionReal.setMin(Double.MIN_VALUE);
		reqIFModel.getCoreContent().getDatatypes().add(datatypeDefinitionReal);

		datatypeDefinitionInteger = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionInteger();
		datatypeDefinitionInteger.setLongName("Integer");
		datatypeDefinitionInteger.setDesc("Integer that been written by Papyrus Req");
		datatypeDefinitionInteger.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
		datatypeDefinitionInteger.setMax( new BigInteger(""+Integer.MAX_VALUE));
		datatypeDefinitionInteger.setMin(new BigInteger(""+Integer.MIN_VALUE));
		reqIFModel.getCoreContent().getDatatypes().add(datatypeDefinitionInteger);

		datatypeDefinitionXHTML = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionXHTML();
		datatypeDefinitionXHTML.setLongName("XHTML");
		datatypeDefinitionXHTML.setDesc("XHTML that been written by Papyrus Req");
		datatypeDefinitionXHTML.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
		reqIFModel.getCoreContent().getDatatypes().add(datatypeDefinitionXHTML);

	}

	/**
	 * transform stereotyped class to SpecObject
	 * @param reqIFModel the ReqIFModel
	 * @param reqStereotypes the list of stereotype that represent Requirements
	 * @param createdReqiFType the list of created ReqIF Types
	 * @param clazz the current stereotyped Class
	 * @return the created SpecObject, can be null
	 */
	protected SpecObject exportSpecObjects(ReqIF reqIFModel,HashMap<String,Stereotype> reqStereotypes, HashMap<String, SpecType> createdReqiFType, Element clazz) {
		List<Stereotype> appliedStereotypes=clazz.getAppliedStereotypes();
		for(Stereotype appliedstereotype : appliedStereotypes) {
			if(reqStereotypes.values().contains(appliedstereotype)){
				SpecObject reqinReqIF=ReqIF10Factory.eINSTANCE.createSpecObject();
				reqinReqIF.setType((SpecObjectType)createdReqiFType.get(appliedstereotype.getName()));
				reqinReqIF.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
				element_SpecObject.put(clazz, reqinReqIF);
				if( clazz instanceof NamedElement){
					reqinReqIF.setLongName(((NamedElement)clazz).getName());
				}

				reqIFModel.getCoreContent().getSpecObjects().add(reqinReqIF);
				exportAttributeValues(createdReqiFType, clazz, appliedstereotype, reqinReqIF);

				return reqinReqIF;
			}//know sterotypes

		}//look for applied stereotype
		return null;
	}

	/**
	 * 
	 * @param createdReqiFType
	 * @param clazz hte  UML element that will be translated
	 * @param appliedstereotype the stereotype that has bee, applied
	 * @param reqinReqIF the ReqIF element
	 */
	protected void exportAttributeValues(HashMap<String, SpecType> createdReqiFType, Element clazz, Stereotype appliedstereotype, SpecElementWithAttributes reqinReqIF) {
		for(Property property : appliedstereotype.getAllAttributes()) {
			if( clazz.getValue(appliedstereotype, property.getName())!=null){
				if(property.getType()!=null){
					//look for SpecAttribute
					AttributeDefinition currentAttributeDefinition=null;
					currentAttributeDefinition = getAttributeDefinition(createdReqiFType, appliedstereotype, property.getName());
					if( currentAttributeDefinition!=null){
						if( property.getType().getName().equals("String")){
							String value= (String)clazz.getValue(appliedstereotype, property.getName());
							value = filterHtml(value);
							AttributeValueString attributeString=ReqIF10Factory.eINSTANCE.createAttributeValueString();
							attributeString.setDefinition((AttributeDefinitionString)currentAttributeDefinition);
							attributeString.setTheValue( value);
							reqinReqIF.getValues().add(attributeString);
						}
						if( property.getType().getName().equals("Integer")){
							AttributeValueInteger attribute=ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
							attribute.setDefinition((AttributeDefinitionInteger)currentAttributeDefinition);
							attribute.setTheValue( new BigInteger(""+clazz.getValue(appliedstereotype, property.getName())));

							reqinReqIF.getValues().add(attribute);
						}
						if( property.getType().getName().equals("Boolean")){
							AttributeValueBoolean attribute=ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
							attribute.setDefinition((AttributeDefinitionBoolean)currentAttributeDefinition);
							attribute.setTheValue( (Boolean)clazz.getValue(appliedstereotype, property.getName()));

							reqinReqIF.getValues().add(attribute);
						}
						if( property.getType().getName().equals("Real")){
							AttributeValueReal attribute=ReqIF10Factory.eINSTANCE.createAttributeValueReal();
							attribute.setDefinition((AttributeDefinitionReal)currentAttributeDefinition);
							attribute.setTheValue( (Double)clazz.getValue(appliedstereotype, property.getName()));

							reqinReqIF.getValues().add(attribute);
						}
						if( property.getType().getName().equals("XHTML")){
							AttributeValueXHTML attribute=ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
							attribute.setDefinition((AttributeDefinitionXHTML)currentAttributeDefinition);
							String value= (String)clazz.getValue(appliedstereotype, property.getName());
							value = filterHtml(value);
							XhtmlDivType xmlDivType=ProrXhtmlSimplifiedHelper.stringToSimplifiedXhtml(value);
							XhtmlContent xhtmlContent=ReqIF10Factory.eINSTANCE.createXhtmlContent();
							xhtmlContent.setXhtml(xmlDivType);
							attribute.setTheValue(xhtmlContent);

							reqinReqIF.getValues().add(attribute);
						}

						if( property.getType() instanceof Enumeration){
							AttributeValueEnumeration attribute=ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();

							DatatypeDefinitionEnumeration datatypeDefinitionEnumeration=reqifDatatTypeEnumeration.get(property.getType().getName());
							EnumValue currentEnumValue=null;
							for(EnumValue enumValue:datatypeDefinitionEnumeration.getSpecifiedValues()){
								if( enumValue.getLongName().equals(((EnumerationLiteral)(clazz.getValue(appliedstereotype, property.getName()))).getName())){
									currentEnumValue=enumValue;
								}
							}
							attribute.setDefinition((AttributeDefinitionEnumeration)(currentAttributeDefinition));
							attribute.getValues().add(currentEnumValue);
							reqinReqIF.getValues().add(attribute);
						}

					}//currentAttributeDefinition !null
				}//property.getType()!=null

			}//value of the property not null
		}//loop on properties
	}
/**
 * from a string that represent HTML 
 * @param value the given HTML string
 * @return the valued without header
 */
	protected String filterHtml(String value) {
		if( value.toLowerCase().contains("<html")|| value.toLowerCase().contains("<xhtml")){

			value=value.replaceAll("</xhtml:XhtmlDivType>", "");
			value=value.replaceAll("<xhtml:XhtmlDivType xmlns:xhtml=\"http://www.w3.org/1999/xhtml\">", "");
			value=value.replaceAll("<xhtml:XhtmlDivType>", "");

		}
		return value;
	}

	/**
	 * get an attributed definition from applied stereotype and the name of the attribute
	 * @param createdReqiFType the list of created ReqIf types
	 * @param appliedstereotype the stereotype that has an attribute with the name property name
	 * @param propertyName the named of the researched attribute definition
	 * @return return the attribute definition or null if not found
	 */
	protected AttributeDefinition getAttributeDefinition(HashMap<String, SpecType> createdReqiFType, Stereotype appliedstereotype, String propertyName ) {
		AttributeDefinition currentAttributeDefinition=null;
		List<AttributeDefinition> specAttribtutes=createdReqiFType.get(appliedstereotype.getName()).getSpecAttributes();
		for(AttributeDefinition attributeDefinition : specAttribtutes) {
			if( attributeDefinition.getLongName().equals(propertyName)){
				currentAttributeDefinition = attributeDefinition;
			}
		}
		return currentAttributeDefinition;
	}

	/**
	 * export a stereotype based on dependency to SpecRelation Type
	 * @param reqIFModel the reqIf model
	 * @param adependencyStereotype a given stereotype based on dependency
	 */
	protected void exportSpecRelationType(ReqIF reqIFModel, Stereotype adependencyStereotype) {
		SpecRelationType aSpecRealtionType=ReqIF10Factory.eINSTANCE.createSpecRelationType();
		aSpecRealtionType.setLongName(adependencyStereotype.getName());
		if(adependencyStereotype.getOwnedComments().size()>0){
			aSpecRealtionType.setDesc(adependencyStereotype.getOwnedComments().get(0).getBody());
		}
		else{
			aSpecRealtionType.setDesc("no Description");
		}
		aSpecRealtionType.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
		aSpecRealtionType.setIdentifier(EcoreUtil.getID(adependencyStereotype));
		reqIFModel.getCoreContent().getSpecTypes().add(aSpecRealtionType);
		//createHTML Attribute
		//		
		//add Attributes... simple Attribute
		exporttoAttributeType(adependencyStereotype, aSpecRealtionType);
		reqiFSpecRelationTypeMap.put(aSpecRealtionType.getLongName(), aSpecRealtionType);

	}

	/**
	 * transform Stereotype to SpecObjectType with Attributes
	 * @param reqIFModel  the ReqIF model
	 * @param createdReqiFType the HaspMap of SpecObjectTypes 
	 * @param stereotype the current stereotype to transform into SpecObjectTypes
	 */
	protected void exportSpecObjectTypes(ReqIF reqIFModel, HashMap<String, SpecType> createdReqiFType, Stereotype stereotype) {
		SpecObjectType specObjectType=ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setLongName(stereotype.getName());
		if(stereotype.getOwnedComments().size()>0){
			specObjectType.setDesc(stereotype.getOwnedComments().get(0).getBody());
		}
		else{
			specObjectType.setDesc("no Description");
		}
		specObjectType.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
		specObjectType.setIdentifier(EcoreUtil.getID(stereotype));
		reqIFModel.getCoreContent().getSpecTypes().add(specObjectType);
		//createHTML Attribute
		//		
		//add Attributes... simple Attribute
		exporttoAttributeType(stereotype, specObjectType);
		createdReqiFType.put(specObjectType.getLongName(), specObjectType);
	}

	/**
	 * from a stereotype export all its attribute to attribute definition of a given SpecType
	 * @param stereotype the stereotype
	 * @param specType the SpecType
	 */
	protected void exporttoAttributeType(Stereotype stereotype, SpecType specType) {
		for(Property property : stereotype.getAllAttributes()) {
			if(property.getType()!=null){
				if( property.getType().getName().equals("String")){
					AttributeDefinitionString attribute=ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
					attribute.setLongName(property.getName());
					attribute.setEditable(true);
					attribute.setIdentifier(EcoreUtil.getID(property));
					attribute.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
					attribute.setType(datatypeDefinitionString);
					specType.getSpecAttributes().add(attribute);
				}

				if( property.getType().getName().equals("Integer")){
					AttributeDefinitionInteger attribute=ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger();
					attribute.setLongName(property.getName());
					attribute.setEditable(true);
					attribute.setIdentifier(EcoreUtil.getID(property));
					attribute.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
					attribute.setType(datatypeDefinitionInteger);
					specType.getSpecAttributes().add(attribute);
				}
				if( property.getType().getName().equals("Boolean")){
					AttributeDefinitionBoolean attribute=ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
					attribute.setLongName(property.getName());
					attribute.setEditable(true);
					attribute.setIdentifier(EcoreUtil.getID(property));
					attribute.setType(datatypeDefinitionBoolean);
					attribute.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
					specType.getSpecAttributes().add(attribute);
				}
				if( property.getType().getName().equals("Real")){
					AttributeDefinitionReal attribute=ReqIF10Factory.eINSTANCE.createAttributeDefinitionReal();
					attribute.setLongName(property.getName());
					attribute.setEditable(true);
					attribute.setIdentifier(EcoreUtil.getID(property));
					attribute.setType(datatypeDefinitionReal);
					attribute.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
					specType.getSpecAttributes().add(attribute);
				}
				if( property.getType().getName().equals("XHTML")){
					AttributeDefinitionXHTML attribute=ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
					attribute.setLongName(property.getName());
					attribute.setEditable(true);
					attribute.setType(datatypeDefinitionXHTML);
					attribute.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
					specType.getSpecAttributes().add(attribute);
				}

				if( property.getType() instanceof Enumeration){
					AttributeDefinitionEnumeration attribute=ReqIF10Factory.eINSTANCE.createAttributeDefinitionEnumeration();
					attribute.setLongName(property.getName());
					attribute.setEditable(true);
					attribute.setIdentifier(EcoreUtil.getID(property));
					if(property.getUpper()==-1){
						attribute.setMultiValued(true);
					}
					else{
						attribute.setMultiValued(false);
					}
					attribute.setLastChange((GregorianCalendar)GregorianCalendar.getInstance());
					attribute.setType(reqifDatatTypeEnumeration.get(property.getType().getName()));
					specType.getSpecAttributes().add(attribute);
				}
			}


		}
	}
}
