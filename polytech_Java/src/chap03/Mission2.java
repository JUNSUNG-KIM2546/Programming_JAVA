package chap03;

import java.util.Random;
import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		//int com = (int)(1 + Math.random()*3);		//���� �Ǽ����� int�� ���� ������ ������� //1~3������ ���� ����
													// ���1) Math.random() �޼ҵ带 Ȱ���ؼ� ������ ����
		Scanner scan = new Scanner(System.in);		// �������� ��ĳ�ʷ� �Է� �޴´�.
		System.out.print("¯ �� ��!!");
		Random rand = new Random(); 				// ���2) Random() Ŭ������ nextInt, nextDouble..
		int count = 0;
		final int TRY_NUMBER = 10;					//��� : ������ �ʴ� ��(final)
		boolean state = true;						// ���°� �������� ����
		
		while(true){
					count++;						//ī��Ʈ: ���Ϲ� ���� �� ������ 1�� ����
					if(count >TRY_NUMBER)	{
										  	state = false;
										  	break;	// ī��Ʈ�� 5�϶� ��ž!
										 	}
					System.out.println(System.currentTimeMillis());
					rand.setSeed(System.currentTimeMillis());	// 1970.01.01���� �귯�� �ð� ������ �׻� �޶����� ��
					int com = 1+rand.nextInt(3);	
					int user = scan.nextInt();
					int result = user - com;
					
					if(com==1)			System.out.println("��ǻ�� : ����");
					else if(com==2)		System.out.println("��ǻ�� : ����");
					else				System.out.println("��ǻ�� : ��");
						
					
					if(user>0 && 4>user){
				
										if(result==0)							//���� ���� �Է�
											System.out.println("����~");
										
										else if(result == -1 || result == 2)	//��ǻ�Ͱ� �̱�� ���� �Է�
											System.out.println("����...");
										
										else if(result == -2 || result == 1) {	// ������ �̱�� ���� �Է�
											System.out.println("�̰��!!!"); 	  break; }	//����ڰ� �̱�� ��ž!
										else 
											System.out.println("����...");
										}
							
					else
						System.out.println("�� �ȵ� �ض�!");
				
				
					}
		
		System.out.println("============================");
		if(state) System.out.println("����� �¸�!");	//ī��Ʈ ������ ��ŭ �����ؼ� �̱�� �¸�
			
		else	  System.out.println("�õ�Ƚ�� �ʰ�!"); //ī��Ʈ ������ ���� ������ ����
		
		scan.close();				// ���Ϲ� ������ ��ĳ�ʸ� �ݾ���� �Ѵ�.
			
		}
		

}
