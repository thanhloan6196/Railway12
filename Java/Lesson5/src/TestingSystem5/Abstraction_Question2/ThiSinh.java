package TestingSystem5.Abstraction_Question2;

public class ThiSinh {
	private int soBaoDanh;
	private String hoTen;
	private String diaChi;
	private String mucUuTien;
	
	public ThiSinh( int soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
	}
	
	@Override
	public String toString() {
		
		return " So bao danh: " + soBaoDanh + " , Ho Ten: " + hoTen + 	
				" , Dia chi: " + diaChi + " , Muc uu tien: " + mucUuTien;
	}

	public int getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(int soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUuTien(String mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	

	
	
	
}
