package com.vti.entity.Constructor_Inheritance;

public abstract class HighSchoolStudent extends Student{
	private String clazz;
	private String desiredUniversity;
	
	public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}
	
	
	public String getClazz() {
		return clazz;
	}


	public void setClazz(String clazz) {
		this.clazz = clazz;
	}


	public String getDesiredUniversity() {
		return desiredUniversity;
	}


	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", Lop: " + clazz + " , Truong DH mong muon: " + desiredUniversity;
	}
	

}
