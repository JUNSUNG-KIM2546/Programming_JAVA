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
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("황기태 시작 <Enter> 키 >>");
		String ent = sc.nextLine();
		
		if(ent.length() == 0) {
			System.out.println(msg + SS );
			H = SS;
			System.out.println("10초 예상 후 <Enter> 키 >>");
			String ent1 = sc.nextLine();
			if(ent1.length() == 0) {
				System.out.println(msg + ss);
				h = ss;
				HH = h - H;
			}
		}
		
		
		System.out.print("이재문 시작 <Enter> 키 >>");
		String ent2 = sc.nextLine();
		if(ent2.length() == 0) {
			System.out.println(msg + SS );
			H = SS;
			System.out.println("10초 예상 후 <Enter> 키 >>");
			String ent3 = sc.nextLine();
			if(ent3.length() == 0) {
				System.out.println(msg + ss);
				h = ss;
				hh = h - H;
			}	
		}		
		
	}

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();	//객체 생성
		Calendar now1 = Calendar.getInstance();	//객체 생성
		
		//Calendar now1 = Calendar.getInstance();
		Calendar("현재 초 시간 = ",now);
		//Calendar("현재 초 시간 = ",now1);
		
		
	}

}
