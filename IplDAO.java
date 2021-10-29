package com.xworkz.dp.dao;

import com.xworkz.dto.*;

public class IplDAO {

	private IplDTO[] iplDTOs=new IplDTO[10];
	private int count=0;
	
	public void create(IplDTO ref)
	{
		if(this.count<iplDTOs.length && ref!=null)
		{
			this.iplDTOs[count++]=ref;
		}
		else
		{
			System.err.println("Either container is full or passed reference is null");
		}
	}
	public void delete(int index)
	{
		if(index>=0 && index<iplDTOs.length)
		{
			this.iplDTOs[index]=null;
		System.err.println("deleted index is" .concat(String.valueOf(index)));
		}
		else	
		{
			System.err.println("invalid");
		}
			
	}
	public void update(IplDTO updateref, int index)
	{
		if(updateref!=null)
		{
			if(index>=0 && index<iplDTOs.length)
			{
				this.iplDTOs[index]=updateref;
			}
			else
			{
				System.out.println("passed reference is not valid");
				
			}
		}
	}

	public void display()
	{
		for(int lock=0;lock<iplDTOs.length;lock++)
		{
			 IplDTO reference=iplDTOs[lock];
			 if(reference!=null)
			 {
			    System.out.println("index is ".concat(String.valueOf(lock)));
				System.out.println(reference);
				System.out.println(reference.getName());
				System.out.println(reference.getNoOfTeams());
				System.out.println(reference.getTeamSize());
				System.out.println(reference.getOwner());
				System.out.println(reference.getSponser());
			 }
			 else
			 {
				 System.out.println("it is pointing to null");
			 }
		}
	}
	public void fetch(int index)
	{
	 if(index>=0 && index<iplDTOs.length && this.iplDTOs[index]!=null)
	 {
		 System.out.println("******");
		System.out.println(this.iplDTOs[index].getName()); 
	  }
	 else
	 {
		 System.out.println("it is pointing to null at the index".concat(String.valueOf(index)));
	 }
	 }
public boolean matchIPLbyName(String teamName)
{
	for(int index=0;index<iplDTOs.length;index++)
	{
		IplDTO ref=this.iplDTOs[index];
		if(ref!=null)
		{
			System.out.println("ref in index is not null".concat(String.valueOf(index)));
			String tempName=ref.getName();
			
			if(teamName.equals(tempName))
			{
				System.out.println("team name found");
				return true;
			}
		}
		
	}
	return false;
}

}

		
			
			
	