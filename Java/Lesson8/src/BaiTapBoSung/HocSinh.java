package BaiTapBoSung;

public class HocSinh {
	private String hoTen;
	private int tuoi;
	private String email;
	private String Sdt;
	
	
	public HocSinh(String hoTen, int tuoi, String email, String Sdt ) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.email = email;
		this.Sdt = Sdt;
	}
	@Override
	public String toString() {
		
		return " Thong tin hoc sinh:  Ho ten: " + hoTen + " , Tuoi: " + tuoi
				+ " , Email: " + email + ", Sdt: " + Sdt;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return Sdt;
	}
	public void setSdt(String sdt) {
		Sdt = sdt;
	}
	
}
