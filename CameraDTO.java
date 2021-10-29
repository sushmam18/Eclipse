package com.xworkz.dto;

public class CameraDTO {
	
	private String company;
	private String type;
	private float pixel;
	private float cost;
	

	public CameraDTO() {
		// TODO Auto-generated constructor stub
	}


	public CameraDTO(String company, String type, float pixel, float cost) {
		super();
		this.company = company;
		this.type = type;
		this.pixel = pixel;
		this.cost = cost;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getPixel() {
		return pixel;
	}


	public void setPixel(float pixel) {
		this.pixel = pixel;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}
	
	

}
