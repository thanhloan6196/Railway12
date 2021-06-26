
public class Iphone extends Phone {
	
	private String faceID;
	private String cameraType;

	public Iphone(int id, String loaiDienThoai, String heDieuHanh, Double giaTien, String faceID, String cameraType) {
		super(id, loaiDienThoai, heDieuHanh, giaTien);
		this.faceID = faceID;
		this.cameraType = cameraType;
		System.out.println(" Khoi tao con");
	}

	public String getFaceID() {
		return faceID;
	}

	public void setFaceID(String faceID) {
		this.faceID = faceID;
	}

	public String getCameraType() {
		return cameraType;
	}

	public void setCameraType(String cameraType) {
		this.cameraType = cameraType;
	}
 
}
