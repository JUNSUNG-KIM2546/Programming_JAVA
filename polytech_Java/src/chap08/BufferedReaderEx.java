package chap08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Scanner;

public class BufferedReaderEx {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\javaex\\��ȣ.txt");
		
		while(true) {
		
		System.out.print("�Է�: 1, ��ȸ: 2, ����: �׸�>> ");
		String sel1 =  sc.nextLine();
		
		
		if(sel1.equals("1")) {
			FileWriter fout = new FileWriter(f, Charset.forName("UTF-8"), true);
			System.out.println("��ȭ��ȣ �Է� ���α׷� �Դϴ�.");
			System.out.println("�̸��� ��ȭ��ȣ(000-000-0000)�� �������� �����Ͽ� �ۼ����ּ���.");
			try {
				while(true) {
					System.out.print("�̸� ��ȭ��ȣ >> ");
					String line = sc.nextLine();
					if(line.equals("�׸�")) {
						break;
					}
					fout.append(line, 0, line.length() );
					fout.append("\r", 0, 1);	// \r ���� ù�ٷ� �̵�
				}
				fout.close();
			}
			catch (IOException e) {
				System.out.println("�Է� ����!!!");
			}
			
		}
		
		else if(sel1.equals("2")) {
			
			FileReader fr = new FileReader("C:\\javaex\\��ȣ.txt", Charset.forName("UTF-8"));
			
			BufferedReader reader = new BufferedReader(fr);
			
			HashMap<String, String> map = new HashMap<String, String>();
			
			String line;
			while((line = reader.readLine()) !=null) {
				System.out.println(line);
				String[] spline = line.split(" ");
				map.put(spline[0],spline[1]);
				System.out.println(map.get(spline[0]));
			}
			
			
			System.out.println("�� " + map.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");
			
			while(true) {
				System.out.print("�̸� >> ");
				String answer =  sc.nextLine();
				
				if(answer.equals("�׸�")) {
					System.out.println("�˻� ����");
					break;
				}
				
				System.out.println(map.get(answer));
			}
			
			reader.close();
		}
		
		else {
			System.out.println("�����մϴ�.");
			break;
		}	
		
		}
		sc.close();
	}
}
