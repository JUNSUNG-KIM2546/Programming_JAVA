package chap01;
// �������� 2���� input parameter�� �Է¹��� ��
// �� ū ���� return �ϴ� max �޼ҵ带 �ۼ�

public class mission02 {

	public static int max(int x, int y) {
		if(x>y)	//x�� y���� ū�� ��
			return x;	//x�� y���� ũ�� ����(��ȯ)x���� ���
		else	//x�� y���� ������ ��
			return y;	//x�� y���� ������ ����(��ȯ)y���� ���
	}
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("�� ū ���� : " + max(x,y));

	}

}
