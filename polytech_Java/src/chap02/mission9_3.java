package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission9_3 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
	
	//(7�� ����) 2���� ��鿡�� ���簢���� ���� ��� �𼭸��� ������ �ϴ� �𼭸��� �� ������ ǥ��
	//(100, 100) �� (200, 200)�� �� ������ �̷���� �簢���� ������,
	//Scanner�� �̿��Ͽ� ���� x��y ���� �Է¹ް� ��(x,y)�� �� ���簢�� �ȿ� �ִ��� �Ǻ��ϴ� ���α׷� �ۼ�.
	
	System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� : ");
	var x = scan.nextInt();
	var y = scan.nextInt();

	int a = 100;
	int a1 = 100;

	int b = 200;
	int b1 = 200;

	//int grade = 0;		// String ���ڿ�		int ������
	
	// �б��� if��
	if(((a <= x) && (a1 <= x) && (a <= y) && (a1 <= y))&& ((b >= x) && (b1 >= x) && (b >= y) && (b1 >= y))) 
		System.out.println("(" + x + ")" + "(" + y + ")" + "�� �簢�� �ȿ� �ֽ��ϴ�.");
	
	else
		System.out.println("(" + x + ")" + "(" + y + ")" + "�� �簢�� �ȿ� �����ϴ�.");
	
	
	scan.close();

	}
	
}