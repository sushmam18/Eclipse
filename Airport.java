package com.xworkz.crudoperator;

public class Airport {

	private String[] airportname = new String[5];
	private int counter;
	
	
	public void addname(String name)
	{
		System.out.println("name :".concat(name));
		if(this.counter<airportname.length)
		{
			this.airportname[counter++]=name;
			
		}
		else
		{
			System.out.println("array is full");
		}
	}
		public void display()
		{
			for(int i=0;i<airportname.length;i++)
			{
				System.out.println(airportname[i]);
			}
		}
		
		public void delete(int tab)
		{
			
			if(tab>=0 && tab<airportname.length)
			{
				this.airportname[tab]=null;
			}
		}
		
		public void update(int dog,String ref)
		{
			if(dog>=0 && dog<airportname.length)
			{
				this.airportname[dog]=ref;
			}
		}
	}


