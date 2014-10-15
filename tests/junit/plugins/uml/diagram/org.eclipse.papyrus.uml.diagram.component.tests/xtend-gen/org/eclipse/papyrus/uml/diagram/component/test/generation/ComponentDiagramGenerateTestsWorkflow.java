package org.eclipse.papyrus.uml.diagram.component.test.generation;

import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.papyrus.tests.framework.mwe.GenerateTestsWorkflow;

@SuppressWarnings("all")
public class ComponentDiagramGenerateTestsWorkflow {
  public static void main(final String[] args) {
    final GenerateTestsWorkflow workflow = new GenerateTestsWorkflow();
    workflow.setUriPrefix("platform:/resource");
    ComponentDiagramGenerateTestsWorkflow.runWorkflow(workflow);
  }
  
  public static void runWorkflow(final GenerateTestsWorkflow workflow) {
    String _uriPrefix = workflow.getUriPrefix();
    String _plus = (_uriPrefix + "/org.eclipse.papyrus.uml.diagram.component/model/ComponentDiagram.gmfgen");
    workflow.setGmfgenUri(_plus);
    workflow.setTestSrcGenLocation("test-gen/");
    String _uriPrefix_1 = workflow.getUriPrefix();
    String _plus_1 = (_uriPrefix_1 + "/org.eclipse.papyrus.uml.diagram.component.tests/qvto/ComponentDiagramTest.qvto");
    workflow.setQvtoScriptUri(_plus_1);
    String _uriPrefix_2 = workflow.getUriPrefix();
    String _plus_2 = (_uriPrefix_2 + "/org.eclipse.papyrus.uml.diagram.component.tests/model/ComponentDiagramTest.uml");
    workflow.setTestModelUri(_plus_2);
    WorkflowContextImpl _workflowContextImpl = new WorkflowContextImpl();
    workflow.run(_workflowContextImpl);
  }
}
