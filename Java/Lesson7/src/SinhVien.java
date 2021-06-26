import java.io.Serializable;

public class SinhVien implements Serializable{
	int msv;
	String hoTen;
	static String tenTruong = " Buu chinh vien thong";
	
	public SinhVien(int msv, String hoTen) {
		this.msv = msv;
		this.hoTen = hoTen;
	}
	
	void display() {
		System.out.println(" Ma sinh vien: " + msv + " , Ho ten: " + hoTen + " , Ten truong: " + tenTruong);
	}
}
