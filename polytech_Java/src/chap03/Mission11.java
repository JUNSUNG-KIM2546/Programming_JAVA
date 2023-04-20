package chap03;

import java.util.Scanner;

public class Mission11 {
	
	// 선택 정렬(오름차순)
public static void main(String[] args) {
	
	int lotto_num[] = new int [7];
	String names[] = {"엄남경", "김준성", "이유진","정승복","정웅기"};
	
	// 배열에 값 입력
	for(int i=0; i<7; i++) {
		lotto_num[i] = (int)(1+Math.random() * 45);
		
		for(int j=0; j<i; j++)
			
			if(lotto_num[i]==lotto_num[j])i--;
						   }
	// 배열에 값 출력
//	for(int i=0; i<7; i++) 
//		System.out.printf("%5d", lotto_num[i]);
						
	
	//foreach문을 이용한 값 출력
	for(int num : lotto_num) 
		System.out.printf("%5d", num);
	
	for(String name : names)
		System.out.printf("\n%5s", name);
						   
									   }
					}
				

