package miniproject;

public abstract class Product {
	
	String pname;
	int price;
	
	public void printDefault() {
		System.out.print("��ǰ�� : " + pname + ",");
		System.out.print("��ǰ���� : " + price + ",");
		printExtra(); // ����Ʈ����(����Ʈ����Ʈ��)(���Ǿȵ�) �ҷ�����
	}
	
	public abstract void printExtra();
	
}
