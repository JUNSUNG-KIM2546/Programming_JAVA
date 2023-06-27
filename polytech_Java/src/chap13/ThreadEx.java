package chap13;

public class ThreadEx extends Thread {
	@Override
	public void run() {
		System.out.println("RUN에서 실행된 결과!");
	}

	public static void main(String[] args) {
		// JVM이 실행하는거라 start로 실행해야한다.
		ThreadEx ex = new ThreadEx();
		//ex.run();
		ex.start();
		System.out.println("main에서 실행된 결과");

	}

}
