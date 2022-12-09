package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public StudentDB() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		System.out.println("접속완료");
	}


	
	public void selectAll() throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student");
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String hakbun = rs.getString("hakbun");
			String address = rs.getString("address");
			System.out.printf("[%d] %s %s %s\n", id, name, hakbun, address);
		}
	}
	
	
	public void insert(String name, String hakbun, String address) throws SQLException {
		stmt = conn.createStatement();
		int result2 = stmt.executeUpdate("insert into student values(0,'"+ name +"','"+ hakbun +"','"+ address + "')");
	}
	
	public void delete(String name) throws SQLException{
		stmt = conn.createStatement();
		int result = stmt.executeUpdate("delete from student where name = '" + name + "'");
		System.out.printf("%s의 자료를 %d건 삭제", name, result);


	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDB sd = new StudentDB();
		sd.delete("유건의");
		sd.selectAll();
		
	}

}
