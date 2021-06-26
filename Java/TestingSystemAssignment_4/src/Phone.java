
public class Phone {
	// dong goi: de private het, de bao mat va do nham lan ko cho class khac truy cap.
	private int id;
	private String loaiDienThoai;
	private String heDieuHanh;
	private Double giaTien;
	
	public Phone( int id, String loaiDienThoai, String heDieuHanh, Double giaTien) {
		this.id = id;
		this.loaiDienThoai = loaiDienThoai;
		this.heDieuHanh = heDieuHanh;
		this.giaTien = giaTien;
		System.out.println(" Khoi tao cha");
	}
	public int getId() {
		return this.id;
		
	}
	public String getLoaiDienThoai() {
		return this.loaiDienThoai;
	}
	public String getHeDieuHanh() {
		return this.heDieuHanh;
	}
	public Double getGiaTien() {
		return this.giaTien;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public void setLoaiDienThoai(String loaiDienThoai) {
		 this.loaiDienThoai = loaiDienThoai;
	}
	public void setHeDieuHanh(String heDieuHanh) {
		this.heDieuHanh = heDieuHanh;
	}
	public void setGiaTien( Double giaTien) {
		if ( giaTien < 100000) {
			System.out.println(" Gia thap qua");
		} 
		this.giaTien = giaTien;
	}

}
