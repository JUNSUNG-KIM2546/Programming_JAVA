package midproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class ProductDAO {
	// driver, dburl, id, pw
	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static String url= "jdbc:mysql://localhost:3305/mydb";
	static String id = "root";
	static String pw = "root";
	
	// conn, pstmt, rs, sql
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	// ArrayList<product> 에 상품 정보를 모두 넣음
	ArrayList<Product> datas = null;
	Vector<String> items = new Vector<String>();
	
	// connectDB : DB 연결
	public void connectDB() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(url, id, pw);
		}
			
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// closeDB : DB 종료
	public void closeDB() {
		try {
			pstmt.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// newProduct : 상품 등록 기능
	public boolean newProduct(Product product){
		connectDB();
		sql = "INSERT INTO product(prname, price, manufacture) VALUES (?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getPrname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getManufacture());
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			closeDB();
		}
		return true;
		
	}
	
	// delProduct : 상품 삭제 기능
	public boolean delProduct(int prcode) {
		connectDB();
		sql = "DELETE FROM product WHERE prcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, prcode);
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			closeDB();
		}
		return true;
	}
	
	// updateProduct : 상품 정보 업데이트
	public boolean updateProduct(Product product) {
		connectDB();
		sql = "UPDATE product SET prname = ?, price= ?, manufactore = ? WHERE prcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getPrname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getManufacture());
			pstmt.setInt(4, product.getPrcode());
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			closeDB();
		}
		return true;
	}
	
	// getItems : prcode 리스트를 조회하는 기능
	public Vector<String> getItems() {
		return items;
	}
	
	// getAll : 전체 정보를 조회하는 가능
	public ArrayList<Product> getAll() {
		connectDB();
		sql = "SELECT * FROM product";
		
		// 전체 검색 데이터를 전달하는 ArrayList
		ArrayList<Product> datas = new ArrayList<Product>();
		
		// 관리번호 콤보박스 데이터를 위한 Vector 초기화
		//Vector<String> items = new Vector<String>();
		items.add("전체");
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Product product = new Product(); 
				product.setPrcode(rs.getInt("prcode"));
				product.setPrname(rs.getString("prname"));
				product.setPrice(rs.getInt("price"));
				product.setManufacture(rs.getString("manufacture"));
				datas.add(product);						// 전체상품 목록
				items.add(String.valueOf(rs.getInt("prcode")));	// tobo for GUI 콤보박스내의 목록
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			closeDB();
		}
		return datas;	//디비 내용이 있는
	}
	
	// getProduct : 상품코드로 상품 정보를 조회하는 기능
	public Product getProduct(int prcode) {
		connectDB();
		Product product = null; 
		
		sql = "SELECT * FROM product WHERE prcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, prcode);
			rs = pstmt.executeQuery();
			rs.next();	//검색결과 한줄 가져오기
			product = new Product();
			product.setPrcode(rs.getInt("prcode"));
			product.setPrname(rs.getString("prname"));
			product.setPrice(rs.getInt("price"));
			product.setManufacture(rs.getString("manufacture"));
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			closeDB();
		}
		return product;
	}
	
}
