package BaiTapBoSung;

public class HocSinhGioi extends HocSinh{
	
	private MonHoc doiTuyenHSG;

	public HocSinhGioi(String hoTen, int tuoi, String email, String Sdt, MonHoc doiTuyenHSG) {
		super(hoTen, tuoi, email, Sdt);
		this.doiTuyenHSG = doiTuyenHSG;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " , Doi tuyen HSG: " + doiTuyenHSG;
	}

	public MonHoc getDoiTuyenHSG() {
		return doiTuyenHSG;
	}

	public void setDoiTuyenHSG(MonHoc doiTuyenHSG) {
		this.doiTuyenHSG = doiTuyenHSG;
	}
	
	

}
