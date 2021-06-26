package com.vti.entity.AbstractionQuestion2;

public class Main {

	public static void main(String[] args) {
		
		User employee1 = new Employee(" Loan ", 1.345);
		employee1.displayInfor();
		
		Manager manager1 = new Manager(" Linh ", 2.15);
		manager1.displayInfor();
		User waiter1 = new Waiter(" Quyen", 1.23);
		waiter1.displayInfor();

	}

}
