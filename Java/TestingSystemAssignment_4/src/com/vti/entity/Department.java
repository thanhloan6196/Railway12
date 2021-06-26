package vti.com.vn;

public class Department {
	int id;
	String departmentName;
	
	// -----Ex1 - Q1--------
	//a, Constructor ko co parameter:
	public Department() {
		
	}
	// b, Có 1 parameter là nameDepartment và default id của
	// Department = 0
	public Department( String departmentName) {
			this.id = 0;
			this.departmentName = departmentName;
		}
	
	@Override
	public String toString() {
		String result = "";
		result += "Id: " + id + " Name: " + departmentName;
		return result;
	}
}
