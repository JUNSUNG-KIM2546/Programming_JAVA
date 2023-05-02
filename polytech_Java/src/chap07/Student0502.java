package chap07;

public class Student0502 {
	//필드정의
	private String name;
	private String dept;
	private int id;
	private double score;
	
	//생성장
	public Student0502(String name, String dept, int id, double score) {
		super();
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.score = score;
	}
	
	//getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	//toString
	@Override
	public String toString() {
		return "이름=" + name + ", 학과=" + dept + ", 학번=" + id + ", 학점평균=" + score ;
	}
	
}
