package vti.com.vn;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ProgramTest2 {

	public static void main(String[] args) {
//		 Department

		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Phong Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.departmentName = "Phong Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.departmentName = "Phong Ky thuat";

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
		account1.createDate = LocalDate.of(2021, 1, 6);
		Group[] dsNhom1 = { group1 };
		account1.dsNhom = dsNhom1;

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "phuonglinh.vu@gmail.com";
		account2.fullName = "Vu Phuong Linh";
		account2.userName = "LinhVu";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = LocalDate.of(2021, 1, 6);
		Group[] dsNhom2 = { group1, group2 };
		account2.dsNhom = dsNhom2;

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "nguyenbaoquyen@gmail.com";
		account3.fullName = "Nguyen Bao Quyen";
		account3.userName = "Quyen Nguyen";
		account3.department = department3;
		account3.position = position1;
		account3.createDate = LocalDate.of(2021, 1, 6);
		Group[] dsNhom3 = { group1, group2, group3 };
		account3.dsNhom = dsNhom3;

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "trang.nguyen@gmail.com";
		account4.fullName = "Nguyen Quynh Trang";
		account4.userName = "Trang Nguyen";
		account4.department = department1;
		account4.position = position2;
		account4.createDate = LocalDate.of(2021, 1, 7);
		Group[] dsNhom4 = { group1, group3 };
		account4.dsNhom = dsNhom4;

		Account[] dsnhanvien1 = { account1, account2, account3, account4 };
		group1.dsNhanVien = dsnhanvien1;

		Account[] dsnhanvien2 = { account2, account3 };
		group2.dsNhanVien = dsnhanvien2;

		Account[] dsnhanvien3 = { account3, account4 };
		group3.dsNhanVien = dsnhanvien3;

//		CategoryQuestion

		CategoryQuestion category1 = new CategoryQuestion();
		category1.id = 1;
		category1.categoryName = "Essay";

		CategoryQuestion category2 = new CategoryQuestion();
		category2.id = 2;
		category2.categoryName = "Mutiple-choice";

//	Exam:

		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "001";
		exam1.title = " De thi so 1";
		exam1.categoryQuestion = category1;
		exam1.duration = "90 min";
		exam1.creatorID = account1;
		exam1.createDate = LocalDate.of(2021, 1, 6);

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "002";
		exam2.title = " De thi so2";
		exam2.categoryQuestion = category2;
		exam2.duration = "90 min";
		exam2.creatorID = account1;
		exam2.createDate = LocalDate.of(2021, 3, 6);

		Exam exam3 = new Exam();
		exam3.id = 2;
		exam3.code = "003";
		exam3.title = " De thi so3";
		exam3.categoryQuestion = category1;
		exam3.duration = "90 min";
		exam3.creatorID = account2;
		exam3.createDate = LocalDate.of(2021, 2, 6);

//		  Question 1: Kiểm tra account thứ 2 Nếu không có phòng ban (tức là department
//		 == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban" Nếu không thì sẽ
//		 in ra text "Phòng ban của nhân viên này là …"

		System.out.println("\n Question 1: ___________________________________________________");

		if (account2.department == null) {
			System.out.println("Nhan vien nay chua co phong ban");
		} else {
			System.out.println("Phong ban cua nhan vien nay la: " + account2.department.departmentName);
		}

		/*
		 * Question 2: Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
		 * "Nhân viên này chưa có group" Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
		 * text "Group của nhân viên này là Java Fresher, C# Fresher" Nếu có mặt trong 3
		 * Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều
		 * group" Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
		 * người hóng chuyện, tham gia tất cả các group"
		 */

		System.out.println("\n Question 2: ___________________________________________________");

		int countGroup = account2.dsNhom.length;

		if (account2.dsNhom == null) {
			System.out.println(" Nhan vien nay chua co group");
		} else if (countGroup == 1 || countGroup == 2) {
			System.out.println("Group cua nhan vien nay laf Java Fresher, C# Fresher");
		} else if (countGroup == 3) {
			System.out.println(" Nhan vien nay la nguoi quan trong, tham gia nhieu group");
		} else {
			System.out.println(" Nhan vien nay la nguoi hong chuyen, thm gia tat ca cac group");
		}

//		  Question 3: Sử dụng toán tử ternary để làm Question 1

		System.out.println("\n Question 3:___________________________________________________");

		System.out.println(account2.department == null ? ("Nhan vien nay chua co phong ban")
				: ("Phong ban cua nhan vien nay la: " + account2.department.departmentName));

//		Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"

		System.out.println("\n Question 4: ___________________________________________________");

		System.out.println(account1.position.positionName == PositionName.DEV ? ("Day la Developer")
				: (" Nguoi nay khng phai la Developer"));

//		Question 5:
//			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"

		System.out.println("\n Question 5: ___________________________________________________");

		int accountNumber = group1.dsNhanVien.length;
		switch (accountNumber) {
		case 0:
			System.out.println("Nhom ko co thanh vien nao");
			break;
		case 1:
			System.out.println("Nhom co 1 thanh vien");
			break;
		case 2:
			System.out.println("Nhom co 2 thanh vien");
			break;
		case 3:
			System.out.println("Nhom co 3 thanh vien");
			break;

		default:
			System.out.println("Nhom co nhieu thanh vien");
		}

//		Question 6: Sử dụng switch case để làm lại Question 2

		System.out.println("\n Question 6: ___________________________________________________");

		int groupNumber = account2.dsNhom.length;

		switch (groupNumber) {
		case 0:
			System.out.println("Nhan vien nay chua co Group");
			break;
		case 1:
			System.out.println("Group cua nhan vien nay laf Java Fresher, C#");
			break;
		case 2:
			System.out.println("Group cua nhan vien nay laf Java Fresher, C#");
			break;
		case 3:
			System.out.println("Nhan vien nay la nguoi quan trong tham gia nhieu Group");
			break;
		case 4:
			System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca ca group");
			break;

		default:
			break;
		}

//		Question 7:	Sử dụng switch case để làm lại Question 4

		System.out.println("\n Question 7: ___________________________________________________");

		PositionName positionName = account1.position.positionName;
		switch (positionName) {
		case DEV:
			System.out.println("Day la Developer");
			break;
		default:
			System.out.println("Nguoi nay khong phai la Developer");
		}

//		Question 8: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ

		System.out.println("\n Question 8: ___________________________________________________");

		Account[] accountList = { account1, account2, account3, account4 };

		for (Account i : accountList) {

			System.out.println(" Email cua Account thu " + i.id + " la " + i.email);
			System.out.println(" FullName cua Account thu " + i.id + " la " + i.fullName);
			System.out.println(" Department cua Account thu " + i.id + " la " + i.department.departmentName);
			System.out.println();
		}

//		Question 9: In ra thông tin các phòng ban bao gồm: id và name

		System.out.println("\n Question 9: ___________________________________________________");

		Department[] dsPhongBan = { department1, department2, department3 };
		for (Department i : dsPhongBan) {
			System.out.println("id: " + i.id);
			System.out.println("Name: " + i.departmentName);
			System.out.println();
		}

//		============================/* For */=====================================

//		 Question 10:
//			 In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			 họ theo định dạng như sau:
//			 Thông tin account thứ 1 là:
//			 Email: NguyenVanA@gmail.com
//			 Full name: Nguyễn Văn A
//			 Phòng ban: Sale
//			 Thông tin account thứ 2 là:
//			 Email: NguyenVanB@gmail.com
//			 Full name: Nguyễn Văn B
//			 Phòng ban: Marketting

		System.out.println("\n Question 10: ___________________________________________________");

		for (int i = 0; i < accountList.length; i++) {
			System.out.println("Thong tin account thu " + accountList[i].id + " la: ");
			System.out.println("Email: " + accountList[i].email);
			System.out.println("Full name: " + accountList[i].fullName);
			System.out.println("Phong ban: " + accountList[i].department.departmentName);
			System.out.println();
		}

//		Question 11:
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing

		System.out.println("\n Question 11: ___________________________________________________");

//		 Department[] dsPhongBan = { department1, department2, department3}; ( dong nay da co san o cau tren)

		for (int i = 0; i < dsPhongBan.length; i++) {
			System.out.println("Thong tin department thu " + dsPhongBan[i].id + " la: ");
			System.out.println("Id: " + dsPhongBan[i].id);
			System.out.println("Name: " + dsPhongBan[i].departmentName);
			System.out.println();

		}

//		Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10

		System.out.println("\n Question 12: ___________________________________________________");
		for (int i = 0; i < dsPhongBan.length; i++) {
			if (i == 2) {
				break;
			}
			System.out.println("Thong tin department thu " + dsPhongBan[i].id + " la: ");
			System.out.println("Id: " + dsPhongBan[i].id);
			System.out.println("Name: " + dsPhongBan[i].departmentName);
			System.out.println();

		}

//		Question 13: In ra thông tin tất cả các account ngoại trừ account thứ 2

		System.out.println("\n Question 13: ___________________________________________________");

		for (int i = 0; i < accountList.length; i++) {
			if (i == 1) {
				continue;

			}
			System.out.println("Thong tin account thu " + accountList[i].id + " la: ");
			System.out.println("Email: " + accountList[i].email);
			System.out.println("Full name: " + accountList[i].fullName);
			System.out.println("Phong ban: " + accountList[i].department.departmentName);
			System.out.println(" Vi Tri: " + accountList[i].position.positionName);
			System.out.println();

//			Question 14:In ra thông tin tất cả các account có id < 4

			System.out.println("\n Question 14: ___________________________________________________");

			for (int i1 = 0; i1 < 3; i1++) {

				System.out.println("Thong tin account thu " + accountList[i1].id + " la: ");
				System.out.println("Email: " + accountList[i1].email);
				System.out.println("Full name: " + accountList[i1].fullName);
				System.out.println("Phong ban: " + accountList[i1].department.departmentName);
				System.out.println("Vi Tri: " + accountList[i1].position.positionName);
				System.out.println();

			}

//			Question 15:
//				In ra các số chẵn nhỏ hơn hoặc bằng 20

			System.out.println("\n Question 15:___________________________________________________");

			for (int i1 = 0; i1 <= 20; i1++) {
				if (i1 % 2 == 0) {
					System.out.println(i1);
				}

			}

//			================================== WHILE & DO - WHILE ======================================================

//			Question 16:
//				Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//				lệnh break, continue

//			Q 16-10:
			System.out.println(" Q16 -10___________________________________________________");
			int j = 0;
			while (j < accountList.length) {
				System.out.println("Thong tin account thu " + accountList[j].id + " la: ");
				System.out.println("Email: " + accountList[j].email);
				System.out.println("Full name: " + accountList[j].fullName);
				System.out.println("Phong ban: " + accountList[j].department.departmentName);
				System.out.println();
				j++;
			}

//			Q 16-11:

			System.out.println(" Q16 -11___________________________________________________");
			int i2 = 0;
			while (i2 < dsPhongBan.length) {
				System.out.println("Thong tin department thu " + dsPhongBan[i2].id + " la: ");
				System.out.println("Id: " + dsPhongBan[i2].id);
				System.out.println("Name: " + dsPhongBan[i2].departmentName);
				System.out.println();
				i2++;

			}

//			Q 16-12:		
			System.out.println(" Q16- 12___________________________________________________");
			int i1 = 0;
			while (i1 < 2) {

				System.out.println("Thong tin department thu " + dsPhongBan[i1].id + " la: ");
				System.out.println("Id: " + dsPhongBan[i1].id);
				System.out.println("Name: " + dsPhongBan[i1].departmentName);
				System.out.println();
				i1++;

			}

//			Q 16-13:	

			System.out.println(" Q16- 13___________________________________________________");
			int k = 0;
			while (k < accountList.length) {
				if (k != 1) {
					System.out.println("Thong tin account thu " + accountList[i].id + " la: ");
					System.out.println("Email: " + accountList[i].email);
					System.out.println("Full name: " + accountList[i].fullName);
					System.out.println("Phong ban: " + accountList[i].department.departmentName);
					System.out.println(" Vi Tri: " + accountList[i].position.positionName);
					System.out.println();
				}

				k++;
			}

//			Q 16-14:	
//			System.out.println(" Q16- 14___________________________________________________");

			int k1 = 0;
			while (k1 < 3) {

				System.out.println("Thong tin account thu " + accountList[k1].id + " la: ");
				System.out.println("Email: " + accountList[k1].email);
				System.out.println("Full name: " + accountList[k1].fullName);
				System.out.println("Phong ban: " + accountList[k1].department.departmentName);
				System.out.println(" Vi Tri: " + accountList[k1].position.positionName);
				System.out.println();
				k1++;
			}

//			Q 16-15:

			System.out.println(" Q16- 15___________________________________________________");

			int a = 0;
			while (a < 21) {
				if (a % 2 == 0) {
					System.out.println(a);
				}
				a++;
			}

//			Q17: Question 17:
//			Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//			lệnh break, continue

//			Q 17 -10:

			System.out.println(" Q17- 10___________________________________________________");

			int i3 = 0;
			do {
				System.out.println("Thong tin account thu " + accountList[i3].id + " la: ");
				System.out.println("Email: " + accountList[i3].email);
				System.out.println("Full name: " + accountList[i3].fullName);
				System.out.println("Phong ban: " + accountList[i3].department.departmentName);
				System.out.println();
				i3++;
			} while (i3 < accountList.length);

//			Q 17 -11:
			System.out.println(" Q17- 11___________________________________________________");
			int i4 = 0;
			do {
				System.out.println("Thong tin department thu " + dsPhongBan[i4].id + " la: ");
				System.out.println("Id: " + dsPhongBan[i4].id);
				System.out.println("Name: " + dsPhongBan[i4].departmentName);
				System.out.println();
				i4++;
			} while (i4 < dsPhongBan.length);

//			Q 17 -12:		
			System.out.println(" Q17- 12___________________________________________________");
			int i5 = 0;
			do {
				System.out.println("Thong tin department thu " + dsPhongBan[i5].id + " la: ");
				System.out.println("Id: " + dsPhongBan[i5].id);
				System.out.println("Name: " + dsPhongBan[i5].departmentName);
				System.out.println();
				i5++;
			} while (i5 < 2);

//			Q 17 -13:		

			System.out.println(" Q17- 13___________________________________________________");
			int i6 = 0;
			do {
				if (i6 != 1) {
					System.out.println("Thong tin account thu " + accountList[i6].id + " la: ");
					System.out.println("Email: " + accountList[i6].email);
					System.out.println("Full name: " + accountList[i6].fullName);
					System.out.println("Phong ban: " + accountList[i6].department.departmentName);
					System.out.println(" Vi Tri: " + accountList[i6].position.positionName);
					System.out.println();
				}
				i6++;

			} while (i6 < accountList.length);

//			Q17-14:
			System.out.println(" Q17- 14___________________________________________________");

			int i7 = 0;
			do {
				System.out.println("Thong tin account thu " + accountList[i7].id + " la: ");
				System.out.println("Email: " + accountList[i7].email);
				System.out.println("Full name: " + accountList[i7].fullName);
				System.out.println("Phong ban: " + accountList[i7].department.departmentName);
				System.out.println("Vi Tri: " + accountList[i7].position.positionName);
				System.out.println();
				i7++;
			} while (i7 < 3);

//			Q17 -15:
			System.out.println(" Q17- 15___________________________________________________");
			int i8 = 0;
			do {
				if (i8 % 2 == 0) {
					System.out.println(i8);
				}

				i8++;
			} while (i8 < 21);

//			Exercise 2 (Optional): System out printf
//			Question 1:
//			Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//			nguyên đó

			System.out.println(" E2 - Q1: __________________________________________________");

			int a1 = 5;
			System.out.printf("%d%n", a1);

//			Question 2:
//				Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//				ra số nguyên đó thành định dạng như sau: 100,000,000

			System.out.println(" E2 - Q2: __________________________________________________");
			int a2 = 100000000;
			System.out.printf(Locale.US, "%,d%n", a2);

//			Question 3:
//				Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//				thực đó chỉ bao gồm 4 số đằng sau

			System.out.println(" E2 - Q3: __________________________________________________");
			float a3 = 5.567098f;
			System.out.printf("%5.4f%n", a3);

//			Question 4:
//				Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//				dạng như sau:
//				Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//				Tên tôi hlà "Nguyễn Văn A" và tôi đang độc thân.

			System.out.println(" E2 - Q4: __________________________________________________");

			String hoTen = "Nguyen Van A";
			System.out.println(" Ten toi la " + hoTen + " va toi dang doc than");

//			Question 5:
//				Lấy thời gian bây giờ và in ra theo định dạng sau:
//				24/04/2020 11h:16p:20s

			System.out.println(" E2 - Q5: __________________________________________________");

			LocalDateTime dateNow = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" dd/MM/YYYY HH:mm:ss");
			String dateFomarted = dtf.format(dateNow);

			System.out.println(dateFomarted);

//		    Question 6:
//		    	In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//		    	table (giống trong Database)

//		    ========================Exercise 3 (Optional): Date Format ==========================

//		    Question 1:
//		    	In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//		    	dạng vietnamese
			System.out.println(" E3 - Q1: __________________________________________________");
			System.out.println(" Old Format: " + exam1.createDate);
			DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern(" dd/MM/YYYY");
			System.out.println(" New Format theo Viet Nam: " + dtf1.format(exam1.createDate));

//			Question 2:
//				In ra thông tin: Exam đã tạo ngày nào theo định dạng
//				Năm – tháng – ngày – giờ – phút – giây			

			System.out.println(" E3 - Q2: __________________________________________________");

			// Getting system timezone
			ZoneId systemTimeZone = ZoneId.systemDefault();
			DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss ");

			Exam[] exams = { exam1, exam2, exam3 };
			for (Exam exam : exams) {
				// converting LocalDateTime to ZonedDateTime with the system timezone
				ZonedDateTime date = exam.createDate.atStartOfDay(systemTimeZone);
				System.out.println(" Exam " + exam.code + ":" + newFormat.format(date));
			}

//			Question 3:
//				Chỉ in ra năm của create date property trong Question 2
			System.out.println(" E3 - Q3: __________________________________________________");

			DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy");
			Exam[] examNew = { exam1, exam2, exam3 };

			for (Exam exam : examNew) {
				System.out.println("Exam " + exam.code + ":" + exam.createDate.format(dtf2));
			}

//			Question 4:
//				Chỉ in ra tháng và năm của create date property trong Question 2
			System.out.println(" E3 - Q4: __________________________________________________");

			DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM , yyyy");
			for (Exam exam : examNew) {
				System.out.println("Exam " + exam.code + ":" + exam.createDate.format(dtf3));
			}

//			Question 5:
//				Chỉ in ra "MM-DD" của create date trong Question 2

			System.out.println(" E3 - Q5: __________________________________________________");

			DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MM-DD");
			for (Exam exam : examNew) {
				System.out.println("Exam " + exam.code + ":" + exam.createDate.format(dtf4));
			}

			// Exercise 4 (Optional): Random Number

//			Question 1:
//				In ngẫu nhiên ra 1 số nguyên
			System.out.println(" E4 - Q1: __________________________________________________");

			Random random = new Random();
			int x = random.nextInt();
			System.out.println(" So nguyen ngau nhien: " + x);

//			Question 2:
//				In ngẫu nhiên ra 1 số thực
			System.out.println(" E4 - Q2: __________________________________________________");
			float x1 = random.nextFloat();
			System.out.println(" So Thuc ngau nhien: " + x1);

//			Question 3:
//				Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
//				ra tên của 1 bạn
			System.out.println(" E4 - Q3: __________________________________________________");

			String[] tenCacBan = { "Linh", "Phuong", "Huyen", "Trang", "Nam", "Tuan Anh" };
			Random random1 = new Random();
			int n = random1.nextInt(tenCacBan.length);
			System.out.println(" Ten ngau nhien 1 ban: " + tenCacBan[n]);

//			Question 4:
//				Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
			System.out.println(" E4 - Q4: __________________________________________________");

			int minDay = (int) (LocalDate.of(1995, 7, 24)).toEpochDay();
			int maxDay = (int) (LocalDate.of(1995, 12, 20)).toEpochDay();
			int randomDay = random.nextInt(maxDay - minDay) + minDay;
			LocalDate randomDate = LocalDate.ofEpochDay(randomDay);

			System.out.println(
					" Mot ngay ngau nhien trong khoang thoi gian '24-07-1995' den '20-12-1995':  " + randomDate);

//			Question 5:
//				Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
			System.out.println(" E4 - Q5: __________________________________________________");

			int now = (int) LocalDate.now().toEpochDay();
			LocalDate lastyear = LocalDate.now().minusYears(1);
			int pastDay = (int) lastyear.toEpochDay();
			int randomday1 = random.nextInt(now - pastDay + 1) + pastDay;
			LocalDate randomDate1 = LocalDate.ofEpochDay(randomday1);

			System.out.println(randomDate1);

//			Question 6:
//				Lấy ngẫu nhiên 1 ngày trong quá khứ

			System.out.println(" E4 - Q6: __________________________________________________");
			int now1 = (int) LocalDate.now().toEpochDay();
			int randomday2 = random.nextInt(now1);
			LocalDate randomDate2 = LocalDate.ofEpochDay(randomday2);
			System.out.println(randomDate2);

//			Question 7:
//				Lấy ngẫu nhiên 1 số có 3 chữ số
			System.out.println(" E4 - Q7: __________________________________________________");
			int soCoBaChuSo = random.nextInt(999 - 100 + 1) + 100;
			System.out.println(" So co 3 chu so ngau nhien la: " + soCoBaChuSo);

//			=============================== Exercise 5: Input from console =================================

//			Question 1:
//				Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
			System.out.println(" E5 - Q1: __________________________________________________");

			Scanner scanner = new Scanner(System.in);
//			System.out.println(" Moi ban nhap vao so thu nhat: ");
//			int j1 = scanner.nextInt();
//			System.out.println(" Moi ban nhap vao so thu hai: ");
//			int j2 = scanner.nextInt();
//			System.out.println(" Moi ban nhap vao so thu ba: ");
//			int j3 = scanner.nextInt();
//			System.out.println(" Ban vua nhap vao cac so: " + j1  + ", " + j2 + ", " + j3);

			// Question 2:
			// Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
//			System.out.println(" E5 - Q2: __________________________________________________");
//			System.out.println(" Moi ban nhap vao so thu nhat: ");
//			float b1 = scanner.nextFloat();
//			System.out.println(" Moi ban nhap vao so thu hai: ");
//			float b2 = scanner.nextFloat();

			// Question 3:
			// Viết lệnh cho phép người dùng nhập họ và tên
//			System.out.println(" E5 - Q3: __________________________________________________");
//			System.out.println(" Moi ban nhap vao ho va ten: ");
//			String hoTen1 = scanner.nextLine();
//			System.out.println(" Ho Ten vua nhap la: " + hoTen1);

			// Question 4:
			// Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ

//			System.out.println(" E5 - Q4: __________________________________________________");
//			System.out.println(" Moi ban nhap vao ngay sinh: ");
//			int day = scanner.nextInt();
//			System.out.println(" Moi ban nhap vao thang sinh:");
//			int month = scanner.nextInt();
//			System.out.println(" Moi ban nhap vao nam sinh:");
//			int year = scanner.nextInt();
//			
//			System.out.println(" Ngay sinh nhat cua ban la: " + LocalDate.of(year, month, day));

//			Question 5:
//				Viết lệnh cho phép người dùng tạo account (viết thành method)
//				Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//				chương trình sẽ chuyển thành Position.Dev, Position.Test,
//				Position.ScrumMaster, Position.PM
			System.out.println(" E5 - Q5: __________________________________________________");

//			createAccount();

			System.out.println(" E5 - Q6: __________________________________________________");
//			CreateDepartment();
			System.out.println(" E5 - Q7: __________________________________________________");
//			Question7();

			System.out.println(" E5 - Q8: __________________________________________________");

//			Question8();

			System.out.println(" E5 - Q9: __________________________________________________");
//			Question9();

//			Question10();

//			Ex6 - Q1:
			System.out.println(" E6 - Q1: __________________________________________________");
			System.out.println(" Cac so chan nguyen duong nho hon 10");
			evenNumber();
		}
		
//		E6- Q2:
		System.out.println(" E6 - Q2: __________________________________________________");
		inforAccount();
		
		// E6 - Q3:
		System.out.println(" E6 - Q3: __________________________________________________");
		System.out.println(" Cac so nguyen duong < 10 la: ");
		intLessThan10();

	}

	// Question 5:
	// Viết lệnh cho phép người dùng tạo account (viết thành method)
	// Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
	// chương trình sẽ chuyển thành Position.Dev, Position.Test,
	// Position.ScrumMaster, Position.PM

	public static void createAccount() {
		Account acc = new Account();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap id: ");
		acc.id = scanner.nextInt();
		scanner.nextLine();
		System.out.println(" Nhap Email: ");
		acc.email = scanner.nextLine();
		System.out.println(" Nhap userName: ");
		acc.userName = scanner.nextLine();
		System.out.println(" Nhap Full Name: ");
		acc.fullName = scanner.nextLine();
		System.out.println(" Nhap Department: ");
		Department dep = new Department();
		dep.departmentName = scanner.nextLine();
		acc.department = dep;

		System.out.println(" Nhap Position( 1: DEV; 2: TEST; 3: SCRUM_MASTER; 4: PM):  ");
		int positionIndex = scanner.nextInt();
		switch (positionIndex) {
		case 1:
			Position pos1 = new Position();
			pos1.positionName = PositionName.DEV;
			acc.position = pos1;
			break;
		case 2:
			Position pos2 = new Position();
			pos2.positionName = PositionName.TEST;
			acc.position = pos2;
			break;
		case 3:
			Position pos3 = new Position();
			pos3.positionName = PositionName.SCRUM_MASTER;
			acc.position = pos3;
			break;
		case 4:
			Position pos4 = new Position();
			pos4.positionName = PositionName.PM;
			acc.position = pos4;
			break;
		default:
			System.out.println(" Moi ban nhap cac so tu 1 den 4");
			break;
		}

		System.out.println(" Thong tin account ban vua nhap la:");
		System.out.println(" id: " + acc.id + ",   Email: " + acc.email + ",   UserName: " + acc.userName
				+ ",    fullName: " + acc.fullName + ",    DepartmentName: " + acc.department.departmentName
				+ ",    Position: " + acc.position.positionName);

	}

	// Question 6: Viết lệnh cho phép người dùng tạo department (viết thành method)

	public static void CreateDepartment() {
		Scanner input = new Scanner(System.in);
		Department department = new Department();
		System.out.println(" Moi ban nhap id: ");
		department.id = input.nextInt();
		input.nextLine();
		System.out.println(" Moi ban nhap DepartmentName: ");
		department.departmentName = input.nextLine();
		System.out.println(" Department vua tao co thong tin nhu sau: " + "id: " + department.id
				+ ",    Ten Phong Ban: " + department.departmentName);

	}
//		 Question 7: Nhập số chẵn từ console

	public static void Question7() {
		System.out.println(" Moi ban nhap vao 1 so chan: ");
		Scanner sc = new Scanner(System.in);
		int evenNum = sc.nextInt();
		while (evenNum % 2 != 0) {
			System.out.println(" Moi ban nhap vao 1 so chan!!!! ");
			evenNum = sc.nextInt();
		}
		System.out.println(" So ban vua nhap la: " + evenNum);

	}

	// Question 8:
	// Viết chương trình thực hiện theo flow sau:
	// Bước 1:
	// Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
	// dụng"
	// Bước 2:
	// Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
	// Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
	// department
	// Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
	// lại" và quay trở lại bước 1

	public static void Question8() {
		System.out.println(" Moi ban nhap vao chuc nang muon su dung: ");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1. Tao Account ");
		System.out.println("2. Tao Department ");

		int nhapSo;
		do {
			nhapSo = sc1.nextInt();
			switch (nhapSo) {
			case 1:
				createAccount();
				break;
			case 2:
				CreateDepartment();
				break;

			default:
				System.out.println(" Moi ban nhap lai( chi duoc nhap 1 hoac 2)");
			}
		} while (nhapSo != 1 && nhapSo != 2);
	}

	// Question 9:
	// Viết method cho phép người dùng thêm group vào account theo flow sau:
	// Bước 1:
	// In ra tên các usernames của user cho người dùng xem
	// Bước 2:
	// Yêu cầu người dùng nhập vào username của account
	// Bước 3:
	// In ra tên các group cho người dùng xem
	// Bước 4:
	// Yêu cầu người dùng nhập vào tên của group
	// Bước 5:
	// Dựa vào username và tên của group người dùng vừa chọn, hãy
	// thêm account vào group đó .

	public static void Question9() {
		// Tao Account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "daoloan6196@gmail.com";
		account1.fullName = "Dao Thi Thanh Loan";
		account1.userName = "LoanDao";

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "phuonglinh.vu@gmail.com";
		account2.fullName = "Vu Phuong Linh";
		account2.userName = "LinhVu";

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "nguyenbaoquyen@gmail.com";
		account3.fullName = "Nguyen Bao Quyen";
		account3.userName = "Quyen Nguyen";

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "trang.nguyen@gmail.com";
		account4.fullName = "Nguyen Quynh Trang";
		account4.userName = "Trang Nguyen";

//		Tao Group
		Group group1 = new Group();
		group1.id = 1;
		group1.groupName = "Group 1";

		Group group2 = new Group();
		group2.id = 2;
		group2.groupName = "Group 2";

		Group group3 = new Group();
		group3.id = 3;
		group3.groupName = "Group 3";

		// Buoc 1: In ra tên các usernames của user cho người dùng xem
		Account[] accarray = { account1, account2, account3, account4 };
		System.out.println("Ten cac user Name cua user: ");
		for (Account account : accarray) {
			System.out.println(account.userName);

		}
		// Buoc 2: Nhap vao userName cua Account:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao userName cua Account: ");
		String userName = scanner.nextLine();

		// Buoc 3: In ra tên các group cho người dùng xem

		Group[] groups = { group1, group2, group3 };
		System.out.println(" Ten cua cac Group: ");
		for (Group group : groups) {
			System.out.println(group.groupName);
		}

		// Bước 4: Yêu cầu người dùng nhập vào tên của group

		System.out.println(" Nhap vao ten Group: ");
		String groupName = scanner.nextLine();

		// Buoc 5: Dựa vào username và tên của group người dùng vừa chọn, hãy
		// thêm account vào group đó .

		// B 5.1. Kiem tra xem userName cua Account va Ten group nhap vao co tren he
		// thong hay khong?

		int indexGroup = -1;
		for (int i = 0; i < groups.length; i++) {
			if (groups[i].groupName.equals(groupName)) {
				indexGroup = i;
			}
		}

		int indexAccount = -1;
		for (int j = 0; j < accarray.length; j++) {
			if (accarray[j].userName.equals(userName)) {
				indexAccount = j;
			}
		}
		// B5.2: Them account vao group do:

		if (indexGroup < 0 || indexAccount < 0) {
			System.out.println(" Kiem tra lai thong tin vua nhap, khong co Account hoac Group tren he thong");
		} else {
			Group[] grAdd = { groups[indexGroup] };
			accarray[indexAccount].dsNhom = grAdd;
			System.out.println("Ban vua add group " + groups[indexGroup].groupName + " cho Account: "
					+ accarray[indexAccount].userName);

		}
		scanner.nextLine();
	}

//	Question 10: Tiếp tục Question 8 và Question 9
//	Bổ sung thêm vào bước 2 của Question 8 như sau:
//	Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//	account
//	Bổ sung thêm Bước 3 của Question 8 như sau:
//	Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//	text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
//	không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
//	dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
//	kết thúc chương trình)

	public static void Question10() {
		System.out.println(" Moi ban nhap vao chuc nang muon su dung: ");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1. Tao Account ");
		System.out.println("2. Tao Department ");
		System.out.println("3. Them Group vao Account");

		int nhapSo;
		nhapSo = sc1.nextInt();
		if (nhapSo == 1 || nhapSo == 2 || nhapSo == 3) {
			switch (nhapSo) {
			case 1:
				createAccount();
				break;
			case 2:
				CreateDepartment();
				break;
			case 3:
				Question9();
				break;
			default:
				System.out.println(" Moi ban nhap lai( chi duoc nhap 1 hoac 2 hoac 3)");
			}

			System.out.println(" Ban co muon thuc hien chuc nang khac khong? \n 1.Yes \n 2. No");
			int cnKhac = sc1.nextInt();
			if (cnKhac == 2) {
				System.out.println(" Cam on ban da su dung dich vu! Rat chao ban");
				sc1.nextLine();

			}
		} else {
			System.out.println(" Nhap lai: ");
		}
	}
// Question 11

//	Exercise 6 (Optional): Method
//	Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10

	public static void evenNumber() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// Q2: Tạo method để in thông tin các account

	public static void inforAccount() {

		// Tao Account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "daoloan6196@gmail.com";
		account1.fullName = "Dao Thi Thanh Loan";
		account1.userName = "LoanDao";

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "phuonglinh.vu@gmail.com";
		account2.fullName = "Vu Phuong Linh";
		account2.userName = "LinhVu";

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "nguyenbaoquyen@gmail.com";
		account3.fullName = "Nguyen Bao Quyen";
		account3.userName = "Quyen Nguyen";

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "trang.nguyen@gmail.com";
		account4.fullName = "Nguyen Quynh Trang";
		account4.userName = "Trang Nguyen";

		Account[] accounts = { account1, account2, account3, account4 };
		for (Account account : accounts) {
			System.out.println(" Thong tin Account thu " + account.id + " la: ");
			System.out.println("Id: " + account.id + ",   Email: " + account.email + ",   Full Name: " + account.fullName
					+ ",   user Name: " + account.userName);
		}

	}
	
//	Question 3:
//		Tạo method để in ra các số nguyên dương nhỏ hơn 10
	
	public static void intLessThan10() {
		for( int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
