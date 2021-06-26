package com.vti.entity.Q4_QuanLyTaiTieu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<TaiLieu>();
	public static void main(String[] args) {
		
		
		int idChucNang = 0;
		
		while( idChucNang != 5) {
			System.out.println(" =====================Chao mung ban den voi phan mem quan ly tai lieu=====================");
			System.out.println("Moi ban lua chon chuc nang: ");
			System.out.println("1. Them moi tai lieu");
			System.out.println("2. Xoa tai lieu theo ma tai lieu");
			System.out.println("3. Hien thi thong tin ve tai lieu");
			System.out.println("4. Tim kiem tai lieu theo loai: Sach, tap chi, bao");
			System.out.println("5. Thoat khoi chuong trinh");
			
			Scanner sc = new Scanner(System.in);
			idChucNang = sc.nextInt();
			
			switch (idChucNang) {
			case 1:
				themMoiTaiLieu();
				break;
			case 2:
				xoaTailieu();
				break;
			case 3:
				hienThiThongTinTaiLieu();
				break;
			case 4:
				timKiemTaiLieu();
				break;
			case 5:
				System.err.println(" Cam on ban da su dung dich vu quan ly tai lieu!");
				return;
			default:
				System.err.println(" Moi ban nhap tu 1 den 5");
			}
		}
		
	}

	private static void themMoiTaiLieu() {
		System.out.println(" Them moi tai lieu: ");
		System.out.println(" Moi ban chon chuc nang: ");
		System.out.println("1. Them moi sach ");
		System.out.println("2. Them moi Tap chi");
		System.out.println("3. Them moi bao");
//		System.out.println("4. Thoat");
				
			Scanner sc = new Scanner(System.in);
			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				themMoiSach();
				break;
			case 2:
				themMoiTapChi();
				break;
			case 3:
				themMoiBao();
				break;
			default:
				System.err.println(" Moi ban chon 1 den 3!");
				break;
			}
		
		
		
		
	}
	private static void themMoiBao() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap ma tai lieu: ");
		String maTaiLieu = sc.nextLine();
		System.out.println(" Moi ban nhap Ten nha xuat ban: ");
		String tenNhaXuatBan = sc.nextLine();
		System.out.println(" Moi ban nhap so ban phat hanh: ");
		int soBanPhatHanh = sc.nextInt();
		System.out.println(" Moi ban nhap ngay phat hanh: ");
		int ngayPhatHanh = sc.nextInt();
	
		Bao bao = new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
		danhSachTaiLieu.add(bao);
		
		
	}

	private static void themMoiTapChi() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap ma tai lieu: ");
		String maTaiLieu = sc.nextLine();
		System.out.println(" Moi ban nhap Ten nha xuat ban: ");
		String tenNhaXuatBan = sc.nextLine();
		System.out.println(" Moi ban nhap so ban phat hanh: ");
		int soBanPhatHanh = sc.nextInt();
		System.out.println(" Moi ban nhap so phat hanh:");
		int soPhatHanh = sc.nextInt();
		System.out.println(" Moi ban nhap thang phat hanh: ");
		byte thangPhatHanh = sc.nextByte();
		System.out.println(" Moi ban nhap ngay phat hanh: ");
		byte ngayPhatHanh = sc.nextByte();
		
		TapChi tapChi = new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh, ngayPhatHanh);
		danhSachTaiLieu.add(tapChi);
		
	}

	private static void themMoiSach() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap ma tai lieu: ");
		String maTaiLieu = sc.nextLine();
		System.out.println(" Moi ban nhap Ten nha xuat ban: ");
		String tenNhaXuatBan = sc.nextLine();
		System.out.println(" Moi ban nhap so ban phat hanh: ");
		int soBanPhatHanh = sc.nextInt();
		sc.nextLine();
		System.out.println(" Moi ban nhap Ten tac gia: ");
		String tenTacGia = sc.nextLine();
		System.out.println(" Moi ban nhap so trang: ");
		int soTrang = sc.nextInt();
	
		Sach sach = new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
		
		danhSachTaiLieu.add(sach);
		
	}

	private static void xoaTailieu() {
		System.out.println(" Nhap ma tai lieu muon xoa: ");
		Scanner sc = new Scanner(System.in);
		String taiLieuMuonXoa = sc.nextLine().trim();
		if (taiLieuMuonXoa.equals(null)) {
			System.err.println(" Khong co tai lieu nao khong co ma.");
		} else {
			ArrayList<TaiLieu> taiLieuXoa = new ArrayList<TaiLieu>();
			for (TaiLieu taiLieu : danhSachTaiLieu) {
				if(taiLieuMuonXoa.equals(taiLieu.getMaTaiLieu())) {
					taiLieuXoa.add(taiLieu);
				} 
			}
			if(taiLieuXoa.size() > 0) {
				danhSachTaiLieu.removeAll(taiLieuXoa);
				System.err.println(" Ban da xoa tai lieu co ma " + taiLieuMuonXoa);
			} else {
				System.err.println(" tai lieu ban muon xoa khong co trong danh sach!");
			}
		}
		
		
	}
	
	private static void hienThiThongTinTaiLieu() {
		System.out.println(" Hien thi thong tin tai lieu: ");
		for (TaiLieu taiLieu : danhSachTaiLieu) {
			System.out.println(taiLieu);
		}
		
	}
	
	private static void timKiemTaiLieu() {
		System.out.println(" Nhap ma tai lieu can tim: ");
		Scanner sc = new Scanner(System.in);
		String taiLieuCanTim = sc.nextLine();
		if(taiLieuCanTim.equals(null)) {
			System.err.println(" Khong co tai lieu nao khong co ten");
		} else {
			boolean check = true;
			for (TaiLieu taiLieu : danhSachTaiLieu) {
				if(taiLieuCanTim.equals(taiLieu.getMaTaiLieu())) {
					System.out.println(taiLieu);
					return;
				} else {
					check = false;
				}
			}
			if (!check) {
				System.err.println(" Tai lieu ban can tim khong co trong danh sach");
			}
		}
	}
}
