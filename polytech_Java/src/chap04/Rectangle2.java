package chap04;

public class Rectangle2 {
	public int W = 10;
	public int H = 20;
	
	//�޼ҵ� : ���� =============================================
	//������ �޼ҵ�
	public Rectangle2() {}	//Default ������
	public Circle2(double radius) {
		this.radius = radius;
	}
	//(�Ϲ� �޼ҵ�) ���� �������� ����Ͽ� ���� ������ ���ϴ� �޼ҵ�
	public double getArea() {
		return W * H;
	}
		
}	
