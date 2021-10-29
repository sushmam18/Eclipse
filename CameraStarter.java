package com.xworkz.dp;

import com.xworkz.dp.dao.*;
import com.xworkz.dto.*;

public class CameraStarter {

	public static void main(String[] args) 
	{
		
		CameraDTO cameraDTOs=new CameraDTO("canon","dslr",60,45000);
		CameraDTO cameraDTOs1=new CameraDTO("nikon","dslr",40,35000);
		CameraDTO cameraDTOs2=new CameraDTO("canon1","dslr",50,25000);
		
		CameraDAO cam=new CameraDAO();
		cam.save(cameraDTOs2);
		cam.display();
		
		cam.delete(1);
		cam.display();
		
		cam.update(cameraDTOs1, 9);
		cam.display();
	}


		
	

		

	}


