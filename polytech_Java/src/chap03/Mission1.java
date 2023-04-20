package chap03;

import java.util.Scanner;

public class Mission1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. while 문 사용
//		System.out.println("토익 점수 >> ");
//		int toeic = scan.nextInt();
//		
//		while(toeic<700) {					// 조건에 만족할 때까지 반복
//			System.out.println("공부를 하셈");
//			System.out.println("시험을 보자");
//			System.out.println("토익 점수 >> ");
//				toeic = scan.nextInt();
//		}
//
//		System.out.println("드디어 토익 탈출!!");
		
		
		// 2. while 문 사용 (무한반복 정해진 조건에 스탑) **추천
		System.out.println("토익 점수 >> ");
		int toeic = scan.nextInt();
		
		while(true) {					// 조건에 만족할 때까지 반복
			if(toeic<700) break;
			System.out.println("공부를 하셈");
			System.out.println("시험을 보자");
			System.out.println("토익 점수 >> ");
				toeic = scan.nextInt();
		}

		System.out.println("드디어 토익 탈출!!");
		
		
	}

}
