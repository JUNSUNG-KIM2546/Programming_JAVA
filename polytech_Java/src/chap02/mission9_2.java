package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission9_2 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
	
	//(6�� ����) 369������ ������ �ۼ��غ���.1~99������ ������ �Է¹ް� ������ 3,6,9 �� �ϳ��� �ִ� ���� "�ڼ�¦"�� ���, �ΰ��� �ִ� ���� "�ڼ�¦¦"�� ���	
	//��) �Էµ� ���� 13�� ��� "�ڼ�¦", 36�� ��� "�ڼ�¦¦"  ���
	
	System.out.print("(369����) 1~99������ ������ �Է��ϼ���. : ");
	String b = scan.next();
	int a = Integer.parseInt(b);
	
			// ����Ÿ��Ŭ������.parse����Ÿ�Ը�("���ڹ��ڿ�")
		// Integer.parseInt("123") == 123
		// Float.parseFloat("123.456") == 123.456
		// double xnum = Double.parseDouble(xx);
		// double ynum = Double.parseDouble(yy);
	
	//int grade = 0;		// String ���ڿ�		int ������
	

	if((a<100) && (a>0)) 

		{	if(a<10)
			{
				if(a==3 || a==6 || a==9)
				System.out.println(" �ڼ� ¦ ! ");
				
				else
				System.out.println(" �� ! ");
			}
			
			
		
			else
			{	if((b.charAt(0)=='3' || b.charAt(0)=='6' || b.charAt(0)=='9') && (b.charAt(1)=='3' || b.charAt(1)=='6' || b.charAt(1)=='9'))	
				System.out.println(" �ڼ� ¦ ¦ ! ");
	
				else if((b.charAt(1)=='3' || b.charAt(1)=='6' || b.charAt(1)=='9') || (b.charAt(0)=='3' || b.charAt(0)=='6' || b.charAt(0)=='9'))
				System.out.println(" �ڼ� ¦ ! ");

				else
				System.out.println(" �� ! ");
			}
		
		}
	
	else
		System.out.println("(369����) 1~99�� ������ �ƴմϴ�. ���α׷��� �����մϴ�.");
	
	
	scan.close();

	}
	
}