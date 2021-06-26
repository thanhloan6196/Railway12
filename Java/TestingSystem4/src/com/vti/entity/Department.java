package com.vti.entity;

public class Department {
	private int id;
	private String departmentName;

	public Department() {

	}

	public Department(String departmentName) {
		this.id = 0;
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += " Id: " + id + " Name: " + departmentName;
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
