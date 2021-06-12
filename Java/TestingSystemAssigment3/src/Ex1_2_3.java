//import java.time.LocalDate;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Ex1_2_3 {
//
//	public static void main(String[] args) {
//
////		-------------------------------------Exercise 1 (Optional): Datatype Casting--------------------------------------------
////		Question 1___________________________________________________________________
////		Khai báo 2 số lương có kiểu dữ liệu là float.
////		Khởi tạo Lương của Account 1 là 5240.5 $
////		Khởi tạo Lương của Account 2 là 10970.055$
////		Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
////		Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
//
//		float salaryAcc1 = 5240.5f;
//		float salaryAcc2 = 10970.055f;
//		int a = (int) salaryAcc1; 
//		int b = (int) salaryAcc2;
//		
//		System.out.println(a);
//		System.out.println(b);
//
//		
////		Question 2___________________________________________________________________
////			Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
////			có số 0 ở sau cho đủ 5 chữ số)
//		
//		Random random = new Random();
//		int num = random.nextInt(100000);
//		
//		while ( num < 10000) {
//			num = num*10;
//		}
//		
//		System.out.println(num);
//
////		Question 3:___________________________________________________________________
////			Lấy 2 số cuối của số ở Question 2 và in ra.
////			Gợi ý:
////			Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
////			Cách 2: chia lấy dư số đó cho 100
//		
//		System.out.println(" Hai so cuoi: " + num%100);
//		
////		Question 4:___________________________________________________________________
////			Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(" Nhap a: ");
//		int a1 = scanner.nextInt();
//		System.out.println(" Nhap b: ");
//		int b1 = scanner.nextInt();
//		
//		float c = (float) a1/ b1;
//		
//		System.out.println(c);
//
////		---------------------------------------Exercise 2 (Optional): Default value---------------------------
//
////		Question 1:___________________________________________________________________
////		Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
////		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
////		 Email: "Email 1"
////		 Username: "User name 1"
////		 FullName: "Full name 1"
////		 CreateDate: now
//
//		Account[] accarray = new Account[5];
//		for ( int i = 0; i < accarray.length; i++) {
//			accarray[i] = new Account();
//			accarray[i].id = i+ 1;
//			accarray[i].email = "Email " + (i +1);
//			accarray[i].fullName = "Full Name " + (i +1);
//			accarray[i].createDate = LocalDate.now();
//			
//			System.out.println(" Account " + ( i + 1) );
//			System.out.println(" Email: " + accarray[i].email);
//			System.out.println(" User Name: " + accarray[i].fullName);
//			System.out.println(" FullName: " + accarray[i].fullName);
//			System.out.println(" CreateDate: " + accarray[i].createDate);
//		}
//
////		-----------------------------------Exercise 3(Optional): Boxing & Unboxing-------------------------------------
//
////		Question 1:
////		Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
////		Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
////		float có 2 số sau dấu thập phân)
//
//		Integer salary = new Integer(5000);
//		System.out.printf("%.2f%n", (float) salary);
//
////		Question 2:
////			Khai báo 1 String có value = "1234567"
////			Hãy convert String đó ra số int
//
//		String s = "1234567";
//		Integer y = Integer.parseInt(s);
//		System.out.println(y);
//
////		Question 3:
////			Khởi tạo 1 số Integer có value là chữ "1234567"
////			Sau đó convert số trên thành datatype int
//
//		Integer aNum = new Integer("1234567");
//		int a11 = aNum.intValue();
//		System.out.println(a11);
//
//	}
//
//}
