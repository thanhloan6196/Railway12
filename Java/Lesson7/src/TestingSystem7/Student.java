package TestingSystem7;

public class Student {
//	Ex1- Q1:
	int id;
	String name;
	static String college = " Dai hoc Bach Khoa";
	static float moneyGroup = 100;
	static int quyLop = 0;
	
	public Student(int id, String name ) {
		this.id = id;
		this.name = name;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return " Thong tin sinh vien: Id: " + id + " , Name: " + name +
					" Truong dai hoc: " + college;
		}
	
	static void change() {
		college = " Dai hoc cong nghe ";
	}
	
	public static void thembotQuy( float soTien) {
		quyLop += soTien;
		System.out.println(" Tong quy: " + quyLop);
	}
	
}
