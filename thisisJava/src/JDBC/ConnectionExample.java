package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class ConnectionExample {
	
	public ConnectionExample() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 연결");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mysql");
			System.out.println("디비연결");
			
			String sql = "insert into winter values(?, ?, ?, ?, ?)";
			PreparedStatement stat = conn.prepareStatement(sql);
			
			stat.setString(1, "desk");
			stat.setString(2, "안동현");
			stat.setString(3, "1234");
			stat.setInt(4, 30);
			stat.setString(5, "dehdg@naver.com");
			
			int row = stat.executeUpdate();
			
			System.out.println(row);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ConnectionExample();
	}

}
