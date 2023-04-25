package chap06;

import java.util.Calendar;

public class CalendarEx2 {
	
	public static void Calendar(String msg, Calendar cal) {
		int HH = cal.get(Calendar.SECOND);
		
		System.out.println(msg + HH );
	}

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
			
		Calendar("현재 초 시간 = ",now);
	}

}
