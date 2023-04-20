package chap03;

//Q. 1~100까지의 수 중에서 3의 배수만 합산한 결과(sum)을 출력하라

public class Mission5 {

	public static void main(String[] args) {
		//1. while문 활용 : 1~10까지의 수(num)를 합산한 결과 값(SUM)을 출력하시오.
//		int num = 1;
//		int sum = 0;						//누적합 (초기화는 항상 0)
//		
//		while(num<=10)	{
//						sum +=num;			
//						num++;
//						}
//		
//		System.out.println("sum = " + sum);
		
		
		//2. do while문 활용 : 1~10까지의 수(num)를 합산한 결과 값(SUM)을 출력하시오.
//		int num = 1;
//		int sum = 0;						//누적합 (초기화는 항상 0)
//		
//		  do{
//				sum +=num;			
//				num++;
//			}while	(num<=10);
//		  
//		System.out.println("sum = " + sum);
//		
		
		//3. for문 활용 : 1~10까지의 수(num)를 합산한 결과 값(SUM)을 출력하시오.
//		int sum = 0;
//		for(int num=1; num<=10; num++)
//			sum += num;
//		
//		System.out.println("sum = " + sum);
		
		
		//Q1. 1~100까지의 수 중에서 13의 배수만 합산한 결과(sum)을 출력하라
		int sum = 0;
		for(int num =1; num<=100; num++) 
		if(num%13==0) sum += num;
		System.out.println("sum = " + sum);
		
		//Q2. 1~100까지의 수 중에서 13이 되기 전까지만 합산한 결과(sum)을 출력하라
		sum = 0;
		for(int num =1; num<=100; num++){
			
		if(num%13==0) break;				//13이 되기 전까지 for 조건으로 돌아가서 반복, 13이 되면 브레이크
		sum += num;
										}
		System.out.println("sum = " + sum);
		
		
		//Q3. 1~100까지의 수 중 13의 배수를 제외한  숫자만 합산하라
		sum = 0;
		for(int num =1; num<=100; num++){
			
		if(num%13==0) continue;				//13의 배수를 제외하고 for 조건으로 돌아가서 반복
		sum += num;
										}
		System.out.println("sum = " + sum);
		
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++)
			System.out.println();
								}
		
	
		
	}

}
