package com.xworkz.dto;

public class BusDriver {
	
	private String name;
	private String bus;
	private int experience;
	private float salary;
	private int id;
	

	public BusDriver() 
	{
		System.out.println("no args");
	}


	public BusDriver(String name, String bus, int experience, float salary, int id) {
		super();
		this.name = name;
		this.bus = bus;
		this.experience = experience;
		this.salary = salary;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBus() {
		return bus;
	}


	public void setBus(String bus) {
		this.bus = bus;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	

}
