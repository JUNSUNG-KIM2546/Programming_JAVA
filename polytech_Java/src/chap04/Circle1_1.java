// 04.04
package chap04;

public class Circle1_1 {
	//�ʵ� : �Ӽ� =============================================
	public int radius;		//�ɹ�����
	public String name;		//�ǹ�����
	public static final double PI = 3.14;		//�ɹ�����(�����)
	public static String Circle_name = "����";	//Ŭ��������
	
	//�޼ҵ� : ���� =============================================
	//������ �޼ҵ�
	public Circle1_1(){}	//Default ������
	public Circle1_1(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}
	//�Ϲ� �޼ҵ�
	double getArea() {
		return PI * radius * radius;
	}
	
	static double getArea(double radius) {
		return PI * radius * radius;
	}
	//main �޼ҵ�
	public static void main(String aragw[]) {
//		Circle1_1 c = new Circle1_1("��2", 4);
//		//��,�Ʒ� ���� �ٸ� ����
//		Circle1_1 c1 = new Circle1_1("��1", 3);
//		System.out.printf("%.3f",c1.getArea());
//		System.out.println();
//		System.out.println(c.getArea());
		
		Circle pizza = new Circle("����",10);
		Circle donut = new Circle("����",2);
		System.out.println(Circle1_1.Circle_name);
		System.out.println("������ ũ���"+pizza.getArea());
		System.out.println("������ ũ���"+donut.getArea());
		System.out.println(Circle1_1.getArea(3.0));
		
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