package com.xworkz.dp.dao;

import com.xworkz.dto.*;
public class DressCodeDAO {

	DressCodeDTO[] dresscodeDTOs=new DressCodeDTO[5];
	int count=0;
	
	public void save(DressCodeDTO ref)
	{
		if(this.count<dresscodeDTOs.length && ref!=null)
		{
			this.dresscodeDTOs[count++]=ref;
		}
		else
		{
			System.out.println("container is full");
		}
	}

	public void delete(int index)
	{
		if(index>=0 && index<dresscodeDTOs.length)
		{
			this.dresscodeDTOs[index]=null;
	     }
		else
		{
			System.out.println("index is invalid");
		}
	}
	public void update(DressCodeDTO ref,int index)
	{
		if(ref!=null)
		{
			if(index>=0 && index<dresscodeDTOs.length)
			{
			   this.dresscodeDTOs[index]=ref;
		    }
		}
		else
		{
			System.out.println("reference you are passing is null");
		}
	}
	public void display()
	{
		for(int coke=0;coke<dresscodeDTOs.length;coke++)
		{
			DressCodeDTO reference=dresscodeDTOs[coke];
			if(reference!=null)
			{
			System.out.println(reference);
			System.out.println(reference.getSize());
			System.out.println(reference.getMaterial());
			System.out.println(reference.getColor());
			System.out.println(reference.getPrice());
			System.out.println(reference.getGender());
			
			}
			else
			{
				System.err.println("reference is null at index ".concat(String.valueOf(coke)));
			}
		
		}
	}
}
		