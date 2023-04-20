package chap05;

class Point2 {	//부모 클래스
	
	private int x, y;
	
	public Point2(int x, int y) { this.x = x;	this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class ColorPoint2 extends Point {		//Point 클래스 상속받음  //메인 실행문은 public 클래스 안에서 실행 시켜야함
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
		return color + "색의 (" + super.getX()+ "," + super.getY() + ")의 점";		//toString 실행 확인
	}

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2();	// (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint2 cp = new ColorPoint2(10, 10);	// (10,0) 위치의 BLACK 색 점
		System.out.println(cp.toString() + "입니다.");
		
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
	
}

