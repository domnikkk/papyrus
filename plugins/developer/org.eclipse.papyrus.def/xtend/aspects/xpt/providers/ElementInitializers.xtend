/**
 * Copyright (c) 2007, 2014 Borland Software Corporation, CEA, and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 *    Artem Tikhomirov (Borland) - refactored javaInitilizers not to use methods from GMFGen model
 *                               [221347] Got rid of generated interfaces 
 *                               (IObjectInitializer, IFeatureInitializer) and implementation thereof
 *    Michael Golubev (Montages) - #386838 - migrate to Xtend2
 *    Christian W. Damus (CEA) - bug 440263
 */
package aspects.xpt.providers

import com.google.inject.Singleton
import org.eclipse.gmf.codegen.gmfgen.GenLink
import org.eclipse.gmf.codegen.gmfgen.GenNodeimport org.eclipse.gmf.codegen.gmfgen.GenFeatureValueSpec
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import java.util.List
import org.eclipse.gmf.codegen.gmfgen.GenLanguage
import com.google.inject.Inject
import metamodel.MetaModel
import xpt.expressions.AbstractExpression
import xpt.providers.ElementInitializers_qvto
import aspects.xpt.Common
import org.eclipse.gmf.codegen.gmfgen.GenFeatureSeqInitializer
import plugin.Activator

/**
 * XXX should generate this class only when there is initialization logic defined in the model
 */
@Singleton class ElementInitializers extends xpt.providers.ElementInitializers {

    @Inject extension Common;
    @Inject extension ElementInitializers_qvto;

	@Inject Activator xptActivator
    @Inject AbstractExpression xptAbstractExpression;
    @Inject MetaModel xptMetaModel

	/////////////////////////////////
	override dispatch CharSequence javaMethod(GenNode it) '''
	«IF !it.sansDomain»
	«javaMethod(it.modelFacet, it)»
	«ENDIF»
	'''

	override dispatch CharSequence javaMethod(GenLink it) '''
	«IF !it.sansDomain»
	«javaMethod(it.modelFacet, it)»
	«ENDIF»
	'''

    override dispatch CharSequence performInit(GenFeatureValueSpec it, GenCommonBase diagramElement, String instanceVar,
        GenClass instanceClass, List<Integer> counters) '''
        «IF it.value.provider.getLanguage() == GenLanguage::LITERAL_LITERAL»
            «xptMetaModel.modifyFeature(feature, instanceVar, instanceClass, value.body)»
            «extraLineBreak»
        «ELSE»
            «var expressionVarName = getVariableName('value', counters)»
            Object «expressionVarName» = «evaluateExpr(value.provider, diagramElement, it, instanceVar)»;
            «IF feature.listType»
                if («expressionVarName» instanceof java.util.Collection) {
                    «xptMetaModel.getFeatureValue(feature, instanceVar, instanceClass, true)».clear();
                    «IF feature.typeGenClassifier.expressionResultNeedsCast()»
                        for (java.util.Iterator it = ((java.util.Collection) «expressionVarName»).iterator(); it.hasNext(); ) {
                            Object next = «xptAbstractExpression.qualifiedClassName(diagramElement.getDiagram())».performCast(it.next(), «xptMetaModel.
            MetaClass(feature.typeGenClassifier)»);
                            «xptMetaModel.getFeatureValue(feature, instanceVar, instanceClass, true)».add((«xptMetaModel.
            QualifiedClassName(feature.typeGenClassifier/*XXX sorta hack, better would be MM::setFeatureValue that supports lists*/)») next);
                        }
                    «ELSE»
                        «xptMetaModel.getFeatureValue(feature, instanceVar, instanceClass, true)».addAll(((java.util.Collection) «expressionVarName»));
                    «ENDIF»
                } else if(«expressionVarName» != null) {
                    «IF feature.typeGenClassifier.expressionResultNeedsCast()»
                        «expressionVarName» = «xptAbstractExpression
            .qualifiedClassName(diagramElement.getDiagram())».performCast(«expressionVarName», «xptMetaModel.MetaClass(
            feature.typeGenClassifier)»);
                    «ENDIF»
                    «xptMetaModel.getFeatureValue(feature, instanceVar, instanceClass, true)».add((«xptMetaModel.
            QualifiedClassName(feature.typeGenClassifier/*XXX sorta hack, better would be MM::setFeatureValue that supports lists*/)») «expressionVarName»);
                }
            «ELSE»
                if(«expressionVarName» != null) {
                    «IF feature.typeGenClassifier.expressionResultNeedsCast()»
                        «extraLineBreak»
                        «expressionVarName» = «
                xptAbstractExpression.qualifiedClassName(diagramElement.getDiagram())».performCast(«expressionVarName», «xptMetaModel.MetaClass(
                feature.typeGenClassifier)»);
                    «ENDIF»
                        «xptMetaModel.setFeatureValue(feature, instanceVar, instanceClass, expressionVarName, true)»;
                }
            «ENDIF/*isListType*/»
        «ENDIF/*is literal expression*/»
    '''

	override dispatch CharSequence initMethod(GenFeatureSeqInitializer it, GenCommonBase diagramElement) '''
		«generatedMemberComment»
		public void init_«diagramElement.getUniqueIdentifier()»(«xptMetaModel.QualifiedClassName(elementClass)» instance) {
			try {
				«FOR i : it.initializers»
					«performInit(i, diagramElement, 'instance', elementClass, <Integer>newLinkedList(initializers.indexOf(i)))»
				«ENDFOR»
			} catch(RuntimeException e) {
				«xptActivator.qualifiedClassName(diagramElement.getDiagram().editorGen.plugin)».getInstance().logError("Element initialization failed", e); //$NON-NLS-1$
			}
		}
	'''
}
