package com.xworkz.crudoperator;

public class labourstarter {

	public static void main (String args[])
	{
		// TODO Auto-generated constructor stub
		Labour lab=new Labour();
		lab.addLabourName("nidhi");
		lab.addLabourName("vineeth");
		lab.addLabourName("niru");
		lab.addLabourName("kartz");
		lab.addLabourName("shri");
		
		lab.delete(3);
		lab.update(3, "huduga");
		lab.display();
	}

}
