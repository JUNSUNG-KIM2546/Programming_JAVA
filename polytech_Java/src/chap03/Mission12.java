package chap03;

import java.util.Scanner;

public class Mission12 {
	
	
public static void main(String[] args) {
	
//========================================================================	
	//int 2���� �迭
	int H[][] = {
					{1, 0, 0, 0, 1},
					{1, 0, 0, 0, 1},
					{1, 1, 1, 1, 1},
					{1, 0, 0, 0, 1},
					{1, 0, 0, 0, 1}			
				};
	for(int i=0; i<5;i++) {	// ��
							System.out.println();
							for(int j=0;j<H[i].length;j++) {	//��
															if(H[i][j]==1) 	System.out.print("��");
															else 		   	System.out.print(" ");
														   }								
						  }
								
	
	
								
	}
}

				

