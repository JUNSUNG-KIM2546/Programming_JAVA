package chap03;

import java.util.Scanner;

public class Mission369369 {

	public static void main(String[] args) {
		//1. ���� �����Ѵ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========< 3 6 9 ������ �����մϴ�! >========");
		
		//3. �ݺ��� �Ѵ�.
		while(true) {
					System.out.print("�Է� : ");
					String b = scan.next();
					var a = Integer.parseInt(b);
					int com = a;

			
					//2. ������ �Ѵ�.
					if(a>0 && a<100){
									if(a<10)
											{		
											if(a==3 || a==6 || a==9)
												System.out.println(a + " �ڼ� ¦ !");
											
											else 
												  System.out.println(a);		 
											}
									
									else 
										{
										if((b.charAt(0)=='3' || b.charAt(0)=='6' || b.charAt(0)=='9') && (b.charAt(1)=='3' || b.charAt(1)=='6' || b.charAt(1)=='9'))
										System.out.println(a + " �ڼ� ¦ ¦ ! !");
										
										else if((b.charAt(1)=='3' || b.charAt(1)=='6' || b.charAt(1)=='9') || (b.charAt(0)=='3' || b.charAt(0)=='6' || b.charAt(0)=='9'))
											System.out.println(a + " �ڼ� ¦ ! ");
										
										else
											System.out.println(a);
										}
									}
						
					else
						{
						System.out.println("�����մϴ�. 1~99���� �Է� ���ּ���. ");
						break;
						}
					}
	
					scan.close();
										
											}

}
