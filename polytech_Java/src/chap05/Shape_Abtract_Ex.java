package chap05;

//�߻� Ŭ���� ����
abstract class Shape1{
	//(�߻� �޼ҵ�)
	abstract void draw();
	 void paint(){
		System.out.println("paint�޼ҵ� ȣ��");
	}
	 void print(){
		System.out.println("print�޼ҵ� ȣ��");
	}
}
	
class RealShape extends Shape1{
	@Override
	void draw() {
		System.out.println("draw�޼ҵ� ȣ��");
	}
}


public class Shape_Abtract_Ex {
	
	public static void main(String[] args) {
		Shape1 shape = new RealShape();
		shape.paint();
		shape.draw();	//���� ���ε�
		
	}
}

