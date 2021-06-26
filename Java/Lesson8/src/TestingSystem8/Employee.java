package TestingSystem8;

import java.util.Arrays;

public class Employee<T extends Number> {
	public static int count = 0;
	private int id;
	private String name;
	private T[] salaries;
	
	public Employee(String name, T[] salaries ) {
		this.id = ++count;
		this.name = name;
		this.salaries = salaries;
	}
	
	@Override
	public String toString() {
		
		return " Thong tin nhan vien: Id: " + id + " , Ten nhan vien: " + name
				+ " , Luong thang: " + Arrays.toString(salaries);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getSalaries() {
		return salaries;
	}

	public void setSalaries(T[] salaries) {
		this.salaries = salaries;
	}
	
	
}
