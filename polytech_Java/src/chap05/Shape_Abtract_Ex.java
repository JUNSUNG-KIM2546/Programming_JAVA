package chap05;

//추상 클래스 선언
abstract class Shape1{
	//(추상 메소드)
	abstract void draw();
	 void paint(){
		System.out.println("paint메소드 호출");
	}
	 void print(){
		System.out.println("print메소드 호출");
	}
}
	
class RealShape extends Shape1{
	@Override
	void draw() {
		System.out.println("draw메소드 호출");
	}
}


public class Shape_Abtract_Ex {
	
	public static void main(String[] args) {
		Shape1 shape = new RealShape();
		shape.paint();
		shape.draw();	//동적 바인딩
		
	}
}

