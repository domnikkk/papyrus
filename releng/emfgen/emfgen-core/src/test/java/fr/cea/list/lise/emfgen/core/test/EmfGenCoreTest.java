package fr.cea.list.lise.emfgen.core.test;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fr.cea.list.lise.emfgen.core.EmfGenerator;
import fr.cea.list.lise.emfgen.core.EmfGeneratorAppOptions;


/**
 * @author CEA Tech - Francois Le Fevre
 * 2014
 */
public class EmfGenCoreTest 
{
	private static Logger logger = Logger.getLogger(EmfGenCoreTest.class);


	/**
	 * Rigourous Test :-)
	 */
	@Parameters({"ecoreModel", "genModel", "outputDirectory"})
	@Test
	public void testApp(String ecoreModel, String genModel, String outputDirectory)
	{
		EmfGeneratorAppOptions myEmfGeneratorAppOptions = new EmfGeneratorAppOptions(genModel,ecoreModel,outputDirectory,false, true,true,true,true);
		EmfGenerator myEmfGenerator = new EmfGenerator();
		myEmfGenerator.execute(myEmfGeneratorAppOptions.getEmfModel(), myEmfGeneratorAppOptions.getEmfGeneratorOptions());
		HashMap<String,String> file2md5 = new HashMap<String,String>();
		/*
		String relativeRootPath = new String();
		//Loop over new generated files
		Iterator<File> iter =  FileUtils.iterateFiles(new File(outputDirectory), new String[]{"java"}, true);
		while(iter.hasNext()) {
			File file = (File) iter.next();
			FileInputStream fis;
			try {
				fis = new FileInputStream(file);
				String md5 = org.apache.commons.codec.digest.DigestUtils.md5Hex(fis);
				fis.close();
				logger.info(file.getAbsolutePath().split("target")[1]+":"+md5);
				file2md5.put(file.getAbsolutePath().split("target")[1], md5);
				if(relativeRootPath.length()==0){
					relativeRootPath=file.getAbsolutePath().split("target")[0];
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		relativeRootPath=relativeRootPath.replace("\\", "/");
		relativeRootPath=relativeRootPath+"../emfgen-parent/src/test/resources/predictedOutput";
		logger.info("relativeRootPath: "+relativeRootPath);
		Iterator<File> iter2 =  FileUtils.iterateFiles(new File(relativeRootPath), new String[]{"java"}, true);
		while(iter2.hasNext()) {
			File file = (File) iter2.next();
			FileInputStream fis;
			try {
				fis = new FileInputStream(file);
				String md5 = org.apache.commons.codec.digest.DigestUtils.md5Hex(fis);
				fis.close();
				logger.info(file.getAbsolutePath().split("predictedOutput")[1]+":"+md5);
				//Assert.assertEquals(md5,file2md5.get(file.getAbsolutePath().split("predictedOutput")[1]));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		 */


	}
}
