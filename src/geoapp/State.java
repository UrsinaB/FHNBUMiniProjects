package geoapp;

	public class State extends GovernedRegion{
		
		
		public enum Shape {COMPACT, FRAGMENTED};
		public enum Boundaries {NATURAL, ARTIFICIAL};
		
		private Shape shape;
		private Boundaries boundaries; 
		private String nationalMotto;
		private Double suicideRate;
	}
