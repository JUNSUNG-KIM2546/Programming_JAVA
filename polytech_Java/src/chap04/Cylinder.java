package chap04;

public class Cylinder {
	public Circle2 c;
	public double H;
	
	// ���� ���� �ʺ� ����Ͽ� ������ ������ ���ϴ� �޼ҵ�
	public double getVol() {
	return c.getArea() * H;
	}
	
	public static void main(String args[]) {
		Cylinder c1 = new Cylinder();
		c1.c = new Circle2(2.8);
		c1.H = 5.6;
		
		System.out.println(c1.getVol());
		System.out.printf("%.6f",c1.getVol());
	}
}
