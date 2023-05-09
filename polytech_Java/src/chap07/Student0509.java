package chap07;

public class Student0509 {

	private int id;
	private String tel;
	
	public Student0509(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "아이디:" + id + ", 전화:" + tel;
	}

		

}
