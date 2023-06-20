package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DBConnect {
	
	// 0. JDBC Driver, URL, ���̵�, ��й�ȣ ����
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String url= "jdbc:mysql://localhost:3305/mydb";
	static String id = "root";
	static String pw = "root";
	
	public static void main(String[] args) throws SQLException{
			
		// 0. JDBC Driver, URL, ID, PW ����
		// 0. SQL �� ����
		String sql = "INSERT INTO user VALUES (? , ?)";
		
		// DB ���ῡ �ʿ��� ��ü ����
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. JDBC ����̹� �ε�
			Class.forName(jdbcDriver);
			
			// 2. Connection ����
			con = DriverManager.getConnection(url, id, pw);
			
			// 3. PrepareStatement �غ�
			pstmt = con.prepareStatement(sql);	//SQLException
			pstmt.setString(1, "jun");
			pstmt.setString(2, "jun@naver.com");
			
			// 4. SQL ���� : executeQuery(��ȸ)-ResultSet, executeUpdate(����, ����, ����)-int
			if (pstmt.executeUpdate() == 0) {
				System.out.println("����");
			}
			
			else {
				System.out.println("����");
			}
			
		} 
		
		catch (ClassNotFoundException e) {
			
			System.out.println("ã���� �����ϴ�.");
			e.printStackTrace();
		}
		
		catch (SQLException e) {
			
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
		
		finally {
			pstmt.close();
			con.close();
		}
	}
}
