package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission8 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
		
	System.out.print("���̸� �Է����ּ���. : ");
	var age = scan.nextInt();
	System.out.print("�ð��� �Է����ּ���. : ");
	var time = scan.nextInt();
	
	int price = 0;		
	
	// ��ø if��
		if(time >= 22 || time < 9)
			System.out.println("���� ��ð��� �ƴմϴ�.");
		else
			System.out.println("���� ��� �Դϴ�.");
		{
			if(time >= 9 && time <= 18)		//�ְ���
			{
				if(age <= 7 || age >= 65)	price = 15000;	//����,����
				else						price = 30000;	//����
				System.out.println("����� " + price + "�� �Դϴ�.");
			}
	
			else if(time > 18 && time < 22)	//�߰���
			{
				if(age <= 7 || age <= 65)	price = 10000;	//����,����
				else						price = 20000;	//����
				System.out.println("����� " + price + "�� �Դϴ�.");
			}
			
		}
	
		scan.close();

	}
	
}