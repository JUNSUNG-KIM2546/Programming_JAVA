package chap06;

import java.util.Scanner;

//split() �̿��� ���α׷�
public class p386_Ex7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>> ");
			String text = sc.nextLine();
			
			if(text.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
			
			else {
				
				String s[] = text.split(" ");
				int count = 0;
				for(String n : s)
					count++;
				int co = count;
				System.out.println("���� ���� :" + co);
				System.out.println("���� ���� :" + s.length);
			
			}	

		}
			
	}

}
