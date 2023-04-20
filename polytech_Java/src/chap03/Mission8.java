package chap03;

import java.util.Scanner;

public class Mission8 {
	
public static void main(String[] args) {
	
		int count = 0, sum =0;	// count 입력된 정수의 개수
		//int sum = 0;	// sum은 합
		double average = 0.0;	// 평균
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력");
		
		int n = scanner.nextInt();	// 정수 입력*
		
		while (n != -1) {			// 센티널, 보초값 -1*
			sum += n;
			count++;
			n = scanner.nextInt();	// 정수 입력*
						} 
		
		if(count > 0) {
			System.out.println("정수의 갯수 : " + count);
			average = (double)sum / count;
			System.out.println("평균 : " + average + "점");
					  }
		else
			System.out.println("정수의 갯수가 0이라, 평균을 구할 수가 없습니다.");
		
		
//		import java.util.Scanner;
//		public class WhileSample {
//			public static void main(String[] args) {
//				int count=0; // count는 입력된 정수의 개수
//				int sum=0; // sum은 합
//				Scanner scanner = new Scanner(System.in);		
//				System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
//
//				int n = scanner.nextInt(); // 정수 입력
//				while(n != -1) { // -1이 입력되면 while 문 벗어남
//					sum += n;
//					count++;
//					n = scanner.nextInt(); // 정수 입력
//				}
//				if(count == 0) System.out.println("입력된 수가 없습니다.");
//				else {
//					System.out.print("정수의 개수는 " + count + "개이며 ");
//					System.out.println("평균은 " + (double)sum/count + "입니다.");
//				}
//				scanner.close();
//			}
//		}

		
		scanner.close();
		
									   }
					}
