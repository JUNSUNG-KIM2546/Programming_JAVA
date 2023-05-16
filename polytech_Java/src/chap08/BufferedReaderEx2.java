package chap08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BufferedReaderEx2 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\javaex\\phone.txt");
		
		while(true) {
		
			System.out.println("�˻�:1	�ֱ�:2	����:3");
			System.out.print(">> ");
			int sce = sc.nextInt();
			
			
			
			if (sce == 2) {
				FileWriter fout = new FileWriter(f, Charset.forName("UTF-8"), true);
				System.out.println("�ֱ�");
				System.out.print(">> ");	
				
				try {
					
					while(true) {
						String line = sc.nextLine();
						
						if(line.equals("�׸�"))
							break;
						
						fout.append(line, 0, line.length());	//append �������Ͽ� �̾ ���̱�,	write ���� ���� �ֱ�
						fout.append("\r", 0, 2);				// \r ������ ù��°��
					}
					fout.close();	
				}
				
				catch(IOException e) {
					System.out.println("���� ����� ����");
				}	
			}
			
			else if(sce == 1) {
				
				FileReader fr = new FileReader("C:\\javaex\\phone.txt", Charset.forName("UTF-8")); 
				
				System.out.println("�˻�");
				
				String sci = sc.nextLine();
					
				BufferedReader reader = new BufferedReader(fr);
				
				String line;
				
				StringTokenizer st;
				
				HashMap<String, String> map;
				
				while(!(line = reader.readLine()).equals(" ")) {
					//System.out.println(line);
					map = new HashMap<String, String>();
					st = new StringTokenizer(line," ");
					
					while (st.hasMoreTokens()) {
						map.put(st.nextToken(), st.nextToken());
						System.out.println(map);
					}
					
				}
					
			}
			
			else {
				System.exit(0);
			}
		
		sc.close();
		
		}
	}

}
