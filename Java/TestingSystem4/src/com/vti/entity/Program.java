package com.vti.entity;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {

		//Ex1- Question1:
		// Xem constructor ben Class Department:
		
		System.out.println(" Ex1 - Q1_______________________________________________________________");
		
		Department dep1 = new Department();
		Department dep2 = new Department("Sale");
		
		System.out.println(dep1.toString());
		System.out.println(dep2.toString());
		
		//Ex1- Question2:
		// Xem constructor ben Class Account:
		
		System.out.println(" Ex1 - Q2_______________________________________________________________");
		
		
	
		Account acc1 = new Account();
		Account acc2 = new Account(1, "Daoloan6196@gmail.com", "Loan", " Dao" , " Thanh Loan");
	
		
		Position pos3 = new Position(1, PositionName.DEV);
		Account acc3 = new Account(1, "Daoloan6196@gmail.com", "Loan", " Dao" , " Thanh Loan", pos3);
		
		Position pos4 = new Position(2, PositionName.PM); 
		Account acc4 = new Account(1, "Daoloan6196@gmail.com", "Loan", " Dao" , " Thanh Loan", pos4, LocalDate.of(2020, 1, 15));
		
		Account[] accarray = { acc1, acc2, acc3, acc4};
		for (Account account : accarray) {
			System.out.println(account );
		}
		
		//Ex1- Question3:
		// Xem constructor ben Class Group:
		System.out.println(" Ex1 - Q3_______________________________________________________________");
		Group group1 = new Group();
		
		Account[] accarray2 = { acc1, acc2, acc3, acc4 };
		Group group2 = new Group(2, " Group2", acc1, accarray2, LocalDate.of(2020, 9, 5));
		
		String[] userNames = { "Loan", " Phuong", "Linh"};
		Group group3 = new Group(3, " Group3", acc3, userNames, LocalDate.of(2020, 9, 5));
		
		System.out.println(group1);
		System.out.println(group2);
		System.out.println(group3);
		
		
	
		
		
		
		
	
		
		
		

	}

	

}
