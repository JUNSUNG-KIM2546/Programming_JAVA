package chap04;

public class Rectangle2 {
	public int W = 10;
	public int H = 20;
	
	//메소드 : 행위 =============================================
	//생성자 메소드
	public Rectangle2() {}	//Default 생성자
	public Circle2(double radius) {
		this.radius = radius;
	}
	//(일반 메소드) 현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return W * H;
	}
		
}	
