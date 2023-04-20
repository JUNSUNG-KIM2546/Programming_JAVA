package chap05;

class Point3 {	//부모 클래스
	
	private int x, y;
	
	public Point3(int x, int y) { this.x = x;	this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class Point3D extends Point {		//Point 클래스 상속받음  //메인 실행문은 public 클래스 안에서 실행 시켜야함
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
		return  "(" + super.getX()+ "," + super.getY() + "," + z + ")의 점";		//toString 실행 확인
	}

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);	// 1,2,3은 각각 x, y, z축의 값.
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();		// z 축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();	// z 축으로 아래쪽 이동
		p.move(10, 10);	// x, y 축으로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);	// x, y, z 축으로 이동
		System.out.println(p.toString() + "입니다.");
	}
	
}

