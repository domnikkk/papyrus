/**
 * Created by CEA Tech - FL218080
 * 2014
 */
package fr.cea.list.lise.emfgen.core.proposal;

/**
 * @author CEA Tech - FL218080
 *
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		org.eclipse.emf.codegen.ecore.Generator myG = new org.eclipse.emf.codegen.ecore.Generator();
		
		String[] args2 = new String[2];
		args2[0]=new String("generate");
		args2[1]=new String("../emfgen-parent/src/test/resources/models/extlibrary/extlibrary.genmodel");
		myG.run(args2);
	} 
}
