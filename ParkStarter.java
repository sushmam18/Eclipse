package com.xworkz.dto;

public class ParkStarter {

	public static void main(String[] args) 
	{
		Park dto= new Park();
		dto.setName("bandipur national park");
		dto.setSize(868.6f);
		dto.setType("national park");
		dto.setLocation("karnataka");
		dto.setShops(false);
		dto.setSwimmingpool(false);
		
		Park dto2=new Park("bannergatta","national park",260.05f,"karnataka",true,false);
		Park dto3=new Park("nagarhole","national park",306.5f,"karnataka",true,true);
		Park dto4=new Park("anshi","national park",405.0f,"karnataka",true,true);
		Park dto5=new Park("corbett","national park",500.0f,"karnataka",false,false);
	
		Park fig[] = new Park[5];
		
		fig[0]=dto2;
		fig[1]=dto3;
		fig[2]=dto4;
		fig[3]=dto5;
		
		for(int lock=0;lock<fig.length;lock++)
		{
			Park ref=fig[lock];
		
		if(ref!=null)
		{
			System.out.println(ref.getName());
			System.out.println(ref.getType());
			System.out.println(ref.getLocation());
			System.out.println(ref.getSize());
		    System.out.println(ref.isShops());
		    System.out.println(ref.isSwimmingpool());
		}
		}
		
		}
			
			
		
		
		
	}


