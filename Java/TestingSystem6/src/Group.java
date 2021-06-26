
import java.time.LocalDate;
import java.util.ArrayList;

public class Group {
	int id;
	String groupName;
	Account creatorId;
	LocalDate createDate;
	Account[] dsNhanVien;
	
	// Tao mang danh sach nhan vien( Question 9)
	static ArrayList<Account> danhSachNhanVien = new ArrayList<Account>();
	
	// Khoi tao constructor cho Group ( Question 9)
	public Group() {
		System.out.println(" Nhap id cua Group");
		this.id = ScannerUtils.inputIntPositive();
		System.out.println(" Nhap ten Group: ");
		this.groupName = ScannerUtils.inputString();
		System.out.println(" Nhap ngay tao group: ");
		this.createDate = ScannerUtils.inputLocalDate();
		
		while (true) {

			System.out.println(" Ban co muon them Account hay khong? \n" + "1. Co \n" + "2. Khong");
			int chon = ScannerUtils.inputIntPositive();
			switch (chon) {
			case 1:
				Account account = new Account();
				danhSachNhanVien.add(account);
				break;
			case 2:
				return;
			default:
				System.err.println(" Moi ban nhap 1 hoac 2!");
			}
		}

	}
	// Tao method in thong tin group ( Question 9)
	public void printInforGroup() {
		System.out.println(" Thong tin Group: [ Id: " + this.id + " , Ten group: " + this.groupName
				+ ", Ngay tao group: " + this.createDate + "]");
		System.out.println(" Group co so Account la: " + danhSachNhanVien.size());
		for (Account account : danhSachNhanVien) {
			System.out.println(account);
		}
	}
}
