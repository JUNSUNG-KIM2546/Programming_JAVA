package chap03;

import java.util.Scanner;

public class Mission12 {
	
	
public static void main(String[] args) {
	
//========================================================================	
	//int 2차원 배열
	int H[][] = {
					{1, 0, 0, 0, 1},
					{1, 0, 0, 0, 1},
					{1, 1, 1, 1, 1},
					{1, 0, 0, 0, 1},
					{1, 0, 0, 0, 1}			
				};
	for(int i=0; i<5;i++) {	// 행
							System.out.println();
							for(int j=0;j<H[i].length;j++) {	//열
															if(H[i][j]==1) 	System.out.print("■");
															else 		   	System.out.print(" ");
														   }								
						  }
								
	
	
								
	}
}

				

