package chap03;

import java.net.MulticastSocket;
import java.util.Random;
import java.util.Scanner;

public class Mission0328 {
	
	// ������ ī���� ���� ���ߴ� ������ ������. 0���� 99������ ������ ���� ���� ī�带 �� �� ����� �� ī���� ���� ���ߴ� �����̴�.
	// �Ʒ��� ȭ��� ���� ī�� ���� ���� 77�� ��츦 ����. 
	// ���� ���ߴ� ����� 55��� �Է��ϸ� "�� ����". �ٽ� 70�� �Է��ϸ� "�� ����"��� ������ ������ �������鼭 ���� �����.
	// ������ �ݺ��ϱ� ���� y/n�� ����. n�� ��� �����Ѵ�.
	//========================================================================	
public static void main(String[] args) {

	//1. ���� �����Ѵ�.
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	boolean ST = true;							//���º��� (�����̶�� ����)
									//�õ�Ƚ���� ���� ī��Ʈ
	
	//System.out.println(System.currentTimeMillis());
	rand.setSeed(System.currentTimeMillis());	// 1970.01.01���� �귯�� �ð� ������ �׻� �޶����� ��
	
	System.out.println("ī����� ����!");
	
	
	//3. �ݺ��� �Ѵ�.
	while(true) {
				System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
				int com = rand.nextInt(99);
				int count = 0;
				int max = 99;
				int min = 0;
				
				while(true) {	
							count ++;
							System.out.println("�İ�" + com);
						
							System.out.print(count + "ȸ >> �����Է� : ");
							int user = scan.nextInt();
							
							//2. ������ �Ѵ�.
							if(user>com){
								System.out.println("�� ����..");
								max = user;
								System.out.println(min + "~" + max);
										}
			
							else if(user<com) {	
								System.out.println("�� ����!!");
								min = user;
								System.out.println(min + "~" + max);
											  }
							
							else
								break;
							}	
				
				System.out.println("�¾ҽ��ϴ�.");
				System.out.println("�ٽ��Ͻðڽ��ϱ�? ( Y / N )");
				String text = scan.next();
				if(text.equals("n")||text.equals("N")) 
					{
					System.out.println("������~");
					break;
					}
				}

	scan.close();
	}
}

					
