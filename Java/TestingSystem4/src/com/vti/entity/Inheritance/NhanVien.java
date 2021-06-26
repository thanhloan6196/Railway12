package com.vti.entity.Inheritance;

public class NhanVien extends CanBo {
	String congViec;

	public NhanVien(String hoTen, String tuoi, Gender gender, String diaChi, String congViec) {
		super(hoTen, tuoi, gender, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Cong viec: " + congViec ;
	}

}
