package chap06;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx3 {
	
	public static void Calendar(Calendar cal) {
				
		
	}

	public static void main(String[] args) {
		
		//Calendar("���� �� �ð� = ",now);
		
		Scanner sc = new Scanner(System.in);
		int H = 0;
		int HH = 0;
		int h = 0;
		int hh = 0;
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("Ȳ���� ���� <Enter> Ű >>");
		String ent = sc.nextLine();
			//��ü ����
		
		if(ent.length() == 0) {
			Calendar now = Calendar.getInstance();
			int SS = now.get(Calendar.SECOND);
			System.out.println("���� �� �ð� = " + SS );
			H = SS;
			System.out.println("10�� ���� �� <Enter> Ű >>");
			String ent1 = sc.nextLine();
			
			if(ent1.length() == 0) {
				Calendar now1 = Calendar.getInstance();	//��ü ����
				int ss = now1.get(Calendar.SECOND);
				System.out.println("���� �� �ð� = " + ss);
				h = ss;
				HH = ss - SS;
			}
		}
		
		
		System.out.print("���繮 ���� <Enter> Ű >>");
		String ent2 = sc.nextLine();
		if(ent2.length() == 0) {
			Calendar now = Calendar.getInstance();
			int SS = now.get(Calendar.SECOND);
			System.out.println("���� �� �ð� = " + SS);
			H = SS;
			System.out.println("10�� ���� �� <Enter> Ű >>");
			String ent3 = sc.nextLine();
			
			if(ent3.length() == 0) {
				Calendar now1 = Calendar.getInstance();	//��ü ����
				int ss = now1.get(Calendar.SECOND);
				System.out.println("���� �� �ð� = " + ss);
				h = ss;
				hh = h - H;
			}	
		}
		
		
	}

}
