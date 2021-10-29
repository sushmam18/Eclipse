package com.xworkz.dp.dao;

import com.xworkz.dto.*;

public class MovieDAO {


		private MovieDTO[] movieDTOs=new MovieDTO[10];
		private int count=0;
		
		public void create(MovieDTO ref)
		{
			if(this.count<movieDTOs.length && ref!=null)
			{
				this.movieDTOs[count++]=ref;
			}
			else
			{
				System.err.println("Either container is full or passed reference is null");
			}
		}
		public void delete(int index)
		{
			if(index>=0 && index<movieDTOs.length)
			{
				this.movieDTOs[index]=null;
			System.err.println("deleted index is" .concat(String.valueOf(index)));
			}
			else	
			{
				System.err.println("invalid");
			}
				
		}
		public void update(MovieDTO updateref, int index)
		{
			if(updateref!=null)
			{
				if(index>=0 && index<movieDTOs.length)
				{
					this.movieDTOs[index]=updateref;
				}
				else
				{
					System.out.println("passed reference is not valid");
					
				}
			}
		}

		public void display()
		{
			for(int lock=0;lock<movieDTOs.length;lock++)
			{
				 MovieDTO reference=movieDTOs[lock];
				 if(reference!=null)
				 {
				    System.out.println("index is ".concat(String.valueOf(lock)));
					System.out.println(reference);
					System.out.println(reference.getName());
					System.out.println(reference.getDirector());
					System.out.println(reference.getActor());
					System.out.println(reference.getRating());
					System.out.println(reference.getProducer());
				 }
				 else
				 {
					 System.out.println("it is pointing to null");
				 }
			}
		}
		public void fetch(int index)
		{
		 if(index>=0 && index<movieDTOs.length && this.movieDTOs[index]!=null)
		 {
			 System.out.println("******");
			System.out.println(this.movieDTOs[index].getName()); 
		  }
		 else
		 {
			 System.out.println("it is pointing to null at the index".concat(String.valueOf(index)));
		 }
		 }
	public boolean matchIPLbyName(String teamName)
	{
		for(int index=0;index<movieDTOs.length;index++)
		{
			MovieDTO ref=this.movieDTOs[index];
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


