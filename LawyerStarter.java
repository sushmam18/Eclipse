package com.xworkz.dp;
import com.xworkz.dp.dao.*;
import com.xworkz.dto.*;
public class LawyerStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	LawyerDTO dto1=new LawyerDTO("sushma","BA LLB",2,"female",30,"highcourt",5,1);
	LawyerDTO dto2=new LawyerDTO("shri","Bcom LLB",5,"female",33,"supremecourt",9,1);
	LawyerDTO dto3=new LawyerDTO("siddu","MA LLB",10,"male",45,"highcourt",16,3);
	LawyerDTO dto4=new LawyerDTO("sanchith","BA LLB",4,"male",34,"districtcourt",7,0);
	LawyerDTO dto5=new LawyerDTO("harsha","MA LLB",3,"female",36,"highcourt",5,0);
	LawyerDTO dto6=new LawyerDTO("buvana","BA LLB",8,"female",39,"highcourt",10,1);
	LawyerDTO dto7=new LawyerDTO("sharth"," LLB",1,"female",41,"highcourt",9,3);

	LawyerDAO dao=new LawyerDAO();
	dao.save(dto1);
	dao.save(dto2);
	dao.save(dto3);
	dao.display();
	
	dao.delete(5);
	
	
	boolean ice = dao.searchBYName("s");
	System.out.println(ice);
	
	boolean ice1 =dao.getQualificationByName("harsha");
	System.out.println(ice1);
	
	dao.getLawywerwithMaxExp();
	dao.display();
	
	boolean ice3=dao.searchByCaseWon(10);
	System.out.println(ice3);
	
	
	
	}

}
