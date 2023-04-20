package chap05;

class Point3 {	//�θ� Ŭ����
	
	private int x, y;
	
	public Point3(int x, int y) { this.x = x;	this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class Point3D extends Point {		//Point Ŭ���� ��ӹ���  //���� ���๮�� public Ŭ���� �ȿ��� ���� ���Ѿ���
	String color = "BLACK";
	int z;
	public Point3D() {
		super(0, 0);
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	void setXY(int x, int y) {
		super.move(x, y);	
	}
	
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	void moveUp() {
		this.z++;
	}

	void moveDown() {
		this.z--;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return  "(" + super.getX()+ "," + super.getY() + "," + z + ")�� ��";		//toString ���� Ȯ��
	}

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);	// 1,2,3�� ���� x, y, z���� ��.
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveUp();		// z ������ ���� �̵�
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveDown();	// z ������ �Ʒ��� �̵�
		p.move(10, 10);	// x, y ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(100, 200, 300);	// x, y, z ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");
	}
	
}

