package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission7 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
		
	System.out.print("������ �Է� ���ּ���. : ");
	var score = scan.nextInt();
	String grade;		// ���ڿ�
	
	// �б��� if��
	if(score >= 90)			grade = "A";
	else if(score >= 80)	grade = "B";
	else if(score >= 70)	grade = "C";
	else if(score >= 60)	grade = "D";
	else if(score >= 50)	grade = "E";
	else if(score >= 40)	grade = "F";
	else					grade = "����";
	
	System.out.println("������ " + grade + " �Դϴ�.");
	
	scan.close();

	}
	
}