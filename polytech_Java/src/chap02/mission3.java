package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
	
//	System.out.print("��ȭ�� �Է��ϼ���.(���� ��) : ");
//	String msg = scan.next();
//	var num = scan.nextDouble();
//	System.out.println(msg + "���� $" + num/1100 + "�Դϴ�.");
	
	System.out.print("��ȭ�� �Է��ϼ���.(���� ��) : ");		//��ȭ�� �޷��� �ٲ��ִ�
	var Num = scan.nextInt();
	System.out.println(Num + "���� $" + (double)Num/1100 + "�Դϴ�.");
		
//	System.out.print("�Է��� ������ �����ּ���.");
//	int num = scan.nextInt();
//	System.out.println("msg = " + num);
	
	scan.close();		//scan �޼ҵ带 �ݾ��ִ�
	

	}

}