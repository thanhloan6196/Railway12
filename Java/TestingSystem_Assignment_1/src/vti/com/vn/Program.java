package vti.com.vn;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
//		 Department

		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Phong Sale";

		Department department2 = new Department();
		department2.id = 1;
		department2.departmentName = "Phong Marketing";

		Department department3 = new Department();
		department3.id = 1;
		department3.departmentName = "Phong Ky thuat";

		System.out.println("id: " + department1.id);
		System.out.println("departmentName: " + department1.departmentName);

//		 Position

		Position position1 = new Position();
		position1.id = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.positionName = PositionName.TEST;

		Position position3 = new Position();
		position3.id = 3;
		position3.positionName = PositionName.SCRUM_MASTER;

		Position position4 = new Position();
		position4.id = 2;
		position4.positionName = PositionName.PM;

		System.out.println("id position4: " + position4.id);
		System.out.println("positionName: " + position4.positionName);

//		 Group
		Group group1 = new Group();
		group1.id = 1;
		group1.groupName = "Group 1";

		Group group2 = new Group();
		group2.id = 2;
		group2.groupName = "Group 2";

		Group group3 = new Group();
		group3.id = 3;
		group3.groupName = "Group 3";

//		Account

		Account account1 = new Account();
		account1.id = 1;
		account1.email = "daoloan6196@gmail.com";
		account1.fullName = "Dao Thi Thanh Loan";
		account1.userName = "LoanDao";
		account1.department = department1;
		account1.position = position1;
		Date date1 = new Date();
		account1.createDate = date1;
		Group[] dsNhom1 = { group1 };
		account1.dsNhom = dsNhom1;

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "phuonglinh.vu@gmail.com";
		account2.fullName = "Vu Phuong Linh";
		account2.userName = "LinhVu";
		account2.department = department2;
		account2.position = position2;
		Date date2 = new Date();
		account2.createDate = date2;
		Group[] dsNhom2 = { group1, group2 };
		account2.dsNhom = dsNhom2;

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "nguyenbaoquyen@gmail.com";
		account3.fullName = "Nguyen Bao Quyen";
		account3.userName = "Quyen Nguyen";
		account3.department = department3;
		account3.position = position1;
		Date date3 = new Date();
		account3.createDate = date3;
		Group[] dsNhom3 = { group1, group2, group3 };
		account3.dsNhom = dsNhom3;

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "trang.nguyen@gmail.com";
		account4.fullName = "Nguyen Quynh Trang";
		account4.userName = "Trang Nguyen";
		account4.department = department1;
		account4.position = position2;
		Date date4 = new Date();
		account4.createDate = date4;
		Group[] dsNhom4 = { group1, group3 };
		account4.dsNhom = dsNhom4;

		Account[] dsnhanvien1 = { account1, account2, account3, account4 };
		group1.dsNhanVien = dsnhanvien1;

		Account[] dsnhanvien2 = { account2, account3 };
		group2.dsNhanVien = dsnhanvien2;
		
		Account[] dsnhanvien3 = { account3, account4};
		group3.dsNhanVien = dsnhanvien3;
		
		
		
		System.out.println("ID nhan vien la: " + account1.id);
		System.out.println("Ten nhan vien: " + account1.fullName);
		System.out.println("Email: " + account1.email);
		System.out.println("User Name: " + account1.userName);
		System.out.println("Ten Phong ban: " + account1.department.departmentName);
		System.out.println("Vi tri nhan vien: " + account1.position.positionName);
		System.out.println("Ngay vao cong ty: " + account1.createDate.toString());
		System.out.println("Nhan vien o trong nhom: ");
		for (int i = 0; i < account1.dsNhom.length; i++) {
			System.out.println(account1.dsNhom[i].groupName);
		}

	}

}
