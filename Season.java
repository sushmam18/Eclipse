package com.xworkz.dto;

public class Season {

	private String name;
	private String duration;
	private float temperature;
	private String feeling;
		
	public Season()
	{
		
	  System.out.println("no args");
	}
	
	
	public Season(String name, String duration, float temperature, String feeling) {
		super();
		this.name = name;
		this.duration = duration;
		this.temperature = temperature;
		this.feeling = feeling;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public float getTemperature() {
		return temperature;
	}


	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}


	public String getFeeling() {
		return feeling;
	}


	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}


	
	
	
	
	
	
}
