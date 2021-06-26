package com.vti.entity.Inheritance;

public class CanBo {

	private String hoTen;
	private String tuoi;
	private Gender gender;
	private String diaChi;
	
	
	
	public CanBo(String hoTen, String tuoi, Gender gender, String diaChi) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gender = gender;
		this.diaChi = diaChi;
	
	}

	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	@Override
	public String toString() {
		String result = " Hoten: " + hoTen + ", Tuoi: " + tuoi + ", Gioi tinh: " + gender
				+ ", Dia chi:" + diaChi;
		return result;
	}
	

}
