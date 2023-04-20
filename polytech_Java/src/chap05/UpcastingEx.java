package chap05;

class Person{
	String name;
	int id;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String depart;
	public Student(String name) {
		super (name);
		this.grade = name;
	}
}


public class UpcastingEx {
	public static void main(String[] args) {
		
		//Upcasting
		Person p = new Student("������");
		System.out.println(p.name);
//		System.out.println(p.grade);	// ����ȵ�
		Student s = new Student("ȫ�浿");
		System.out.println(s.grade);
		
		//Downcasting
		Student s2 = (Student)p;
//		Student s1 = (Student)new Person("�迵��");
//		System.out.println(s1.name);
		System.out.println(s2.name);
		s2.depart = "������ũ";
		System.out.println(s2.depart);
		
		
		if(p instanceof Person)
			System.out.println("Person");
		else
			System.out.println("Person �ƴϾ�");
		
	}
}
