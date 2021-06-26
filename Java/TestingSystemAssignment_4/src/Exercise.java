import java.time.LocalDate;

public class Exercise {

	public static void main(String[] args) {


//		Exercise 1 (Optional): Constructor
//		Question 1:
//		Tạo constructor cho department:
//		a) không có parameters
//		b) Có 1 parameter là nameDepartment và default id của
//		Department = 0
//		Khởi tạo 1 Object với mỗi constructor ở trên
		
		//không có parameters
		Department dep1 = new Department();
		
		// Có 1 parameter:
		
		Department dep2 = new Department("Sale");
		System.out.println(dep2.id + " " + dep2.departmentName);
		System.out.println(dep1.id + " " + dep1.departmentName);
		
//		Question 2:
//			Tạo constructor cho Account:
//			a) Không có parameters
//			b) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName)
//			c) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName) và
//			Position của User, default createDate = now
//			d) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName) và
//			Position của User, createDate
//			Khởi tạo 1 Object với mỗi constructor ở trên
		
		Account acc1 = new Account();
		Account acc2 = new Account( 2, "afaf@gmail.com", "afafu", " An", " Nguyen" );
//		Account acc3 = new Account( 3, "LinhPhuong@gmail.com", "linhPhuong", "Phuong", " Linh", DEV );
//		Account acc4 = new Account( 4, "LinhPhuong@gmail.com", "linhPhuong", " An", " Nguyen", TEST,  );
//		Account acc5 = new Account( 4, "LinhPhuong@gmail.com", "linhPhuong", " An", " Nguyen", TEST,  );
		Account acc5 = new Account(0, "afaf@gmail.com", "LoanDao", " ", null, null, LocalDate.of(2020, 12, 1));
	}

}
