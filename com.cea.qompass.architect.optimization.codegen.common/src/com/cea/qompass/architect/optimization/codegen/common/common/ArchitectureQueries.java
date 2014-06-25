/*****************************************************************************
 * Copyright (c) 2013 PROTEUS Project consortium.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Nicolas DU LAC (INTEMPORA) - Initial API and implementation
 *
 *****************************************************************************/
package com.cea.qompass.architect.optimization.codegen.common.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SaCommHost;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SaExecHost;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SaStep;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Stereotype;

/**
 * 
 * @author scdtnsm
 * 
 */
@SuppressWarnings("unused")
public class ArchitectureQueries {

	/**
	 * Checks whether or not a port is a "source port" from the point of view of
	 * a given connector. A source port can be an output port for a connector
	 * stepping out of a component or it can be an input port for a connector
	 * linking a component model input port to a component input port inside the
	 * component model (e.g. from the model boundaries to a component inside the
	 * model).
	 */
	static private boolean isSourcePort(ConnectorEnd end, Port p) {
		return (end.getPartWithPort() == null || end.getPartWithPort() != null);

	}

	/**
	 * Return true if a given class has specified stereotype.
	 */
	static public Boolean hasStereotype(org.eclipse.uml2.uml.Element cl,
			String s) {
		for (Stereotype st : cl.getAppliedStereotypes()) {
			if (st.getName().equals(s)) {
				return true;
			}
		}
		return false;

	}

	/*
	 * static public int countOccurenceSastep(org.eclipse.uml2.uml.Package pack)
	 * { int i=0; //String st=""; for (Element subpack :
	 * pack.getOwnedElements()) { if (hasStereotype(subpack,
	 * "GaAnalysisContext")) { //st= st+((Classifier)subpack).getName(); for
	 * (Element sa : subpack.getOwnedElements()) { if (sa instanceof Activity )
	 * { if (hasStereotype(sa, "GaWorkloadBehavior")) { for (Element subsa :
	 * sa.getOwnedElements()) { if (hasStereotype(subsa, "SaStep") && subsa
	 * instanceof CallBehaviorAction) { i++; } }
	 * 
	 * }
	 * 
	 * } } }
	 * 
	 * } return i;
	 * 
	 * 
	 * }
	 */

	// static public Integer countOccurenceSastep(
	// org.eclipse.uml2.uml.Package pack) {
	// List<SaStepImpl> my_list = new LinkedList<SaStepImpl>();
	// List<Integer> my_list2 = new LinkedList<Integer>();
	//
	// Object i = 0;
	// // String st="";
	//
	// Stereotype stereo =
	// pack.getAppliedStereotype("OptimizationProfile::Deployment");
	// i = pack.getValue(stereo, "applicationElements");
	// Integer s = 0;
	// Object j;
	// if (i instanceof EList) {
	// for (Object ele : (EList) i) {
	// // if (hasStereotype((Element) ele, "SaStep") )
	// if (ele instanceof SaStepImpl) {
	// my_list.add((SaStepImpl) ele);
	//
	// NamedElement g = ((SaStepImpl) ele)
	// .getBase_NamedElement();
	// s++;
	// }
	//
	// }
	// my_list2.add(s);
	// // ((EList) i).get(0);
	//
	// // my_list.add((Element) i);
	// }
	//
	// return s;
	//
	// }

	//
	/*
	 * static public List<Integer> countOccurenceSastep(
	 * org.eclipse.uml2.uml.Package clas) { if (hasStereotype(clas,
	 * "Deployment")) { Stereotype stereo =
	 * subpack3.getAppliedStereotype("OptimizationProfile::Deployment"); i =
	 * subpack3.getValue(stereo, "applicationElements"); Integer s = 0; Object
	 * j; if (i instanceof EList) { for (Object ele : (EList) i) { // if
	 * (hasStereotype((Element) ele, "SaStep") ) if (ele instanceof SaStepImpl)
	 * { my_list.add((SaStepImpl) ele);
	 * 
	 * NamedElement g = ((SaStepImpl) ele).getBase_NamedElement(); s++; }
	 * 
	 * } my_list2.add(s); // ((EList) i).get(0);
	 * 
	 * // my_list.add((Element) i); } }
	 * 
	 * 
	 * 
	 * return my_list2; }
	 */

	static public EList<org.eclipse.uml2.uml.Class> getDeploymentFunctions(
			org.eclipse.uml2.uml.Package pack) {
		EList<org.eclipse.uml2.uml.Class> my_list = new BasicEList<org.eclipse.uml2.uml.Class>();
		// List<Integer> my_list2 = new LinkedList<Integer>();

		Object i = 0;
		// String st="";
		for (Element subpack2 : pack.getOwnedElements()) {
			if (hasStereotype(subpack2, "OptimizationProblems")) {
				for (Element innerClass : subpack2.getOwnedElements()) {
					if ((innerClass instanceof Class)
							&& hasStereotype(innerClass, "Deployment")) {
						my_list.add((org.eclipse.uml2.uml.Class) innerClass);
					}
				}
			}
		}

		return my_list;
	}

	static public org.eclipse.uml2.uml.Class getOptimizationProblems(
			org.eclipse.uml2.uml.ObjectNode obj) {
		EList<org.eclipse.uml2.uml.Class> my_list = new BasicEList<org.eclipse.uml2.uml.Class>();
		// List<Integer> my_list2 = new LinkedList<Integer>();

		Object obj1;

		if (obj instanceof Element) {
			Element element = (Element) obj;
			Element owner = obj.getOwner();
			if (hasStereotype(owner, "OptimizationProblems")
					&& (element instanceof org.eclipse.uml2.uml.Class)) {
				return (org.eclipse.uml2.uml.Class) obj;
			}
		}
		return null;

	}

	static public Integer countOccurenceFunction(
			org.eclipse.uml2.uml.Class class1) {

		EList<SaStepImpl> occurenceSastepList = new BasicEList<SaStepImpl>();
		// my_list = getDeploymentFunctions(pack);

		Stereotype stereo = class1
				.getAppliedStereotype("OptimizationProfile::Deployment");
		if (stereo == null) {
			stereo = class1
					.getAppliedStereotype("OptimizationProfile::Configuration");
		}
		Object value = class1.getValue(stereo, "applicationElements");
		Integer saStepCount = 0;
		Object j;
		if (value instanceof EList) {
			for (Object ele : (EList) value) {
				// if (hasStereotype((Element) ele, "SaStep") )
				if (ele instanceof SaStepImpl) {
					occurenceSastepList.add((SaStepImpl) ele);

					NamedElement g = ((SaStepImpl) ele).getBase_NamedElement();
					saStepCount++;
				}

			}
			// my_list2.add(s);
			// ((EList) i).get(0);

			// my_list.add((Element) i);
		}
		return saStepCount;
	}

	static public Integer countNumberSignals(org.eclipse.uml2.uml.Class class1) {
		Package topLevelPackage = getTopLevelPackage(class1);
		Integer saComCount = 0;
		EList<PackageableElement> packagedElements = topLevelPackage
				.getPackagedElements();
		for (PackageableElement packagedElement : packagedElements) {
			if (packagedElement
					.getAppliedStereotype("MARTE::MARTE_AnalysisModel::GQAM::GaAnalysisContext") != null) {
				Package subpackage = (Package) packagedElement;
				EList<PackageableElement> packagedElements2 = subpackage
						.getPackagedElements();
				for (PackageableElement packageableElement : packagedElements2) {
					if (packageableElement
							.getAppliedStereotype("MARTE::MARTE_AnalysisModel::GQAM::GaWorkloadBehavior") != null) {
						for (Element signal : packageableElement
								.getOwnedElements()) {
							if ((signal instanceof ControlFlow)
									&& hasStereotype(signal, "SaCommStep")) {
								saComCount++;
							}
						}
					}
				}
			}
		}

		return saComCount;
	}

	static public Integer countNumberCpu(org.eclipse.uml2.uml.Class class1) {
		Stereotype stereo = class1
				.getAppliedStereotype("OptimizationProfile::Deployment");
		if (stereo == null) {
			stereo = class1
					.getAppliedStereotype("OptimizationProfile::Configuration");
		}
		Object value = class1.getValue(stereo, "platformElements");
		Integer SaExHost = 0;
		Object j;
		if (value instanceof EList) {
			for (Object obj : (EList) value) {
				if (obj instanceof SaExecHost) {
					SaExHost++;
				}
			}
		}
		return SaExHost;
	}

	static public EList<SaExecHost> getListOfCpu(
			org.eclipse.uml2.uml.Class class1) {
		Integer count = countOccurenceFunction(class1);
		int myTab[] = new int[count];

		EList<SaExecHost> my_list = new BasicEList<SaExecHost>();
		Stereotype stereo = class1
				.getAppliedStereotype("OptimizationProfile::Deployment");
		if (stereo == null) {
			stereo = class1
					.getAppliedStereotype("OptimizationProfile::Configuration");
		}
		Object value = class1.getValue(stereo, "platformElements");
		Integer SaExHost = 0;
		Object j;
		Integer i = 0;
		if (value instanceof EList) {
			for (Object obj : (EList) value) {
				if (obj instanceof SaExecHost) {
					my_list.add((SaExecHost) obj);
					myTab[i] = my_list.indexOf(obj);
					i++;
				}
			}
		}
		return my_list;
	}

	static public Integer countNumberBus(org.eclipse.uml2.uml.Class class1) {
		Stereotype stereo = class1
				.getAppliedStereotype("OptimizationProfile::Deployment");
		if (stereo == null) {
			stereo = class1
					.getAppliedStereotype("OptimizationProfile::Configuration");
		}
		Object value = class1.getValue(stereo, "platformElements");
		Integer SaCom = 0;
		Object j;
		if (value instanceof EList) {
			for (Object obj : (EList) value) {
				if (obj instanceof SaCommHost) {
					SaCom++;
				}
			}
		}
		return SaCom;
	}

	static public Integer countNumberPath(org.eclipse.uml2.uml.Class class1) {

		Package topLevelPackage = getTopLevelPackage(class1);
		Integer PathCount = 0;
		EList<PackageableElement> packagedElements = topLevelPackage
				.getPackagedElements();
		for (PackageableElement packagedElement : packagedElements) {
			if (packagedElement
					.getAppliedStereotype("MARTE::MARTE_AnalysisModel::GQAM::GaAnalysisContext") != null) {
				Package subpackage = (Package) packagedElement;
				EList<PackageableElement> packagedElements2 = subpackage
						.getPackagedElements();
				for (PackageableElement packageableElement : packagedElements2) {
					if (packageableElement
							.getAppliedStereotype("MARTE::MARTE_AnalysisModel::GQAM::GaWorkloadBehavior") != null) {
						for (Element signal : packageableElement
								.getOwnedElements()) {
							if (hasStereotype(signal, "SaEndToEndFlow")) {
								PathCount++;
							}
						}
					}
				}
			}
		}

		return PathCount;
	}

	static public EList<Action> getListOfFunctions(
			org.eclipse.uml2.uml.Class class1) {
		EList<Action> occurenceFunctionList = new BasicEList<Action>();
		Stereotype stereo = class1
				.getAppliedStereotype("OptimizationProfile::Deployment");
		if (stereo == null) {
			stereo = class1
					.getAppliedStereotype("OptimizationProfile::Configuration");
		}
		Object value = class1.getValue(stereo, "applicationElements");
		Integer saStepCount = 0;
		Object j;
		if (value instanceof EList) {
			for (Object ele : (EList) value) {
				// if (hasStereotype((Element) ele, "SaStep") )
				if (ele instanceof SaStep) {
					occurenceFunctionList.add(((SaStep) ele).getBase_Action());
					NamedElement g = ((SaStep) ele).getBase_NamedElement();

				}

			}
		}

		return occurenceFunctionList;
	}

	public static HashMap<Element, Integer> resourceRegistry = new HashMap<Element, Integer>();

	static public List<Constraint> getListOfConstraints(
			org.eclipse.uml2.uml.Class class1) {
		Package topLevelPackage = getTopLevelPackage(class1);
		Integer saComCount = 0;
		TreeIterator<EObject> contents = (TreeIterator<EObject>) topLevelPackage
				.eAllContents();
		ArrayList<Constraint> list = new ArrayList<Constraint>();
		while (contents.hasNext()) {
			EObject eObject = contents.next();
			if (eObject instanceof Element) {
				Element next = (Element) eObject;
				//System.out.println(next);
				if(hasStereotype(next, "DeploymentConstraint")){
					list.add((Constraint) next);
				}
			}
		}
		return list;
	}

	static public List<Integer> getFunctionConstraint(Action function,
			org.eclipse.uml2.uml.Class class1) {
		EObject sastep = function
				.getStereotypeApplication(function
						.getAppliedStereotype("MARTE::MARTE_AnalysisModel::SAM::SaStep"));

		// Stereotype stereo =
		// class1.getAppliedStereotype("OptimizationProfile::OptimizationConstraints");

		Package topLevelPackage = getTopLevelPackage(class1);
		Integer saComCount = 0;
		TreeIterator<EObject> allContents = topLevelPackage.eAllContents();
		while (allContents.hasNext()) {
			Element next = (Element) allContents.next();
			if (hasStereotype(next, "OptimizationProfile::DeploymentConstraint")) {

			}
		}

		EList<PackageableElement> packagedElements = topLevelPackage
				.getPackagedElements();
		for (PackageableElement packagedElement : packagedElements) {
			if (packagedElement
					.getAppliedStereotype("MARTE::MARTE_AnalysisModel::GQAM::GaAnalysisContext") != null) {
				Package subpackage = (Package) packagedElement;
				EList<PackageableElement> packagedElements2 = subpackage
						.getPackagedElements();
				for (PackageableElement packageableElement : packagedElements2) {
					if (packageableElement
							.getAppliedStereotype("MARTE::MARTE_AnalysisModel::GQAM::GaWorkloadBehavior") != null) {
						for (Element signal : packageableElement
								.getOwnedElements()) {
							if ((signal instanceof ControlFlow)
									&& hasStereotype(signal, "SaCommStep")) {
								saComCount++;
							}
						}
					}
				}
			}
		}

		Integer count = countOccurenceFunction(class1);
		EList<org.eclipse.uml2.uml.Class> my_list = new BasicEList<org.eclipse.uml2.uml.Class>();
		List<int[]> myList = new ArrayList<int[]>();
		Integer i = 0;
		List<Integer> resourceIdList = new ArrayList<Integer>();
		int myTab[] = new int[count];
		// int resourceId;
		// int myTab[int tab[]] = new int[count];
		// for (Element subclass : class1.getOwnedElements()) {
		// if (hasStereotype(subclass, "DeploymentConstraint")) {
		// Object deploymentConstraintSource =
		// subclass.getValue(stereo,"source");
		// Object deploymentConstraintTargets =
		// subclass.getValue(stereo,"target");
		// if (deploymentConstraintSource.equals(sastep)) {
		// if (deploymentConstraintTargets instanceof EList) {
		// for (Object target : (EList) deploymentConstraintTargets) {
		// my_list.add((Class) target);
		// myTab[i] = my_list.indexOf(target);
		//
		// if(!resourceRegistry.containsKey(target)){
		// resourceId = resourceRegistry.size() + 1;
		// resourceRegistry.put((Element) target, resourceId);
		// }else{
		// resourceId = resourceRegistry.get(target);
		// }
		//
		// }
		// }
		// }
		//
		// }
		// }
		// return resourceIdList;

		// int myTab[ ] = new int[];
		return null;
	}

	private static Package getTopLevelPackage(org.eclipse.uml2.uml.Class class1) {
		EObject eContainer = class1.eContainer();
		EObject currentTopLevelContainer = null;
		while (eContainer != null) {
			currentTopLevelContainer = eContainer;
			eContainer = eContainer.eContainer();
		}
		Package topLevelPackage = (org.eclipse.uml2.uml.Package) currentTopLevelContainer;
		return topLevelPackage;
	}
}
