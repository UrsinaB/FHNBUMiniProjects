package geoapp;

import javafx.application.Application;
import javafx.stage.Stage;

	
	public class GeoAppMVC extends Application {
		
		private GeoAppModel model;
		private GeoAppView view;
		private GeoAppController controller;
		
		public static void main(String[] args) {
			launch();
		}

		@Override
		public void start(Stage stage) throws Exception {
			model = new GeoAppModel();
			view = new GeoAppView(stage, model);
			controller = new GeoAppController (model, view);
			view.start();
		}
	}

