package com.xworkz.crudoperator;

public class cofee {
	
	private String[] coffeename=new String[7];
	private int counter;
	
	public void addcoffee(String name)
	{
		System.out.println("name arg :".concat(name));
		if(this.counter<coffeename.length)
		{
			this.coffeename[counter++]=name;
		}
		else
		{
			System.err.println("array is full");
		}
	}
	public void displaycoffeename()
	{
		for(int i=0;i<coffeename.length;i++)
		{
			System.out.println(coffeename[i]);
		}
	}
    public void delete(int index)
    {
    	System.out.println("deleted index");
    	if(index>=0 && index<coffeename.length )
    	{
    		this.coffeename[index]=null;
    	}
    }
    public void update(int pedha,String ref)
    {
    	System.out.println("updated index");
    	if(pedha>=0 && pedha<coffeename.length)
    	{
    		this.coffeename[pedha]=ref;
    	}
    	else
    	{
    		System.err.println("cannot updATE");
    	}
    }
	
}
