package com.xworkz.dp.dao;

import com.xworkz.dto.*;

public class CircusDAO {

	private CircusDTO[] circusDTOs=new CircusDTO[5];
	private int count=0;
	
	public void create(CircusDTO ref)
	{
		if(this.count<circusDTOs.length && ref!=null)
		{
			this.circusDTOs[count++]=ref;
		}
		else
		{
			System.out.println("container is full");
		}
	}
	public void delete(int index)
	{
		if(index>=0 && index<circusDTOs.length)
		{
			this.circusDTOs[index]=null;
		}
		else
		{
			System.out.println("index is invalid");
		}
	}
	public void update(CircusDTO ref,int index)
	{
		if(ref!=null)
		{
			if(index>=0 && index<circusDTOs.length)
			{
				this.circusDTOs[index]=ref;
			}
			else
			{
				System.out.println("reference index is null");
			}
		}
	}
	public void display()
	{
		for(int coke=0;coke<circusDTOs.length;coke++)
		{
			CircusDTO reference=circusDTOs[coke];
			if(reference!=null)
			{
			System.out.println(reference);
			System.out.println(reference.getOwner());
			System.out.println(reference.getTicketprice());
			System.out.println(reference.getNoOfanimals());
			System.out.println(reference.getNoOfshows());
			System.out.println(reference.getNoOfanimals());
			System.out.println(reference.getDuration());
			}
			else
			{
				System.err.println("reference is null at index ".concat(String.valueOf(coke)));
			}
		
		}
	}



			
			
				
			
		}
	


