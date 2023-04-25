package chap06;

import java.util.Calendar;

public class CalendarEx {
	
	public static void Calendar(String msg, Calendar cal, String mm) {
		int HH = cal.get(Calendar.HOUR);
		int MM = cal.get(Calendar.MINUTE);
		int AP = cal.get(Calendar.AM_PM);
		
		System.out.println(msg + HH + "�� " + MM + mm);
		
		if (AP == Calendar.AM && (HH < 4) || AP == Calendar.PM && (HH > 10))
			System.out.println("�� ����");
		
		else if (AP == Calendar.AM && (HH < 12 && 4 <= HH))
			System.out.println("�� ���");
		
		else if (AP == Calendar.PM && (HH < 6))
			System.out.println("Good Afternoon");
		
		else
			System.out.println("Good Evening");	
	}

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		Calendar now1 = Calendar.getInstance();
		
		now1.set(Calendar.AM_PM,1);	//0(¦��) = ���� , 1(Ȧ��) = ����
		now1.set(Calendar.HOUR,12);
		now1.set(Calendar.MINUTE,52);
		
		Calendar("���� �ð��� ",now,"�� �Դϴ�.");
		Calendar("���� �ð��� ",now1,"�� �Դϴ�.");
	}

}
