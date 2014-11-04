package org.eclipse.papyrus.tests.framework.performance;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.junit.Assert;

public class PapyrusPerformanceTestLog {

	public static void registerTestLog(String currentTestInExecutionName,
			long testDurationMs) throws IOException {

		// Load UML model
		File umlFile = new File("model/basicUseCases4Perf.uml");

		// URI uri = URI.createPlatformPluginURI("/org.eclipse.papyrus.tests.framework/model/basicUseCases4Perf.uml", true);
		// String fileString = uri.toFileString();
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		URI utpURI = URI.createURI("platform:/plugin/org.omg.utp/utp_1-2.profile.uml");
		Resource utpResource = resourceSet.getResource(utpURI, true);
		Profile utpProfile = (Profile) utpResource.getContents().get(0);
		resourceSet.getPackageRegistry().put("http://utp_1-2.profile.uml", utpProfile.getDefinition());
		// Resource utpResource = resourceSet.getResource(URI.createPlatformPluginURI("/org.omg.utp/utp_1-2.profile.uml", true), true);
		//
		// resourceSet.getPackageRegistry().put("http://utp_1.2.profile.uml", utpResource.getContents().get(0));
		Resource umlResource = resourceSet.getResource(URI.createFileURI(umlFile.getAbsolutePath()), true);
		EcoreUtil.resolveAll(resourceSet);
		Model umlModel = (Model) umlResource.getContents().get(0);
		Model testStructureModel = null;

		// Find proper test case operation
		testStructureModel = (Model) umlModel.getOwnedMember("Test Structure");
		Class basicPerfTestCaseClass = (Class) testStructureModel.getOwnedMember("BasicPerfTestCases");
		EList<Operation> ownedOperations = basicPerfTestCaseClass.getOwnedOperations();
		Operation currentTestCaseInExecution = null;
		for (Operation operation : ownedOperations) {
			if (operation.getName().equals(currentTestInExecutionName)) {
				currentTestCaseInExecution = operation;
				break;
			}
		}
		Assert.assertNotNull("The executed test", currentTestCaseInExecution);

		// Register test execution
		Activity method = (Activity) currentTestCaseInExecution.getMethods().get(0);
		EList<Stereotype> appliedStereotypes = method.getAppliedStereotypes();
		if (!appliedStereotypes.isEmpty())
		{
			Stereotype testLogStereotype = appliedStereotypes.get(0);
			method.setValue(testLogStereotype, "duration", String.valueOf(testDurationMs) + "ms");
			method.setValue(testLogStereotype, "executionAt", String.valueOf(new Date()));

		} else {
			throw new Error("The TestLog stereotype is not applied!");
		}

		// Save the changes
		umlResource.save(Collections.EMPTY_MAP);
	}

}
