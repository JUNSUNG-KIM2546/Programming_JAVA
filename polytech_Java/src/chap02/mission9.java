package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission9 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
		
	//(4�� ����) ScannerŬ������ ���� 3���� �Է¹ް� 3���� ���� �� �߰� ũ���� ���� ����϶�.
	
	System.out.print("���� 3���� �Է��ϼ���. : ");
	var a = scan.nextInt();
	var b = scan.nextInt();
	var c = scan.nextInt();
	int grade = 0;		// String ���ڿ�		int ������
	
	// �б��� if��
	if((a>b && a<c) || (a>c&&a<b))			grade = a;
	else if((b>c && b<a) || (b>a && b<c))	grade = b;
	else if((c>a && c<b) || (c>b && c<a))	grade = c;
	
	System.out.println("�߰� ũ���� ����: " + grade + " �Դϴ�.");
	
	scan.close();
	}
	
}