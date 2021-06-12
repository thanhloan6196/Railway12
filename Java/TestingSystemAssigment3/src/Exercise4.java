import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

//		Question1();
//		Question2(); 
//		Question3();
//		Question4();
//		Question5();
//		Question6();
//		Question7();
//		question8();
//		Q8();
//		question9();
//		question10();
//		question11();
//		question12();
//		question13();
//		question14();
//		question15();
//		question16();

	}

//	Question 1:
//	Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//	thể cách nhau bằng nhiều khoảng trắng );
	public static void Question1() {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap xau: ");
		String str = scanner.nextLine();
		scanner.close();
		
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		String[] words = str.split(" ");
			
		System.out.println(" So tu cua xau la: " + words.length);

	
	}
	
	public static void q1() {



	
	}

//Question 2:
//	Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
	public static void Question2() {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		System.out.println(" Xau noi s1 va s2 la: " + s1 + " " + s2);
		scanner.close();

	}

//Question 3:
//	Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
//	viết hoa chữ cái đầu thì viết hoa lên

	public static void Question3() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap vao ten: ");
		String ten = sc.nextLine();
		String firstLetter = ten.substring(0, 1).toUpperCase();
		String otherLetter = ten.substring(1);
		System.out.println(" Ten cua ban la: " + firstLetter + otherLetter);
		sc.close();

	}

//	Question 4:
//		Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
//		của người dùng ra
//		VD:
//		Người dùng nhập vào "Nam", hệ thống sẽ in ra
//		"Ký tự thứ 1 là: N"
//		"Ký tự thứ 1 là: A"
//		"Ký tự thứ 1 là: M"

	public static void Question4() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		for (int i = 0; i < name.length(); i++) {
			System.out.println(" Ki tu thu " + (i + 1) + " la: " + name.charAt(i));
		}
		scanner.close();
	}

//	Question 5:
//		Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//		dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ

	public static void Question5() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap vao ho: ");
		String ho = sc.nextLine();
		System.out.println(" Moi ban nhap vao Ten: ");
		String ten = sc.nextLine();

		System.out.println(" Ho ten day du cua ban la: " + ho + " " + ten);
		sc.close();
	}

//	Question 6:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//		VD:
//		Người dùng nhập vào "Nguyễn Văn Nam"
//		Hệ thống sẽ in ra
//		"Họ là: Nguyễn"
//		"Tên đệm là: Văn"
//		"Tên là: Nam"

	public static void Question6() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap vao ho va ten: ");
		String hoTen = sc.nextLine();
		String hoTen1 = hoTen.trim();
		String[] words = hoTen1.split(" ");
		int l = words.length;

		String ho = words[0];
		String ten = words[l - 1];
		String tenDem = "";
		for (int i = 1; i < l - 1; i++) {
			tenDem += words[i] + " ";
		}
		System.out.println(" Ho la: " + ho);
		System.out.println(" Ten dem la: " + tenDem);
		System.out.println(" Ten la: " + ten);
		sc.close();

	}

//	Question 7:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		chuẩn hóa họ và tên của họ như sau:
//		a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
//		vào
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//		chuẩn hóa thành "nguyễn văn nam"
//		b) Viết hoa chữ cái mỗi từ của người dùng
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//		chuẩn hóa thành "Nguyễn Văn Nam"

	public static void Question7() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap ho va ten:  ");
		String hoTen = sc.nextLine();
		sc.close();

		// Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
		hoTen = hoTen.trim();
		hoTen = hoTen.replaceAll("\\s+", " ");
		System.out.println(" test: " + hoTen);

		// b: Viet hoa chu cai moi tu:
		String[] words = hoTen.split(" ");
		hoTen = "";
		for (String word : words) {

			for (int i = 0; i < word.length(); i++) {
				String firstLetter = word.substring(0, 1).toUpperCase();
				String otherLetter = word.substring(1);
				word = firstLetter + otherLetter;
			}
			hoTen = hoTen + word + " ";
		}

		System.out.println(" Ten duoc chuan hoa la: " + hoTen);

	}

//	Question 8:
//		In ra tất cả các group có chứa chữ "Java"

	public static void question8() {
		Group group1 = new Group();
		group1.groupName = " Java is hard";
		Group group2 = new Group();
		group2.groupName = " Java is Fun";
		Group group3 = new Group();
		group3.groupName = " Nothing fun";

		Group[] groups = { group1, group2, group3 };
		for (Group group : groups) {
			if (group.groupName.contains("Java")) {
				System.out.println(" Ten cua Group co chua chu Java: " + group.groupName);
			}

		}
	}
	// Cach 2_ Q8:

	public static void Q8() {
		String[] groupNames = { " Java is hard", " Java is Fun", " Nothing fun" };
		for (int i = 0; i < groupNames.length; i++) {
			if (groupNames[i].contains("Java")) {
				System.out.println(groupNames[i]);
			}
		}
	}

//			Question 9:
//				In ra tất cả các group "Java"

	public static void question9() {
		String[] groupNames = { "Java", "Python", "SQL", "C#", "Java" };
		for (int i = 0; i < groupNames.length; i++) {
			if (groupNames[i].equals("Java")) {
				System.out.println(groupNames[i]);
			}
		}

	}

//	Question 10 (Optional):
//		Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//		Nếu có xuất ra “OK” ngược lại “KO”.
//		Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.

	public static void question10() {

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap chuoi thu nhat: ");
		String s1 = scanner.nextLine();
		System.out.println(" Nhap chuoi thu hai: ");
		String s2 = scanner.nextLine();
		String s1Reverse = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s1Reverse += s1.charAt(i);
		}

		if (s1Reverse.equals(s2)) {
			System.out.println("OK");
		} else
			System.out.println("KO");
		scanner.close();

	}

//	Question 11 (Optional): Count special Character
//	Tìm số lần xuất hiện ký tự "a" trong chuỗi

	public static void question11() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap chuoi: ");
		String s1 = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(" So lan xuat hien ky tu a: " + count);
		scanner.close();

	}

//	Question 12 (Optional): Reverse String
//	Đảo ngược chuỗi sử dụng vòng lặp

	public static void question12() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Nhap chuoi: ");
		String s = sc.nextLine();
		String sReverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			sReverse += s.charAt(i);
		}
		System.out.print(" chuoi dao nguoc la: " + sReverse);
		sc.close();

	}

//	Question 13 (Optional): String not contains digit
//	Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
//	lại true.
//	Ví dụ:
//	"abc" => true
//	"1abc", "abc1", "123", "a1bc", null => false

	public static void question13() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Nhap chuoi: ");
		String s = sc.nextLine();
		sc.close();
		int check = -1;

		for (int i = 0; i < s.length(); i++) {
			if (isDiGit(s.charAt(i))) {
				check = 1;
			}
			}
		if ( check < 0) System.out.println(" False");
		if ( check > 0) System.out.println("True");
	
	}

	// Tao ham kiem tr xem co phai chu so hay khong:
	public static boolean isDiGit(char c) {
		if (c >= '0' && c <= '9')
			return true;
		return false;
	}
	
//	Question 14 (Optional): Replace character
//	Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
//	cho trước.
//	Ví dụ:
//	"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
	
	public static void question14() {
		System.out.print(" Nhap chuoi: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(" Nhap ky tu chi dinh: ");
		char c = sc.next().charAt(0);
		System.out.print(" Nhap ky tu thay the: ");
		char d = sc.next().charAt(0);
		sc.close();
		
		str = str.replace(c, d);
		System.out.println(" Chuoi moi la: " + str);
		
	}
	
//	Question 15 (Optional): Revert string by word
//	Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
//	thư viện.
//	Ví dụ: " I am developer " => "developer am I".
//	Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//	Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
//	chuỗi theo dấu cách
	
	public static void question15() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap chuoi: ");
		String s = scanner.nextLine();
		scanner.close();
		// chuan hoa xau:
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		String[] words = s.split(" ");
		String sRevert = "";
		for ( int i = words.length -1 ; i >= 0; i--) {
			sRevert += words[i] + " ";
		}
		System.out.println(" Chuoi dao nguoc la: " + sRevert);
	}
	
//	Question 16 (Optional):Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
//			bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
//			hình “KO”.
	public static void question16() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap chuoi: ");
		String str = scanner.nextLine();
		System.out.println(" Nhap so nguyen n: ");
		int n = scanner.nextInt();
		scanner.close();
		
		if ( str == null || str.isEmpty() || str.length() % n != 0) {
			System.out.println(" KO ");
		} else {
			for ( int i = 0; i < str.length(); i += n) {
				System.out.println( str.substring(i, i+n));
			}
		}
		
	}
	
	
}
