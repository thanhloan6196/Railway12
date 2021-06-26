package com.vti.entity.Q4_QuanLyTaiTieu;

public class TaiLieu {
	private String maTaiLieu;
	private String tenNhaXuatBan;
	private int soBanPhatHanh;
	
	public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh ) {
		this.maTaiLieu = maTaiLieu;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	
	public String getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}
	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}
	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	@Override
	public String toString() {
		
		return " Thong tin tai lieu: Ma tai lieu: " + maTaiLieu + " , Ten nha xuat ban: " 
				+ tenNhaXuatBan + " , So ban phat hanh: " + soBanPhatHanh;
	}
	
	
}
