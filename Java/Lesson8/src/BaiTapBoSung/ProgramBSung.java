package BaiTapBoSung;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramBSung {
	static List<HocSinh> danhSachHocSinh = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cau hoi: Tao mot class hoc sinh co ca thuoc tinh: hoTen, tuoi, email, SDT.
//		Taoj 3 class ke thua lai class hoc sinh: hoc sinh gioi co them thuoc tinh la doi tuyen hoc sinh gioi theo hoc kieu ENUM toan, ly, Hoa
//		hoc sinh kha co them thuoc tinh la diem trung binh, hoc sinh yeu co them thuoc tinh la mon hoc co diem thap nhat 
//		va ngay moi phu huynh len lam viec ( localDate).
//		Viet chuong trinh quan ly hoc sinh cho phep them moi, hien thi toan bo thong tin danh sach hoc sinh, tim kiem theo ho ten.
		
		System.out.println(" ========================Chao mung ban den voi phan mem quan ly hoc sinh========================");
		int idChucNang = 0;
		while (idChucNang != 4) {
			System.out.println("1. Them moi hoc sinh");
			System.out.println("2. Tim kiem theo ho ten");
			System.out.println("3. Hien thi thong tin danh sach hoc sinh");
			System.out.println("4. Thoat khoi chuong trinh");
			System.out.println(" Moi ban nhap vao chuc nang: ");
			Scanner sc = new Scanner(System.in);
			idChucNang = sc.nextInt();
			
			switch (idChucNang) {
			case 1:
				themMoiHocSinh();
				break;
			case 2:
				timKiemHocSinh();
				break;
			case 3:
				hienThiThongTinHocSinh();
				break;
			case 4:
				System.out.println(" Cam on ban da su dung dich vu!!!");

			default:
				System.out.println(" Moi ban chon cac chuc nang tu 1 den 4!");
			}
		}
		

	}

	private static void hienThiThongTinHocSinh() {
		for (HocSinh hocSinh : danhSachHocSinh) {
			System.out.println(hocSinh);
		}
		
	}

	private static void timKiemHocSinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap ten hoc sinh can tim: ");
		String hoTen = sc.nextLine().trim();
		boolean isHocSinh = true;
		if(hoTen.equals(null) || hoTen.equals("")) {
			System.err.println(" Khong co hoc sinh nao khong co ho ten!");
		} else {
			for (HocSinh hocSinh : danhSachHocSinh) {
				if ( hocSinh.getHoTen().equals(hoTen)) {
					System.out.println(hocSinh);
					isHocSinh = true;
					return;
				} else isHocSinh = false;
			}
		}
		if(!isHocSinh) {
			System.err.println(" Khong co ho ten ban nhap trong danh sach hoc sinh!");
		}
		
	}

	private static void themMoiHocSinh() {
		System.out.println(" 1. Them moi hoc sinh gioi");
		System.out.println(" 2. Them moi hoc sinh kha");
		System.out.println(" 3. Them moi hoc sinh yeu");
		System.out.println(" Moi ban nhap vao loai hoc sinh muon them moi:");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sc.nextLine();
		
		switch (id) {
		case 1:
			themMoiHSGioi();
			break;
		case 2:
			themMoiHSKha();
			break;
		case 3:
			themMoiHSYeu();
			break;

		default:
			break;
		}
	}

	private static void themMoiHSYeu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap ho ten Hoc Sinh: ");
		String hoTen = sc.nextLine();
		System.out.println(" Moi ban nhap tuoi hoc sinh: ");
		int tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println(" Moi ban nhap email hoc sinh : ");
		String email = sc.nextLine();
		System.out.println(" Moi ban nhap SDT: ");
		String Sdt = sc.nextLine();
		System.out.println(" Moi ban nhap vao diem thap nhat: ");
		float diemThapNhat = sc.nextFloat();
		System.out.println(" Moi ban nhap vao ngay moi phu huynh: ");
		System.out.println(" Nhap nam: ");
		int year = sc.nextInt();
		System.out.println(" Nhap thang: ");
		int month = sc.nextInt();
		System.out.println(" Nhap ngay: ");
		int day = sc.nextInt();
		LocalDate ngayMoiPhuHuynh = LocalDate.of(year, month, day);
		
		HocSinhYeu hocSinhYeu = new HocSinhYeu(hoTen, tuoi, email, Sdt, diemThapNhat, ngayMoiPhuHuynh);
		danhSachHocSinh.add(hocSinhYeu);
		
	}

	private static void themMoiHSKha() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap ho ten Hoc Sinh: ");
		String hoTen = sc.nextLine();
		System.out.println(" Moi ban nhap tuoi hoc sinh: ");
		int tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println(" Moi ban nhap email hoc sinh : ");
		String email = sc.nextLine();
		System.out.println(" Moi ban nhap SDT: ");
		String Sdt = sc.nextLine();
		System.out.println(" Moi ban nhap diem trung binh: ");
		float diemTrungBinh = sc.nextFloat();
		
		HocSinhKha hocSinhKha = new HocSinhKha(hoTen, tuoi, email, Sdt, diemTrungBinh);
		danhSachHocSinh.add(hocSinhKha);
		
	}

	private static void themMoiHSGioi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap ho ten Hoc Sinh: ");
		String hoTen = sc.nextLine();
		System.out.println(" Moi ban nhap tuoi hoc sinh: ");
		int tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println(" Moi ban nhap email hoc sinh : ");
		String email = sc.nextLine();
		System.out.println(" Moi ban nhap SDT: ");
		String Sdt = sc.nextLine();
		System.out.println(" Moi ban nhap doi tuyen HSG: ");
		String doiTuyenHSG = sc.nextLine();
		MonHoc monHoc = MonHoc.fromValue(doiTuyenHSG);
		
		HocSinhGioi hocSinhGioi = new HocSinhGioi(hoTen, tuoi, email, Sdt, monHoc);
		danhSachHocSinh.add(hocSinhGioi);
	}

}
