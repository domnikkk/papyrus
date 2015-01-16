package aspects.xpt.editor

import xpt.Common
import com.google.inject.Inject
import plugin.Activator
import org.eclipse.gmf.codegen.gmfgen.GenDiagram
import xpt.Externalizer
import xpt.ExternalizerUtils_qvto
import com.google.inject.Singleton

@Singleton class InitDiagramFileAction extends xpt.editor.InitDiagramFileAction {
	
	@Inject extension Common
	@Inject extension ExternalizerUtils_qvto
	
	@Inject Activator xptActivator
	@Inject xpt.editor.DiagramEditorUtil xptDiagramEditorUtil
	@Inject Externalizer xptExternalizer 
	
	override classBody_PDE(GenDiagram it) '''
			«generatedMemberComment»
		private org.eclipse.ui.IWorkbenchPart targetPart;
		
		«generatedMemberComment»
		private org.eclipse.emf.common.util.URI domainModelURI;
		
		«generatedMemberComment»
		public void setActivePart(org.eclipse.jface.action.IAction action, org.eclipse.ui.IWorkbenchPart targetPart) {
			this.targetPart = targetPart;
		}
		
		«generatedMemberComment»
		public void selectionChanged(org.eclipse.jface.action.IAction action, org.eclipse.jface.viewers.ISelection selection) {
			domainModelURI = null;
			action.setEnabled(false);
			if (selection instanceof org.eclipse.jface.viewers.IStructuredSelection == false || selection.isEmpty()) {
				return;
			}
			org.eclipse.core.resources.IFile file =
				(org.eclipse.core.resources.IFile) ((org.eclipse.jface.viewers.IStructuredSelection) selection).getFirstElement();
			domainModelURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			action.setEnabled(true);
		}
		
		«generatedMemberComment»
		private org.eclipse.swt.widgets.Shell getShell() {
			return targetPart.getSite().getShell();
		}
		
		«generatedMemberComment»
		public void run(org.eclipse.jface.action.IAction action) {
			org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain =
				org.eclipse.emf.workspace.WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain();
			«IF editorGen.sameFileForDiagramAndModel»
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
			«ELSE»
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet = editingDomain.getResourceSet();
			«ENDIF»
			org.eclipse.emf.ecore.EObject diagramRoot = null;
			try {
				org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(domainModelURI, true);
				diagramRoot = resource.getContents().get(0);
			} catch (org.eclipse.emf.common.util.WrappedException ex) {
				«xptActivator.qualifiedClassName(editorGen.plugin)».getInstance().logError(
					"Unable to load resource: " + domainModelURI, ex); «nonNLS(1)»
			}
			if (diagramRoot == null) {
				org.eclipse.jface.dialogs.MessageDialog.openError(getShell(), 
				             «xptExternalizer.accessorCall(editorGen, titleKey(i18nKeyForInitDiagramFileResourceErrorDialog()))»,
				             «xptExternalizer.accessorCall(editorGen, messageKey(i18nKeyForInitDiagramFileResourceErrorDialog()))»);
				return;
			}
			org.eclipse.jface.wizard.Wizard wizard = new «editorGen.diagram.getNewDiagramFileWizardQualifiedClassName()»(domainModelURI, diagramRoot, editingDomain);
			wizard.setWindowTitle(org.eclipse.osgi.util.NLS.bind(
					    «xptExternalizer.accessorCall(editorGen, i18nKeyForInitDiagramFileWizardTitle())»,
					    «VisualIDRegistry::modelID(editorGen.diagram)»));
			«xptDiagramEditorUtil.qualifiedClassName(editorGen.diagram)».runWizard(getShell(), wizard, "InitDiagramFile"); «nonNLS(
			1)»
		}
	'''
}