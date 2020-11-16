package geoapp;

import java.util.ArrayList;


public class Country extends GovernedRegion {
	
	public enum GovForm {ANARCHY, COMMUNISM, DEMOCRACY, MONARCHY, MILITARY_DICTAGORSHIP, TOTALITARIANISM};
	
	private static int highestIdentifier = 0;
	
	private final Integer IDENTIFIER;
	private GovForm govForm;
	protected String nationalMotto;
	private Double suicideRate;
	
	private static int getNextIdentifier() {
		return ++highestIdentifier;
	}
	


	protected Country(String name, Double area, Integer population, Double suicideRate, GovForm govForm, String nationalMotto) {
		super(name, area, population);
		
		this.IDENTIFIER = getNextIdentifier();
		this.nationalMotto = nationalMotto;
		this.govForm = govForm;
		this.suicideRate = suicideRate;
	}
	
	public Integer getIDENTIFIER(){
		return IDENTIFIER;
		
	}
	
	
	public double getSuicideRate() {
		return suicideRate;
	}


	public void setSuicideRate(double suicideRate) {
		this.suicideRate = suicideRate;
	}
	
	public GovForm getgovForm(){
		return govForm;
	}

	public void setGovForm(GovForm govForm){
		this.govForm = govForm;
	}

	public void setNationalMotto(String nationalMotto) {
		this.nationalMotto = nationalMotto;
	}

	public String getNationalMotto() {
		return nationalMotto;
	}
	
	@Override
	public String toString() {
	    return this.getName();
	}
	
}


	

