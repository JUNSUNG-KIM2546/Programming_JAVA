package chap02;

import java.util.Scanner;

// switch �� Ȱ��
// ����ڷκ��� month �� ������ �Է¹޾Ƽ�
// month�� days �� ������ּ���.
// month : 2 - 28, 4,6,9,11 - 30��, ��Ÿ - 31��

public class mission10 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
		
	System.out.print("�� (1~12) ");
	
	var month = scan.nextInt();
	var days = 0;		//�ʱ�ȭ ��
			
	
	switch(month) {
	case 2 :
		days = 28;
		break;			// �ش� ���� �극��ũ�� ���� �������
		
	case 4: case 6: case 9: case 11:
		days = 30;
		break;			// �ش� ���� �극��ũ�� ���� �������
		
	default :
		days = 31;
		break;
	}
	
	System.out.println( month + "���� " + days + "�� �Դϴ�");
	
		scan.close();
		
	}
	
}