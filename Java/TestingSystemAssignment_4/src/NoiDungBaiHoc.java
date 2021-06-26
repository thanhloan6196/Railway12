
public class NoiDungBaiHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone(1, "note 10", "Android", 2000000d );
//		phone.id = 1;
//		phone.heDieuHanh = "Android";
//		phone.loaiDienThoai = "note 10";
//		phone.giaTien = 2000000d;
		
		System.out.println( phone.getId() + " " + phone.getHeDieuHanh()  + " " + phone.getLoaiDienThoai() + " " + phone.getGiaTien());
		System.out.println(phone);
		
		phone.setHeDieuHanh("iOS");
		
		phone.setGiaTien(500000d);
		System.out.println( phone.getId() + " " + phone.getHeDieuHanh()  + " " + phone.getLoaiDienThoai() + " " + phone.getGiaTien());
		
		Iphone iphone = new Iphone(0, " IPhone 12", "IOS", 200000000d, "3adfafhh", " 3 camera");
		System.out.println( iphone.getId() + " " + iphone.getHeDieuHanh()  + " " + iphone.getLoaiDienThoai() + " " + iphone.getGiaTien()
		+ iphone.getFaceID() + " " + iphone.getCameraType());

	}

}

