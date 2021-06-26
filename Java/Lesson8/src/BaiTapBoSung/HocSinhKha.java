package BaiTapBoSung;

public class HocSinhKha extends HocSinh{
	private  float diemTrungBinh;
	
	
	public HocSinhKha(String hoTen, int tuoi, String email, String Sdt, float diemTrungBinh) {
		super(hoTen, tuoi, email, Sdt);
		this.diemTrungBinh = diemTrungBinh;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " , Diem trung binh: " + diemTrungBinh;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	
}
