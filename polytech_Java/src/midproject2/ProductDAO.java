package midproject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class ProductDAO {
	// driver, dburl, id, pw 
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost:3305/mydb";
	String id = "root";
	String pw = "1234";
	
	// conn, pstmt, rs, sql
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	// ArrayList �� ��ǰ ������ ��� ����
	ArrayList<Product> datas = new ArrayList<Product>();
	Vector<String> items = new Vector<String>();
	
	// connectDB : DB ����
	public void connectDB() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, id, pw);			
		}
		catch(Exception e) {e.printStackTrace();}		
	}
	
	// closeDB : DB ����
	public void closeDB() {
		try {
			pstmt.close();
			conn.close();
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
	// newProduct : ��ǰ ��� ��� 
	public boolean newProduct(Product product) {
		connectDB();
		sql = "insert into product(prname, price, manufacture) values (?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  product.getPrname());
			pstmt.setInt(2,  product.getPrice());
			pstmt.setString(3,  product.getManufacture());
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
	
	// delProduct : ��ǰ ���� ��� 
	public boolean delProduct(int prcode) {
		connectDB();
		sql = "delete from product where prcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);			
			pstmt.setInt(1,  prcode);
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
	
	// updateProduct : ��ǰ���� ������Ʈ ��� 
	public boolean updateProduct(Product product) {
		connectDB();
		sql = "update product set prname=?, price=?, manufacture=? where prcode=?";
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
	
	// getItems : procode ����Ʈ�� ��ȸ�ϴ� ���
	public Vector<String> getItems(){return items;}
	
	// getAll : ��ü ������ ��ȸ�ϴ� ��� 
	public ArrayList<Product> getAll(){
		connectDB();
		sql = "select * from product";		
		items.add("��ü");
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setPrcode(rs.getInt("prcode"));
				product.setPrname(rs.getString("prname"));
				product.setPrice(rs.getInt("price"));
				product.setManufacture(rs.getString("manufacture"));
				datas.add(product);						//��ü��ǰ ���
				items.add(String.valueOf(rs.getInt("prcode"))); 	//todo for �޺��ڽ����� ���
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
			}
		finally {
			closeDB();
		}
		return datas;
	}
		
	// getProduct : ��ǰ�ڵ�� ��ǰ ������ ��ȸ�ϴ� ��� 
	public Product getProduct(int prcode) {
		connectDB();
		Product product = null;	
		sql = "select * from product where prcode = ?";		
		try {
			pstmt = conn.prepareStatement(sql);			
			pstmt.setInt(1, prcode);
			rs = pstmt.executeQuery();
			rs.next();
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
