package TestingSystem8.Exercise1_2_3;

import java.time.LocalDate;

public class StudentEx2 extends Student implements Comparable<Student>{
	private LocalDate ngaySinh;
	private float diem;
	

	public StudentEx2(int id, String name, LocalDate ngaySinh, float diem ) {
		super(id, name);
		this.ngaySinh = ngaySinh;
		this.diem = diem;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " Ngay sinh: " + ngaySinh + " Diem: " + diem;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public float getDiem() {
		return diem;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}


}
