package chap07;

public class Student0502_7 {
	//필드정의
	private String names;
	private double scores;
	
	//생성자
	public Student0502_7(String names, double scores) {
		super();
		this.names = names;
		this.scores = scores;
	}

	
	//겟터스 & 셋터스
	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public double getScores() {
		return scores;
	}

	public void setScores(double scores) {
		this.scores = scores;
	}


	@Override
	public String toString() {
		return "이름 : " + names + " scores : " + scores;
	}
	
	
}
