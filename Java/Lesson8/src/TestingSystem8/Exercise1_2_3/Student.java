package TestingSystem8.Exercise1_2_3;

public class Student<T extends Number> {
	private T id;
	private String name;
	
	public Student(T id, String name ) {
		this.id = id;
		this.name = name;
	}
	
	public Student(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Id: " + id + ", Name: " + name;
	}

	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(StudentEx2 o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
