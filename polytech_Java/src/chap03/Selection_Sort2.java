package chap03;

import java.util.Scanner;

public class Selection_Sort2 {
	
	// �̼�1. ���� �迭�� 7���� ������ �־��.
public static void main(String[] args) {
	
	int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
	
	System.out.print("���� �� : ");
	for(int iu : iu_height)
		System.out.print(iu + " ");
		System.out.println();
	
	   
	for(int i=0; i<7; i++)
		{
		// �ִ밪 �˰���
		int max = iu_height[i];
		int max_index = i;
		
		for(int j=i+1; j<8; j++)
			{
			if(max > iu_height[j]) {
			max = iu_height[j];
			max_index = j;		   }
			}
			
		// ��ȯ �˰���
		int temp = iu_height[max_index];
		iu_height[max_index] = iu_height[i];
		iu_height[i] = temp;
		
		}
		
		System.out.print("���� �� : ");
		for(int iu : iu_height)
			System.out.print(iu + " ");
		System.out.println();
		
										}
						}

				
