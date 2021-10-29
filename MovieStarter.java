package com.xworkz.dp;

import com.xworkz.dp.dao.*;
import com.xworkz.dto.*;

public class MovieStarter {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieDTO movieDTOs=new MovieDTO("kotigobba3","xyz","sudeep",9.0f,"abc");
		MovieDTO movieDTOs1=new MovieDTO("salaga","pqr","vijay",8.5f,"rst");
		MovieDTO movieDTOs2=new MovieDTO("3","wxy","dhanush",10.0f,"mno");
		
	MovieDAO mov=new MovieDAO();
    mov.create(movieDTOs);
	
	mov.display();
	
	mov.delete(1);
	mov.display();
	
	mov.update(movieDTOs2,7);
	mov.display();
	
	mov.fetch(1);
	mov.display();
	
	mov.matchIPLbyName("salaga");
	mov.display();
	}
	
	
	

	




	}


