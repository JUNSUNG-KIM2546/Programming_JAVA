package chap05;

//추상클래스 정의
abstract class Shape2{
	abstract void draw();
	
}

//추상클래스를 상속받아 재정의해서 사용
class Circle1 extends Shape2{
	@Override
	void draw() {
		System.out.println("원그리기");
		
	}	
}

class Line1 extends Shape2{
	@Override
	void draw() {
		System.out.println("선그리기");
		
	}	
}


class Rect1 extends Shape2{
	@Override
	void draw() {
		System.out.println("사각형그리기");
		
	}
	
}


public class ShapeEx1 {

	public static void main(String[] args) {
		//Shape2 s = new Circle1();
		//s.draw();
		
		Shape2 s = new Line1();
		s.draw();
		
		//Shape2 s = new Rect1();
		//s.draw();
	}
}
