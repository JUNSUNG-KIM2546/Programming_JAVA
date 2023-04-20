package chap05;

class Point {	//�θ� Ŭ����
	
	private int x, y;	//Ŭ���� �ȿ����� �����ִ�
	public Point(int x, int y) { this.x = x;	this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class ColorPoint extends Point {		//Point Ŭ���� ��ӹ���  //���� ���๮�� public Ŭ���� �ȿ��� ���� ���Ѿ���
	String color = "BLACK";
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setXY(int x, int y) {
		super.move(x, y);
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "���� (" + super.getX() + "," + super.getY() + ")��  ��";		//toString ���� Ȯ��
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		System.out.println(cp.toString());	//������Ʈ ���(�ڹ� ���� ��ӹ޾�)
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");
		
	}
	
}

