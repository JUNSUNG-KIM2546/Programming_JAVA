package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission4_4 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
		
	System.out.print("2�ڸ��� ���� �Է�(10~99) : ");
	var Num = scan.nextInt();
	var num10 = Num/10;	//10�� �ڸ�
	var num1 = Num%10;	//1�� �ڸ�
	
	//	���ǿ����� Ȱ��
		String msg = (num10 == num1) ? "YES! ���� �ڸ��� ���� �ڸ��� �����ϴ�." : "NO! ���� �ʽ��ϴ�.";
	
	System.out.println(msg);
		
//	String msg;
//	if(num10 == num1)
//		msg = "YES! ���� �ڸ��� ���� �ڸ��� �����ϴ�.";
//	
//	else
//		msg = "NO! ���� �ʽ��ϴ�.";
//	
//	System.out.println(msg);
	
	}
	
}