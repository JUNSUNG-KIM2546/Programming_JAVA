package miniproject_db;

public class User {
	int uid;
	String name;
	PayType paytype;
	
	public User(int uid, String name, PayType paytype) {
		super();
		this.uid = uid;
		this.name = name;
		this.paytype = paytype;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PayType getPaytype() {
		return paytype;
	}
	public void setPaytype(PayType paytype) {
		this.paytype = paytype;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", paytype=" + paytype + "]";
	}
	
}
