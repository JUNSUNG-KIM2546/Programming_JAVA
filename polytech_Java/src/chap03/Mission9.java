package chap03;

import java.util.Scanner;

public class Mission9 {
	
public static void main(String[] args) {
	
		int count = 0, sum =0;	// count �Էµ� ������ ����
		//int sum = 0;	// sum�� ��
		double average = 0.0;	// ���
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է�");
		
		int n = 0;
		
	    do {
			sum += n;
			count++;
			n = scanner.nextInt();	// ���� �Է�*
		   } while (n != -1);	// ��Ƽ��, ���ʰ� -1*
	    
	    count = count - 1;
		
		if(count > 0) {
			System.out.println("������ ���� : " + count);
			average = (double)sum / count;
			System.out.println("��� : " + average + "��");
					  }
		else
			System.out.println("������ ������ 0�̶�, ����� ���� ���� �����ϴ�.");
			
		scanner.close();
		
									   }
					}
