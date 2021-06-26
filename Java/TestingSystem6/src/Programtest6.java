import java.util.Scanner;

public class Programtest6 {

	// Ex2- Q1, Q2:

	public static void main(String[] args) throws InvalidAgeInputingException  {
		// TODO Auto-generated method stub

//			try {
//				float result = divide(7,0);
//				System.out.println(result);
//			} catch (Exception e) {
//				System.out.println("cannot divide 0");
//			} finally {
//				System.out.println("divide completed!");
//			}

		// Ex2- Q3:

//			try {
//				int[] numbers = { 1, 2, 3 };
//				System.out.println(numbers[10]);
//			} catch (Exception e) {
//				System.out.println(e);
//			}

		// Ex2- Q4:

//		getIndex(2);

		// Ex2 - Q5:
//		inputAge();
		
		// E2-Q6"
		
//		inputAgeQ6();
		
		// Ex2 - Q7:
//		ScannerUtils question7 = new ScannerUtils();
//		question7.inputInt();
//		question7.inputIntPositive();
		
		// E2 - Q8:
//		question7.inputFloat();
//		question7.inputDouble();
//		question7.inputString();
		
		// E2- Q9:
		
		Position pos1 = new Position();
		System.out.println(pos1);
		Position pos2 = new Position();
		System.out.println(pos2);
		
		Department dep1 = new Department();
		System.out.println(dep1);
		Department dep2 = new Department();
		System.out.println(dep2);
		
		//E2- Q10:
			
//		Group group1 = new Group();
//		group1.printInforGroup();
		
		//E2- Q11, Q12:
		
//		AccountQuestion11 acc1 = new AccountQuestion11();
//		System.out.println(acc1);
//		
		

	}

	public static float divide(int a, int b) {
		return a / b;
	}

	// Method cho E2-Q4:
	public static void getIndex(int index) {
		Department dep1 = new Department("Sale");
		Department dep2 = new Department("Accountant");
		Department dep3 = new Department("Tech");

		Department[] deps = { dep1, dep2, dep3 };

		try {
			System.out.println(deps[index]);

		} catch (Exception e) {
			System.err.println("Cannot find Department");
		}
	}

	// Method cho E2 -Q5:
	public static int inputAge() {

		int tuoi = 0;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Nhap Tuoi: ");
			tuoi = sc.nextInt();
		} catch (Exception e) {
			System.err.println(" wrong inputing! Please input an age as int, input again");

		}
		
		if (tuoi < 0) {
			throw new ArithmeticException(" Wrong inputing! The age must be greater than 0, please input again ");
		}
		return tuoi;
	}
	
	// Method cho E2- Q6:
	public static int inputAgeQ6() {
		int tuoi = 0;
		boolean isNotNumber = true;
		while(isNotNumber) {
			System.out.println(" Nhap Tuoi: ");
			try {
				Scanner sc = new Scanner(System.in);
				tuoi = sc.nextInt();
				isNotNumber = false;
			} catch (Exception e) {
				System.err.println(" wrong inputing! Please input an age as int, input again.");
			}
		}
		return tuoi;
	}
	
	public static int nhapSo() {
		int tuoi = 0;
		boolean isNotNumber = true;
		while (isNotNumber) {
			System.out.println("nhap tuoi: ");
			try {
				Scanner sc = new Scanner(System.in);
				tuoi = sc.nextInt();
				isNotNumber = false;
			} catch (Exception e) {
				System.err.println("wrong inputing! Please input an age as int, input\r\n"
						+ "again.");
			}
		}
		return tuoi;
	}
	
	

}
