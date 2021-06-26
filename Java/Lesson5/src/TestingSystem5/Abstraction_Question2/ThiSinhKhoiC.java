package TestingSystem5.Abstraction_Question2;

public class ThiSinhKhoiC extends ThiSinh {

	public ThiSinhKhoiC(int soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Khoi C: Van , Su, Dia ";
	}
}
