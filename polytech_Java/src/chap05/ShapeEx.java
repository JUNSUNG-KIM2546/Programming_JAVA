package chap05;

//메소드 오버라이딩
class Shape{
	void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	@Override
	void draw() {
		System.out.println("Line");	// 내용 값만 바꾸는(오버라이딩)
	}
}

class Rect extends Shape {
	@Override
	void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Circle");
	}
}


public class ShapeEx {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();					// 동적 바인딩 (부모 무시)
		Shape shape = new Line();
		shape.draw();

	}

}
