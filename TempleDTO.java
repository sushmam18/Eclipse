package com.xworkz.dto;

public class TempleDTO {
	
	
	private String name;
	private String location;
	private String mainGod;
	private boolean prasad;
	private int time;

	public TempleDTO() {
		// TODO Auto-generated constructor stub
	}

	public TempleDTO(String name, String location, String mainGod, boolean prasad, int time) {
		super();
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.prasad = prasad;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public boolean isPrasad() {
		return prasad;
	}

	public void setPrasad(boolean prasad) {
		this.prasad = prasad;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	

}
