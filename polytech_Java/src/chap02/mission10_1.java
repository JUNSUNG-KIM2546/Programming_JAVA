package chap02;

import java.util.Random;
import java.util.Scanner;

// user 와 com 이 있다.
// user는 1,2,3 - 가위 바위 보
// com 은 random 하게 컴퓨터가 생성한다.
// 1회의 게임을 하고 누가 이겼는지 화면에 출력하라!
// if 또는 switch 중에 결정해서 프로그램 작성

public class mission10_1 {

	public static void main(String[] args) {
		//int com = (int)(1 + Math.random()*3);		//랜덤 실수값을 int로 강제 정수로 만들어줌 //1~3사이의 난수 생성
													// 방법1) Math.random() 메소드를 활용해서 난수를 생성
													
		System.out.print("짱 깨 뽀!!");
		Random rand = new Random(); 				// 방법2) Random() 클래스의 nextInt, nextDouble..
		int com = 1+rand.nextInt(3);				
		
		Scanner scan = new Scanner(System.in);		// 유저값은 스캐너로 입력 받는다.
		int user = scan.nextInt();
		
		int result = user - com;
		
		
		if(user>0 && 4>user) {
	
			if(com==1 && user==3)
				System.out.println("졌네...");
			
			else {
			
				if(user==1 && (user>com) || user==2 && (user>com) || user==3 && (user>com))
					System.out.println("이겼다!!!");
			
				else if(user==1 && (user==com) || user==2 && (user==com) || user==3 && (user==com))
					System.out.println("비겼다");

				else
					System.out.println("졌네...");
			}
		}
	
		else
			System.out.println("마 똑디 해라!");
	
		
		
		scan.close();
	}
	
}