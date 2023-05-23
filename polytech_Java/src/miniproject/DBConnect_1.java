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
	
	// 0. JDBC Driver, URL, ���̵�, ��й�ȣ ����
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String url= "jdbc:mysql://localhost:3305/mydb";
	static String id = "root";
	static String pw = "root";
	
	static Vector<Test> Vtest = null;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		Vtest = new Vector<Test>();
		Test t = null;
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�̸��� �̸���(�޸��� ����) >> ");
		
		// �̸�(name)�� �̸���(email)�� �з�
//		String[] line = scan.nextLine().split(",");
//		String name = line[0].trim();
//		String mail = line[1].trim();
//		t.setUname(name);
//		t.setEmail(mail);
		
		// 0. JDBC Driver, URL, ID, PW ����
		// 0. SQL �� ����
//		String sql = "INSERT INTO test VALUES (? , ?)";
		String sql = "SELECT * FROM test";	//���̺� ��ȸ
		
		// DB ���ῡ �ʿ��� ��ü ����
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// 1. JDBC ����̹� �ε�
		Class.forName(jdbcDriver);	//ClassNotFoundException
			
		// 2. Connection ����
		con = DriverManager.getConnection(url, id, pw);
			
		// 3. PrepareStatement �غ�
		pstmt = con.prepareStatement(sql);	//SQLException
//		pstmt.setString(1, t.getUname());
//		pstmt.setString(2, t.getEmail());
			
		// 4. SQL ���� : executeQuery(��ȸ)-ResultSet, executeUpdate(����, ����, ����)-int
//		if (pstmt.executeUpdate() == 0) {
//			System.out.println("����");
//		}	
//		else {
//			System.out.println("����");
//		}
		
		// 5. ResultSet���� Transaction ó��
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			t = new Test();	//�Ź� ���ο� ���� t�� �־�� ����(new)
			System.out.println(rs.getString("uname") + ", " + rs.getString("email"));
			t.setUname(rs.getString("uname"));
			t.setEmail(rs.getString("email"));
			Vtest.add(t);	// t���� ���Ϳ� �־��
			for(Test tt : Vtest ) {
				System.out.println(tt);
			}
		}
		
		System.out.println("Vector�� ���ִ� �� ===================");
		// 6. Vector ���� ���
		for(Test tt : Vtest) {
			System.out.println(tt.getUname() + ", " + tt.getEmail());
		}
		
		pstmt.close();
		con.close();
		
	}
}
