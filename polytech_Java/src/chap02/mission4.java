package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission4 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
		
	System.out.print("2�ڸ��� ���� �Է�(10~99) : ");
	var Num = scan.nextInt();
	var num10 = Num/10;
	var num1 = Num%10;
	
	if (num10==num1)
		
		System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		
	else		// ; �ݾ��ָ� if�� else ����� ���´�.
	
		System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
	
	
	
	
	}

}