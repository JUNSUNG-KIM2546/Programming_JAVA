package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DBConnect {
	
	// 0. JDBC Driver, URL, 아이디, 비밀번호 설정
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String url= "jdbc:mysql://localhost:3305/mydb";
	static String id = "root";
	static String pw = "root";
	
	public static void main(String[] args) throws SQLException{
			
		// 0. JDBC Driver, URL, ID, PW 설정
		// 0. SQL 문 정의
		String sql = "INSERT INTO user VALUES (? , ?)";
		
		// DB 연결에 필요한 객체 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. JDBC 드라이버 로드
			Class.forName(jdbcDriver);
			
			// 2. Connection 연결
			con = DriverManager.getConnection(url, id, pw);
			
			// 3. PrepareStatement 준비
			pstmt = con.prepareStatement(sql);	//SQLException
			pstmt.setString(1, "jun");
			pstmt.setString(2, "jun@naver.com");
			
			// 4. SQL 전송 : executeQuery(조회)-ResultSet, executeUpdate(삽입, 삭제, 수정)-int
			if (pstmt.executeUpdate() == 0) {
				System.out.println("실패");
			}
			
			else {
				System.out.println("성공");
			}
			
		} 
		
		catch (ClassNotFoundException e) {
			
			System.out.println("찾을수 없습니다.");
			e.printStackTrace();
		}
		
		catch (SQLException e) {
			
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		
		finally {
			pstmt.close();
			con.close();
		}
	}
}
