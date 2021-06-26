
public class HinhBinhHanh extends DaGiac{
	private float canhDay;
	private float canhBen;
	private float chieuCao;
	
	public HinhBinhHanh(float canhDay, float canhBen, float chieuCao ) {
		this.canhDay = canhDay;
		this.canhBen = canhBen;
		this.chieuCao = chieuCao;
	}
	@Override
	public float tinhChuVi() {
		
		return (canhDay + canhBen)*2;
	}
	@Override
	public float tinhDienTich() {
		
		return canhDay*chieuCao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Hinh binh hanh   " +" Canh day: " + canhDay + " Canh Ben: " + canhBen + " Chieu Cao: " + chieuCao
				+ " Chu vi: " + tinhChuVi() + " Dien tich: " + tinhDienTich();
	}
	
}
