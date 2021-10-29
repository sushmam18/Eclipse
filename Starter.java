package com.xworkz.inheritence;

public class Starter {

	public static void main(String args[])
	{
		Saloon obj=new Saloon();
		System.out.println(obj.name);
		System.out.println(obj.NoOfstaffs);
		NaturalSaloon obj1=new NaturalSaloon();
		System.out.println(obj1.name);
		System.out.println(obj1.NoOfstaffs);
	}
}
