package geoapp;



public class City extends GovernedRegion {
	
	private Country parentCountry;
	
	protected City(String name, Double area, Integer population, Country parentCountry) {
		super(name, area, population);
		
		this.setParentCountry(parentCountry);
		
	}

	public Country getParentCountry() {
		return parentCountry;
	}

	public void setParentCountry(Country parentCountry) {
		this.parentCountry = parentCountry;
	}
}
	
	
	
	
	
    


	
	

	
	
	

