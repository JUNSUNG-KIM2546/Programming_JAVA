package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission9_5 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
	
	//(9�� ����) ���� �߽��� ��Ÿ���� �� ���� �������� �Ǽ� ������ �Է¹޾ƶ�.
	//�Ǽ� ������ �ٸ� ��(x,y)�� �Է¹޾� �� ���� ���� ���ο� �ִ��� �Ǻ��Ͽ� ���
	//Scanner �� if����,����� ���
	
	System.out.print("���� �߽ɰ� �������� �Է��ϼ���. : ");
	var x = scan.nextDouble();
	var y = scan.nextDouble();
	var c = scan.nextDouble();

	double x1 = x+c;
	double x2 = x-c;
	double y1 = y+c;
	double y2 = y-c;

	System.out.print("���� �Է��ϼ���. : ");
	var a = scan.nextDouble();
	var b = scan.nextDouble();


	//int grade = 0;		// String ���ڿ�		int ������
	
	// �б��� if��
	if((a>=x2)&&(a<=x1)&&(a>=y2)&&(a<=y1)&&(b>=x2)&&(b<=x1)&&(b>=y2)&&(b<=y1))
		System.out.println("��" + "("  + a + ", " + b + ")" + "�� �� �ȿ� �ֽ��ϴ�.");
	
	else
		System.out.println("��" + "("  + a + ", " + b + ")" + "�� �� �ȿ� �����ϴ�.");
	
	
	scan.close();

	}
	
}