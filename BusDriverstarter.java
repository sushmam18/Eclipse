package com.xworkz.dto;

public class BusDriverstarter {

	
	public static void main(String[] args) {
		
		BusDriver bus=new BusDriver();
		bus.setName("xyz");
		bus.setBus("ksrtc");
		bus.setExperience(5);
		bus.setSalary(30000f);
		bus.setId(444);
		
		BusDriver bus1=new BusDriver("rohan","bmtc",6,35000f,111);
		BusDriver bus2=new BusDriver("harsha","bendre",3,25000f,211);
		BusDriver bus3=new BusDriver("rishab","vrl",7,45000f,333);
		
		BusDriver fig[]=new BusDriver[5];
		
		fig[0]=bus;
		fig[1]=bus1;
		fig[2]=bus2;
		fig[3]=bus3;
		
		for(int lock=0;lock<fig.length;lock++)
		{
			BusDriver ref=fig[lock];
			if(ref!=null)
			{
				System.out.println(ref.getName());
				System.out.println(ref.getBus());
				System.out.println(ref.getExperience());
				System.out.println(ref.getSalary());
				System.out.println(ref.getId());
				
			}
		}
		
		
	}

}
