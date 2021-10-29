package com.xworkz.dp;
 import com.xworkz.dp.dao.*;
 import com.xworkz.dto.*;
public class DoctorStarter {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoctorDTO doctorDTOs=new DoctorDTO("ramesh","cardiologist","apollo",60000,32);
		DoctorDTO doctorDTOs1=new DoctorDTO("girish","gyncologist","spandana",67000,38);
		DoctorDTO doctorDTOs2=new DoctorDTO("sachin","opthomolgist","narayan",65000,30);
		DoctorDTO doctorDTOs3=new DoctorDTO("shantesg","pediatrician","victoria",80000,40);
		
		DoctorDAO doc=new DoctorDAO();
		doc.create(doctorDTOs3);
		doc.display();
		
		doc.delete(3);
		doc.display();
		
		doc.update(doctorDTOs1, 5);
		doc.display();
		
	}
}

		
		
	
