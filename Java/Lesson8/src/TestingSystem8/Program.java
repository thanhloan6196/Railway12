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
//		Khai báo 1 danh sách lưu các tên học sinh tới tham dự phỏng vấn, thứ
//		tự tới của các học sinh như sau:
//		Nguyễn Văn Nam, Nguyễn Văn Huyên, Trần Văn Nam,
//		Nguyễn Văn A

//		a) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ
//		muộn nhất tới sớm nhất (gợi ý dùng Stack)

		Stack<Student> students = new Stack<>();
		students.push(new Student(" Nguyen Van Nam "));
		students.push(new Student(" Nguyen Van Huyen "));
		students.push(new Student(" Tran Van Nam "));
		students.push(new Student(" Nguyen Van A "));

		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());

//				b) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự
//				sớm nhất tới muộn nhất (gợi ý dùng Queue)
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
//				Tạo 1 student có property id, name
//				Khai báo 1 Set students, sau đó làm các chức năng tương tự List
		System.out.println(" Question3 ________________________________\n");
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student("Loan"));
		studentSet.add(new Student("Linh"));
		studentSet.add(new Student("Phuong"));
		studentSet.add(new Student("Quyen"));
		studentSet.add(new Student("Giang"));
		studentSet.add(new Student("Mai"));

		// a: In ra tổng số phần tử của students
		System.out.println(" Tong so phan tu cuar Student la: " + studentSet.size());
		// Lấy phần tử thứ 4 của students
		System.out.println(" Phan tu thu 4 cua Student la: ");
		Iterator<Student> studentIterrator = studentSet.iterator();
		for (int i = 0; i < 2; i++) {
			studentIterrator.next();
		}
		System.out.println(studentIterrator.next());

		// c: In ra phần tử đầu và phần tử cuối của students
		Iterator<Student> iteratorSet4 = studentSet.iterator();
		System.out.println(" Phan tu dau cuar Student la: " + iteratorSet4.next());
		System.out.println(" Phan tu cuoi cua Student la: ");
		for (int i = 0; i < studentSet.size() - 2; i++) {
			iteratorSet4.next();
		}
		System.out.println(iteratorSet4.next());

		// g) Tạo 1 method tìm kiếm student theo id:

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

		// h: Tạo 1 method tìm kiếm student theo name
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
		
		//l : Tạo 1 Set tên là studentCopies và add tất cả students vào studentCopies:
		Set<Student> studentCoppies = new HashSet<>();
		studentCoppies.addAll(studentSet);
		System.out.println(" Coppy thanh cong");
		System.out.println(" In danh sach phan tu trong student Coppy: ");
		Iterator<Student> cauL = studentCoppies.iterator();
		for ( int i = 0; i < studentCoppies.size(); i++) {
				System.out.println(cauL.next());
		}

//		Question 6: Map
//		Để thay thế 1 object ta có thể tạo 1 map tên là students có key = id của
//		student , value là name của students
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
//		a) In ra các key của students
		for (Map.Entry<Integer, String> entry: studentMap.entrySet()) {
			System.out.println(" Id: " + entry.getKey());
		}
		
//		b, In ra value của students
		for (Map.Entry<Integer, String> entry: studentMap.entrySet()) {
			System.out.println(" Value: " + entry.getValue());
		}
		
		
		//		Exercise 2 (Optional): Comparing
		//		Tạo 1 student có property id, name, ngày sinh, điểm và tạo 5 student
		//		Question 1: Comparable
		//		In ra học sinh sắp xếp theo name
		
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
		
		System.out.println(" In ra học sinh sắp xếp theo name, nếu tên trùng nhau thì sẽ sắp xếp "
				+ "theo ngày sinh, nếu ngày sinh trùng nhau thì sẽ sắp xếp theo điểm");
		Collections.sort(liststudentEx2, new TenDiemNgaySinh_Comparator() );
		for (StudentEx2 student : liststudentEx2) {
			System.out.println(student);
		}
		
		//================ Exercise 3: Generic=======================
		
//		Question 1: T generic (class)
//		Tạo class student có property id, name (trong đó id của student có thể
//				là int, long, float)
//				a) Tạo đối tượng student có id là int
//				b) Tạo đối tượng student có id là float
//				c) Tạo đối tượng student có id là double
		
		System.out.println("E3_ Q1_______________________________");
		Student<Integer> st1 = new Student<Integer>(1, " Loan");
		Student<Float> st2 = new Student<Float>(1.13f , " Linh");
		Student<Double> st3 = new Student<Double>(1.14d , " Hoa");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
//		Question 2: T generic (method)
//		Tạo method để in ra thông tin nhập vào (parameter)
//		(parameter có thể là họ và tên, hoặc student, hoặc int)
//		Gợi ý: tạo method print(T a) và cài đặt system out (a) ra
//		Demo chương trình với print(student), print(4), print(4.0)
		
		System.out.println(" Exercise 3 _ Question2:__________________________");
		print(st1);
		print(st2);
		print(st3);
		print(4);
		print(4.0f);
		print(3.145d);
		
//		Question 4: E generic
//		Tạo 1 array int, 1 array float, 1 array long, 1 array double
//		Tạo 1 method có parameter là array và in ra các số trong array đó
		
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
//		Tạo 1 class Employee có property id, name, salaries với salaries là
//		lương các tháng của Employee đó và là 1 array có data type có thể là
//		int, long, float.
//		Viết method trong Employee để in ra thông tin của Employee bao gồm
//		id, name, salaris.
//		Viết method trong Employee để in ra thông tin tháng lương cuối cùng
//		của Employee
//		a) Hãy tạo chương trình demo với Employee có salaries là
//		datatype int
//		b) Hãy tạo chương trình demo với Employee có salaries là
//		datatype float
//		c) Hãy tạo chương trình demo với Employee có salaries là
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
//		Tạo 1 class có tên là MyMap, lưu dữ liệu theo dạng key, value
//		Tạo các method
//		a) GetValue()
//		b) getKey ()
//		Viết chương trình demo: tạo 1 object Student có key là Mã sinh viên
//		và value là tên của sinh viên đó
		System.out.println(" E3_Q6____________________________________________");
		MyMap<String, String> myMap = new MyMap<String, String>("00001"," Dao Thi Thanh Loan");
		System.out.println("Thong tin sinh vien: [ MSV: " + myMap.getKey() + ", Ten Sinh vien: " + myMap.getValue() + " ]");
		
//		Question 7: K & V generic
//		Tạo 1 class có tên là Phone, lưu dữ liệu theo dạng key, value (extends
//		MyMap)
//		Với key là email hoặc là số thứ tự hoặc là tên người sử dụng
//		Với value là số điện thoại
//		Tạo các method
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
//		Tạo 1 class có tên là Staff, lưu dữ liệu theo dạng key, value (extends
//		MyMap)
//		Với key là id của Staff (ID có thể là int, long)
//		Với value là tên của Staff
//		Tạo các method
//		a) GetId ()
//		b) getName ()
//		Viết chương trình demo
		
		System.out.println(" E3_Q8____________________________________________");
		Staff<Integer> staff1 = new Staff<Integer>(1, " Nguyen Van A");
		Staff<Long> staff2 = new Staff<Long>(1000000000000l, " Nguyen Van B");
		System.out.println(" Id: " + staff1.getId() + " , Ten: " + staff1.getName());
		System.out.println(" Id: " + staff2.getId() + " , Ten: " + staff2.getName());;
		
		// =============Exercise 4 (Optional): Wildcard (Generic)==============
//		Question 1:
//			Tạo 1 class Salary để đại diện cho datatype là các số
//			a) Hãy config class Salary như sau: Salary <N> với N phải được
//			extends từ Number.class
//			b) Tạo method để print ra salary hiện tại
		System.out.println(" E4_Q1____________________________________________");
		Salary<Integer> salary1 = new Salary<Integer>(10000000);
		Salary<Float> salary2 = new Salary<Float>(2045.23455f);
		Salary<Double> salary3 = new Salary<Double>(2045.23455555555555d);
		System.out.println(salary1);
		System.out.println(salary2);
		System.out.println(salary3);
		
//		Question 2:
//			Tạo 1 class MyNumber để đại diện cho datatype là các số
//			Hãy config class MyNumber như sau: MyNumber<N> với N phải
//			được extends từ Number.class
		System.out.println(" E4_Q2____________________________________________");
		MyNumber<Integer> num = new MyNumber<Integer>(1234);
		System.out.println(num.myNumber);
		
//		Question 3: T generic (method)
//		Tạo method tính max của 2 số (số nhập vào có thể là float, double, int,
//		long).
//		Demo chương trình
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


