package chap13;

public class ThreadEx extends Thread {
	@Override
	public void run() {
		System.out.println("RUN���� ����� ���!");
	}

	public static void main(String[] args) {
		// JVM�� �����ϴ°Ŷ� start�� �����ؾ��Ѵ�.
		ThreadEx ex = new ThreadEx();
		//ex.run();
		ex.start();
		System.out.println("main���� ����� ���");

	}

}
