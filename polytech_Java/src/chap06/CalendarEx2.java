package chap06;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx2 {
	
	public static void Calendar(String msg, Calendar cal) {
		int SS = cal.get(Calendar.SECOND);
		int ss = cal.get(Calendar.SECOND);
		Scanner sc = new Scanner(System.in);
		int H = 0;
		int HH = 0;
		int h = 0;
		int hh = 0;
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("Ȳ���� ���� <Enter> Ű >>");
		String ent = sc.nextLine();
		
		if(ent.length() == 0) {
			System.out.println(msg + SS );
			H = SS;
			System.out.println("10�� ���� �� <Enter> Ű >>");
			String ent1 = sc.nextLine();
			if(ent1.length() == 0) {
				System.out.println(msg + ss);
				h = ss;
				HH = h - H;
			}
		}
		
		
		System.out.print("���繮 ���� <Enter> Ű >>");
		String ent2 = sc.nextLine();
		if(ent2.length() == 0) {
			System.out.println(msg + SS );
			H = SS;
			System.out.println("10�� ���� �� <Enter> Ű >>");
			String ent3 = sc.nextLine();
			if(ent3.length() == 0) {
				System.out.println(msg + ss);
				h = ss;
				hh = h - H;
			}	
		}		
		
	}

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();	//��ü ����
		Calendar now1 = Calendar.getInstance();	//��ü ����
		
		//Calendar now1 = Calendar.getInstance();
		Calendar("���� �� �ð� = ",now);
		//Calendar("���� �� �ð� = ",now1);
		
		
	}

}
