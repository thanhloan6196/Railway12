package com.vti.entity.Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Question 2: Tiếp tục Question 1
//Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực
//hiện các chức năng sau:
//a) Thêm mới cán bộ.
//b) Tìm kiếm theo họ tên.
//c) Hiện thị thông tin về danh sách các cán bộ.
//d) Nhập vào tên của cán bộ và delete cán bộ đó
//e) Thoát khỏi chương trình.

public class QuanLyCanBo {
	static Scanner scanner = new Scanner(System.in);
	static List<CanBo> danhSachCanBo = new ArrayList<CanBo>();

	public static void main(String[] args) {
		System.out.println("================Chao mung ban den voi phan mem quan ly Can Bo============");
		int idChucNang = 0;
		while (idChucNang != 5) {
			System.out.println("1. Them moi can bo");
			System.out.println("2. Tim kiem theo ho ten");
			System.out.println("3. Hien thi thong tin ve danh sach can bo");
			System.out.println("4. Xoa ten theo ten can bo");
			System.out.println("5. Thoat khoi chuong trinh");

			System.out.println(" Moi ban nhap chuc nang:");
			Scanner sc = new Scanner(System.in);
			idChucNang = sc.nextInt();

			switch (idChucNang) {
			case 1:
				themMoiCanBo();
				break;
			case 2:
				timKiemCanBo();
				break;
			case 3:
				hienThiThongTin();
				break;
			case 4:
				xoaTenCanBo();
				break;
			case 5:
				System.out.println(" Cam on ban da su dung phan mem quan ly can bo!!!!");
				break;
			default:
				System.out.println(" Moi ban nhap tu 1 den 5");
				break;
			}
		}

	}

	private static void themMoiCanBo() {
		System.out.println("============= Them moi can bo ============");
		System.out.println("1. Them moi cong nhan");
		System.out.println("2. Them moi ky su");
		System.out.println("3. Them moi nhan vien");
		System.out.println(" Moi ban chon chuc nang: ");
		Scanner sc = new Scanner(System.in);
		int chon = sc.nextInt();

		switch (chon) {
		case 1:
			themMoiCongNhan();
			break;
		case 2:
			themMoiKySu();
			break;
		case 3:
			themMoiNhanVien();
			break;

		default:
			System.out.println(" Moi ban chon chuc nang tu 1 den 3");
			break;
		}

	}

	private static void themMoiCongNhan() {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Moi ban nhap vao ho ten cong nhan:");
		String hoTen = sc.nextLine();
		System.out.println(" Moi ban nhap vao tuoi cua Cong nhan: ");
		String tuoi = sc.nextLine();
		System.out.println(" Moi ban nhap vao gioi tinh cua cong nhan:");
		String gender = sc.nextLine();
		Gender gioiTinh = Gender.fromValue(gender);
		System.out.println(" Moi ban nhap vao dia chi cua cong nhan");
		String diaChi = sc.nextLine();
		System.out.println(" Moi ban nhpa vao cap bac cua cong nhan: ");
		int bac = sc.nextInt();

		CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
		danhSachCanBo.add(congNhan);

	}

	private static void themMoiKySu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap ten ky su: ");
		String hoTen = sc.nextLine();
		System.out.println(" Moi ban nhap vao tuoi cua ky su: ");
		String tuoi = sc.nextLine();
		System.out.println(" Moi ban nhap vao gioi tinh cua ky su:");
		String gender = sc.nextLine();
		Gender gioiTinh = Gender.fromValue(gender);
		System.out.println(" Moi ban nhap vao dia chi cua ky su");
		String diaChi = sc.nextLine();
		System.out.println(" Moi ban nhap vao nganh dao tao cua ky su: ");
		String nganhDaoTao = sc.nextLine();
		KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
		
		danhSachCanBo.add(kySu);

	}

	private static void themMoiNhanVien() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap ten nhan vien: ");
		String hoTen = sc.nextLine();
		System.out.println(" Moi ban nhap vao tuoi cua nhan vien: ");
		String tuoi = sc.nextLine();
		System.out.println(" Moi ban nhap vao gioi tinh cua nhan vien:");
		String gender = sc.nextLine();
		Gender gioiTinh = Gender.fromValue(gender);
		System.out.println(" Moi ban nhap vao dia chi cua nhan vien");
		String diaChi = sc.nextLine();
		System.out.println(" Moi ban nhap vao cong viec cua nhan vien: ");
		String congViec = sc.nextLine();
		NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
		danhSachCanBo.add(nhanVien);


	}

	private static void xoaTenCanBo() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap ten can bo muon xoa: ");
		String tenCanBoXoa = sc.nextLine();
		if (tenCanBoXoa == null || tenCanBoXoa == "") {
			System.out.println(" Khong co can bo nao khong co ten");
		} else {
			List<CanBo> danhSachXoa = new ArrayList<CanBo>();

			for (CanBo canBo : danhSachCanBo) {
				if (tenCanBoXoa.equals(canBo.getHoTen())) {
					danhSachXoa.add(canBo);
				}
				if (danhSachXoa.size() > 0) {
					danhSachCanBo.removeAll(danhSachXoa);
					System.out.println(" Ban da xoa nhung can bo co ten: " + tenCanBoXoa);
				} else {
					System.out.println(" Khong tim thay can bo " + tenCanBoXoa);
				}

			}

		}
	}

	private static void hienThiThongTin() {
		System.out.println(" Thong tin can bo: ");
		for (CanBo canBo : danhSachCanBo) {
			System.out.println(canBo);
		}

	}

	private static void timKiemCanBo() {
		System.out.println(" Nhap ten can bo can tim kiem: ");
		Scanner sc = new Scanner(System.in);
		String tenCanTim = sc.nextLine();
		boolean isCanBo = true;
		if (tenCanTim == null || tenCanTim.equals("")) {
			System.out.println(" Khong co can bo nao khong co ten");
		} else {
			for (CanBo canBo : danhSachCanBo) {
				if (tenCanTim.equals(canBo.getHoTen())) {
					System.out.println(canBo);
					isCanBo = true;
					return;
				} else {
					isCanBo = false;
				}
			}
			if (!isCanBo) {
				System.out.println(" Khong co ten can bo nay trog danh sach!");
			}
		}

	}

}
