package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

// StringTokenizer �̿��� ���α׷�
public class p386_Ex7_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
//		while (true) {
//			int count = 0;
//			System.out.print(">>>");
//			String msg = sc.nextLine();
//			if(msg.equals("�׸�")) {
//				System.out.println("�����մϴ�.");
//				System.exit(0);
//			}
//			
//			st = new StringTokenizer(msg, " ");
//			while (st.hasMoreTokens()) {
//				st.nextToken();
//				count++;
//			}
//			System.out.println("���� ���� :" + count);
//		}
		
		while (true) {
			System.out.print(">>>");
			String msg = sc.nextLine();
			if(msg.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
			
			st = new StringTokenizer(msg, " ");
			
			System.out.println("���� ���� :" + st.countTokens());
		}
			
	}
			
}


