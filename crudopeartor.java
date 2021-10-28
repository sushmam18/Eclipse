package com.xworkz.crudoperator;

public class crudstarter {
	
	public static void main(String args[])
	{
		crudopeartor crud=new crudoperator();
		String cname=crud.getCountry();
		System.out.println(cname);
		
		crud.addBeachName("om beach");
		crud.addBeachName("c beach");
		crud.addBeachName("m beach");
		crud.addBeachName("o beach");
		crud.addBeachName("x beach")
		crud.displaybeachNames();
		
	}
	
	
	
}
