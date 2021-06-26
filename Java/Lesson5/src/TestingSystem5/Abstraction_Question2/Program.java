package TestingSystem5.Abstraction_Question2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		TuyenSinh tuyensinh = new TuyenSinh();
		System.out.println(" =====================Chao mung ban den voi chuong trinh tuyen sinh=====================");
		int idChucNang = 0;
		while( idChucNang !=4) {
			System.out.println("1. Them moi thi sinh");
			System.out.println("2. Hien thi thong tin thi sinh va khoi cua thi sinh");
			System.out.println("3. Tim kiem theo So Bao Danh");
			System.out.println("4. Thoat khoi chuong trinh");
			Scanner sc = new Scanner(System.in);
			idChucNang = sc.nextInt();
			switch (idChucNang) {
			case 1:
				tuyensinh.themMoiThiSinh();
				break;
			case 2:
				tuyensinh.hienThiThongTin();;
				break;
			case 3:
				tuyensinh.timKiemtheoSBD();
				break;
			case 4:
				System.out.println(" Cam on ban da su dung dich vu!");
				break;
			default:
				System.err.println("Moi ban nhap tu 1 den 4");
				break;
			}
		}

	}

}
