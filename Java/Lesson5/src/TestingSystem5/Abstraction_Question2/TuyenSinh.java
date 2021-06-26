package TestingSystem5.Abstraction_Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
	static List<ThiSinh> danhSachThiSinh = new ArrayList<>();
	
	@Override
	public void themMoiThiSinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap so bao danh: ");
		int soBaoDanh = sc.nextInt();
		sc.nextLine();
		System.out.println(" Nhap ho ten: ");
		String hoTen = sc.nextLine();
		System.out.println(" Nhap dia chi: ");
		String diaChi = sc.nextLine();
		System.out.println(" Nhap muc uu tien: ");
		String mucUutien = sc.nextLine();
		System.out.println(" Chon khoi( chon A hoac B hoac C): ");
		String chonKhoi = sc.nextLine();
		switch (chonKhoi) {
		case "A":
			ThiSinhKhoiA thisinhKhoiA = new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, mucUutien);
			danhSachThiSinh.add(thisinhKhoiA);
			break;
		case "B":
			ThiSinhKhoiB thisinhKhoiB = new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUutien);
			danhSachThiSinh.add(thisinhKhoiB);
			break;
		case "C":
			ThiSinhKhoiC thisinhKhoiC = new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUutien);
			danhSachThiSinh.add(thisinhKhoiC);
			break;
		default:
			break;
		}
	}

	@Override
	public void hienThiThongTin() {
		for (ThiSinh thiSinh : danhSachThiSinh) {
			System.out.println(thiSinh);
		}
		
	}

	@Override
	public void timKiemtheoSBD() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap so bao danh can tim: ");
		int sbdCanTim = sc.nextInt();
		for (ThiSinh thiSinh : danhSachThiSinh) {
			if( thiSinh.getSoBaoDanh() == sbdCanTim) {
				System.out.println(thiSinh);
			}
		}
		
	}

}
