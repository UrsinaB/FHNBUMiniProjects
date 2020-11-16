package geoapp;


import javax.swing.event.ChangeListener;
import geoapp.Country.GovForm;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ObservableIntegerValue;
import javafx.event.ActionEvent;

public class GeoAppController {
	
	private GeoAppView view;
	private GeoAppModel model;

	public GeoAppController (GeoAppModel model, GeoAppView view) {
		this.model = model;
		this.view = view;

	
	
		view.btnSave.setOnAction(this::saveCountry);
		view.btnDelete.setOnAction(this::deleteCountry);
		view.btnUpdate.setOnAction(this :: showData);
		view.btnSaveCity.setOnAction(this::saveCity);
	}
	
	

	
	private void saveCountry (ActionEvent e) {
		
		String name = view.txtNameC.getText();
		String area = view.txtArea.getText();
		Double aread = Double.parseDouble(area);
		String population = view.txtPopulation.getText();
		Integer populationi = Integer.parseInt(population);
		GovForm govForm = view.cmbGovForm.getValue();
		String nationalMotto = view.txtNatMotto.getText();
		String suicideRate = view.txtSuicRate.getText();
		Double suicideRated = Double.parseDouble(suicideRate);
		
	model.saveCountry (name, aread, populationi, suicideRated, govForm, nationalMotto);
	updateView(model.getCountry());
	
	
	}
	
	
	private void deleteCountry(ActionEvent e) {
		model.deleteCountry();
		updateView(model.getCountry());
	}
	
	
	
	private void saveCity(ActionEvent e) {
		String name = view.txtNameCity.getText();
		Country parentCountry = (Country) view.chooseParentCountry.getValue();
		
		model.saveCitytoArrayList(name, null, null, parentCountry);
		updateCityView(model.getCity());
		
		
	}
	
	
	




	private void showData(ActionEvent e) {
		Country country = (Country) view.chooseCountries.getValue();
		view.lblDataCountName.setText(country.getName());
		view.lblDataArea.setText(Double.toString(country.getArea()));
		view.lblDataPopulation.setText(Integer.toString(country.getPopulation()));
		view.lblDataGovForm.setText(country.getgovForm().toString());
		view.lblDataNatMotto.setText(country.getNationalMotto());
		view.lblDataSuicRate.setText(Double.toString(country.getSuicideRate()));
	}
	
	
	
	
	private void updateView(Country country) {
		
			view.lblDataSavedCountries.setText(Integer.toString(model.countries.lastIndexOf(country)));
			view.lblDataArea.setText(Double.toString(country.getArea()));
			view.lblDataPopulation.setText(Integer.toString(country.getPopulation()));
			view.lblDataGovForm.setText(country.getgovForm().toString());
			view.lblDataNatMotto.setText(country.getNationalMotto());
			view.lblDataSuicRate.setText(Double.toString(country.getSuicideRate()));
			
			view.txtNameC.clear();
			view.txtArea.clear();
			view.txtPopulation.clear();
			view.txtNatMotto.clear();
			view.txtSuicRate.clear();
			
			if(model.countries.isEmpty()) {
				view.lblDataSavedCountries.setText(" ");
				view.lblDataCountName.setText(" ");
				view.lblDataArea.setText(" ");
				view.lblDataPopulation.setText(" ");
				view.lblDataGovForm.setText(" ");
				view.lblDataNatMotto.setText(" ");
				view.lblDataSuicRate.setText(" ");	
				
			}
			
	
		}
	
	private void updateCityView(City city) {
		
		view.lblDataCityName.setText(city.getName());
		view.lblDataParentCountry.setText(city.getParentCountry().toString());
			
	}
	}
		
	
			
			
	
	