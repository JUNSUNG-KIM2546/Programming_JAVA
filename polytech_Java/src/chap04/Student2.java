package chap04;

public class Student2 {
	//(�Ӽ�)�ʵ� ����(�������) this�� Ŭ���� �ؿ� �ɹ� 
	private String name;	//private�� �޾� �������� (Ŭ���� ���ο�����)
	private int age;
	private int id;
	
	
	//���� (�޼ҵ�)
	//������ �޼ҵ�
	public Student2() {}
	public Student2(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}


	//�Ϲ� �޼ҵ�
	//������ : �����ε�(OverLoading)
	void study() {
		System.out.println("�����մϴ�.");
	}
	
	void study(String test) {
		System.out.println(test + "���θ� �մϴ�.");
	}
	
	void eat() {
		System.out.println("�Խ��ϴ�.");
	}
	
	void eat(String meat) {
		System.out.println(meat + "��⸦ �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("��ϴ�.");
	}
	
	boolean test(String test, int score) {
		System.out.println(test + "������ �ñ���!");
		if (score >= 60)	return true;
		else				return false;
	}
	
	
	//getters & setters		//private �ҷ�����
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
	
	
	
	
	//main �޼ҵ�
	public static void main(String[] args) {
		Student2 student = new Student2();	//��ü�� ����, ���� Ȯ��(������ ������ �ڵ带 ����ϱ� ����) 
		student.study();
		if (student.test("����ó��������", 80))
		 	System.out.println("�հ��ϼ̽��ϴ�.");
		else
			System.out.println("���հ��ϼ̽��ϴ�.");
		
		student.eat();
		student.eat("��");
	}
	
}

// Ŭ������ ���ٽ� �޼ҵ�� �����϶�