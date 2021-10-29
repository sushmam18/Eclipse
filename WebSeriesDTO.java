package com.xworkz.dto;

 import com.xworkz.dp.constants.*;

  public class WebSeriesDTO 
  {
	    private String name;
		private Genre genre;
		private int numberOfCharacter;
		private float ratings;
		private int numberOfSeason;
		private int currentSeason;
		
		public WebSeriesDTO() {
			// TODO Auto-generated constructor stub
		}

		 public WebSeriesDTO(String name, Genre genre, int numberOfCharacter, float ratings, int numberOfSeason,
				int currentSeason) {
			super();
			this.name = name;
			this.genre = genre;
			this.numberOfCharacter = numberOfCharacter;
			this.ratings = ratings;
			this.numberOfSeason = numberOfSeason;
			this.currentSeason = currentSeason;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Genre getGenre() {
			return genre;
		}

		public void setGenre(Genre genre) {
			this.genre = genre;
		}

		public int getNumberOfCharacter() {
			return numberOfCharacter;
		}

		public void setNumberOfCharacter(int numberOfCharacter) {
			this.numberOfCharacter = numberOfCharacter;
		}

		public float getRatings() {
			return ratings;
		}

		public void setRatings(float ratings) {
			this.ratings = ratings;
		}

		public int getNumberOfSeason() {
			return numberOfSeason;
		}

		public void setNumberOfSeason(int numberOfSeason) {
			this.numberOfSeason = numberOfSeason;
		}

		public int getCurrentSeason() {
			return currentSeason;
		}

		public void setCurrentSeason(int currentSeason) {
			this.currentSeason = currentSeason;
		}
		
		
	}
	

