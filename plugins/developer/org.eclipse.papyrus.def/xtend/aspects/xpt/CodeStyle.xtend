package aspects.xpt

import org.eclipse.gmf.codegen.gmfgen.GenCommonBase
import com.google.inject.Singleton

@Singleton class CodeStyle extends xpt.CodeStyle {

	override overrideI(GenCommonBase xptSelf) '''
		@Override
	'''

}