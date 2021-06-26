package com.vti.entity;

import java.time.LocalDate;
import java.util.Date;

public class Account {
	private int id;
	private String email;
	private String userName;
	private String fullName;
	private Department department;
	private Position position;
	private LocalDate createDate;
	private Group[] dsNhom;

	public Account() {

	}

	public Account(int id, String email, String userName, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
	}

	
	public Account(int id, String email, String userName, String firstName, String lastName, Position position) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
		this.position = position;
		
	}

	public Account(int id, String email, String userName, String firstName, String lastName, Position positionName, LocalDate createDate) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
		Position position = new Position();
		this.position = position;
		this.createDate = createDate;
	}
	
	public Account(String userName) {
		
		this.userName = userName;
	}
	@Override
	public String toString() {
		String result = "";
		result = result + " Id: " + id + ", Email: " + email + ", UserName: " + userName + ", FullName: " + fullName
				+ ", Position: " + position + ", CreateDate: " + createDate;
		return result;
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Group[] getDsNhom() {
		return dsNhom;
	}

	public void setDsNhom(Group[] dsNhom) {
		this.dsNhom = dsNhom;
	}
	


	

}
