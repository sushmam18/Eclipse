package com.xworkz.crudoperator;

public class Stadium {

	private String[] names = new String[5];
	private int counter;

	public void addname(String name)
     {
      System.out.println("name :".concat(name));
      if(this.counter<names.length)
        {
	      this.names[counter++]=name;
        }
      else
        {
	      System.out.println("array is full");
        }
      }
	
	public void display()
	{
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
	
	public void delete(int index)
	{
		if(index>=0 && index<names.length)
		{
			this.names[index]=null;
		}
	}
	
	public void update(int ex,String ref)
	{
		 if(ex>=0 && ex<names.length)
		 {
			 this.names[ex]=ref;
		 }
	}
}