package com.xworkz.dp.dao;

import com.xworkz.dto.*;

public class TempleDAO {

	private TempleDTO[] templeDTOs=new TempleDTO[10];
	private int count=0;
		
	public void save(TempleDTO ref)
	{
		if(this.count<templeDTOs.length && ref!=null)
		{
			this.templeDTOs[count++]=ref;
		}
		else
		{
			System.out.println("container is full");
		}
	}
	public void delete(int index)
	{
		if(index>=0 && index<templeDTOs.length)
		{
			this.templeDTOs[index]=null;
		}
		else
		{
			System.out.println("index is invalid");
		}
	}
    public void update(TempleDTO updateref,int index)
    {
    	if(updateref!=null)
    	{
    		if(index>=0 && index<templeDTOs.length)
    		{
    			this.templeDTOs[index]=updateref;
    		}
    	}
    	else
    	{
    		System.out.println("reference you are passing is null");
    	}
    }
    public void display()
    {
    	for(int coke=0;coke<templeDTOs.length;coke++)
		{
			TempleDTO reference=templeDTOs[coke];
			if(reference!=null)
			{
			System.out.println(reference);
			System.out.println(reference.getName());
			System.out.println(reference.getLocation());
			System.out.println(reference.getMainGod());
			System.out.println(reference.isPrasad());
			System.out.println(reference.getTime());
			}
			else
			{
				System.err.println("reference is null at index ".concat(String.valueOf(coke)));
			}
		}
	}	


    }
