import java.util.Scanner;

public class AccountQuestion11 {

	private int id;
	private String email;
	private String userName;
	private String fullName;
	private int age;
	
	// Tao method inputAccountAge() (Question12)
	public static int inputAccountAge() throws InvalidAgeInputingException {
		int age = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(" Nhap tuoi: ");
			age = sc.nextInt();
			if (age <= 0) {
				throw new InvalidAgeInputingException(" The age must be greater than 0");
			} else if (age < 18) {
				System.err.println(" Your age must be greater then 18");
			} else {
				return age;
			}
		}

	}
	
	// Sua lai Constructor cho account ( Question 12):
	
	public AccountQuestion11() throws InvalidAgeInputingException {
		System.out.println(" Nhap thong tin Account: ");
		System.out.println(" Nhap id cua Account: ");
		this.id = ScannerUtils.inputIntPositive();
		System.out.println(" Nhap email cua Account: ");
		this.email = ScannerUtils.inputString();
		System.out.println(" Nhap username cua Account: ");
		this.userName = ScannerUtils.inputString();
		System.out.println(" Nhap fullname cua Account: ");
		this.fullName = ScannerUtils.inputString();
		// nhap tuoi:
		this.age = inputAccountAge();
	}
	
	@Override
	public String toString() {
		
		return  " Thong tin Account: [ Id: " + this.id + " , Email: " + this.email 
				+ " , UserName: " + this.userName + " , fullName: " + this.fullName + ", Tuoi: " + this.age + " ]";
	}
	

}
