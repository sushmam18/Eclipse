package com.xworkz.dp;

import com.xworkz.dto.*;
import com.xworkz.dp.dao.*;


public class TempleStarter {
	
public static void main(String[] args)
   {
		// TODO Auto-generated method stub
	 TempleDTO templeDTOs=new TempleDTO("shardamba","shringer","sharada",true,10);
	 TempleDTO templeDTOs1=new TempleDTO("shrikrishna","udupi","krishna",true,11);
	 TempleDTO templeDTOs2=new TempleDTO("venkatesh","tirupathi","venaktesha",true,12);
	 
	 TempleDAO temp=new TempleDAO();
	 temp.save(templeDTOs);
	 temp.save(templeDTOs1);
	 temp.display();
	 
	 temp.delete(0);
	 temp.display();
	 
	 temp.update(templeDTOs2, 6);
	 temp.display();
	 

	}

}
