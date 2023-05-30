package miniproject_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	// 0. JDBC Driver, URL, ���̵�, ��й�ȣ ����
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String url= "jdbc:mysql://localhost:3305/mydb";
	static String id = "root";
	static String pw = "root";
	Product p;	//��ǰ������ ���� ��ü
	static ArrayList<Product> product_list = null;
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	// DB ���� �޼���
	public void connectDB() throws Exception {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(url, id, pw);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB ���� �޼���
	public void closeDB() {
		try {
			pstmt.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// ��ǰ ���� ���� : CRUD
	//===============================================//
	// ��ü Product ����Ʈ�� ������ ArrayList�� ����(��ü��ȸ)
	public ArrayList<Product> getAll() {}
	
	// �Ķ���Ϳ��� pcode�� �ش��ϴ� ��ǰ�� ����(�Ϻ���ȸ)
	public Product getProduct(int pcode) {
		//1. DB����
		connectDB();
		//2. pstmt�� SQL�� Ȱ���ؼ�, executeQuery
		sql = "select * from product where pcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pcode);
			rs = pstmt.executeQuery();
			rs.next();
			
			//todo : CellPhone �Ǵ� SmartTV�� �з��ؼ� ���� �־��־�� �Ѵ�.
			p = new SmartTV();
			p = new CellPhone();
			
			p.setPcode(rs.getInt("pcode"));
			p.setPname(rs.getString("pname"));
			p.setPrice(rs.getInt("price"));
			p.setMf(rs.getString("mf"));
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		//3. DB����
		finally {
		closeDB();
		}
		
		return p;}
	
	// Prodect ��ü ������ DB ����(insert)
	public boolean newProduct(Product product) throws Exception {
		//1. DB����
		connectDB();
		//2. pstmt�� SQL�� Ȱ���ؼ�, executeUpdate �޼ҵ� Ȱ���Ͽ� insert
		sql = "insert into product(pname, price, mf) values(?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getPname());
			pstmt.setInt(2, product.getPrice());
			//pstmt.setString(3, product.getMf());
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		//3. DB����
		finally {
		closeDB();
		}
		
		return true;
	}
	
	// Prodect ��ü���� pcode�� �ش��ϴ� ��ü�� DB���� ����(delete)
	public boolean delProduct(int pcode) {
		//1. DB����
		connectDB();
		//2. pstmt�� SQL�� Ȱ���ؼ�, executeUpdate �޼ҵ� Ȱ���Ͽ� insert
		sql = "delete from product where pcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pcode);
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		//3. DB����
		finally {
		closeDB();
		}
				
		return true;
	}
	
	// Prodect ��ü�� ������ ������Ʈ(update)
	public boolean updateProduct(Product product) {
		//1. DB����
		connectDB();
		//2. pstmt�� SQL�� Ȱ���ؼ�, executeUpdate �޼ҵ� Ȱ���Ͽ� insert
		sql = "update product set pname=?, price=?, mf=? where pcode =?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getPname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getMf());
			pstmt.setInt(4, product.getPcode());
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		//3. DB����
		finally {
		closeDB();
		}
		
		return true;}
	
}
