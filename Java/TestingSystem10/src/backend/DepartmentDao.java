package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DepartmentDao {

//	Exercise 2: CRUD
//	Tạo class DepartmentDao trong package backend để cung cấp các method
//	chuyên thao tác với table Department trong database. (các method cụ thể ở
//	question bên dưới)

	// Question 1: read data – get list departments
	// Tạo method để lấy ra danh sách tất cả các Department

	public static void getDepartments(Connection connection) throws SQLException {
		// Create a statement object:
		Statement statement = connection.createStatement();

		// execute query:
		String sql = " SELECT DepartmentID, DepartmentName FROM testingsystem3.department";
		ResultSet rs = statement.executeQuery(sql);

		// Handling result set:
		while (rs.next()) {
			System.out.println("......................................");
			System.out.println(" Department Id: " + rs.getInt("DepartmentID"));
			System.out.println(" Department Name: " + rs.getString("DepartmentName"));

		}
		// Close connection:
		connection.close();
	}

//	Question 2: read data – get department by id
//	Tạo method để lấy ra Department có id = 5
	public static void getDepartmentQ2(Connection connection) throws SQLException {
		// Create a statement object:
		Statement statement = connection.createStatement();

		// execute query:
		String sql = " SELECT DepartmentID, DepartmentName " + "FROM testingsystem3.department WHERE DepartmentID = 5";
		ResultSet rs = statement.executeQuery(sql);

		if (rs.next()) {
			Department dep = new Department();
			int departmentId = rs.getInt("DepartmentID");
			String departmentName = rs.getString("DepartmentName");
			dep.setDepartmentId(departmentId);
			dep.setDepartmentName(departmentName);
			System.out.println(dep);
		} else {
			throw new SQLException("Cannot find department which has id = 5");
		}

		// Close connection:
		connection.close();

	}

	// Question 3: Tiếp tục Question 2 (read data – get department by id)
	// Không fix cứng id nữa mà sẽ dùng scanner để yêu cầu người dùng
	// nhập vào id, sau đó trả về thông tin department có id như người dùng
	// nhập vào

	public static void getDepartmentQ3(Connection connection) throws SQLException {
		// Create a statement object:

		String sql = " SELECT DepartmentID, DepartmentName FROM testingsystem3.department WHERE DepartmentID = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// input from scanner:
		Scanner sc = new Scanner(System.in);
		System.out.println(" Moi ban nhap id cua phong ban muon tim kiem: ");
		int id = sc.nextInt();
		
		// set parameter:
		preparedStatement.setInt(1, id);
		
		// Execute query:
		ResultSet rs = preparedStatement.executeQuery(sql);
		
		// Handling result set:
		if (rs.next()) {
			Department dep = new Department();
			dep.setDepartmentId(rs.getInt("DepartmentID "));
			dep.setDepartmentName(rs.getString("DepartmentName"));
			System.out.println(dep);
		} else {
			throw new SQLException("Cannot find department which has id =" + id);
		}

		// Close connection:
		connection.close();

	}

}
