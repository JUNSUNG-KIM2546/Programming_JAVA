package chap03;

import java.util.Scanner;

public class Mission1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. while �� ���
//		System.out.println("���� ���� >> ");
//		int toeic = scan.nextInt();
//		
//		while(toeic<700) {					// ���ǿ� ������ ������ �ݺ�
//			System.out.println("���θ� �ϼ�");
//			System.out.println("������ ����");
//			System.out.println("���� ���� >> ");
//				toeic = scan.nextInt();
//		}
//
//		System.out.println("���� ���� Ż��!!");
		
		
		// 2. while �� ��� (���ѹݺ� ������ ���ǿ� ��ž) **��õ
		System.out.println("���� ���� >> ");
		int toeic = scan.nextInt();
		
		while(true) {					// ���ǿ� ������ ������ �ݺ�
			if(toeic<700) break;
			System.out.println("���θ� �ϼ�");
			System.out.println("������ ����");
			System.out.println("���� ���� >> ");
				toeic = scan.nextInt();
		}

		System.out.println("���� ���� Ż��!!");
		
		
	}

}
