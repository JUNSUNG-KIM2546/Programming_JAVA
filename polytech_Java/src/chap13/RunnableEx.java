package chap13;

public class RunnableEx implements Runnable {
	@Override
	public void run() {
		System.out.println("RUN���� ����� ���!");
	}

	public static void main(String[] args) {
		RunnableEx ex = new RunnableEx();
		Thread t = new Thread(ex);
		t.start();
		System.out.println("main���� ����� ���!");

	}

}
