

public class Student<T> {
	static int COUNT = 0;
	T id;
	String name;
	
	public Student() {
		
	}
//	public Student(String name) {
//		this.id = ++COUNT;
//		this.name = name;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Id: " + id + ", Ten: " + name;
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
