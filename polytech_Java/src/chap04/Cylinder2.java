package chap04;

public class Cylinder2 {
	public Circle2 c;
	public double H;
	
	// ���� ���� �ʺ� ����Ͽ� ������ ������ ���ϴ� �޼ҵ�
	public double getVol() {
	return c.getArea() * H;
	}
	
	public Cylinder2(Circle2 c,double H) {
		this.c = c;
		this.H = H;
	}
	public static void main(String args[]) {
		Cylinder2 cd = new Cylinder2(new Circle2(2.8), 5.6);
		
		System.out.println(cd.getVol());
		System.out.printf("%.6f",cd.getVol());
	}
}
