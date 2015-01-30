package fr.cea.list.lise.emfgen.core;

/**
 * @author CEA Tech - Francois Le Fevre
 * 2014
 */
public class EmfModel {
	
	private final String genModel;
	private final String ecore;

	public EmfModel(String genModel, String ecore) {
		super();
		this.genModel = genModel.replace("\\", "/");
		this.ecore = ecore.replace("\\", "/");
	}
	
	public String getGenModel() {
		return genModel;
	}
	public String getEcore() {
		return ecore;
	}

}
