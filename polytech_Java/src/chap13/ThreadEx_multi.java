package chap13;

public class ThreadEx_multi extends Thread {
	@Override
	public void run() {
		// ���羲���带 ��������
		String currentTread = Thread.currentThread().getName();
		System.out.println(currentTread + "--- ����");
		for(int i=1; i<=10; i++) {
			System.out.println(currentTread + "-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		System.out.println(currentTread + "--- ����");
	}

	public static void main(String[] args) {
		ThreadEx_multi ex;// = new ThreadEx_multi();
		System.out.println("Thread ���� =================== ");
		for(int i=1; i<=2;i++) {
			//Thread t = new Thread(ex);
			//t.start();
			ex = new ThreadEx_multi();
			ex.start();
		}
		
		System.out.println("Thread ���� =================== ");
	}

}
