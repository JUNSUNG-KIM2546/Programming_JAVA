package chap03;

public class Mission4 {

	public static void main(String[] args) {
//		//1. while문 활용 : 1~10까지의 수(num)를 합산한 결과 값(SUM)을 출력하시오.
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
		
		
		//3. for문 활용 : 1~10까지의 수(num)를 합산한 결과 값(SUM)을 출력하시오.
		int sum = 0;
		for(int num=1; num<=10; num++)
			sum += num;
		
		System.out.println("sum = " + sum);
		
	}

}
