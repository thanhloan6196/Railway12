package com.vti.entity.Q4_QuanLyTaiTieu;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;
	public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Loai tai lieu: Sach, " + " Ten tac gia: " + tenTacGia + " , So trang: " + soTrang;
	}

}
