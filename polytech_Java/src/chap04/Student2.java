package chap04;

public class Student2 {
	//(속성)필드 선언(멤버변수) this는 클래스 밑에 맴버 
	private String name;	//private를 달아 접근제한 (클래스 내부에서만)
	private int age;
	private int id;
	
	
	//행위 (메소드)
	//생성자 메소드
	public Student2() {}
	public Student2(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}


	//일반 메소드
	//다형성 : 오버로딩(OverLoading)
	void study() {
		System.out.println("공부합니다.");
	}
	
	void study(String test) {
		System.out.println(test + "공부를 합니다.");
	}
	
	void eat() {
		System.out.println("먹습니다.");
	}
	
	void eat(String meat) {
		System.out.println(meat + "고기를 먹습니다.");
	}
	
	void sleep() {
		System.out.println("잡니다.");
	}
	
	boolean test(String test, int score) {
		System.out.println(test + "시험을 봤군요!");
		if (score >= 60)	return true;
		else				return false;
	}
	
	
	//getters & setters		//private 불러오기
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	//main 메소드
	public static void main(String[] args) {
		Student2 student = new Student2();	//객체명 선언, 공간 확보(위에서 선언한 코드를 사용하기 위해) 
		student.study();
		if (student.test("정보처리산업기사", 80))
		 	System.out.println("합격하셨습니다.");
		else
			System.out.println("불합격하셨습니다.");
		
		student.eat();
		student.eat("불");
	}
	
}

// 클래스를 접근시 메소드로 접근하라