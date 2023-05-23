package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class DBConnect_1 {
	
	// 0. JDBC Driver, URL, 아이디, 비밀번호 설정
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String url= "jdbc:mysql://localhost:3305/mydb";
	static String id = "root";
	static String pw = "root";
	
	static Vector<Test> Vtest = null;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		Vtest = new Vector<Test>();
		Test t = null;
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("이름과 이메일(콤마로 구분) >> ");
		
		// 이름(name)과 이메일(email)로 분류
//		String[] line = scan.nextLine().split(",");
//		String name = line[0].trim();
//		String mail = line[1].trim();
//		t.setUname(name);
//		t.setEmail(mail);
		
		// 0. JDBC Driver, URL, ID, PW 설정
		// 0. SQL 문 정의
//		String sql = "INSERT INTO test VALUES (? , ?)";
		String sql = "SELECT * FROM test";	//테이블 조회
		
		// DB 연결에 필요한 객체 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// 1. JDBC 드라이버 로드
		Class.forName(jdbcDriver);	//ClassNotFoundException
			
		// 2. Connection 연결
		con = DriverManager.getConnection(url, id, pw);
			
		// 3. PrepareStatement 준비
		pstmt = con.prepareStatement(sql);	//SQLException
//		pstmt.setString(1, t.getUname());
//		pstmt.setString(2, t.getEmail());
			
		// 4. SQL 전송 : executeQuery(조회)-ResultSet, executeUpdate(삽입, 삭제, 수정)-int
//		if (pstmt.executeUpdate() == 0) {
//			System.out.println("실패");
//		}	
//		else {
//			System.out.println("성공");
//		}
		
		// 5. ResultSet으로 Transaction 처리
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			t = new Test();	//매번 새로운 값을 t에 넣어라 선언(new)
			System.out.println(rs.getString("uname") + ", " + rs.getString("email"));
			t.setUname(rs.getString("uname"));
			t.setEmail(rs.getString("email"));
			Vtest.add(t);	// t값을 벡터에 넣어라
			for(Test tt : Vtest ) {
				System.out.println(tt);
			}
		}
		
		System.out.println("Vector에 들어가있는 값 ===================");
		// 6. Vector 내용 출력
		for(Test tt : Vtest) {
			System.out.println(tt.getUname() + ", " + tt.getEmail());
		}
		
		pstmt.close();
		con.close();
		
	}
}
