package chap07;

public class Student0502_7 {
	//�ʵ�����
	private String names;
	private double scores;
	
	//������
	public Student0502_7(String names, double scores) {
		super();
		this.names = names;
		this.scores = scores;
	}

	
	//���ͽ� & ���ͽ�
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
		return "�̸� : " + names + " scores : " + scores;
	}
	
	
}
