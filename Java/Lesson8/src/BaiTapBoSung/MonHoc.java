package BaiTapBoSung;

public enum MonHoc {
	TOAN("toan"), LY("Ly"), HOA("Hoa");
	
	String monHoc;
	MonHoc(String monHoc) {
		this.monHoc = monHoc;
	}
	public static MonHoc fromValue( String monHoc) {
		for (MonHoc category : values()) {
			if (category.monHoc.equalsIgnoreCase(monHoc)) {
				return category;
			}
		}
		throw new IllegalArgumentException("Khong phai loai ENUM tuong ung");
	}
	
	
	
}
