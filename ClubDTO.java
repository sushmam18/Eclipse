package com.xworkz.dto;

public class ClubDTO {
	
	
	private int noOfppl;
	private int noOfbottle;
	private float price;
	

	public ClubDTO() {
		// TODO Auto-generated constructor stub
	}


	public ClubDTO(int noOfppl, int noOfbottle, float price) {
		super();
		this.noOfppl = noOfppl;
		this.noOfbottle = noOfbottle;
		this.price = price;
	}


	public int getNoOfppl() {
		return noOfppl;
	}


	public void setNoOfppl(int noOfppl) {
		this.noOfppl = noOfppl;
	}


	public int getNoOfbottle() {
		return noOfbottle;
	}


	public void setNoOfbottle(int noOfbottle) {
		this.noOfbottle = noOfbottle;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}

	
}
