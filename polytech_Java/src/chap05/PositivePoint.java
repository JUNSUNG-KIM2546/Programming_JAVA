package chap05;

class Point4 {	//부모 클래스
	
	private int x, y;
	
	public Point4(int x, int y) { this.x = x;	this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class PositivePoint extends Point {		//Point 클래스 상속받음  //메인 실행문은 public 클래스 안에서 실행 시켜야함
	
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
		return  "(" + super.getX()+ "," + super.getY() + ")의 점";		//toString 실행 확인
	}

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10,10);		
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5,5);	// 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
	
}

