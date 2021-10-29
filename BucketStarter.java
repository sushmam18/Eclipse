package com.xworkz.dp;

import com.xworkz.dp.dao.*;
import com.xworkz.dto.*;

public class BucketStarter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 
	BucketDTO bucketDTOs=new BucketDTO("blue","m",5);
	BucketDTO bucketDTOs1=new BucketDTO("pink","s",3);
	BucketDTO bucketDTOs2=new BucketDTO("black","l",9);
	
	BucketDAO buc=new BucketDAO();
	buc.save(bucketDTOs);
	buc.display();
	
	buc.delete(1);
	buc.display();
	
	buc.update(bucketDTOs2, 2);
	buc.display();
	}
}

   
	
		

