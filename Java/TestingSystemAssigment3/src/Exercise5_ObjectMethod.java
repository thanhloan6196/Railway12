
public class Exercise5_ObjectMethod {

	public static void main(String[] args) {

//		 Department

		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Phong Marketing";

		Department department2 = new Department();
		department2.id = 2;
		department2.departmentName = "Phong Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.departmentName = "Phong Ky thuat";

		Department department4 = new Department();
		department4.id = 4;
		department4.departmentName = "Phong HR";

		Department department5 = new Department();
		department5.id = 5;
		department5.departmentName = "Phong Ke Toan";

//		------------------------------------------------------------

//		Question 1:
//		In ra thông tin của phòng ban thứ 1 (sử dụng toString())
		// Xem toString() Method tai Class Department.

		System.out.println(department1);

//		Question 2:
//			In ra thông tin của tất cả phòng ban (sử dụng toString())

		Department[] departments = { department1, department2, department3, department4, department5 };
		for (Department department : departments) {
			System.out.println(" Thong tin cua phong ban:" + department);
		}

//		Question 3:
//			In ra địa chỉ của phòng ban thứ 1
		System.out.println(department1.hashCode());

//		Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?

		if (department1.departmentName.equals("Phòng A")) {
			System.out.println(" Phong ban thu 1 ten la Phòng A");
		} else {
			System.out.println(" Phong ban thu 1 khong phai Phòng A");
		}

//		Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)

		if (department1.equals(department2)) {
			System.out.println(" bang nhau");
			return;
		} else {
			System.out.println(" ko bang nhau");
		}
		
		
//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		Sale
//		Waiting room
		
		
		String[] deps = { "Accounting", "Marketing", "Sale", "Waiting room", " Boss of director" };
		
		// ?????????
		
//		Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh
//		sách phòng ban được sắp xếp theo tên
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		waiting room
//		Sale
		// ??????????????????
		
		
	}

}
