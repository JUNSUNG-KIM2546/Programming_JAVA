package chap02;

import java.util.Random;
import java.util.Scanner;

// user �� com �� �ִ�.
// user�� 1,2,3 - ���� ���� ��
// com �� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
// 1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
// if �Ǵ� switch �߿� �����ؼ� ���α׷� �ۼ�

public class mission10_1 {

	public static void main(String[] args) {
		//int com = (int)(1 + Math.random()*3);		//���� �Ǽ����� int�� ���� ������ ������� //1~3������ ���� ����
													// ���1) Math.random() �޼ҵ带 Ȱ���ؼ� ������ ����
													
		System.out.print("¯ �� ��!!");
		Random rand = new Random(); 				// ���2) Random() Ŭ������ nextInt, nextDouble..
		int com = 1+rand.nextInt(3);				
		
		Scanner scan = new Scanner(System.in);		// �������� ��ĳ�ʷ� �Է� �޴´�.
		int user = scan.nextInt();
		
		int result = user - com;
		
		
		if(user>0 && 4>user) {
	
			if(com==1 && user==3)
				System.out.println("����...");
			
			else {
			
				if(user==1 && (user>com) || user==2 && (user>com) || user==3 && (user>com))
					System.out.println("�̰��!!!");
			
				else if(user==1 && (user==com) || user==2 && (user==com) || user==3 && (user==com))
					System.out.println("����");

				else
					System.out.println("����...");
			}
		}
	
		else
			System.out.println("�� �ȵ� �ض�!");
	
		
		
		scan.close();
	}
	
}