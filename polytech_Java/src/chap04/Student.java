package chap04;

class Student {
	//(�Ӽ�)�ʵ� ����(�������) this�� Ŭ���� �ؿ� �ɹ� 
	String dept;
	int id;
	
	public static void main(String[] args) {
		Student student = new Student();
		student.dept = "SSW";
		student.id = 20230404;
		System.out.println(student.dept + " : " + student.id);
	}
}

// Ŭ������ ���ٽ� �޼ҵ�� �����϶�