package geoapp;

public class GovernedRegion {
	
	// Represents any physical area that has a government

	public enum GovForm {ANARCHY, COMMUNISM, DEMOCRACY, MONARCHY, MILITARY_DICTAGORSHIP, TOTALITARIANISM};
	
	protected double area;
	protected int population;
	protected GovForm govForm; 
	
	
protected GovernedRegion(double area, int population, GovForm govForm) {
	
	this.area = area; 
	this.population = population;
	this.govForm = govForm;
}

	

public double getArea(){
	return area;
}

public void setArea(double area){
	this.area = area;
}

public int getPopulation(){
	return population;
}

public void setPopulation(int population)
{
	this.population=population;
}


public GovForm getgovForm(){
	return govForm;
}

public void setGovForm(GovForm govForm){
	this.govForm = govForm;
}

}
