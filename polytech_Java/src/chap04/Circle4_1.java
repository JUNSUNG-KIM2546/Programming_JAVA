// 04.04
package chap04;

public class Circle4_1 {
	//�ʵ� : �Ӽ� =============================================
	public double radius;
	public String name;
	public final double PI = 3.14;
	
	//�޼ҵ� : ���� =============================================
	//������ �޼ҵ�
	public Circle4_1(){}	//Default ������
	public Circle4_1(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}
	//�Ϲ� �޼ҵ�
	public double getArea() {
		return PI * radius * radius;
	}
	//main �޼ҵ�
	public static void main(String aragw[]) {
		Circle4_1 c = new Circle4_1("��2", 4);
		
		//��,�Ʒ� ���� �ٸ� ����
		Circle4_1 c1 = new Circle4_1("��1", 3);
		System.out.printf("%.3f",c1.getArea());
		System.out.println();
		System.out.println(c.getArea());
		System.out.println(Circle1_1.Circle_name);		//Ŭ���� Circle1_1���� �ҷ���
		System.out.println(Circle1_1.getArea(3.0));		//Ŭ���� Circle1_1���� �ҷ���
		System.out.println(Book.names);					//Ŭ���� Book���� �ҷ���
		System.out.println(Book.num);					//Ŭ���� Book���� �ҷ���
		
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