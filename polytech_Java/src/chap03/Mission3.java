package chap03;

import java.util.Random;
import java.util.Scanner;

public class Mission3 {

	// UP - DOWN 게임
	// 사용자 : 1~99까지 입력
	// 컴퓨터 : 1~99까지의 값을 생성
	// 사용자가 컴퓨터 값을 맞추면 게임 성공!
	// 사용자가 > 컴퓨터 DOWN 시켜!
	// 사용자가 < 컴퓨터 UP 시켜!
	// TRY = 7회
	// 성공: 이겼다!!
	// 실패: 시도 횟수 출력!!
	//		실패했다!!
	
	public static void main(String[] args) {
		
		//1. 값을 생성한다.
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		final int TRY = 7;							//최대시도횟수, 상수로 표현
		boolean ST = true;							//상태변수 (성공이라고 가정)
		int count = 0;								//시도횟수를 위한 카운트
		
		System.out.println(System.currentTimeMillis());
		rand.setSeed(System.currentTimeMillis());	// 1970.01.01부터 흘러온 시간 값으로 항상 달라지는 값
		
		int com = 1+rand.nextInt(99);
		
		System.out.println("UP - DOWN 게임 시작!");
		System.out.println("컴값" + com);
		
		//3. 반복을 한다.
		while(true) {
					count ++;
					if(count>TRY){
								 ST = false;		//브레이크 위에서 적용
								 break;
								 }
					System.out.println(count + "회 시도");
					System.out.print("숫자입력 : ");
					int user = scan.nextInt();
					
					//2. 게임을 한다.
					if(user>com)		System.out.println("DOWN~");
					else if(user<com)	System.out.println("UP~");
					else{				System.out.println("성공!!");  break;}
									
					}
	
		System.out.println("============================");
		if(ST)System.out.println("당신의 승리!");	//ST값이 True이면 승리 출력, 카운트 설정한 만큼 실행해서 이기면 승리 출력
				
		else	  System.out.println("시도횟수 초과!" + (count-1)); //카운트 설정한 수를 넘으면 실패 출력, 카운트는 실제보다 1이 더 찍힌다.
		
		scan.close();
										
										}

}
