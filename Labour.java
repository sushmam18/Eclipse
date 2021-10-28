package com.xworkz.crudoperator;

public class Labour {

	private String[] labourname=new String[5];
	private int counter;
	
	public void addLabourName(String name)
	{
		System.out.println("name :".concat(name));
		if(this.counter<labourname.length)
		{
			this.labourname[counter++]=name;
			
		}
		else
		{
			System.out.println("array is full");
		}
	}
	public void display()
	{
		for(int i=0;i<labourname.length;i++)
		{
			System.out.println(labourname[i]);
		}
	}
	public void delete(int chakli)
	{
		if(chakli>=0 && chakli<labourname.length)
		{
			this.labourname[chakli]=null;
		}

	}
	public void update(int bvc , String ref)
	{
		if(bvc>=0 && bvc<labourname.length)
		{
			this.labourname[bvc]=ref;
		}
	}

}
