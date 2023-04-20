package chap05;

interface PhoneInterface{		//인터페이스 선언
	final int TIMEOUT = 10000;	//상수 필드 선언
	abstract void sendCall();	//추상 메소드
	abstract void receiveCall();	//추상 메소드
	default void printLogo() {	// 디폴트 메소드
		System.out.println("**Phone**");
	}
	
}


public class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("띠리리리링!");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
		
	}
	
	
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
		System.out.println(phone.TIMEOUT);
		
	}

	

}
