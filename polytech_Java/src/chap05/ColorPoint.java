package chap05;

class Point {	//부모 클래스
	
	private int x, y;	//클래스 안에서만 쓸수있는
	public Point(int x, int y) { this.x = x;	this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class ColorPoint extends Point {		//Point 클래스 상속받음  //메인 실행문은 public 클래스 안에서 실행 시켜야함
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
		return color + "색의 (" + super.getX() + "," + super.getY() + ")의  점";		//toString 실행 확인
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		System.out.println(cp.toString());	//오브젝트 상속(자바 조상 상속받아)
		String str = cp.toString();
		System.out.println(str + "입니다.");
		
	}
	
}

