package chap03;

import java.util.Random;
import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		//int com = (int)(1 + Math.random()*3);		//랜덤 실수값을 int로 강제 정수로 만들어줌 //1~3사이의 난수 생성
													// 방법1) Math.random() 메소드를 활용해서 난수를 생성
		Scanner scan = new Scanner(System.in);		// 유저값은 스캐너로 입력 받는다.
		System.out.print("짱 깨 뽀!!");
		Random rand = new Random(); 				// 방법2) Random() 클래스의 nextInt, nextDouble..
		int count = 0;
		final int TRY_NUMBER = 10;					//상수 : 변하지 않는 값(final)
		boolean state = true;						// 상태가 성공임을 가정
		
		while(true){
					count++;						//카운트: 와일문 실행 할 떄마다 1씩 증가
					if(count >TRY_NUMBER)	{
										  	state = false;
										  	break;	// 카운트가 5일때 스탑!
										 	}
					System.out.println(System.currentTimeMillis());
					rand.setSeed(System.currentTimeMillis());	// 1970.01.01부터 흘러온 시간 값으로 항상 달라지는 값
					int com = 1+rand.nextInt(3);	
					int user = scan.nextInt();
					int result = user - com;
					
					if(com==1)			System.out.println("컴퓨터 : 가위");
					else if(com==2)		System.out.println("컴퓨터 : 바위");
					else				System.out.println("컴퓨터 : 보");
						
					
					if(user>0 && 4>user){
				
										if(result==0)							//비기는 값을 입력
											System.out.println("비겼다~");
										
										else if(result == -1 || result == 2)	//컴퓨터가 이기는 값을 입력
											System.out.println("졌네...");
										
										else if(result == -2 || result == 1) {	// 유저가 이기는 값을 입력
											System.out.println("이겼다!!!"); 	  break; }	//사용자가 이기면 스탑!
										else 
											System.out.println("졌네...");
										}
							
					else
						System.out.println("마 똑디 해라!");
				
				
					}
		
		System.out.println("============================");
		if(state) System.out.println("당신의 승리!");	//카운트 설정한 만큼 실행해서 이기면 승리
			
		else	  System.out.println("시도횟수 초과!"); //카운트 설정한 수를 넘으면 실패
		
		scan.close();				// 와일문 끝나고 스캐너를 닫아줘야 한다.
			
		}
		

}
