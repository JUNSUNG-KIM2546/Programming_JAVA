package chap03;

import java.util.Scanner;

public class Selection_Sort {
	
	// 미션1. 정수 배열에 7개의 난수를 넣어라.
public static void main(String[] args) {
	
	int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
	
	System.out.print("정렬 전 : ");
	for(int iu : iu_height)
		System.out.print(iu + " ");
		System.out.println();
	
	   
	for(int i=0; i<7; i++)
		{
		// 최소값 알고리즘
		int min = iu_height[i];
		int min_index = i;
		
		for(int j=i+1; j<8; j++)
			{
			if(min > iu_height[j]) {
			min = iu_height[j];
			min_index = j;		   }
			}
			
		// 교환 알고리즘
		int temp = iu_height[min_index];
		iu_height[min_index] = iu_height[i];
		iu_height[i] = temp;
		
		}
		
		System.out.print("정렬 후 : ");
		for(int iu : iu_height)
			System.out.print(iu + " ");
		System.out.println();
		
										}
						}
	
//	System.out.print("최소값 찾기 : ");
//	// 최소값 알고리즘
//	int min = iu_height[0];
//	int min_index = 0;
//	for(int j=1; j<8; j++)
//		if(min > iu_height[j]) {
//			min = iu_height[j];
//			min_index = j;
//							   }
////	System.out.print(min);
////	System.out.print("[" + min_index + "]");
////	System.out.println();
//	
//	// 교환 알고리즘
//	int temp = iu_height[min_index];
//	iu_height[min_index] = iu_height[0];
//	iu_height[0] = temp;
//	
//	System.out.print("정렬 후 : ");
//	for(int iu : iu_height)
//		System.out.print(iu + " ");
//	System.out.println();
	
