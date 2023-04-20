package chap03;

import java.util.Random;
import java.util.Scanner;

public class Mission3 {

	// UP - DOWN ����
	// ����� : 1~99���� �Է�
	// ��ǻ�� : 1~99������ ���� ����
	// ����ڰ� ��ǻ�� ���� ���߸� ���� ����!
	// ����ڰ� > ��ǻ�� DOWN ����!
	// ����ڰ� < ��ǻ�� UP ����!
	// TRY = 7ȸ
	// ����: �̰��!!
	// ����: �õ� Ƚ�� ���!!
	//		�����ߴ�!!
	
	public static void main(String[] args) {
		
		//1. ���� �����Ѵ�.
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		final int TRY = 7;							//�ִ�õ�Ƚ��, ����� ǥ��
		boolean ST = true;							//���º��� (�����̶�� ����)
		int count = 0;								//�õ�Ƚ���� ���� ī��Ʈ
		
		System.out.println(System.currentTimeMillis());
		rand.setSeed(System.currentTimeMillis());	// 1970.01.01���� �귯�� �ð� ������ �׻� �޶����� ��
		
		int com = 1+rand.nextInt(99);
		
		System.out.println("UP - DOWN ���� ����!");
		System.out.println("�İ�" + com);
		
		//3. �ݺ��� �Ѵ�.
		while(true) {
					count ++;
					if(count>TRY){
								 ST = false;		//�극��ũ ������ ����
								 break;
								 }
					System.out.println(count + "ȸ �õ�");
					System.out.print("�����Է� : ");
					int user = scan.nextInt();
					
					//2. ������ �Ѵ�.
					if(user>com)		System.out.println("DOWN~");
					else if(user<com)	System.out.println("UP~");
					else{				System.out.println("����!!");  break;}
									
					}
	
		System.out.println("============================");
		if(ST)System.out.println("����� �¸�!");	//ST���� True�̸� �¸� ���, ī��Ʈ ������ ��ŭ �����ؼ� �̱�� �¸� ���
				
		else	  System.out.println("�õ�Ƚ�� �ʰ�!" + (count-1)); //ī��Ʈ ������ ���� ������ ���� ���, ī��Ʈ�� �������� 1�� �� ������.
		
		scan.close();
										
										}

}
