import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
	
	static List<DaGiac> listHinhHoc = new ArrayList<DaGiac>() ;

	public static void main(String[] args) {
		
//		Tạo 1 class abstract da giac co 2 phuong thuc abstract tinh chu vi va dien tich.
//		Khai bao cac lớp con kế thừa lại lớp hình học, các lớp con là hình tròn, hình vuông, hình chữ nhật, hình thang, hình bình hành.
//		Khai báo các thuộc tính cho các lớp con và tính chu vi, diện tích. Tạ một chương trình quản lý hình học cho phép tạo mới hình,
//		hiển thị thông tin các hình bao gồm các thuộc tính vd: bán kính, chiều rộng, chu vi, diện tích.
//		Cho phép xóa 1 hình. 
		
		System.out.println(" Chao mung ban da den voi phan mem quan ly  hinh hoc");
		System.out.println(" --------------------------***---------------------------------");
		Scanner sc = new Scanner(System.in);
		int chon = 0;
		while (chon < 4) {
			System.out.println("1. them moi hinh");
			System.out.println("2. Hien thi thong tin cac hinh");
			System.out.println("3. Thoat khoi chuong trinh ");
			System.out.println(" Moi ban chon chuc nang: ");
			chon = sc.nextInt();
			
			switch(chon) {
			case 1: themMoiHinh();
			break;
			case 2: hienThiThongTin();
			break;
			case 3: System.out.println(" Cam on va hen gap lai!!!");
			break;
			default:
				System.out.println(" Moi ban chon 1 trong 3 phuong an!!!");
			}
			
		}

		
	}
	
	public static void themMoiHinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1. Them moi hinh tron");
		System.out.println(" 2. them moi hinh binh hanh");
		System.out.println(" 3. Them moi hinh vuong");
		System.out.println(" Moi ban chon hinh can tao moi: ");
		int chon = sc.nextInt();
	
		switch(chon) {
		case 1: themMoiHinhTron();
		break;
		case 2: themMoiHinhBinhHanh();
		break;
		case 3: themMoiHinhVuong();
		break;
		default:
			break;
		
		}
		
	}
	public static void themMoiHinhTron() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap vao ban kinh: ");
		float banKinh = sc.nextFloat();
		HinhTron hinhTron = new HinhTron(banKinh);
		listHinhHoc.add(hinhTron);
		
	}
	
	public static void themMoiHinhBinhHanh() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi nhap vao canh day: ");
		float canhDay = sc.nextFloat();
		System.out.println(" Moi nhap vao canh ben: ");
		float canhBen = sc.nextFloat();
		System.out.println(" Moi nhap vao chieu cao: ");
		float chieuCao = sc.nextFloat();
		HinhBinhHanh hinhBinhHanh = new HinhBinhHanh(canhDay, canhBen, chieuCao);
		listHinhHoc.add(hinhBinhHanh);
		
	}
	
	public static void themMoiHinhVuong() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi nhap vao canh cua hinh vuong: ");
		float canh = sc.nextFloat();
		HinhVuong hinhVuong = new HinhVuong(canh);
		listHinhHoc.add(hinhVuong);
		
	}
	
	
	public static void hienThiThongTin() {
		 for (DaGiac daGiac : listHinhHoc) {
			System.out.println(daGiac.toString());
		}
	}

}
