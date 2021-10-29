package com.xworkz.dto;

public class BucketDTO {
	
	private String color;
	private String size;
	private int quantity;
	

	public BucketDTO() {
		// TODO Auto-generated constructor stub
	}


	public BucketDTO(String color, String size, int qunaity) {
		super();
		this.color = color;
		this.size = size;
		this.quantity = quantity;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	
	}

	
