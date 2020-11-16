package geoapp;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import geoapp.Country.GovForm;


public class GeoAppModel {
	
	private final SimpleObjectProperty<Country> countryProperty = new SimpleObjectProperty<>();
	private final SimpleObjectProperty<City> cityProperty = new SimpleObjectProperty<>();
	private final IntegerProperty countryID = new SimpleIntegerProperty(100);
	private final SimpleObjectProperty<String> countryName = new SimpleObjectProperty<String>();
	
	
	ObservableList<City> cities = FXCollections.observableArrayList();
	ObservableList<Country> countries = FXCollections.observableArrayList();
	
	
	public void saveCountry(String name, Double area, Integer population, Double suicideRate,GovForm govForm, String nationalMotto) {
		
		countryProperty.set(new Country (name, area, population, suicideRate, govForm, nationalMotto));
		countries.add(getCountry());
		
	}
	
	public void deleteCountry() {
		countries.remove(getCountry());
		countryProperty.set(null);

	}
	
	public Country getCountry() {
		return countryProperty.get();
	}
		
		
	public void saveCitytoArrayList (String name, Double area, Integer population, Country parentCountry) {
		cityProperty.set(new City (name, area, population, parentCountry));
		cities.add(getCity());
		
	}
	
	public City getCity() {
		return cityProperty.get();
	
}
	
	
	public void deleteCityfromArrayList() {
		cities.remove(getCity());
		countryProperty.set(null);
	}

	public IntegerProperty getCountryID() {
		return countryID;
	}

	public SimpleObjectProperty<String> getCountryName() {
		return countryName;
	}
    
	
}
	
	
