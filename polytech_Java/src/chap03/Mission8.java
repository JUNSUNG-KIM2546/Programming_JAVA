package chap03;

import java.util.Scanner;

public class Mission8 {
	
public static void main(String[] args) {
	
		int count = 0, sum =0;	// count �Էµ� ������ ����
		//int sum = 0;	// sum�� ��
		double average = 0.0;	// ���
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է�");
		
		int n = scanner.nextInt();	// ���� �Է�*
		
		while (n != -1) {			// ��Ƽ��, ���ʰ� -1*
			sum += n;
			count++;
			n = scanner.nextInt();	// ���� �Է�*
						} 
		
		if(count > 0) {
			System.out.println("������ ���� : " + count);
			average = (double)sum / count;
			System.out.println("��� : " + average + "��");
					  }
		else
			System.out.println("������ ������ 0�̶�, ����� ���� ���� �����ϴ�.");
		
		
//		import java.util.Scanner;
//		public class WhileSample {
//			public static void main(String[] args) {
//				int count=0; // count�� �Էµ� ������ ����
//				int sum=0; // sum�� ��
//				Scanner scanner = new Scanner(System.in);		
//				System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
//
//				int n = scanner.nextInt(); // ���� �Է�
//				while(n != -1) { // -1�� �ԷµǸ� while �� ���
//					sum += n;
//					count++;
//					n = scanner.nextInt(); // ���� �Է�
//				}
//				if(count == 0) System.out.println("�Էµ� ���� �����ϴ�.");
//				else {
//					System.out.print("������ ������ " + count + "���̸� ");
//					System.out.println("����� " + (double)sum/count + "�Դϴ�.");
//				}
//				scanner.close();
//			}
//		}

		
		scanner.close();
		
									   }
					}
