package com.xworkz.dto;

public class CraneStarter {

	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Crane dto =new Crane();
		dto.setName("Eurasian");
		dto.setScientificname("Grus grus");
		dto.setDistribution("France");
		dto.setFoodtype("omnivorous");
		
		Crane dto1=new Crane("Sandhill","Grus canadensis","america","omnivorous");
		Crane dto2=new Crane("Demoiselle","Anthropoides virgo","northindia","omnivorous");
		
		Crane fig[]=new Crane[5];
		
		fig[0]=dto;
		fig[1]=dto1;
		fig[2]=dto2;
		
		for(int lock=0;lock<fig.length;lock++)
		{
			Crane ref=fig[lock];
			if(ref!=null)
			{
				System.out.println(ref.getName());
				System.out.println(ref.getScientificname());
				System.out.println(ref.getDistribution());
				System.out.println(ref.getFoodtype());
			}
		}
		
		
		
	}

}
