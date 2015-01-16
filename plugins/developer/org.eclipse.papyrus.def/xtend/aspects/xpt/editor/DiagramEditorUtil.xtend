package aspects.xpt.editor

import com.google.inject.Inject
import xpt.Common
import org.eclipse.gmf.codegen.gmfgen.GenDiagram
import xpt.Externalizer
import xpt.CodeStyle
import metamodel.MetaModel
import plugin.Activator
import xpt.editor.GenDiagram_qvto
import com.google.inject.Singleton

@Singleton class DiagramEditorUtil extends xpt.editor.DiagramEditorUtil {
	
	@Inject extension Common
	@Inject extension CodeStyle
	@Inject extension GenDiagram_qvto
	
	@Inject Activator xptActivator
	@Inject Externalizer xptExternalizer
	@Inject MetaModel xptMetaModel
	
	override createDiagramMethod(GenDiagram it) '''
		«generatedMemberComment(
			(if(editorGen.application == null) 'This method should be called within a workspace modify operation since it creates resources.' else ''))»
		public static org.eclipse.emf.ecore.resource.Resource createDiagram(org.eclipse.emf.common.util.URI diagramURI,«IF standaloneDomainModel(
			it)» org.eclipse.emf.common.util.URI modelURI,«ENDIF» org.eclipse.core.runtime.IProgressMonitor progressMonitor) {
			org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain = org.eclipse.emf.workspace.WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain();
			progressMonitor.beginTask(«xptExternalizer.accessorCall(editorGen, i18nKeyForCreateDiagramProgressTask(it))», 3);
			final org.eclipse.emf.ecore.resource.Resource diagramResource = editingDomain.getResourceSet().createResource(diagramURI);
			«IF standaloneDomainModel(it)»
				final org.eclipse.emf.ecore.resource.Resource modelResource = editingDomain.getResourceSet().createResource(modelURI);
			«ELSEIF domainDiagramElement != null && hasDocumentRoot(it)/*for standalone models, we assume its resourcefactory would be able to set extendedMetaData option*/»
				((org.eclipse.emf.ecore.xmi.XMLResource) diagramResource).getDefaultSaveOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
				((org.eclipse.emf.ecore.xmi.XMLResource) diagramResource).getDefaultLoadOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			«ENDIF»
			final String diagramName = diagramURI.lastSegment();
			org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand command = new org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand(editingDomain, «xptExternalizer.
			accessorCall(editorGen, i18nKeyForCreateDiagramCommandLabel(it))», java.util.Collections.EMPTY_LIST) {
				«overrideC»
				protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
					«IF domainDiagramElement != null»
						«xptMetaModel.QualifiedClassName(domainDiagramElement)» model = createInitialModel();
						attachModelToResource(model, «IF standaloneDomainModel(it)»model«ELSE»diagram«ENDIF»Resource);
					«ENDIF»
					«extraLineBreak»
					org.eclipse.gmf.runtime.notation.Diagram diagram = org.eclipse.gmf.runtime.diagram.core.services.ViewService.createDiagram(
						«IF domainDiagramElement != null»
							«xptMetaModel.DowncastToEObject(domainDiagramElement, 'model')», 
						«ENDIF»
						«VisualIDRegistry::modelID(it)», «xptActivator.preferenceHintAccess(editorGen)»);
					if (diagram != null) {
						diagramResource.getContents().add(diagram);
						diagram.setName(diagramName);
						«IF domainDiagramElement != null»
							diagram.setElement(«xptMetaModel.DowncastToEObject(domainDiagramElement, 'model')»);
						«ENDIF»
					}
					
					try {
						«IF standaloneDomainModel(it)»modelResource.save(«callGetSaveOptions(it)»);«ENDIF»
						diagramResource.save(«callGetSaveOptions(it)»);
					} catch (java.io.IOException e) {
						«/* 
						 * TODO CommandResult.newErrorCommandResult(e) would be better? Or even throw ExecutionEx?
						 * */
						extraLineBreak»
						«xptActivator.qualifiedClassName(editorGen.plugin)».getInstance().logError("Unable to store model and diagram resources", e);  «nonNLS(1)»
					}
					return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult();
				}
			};
			try {
				org.eclipse.core.commands.operations.OperationHistoryFactory.getOperationHistory().execute(command, new org.eclipse.core.runtime.SubProgressMonitor(progressMonitor, 1), null);
			} catch (org.eclipse.core.commands.ExecutionException e) {
				«xptActivator.qualifiedClassName(editorGen.plugin)».getInstance().logError("Unable to create model and diagram", e);  «nonNLS(
			1)»
			}
			«IF editorGen.application == null»
				«IF standaloneDomainModel(it)»setCharset(org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(modelResource));«ENDIF»
				setCharset(org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(diagramResource));
			«ENDIF»
			return diagramResource;
		}
	'''
	
}