package BaiTapBoSung;

import java.time.LocalDate;

public class HocSinhYeu extends HocSinh{
	private float diemThapNhat;
	private LocalDate ngayMoiPhuHuynh;
	
	public HocSinhYeu(String hoTen, int tuoi, String email, String Sdt, float diemThapNhat, LocalDate ngayMoiPhuHuynh) {
		super(hoTen, tuoi, email, Sdt);
		this.diemThapNhat = diemThapNhat;
		this.ngayMoiPhuHuynh = ngayMoiPhuHuynh;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", Diem thap nhat: " + diemThapNhat + 
				" Ngay moi phu huynh len lam viec: " + ngayMoiPhuHuynh;
	}

	public float getDiemThapNhat() {
		return diemThapNhat;
	}

	public void setDiemThapNhat(float diemThapNhat) {
		this.diemThapNhat = diemThapNhat;
	}

	public LocalDate getNgayMoiPhuHuynh() {
		return ngayMoiPhuHuynh;
	}

	public void setNgayMoiPhuHuynh(LocalDate ngayMoiPhuHuynh) {
		this.ngayMoiPhuHuynh = ngayMoiPhuHuynh;
	}
	
	

}
