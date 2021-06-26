package TestingSystem7;

import java.util.ArrayList;

public class Main {
	static ArrayList<Student> danhSachSV = new ArrayList<Student>();

	public static void main(String[] args) {

		// Static - Question1:
		Student s1 = new Student(1, " Nguyen Van A");
		Student s2 = new Student(2, " Nguyen Van B");
		Student s3 = new Student(3, " Nguyen Van C");
		danhSachSV.add(s1);
		danhSachSV.add(s2);
		danhSachSV.add(s3);
		for (Student sinhVien : danhSachSV) {
			System.out.println(sinhVien);
		}
		Student.change();
		for (Student sinhVien : danhSachSV) {
			System.out.println(sinhVien);
		}

//		// Static - Question2:
//
//		// B1: Tinh tong so quy:
//		float quy = 0;
//		for (Student sinhVien : danhSachSV) {
//			quy = quy + sinhVien.moneyGroup;
//
//		}
//		System.out.println(" Tong so quy la: " + quy);
//		//B2:
//		quy = quy - 50;
//		System.out.println(" Sau khi Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan so quy con lai la: " + quy);
//		
//		//B3:
//		quy = quy - 20;
//		System.out.println(" Sau khi Student thứ 2 lấy 20k đi mua bánh mì, so quy con lai la: " + quy);
//		
//		//B4:
//		quy = quy - 150;
//		System.out.println(" Sau khi Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm,"
//				+ " so quy con lai la: " + quy);
//		// B5:
//		quy = quy + danhSachSV.size()*50;
//		System.out.println(" Sau khi cả nhóm mỗi người lại đóng quỹ mỗi người 50k,"
//				+ " so quy la: " + quy);
		
		
	}

}
