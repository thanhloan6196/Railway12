package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Scanner;

import backend.DepartmentDao;

public class Program {
	public static Connection getMyConnection() throws SQLException, ClassNotFoundException {
		return MySQLConnUtils.getMySQLConnection();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = Program.getMyConnection();
		
		// Ex1- Question 1:
		System.out.println("Connect success!");
		
		// Ex1 - Question 2: 
//		getPosition(conn);
		
		// Ex1 - Question 3:
//		getPositionQ3(conn);
		
		//Ex1- Question 4:
//		UpdatePositionQ4(conn);
		
		// Ex1 - Question5:
//		DeletePositionQ5(conn);
		
//		Ex2 - Question1:
//		DepartmentDao.getDepartments(conn);
		
		// Ex2- Question2:
//		DepartmentDao.getDepartmentQ2(conn);
		
		//Ex2 - Question3:
		DepartmentDao.getDepartmentQ3(conn);
		


	}
//	Question 2: 
//		Tạo method để in ra các thông tin của position gồm có id, name
	public static void getPosition(Connection connection) throws SQLException {
		// Create a statement object:
		Statement statement = connection.createStatement();
		// execute SQL query:
		String sql = "SELECT PositionID, PositionName FROM testingsystem3.position";
		ResultSet rs = statement.executeQuery(sql);
		// Handling result set:
		while( rs.next()) {
			int positionID = rs.getInt("PositionID");
			String positionName = rs.getString("PositionName");
			System.out.println("..........................................");
			System.out.println("Position Id: " + positionID);
			System.out.println("Position Name:  " + positionName);
			
		}
		
		// Connection close:
		connection.close();
		
	}
	
//	Question 3:
//		Tạo method để tạo position, user sẽ nhập vào name.
	public static void getPositionQ3(Connection connection) throws SQLException {
		
		// Create a Statement object:
		String sql = "INSERT INTO `position` ( PositionName) VALUE ( ? )";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// input from scanner:
		String positionName = "Accountant";
		// set parameter:
		preparedStatement.setString(1, positionName);
		//Excute SQL query:
		int effectedRecordAmount = preparedStatement.executeUpdate();
		// Handling Result set:
		System.out.println(" Effected record Amount: " + effectedRecordAmount);
		//Close connection:
		connection.close();
	}
	
//	Question 4:
//		Tạo method để update tên của position gồm có id = 5 thành "Dev".
	public static void UpdatePositionQ4(Connection connection) throws SQLException{
		// create a statement object:
		String sql = "UPDATE `position` SET PositionName = ?  WHERE PositionID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		//input from scanner:
		String positionName = "Dev";
		int positionID = 5;
		
		//set parameter
		preparedStatement.setString(1, positionName);
		preparedStatement.setInt(2, positionID);
		
		//Execute SQL query:
		int effectedRecordAmoumt = preparedStatement.executeUpdate();
		//Handling result set:
		System.out.println(" Effected Record Amount: " + effectedRecordAmoumt);
		//Close connection:
		connection.close();
		
	}
	
//	Question 5:
//		Tạo method để delete của position theo id và user sẽ nhập vào id
	
	public static void DeletePositionQ5(Connection connection) throws SQLException{
		// create a statement object:
		String sql = "DELETE FROM `position` WHERE PositionID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		//input from scanner:
		Scanner sc = new Scanner(System.in);	
		System.out.println(" Nhap vao PositionID muon xoa: ");
		int positionID = sc.nextInt();
		
		//set parameter
		preparedStatement.setInt(1, positionID);
		
		//Execute SQL query:
		int effectedRecordAmoumt = preparedStatement.executeUpdate();
		//Handling result set:
		System.out.println(" Effected Record Amount: " + effectedRecordAmoumt);
		//Close connection:
		connection.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void getGroup(Connection connection) throws SQLException {
		// Tạo đối tượng Statement:
		Statement statement = connection.createStatement();
		
			
		String sql = "SELECT id, username, email, firstName, lastName, gender, date_Of_Birth, address, phone FROM testingsystem.user ";
		

//		// Tạo một đối tượng PreparedStatement.
//		 PreparedStatement pstm = connection.prepareStatement(sql);
//
//		// Sét đặt giá trị tham số thứ nhất (Dấu ? thứ nhất)
//		 pstm.setString(1, "B%");
//		 pstm.setString(2, "l%");
//		 ResultSet rs = pstm.executeQuery();
//		
		
		ResultSet rs = statement.executeQuery(sql);
		// Duyet ket qua tra ve:
		while (rs.next()) {
			// Di chuyen con tro xuong ban ghi ke tiep.
			int Id = rs.getInt("id");
			String userName = rs.getString("username");
			String email= rs.getString("email");
			String firstName= rs.getString("firstName");
			String lastName= rs.getString("lastName");
			String gender= rs.getString("gender");
			String date_Of_Birth= rs.getString("date_Of_Birth");
			String address= rs.getString("address");
			String phone = rs.getString("phone");
			System.out.println("..........................................");
			System.out.println(" User Name: " + userName);
			System.out.println(" Email: " + email);
			System.out.println(" First Name: " + firstName);
			System.out.println(" Last name: " + lastName);
			System.out.println(" Gioi tinh: " + gender);
			System.out.println(" Ngay sinh: " + date_Of_Birth);
			System.out.println(" Address: " + address);
			System.out.println(" Phone: " + phone);
			
		}

	}

}
