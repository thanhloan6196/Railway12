package com.vti.entity.Q4_QuanLyTaiTieu;

public class TapChi extends TaiLieu{
	
	private int soPhatHanh;
	private byte thangPhatHanh;
	private byte ngayPhatHanh;

	public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, byte thangPhatHanh, byte ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public byte getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(byte thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	public byte getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(byte ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Loai tai lieu: Tap Chi" + " , So phat hanh: " + soPhatHanh + " , Thang phat hanh: "
				+ thangPhatHanh + " , Ngay phat hanh: " + ngayPhatHanh;
	}

}
