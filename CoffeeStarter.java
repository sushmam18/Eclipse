package com.xworkz.crudoperator;

public class CoffeeStarter
{
	

	public static void main(String[] args)
	{
		
       cofee fee =new cofee();
       fee.addcoffee("Cappuccino");
       fee.addcoffee("Flat White.");
       fee.addcoffee("Macchiato");
       fee.addcoffee("bru coffee");
       fee.addcoffee("cold coffee");
       fee.addcoffee("red coffee");
       fee.addcoffee("brew");
       
       fee.delete(0);
       fee.update(3, "hot cofee");
       fee.displaycoffeename();
       
    		   
	}

}
