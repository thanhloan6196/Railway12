package com.vti.entity;

import java.time.LocalDate;
import java.util.Date;

public class Group {
	private int id;
	private String groupName;
	private Account creatorId ;
	private LocalDate createDate;
	private Account[] dsNhanVien;

	
	public Group() {
		
	}
	
	public Group(int id, String groupName, Account creatorId, Account[] dsNhanVien, LocalDate createDate ) {
			this.id = id;
			this.groupName = groupName;
			this.creatorId = creatorId;
			this.dsNhanVien = dsNhanVien;
			this.createDate = createDate;
		}
	public Group(int id, String groupName, Account creatorId, String[] userNames, LocalDate createDate ) {
		this.id = id;
		this.groupName = groupName;
		this.creatorId = creatorId;
		Account[] dsNhanVien = new Account[userNames.length];
		for ( int i = 0; i < userNames.length; i++ ) {
			dsNhanVien[i] = new Account(userNames[i]);
		}
		
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += " Id: " + id + " GroupName: " + groupName + " " + " Account: " + creatorId 
				+ " CreateDate: " + createDate;
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Account getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Account creatorId) {
		this.creatorId = creatorId;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Account[] getDsNhanVien() {
		return dsNhanVien;
	}

	public void setDsNhanVien(Account[] dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}
	
	
}
