package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission5 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
		
	System.out.print("�ݾ��� �Է��Ͻÿ�. : ");
	
	var Won = scan.nextInt();
	int won50000 = Won/50000;
	int res = (Won%50000);
	
	int won10000 = res/10000;
	int res = (Won%10000);
	
	int won1000 = res/1000;
	int res = (Won%1000);
	
	int won100 = res/100;
	int res = (Won%100);
	
	int won50 = res/50;
	int res = (Won%50);
	
	int won10 = res/10;
	int res = (Won%10);
	
	int won1 = Won/1;
	int res = (Won%1);
	
		System.out.println("�������� : " + Won + "��");

	}
	
}