package com.xworkz.dp.dao;

import com.xworkz.dto.*;


public class CameraDAO {

	CameraDTO[] cameraDTOs=new CameraDTO[10];
	int count=0;
	
	public void save(CameraDTO ref)
	{
		if(this.count<cameraDTOs.length)
		{
			this.cameraDTOs[count++]=ref;
			
		}
		else
		{
			System.out.println("conatiner is full");
		}
	}
	public void delete(int index)
	{
		if(index>=0 && index<cameraDTOs.length)
		{
			this.cameraDTOs[index]=null;
	     }
		else
		{
			System.out.println("index is invalid");
		}
	}
	public void update(CameraDTO ref,int index)
	{
		if(ref!=null)
		{
			if(index>=0 && index<cameraDTOs.length)
			{
			   this.cameraDTOs[index]=ref;
		    }
		}
		else
		{
			System.out.println("reference you are passing is null");
		}
	}
	public void display()
	{
		for(int coke=0;coke<cameraDTOs.length;coke++)
		{
			CameraDTO reference=cameraDTOs[coke];
			if(reference!=null)
			{
			System.out.println(reference);
			System.out.println(reference.getCompany());
			System.out.println(reference.getType());
			System.out.println(reference.getPixel());
			System.out.println(reference.getCost());
			}
			else
			{
				System.err.println("reference is null at index ".concat(String.valueOf(coke)));
			}
		
		}
	}
}

	


