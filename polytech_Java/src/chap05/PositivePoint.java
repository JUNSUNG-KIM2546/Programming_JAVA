package chap05;

class Point4 {	//�θ� Ŭ����
	
	private int x, y;
	
	public Point4(int x, int y) { this.x = x;	this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class PositivePoint extends Point {		//Point Ŭ���� ��ӹ���  //���� ���๮�� public Ŭ���� �ȿ��� ���� ���Ѿ���
	
	public PositivePoint() {
		super(0, 0);
	}
	
	public PositivePoint(int x, int y) {
		super(0, 0);
		if(x > 0 && y > 0)
			super.move(x, y);
	}
	
	protected void move(int x, int y) {
		if(x > 0 && y > 0)
			super.move(x, y);
	}
	
	@Override
	public String toString() {
		return  "(" + super.getX()+ "," + super.getY() + ")�� ��";		//toString ���� Ȯ��
	}

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10,10);		
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(-5,5);	// ��ü p�� ���� �������� �̵����� ����
		System.out.println(p.toString() + "�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}
	
}

