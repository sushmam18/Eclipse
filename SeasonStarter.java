package com.xworkz.dto;

public class SeasonStarter {

	public static void main(String[] args) 
	{
		Season dto=new Season();
		dto.setName("winter");
		dto.setDuration("nov to feb");
		dto.setTemperature(20f);
		dto.setFeeling("sleepy");
		
		Season dto2 =new Season("summer","march to may",30f,"hot");
		Season dto3=new Season("rainy","june to aug",22f,"joy");
		Season dto4 =new Season("spring","aug to oct",21f,"cheerful");
		
		Season fig[]=new Season[5];
		
		fig[0]=dto4;
		fig[1]=dto2;
		fig[2]=dto;
		fig[3]=dto3;
		
		for(int lock=0;lock<fig.length;lock++)
			
		{
			Season ref=fig[lock];
			if(ref!=null)
			{
				System.out.println(ref.getName());
				System.out.println(ref.getDuration());
				System.out.println(ref.getTemperature());
				System.out.println(ref.getFeeling());
			}
		}
		
		
		
	}

}
