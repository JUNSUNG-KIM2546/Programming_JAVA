package chap03;


public class Mission369 {

	public static void main(String[] args) {
		//1. ���� �����Ѵ�.
		System.out.println("========< 3 6 9 ����! >========");
	
		
		for(int num =1; num<=100; num++){ 
										int x = num%10;
										int y = num/10;
										    
										if((x==3 || x==6 || x==9)&&(y==3 || y==6 || y==9))
											System.out.println(num + "�ڼ� ¦¦!!");
										
										else if((x==3 || x==6 || x==9)||(y==3 || y==6 || y==9))
											System.out.println(num + "�ڼ� ¦!");
										
										else
											System.out.print("");
										}
		
		
										
											}

						}
