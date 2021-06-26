package com.vti.entity.Q4_QuanLyTaiTieu;

public class Bao extends TaiLieu{
	private int ngayPhatHanh;
	
	public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
				
	}

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Loai tai lieu: Bao, " + " Ngay phat hanh: " + ngayPhatHanh;
	}

}
