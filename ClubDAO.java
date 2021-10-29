package com.xworkz.dp.dao;

import com.xworkz.dto.*;

public class ClubDAO {

	
	private ClubDTO[] clubDTOs=new ClubDTO[10];
	int count=0;
	
	public void save(ClubDTO ref)
	{
		if(this.count<clubDTOs.length)
		{
			this.clubDTOs[count++]=ref;
			
		}
		else
		{
			System.out.println("conatiner is full");
		}
	}
	public void delete(int index)
	{
		if(index>=0 && index<clubDTOs.length)
		{
			this.clubDTOs[index]=null;
	     }
		else
		{
			System.out.println("index is invalid");
		}
	}
	public void update(ClubDTO ref,int index)
	{
		if(ref!=null)
		{
			if(index>=0 && index<clubDTOs.length)
			{
			   this.clubDTOs[index]=ref;
		    }
		}
		else
		{
			System.out.println("reference you are passing is null");
		}
	}
	public void display()
	{
		for(int coke=0;coke<clubDTOs.length;coke++)
		{
			ClubDTO reference=clubDTOs[coke];
			if(reference!=null)
			{
			System.out.println(reference);
			System.out.println(reference.getNoOfppl());
			System.out.println(reference.getNoOfbottle());
			System.out.println(reference.getPrice());
			}
			else
			{
				System.err.println("reference is null at index ".concat(String.valueOf(coke)));
			}
		
		}
	}

}


