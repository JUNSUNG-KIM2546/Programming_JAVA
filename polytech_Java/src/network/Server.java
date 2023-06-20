package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {
	public static void main(String[] args) throws Exception {
		
			ServerSocket server = new ServerSocket(5000);
			System.out.println("서버 실행 ================================");
			while(true) {
				Socket s = server.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				System.out.println("클라이언트의 내용 =======");
				System.out.println(br.readLine());
				br.close();
			}	
	
	}
}
