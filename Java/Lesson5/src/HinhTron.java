
public class HinhTron extends DaGiac {
	private float banKinh;
	
	public HinhTron(float banKinh) {
		this.banKinh = banKinh;
	}

	@Override
	public float tinhChuVi() {
		
		return banKinh* 2 * (3.14f);
	}

	@Override
	public float tinhDienTich() {
		return banKinh*banKinh*3.14f;
	}
	
	@Override
	public String toString() {
		
		return " Hinh tron  " +" Ban kinh: " + banKinh + " Chu vi: " + tinhChuVi() + " Dien tich " + tinhDienTich();
	}
	
}
