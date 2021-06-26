package com.vti.entity.Encapsulation;

// Ex4- Question1: 
public class Student {
	
//	a) Tất cả các property sẽ để là private để các class khác không
//	chỉnh sửa hay nhìn thấy
	private int id;
	private String name;
	private String hometown;
	private float diemHocLuc;
	
	public Student() {
		
	}
	
//	b) Tạo constructor cho phép khi khởi tạo mỗi student thì người
//	dùng sẽ nhập vào tên, hometown và có điểm học lực = 0
	
	public Student( String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.diemHocLuc = (float) 0;
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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public float getDiemHocLuc() {
		return diemHocLuc;
	}
	// c.Tao 1 method cho phep set diem vao:
	public void setDiemHocLuc(float diemHocLuc) {
		this.diemHocLuc = diemHocLuc;
	}
	
	//d. Tao mot method cho phep cong them diem
	public void setDiemCong(float diemCong) {
		this.diemHocLuc += diemCong;
	}
	
//	e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên,
//	điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm >
//	4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0
//	thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
	
	public String toString(){
		String rank;
		if(this.diemHocLuc < 4 ) {
			rank = " yeu";
		} else if ( this.diemHocLuc < 6) {
			rank = " TB";
		} else if ( this.diemHocLuc < 8) {
			rank = " Kha";
		} else {
			rank = " Gioi";
		}
		String result = " Ten sinh vien: " + name + " Que quan: " + hometown + " Diem hoc luc: " + diemHocLuc
				+ " Hoc luc: " + rank;
		return result;
	}

}
