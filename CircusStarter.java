package com.xworkz.dp;

import com.xworkz.dp.dao.*;
import com.xworkz.dto.*;

public class CircusStarter {

	public static void main(String args[]) {
		
		CircusDTO circusDTOs=new CircusDTO("ram",100,10,4,2);
		CircusDTO circusDTOs1=new CircusDTO("shri",50,5,3,1);
		CircusDTO circusDTOs2=new CircusDTO("ganeshs",150,8,2,3);
		
		CircusDAO cir=new CircusDAO();
		cir.create(circusDTOs2);
		cir.display();
		cir.delete(0);
		cir.display();
		cir.update(circusDTOs1, 5);
		cir.display();
	}
}