package com.xworkz.dto;

public class Bracelet 
{

	private float price;
	private String color;
	private String material;
	private boolean gifted;
	private boolean gemused;
	
	
	public Bracelet()
	{
		System.out.println("no args");
	}

	public Bracelet(float price, String color, String material, boolean gifted, boolean gemused) {
		super();
		this.price = price;
		this.color = color;
		this.material = material;
		this.gifted = gifted;
		this.gemused = gemused;
	}

	public float getPrice() 
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getMaterial()
	{
		return material;
	}

	public void setMaterial(String material)
	{
		this.material = material;
	}

	public boolean isGifted()
	{
		return gifted;
	}

	public void setGifted(boolean gifted)
	{
		this.gifted = gifted;
	}

	public boolean isGemused() 
	{
		return gemused;
	}

	public void setGemused(boolean gemused)
	{
		this.gemused = gemused;
	}
}
