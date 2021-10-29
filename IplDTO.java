package com.xworkz.dto;

public class IplDTO {
	
	private String name;
	private int noOfTeams;
	private int teamSize;
	private String owner;
	private String sponser;
	

	public IplDTO() {
		// TODO Auto-generated constructor stub
	}


	public IplDTO(String name, int noOfTeams, int teamSize, String owner, String sponser) {
		super();
		this.name = name;
		this.noOfTeams = noOfTeams;
		this.teamSize = teamSize;
		this.owner = owner;
		this.sponser = sponser;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNoOfTeams() {
		return noOfTeams;
	}


	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getSponser() {
		return sponser;
	}


	public void setSponser(String sponser) {
		this.sponser = sponser;
	}
	
	

}
