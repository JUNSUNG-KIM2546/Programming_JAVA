package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

// StringTokenizer 이용한 프로그램
public class p386_Ex7_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
//		while (true) {
//			int count = 0;
//			System.out.print(">>>");
//			String msg = sc.nextLine();
//			if(msg.equals("그만")) {
//				System.out.println("종료합니다.");
//				System.exit(0);
//			}
//			
//			st = new StringTokenizer(msg, " ");
//			while (st.hasMoreTokens()) {
//				st.nextToken();
//				count++;
//			}
//			System.out.println("어절 개수 :" + count);
//		}
		
		while (true) {
			System.out.print(">>>");
			String msg = sc.nextLine();
			if(msg.equals("그만")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
			st = new StringTokenizer(msg, " ");
			
			System.out.println("어절 개수 :" + st.countTokens());
		}
			
	}
			
}


