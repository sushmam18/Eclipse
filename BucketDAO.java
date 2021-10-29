package com.xworkz.dp.dao;

 import com.xworkz.dto.*;
 
public class BucketDAO
{
      BucketDTO[] bucketDTOs=new BucketDTO[10];
      int count=0;
      
      public void save(BucketDTO ref)
  	{
  		if(this.count<bucketDTOs.length && ref!=null)
  		{
  			this.bucketDTOs[count++]=ref;
  		}
  		else
  		{
  			System.out.println("container is full");
  		}
  	}
      public void delete(int index)
      {
    	  if(index>=0 && index<bucketDTOs.length)
    	  {
    		  this.bucketDTOs[index]=null;
    	  }
    	  else
    	  {
    		  System.out.println("index is not valid");
 
    	  }
     
      }
      public void update(BucketDTO ref,int index)
      {
    	  if(ref!=null)
      	{
      		if(index>=0 && index<bucketDTOs.length)
      		{
      			this.bucketDTOs[index]=ref;
      		}
      	}
      	else
      	{
      		System.out.println("reference you are passing is null");
      	}
      }
      public void display()
      {
    	  for(int lock=0;lock<bucketDTOs.length;lock++)
    	  {
    		  BucketDTO reference=bucketDTOs[lock];
    		  if(reference!=null)
    		  {
    			  System.out.println(reference);
    				System.out.println(reference.getColor());
    				System.out.println(reference.getSize());			
    				System.out.println(reference.getQuantity());
    				
    				}
    				else
    				{
    					System.err.println("reference is null at index ".concat(String.valueOf(lock)));
    				} 
    		  }
    		  
    	  }
      }
