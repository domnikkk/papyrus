package org.eclipse.papyrus.tests.framework.m2t.xtend;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.AbstractEMFWorkflowComponent;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;

public class ResolveProxies extends AbstractEMFWorkflowComponent {

	@Override
	public void checkConfiguration(Issues arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor arg1,
			Issues arg2) {
		EObject model = (EObject) ctx.get(getModelSlot());
		GenEditorGenerator generator = (GenEditorGenerator) model;
		ResourceSet rs = generator.eResource().getResourceSet();
		EList<GenTopLevelNode> topLevelNodes = generator.getDiagram().getTopLevelNodes();
		for (GenTopLevelNode genTopLevelNode : topLevelNodes) {
			GenClass metaClass = genTopLevelNode.getModelFacet().getMetaClass();
			EcoreUtil.resolve(metaClass, rs);
			System.out.println(metaClass.toString());
		}
		
		ctx.set(getModelSlot(), model);
	}

}
