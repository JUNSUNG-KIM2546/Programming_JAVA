package chap05;

//�߻�Ŭ���� ����
abstract class Shape2{
	abstract void draw();
	
}

//�߻�Ŭ������ ��ӹ޾� �������ؼ� ���
class Circle1 extends Shape2{
	@Override
	void draw() {
		System.out.println("���׸���");
		
	}	
}

class Line1 extends Shape2{
	@Override
	void draw() {
		System.out.println("���׸���");
		
	}	
}


class Rect1 extends Shape2{
	@Override
	void draw() {
		System.out.println("�簢���׸���");
		
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
