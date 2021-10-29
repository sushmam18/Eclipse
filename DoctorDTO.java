package com.xworkz.dto;

public class DoctorDTO {

	private String name;
	private String speccialization;
	private String hospname;
	private int salary;
	private int age;

	public DoctorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DoctorDTO(String name, String speccialization, String hospname, int salary, int age) {
		super();
		this.name = name;
		this.speccialization = speccialization;
		this.hospname = hospname;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeccialization() {
		return speccialization;
	}

	public void setSpeccialization(String speccialization) {
		this.speccialization = speccialization;
	}

	public String getHospname() {
		return hospname;
	}

	public void setHospname(String hospname) {
		this.hospname = hospname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
