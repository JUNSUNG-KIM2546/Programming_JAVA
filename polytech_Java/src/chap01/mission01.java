package chap01;
// �̼�01:�־��� ���� �µ��� ȭ�� �µ��� �ٲٴ� CtoF �޼ҵ带 �ۼ��϶�
// F = (9/5)*C + 32
// C : 15�� ��� ����

public class mission01 {
	public static double CtoF(double c) {	//CtoF()��ȣ�ȿ� ��ǲ��(�Է�)
		return (9.0/5.0)*c+32;	//�ڿ� ������� ���� �޼ҵ��� ����� ��ȯ, ���ÿ� �޼ҵ带 �����Ų��
	}
			
	public static void main(String[] args) {
		int c = 14;
		System.out.println("ȭ���µ� : " + CtoF(c));
		}
}
