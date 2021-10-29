package com.xworkz.dto;

public class Crane {
	
	private String name;
	private String scientificname;
	private String distribution;
	private String foodtype;
	
	
	public Crane() {
		// TODO Auto-generated constructor stub
	}

	public Crane(String name, String scientificname, String distribution, String foodtype) {
		super();
		this.name = name;
		this.scientificname = scientificname;
		this.distribution = distribution;
		this.foodtype = foodtype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScientificname() {
		return scientificname;
	}

	public void setScientificname(String scientificname) {
		this.scientificname = scientificname;
	}

	public String getDistribution() {
		return distribution;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	public String getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}

	
}
