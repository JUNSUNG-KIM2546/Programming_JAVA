// 04.04
package chap04;

public class Circle2 {
	//�ʵ� : �Ӽ� =============================================
	public double radius;
	public final double PI = 3.141592;
	
	//�޼ҵ� : ���� =============================================
	//������ �޼ҵ�
	public Circle2(){}	//Default ������
	public Circle2(double radius) {
		this.radius = radius;
	}
	//(�Ϲ� �޼ҵ�) ���� �������� ����Ͽ� ���� ������ ���ϴ� �޼ҵ�
	public double getArea() {
		return PI * radius * radius;
	}
		
}
//JVM : Gabage collection = ���� ������ ����
//-method ����(���� static)
//-stack ����(��������, �ν��Ͻ�)
//-heap ����()

//Ŭ����: ��ü ����� ������(ĸ��ȭ)
//��ü(�ν��Ͻ�): Ŭ���� ����� ������ ��ü, ��ü �� �����Ϳ� ���� ��ȣ, �ܺ� ���� ����

//������(Constructor):Ŭ�������ϰ� ���ƾ���, ������ Ȯ���Ͽ� �ʱⰪ���� ���� 
//	public class circle {
//		public circle(){}
//}

//������ : �޼ҵ� �����ε�
//	   : �޼ҵ� �������̵�

// public = ������Ʈ�ȿ��� �� ��밡��
// default = ��Ű���ȿ����� ��밡��