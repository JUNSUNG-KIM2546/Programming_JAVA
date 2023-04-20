package chap03;

import java.util.Scanner;

public class Mission9 {
	
public static void main(String[] args) {
	
		int count = 0, sum =0;	// count 입력된 정수의 개수
		//int sum = 0;	// sum은 합
		double average = 0.0;	// 평균
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력");
		
		int n = 0;
		
	    do {
			sum += n;
			count++;
			n = scanner.nextInt();	// 정수 입력*
		   } while (n != -1);	// 센티널, 보초값 -1*
	    
	    count = count - 1;
		
		if(count > 0) {
			System.out.println("정수의 갯수 : " + count);
			average = (double)sum / count;
			System.out.println("평균 : " + average + "점");
					  }
		else
			System.out.println("정수의 갯수가 0이라, 평균을 구할 수가 없습니다.");
			
		scanner.close();
		
									   }
					}
