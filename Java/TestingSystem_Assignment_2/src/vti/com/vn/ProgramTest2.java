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

//		  Question 1: Ki???m tra account th??? 2 N???u kh??ng c?? ph??ng ban (t???c l?? department
//		 == null) th?? s??? in ra text "Nh??n vi??n n??y ch??a c?? ph??ng ban" N???u kh??ng th?? s???
//		 in ra text "Ph??ng ban c???a nh??n vi??n n??y l?? ???"

		System.out.println("\n Question 1: ___________________________________________________");

		if (account2.department == null) {
			System.out.println("Nhan vien nay chua co phong ban");
		} else {
			System.out.println("Phong ban cua nhan vien nay la: " + account2.department.departmentName);
		}

		/*
		 * Question 2: Ki???m tra account th??? 2 N???u kh??ng c?? group th?? s??? in ra text
		 * "Nh??n vi??n n??y ch??a c?? group" N???u c?? m???t trong 1 ho???c 2 group th?? s??? in ra
		 * text "Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher" N???u c?? m???t trong 3
		 * Group th?? s??? in ra text "Nh??n vi??n n??y l?? ng?????i quan tr???ng, tham gia nhi???u
		 * group" N???u c?? m???t trong 4 group tr??? l??n th?? s??? in ra text "Nh??n vi??n n??y l??
		 * ng?????i h??ng chuy???n, tham gia t???t c??? c??c group"
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

//		  Question 3: S??? d???ng to??n t??? ternary ????? l??m Question 1

		System.out.println("\n Question 3:___________________________________________________");

		System.out.println(account2.department == null ? ("Nhan vien nay chua co phong ban")
				: ("Phong ban cua nhan vien nay la: " + account2.department.departmentName));

//		Question 4:
//			S??? d???ng to??n t??? ternary ????? l??m y??u c???u sau:
//			Ki???m tra Position c???a account th??? 1
//			N???u Position = Dev th?? in ra text "????y l?? Developer"
//			N???u kh??ng ph???i th?? in ra text "Ng?????i n??y kh??ng ph???i l?? Developer"

		System.out.println("\n Question 4: ___________________________________________________");

		System.out.println(account1.position.positionName == PositionName.DEV ? ("Day la Developer")
				: (" Nguoi nay khng phai la Developer"));

//		Question 5:
//			L???y ra s??? l?????ng account trong nh??m th??? 1 v?? in ra theo format sau:
//			N???u s??? l?????ng account = 1 th?? in ra "Nh??m c?? m???t th??nh vi??n"
//			N???u s??? l?????ng account = 2 th?? in ra "Nh??m c?? hai th??nh vi??n"
//			N???u s??? l?????ng account = 3 th?? in ra "Nh??m c?? ba th??nh vi??n"
//			C??n l???i in ra "Nh??m c?? nhi???u th??nh vi??n"

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

//		Question 6: S??? d???ng switch case ????? l??m l???i Question 2

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

//		Question 7:	S??? d???ng switch case ????? l??m l???i Question 4

		System.out.println("\n Question 7: ___________________________________________________");

		PositionName positionName = account1.position.positionName;
		switch (positionName) {
		case DEV:
			System.out.println("Day la Developer");
			break;
		default:
			System.out.println("Nguoi nay khong phai la Developer");
		}

//		Question 8: In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a h???

		System.out.println("\n Question 8: ___________________________________________________");

		Account[] accountList = { account1, account2, account3, account4 };

		for (Account i : accountList) {

			System.out.println(" Email cua Account thu " + i.id + " la " + i.email);
			System.out.println(" FullName cua Account thu " + i.id + " la " + i.fullName);
			System.out.println(" Department cua Account thu " + i.id + " la " + i.department.departmentName);
			System.out.println();
		}

//		Question 9: In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name

		System.out.println("\n Question 9: ___________________________________________________");

		Department[] dsPhongBan = { department1, department2, department3 };
		for (Department i : dsPhongBan) {
			System.out.println("id: " + i.id);
			System.out.println("Name: " + i.departmentName);
			System.out.println();
		}

//		============================/* For */=====================================

//		 Question 10:
//			 In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a
//			 h??? theo ?????nh d???ng nh?? sau:
//			 Th??ng tin account th??? 1 l??:
//			 Email: NguyenVanA@gmail.com
//			 Full name: Nguy???n V??n A
//			 Ph??ng ban: Sale
//			 Th??ng tin account th??? 2 l??:
//			 Email: NguyenVanB@gmail.com
//			 Full name: Nguy???n V??n B
//			 Ph??ng ban: Marketting

		System.out.println("\n Question 10: ___________________________________________________");

		for (int i = 0; i < accountList.length; i++) {
			System.out.println("Thong tin account thu " + accountList[i].id + " la: ");
			System.out.println("Email: " + accountList[i].email);
			System.out.println("Full name: " + accountList[i].fullName);
			System.out.println("Phong ban: " + accountList[i].department.departmentName);
			System.out.println();
		}

//		Question 11:
//			In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name theo ?????nh d???ng sau:
//			Th??ng tin department th??? 1 l??:
//			Id: 1
//			Name: Sale
//			Th??ng tin department th??? 2 l??:
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

//		Question 12: Ch??? in ra th??ng tin 2 department ?????u ti??n theo ?????nh d???ng nh?? Question 10

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

//		Question 13: In ra th??ng tin t???t c??? c??c account ngo???i tr??? account th??? 2

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

//			Question 14:In ra th??ng tin t???t c??? c??c account c?? id < 4

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
//				In ra c??c s??? ch???n nh??? h??n ho???c b???ng 20

			System.out.println("\n Question 15:___________________________________________________");

			for (int i1 = 0; i1 <= 20; i1++) {
				if (i1 % 2 == 0) {
					System.out.println(i1);
				}

			}

//			================================== WHILE & DO - WHILE ======================================================

//			Question 16:
//				L??m l???i c??c Question ??? ph???n FOR b???ng c??ch s??? d???ng WHILE k???t h???p v???i
//				l???nh break, continue

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
//			L??m l???i c??c Question ??? ph???n FOR b???ng c??ch s??? d???ng DO-WHILE k???t h???p v???i
//			l???nh break, continue

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
//			Khai b??o 1 s??? nguy??n = 5 v?? s??? d???ng l???nh System out printf ????? in ra s???
//			nguy??n ????

			System.out.println(" E2 - Q1: __________________________________________________");

			int a1 = 5;
			System.out.printf("%d%n", a1);

//			Question 2:
//				Khai b??o 1 s??? nguy??n = 100 000 000 v?? s??? d???ng l???nh System out printf ????? in
//				ra s??? nguy??n ???? th??nh ?????nh d???ng nh?? sau: 100,000,000

			System.out.println(" E2 - Q2: __________________________________________________");
			int a2 = 100000000;
			System.out.printf(Locale.US, "%,d%n", a2);

//			Question 3:
//				Khai b??o 1 s??? th???c = 5,567098 v?? s??? d???ng l???nh System out printf ????? in ra s???
//				th???c ???? ch??? bao g???m 4 s??? ?????ng sau

			System.out.println(" E2 - Q3: __________________________________________________");
			float a3 = 5.567098f;
			System.out.printf("%5.4f%n", a3);

//			Question 4:
//				Khai b??o H??? v?? t??n c???a 1 h???c sinh v?? in ra h??? v?? t??n h???c sinh ???? theo ?????nh
//				d???ng nh?? sau:
//				H??? v?? t??n: "Nguy???n V??n A" th?? s??? in ra tr??n console nh?? sau:
//				T??n t??i hl?? "Nguy???n V??n A" v?? t??i ??ang ?????c th??n.

			System.out.println(" E2 - Q4: __________________________________________________");

			String hoTen = "Nguyen Van A";
			System.out.println(" Ten toi la " + hoTen + " va toi dang doc than");

//			Question 5:
//				L???y th???i gian b??y gi??? v?? in ra theo ?????nh d???ng sau:
//				24/04/2020 11h:16p:20s

			System.out.println(" E2 - Q5: __________________________________________________");

			LocalDateTime dateNow = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" dd/MM/YYYY HH:mm:ss");
			String dateFomarted = dtf.format(dateNow);

			System.out.println(dateFomarted);

//		    Question 6:
//		    	In ra th??ng tin account (nh?? Question 8 ph???n FOREACH) theo ?????nh d???ng
//		    	table (gi???ng trong Database)

//		    ========================Exercise 3 (Optional): Date Format ==========================

//		    Question 1:
//		    	In ra th??ng tin Exam th??? 1 v?? property create date s??? ???????c format theo ?????nh
//		    	d???ng vietnamese
			System.out.println(" E3 - Q1: __________________________________________________");
			System.out.println(" Old Format: " + exam1.createDate);
			DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern(" dd/MM/YYYY");
			System.out.println(" New Format theo Viet Nam: " + dtf1.format(exam1.createDate));

//			Question 2:
//				In ra th??ng tin: Exam ???? t???o ng??y n??o theo ?????nh d???ng
//				N??m ??? th??ng ??? ng??y ??? gi??? ??? ph??t ??? gi??y			

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
//				Ch??? in ra n??m c???a create date property trong Question 2
			System.out.println(" E3 - Q3: __________________________________________________");

			DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy");
			Exam[] examNew = { exam1, exam2, exam3 };

			for (Exam exam : examNew) {
				System.out.println("Exam " + exam.code + ":" + exam.createDate.format(dtf2));
			}

//			Question 4:
//				Ch??? in ra th??ng v?? n??m c???a create date property trong Question 2
			System.out.println(" E3 - Q4: __________________________________________________");

			DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM , yyyy");
			for (Exam exam : examNew) {
				System.out.println("Exam " + exam.code + ":" + exam.createDate.format(dtf3));
			}

//			Question 5:
//				Ch??? in ra "MM-DD" c???a create date trong Question 2

			System.out.println(" E3 - Q5: __________________________________________________");

			DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MM-DD");
			for (Exam exam : examNew) {
				System.out.println("Exam " + exam.code + ":" + exam.createDate.format(dtf4));
			}

			// Exercise 4 (Optional): Random Number

//			Question 1:
//				In ng???u nhi??n ra 1 s??? nguy??n
			System.out.println(" E4 - Q1: __________________________________________________");

			Random random = new Random();
			int x = random.nextInt();
			System.out.println(" So nguyen ngau nhien: " + x);

//			Question 2:
//				In ng???u nhi??n ra 1 s??? th???c
			System.out.println(" E4 - Q2: __________________________________________________");
			float x1 = random.nextFloat();
			System.out.println(" So Thuc ngau nhien: " + x1);

//			Question 3:
//				Khai b??o 1 array bao g???m c??c t??n c???a c??c b???n trong l???p, sau ???? in ng???u nhi??n
//				ra t??n c???a 1 b???n
			System.out.println(" E4 - Q3: __________________________________________________");

			String[] tenCacBan = { "Linh", "Phuong", "Huyen", "Trang", "Nam", "Tuan Anh" };
			Random random1 = new Random();
			int n = random1.nextInt(tenCacBan.length);
			System.out.println(" Ten ngau nhien 1 ban: " + tenCacBan[n]);

//			Question 4:
//				L???y ng???u nhi??n 1 ng??y trong kho???ng th???i gian 24-07-1995 t???i ng??y 20-12-1995
			System.out.println(" E4 - Q4: __________________________________________________");

			int minDay = (int) (LocalDate.of(1995, 7, 24)).toEpochDay();
			int maxDay = (int) (LocalDate.of(1995, 12, 20)).toEpochDay();
			int randomDay = random.nextInt(maxDay - minDay) + minDay;
			LocalDate randomDate = LocalDate.ofEpochDay(randomDay);

			System.out.println(
					" Mot ngay ngau nhien trong khoang thoi gian '24-07-1995' den '20-12-1995':  " + randomDate);

//			Question 5:
//				L???y ng???u nhi??n 1 ng??y trong kho???ng th???i gian 1 n??m tr??? l???i ????y
			System.out.println(" E4 - Q5: __________________________________________________");

			int now = (int) LocalDate.now().toEpochDay();
			LocalDate lastyear = LocalDate.now().minusYears(1);
			int pastDay = (int) lastyear.toEpochDay();
			int randomday1 = random.nextInt(now - pastDay + 1) + pastDay;
			LocalDate randomDate1 = LocalDate.ofEpochDay(randomday1);

			System.out.println(randomDate1);

//			Question 6:
//				L???y ng???u nhi??n 1 ng??y trong qu?? kh???

			System.out.println(" E4 - Q6: __________________________________________________");
			int now1 = (int) LocalDate.now().toEpochDay();
			int randomday2 = random.nextInt(now1);
			LocalDate randomDate2 = LocalDate.ofEpochDay(randomday2);
			System.out.println(randomDate2);

//			Question 7:
//				L???y ng???u nhi??n 1 s??? c?? 3 ch??? s???
			System.out.println(" E4 - Q7: __________________________________________________");
			int soCoBaChuSo = random.nextInt(999 - 100 + 1) + 100;
			System.out.println(" So co 3 chu so ngau nhien la: " + soCoBaChuSo);

//			=============================== Exercise 5: Input from console =================================

//			Question 1:
//				Vi???t l???nh cho ph??p ng?????i d??ng nh???p 3 s??? nguy??n v??o ch????ng tr??nh
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
			// Vi???t l???nh cho ph??p ng?????i d??ng nh???p 2 s??? th???c v??o ch????ng tr??nh
//			System.out.println(" E5 - Q2: __________________________________________________");
//			System.out.println(" Moi ban nhap vao so thu nhat: ");
//			float b1 = scanner.nextFloat();
//			System.out.println(" Moi ban nhap vao so thu hai: ");
//			float b2 = scanner.nextFloat();

			// Question 3:
			// Vi???t l???nh cho ph??p ng?????i d??ng nh???p h??? v?? t??n
//			System.out.println(" E5 - Q3: __________________________________________________");
//			System.out.println(" Moi ban nhap vao ho va ten: ");
//			String hoTen1 = scanner.nextLine();
//			System.out.println(" Ho Ten vua nhap la: " + hoTen1);

			// Question 4:
			// Vi???t l???nh cho ph??p ng?????i d??ng nh???p v??o ng??y sinh nh???t c???a h???

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
//				Vi???t l???nh cho ph??p ng?????i d??ng t???o account (vi???t th??nh method)
//				?????i v???i property Position, Ng?????i d??ng nh???p v??o 1 2 3 4 5 v?? v??o
//				ch????ng tr??nh s??? chuy???n th??nh Position.Dev, Position.Test,
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
	// Vi???t l???nh cho ph??p ng?????i d??ng t???o account (vi???t th??nh method)
	// ?????i v???i property Position, Ng?????i d??ng nh???p v??o 1 2 3 4 5 v?? v??o
	// ch????ng tr??nh s??? chuy???n th??nh Position.Dev, Position.Test,
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

	// Question 6: Vi???t l???nh cho ph??p ng?????i d??ng t???o department (vi???t th??nh method)

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
//		 Question 7: Nh???p s??? ch???n t??? console

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
	// Vi???t ch????ng tr??nh th???c hi???n theo flow sau:
	// B?????c 1:
	// Ch????ng tr??nh in ra text "m???i b???n nh???p v??o ch???c n??ng mu???n s???
	// d???ng"
	// B?????c 2:
	// N???u ng?????i d??ng nh???p v??o 1 th?? s??? th???c hi???n t???o account
	// N???u ng?????i d??ng nh???p v??o 2 th?? s??? th???c hi???n ch???c n??ng t???o
	// department
	// N???u ng?????i d??ng nh???p v??o s??? kh??c th?? in ra text "M???i b???n nh???p
	// l???i" v?? quay tr??? l???i b?????c 1

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
	// Vi???t method cho ph??p ng?????i d??ng th??m group v??o account theo flow sau:
	// B?????c 1:
	// In ra t??n c??c usernames c???a user cho ng?????i d??ng xem
	// B?????c 2:
	// Y??u c???u ng?????i d??ng nh???p v??o username c???a account
	// B?????c 3:
	// In ra t??n c??c group cho ng?????i d??ng xem
	// B?????c 4:
	// Y??u c???u ng?????i d??ng nh???p v??o t??n c???a group
	// B?????c 5:
	// D???a v??o username v?? t??n c???a group ng?????i d??ng v???a ch???n, h??y
	// th??m account v??o group ???? .

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

		// Buoc 1: In ra t??n c??c usernames c???a user cho ng?????i d??ng xem
		Account[] accarray = { account1, account2, account3, account4 };
		System.out.println("Ten cac user Name cua user: ");
		for (Account account : accarray) {
			System.out.println(account.userName);

		}
		// Buoc 2: Nhap vao userName cua Account:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao userName cua Account: ");
		String userName = scanner.nextLine();

		// Buoc 3: In ra t??n c??c group cho ng?????i d??ng xem

		Group[] groups = { group1, group2, group3 };
		System.out.println(" Ten cua cac Group: ");
		for (Group group : groups) {
			System.out.println(group.groupName);
		}

		// B?????c 4: Y??u c???u ng?????i d??ng nh???p v??o t??n c???a group

		System.out.println(" Nhap vao ten Group: ");
		String groupName = scanner.nextLine();

		// Buoc 5: D???a v??o username v?? t??n c???a group ng?????i d??ng v???a ch???n, h??y
		// th??m account v??o group ???? .

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

//	Question 10: Ti???p t???c Question 8 v?? Question 9
//	B??? sung th??m v??o b?????c 2 c???a Question 8 nh?? sau:
//	N???u ng?????i d??ng nh???p v??o 3 th?? s??? th???c hi???n ch???c n??ng th??m group v??o
//	account
//	B??? sung th??m B?????c 3 c???a Question 8 nh?? sau:
//	Sau khi ng?????i d??ng th???c hi???n xong ch???c n??ng ??? b?????c 2 th?? in ra d??ng
//	text ????? h???i ng?????i d??ng "B???n c?? mu???n th???c hi???n ch???c n??ng kh??c
//	kh??ng?". N???u ng?????i d??ng ch???n "C??" th?? quay l???i b?????c 1, n???u ng?????i
//	d??ng ch???n "Kh??ng" th?? k???t th??c ch????ng tr??nh (s??? d???ng l???nh return ?????
//	k???t th??c ch????ng tr??nh)

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
//	Question 1: T???o method ????? in ra c??c s??? ch???n nguy??n d????ng nh??? h??n 10

	public static void evenNumber() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// Q2: T???o method ????? in th??ng tin c??c account

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
//		T???o method ????? in ra c??c s??? nguy??n d????ng nh??? h??n 10
	
	public static void intLessThan10() {
		for( int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
