package com.vti.entity.Constructor_Inheritance;

public abstract class Student extends Person {
	private int id;
	
	public Student(String name, int id) {
		super(name);
		this.id = id;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", id: " + id;
	}

}
