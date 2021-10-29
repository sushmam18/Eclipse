package com.xworkz.dp.dao;

 import com.xworkz.dto.*;
 
public class DoctorDAO {


		// TODO Auto-generated method stub

		private DoctorDTO[] doctorDTOs=new DoctorDTO[5];
		private int count=0;
		 
		 public void create(DoctorDTO ref)
		 {
			 if(this.count<doctorDTOs.length && ref!=null)
			 {
				 this.doctorDTOs[count++]=ref;
			 }
			 else
			 {
				 System.out.println("container is full");
			 }
		 }
		public void delete(int index)
		{
			if(index>=0 && index<doctorDTOs.length)
			{
				this.doctorDTOs[index]=null;
			}
			else
			{
				System.out.println("index is inavlid");
			}
	}
 public void update(DoctorDTO ref ,int index)
 {
	 if(ref!=null )
	 {
		 if(index>=0 &&index<doctorDTOs.length)
		 {
			 this.doctorDTOs[index]=ref;
		 }
		 else
		 {
			 System.out.println("passed reference is not valid");
		 }
	 }
 }
 public void display()
 {
	for(int lock=0;lock<doctorDTOs.length;lock++)
	{
		DoctorDTO ref=doctorDTOs[lock];
		if(ref!=null)
		{
			System.out.println(ref);
			System.out.println(ref.getName());
			System.out.println(ref.getSpeccialization());
			System.out.println(ref.getHospname());
			System.out.println(ref.getSalary());
			System.out.println(ref.getAge());
			}
			else
			{
				System.err.println("reference is null at index ".concat(String.valueOf(lock)));
			}
		}
		}
	}
 
