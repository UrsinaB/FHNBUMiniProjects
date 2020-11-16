package geoapp;

public abstract class GovernedRegion {
	
	// Represents any physical area that has a name, an area, a population, a a suicide rate, a government form 

	
	
	

	protected String name; 
	protected Double area;
	protected Integer population;
	
	
	
	
protected GovernedRegion(String name, Double area, Integer population) {
	
	
	this.name = name; 
	this.area = area; 
	this.population = population;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	
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

public void setPopulation(int population){
	this.population=population;
}





}
