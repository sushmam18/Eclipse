package com.xworkz.dto;

public class BraceletStarter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bracelet dto=new Bracelet();
		dto.setColor("blue");
		dto.setPrice(30.0f);
		dto.setMaterial("plastic");
		dto.setGemused(false);
		dto.setGifted(false);
		
		Bracelet dto2=new Bracelet(50,"green","iron",true,false);
		Bracelet dto3=new Bracelet(40,"red","plastic",false,false);
		Bracelet dto4=new Bracelet(80,"yellow","plastic",true,true);
		
		Bracelet[] fig=new Bracelet[5];
		
		fig[0]=dto;
		fig[2]=dto4;
		
		for(int lock=0; lock<fig.length;lock++)
		{
		   Bracelet ref=fig[lock];
		
		    if(ref!=null)
		    {
			System.out.println(ref.getColor());
			System.out.println(ref.getPrice());
			System.out.println(ref.getMaterial());
			System.out.println(ref.isGemused());
			System.out.println(ref.isGifted());
		    }
	         else
	         {
		       System.err.println("index is pointing to null".concat(String.valueOf(lock)));
	         }
		}
	
	}
}