package org.eclipse.papyrus.tests.framework.m2t.xtend.templates

import java.util.Calendar
import java.util.List
import org.eclipse.uml2.uml.Class

class AllCanonicalTestsTemplate {
	def static generate(List<Class> classes) {
		val template = '''
			/*****************************************************************************
			 * Copyright (c) «Calendar.getInstance().get(Calendar.YEAR)» CEA LIST.
			 *
			 *    
			 * All rights reserved. This program and the accompanying materials
			 * are made available under the terms of the Eclipse Public License v1.0
			 * which accompanies this distribution, and is available at
			 * http://www.eclipse.org/legal/epl-v10.html
			 *
			 * This file has been generated automatically in the Papyrus Test Framework.
			 *
			 *****************************************************************************/
			package «classes.head.package.name»;

			import org.junit.runner.RunWith;
			import org.junit.runners.Suite;
			import org.junit.runners.Suite.SuiteClasses;
			
			/**
			 * All test in canonical package
			 */
			@RunWith(Suite.class)
			@SuiteClasses({
			«FOR Class clazz : classes»
			«clazz.name».class,
			«ENDFOR»	
			})
			public class AllCanonicalTestsGen {
			}
		'''
		return template;
	}
}
