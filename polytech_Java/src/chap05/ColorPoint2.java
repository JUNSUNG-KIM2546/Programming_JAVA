package chap05;

class Point2 {	//�θ� Ŭ����
	
	private int x, y;
	
	public Point2(int x, int y) { this.x = x;	this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class ColorPoint2 extends Point {		//Point Ŭ���� ��ӹ���  //���� ���๮�� public Ŭ���� �ȿ��� ���� ���Ѿ���
	String color = "BLACK";
	
	public ColorPoint2() {
		super(0, 0);
	}
	
	public ColorPoint2(int x, int y) {
		super(x, y);
	}
	
	void setXY(int x, int y) {
		super.move(x, y);	
	}

	void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "���� (" + super.getX()+ "," + super.getY() + ")�� ��";		//toString ���� Ȯ��
	}

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2();	// (0,0) ��ġ�� BLACK �� ��
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoint2 cp = new ColorPoint2(10, 10);	// (10,0) ��ġ�� BLACK �� ��
		System.out.println(cp.toString() + "�Դϴ�.");
		
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
	}
	
}

