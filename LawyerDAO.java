package com.xworkz.dp.dao;

import com.xworkz.dto.*;

public class LawyerDAO {
	
	private	LawyerDTO[] lawyerDTO=new LawyerDTO[10];
	private int count=0;
	
    public void save(LawyerDTO ref)
    {
    	if(this.count<lawyerDTO.length && ref!=null)
    	{
    		this.lawyerDTO[count++]=ref;
    	}
    	else
    	{
    		System.out.println("refrence index is null");
    	}
    }
    public void delete(int index)
    {
    	if(index>=0 && index<lawyerDTO.length)
    	{
    		this.lawyerDTO[index]=null;
    	}
    	else
    	{
    		System.out.println("index is inalid");
    	}
    }
    public void save(LawyerDTO ref,int index)
    {
    	if(index>=0 && index<lawyerDTO.length)
    	{
    		this.lawyerDTO[index]=ref;
    	}
    	else
    	{
    		System.out.println("passed refrence index is null");
    	}
    }
    public boolean searchBYName(String tname)
    {
    	for(int lock=0;lock<lawyerDTO.length;lock++)
    	{
    		LawyerDTO ref=this.lawyerDTO[lock];
    		if (ref!=null)
    		{
    			System.out.println("invoked searchbyname".concat(String.valueOf(lock)));
    			String tempname=ref.getName();
    			System.out.println("searching".concat(String.valueOf(tempname)));
    			if(tname.equals(tempname))
    			{
    				System.out.println("name found");
    				String name=ref.getName();
    				return true;
    			}
    			else
    			{
    				System.out.println("not found");
    			}
    			}
    			}
    		  
    	 return false;
    		}
    	
    
    public boolean searchByCaseWon(int tcaseWon)
    {
    	for(int chakli=0;chakli<lawyerDTO.length;chakli++)
    	{
    		LawyerDTO ref=this.lawyerDTO[chakli];
    		if(ref!=null)
    		{
    			System.out.println("rref index not null".concat(String.valueOf(chakli)));
    			int temp=ref.getCaseWon();
    			System.out.println("searching" .concat(String.valueOf(temp)));
    			if(tcaseWon==temp)
    			{
    				System.out.println("case found");
    				return true;
    			}
    			else
    			{
    				System.out.println("not found");
    			}
    		}
    			
    		}
    	
    	return false;
    }
public boolean getQualificationByName(String sname)
{
 for(int count=0;count<lawyerDTO.length;count++)
 {
   LawyerDTO ref=this.lawyerDTO[count];
   if(ref!=null)
   {
     System.out.println("reference index is not null");
	 String temp=ref.getName();
	 System.out.println("getting ".concat(String.valueOf(temp)));
	 if(sname.equals(temp))
	 {
		System.out.println(ref.getQualification());
	    System.out.println("qualification found");
	    return true;
	 }
	 else
	 {
		 System.out.println("not found");
	 }
  }
}
 return false;
}
		  
public boolean getLawywerwithMaxExp()
{
	int max=0;
	String c=null;
	for(int s=0;s<lawyerDTO.length;s++)
	{
		LawyerDTO ref=lawyerDTO[s];
		if(ref!=null)
		{
			if(ref.getExperience()>max)
			{
				max=ref.getExperience();
				c=ref.getName();
				return true;
    		}
    	}
    }
	return false;
}
 public void display()
 {
	 for(int index=0;index<lawyerDTO.length;index++)
	 {
		 LawyerDTO ref=lawyerDTO[index];
		 if(ref!=null)
		 {
			 System.out.println("index is ".concat(String.valueOf(index)));
				System.out.println(ref);
				System.out.println(ref.getName());
				System.out.println(ref.getQualification());
				System.out.println(ref.getExperience());
				System.out.println(ref.getGender());
				System.out.println(ref.getAge());
				System.out.println(ref.getCourtType());
				System.out.println(ref.getCaseWon());
				System.out.println(ref.getCaseLost());
				
			 }
			 else
			 {
				 System.out.println("it is pointing to null");
			 }
		}
	}
}		
	
