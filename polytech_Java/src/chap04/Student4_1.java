package chap04;

public class Student4_1 {//extends Shape{
	private String dept;
	private int id;

	//�ҽ� => ���ͽ� ���ͽ�, ��¡ �ʵ�
	
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

	// �ҽ� => ����Ʈ��
	@Override
	public String toString() {
		return "Student1 [dept=" + dept + ", id=" + id + "]";
	} 
	
}	

