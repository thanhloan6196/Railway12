import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		SinhVien sv1 = new SinhVien(111, " Thong");
		SinhVien sv2 = new SinhVien(222, " Minh");
//		sv1.display();
//		sv2.display();
//		
//		Counter c1 = new Counter();
//		Counter c2 = new Counter();
//		Counter c3 = new Counter();
		
// 		Neu de static => ra 1, 2,3 
// 		Neu ko de static => ra 1, 1, 1.
		
		// Check file co ton tai khong
//		File file = new File("D:\\Lesson7\\demo.txt");
//		if ( file.exists()) {
//			System.out.println(" file ton tai");
//		} else {
//			System.out.println(" File khong ton tai");
//		}
//		
		// Tao moi file:
//		File file1 = new File("D:\\Lesson7\\newFile.txt");
//		if (file1.createNewFile()) {
//			System.out.println(" tao moi thanh cong");
//		} else {
//			System.out.println(" error");
//		}
		
		// check path:
		
//		File file3 = new File("D:\\lesson7\\newFile");
//				if(file3.isDirectory()) {
//					System.out.println(" Day la folder");
//				} else {
//					System.out.println(" Day la file");
//				}
				
		// list file:
//		File file2 = new File("D:\\lesson7");
//		for (String fileName : file2.list()) {
//			System.out.println(fileName);
//		}
		
		// File IO:
//		FileInputStream inputStream = null;
//		FileOutputStream outputStream = null;
//		try {
//			String addtext = " Toi la ai day la dau";
//			inputStream = new FileInputStream("D:\\Lesson7\\demo.txt");
//			outputStream = new FileOutputStream("D:\\Lesson7\\outStream.txt", false); // ghi de file cũ. Neu de true là  cộng tiếp file cũ.
//			System.out.println(" noi dung file: ");
//			int ch;
//			while ((ch = inputStream.read()) != -1) {
//				System.out.print((char) ch);
//				outputStream.write(ch);
//				
//			}
//			outputStream.write(addtext.getBytes());
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if( inputStream !=null) {
//					inputStream.close();
//				}
//				if ( outputStream != null) {
//					outputStream.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		// read and write object
		FileOutputStream fileOut = new FileOutputStream("D:\\lesson7\\obj.ser");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		objectOut.writeObject(sv1);
		objectOut.close();
		
		FileInputStream fileIn = new FileInputStream("D:\\lesson7\\obj.ser");
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);
		try {
			Object obj = objectIn.readObject();
			SinhVien sv = (SinhVien) obj;
			sv.display();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			objectIn.close();
		}
		
				
		
	}

}
