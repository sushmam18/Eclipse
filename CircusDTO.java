package com.xworkz.dto;

public class CircusDTO {
	
	private String owner;
	private int ticketprice;
	private int noOfanimals;
	private int noOfshows;
	private int duration;
	

	public CircusDTO() {
		// TODO Auto-generated constructor stub
	}


	public CircusDTO(String owner, int ticketprice, int noOfanimals, int noOfshows, int duration) {
		super();
		this.owner = owner;
		this.ticketprice = ticketprice;
		this.noOfanimals = noOfanimals;
		this.noOfshows = noOfshows;
		this.duration = duration;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getTicketprice() {
		return ticketprice;
	}


	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}


	public int getNoOfanimals() {
		return noOfanimals;
	}


	public void setNoOfanimals(int noOfanimals) {
		this.noOfanimals = noOfanimals;
	}


	public int getNoOfshows() {
		return noOfshows;
	}


	public void setNoOfshows(int noOfshows) {
		this.noOfshows = noOfshows;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}

}
