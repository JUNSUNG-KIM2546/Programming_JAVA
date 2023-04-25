package chap04;

public class Student4_1 {//extends Shape{
	private String dept;
	private int id;

	//소스 => 겟터스 셋터스, 유징 필드
	
//	public Student1() {
//		super("");
//		System.out.println(super.name);
//	}
	
//	public Student1(String dept) {
//		this.dept = dept;
//	}
//
//	public Student1(String dept, int id) {
//		this.dept = dept;
//		this.id = id;
//	}
	
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	// 소스 => 투스트링
	@Override
	public String toString() {
		return "Student1 [dept=" + dept + ", id=" + id + "]";
	} 
	
}	

