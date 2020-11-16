package geoapp;


import geoapp.Country.GovForm;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.Region;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;


public class GeoAppView {

		private Stage stage;
		private GeoAppModel model;
		
		// Controls for data processing -> declare as object attributes such as controller and view can use them
		
		// Text fields
		
		TextField txtNameC = new TextField();
		TextField txtArea = new TextField();
		TextField txtPopulation = new TextField();
		TextField txtNatMotto = new TextField();
		TextField txtSuicRate = new TextField();
		ComboBox<GovForm> cmbGovForm = new ComboBox<>();
		
		TextField txtNameCity = new TextField();
		TextField txtparantCountry = new TextField();
		
		
		Label lblDataSavedCountries = new Label ();
		Label lblDataCountName = new Label ();
		Label lblDataArea = new Label ();
		Label lblDataPopulation = new Label ();
		Label lblDataGovForm = new Label ();
		Label lblDataSuicRate = new Label ();
		Label lblDataNatMotto = new Label ();
		
		Label lblDataIdentifierCity = new Label ();
		Label lblDataCityName = new Label ();
		Label lblDataParentCountry = new Label ();
		
		// Controls Buttons
		
		
		Button btnSave = new Button("Save");
		Button btnDelete = new Button("Delete");
		Button btnUpdate = new Button ("Update");
		Label spinnerLabel = new Label ("Select Country Name");
		ComboBox<Country> chooseCountries = new ComboBox<>();
		
		Button btnSaveCity = new Button("Save City");
		ComboBox<Country> chooseParentCountry = new ComboBox<>();
		
		
		
		
		
		
		
		
            
		// Constructor
		

		public GeoAppView(Stage stage, GeoAppModel model) {
			this.stage = stage;
			this.model = model;
			
			// Outermost  GUI vertical organisation 
			// Border
			// Control Pane
			// CenterPanes 
			// Border
			
			VBox root = new VBox();
			
			Region topBorder = new Region();
			topBorder.setPrefSize(40, 40);
			Region betweenControlPanesCenterPanes = new Region();
			betweenControlPanesCenterPanes.setPrefHeight(20);
			Region bottomBorder = new Region();
			bottomBorder.setPrefSize (40, 40);
		
			
			root.getChildren().addAll(topBorder);
			root.getChildren().addAll(createControlPane());
			root.getChildren().addAll(betweenControlPanesCenterPanes);
			root.getChildren().addAll(createCenterPanes());
			root.getChildren().addAll(bottomBorder);
	

			Scene scene = new Scene(root);
			stage.setTitle("GeoApp");
			stage.setScene(scene);
			stage.show();
		}
		
		public void start() {
			stage.show();
		}
		
		
		// Creating Control Area Top of outermost organisation
		
		private Pane createControlPane() {
			
			GridPane controllers = new GridPane();
	
			Region spacerBetweenBtns = new Region();
			spacerBetweenBtns.setPrefWidth(20);
			Region spacerBetweenBtns2 = new Region();
			spacerBetweenBtns2.setPrefWidth(20);
			Region spacerBeforeBtns  = new Region();
			spacerBeforeBtns.setPrefWidth(20);
			Region spacerSpinner = new Region();
			spacerSpinner.setPrefWidth(350);
			Region spacerbetweenSLblandSpinner = new Region();
			spacerbetweenSLblandSpinner.setPrefWidth(20);
			Label andUpdateView = new Label("And update the View: ");
			
			chooseCountries.setItems(model.countries);
			
	
			controllers.add(spacerBeforeBtns, 0, 0);
			controllers.add(btnSave, 1, 0);
			controllers.add(spacerBetweenBtns, 2, 0);
			controllers.add(btnDelete, 3, 0);
			controllers.add(spacerSpinner,4,0);
			controllers.add(spinnerLabel, 5, 0);
			controllers.add(spacerbetweenSLblandSpinner,6,0);
			controllers.add(chooseCountries, 7, 0);
			controllers.add(spacerBetweenBtns2,8, 0);
			controllers.add(andUpdateView, 9, 0);
			controllers.add(btnUpdate, 10, 0);
			
			return controllers;
}
		
	
		private Pane createCenterPanes() {
			
			HBox centerPanes = new HBox();
			Region spacer1 = new Region();
			spacer1.setPrefWidth(120);
			Region spacer2 = new Region();
			spacer2.setPrefWidth(100);
			Region spacer3 = new Region();
			spacer3.setPrefWidth(50);
			Region spacer4 = new Region();
			spacer4.setPrefHeight(20);
			Region spacer5 = new Region();
			spacer5.setPrefHeight(20);
			
			VBox leftSideofGrid = new VBox();
			
			leftSideofGrid.getChildren().add(spacer4);
			leftSideofGrid.getChildren().add(createDataEntryPane());
			
			
			VBox rightSideofGrid = new VBox();
			
			rightSideofGrid.getChildren().add(spacer5);
			rightSideofGrid.getChildren().add(createDataDisplayPane());
			centerPanes.getChildren().addAll(spacer1);
			centerPanes.getChildren().addAll(leftSideofGrid);
			centerPanes.getChildren().addAll(spacer2);
			centerPanes.getChildren().addAll(rightSideofGrid);
			centerPanes.getChildren().addAll(spacer3);
			return centerPanes;
			
		}
		
		
		// create data entry area created as grid pane to the left of HBox

		private Pane createDataEntryPane() {
			GridPane pane = new GridPane();
			pane.setId("dataEntry");
			
			Label lblTitel = new Label (" -  -  -  -  -  - DATA ENTRY AREA COUNTRY -  -  -  -  -  -");
			Label lblCountName = new Label ("Country Name: ");
			Label lblArea = new Label ("Area: ");
			Label lblPopulation = new Label ("Population: ");
			Label lblGovForm = new Label ("Form of Government: ");
			Label lblNatMotto = new Label ("National Motto: ");
			Label lblSuicRate = new Label ("Suicide Rate: ");
			Label lblTitel2 = new Label (" -  -  -  -  -  - DATA ENTRY AREA CITY -  -  -  -  -  -");
			Label lblCityName = new Label ("City Name: ");
			Label lblParantCountry = new Label ("Country:  ");
			
			
			
			cmbGovForm.getItems().addAll(Country.GovForm.values());
			
			pane.setVgap(10);
			
			
			pane.add(lblTitel, 0, 1);
			
			
			pane.add(lblCountName, 0, 2);
			pane.add(txtNameC, 1, 2);
			
			
			pane.add(lblArea, 0, 4);
			pane.add(txtArea, 1, 4);
			
			pane.add(lblPopulation, 0, 6);
			pane.add(txtPopulation, 1, 6);
			
			pane.add(lblGovForm, 0, 8 );
			pane.add(cmbGovForm, 1, 8);
			
			
			pane.add(lblNatMotto, 0, 10);
			pane.add(txtNatMotto, 1, 10);
			
			
			pane.add(lblSuicRate, 0, 12);	
			pane.add(txtSuicRate, 1, 12);
			
			
			pane.add(lblTitel2, 0, 14);
			
			pane.add(btnSaveCity,0,15);
			
			
			pane.add(lblCityName, 0, 16);
			pane.add(txtNameCity, 1, 16);
			
			
			pane.add(lblParantCountry, 0, 18);
			pane.add(chooseParentCountry,1 ,18);
			
			
			return pane;
		}

		
		// Data display area created as grid pane to the right of HBox
		
		private Pane createDataDisplayPane() {
			GridPane pane = new GridPane();
			
			Label lblTitleDisplayCountry = new Label(" -  -  -  -  -  -   DATA DISPLAY AREA  -  -  -  -  -  ");
			Label lblCountriesSaved = new Label(" Saved Countries: ");
			Label lblCountName = new Label ("Country Name: ");
			Label lblArea = new Label ("Area: ");
			Label lblPopulation = new Label ("Population: ");
			Label lblGovForm = new Label ("Form of Government: ");
			Label lblNatMotto = new Label ("National Motto: ");
			Label lblSuicRate = new Label ("Suicide Rate: ");
			
			Region newRegion = new Region();
			newRegion.setPrefHeight(150);
			
			Label lblCityName = new Label("City Name: ");
			Label lblParentCountry = new Label ("Country: ");
			
			chooseParentCountry.setItems(model.countries);
			
			pane.setVgap(10);
			
			pane.add(lblTitleDisplayCountry, 0, 1);
			
			pane.add(lblCountriesSaved, 0, 0);
			pane.add(lblDataSavedCountries, 1,0);
			
			pane.add(lblCountName, 0, 2);
			pane.add(lblDataCountName, 1, 2);
			
			
			pane.add(lblArea, 0, 3);
			pane.add(lblDataArea, 1, 3);
			
			
			pane.add(lblPopulation, 0, 4);
			pane.add(lblDataPopulation, 1, 4);
			
			
			pane.add(lblGovForm, 0, 5);
			pane.add(lblDataGovForm, 1, 5);
			
			
			pane.add(lblNatMotto, 0, 6);
			pane.add(lblDataNatMotto, 1, 6);
			
			
			pane.add(lblSuicRate, 0, 7);
			pane.add(lblDataSuicRate, 1, 7);
			
			pane.add(newRegion, 0, 8);
			pane.add(lblCityName, 0, 9);
			pane.add(lblDataCityName, 1,9);
			
			
			pane.add(lblParentCountry, 0, 10);
			pane.add(lblDataParentCountry, 1, 10);
			
			
			
			
		
			return pane;
		
		  }

		
		}

    
		