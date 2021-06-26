import java.util.Scanner;

public class ProgramLesson6 {

	public static void main(String[] args) throws Exception {
		
		try {
			chuyenTien();
		} catch (Exception e) {
			System.out.println(" Moi ban nhap vao so");
		}
	}	
		public static void checkTuoi(int tuoi) {
			if ( tuoi < 18 ) {
				throw new ArithmeticException(" FBI warning");				
			} else {
				System.out.println(" Chuc mung ban da du tuoi");
			}
		}
		
		public static void chuyenTien() throws Exception {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" Nhap so tien can chuyen: ");
			double tien = scanner.nextDouble();
			System.out.println("So tien can chuyen la " + tien);
		}
		
		
////		int data = 50 / 0;
//		
//	
//		
//		try {
////			int[] manSo = {1,2};
////			System.out.println(manSo[4]);
////			int data = 50 / 0;
//			String a = null;
////			int b = Integer.parseInt(a);
//			System.out.println(a.length());
//		} catch (ArithmeticException e) {
//			System.out.println(" Loi toan hoc");
//		}
//		catch (NullPointerException e) {
//			System.out.println(" String Null");
//		}
//		
//		catch (Exception e) {
//			System.out.println(" Loi khac");
//		} finally {
//			System.out.println(" Kieu gif cung phai in ra dong nay");
//		}
//		
	}


