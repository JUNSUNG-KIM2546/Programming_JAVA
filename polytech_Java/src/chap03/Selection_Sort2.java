package chap03;

import java.util.Scanner;

public class Selection_Sort2 {
	
	// 미션1. 정수 배열에 7개의 난수를 넣어라.
public static void main(String[] args) {
	
	int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
	
	System.out.print("정렬 전 : ");
	for(int iu : iu_height)
		System.out.print(iu + " ");
		System.out.println();
	
	   
	for(int i=0; i<7; i++)
		{
		// 최대값 알고리즘
		int max = iu_height[i];
		int max_index = i;
		
		for(int j=i+1; j<8; j++)
			{
			if(max > iu_height[j]) {
			max = iu_height[j];
			max_index = j;		   }
			}
			
		// 교환 알고리즘
		int temp = iu_height[max_index];
		iu_height[max_index] = iu_height[i];
		iu_height[i] = temp;
		
		}
		
		System.out.print("정렬 후 : ");
		for(int iu : iu_height)
			System.out.print(iu + " ");
		System.out.println();
		
										}
						}

				
