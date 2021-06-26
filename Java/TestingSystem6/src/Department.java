import java.util.Scanner;

public class Department {
	public static int COUNT;
	int id;
	String name;
	public Department(String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}
	
	public Department() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap Department id: ");
		this.id = ScannerUtils.inputIntPositive();
		System.out.println(" Nhap Department Name: ");
		this.name = ScannerUtils.inputString();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Thong tin phong ban [ Id: " + id + " Department Name: " + name + " ]";
	}
	

}
