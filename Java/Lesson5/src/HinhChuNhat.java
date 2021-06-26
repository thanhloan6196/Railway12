

public class HinhChuNhat extends DaGiac {
	private float chieuRong;
	private float chieuDai;
	
	
	public HinhChuNhat(float chieuRong, float chieuDai) {
		this.chieuRong = chieuRong;
		this.chieuDai = chieuDai;
	}
		
	@Override
	public float tinhChuVi() {
		// TODO Auto-generated method stub
		return (chieuDai+chieuRong)*2;
	}




	@Override
	public float tinhDienTich() {
		// TODO Auto-generated method stub
		return chieuDai*chieuRong;
	}
	

	@Override
	public String toString() {
		return " Hinh chu nhat   " + "Chieudai: " + chieuDai + " Chieu rong: " + chieuRong + " Chu vi:" + tinhChuVi()
		+ "  Dien tich" + tinhDienTich();
	}




	
}
