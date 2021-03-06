package TestingSystem8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import TestingSystem8.Exercise1_2_3.NameComparator;
import TestingSystem8.Exercise1_2_3.Student;
import TestingSystem8.Exercise1_2_3.StudentEx2;
import TestingSystem8.Exercise1_2_3.TenDiemNgaySinh_Comparator;

public class Program {
	static List<Student> listStudent = new ArrayList<Student>();
	

	public static void main(String[] args) {

//		// Question1:
//		listStudent.add(new Student("Loan"));
//		listStudent.add(new Student("Loan"));
//		listStudent.add(new Student("Loan"));
//		listStudent.add(new Student("Anh"));
//		listStudent.add(new Student("Linh"));
//
//	
//		//a
//		System.out.println(" cau a: ");
//		System.out.println(listStudent.size());
//		//b
//		System.out.println(" cau b: ");
//		System.out.println(listStudent.get(3));
//		//c
//		System.out.println(" cau c: ");
//		System.out.println(listStudent.get(0));
//		System.out.println(listStudent.get(listStudent.size() -1));
//		//d
//		System.out.println(" cau d ");
//		Student sThem = new Student("A");
//		listStudent.add(0, sThem);
//		System.out.println(listStudent.get(0));
//		
//		// e
//		System.out.println(" cau e ");
//		Student sThem2 = new Student("B");
//		listStudent.add(listStudent.size(), sThem2);
//		System.out.println(listStudent.get(listStudent.size() -1));
//		
//		//f: Dao nguoc 
//		System.out.println(" cau f ");
//		System.out.println(" Mang ban dau: ");
//		for (Student student : listStudent) {
//			System.out.println(student);
//		}
//		System.out.println(" Mang dao nguoc");
//		Collections.reverse(listStudent);
//		for (Student student : listStudent) {
//			System.out.println(student);
//		}
//		
//		//g: 
////		System.out.println(" cau g: ");
////		timKiemStudent();
////		
//		// h:
////		System.out.println(" cau h: ");
////		timkiemTheoTen();
//		
//		//i:
//		System.out.println(" cau i: ");
//		inSinhVienTrungTen();
//		
//		//j: xoa name cua student co id = 2:
//		
//		for (Student student : listStudent) {
//			if ( student.id == 2) {
//				student.name = null;
//			}
//		}
//		
//		for (Student student : listStudent) {
//			System.out.println(student);
//		}
//		
//		//k: Delete student co id = 5:
//		Student stDelete = new Student();
//		for (Student student : listStudent) {
//			if ( student.id == 5) {
//				stDelete = student;
//			}
//		}
//		
//		listStudent.remove(stDelete);
//		for (Student student : listStudent) {
//			System.out.println(student);
//		}
//		
//		//l:
//		List<Student> studentCoppies = new ArrayList<Student>();
//		studentCoppies.addAll(listStudent);

		// Question2: Stack & Queue
//		Khai b??o 1 danh s??ch l??u c??c t??n h???c sinh t???i tham d??? ph???ng v???n, th???
//		t??? t???i c???a c??c h???c sinh nh?? sau:
//		Nguy???n V??n Nam, Nguy???n V??n Huy??n, Tr???n V??n Nam,
//		Nguy???n V??n A

//		a) T???o 1 method ????? in ra th??? t??? t???i c???a c??c h???c sinh theo th??? t??? t???
//		mu???n nh???t t???i s???m nh???t (g???i ?? d??ng Stack)

		Stack<Student> students = new Stack<>();
		students.push(new Student(" Nguyen Van Nam "));
		students.push(new Student(" Nguyen Van Huyen "));
		students.push(new Student(" Tran Van Nam "));
		students.push(new Student(" Nguyen Van A "));

		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());

//				b) T???o 1 method ????? in ra th??? t??? t???i c???a c??c h???c sinh theo th??? t???
//				s???m nh???t t???i mu???n nh???t (g???i ?? d??ng Queue)
		Queue<Student> students2 = new LinkedList<>();
		students2.add(new Student(" Nguyen Van Nam"));
		students2.add(new Student(" Nguyen Van Huyen"));
		students2.add(new Student(" Tran Van Nam"));
		students2.add(new Student(" Nguyen Van A"));

		System.out.println(students2.poll());
		System.out.println(students2.poll());
		System.out.println(students2.poll());
		System.out.println(students2.poll());

//				Question 3 (Optional): Set
//				T???o 1 student c?? property id, name
//				Khai b??o 1 Set students, sau ???? l??m c??c ch???c n??ng t????ng t??? List
		System.out.println(" Question3 ________________________________\n");
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student("Loan"));
		studentSet.add(new Student("Linh"));
		studentSet.add(new Student("Phuong"));
		studentSet.add(new Student("Quyen"));
		studentSet.add(new Student("Giang"));
		studentSet.add(new Student("Mai"));

		// a: In ra t???ng s??? ph???n t??? c???a students
		System.out.println(" Tong so phan tu cuar Student la: " + studentSet.size());
		// L???y ph???n t??? th??? 4 c???a students
		System.out.println(" Phan tu thu 4 cua Student la: ");
		Iterator<Student> studentIterrator = studentSet.iterator();
		for (int i = 0; i < 2; i++) {
			studentIterrator.next();
		}
		System.out.println(studentIterrator.next());

		// c: In ra ph???n t??? ?????u v?? ph???n t??? cu???i c???a students
		Iterator<Student> iteratorSet4 = studentSet.iterator();
		System.out.println(" Phan tu dau cuar Student la: " + iteratorSet4.next());
		System.out.println(" Phan tu cuoi cua Student la: ");
		for (int i = 0; i < studentSet.size() - 2; i++) {
			iteratorSet4.next();
		}
		System.out.println(iteratorSet4.next());

		// g) T???o 1 method t??m ki???m student theo id:

//		System.out.println(" Nhap vao id can tim kiem");
//		Scanner sc = new Scanner(System.in);
//		int id = sc.nextInt();
//		Iterator<Student> a = studentSet.iterator();
//		for (int i = 0; i < studentSet.size(); i++) {
//			Student stFind = a.next();
//			if (stFind.getId() == id) {
//				System.out.println(stFind);
//				
//			}
//		}

		// h: T???o 1 method t??m ki???m student theo name
//		System.out.println(" Nhap vao ten can tim kiem");
//		Scanner sc1 = new Scanner(System.in);
//		String name = sc1.nextLine();
//		Iterator<Student> b = studentSet.iterator();
//		for (int i = 0; i < studentSet.size(); i++) {
//			Student stFind = b.next();
//			if (stFind.getName().equals(name)) {
//				System.out.println(stFind);
//			}
//		}
		
		// j: Xoa name cua Student theo Id:
		
//		System.out.println(" Nhap vao id can xoa ten: ");
//		int idCanXoa = sc1.nextInt();
//		Iterator<Student> cauJ = studentSet.iterator();
//		for ( int i = 0; i < studentSet.size(); i++) {
//			Student stFind = cauJ.next();
//			if(stFind.getId()== idCanXoa) {
//				stFind.setName(null);
//				System.out.println(stFind);
//			}
//		}
		
		//k: Delete Student theo id:
//		System.out.println(" Nhap vao id can xoa ten: ");
//		Scanner sc1 = new Scanner(System.in);
//		int idCanXoa = sc1.nextInt();
//		Iterator<Student> cauJ = studentSet.iterator();
//		Set<Student> listStxoa = new HashSet<>();
//		for ( int i = 0; i < studentSet.size(); i++) {
//			Student stFind = cauJ.next();
//			if(stFind.getId()== idCanXoa) {
//				listStxoa.add(stFind);
//			}
//		}
//		if( listStxoa.size() > 0) {
//			studentSet.removeAll(listStxoa);
//		}
//		for (Student student : listStxoa) {
//			System.out.println(student);
//		}
		
		//l : T???o 1 Set t??n l?? studentCopies v?? add t???t c??? students v??o studentCopies:
		Set<Student> studentCoppies = new HashSet<>();
		studentCoppies.addAll(studentSet);
		System.out.println(" Coppy thanh cong");
		System.out.println(" In danh sach phan tu trong student Coppy: ");
		Iterator<Student> cauL = studentCoppies.iterator();
		for ( int i = 0; i < studentCoppies.size(); i++) {
				System.out.println(cauL.next());
		}

//		Question 6: Map
//		????? thay th??? 1 object ta c?? th??? t???o 1 map t??n l?? students c?? key = id c???a
//		student , value l?? name c???a students
		System.out.println("Question 6________________________");
		Map<Integer, String> studentMap = new HashMap<>();
		studentMap.put(1, " Loan");
		studentMap.put(2, "Linh");
		studentMap.put(3, "Phuong");
		studentMap.put(4, "Duy");
		studentMap.put(5, "Quyen");
		
		for (Map.Entry<Integer, String> entry: studentMap.entrySet()) {
			System.out.println(" Id: " + entry.getKey() + ", Ten: " + entry.getValue());
		}
		
		
		//Question7: 
//		a) In ra c??c key c???a students
		for (Map.Entry<Integer, String> entry: studentMap.entrySet()) {
			System.out.println(" Id: " + entry.getKey());
		}
		
//		b, In ra value c???a students
		for (Map.Entry<Integer, String> entry: studentMap.entrySet()) {
			System.out.println(" Value: " + entry.getValue());
		}
		
		
		//		Exercise 2 (Optional): Comparing
		//		T???o 1 student c?? property id, name, ng??y sinh, ??i???m v?? t???o 5 student
		//		Question 1: Comparable
		//		In ra h???c sinh s???p x???p theo name
		
		System.out.println( "E2- Q1____________________________________");
		List<StudentEx2> liststudentEx2 = new ArrayList<StudentEx2>();
		liststudentEx2.add(new StudentEx2(10, "Loan", LocalDate.of(1996, 1, 6), 10));
		liststudentEx2.add(new StudentEx2(5, "Loan", LocalDate.of(1996, 1, 6), 9));
		liststudentEx2.add(new StudentEx2(2, "Quyen", LocalDate.of(1995, 6, 28), 9));
		liststudentEx2.add(new StudentEx2(6, "Quyen", LocalDate.of(1995, 6, 20), 10));
		liststudentEx2.add(new StudentEx2(3, "Trang", LocalDate.of(1997, 3, 17), 10));
		liststudentEx2.add(new StudentEx2(4, "Linh", LocalDate.of(1994, 8, 9), 9));
		liststudentEx2.add(new StudentEx2(5, "Duy", LocalDate.of(1995, 5, 3), 8));
		
		System.out.println("In ra hoc sinh sap xep theo name: ");
		Collections.sort(liststudentEx2, new NameComparator());
		for (StudentEx2 student : liststudentEx2) {
			System.out.println(student);
		}
		
		System.out.println(" In ra h???c sinh s???p x???p theo name, n???u t??n tr??ng nhau th?? s??? s???p x???p "
				+ "theo ng??y sinh, n???u ng??y sinh tr??ng nhau th?? s??? s???p x???p theo ??i???m");
		Collections.sort(liststudentEx2, new TenDiemNgaySinh_Comparator() );
		for (StudentEx2 student : liststudentEx2) {
			System.out.println(student);
		}
		
		//================ Exercise 3: Generic=======================
		
//		Question 1: T generic (class)
//		T???o class student c?? property id, name (trong ???? id c???a student c?? th???
//				l?? int, long, float)
//				a) T???o ?????i t?????ng student c?? id l?? int
//				b) T???o ?????i t?????ng student c?? id l?? float
//				c) T???o ?????i t?????ng student c?? id l?? double
		
		System.out.println("E3_ Q1_______________________________");
		Student<Integer> st1 = new Student<Integer>(1, " Loan");
		Student<Float> st2 = new Student<Float>(1.13f , " Linh");
		Student<Double> st3 = new Student<Double>(1.14d , " Hoa");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
//		Question 2: T generic (method)
//		T???o method ????? in ra th??ng tin nh???p v??o (parameter)
//		(parameter c?? th??? l?? h??? v?? t??n, ho???c student, ho???c int)
//		G???i ??: t???o method print(T a) v?? c??i ?????t system out (a) ra
//		Demo ch????ng tr??nh v???i print(student), print(4), print(4.0)
		
		System.out.println(" Exercise 3 _ Question2:__________________________");
		print(st1);
		print(st2);
		print(st3);
		print(4);
		print(4.0f);
		print(3.145d);
		
//		Question 4: E generic
//		T???o 1 array int, 1 array float, 1 array long, 1 array double
//		T???o 1 method c?? parameter l?? array v?? in ra c??c s??? trong array ????
		
		System.out.println("E3_ Q4_______________________________");
		
		Integer[] arrayInt = { 1,2,3,5,6,7};
		Float[] arrayFloat = { 3.14f, 4.67f, 5.04f, 1.23f };
		Long[] arrayLong = { 1l, 3l, 4l, 567l, 47l, 678910l };
		Double[] arrayDouble = {1.2345d, 2.16d, 3.1313d};
		System.out.println(" In ra arrayInt:  ");
		printArray(arrayInt);
		System.out.println(" In ra arrayFloat:  ");
		printArray(arrayFloat);
		System.out.println(" In ra arrayLong:  ");
		printArray(arrayLong);
		System.out.println(" In ra arrayDouble:  ");
		printArray(arrayDouble);
		
		
//		Question 5: E generic3
//		T???o 1 class Employee c?? property id, name, salaries v???i salaries l??
//		l????ng c??c th??ng c???a Employee ???? v?? l?? 1 array c?? data type c?? th??? l??
//		int, long, float.
//		Vi???t method trong Employee ????? in ra th??ng tin c???a Employee bao g???m
//		id, name, salaris.
//		Vi???t method trong Employee ????? in ra th??ng tin th??ng l????ng cu???i c??ng
//		c???a Employee
//		a) H??y t???o ch????ng tr??nh demo v???i Employee c?? salaries l??
//		datatype int
//		b) H??y t???o ch????ng tr??nh demo v???i Employee c?? salaries l??
//		datatype float
//		c) H??y t???o ch????ng tr??nh demo v???i Employee c?? salaries l??
//		datatype double
		
		System.out.println("E3-Q5________________________________________");
		Integer[] SalInt = { 1000, 2000, 1500, 1600} ;
		Employee<Integer> emp1 = new Employee<Integer>("Linh", SalInt);
		Long[] SalLong = {10000l, 20000l, 15000l};
		Employee<Long> emp2 = new Employee<Long>(" Huong", SalLong);
		Float[] salFloat = { 1000.2f, 1500.3f, 2000f};
		Employee<Float> emp3 = new Employee<Float>("Loan", salFloat);
		
		System.out.println(emp1);
		System.out.println(" Thang luong cuoi cung cua Employee1: " + SalInt[SalInt.length-1]);
		System.out.println(emp2);
		System.out.println(" Thang luong cuoi cung cua Employee2: " + SalLong[SalLong.length-1]);
		System.out.println(emp3);
		System.out.println(" Thang luong cuoi cung cua Employee3: " + salFloat[salFloat.length-1]);
		
//		Question 6: K & V generic
//		T???o 1 class c?? t??n l?? MyMap, l??u d??? li???u theo d???ng key, value
//		T???o c??c method
//		a) GetValue()
//		b) getKey ()
//		Vi???t ch????ng tr??nh demo: t???o 1 object Student c?? key l?? M?? sinh vi??n
//		v?? value l?? t??n c???a sinh vi??n ????
		System.out.println(" E3_Q6____________________________________________");
		MyMap<String, String> myMap = new MyMap<String, String>("00001"," Dao Thi Thanh Loan");
		System.out.println("Thong tin sinh vien: [ MSV: " + myMap.getKey() + ", Ten Sinh vien: " + myMap.getValue() + " ]");
		
//		Question 7: K & V generic
//		T???o 1 class c?? t??n l?? Phone, l??u d??? li???u theo d???ng key, value (extends
//		MyMap)
//		V???i key l?? email ho???c l?? s??? th??? t??? ho???c l?? t??n ng?????i s??? d???ng
//		V???i value l?? s??? ??i???n tho???i
//		T???o c??c method
//		a) GetPhoneNumber()
//		b) getKey ()
		System.out.println(" E3_Q7____________________________________________");
		Phone<String, String> phone1 = new Phone<String, String>(" Daoloan6196@gmail.com", "0123456789");
		Phone<Integer, String> phone2 = new Phone<Integer, String>(1, "0123456789");
		Phone<String, String> phone3 = new Phone<String, String>(" Loan", "0123456789");
		
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		
//		Question 8: K & V generic
//		T???o 1 class c?? t??n l?? Staff, l??u d??? li???u theo d???ng key, value (extends
//		MyMap)
//		V???i key l?? id c???a Staff (ID c?? th??? l?? int, long)
//		V???i value l?? t??n c???a Staff
//		T???o c??c method
//		a) GetId ()
//		b) getName ()
//		Vi???t ch????ng tr??nh demo
		
		System.out.println(" E3_Q8____________________________________________");
		Staff<Integer> staff1 = new Staff<Integer>(1, " Nguyen Van A");
		Staff<Long> staff2 = new Staff<Long>(1000000000000l, " Nguyen Van B");
		System.out.println(" Id: " + staff1.getId() + " , Ten: " + staff1.getName());
		System.out.println(" Id: " + staff2.getId() + " , Ten: " + staff2.getName());;
		
		// =============Exercise 4 (Optional): Wildcard (Generic)==============
//		Question 1:
//			T???o 1 class Salary ????? ?????i di???n cho datatype l?? c??c s???
//			a) H??y config class Salary nh?? sau: Salary <N> v???i N ph???i ???????c
//			extends t??? Number.class
//			b) T???o method ????? print ra salary hi???n t???i
		System.out.println(" E4_Q1____________________________________________");
		Salary<Integer> salary1 = new Salary<Integer>(10000000);
		Salary<Float> salary2 = new Salary<Float>(2045.23455f);
		Salary<Double> salary3 = new Salary<Double>(2045.23455555555555d);
		System.out.println(salary1);
		System.out.println(salary2);
		System.out.println(salary3);
		
//		Question 2:
//			T???o 1 class MyNumber ????? ?????i di???n cho datatype l?? c??c s???
//			H??y config class MyNumber nh?? sau: MyNumber<N> v???i N ph???i
//			???????c extends t??? Number.class
		System.out.println(" E4_Q2____________________________________________");
		MyNumber<Integer> num = new MyNumber<Integer>(1234);
		System.out.println(num.myNumber);
		
//		Question 3: T generic (method)
//		T???o method t??nh max c???a 2 s??? (s??? nh???p v??o c?? th??? l?? float, double, int,
//		long).
//		Demo ch????ng tr??nh
		System.out.println(" E4_Q3____________________________________________");
		MyNumber<Integer> number = new MyNumber<Integer>(1234);
	}
		
		
	
	


	









	// g:
	public static void timKiemStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap id can tim: ");
		int id1 = sc.nextInt();
		for (Student student : listStudent) {
			if (id1 == (int)student.getId()) {
				System.out.println(" Sinh vien can tim co thong tin nhu sau: " + student);
			}
		}
	}

	// h:
	public static void timkiemTheoTen() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap vao ten can tim: ");
		String name = sc.nextLine();
		for (Student student : listStudent) {
			if (student.getName().equals(name)) {
				System.out.println(" Sinh vien can tim co thong tin: " + student);
			}
		}
	}

	// i:
	public static void inSinhVienTrungTen() {
		for (int i = 0; i < listStudent.size(); i++) {
			for (int j = i + 1; j < listStudent.size(); j++) {
				if (listStudent.get(j).getName().equals(listStudent.get(i).getName())) {
					System.out.println(listStudent.get(i).toString());
					break;
				}
			}
		}
	}
	
	// Method cho Exercise 3 _ Question2:
	public static <T> void print(T a) {
		System.out.println(a);
	}
		
	// Method cho exercise 2 - Question 4:
		
		public static <E> void printArray(E[] inputArrray) {
			for (E element : inputArrray) {
				System.out.printf("%s; ", element);
			}
			System.out.println("\n");
		}
		
	}


