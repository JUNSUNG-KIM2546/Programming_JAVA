package chap07;

import java.util.ArrayList;

public class ClassMate {
	String class_name;
	static ArrayList<Student> al = new ArrayList<Student>();
	
	public static void main(String[] args) {
		Student s1 = new Student("김준성", 1);
		al.add(s1);
		s1 = new Student("엄남경", 2);
		al.add(s1);
		al.get(0); 	// s1의 0번째 자리 값을 가지고 와라
		System.out.println(al.get(1).getName());	// 이름만 가지고 와라
	}

}


class Student{
	private String name;
	private int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
}

