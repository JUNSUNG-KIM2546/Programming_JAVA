package network;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1", 5000);
		System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		pw.println("���ݺ��� �����͸� �����մϴ�.");
		pw.close();
		s.close();
	}
}
