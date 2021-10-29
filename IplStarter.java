package com.xworkz.dp;

import com.xworkz.dto.*;
import com.xworkz.dp.dao.*;


public class IplStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IplDTO iplDTOs=new IplDTO("RCB",5,12,"united spirts","puma");
		IplDTO iplDTOs1=new IplDTO("KKR",3,12,"sharkukhan","MPL");
		IplDTO iplDTOs2=new IplDTO("MI",5,12,"mukesh amabani","DHL express");
		
	IplDAO ipl=new IplDAO();
    ipl.create(iplDTOs);
	ipl.create(iplDTOs2);
	ipl.display();
	
	ipl.delete(1);
	ipl.display();
	
	ipl.update(iplDTOs2,7);
	ipl.display();
	
	ipl.fetch(1);
	ipl.display();
	
	ipl.matchIPLbyName("MI");
	ipl.display();
	}
	
	
	

	}


