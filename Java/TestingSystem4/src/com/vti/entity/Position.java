package com.vti.entity;

public class Position {
	private int id;
	private PositionName positionName;
	
	public Position(int id, PositionName positionName) {
		this.id = id;
		this.positionName = positionName;
	}
	public Position() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PositionName getPositionName() {
		return positionName;
	}
	public void setPositionName(PositionName positionName) {
		this.positionName = positionName;
	}
	
	

}
