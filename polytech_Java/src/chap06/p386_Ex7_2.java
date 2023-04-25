package chap06;

import java.util.Scanner;

//split() 이용한 프로그램
public class p386_Ex7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>> ");
			String text = sc.nextLine();
			
			if(text.equals("그만")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
			else {
				
				String s[] = text.split(" ");
				int count = 0;
				for(String n : s)
					count++;
				int co = count;
				System.out.println("어절 개수 :" + co);
				System.out.println("어절 개수 :" + s.length);
			
			}	

		}
			
	}

}
