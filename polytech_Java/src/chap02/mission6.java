package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission6 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
		
	System.out.print("Ű �Է� : ");
	int height = scan.nextInt();
	
	System.out.print("���� �Է� : ");
	int age = scan.nextInt();
	
	//���ǽ����� ��� (�������� Ȱ��)
	if(height >= 140 && age >= 10)				//1) if(���ǽ�) {��}
		
		System.out.println("Ÿ�� �����ϴ�.");		//2) if(���ǽ�) {��}
	else										//   else     {����}
		
		System.out.println("������~");			//3) if(score >= 90) 		grade = 'A';	*�б�if��*
												//   else if(score >= 80) 	grade = 'B';
												//   else					grade = 'C';
	
												//4) if(time >= 9 && time <= 18)		*��øif��*
													// if(age <= || age >= 65)	price = 15000;
													// else						price = 30000;
												//	 else if(time > 18 && time <= 22)
	
		scan.close();

	}
	
}