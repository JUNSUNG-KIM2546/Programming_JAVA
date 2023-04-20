package chap03;


public class Mission369 {

	public static void main(String[] args) {
		//1. °ªÀ» »ý¼ºÇÑ´Ù.
		System.out.println("========< 3 6 9 °ÔÀÓ! >========");
	
		
		for(int num =1; num<=100; num++){ 
										int x = num%10;
										int y = num/10;
										    
										if((x==3 || x==6 || x==9)&&(y==3 || y==6 || y==9))
											System.out.println(num + "¹Ú¼ö Â¦Â¦!!");
										
										else if((x==3 || x==6 || x==9)||(y==3 || y==6 || y==9))
											System.out.println(num + "¹Ú¼ö Â¦!");
										
										else
											System.out.print("");
										}
		
		
										
											}

						}
