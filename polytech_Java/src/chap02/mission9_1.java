package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission9_1 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
		
	//(5�� ����) ScannerŬ������ �̿��Ͽ� �ﰢ���� ���� ���̸� ��Ÿ���� ������ 3�� �Է¹ڰ� �� 3���� ���� �ﰢ���� ����� �ִ��� �Ǻ��϶�.
	//�ﰢ���� �Ƿ��� �� ���� ���� �ٸ� �� ���� �պ��� Ŀ�� �Ѵ�.
	
	System.out.print("���� 3���� �Է��ϼ���. : ");
	var a = scan.nextInt();
	var b = scan.nextInt();
	var c = scan.nextInt();
	//int grade = 0;		// String ���ڿ�		int ������
	
	// �б��� if��
	if( (a+b)>c == (a+c)>b == (b+c)>a )
		System.out.println("�ﰢ���� �����մϴ�.");
	
	else
		System.out.println("�ﰢ���� �Ұ����մϴ�");
	
	
	scan.close();

	}
	
}