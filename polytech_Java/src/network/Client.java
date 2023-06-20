package network;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1", 5000);
		System.out.println("클라이언트가 실행되었습니다.");
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		pw.println("지금부터 데이터를 전송합니다.");
		pw.close();
		s.close();
	}
}
