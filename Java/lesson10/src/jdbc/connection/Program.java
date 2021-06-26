package jdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	public static Connection getMyConnection() throws SQLException, ClassNotFoundException {
		return MySQLConnUtils.getMySQLConnection();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(" Get connection ... ");

		// Lay ra doi tuong connection ket noi vao database
		Connection conn = Program.getMyConnection();
		getHocSinh(conn);
		conn.close();

	}

	public static void getHocSinh(Connection connection) throws SQLException {
		// Tạo đối tượng Statement:
		Statement statement = connection.createStatement();
			
		String sql = "SELECT mhs, hoTen, email, tuoi, sdt, doiTuyenHocSinhGioi, "
		 		+ "diemTrungBinh, ngayMoiPhuHuynh, diemThapNhat FROM hocsinh "
		 		+ "where hoTen LIKE ? AND email LIKE ? ";

		// Tạo một đối tượng PreparedStatement.
		 PreparedStatement pstm = connection.prepareStatement(sql);

		// Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)
		 pstm.setString(1, "B%");
		 pstm.setString(2, "l%");
		 ResultSet rs = pstm.executeQuery();
		
		
//		ResultSet rs = statement.executeQuery(sql);
		// Duyet ket qua tra ve:
		while (rs.next()) {
			// Di chuyen con tro xuong ban ghi ke tiep.
			int mhs = rs.getInt("mhs");
			String hoTen = rs.getString("hoTen");
			String email = rs.getString("email");
			int tuoi = rs.getInt("tuoi");
			String sdt = rs.getString("sdt");
			System.out.println("......................");
			System.out.println(" Ma hoc sinh: " + mhs);
			System.out.println(" Ho ten : " + hoTen);
			System.out.println(" Email: " + email);
			System.out.println(" Tuoi: " + tuoi);
			System.out.println(" SDT: " + sdt);
		}

	}

}
