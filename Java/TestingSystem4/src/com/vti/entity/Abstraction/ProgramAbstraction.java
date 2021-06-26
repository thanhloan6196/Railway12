package com.vti.entity.Abstraction;

import java.util.Scanner;

public class ProgramAbstraction {
	public static void main(String[] args) {
		
		VietNamesePhone vnphone = new VietNamesePhone();
		
		System.out.println(" =================Chao muwng ban den voi phan mem quan ly Contact==================");
		int idChucNang = 0;
		while ( idChucNang != 6 ) {
			System.out.println("Moi ban chon chuc nang:");
			System.out.println("Enter 1: Them moi lien he:");
			System.out.println("Enter 2: Xoa lien he:");
			System.out.println("Enter 3: Cap nhat lien he:");
			System.out.println("Enter 4: Tim kiem lien he:");
			System.out.println("Enter 5: Hien thi thong tin:");
			System.out.println("Enter 6: Thoat khoi chuong trinh");
			
			Scanner sc = new Scanner(System.in);
			idChucNang = sc.nextInt();
			sc.nextLine();
			
			switch (idChucNang) {
			case 1:
				System.out.println(" Them moi lien he:");
				System.out.println(" Moi ban nhap ten: ");
				
				String name = sc.nextLine();
				System.out.println(" Moi ban nhap SDT: ");
				
				String phone = sc.nextLine();
				vnphone.insertContact(name, phone);
				break;
				
			case 2:
				
				System.out.println(" Moi ban nhap ten cua lien he muon xoa: ");
				String name2 = sc.nextLine();
				vnphone.removeContact(name2);
				break;
				
			case 3:
				System.out.println(" Moi ban nhap ten lien he muon cap nhat: ");
				String name3 = sc.nextLine();
				System.out.println(" Moi ban nhap SDT moi: ");
				String newPhone = sc.nextLine();
				vnphone.updateConTact(name3, newPhone);
				break;
				
			case 4:
				System.out.println(" Moi ban nhap ten cua lien he can tim: ");
				String name4 = sc.nextLine();
				vnphone.searchContact(name4);
				break;
			case 5:
				vnphone.printContact();
				break;
			case 6:
				System.out.println(" Cam on ban da su dung dich vu!!!");
				break;

			default:
				System.err.println(" Moi ban nhap tu 1 den 5");
			}
		}
		
		
		
	}
}
