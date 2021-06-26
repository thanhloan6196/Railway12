import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScannerUtils {
	int age;
	int id;

	// Method cho E2_Q7:
	public static int inputInt() {

		int x = 0;
		boolean isNotNumber = true;
		while (isNotNumber) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println(" Nhap 1 so: ");
				x = sc.nextInt();
				isNotNumber = false;
			} catch (Exception e) {
				System.err.println(" Ban phai nhap vao 1 so!");
			}
		}
		return x;
	}
	
	public static int inputIntPositive() {

		int x = 0;
		boolean isNotNumber = true;
		while (isNotNumber) {
			Scanner sc = new Scanner(System.in);
			try {
//				System.out.println(" Nhap 1 so: ");
				x = sc.nextInt();
				isNotNumber = false;
			} catch (Exception e) {
				System.err.println(" Ban phai nhap vao 1 so!");
			}
			
		if ( x < 0 ) {
			throw new ArithmeticException("Ban phai nhap vao 1 so >= 0");
		}
		}
		return x;
	}
	
	// Method cho E2-Q8:
	public static float inputFloat() {
		float x = 0;
		boolean isNotNumber = true;
		while ( isNotNumber) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println(" Nhap 1 so thuc: ");
				x = sc.nextFloat();
				isNotNumber = false;
			} catch (Exception e) {
				System.err.println(" ban phai nhap vao 1 so thuc!");
			}
		}
		return x;
	}
	
	public static double inputDouble() {
		double number = 0;
		boolean isNotNumber = true;
		while (isNotNumber) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println(" Nhap vao 1 so thuc dang double: ");
				number = sc.nextDouble();
				isNotNumber = false;
			} catch (Exception e) {
				System.err.println(" Ban phai nhap vao 1 so thuc!");
			}
		}
		return number;
	}
	
	public static String inputString() {
		String str = null;
		boolean isNotString = true;
		while (isNotString) {
			Scanner sc = new Scanner(System.in);
//			System.out.println(" Nhap vao mot chuoi: ");
			str = sc.nextLine().trim();
			if ( str.isEmpty()) {
				System.err.println(" Ban phai nhap vao 1 chuoi");
			} else isNotString = false;
		}
		
		
		return str;
	}
	
	public static LocalDate inputLocalDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap theo dinh dang: \"yyyy-MM-dd\" ");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		while( true) {
			String date = sc.nextLine().trim();
			try {
					if (!format.parse(date).equals(null)) {
					LocalDate lc = LocalDate.parse(date);
					return lc;
					} 
			} catch (Exception e) {
				System.err.println(" Nhap lai: ");
			}
		}
		
		
		
	}


}
