package fr.cea.list.lise.emfgen.maven.test;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.testng.annotations.*;

import fr.cea.list.lise.emfgen.maven.EmfGenMojo;

/**
 * @author CEA Tech - Francois Le Fevre
 * 2014
 */
public final class EmfGenMojoTest
{
   private EmfGenMojo mojo = null;

   @Parameters({"ecoreModel", "genModel", "outputDirectory", "isRelocate", "isGenModel", "isGenEdit", "isGenEditor", "isGenTests"})
   public EmfGenMojoTest(String ecoreModel, String genModel, String outputDirectory,Boolean isRelocate,  Boolean isGenModel, Boolean isGenEdit, Boolean isGenEditor, Boolean isGenTests )
   {
      mojo = new EmfGenMojo();
      mojo.setEcoreModel(ecoreModel);
      mojo.setGenModel(genModel);
      mojo.setOutputDirectory(outputDirectory);
      mojo.setIsRelocate(isRelocate);;
      mojo.setIsGenModel(isGenModel);
      mojo.setIsGenEdit(isGenEdit);
      mojo.setIsGenEditor(isGenEditor);
      mojo.setIsGenTests(isGenTests);
   }

   @Test
   public final void execute() throws MojoExecutionException,
                              MojoFailureException
   {
      mojo.execute();
   }
}
