package com.xworkz.crudoperator;

public class CoolDrinks {
	
	private String[] brandName= new String[5];
	private int counter=0;
	
	public void addCoolDrinks(String name)
	{
		System.out.println("name arg:"+name);
		if(this.counter<brandName.length)
		{
			this.brandName[this.counter++]=name;
		}
	}
	public void displayCoolDrinks()
	{
		System.out.println("elements of coldrinks");
		for(int i=0;i<brandName.length;i++)
		{
		System.out.println(brandName[i]);
		
		}
	}
	public void deleteCoolDrinks(int index)
	{
		
		if(index>=0 && index<brandName.length)
		{
			this.brandName[index]=null;
		}
		else
		{
			System.err.println("cannot delete");
		}
	}
	public void updateCoolDrinks(int nayi,String ref)
	{
		
		if(nayi>=0 && nayi<brandName.length)
		{
			this.brandName[nayi]=ref;
		}
		else
		{
			System.err.println("cannot update");
		}
	}
	}

