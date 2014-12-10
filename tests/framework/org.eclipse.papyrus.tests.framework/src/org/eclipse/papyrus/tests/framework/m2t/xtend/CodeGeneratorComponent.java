package org.eclipse.papyrus.tests.framework.m2t.xtend;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.papyrus.tests.framework.m2t.xtend.templates.PapyrusDiagramCanonicalTests;
import org.eclipse.uml2.uml.Model;

public class CodeGeneratorComponent extends WorkflowComponentWithModelSlot {

	private String tempSrcPath = null;
	private Log log = LogFactory.getLog(getClass());

	
	public String getTempSrcPath() {
		return tempSrcPath;
	}


	public void setTempSrcPath(String tempSrcPath) {
		this.tempSrcPath = tempSrcPath;
	}


	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		log.info("Generating code...");
		Object modelSlotContent = ctx.get(getModelSlot());
		Model model = null;
		if(modelSlotContent instanceof Model){
			model = (Model) modelSlotContent;
		}else if(modelSlotContent instanceof List){
			List<?> slotContentList = (List<?>) modelSlotContent;
			model = (Model) slotContentList.get(0);
		}
		if(model == null || !(model instanceof Model)){
			log.error("The input model for the generation was not loaded!");
		}
		EcoreUtil.resolveAll(model);
		PapyrusDiagramCanonicalTests.generate(model, tempSrcPath);
		log.info("The code was succesfully generated in " + tempSrcPath);
	}

}
