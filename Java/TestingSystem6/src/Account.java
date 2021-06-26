


import java.time.LocalDate;
import java.util.Scanner;

public class Account {
	private int id;
	private String email;
	private String userName;
	private String fullName;
	
	
	// Khoi tao Constructor cho Account ( Question 9)
	public Account() {
		System.out.println(" Nhap thong tin Account: ");
		System.out.println(" Nhap id cua Account: ");
		this.id = ScannerUtils.inputIntPositive();
		System.out.println(" Nhap email cua Account: ");
		this.email = ScannerUtils.inputString();
		System.out.println(" Nhap username cua Account: ");
		this.userName = ScannerUtils.inputString();
		System.out.println(" Nhap fullname cua Account: ");
		this.fullName = ScannerUtils.inputString();
				
	}
	
	@Override
	public String toString() {
		
		return " Thong tin Account: [ Id: " + this.id + " , Email: " + this.email 
				+ " , UserName: " + this.userName + " , fullName: " + this.fullName + " ]";
	}
	
	

}
