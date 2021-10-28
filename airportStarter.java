package com.xworkz.crudoperator;

public class airportStarter {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		Airport port = new Airport();
		port.addname("kempegowda");
		port.addname("Rajiv Gandhi");
		port.addname("Chennai International ");
		port.addname("hubli");
		port.addname("bgm");
		port.addname("manglore");

		port.delete(1);
		port.update(2, "xxx");
		port.display();
	}

}
