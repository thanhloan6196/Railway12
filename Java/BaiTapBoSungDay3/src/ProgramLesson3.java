import java.util.Scanner;

public class ProgramLesson3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Cau 1:
		System.out.println(" Moi ban nhap vao chieu rong: ");
		int chieuRong = scanner.nextInt();
		System.out.println(" Moi ban nhap vao chieu dai: ");
		int chieuDai = scanner.nextInt();
		int chuVi = chuViHinhCHuNhat(chieuRong, chieuDai);
		System.out.println(" Chu vi cua Hinh chu nhat la: " + chuVi);
		// Cau 2:
		System.out.println(" Moi ban nhap vao canh hinh vuong: ");
		int canh = scanner.nextInt();
		int dienTich = sHinhVuong(canh);
		System.out.println(" Dien tich hinh vuong la : " + dienTich);

		// Cau 3:

		System.out.println(" Cac so chia het cho 7 nhung khong la boi so cua 5 va nam trong doan 10 va 200 la: ");
		soCanTim();

		// Cau 4:

		System.out.println(" \n Moi ban nhap vao 1 so: ");
		int num = scanner.nextInt();
		int tong = tongCacChuSo(num);
		System.out.println(" Tong cac chu so cua so nhap vao la: " + tong);

		// Cau 5:
		System.out.println(" Moi ban nhap vao he so a: ");
		int a = scanner.nextInt();
		System.out.println(" Moi ban nhap vao he so b: ");
		int b = scanner.nextInt();
		System.out.println(" Moi ban nhap vao he so c: ");
		int c = scanner.nextInt();

		giaiPTBac2(a, b, c);
		
		// Cau 6:
		loginAccount();

	}

//	 ===================================== FUNCTION ================================================

//	1 - Viet ham tinh chu vi HCN

	public static int chuViHinhCHuNhat(int chieuRong, int chieuDai) {
		int chuVi = (chieuRong + chieuDai) * 2;
		return chuVi;
	}
//		2 - Viet ham tinh dien tich hinh vuong

	public static int sHinhVuong(int canh) {
		int dienTich = canh * canh;
		return dienTich;
	}

//	3 - Viet chuong trinh timf tat ca so chia het cho 7 nhung ko la boi so cua 5

	public static void soCanTim() {
		for (int a = 10; a <= 200; a++) {
			if (a % 7 == 0 && a % 5 != 0) {
				System.out.print(a + "     ");
			}
		}
	}

//		4 - Viet chuong trinh tinh tong cac chu so cua 1 so

	public static int tongCacChuSo(int x) {
		int tong, soDu;
		tong = 0;

		while (x > 0) {
			soDu = x % 10;
			tong = tong + soDu;
			x = x / 10;

		}
		return tong;
	}

//	5 - Viet chuong trinh giai PTB2:

	// a*x^2 + b*x + c = 0

	public static void giaiPTBac2(float a, float b, float c) {
		float x;
		if (a == 0) {
			if (b == 0) {
				System.out.println(" Phuong trinh vo nghiem");
			} else {
				System.out.println(" Phuong trinh co 1 nghiem x = " + (float) (-c / b));
			}

		} else {
			float delta = b * b - 4 * a * c;
			float x1;
			float x2;
			if (delta > 0) {
				x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println(" Phuong trinh co 2 nghiem la: " + x1 + "va" + x2);
			} else if (delta == 0) {
				x = (-b / (2 * a));
				System.out.println(" Phuong trinh co nghiem kep la x1 = x2 = " + x);
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}

		}

	}

//	6 - Viet chuong trinh dang nhap vao tai khoan, cho nhap vao username va password,
//		neu nhap thanh cong bao dang nhap thanh cong

	public static void loginAccount() {

		String userName = "ThanhLoan";
		String password = "123456";
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Moi ban nhap userName: ");
		String userN1 = scanner.nextLine();
		System.out.println(" Moi ban nhap password: ");
		String pass1 = scanner.nextLine();

		if (userN1.equals(userName) && pass1.equals(pass1)) {
			System.out.println(" Ban da dang nhap thanh cong");
		} else {
			System.out.println(" Ban da nhap khong dung userName hoac password!");
		}

	}
	
	
}
