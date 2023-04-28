package chap06;

import java.util.Calendar;

public class CalendarEx {
	
	public static void Calendar(String msg, Calendar cal, String mm) {
		int HH = cal.get(Calendar.HOUR); //12시간
		int HoD = cal.get(Calendar.HOUR_OF_DAY); //24시간
		int MM = cal.get(Calendar.MINUTE);
		int AP = cal.get(Calendar.AM_PM);
		
		System.out.println(msg + HH + "시 " + MM + mm);
		
		if (AP == Calendar.AM && (HH < 4) || AP == Calendar.PM && (HH > 10))
			System.out.println("굿 나잇");
		
		else if (AP == Calendar.AM && (HH < 12 && 4 <= HH))
			System.out.println("굿 모닝");
		
		else if (AP == Calendar.PM && (HH < 6))
			System.out.println("Good Afternoon");
		
		else
			System.out.println("Good Evening");	
	}

	public static void main(String[] args) {
		
		Calendar nows = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		Calendar now1 = Calendar.getInstance();
		
		now1.set(Calendar.AM_PM,1);	//0(짝수) = 오후 , 1(홀수) = 오전
		now1.set(Calendar.HOUR,12);
		now1.set(Calendar.MINUTE,52);
		
		Calendar("현재 시간은 ",now,"분 입니다.");	//12시간
		Calendar("현재 시간은 ",nows,"분 입니다.");	//24시간
		Calendar("설정 시간은 ",now1,"분 입니다.");
	}

}
