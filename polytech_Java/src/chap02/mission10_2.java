package chap02;

import java.util.Random;
import java.util.Scanner;

// user �� com �� �ִ�.
// user�� 1,2,3 - ���� ���� ��
// com �� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
// 1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
// if �Ǵ� switch �߿� �����ؼ� ���α׷� �ۼ�

public class mission10_2 {

	public static void main(String[] args) {
		//int com = (int)(1 + Math.random()*3);		//���� �Ǽ����� int�� ���� ������ ������� //1~3������ ���� ����
													// ���1) Math.random() �޼ҵ带 Ȱ���ؼ� ������ ����
													
		System.out.print("¯ �� ��!!");
		Random rand = new Random(); 				// ���2) Random() Ŭ������ nextInt, nextDouble..
		int com = 1+rand.nextInt(3);				
		
		Scanner scan = new Scanner(System.in);		// �������� ��ĳ�ʷ� �Է� �޴´�.
		int user = scan.nextInt();
		
		if(com==1) System.out.println("��ǻ�� : ����");
		else if(com==2) System.out.println("��ǻ�� : ����");
		else System.out.println("��ǻ�� : ��");
		
		
		
		int result = user - com;
		
		if(user>0 && 4>user) {
	
			if(result==0)							//���� ���� �Է�
				System.out.println("����~");
			
			else if(result == -1 || result == 2)	//��ǻ�Ͱ� �̱�� ���� �Է�
				System.out.println("����...");
			
			else if(result == -2 || result == 1)	// ������ �̱�� ���� �Է�
				System.out.println("�̰��!!!");
			else 
				System.out.println("����...");
			}
				
		else
			System.out.println("�� �ȵ� �ض�!");
	
		
		
		scan.close();
	}
	
}