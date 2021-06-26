import java.util.Scanner;

public class Position {
	private int id;
	private PositionName positionName;
	
	ScannerUtils sc = new ScannerUtils();
	public Position() {
		System.out.println(" Nhap Position id: ");
		this.id = sc.inputIntPositive();
		System.out.println(" Nhap Position Name: ");
		System.out.println(" Enter 1: DEV; 2: TEST; 3: SCRUM_MASTER; 4: PM");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int chonViTri = scanner.nextInt();
			switch (chonViTri) {
			case 1:
				this.positionName = positionName.DEV;
				return;
			case 2:
				this.positionName = positionName.TEST;
				return;
			case 3:
				this.positionName = positionName.SCRUM_MASTER;
				return;
			case 4:
				this.positionName = positionName.PM;
				return;
			default:
				System.out.println(" Ban phai chon 1 vi tri!");
			}
		}

	}
	
	@Override
	public String toString() {
		
		return " Thong tin Position[ Id: " + this.id + " , Ten vi tri: " + this.positionName + " ]";
	}

}
