package chap03;

import java.util.Scanner;

public class Mission369369 {

	public static void main(String[] args) {
		//1. 값을 생성한다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========< 3 6 9 게임을 시작합니다! >========");
		
		//3. 반복을 한다.
		while(true) {
					System.out.print("입력 : ");
					String b = scan.next();
					var a = Integer.parseInt(b);
					int com = a;

			
					//2. 게임을 한다.
					if(a>0 && a<100){
									if(a<10)
											{		
											if(a==3 || a==6 || a==9)
												System.out.println(a + " 박수 짝 !");
											
											else 
												  System.out.println(a);		 
											}
									
									else 
										{
										if((b.charAt(0)=='3' || b.charAt(0)=='6' || b.charAt(0)=='9') && (b.charAt(1)=='3' || b.charAt(1)=='6' || b.charAt(1)=='9'))
										System.out.println(a + " 박수 짝 짝 ! !");
										
										else if((b.charAt(1)=='3' || b.charAt(1)=='6' || b.charAt(1)=='9') || (b.charAt(0)=='3' || b.charAt(0)=='6' || b.charAt(0)=='9'))
											System.out.println(a + " 박수 짝 ! ");
										
										else
											System.out.println(a);
										}
									}
						
					else
						{
						System.out.println("종료합니다. 1~99까지 입력 해주세요. ");
						break;
						}
					}
	
					scan.close();
										
											}

}
