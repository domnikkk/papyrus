package aspects.metamodel

import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature
import com.google.inject.Inject
import metamodel.MetaModel_qvto
import com.google.inject.Singleton

@Singleton class MetaModel extends metamodel.MetaModel {
	
	@Inject extension MetaModel_qvto;
	
	override DeclareAndAssign2(GenClass it, String assignee, String src, GenClass srcMetaClass, GenFeature srcFeature, String srcExt, boolean needCast) //
		'''«getQualifiedInterfaceName(it)» «assignee» = «getFeatureValue(srcFeature, src, srcMetaClass)».«srcExt»;'''
	
}