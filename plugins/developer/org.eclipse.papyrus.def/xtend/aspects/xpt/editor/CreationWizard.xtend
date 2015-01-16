package aspects.xpt.editor

import org.eclipse.gmf.codegen.gmfgen.GenDiagram
import xpt.Common
import com.google.inject.Inject
import xpt.CodeStyle
import xpt.editor.GenDiagram_qvto
import xpt.editor.CreationWizardPage
import xpt.Externalizer
import plugin.Activator
import xpt.editor.DiagramEditorUtil
import xpt.ExternalizerUtils_qvto
import com.google.inject.Singleton

@Singleton class CreationWizard extends xpt.editor.CreationWizard {
	
	@Inject extension Common
	@Inject extension CodeStyle
	@Inject extension ExternalizerUtils_qvto
	@Inject extension GenDiagram_qvto
	
	@Inject Activator xptActivator
	@Inject CreationWizardPage xptCreationWizardPage
	@Inject DiagramEditorUtil xptDiagramEditorUtil
	@Inject Externalizer xptExternalizer
	
	override CreationWizard(GenDiagram it) '''
		«copyright(editorGen)»
		package «packageName(it)»;
		
		«generatedClassComment»
		public class «className(it)»
				«extendsList(it)» «implementsList(it)» {
		
			«generatedMemberComment»
			private org.eclipse.ui.IWorkbench workbench;
			
			«generatedMemberComment»
			   protected org.eclipse.jface.viewers.IStructuredSelection selection;
			   
			«generatedMemberComment»
			protected «xptCreationWizardPage.qualifiedClassName(it)» diagramModelFilePage;
			
			«IF standaloneDomainModel(it)»
				«generatedMemberComment»
				protected «xptCreationWizardPage.qualifiedClassName(it)» domainModelFilePage;
			«ENDIF»
			
			«generatedMemberComment»
			protected org.eclipse.emf.ecore.resource.Resource diagram;
			
			«generatedMemberComment»
			private boolean openNewlyCreatedDiagramEditor = true;
			
			«generatedMemberComment»
			   public org.eclipse.ui.IWorkbench getWorkbench() {
			       return workbench;
			   }
			   
			«generatedMemberComment»
			public org.eclipse.jface.viewers.IStructuredSelection getSelection() {
			       return selection;
			}
			
			«generatedMemberComment»
			public final org.eclipse.emf.ecore.resource.Resource getDiagram() {
				return diagram;
			}
			
			«generatedMemberComment»
			public final boolean isOpenNewlyCreatedDiagramEditor() {
				return openNewlyCreatedDiagramEditor;
			}
			
			«generatedMemberComment»
			public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
				this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
			}
			
			«generatedMemberComment»
			public void init(org.eclipse.ui.IWorkbench workbench, org.eclipse.jface.viewers.IStructuredSelection selection) {
			       this.workbench = workbench;
			       this.selection = selection;
			setWindowTitle(«xptExternalizer.accessorCall(editorGen, titleKey(i18nKeyForCreationWizard(it)))»);
			setDefaultPageImageDescriptor(«xptActivator.qualifiedClassName(editorGen.plugin)».getBundledImageDescriptor(
					"icons/wizban/New«IF domainDiagramElement != null»«domainDiagramElement.genPackage.prefix»«ENDIF»Wizard.gif")); //$NON-NLS-1$
			setNeedsProgressMonitor(true);
			}
			
			«generatedMemberComment»
			public void addPages() {
				diagramModelFilePage = new «xptCreationWizardPage.qualifiedClassName(it)»(
						"DiagramModelFile", getSelection(), "«editorGen.diagramFileExtension»"); //$NON-NLS-1$ //$NON-NLS-2$
				diagramModelFilePage.setTitle(«xptExternalizer.accessorCall(editorGen,
			titleKey(i18nKeyForCreationWizardDiagramPage(it)))»);
				diagramModelFilePage.setDescription(«xptExternalizer.accessorCall(editorGen,
			descriptionKey(i18nKeyForCreationWizardDiagramPage(it)))»);
				addPage(diagramModelFilePage);
			«IF standaloneDomainModel(it)»
				
					domainModelFilePage = new «xptCreationWizardPage.qualifiedClassName(it)»(
							"DomainModelFile", getSelection(), "«editorGen.domainFileExtension»") { //$NON-NLS-1$ //$NON-NLS-2$
							
					«overrideC»
					public void setVisible(boolean visible) {
						if (visible) {
							String fileName = diagramModelFilePage.getFileName();
							fileName = fileName.substring(0, fileName.length() - ".«editorGen.diagramFileExtension»".length()); //$NON-NLS-1$
							setFileName(«xptDiagramEditorUtil.qualifiedClassName(it)».getUniqueFileName(
									getContainerFullPath(), fileName, "«editorGen.domainFileExtension»")); //$NON-NLS-1$
						}
						super.setVisible(visible);
					}
					};
					domainModelFilePage.setTitle(«xptExternalizer.accessorCall(editorGen,
			titleKey(i18nKeyForCreationWizardDomainPage(it)))»);
					domainModelFilePage.setDescription(«xptExternalizer.accessorCall(editorGen,
			descriptionKey(i18nKeyForCreationWizardDomainPage(it)))»);
					addPage(domainModelFilePage);
			«ENDIF»
			}
		
			«generatedMemberComment»
			public boolean performFinish() {
				org.eclipse.jface.operation.IRunnableWithProgress op =
			«IF editorGen.application == null»
				new org.eclipse.ui.actions.WorkspaceModifyOperation(null) {
					
					«overrideC»
					protected void execute(org.eclipse.core.runtime.IProgressMonitor monitor)
						throws org.eclipse.core.runtime.CoreException, InterruptedException {
			«ELSE»
				new org.eclipse.jface.operation.IRunnableWithProgress() {
					
					public void run(org.eclipse.core.runtime.IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
			«ENDIF»
			diagram = «xptDiagramEditorUtil.qualifiedClassName(it)».createDiagram(diagramModelFilePage.getURI(),
			«IF standaloneDomainModel(it)»
				domainModelFilePage.getURI(),
			«ENDIF»
			monitor);
			if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
				try {
					«xptDiagramEditorUtil.qualifiedClassName(it)».openDiagram(diagram);
				} catch (org.eclipse.ui.PartInitException e) {
					org.eclipse.jface.dialogs.ErrorDialog.openError(getContainer().getShell(),
							«xptExternalizer.accessorCall(editorGen, i18nKeyForCreationWizardOpenEditorError(it))», null, e.getStatus());
				}
			}
			}
			};
			try {
				getContainer().run(false, true, op);
			} catch (InterruptedException e) {
				return false;
			} catch (java.lang.reflect.InvocationTargetException e) {
				if (e.getTargetException() instanceof org.eclipse.core.runtime.CoreException) {
					org.eclipse.jface.dialogs.ErrorDialog.openError(getContainer().getShell(),
							«xptExternalizer.accessorCall(editorGen, i18nKeyForCreationWizardCreationError(it))», null,
							((org.eclipse.core.runtime.CoreException) e.getTargetException()).getStatus());
				} else {
					«xptActivator.qualifiedClassName(editorGen.plugin)».getInstance().logError(
							"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
				}
				return false;
			}
			return diagram != null;
			}
			«additions(it)»
		}
	'''
	
}