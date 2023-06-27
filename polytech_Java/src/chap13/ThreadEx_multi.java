package chap13;

public class ThreadEx_multi extends Thread {
	@Override
	public void run() {
		// 현재쓰레드를 가져오기
		String currentTread = Thread.currentThread().getName();
		System.out.println(currentTread + "--- 시작");
		for(int i=1; i<=10; i++) {
			System.out.println(currentTread + "-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		System.out.println(currentTread + "--- 종료");
	}

	public static void main(String[] args) {
		ThreadEx_multi ex;// = new ThreadEx_multi();
		System.out.println("Thread 시작 =================== ");
		for(int i=1; i<=2;i++) {
			//Thread t = new Thread(ex);
			//t.start();
			ex = new ThreadEx_multi();
			ex.start();
		}
		
		System.out.println("Thread 종료 =================== ");
	}

}
