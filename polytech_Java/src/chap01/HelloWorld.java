package chap01;
// �ּ�   ��Ʈ��+/ �ٷ� �ּ�ó��
/* �����ּ� */
// ����: ��Ʈ��+F11
// ����Ű: ��Ʈ��+�����̽���
// static: Ư������
// return: �ڿ� ������� ���� �޼ҵ��� ����� ��ȯ, ���ÿ� �޼ҵ带 �����Ų��
public class HelloWorld {				// ����(��) �޼ҵ�
	public static int sum(int n, int m) { //��ǲ �Ķ���� //sum �޼ҵ�
		return n+m;
	}
// �� (��ɺ��) �ҷ����� ������ ������ �ȵ�
		
	public static void main(String[] args) { //main �޼ҵ�(���Ȯ�� �޼ҵ�), �� �޼ҵ�
		int a = 10;  //����(������Ÿ��) ǥ�� �������
		int b = 30;  
		int s = sum(a,b); //���ڰ� //s���� sum�޼ҵ�(��ɺ��)���� �ҷ��´�
		System.out.println("Hello World");
		System.out.println("a+b =" + s); //"a+b"= "" �������, s= sum�޼ҵ忡�� �ҷ��� ��
		System.out.println(s);
	}
}
