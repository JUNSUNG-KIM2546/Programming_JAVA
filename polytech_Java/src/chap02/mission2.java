package chap02;

import java.util.Scanner;
// ��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
	
	System.out.print("�Է��� ������ �����ּ���.");
	String msg = scan.next();
	System.out.println("msg = " + msg);
		
	System.out.print("�Է��� ������ �����ּ���.");
	int num = scan.nextInt();
	System.out.println("msg = " + num);
	

	}

}
