package TestingSystem5.Abstraction_Question2;

public class ThiSinhKhoiB extends ThiSinh{

	public ThiSinhKhoiB(int soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		
	}
	@Override
	public String toString() {
		
		return super.toString() + " Khoi B: Toan, Hoa, Sinh ";
	}
}
