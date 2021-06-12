
public class Department {
	int id;
	String departmentName;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "";
		 result = result + "id: " + id + " Name: " + departmentName;
		 return result;
	}
		 
	public boolean equals(Department department) {
		if ( department == null) return false;
		if (departmentName.equals(department.departmentName) ) {
			return true;
		}
		return false;
		 }
	

	}


