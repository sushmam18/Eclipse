package com.xworkz.crudoperator;

public class beachopearator {

		// TODO Auto-generated constructor stub
		private String country=new String();
		private String[] beachNames=new String[5];
		private int counter=0;
		
		public beachopeartor()
		{
			this("INDIA");
			System.out.println("invoked no arg const");
		}
		public beachopearator(String country)
		{
			this.country=country;
			System.out.println("invoked string const");
		}
		public String getCountry()
		{
			return country;
		}
		public void addBeachNames(String name)
		{
			System.out.println("invoked addBeachName");
			System.out.println("Name arg:".concat(name));
			if(this.counter<5)
			{
				this.beachNames[this.counter]=name;
				this.counter++;
			}
			else
			{
				System.out.println("array is full");
			}
		}
		public void displayBeachNames()
		{
			System.out.println("invoked displayBeachNames");
			for(int i=0;i<this.beachNames.length;i++)
			{
				String name=this.beachNames[i];
				System.out.println(name);
			}
		}
	}


