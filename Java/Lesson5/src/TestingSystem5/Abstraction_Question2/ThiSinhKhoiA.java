package TestingSystem5.Abstraction_Question2;

public class ThiSinhKhoiA extends ThiSinh{

	public ThiSinhKhoiA(int soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " Khoi A: Toan, Ly, Hoa ";
	}

}
