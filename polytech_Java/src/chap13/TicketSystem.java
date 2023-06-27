package chap13;

public class TicketSystem extends Thread {
	int total;
	SellManager sm;
	
	@Override
	public void run() {
		String currentName = Thread.currentThread().getName();
		System.out.println(currentName + "- 시작");
		
		for(int i=0; i<3; i++) {
			System.out.println(currentName + "- 판매" + sm.sell());
		}
		
		System.out.println(currentName + "- 종료");
	}
	
	//생성자
	public TicketSystem() {
		total = 100;
		sm = new SellManager();
	}
	
	//내부 클래스 작성
	class SellManager {
		//티켓의 전체 갯수를 리턴하는 메소드	//synchronized = 중복 숫자 없게
		synchronized int sell() {
			total--;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return total;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("## 티켓 예매 시스템 ##");
		TicketSystem app = new TicketSystem();
		for(int i=0; i<10; i++) {
			Thread t = new Thread(app);
			t.start();
			Thread.sleep(500);
		}
		System.out.println(" main 메소드 종료! ");
	}

}
