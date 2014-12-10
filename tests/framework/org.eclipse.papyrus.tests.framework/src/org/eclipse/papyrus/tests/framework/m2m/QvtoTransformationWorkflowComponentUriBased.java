package org.eclipse.papyrus.tests.framework.m2m;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Test;

public class QvtoTransformationWorkflowComponentUriBased extends
		AbstractWorkflowComponent {

	private String transformationURI;
	private String outResourceURI;
	private ArrayList<String> inputSlots = new ArrayList<String>();

	public String getTransformationURI() {
		return transformationURI;
	}

	public void setTransformationURI(String transformationURI) {
		this.transformationURI = transformationURI;
	}

	public String getOutResourceURI() {
		return outResourceURI;
	}

	public void setOutResourceURI(String outResourceURI) {
		this.outResourceURI = outResourceURI;
	}

	public boolean addInputSlots(String c) {
		return inputSlots.add(c);
	}

	public ExecutionDiagnostic generate(List<? extends EObject> inObjects,
			URI transformationURI, URI outResourceURI, Issues issues)
			throws IOException {
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		Diagnostic loadTransformationDiagnostic = executor.loadTransformation();
		if (!loadTransformationDiagnostic.getMessage().equals("OK")) {
			issues.addError("Error loading the model transformation: "
					+ loadTransformationDiagnostic);
			return null;
		}
		ExecutionContextImpl context = new ExecutionContextImpl();
		ArrayList<ModelExtent> input = new ArrayList<ModelExtent>();
		for (EObject eObject : inObjects) {
			BasicModelExtent basicModelExtent = new BasicModelExtent();
			basicModelExtent.add(eObject);
			input.add(basicModelExtent);
		}
		issues.addInfo(new File("..").getAbsolutePath());
		ModelExtent output = new BasicModelExtent();
		input.add(output);
		ModelExtent[] modelParameters = input.toArray(new ModelExtent[] {});
		context = new ExecutionContextImpl();
		context.setConfigProperty("keepModeling", true);
		ExecutionDiagnostic result = executor.execute(context, modelParameters);
		if (result.getSeverity() == Diagnostic.OK) {
			List<EObject> outObjects = output.getContents();
			ResourceSet resourceSet2 = new ResourceSetImpl();
			Resource outResource = resourceSet2.createResource(outResourceURI);
			outResource.getContents().addAll(outObjects);
			outResource.save(Collections.emptyMap());
			issues.addInfo("Successful QVTO transformation, stored in "
					+ outResourceURI);
		} else {
			issues.addError(result.toString());
		}
		return result;
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		List<EObject> inObjects = new ArrayList<EObject>();
		for (String inputSlot : inputSlots) {

			inObjects.add((EObject) ctx.get(inputSlot));
		}
		try {
			generate(inObjects, URI.createURI(transformationURI),
					URI.createURI(outResourceURI), issues);
		} catch (IOException e) {
			issues.addError(e.getLocalizedMessage());
		}

	}

	@Override
	public void checkConfiguration(Issues issues) {
		if (inputSlots.isEmpty()) {
			issues.addError("No input slots given for the QVTO transformation");
		}
	}
	
	

}
