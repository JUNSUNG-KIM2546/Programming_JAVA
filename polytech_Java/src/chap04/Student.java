package chap04;

class Student {
	//(속성)필드 선언(멤버변수) this는 클래스 밑에 맴버 
	String dept;
	int id;
	
	public static void main(String[] args) {
		Student student = new Student();
		student.dept = "SSW";
		student.id = 20230404;
		System.out.println(student.dept + " : " + student.id);
	}
}

// 클래스를 접근시 메소드로 접근하라