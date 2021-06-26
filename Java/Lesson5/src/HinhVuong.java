

public class HinhVuong extends DaGiac{
	private float canh;
	
	public HinhVuong(float canh) {
		this.canh = canh;
	}

	@Override
	public float tinhChuVi() {
		
		return canh*4;
	}

	@Override
	public float tinhDienTich() {
		// TODO Auto-generated method stub
		return canh*canh;
	}
	
	@Override
	public String toString() {
		
		return " Hinh vuong  " +" Chieu dai canh: " + canh + " Chu vi: " + tinhChuVi() + " Dien tich" + tinhDienTich();
	}
	

	
}
