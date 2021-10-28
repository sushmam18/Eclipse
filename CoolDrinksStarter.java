package com.xworkz.crudoperator;

public class CoolDrinksStarter{
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
 CoolDrinks Drinks=new CoolDrinks();
 Drinks.addCoolDrinks("pepsi");
 Drinks.addCoolDrinks("mirinda");
 Drinks.addCoolDrinks("maza");
 Drinks.addCoolDrinks("coke");
 Drinks.addCoolDrinks("frooti");
   
Drinks.deleteCoolDrinks(0);
Drinks.updateCoolDrinks(3,"cocola");
Drinks.displayCoolDrinks();
 
	}

}
