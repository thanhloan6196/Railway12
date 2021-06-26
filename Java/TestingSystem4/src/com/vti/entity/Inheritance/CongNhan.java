package com.vti.entity.Inheritance;

public class CongNhan extends CanBo {
	
	int bac;

	public CongNhan(String hoTen, String tuoi, Gender gender, String diaChi, int bac) {
		super(hoTen, tuoi, gender, diaChi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Cap bac: " + bac;
	}

}
