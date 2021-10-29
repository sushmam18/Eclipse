package com.xworkz.dto;

public class Park {

	private String name;
	private String type;
	private float size;
	private String location;
	private boolean shops;
	private boolean swimmingpool;
	
	public Park()
	{
		System.out.println("no args");
	}
	 public Park(String name, String type, float size, String location, boolean shops, boolean swimmingpool) {
		super();
		this.name = name;
		this.type = type;
		this.size = size;
		this.location = location;
		this.shops = shops;
		this.swimmingpool = swimmingpool;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isShops() {
		return shops;
	}
	public void setShops(boolean shops) {
		this.shops = shops;
	}
	public boolean isSwimmingpool() {
		return swimmingpool;
	}
	public void setSwimmingpool(boolean swimmingpool) {
		this.swimmingpool = swimmingpool;
	}
	
	
	
	
	
	
}
