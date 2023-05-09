package chap08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
		
		while(true) {
		
			System.out.println("검색:1	넣기:2	종료:3");
			System.out.print(">> ");
			Scanner sc = new Scanner(System.in);
			int sce = sc.nextInt();
			
			
			
			if (sce == 2) {
				System.out.println("넣기");
				System.out.print(">> ");
				FileWriter fout = null;
				
				try {
					fout = new FileWriter("C:\\javaex\\phone.txt",true);
					
					while(true) {
						String line = sc.nextLine();
						
						if(line.length() == 0)
							break;
						
						fout.append(line, 0, line.length());	//append 기존파일에 이어서 붙이기,	write 새로 만들어서 넣기
						fout.append("\r\n", 0, 2);				//append 기존파일에 이어서 붙이기,	write 새로 만들어서 넣기
					}
					fout.close();	
				}
				
				catch(IOException e) {
					System.out.println("파일 입출력 오류");
				}	
			}
			
			else if(sce == 1) {
				System.out.println("검색");
				
				String sci = sc.nextLine();
				
				File f = new File("C:\\javaex\\phone.txt"); 
				
				InputStreamReader fin = new InputStreamReader(new FileInputStream(f), "UTF-8");
					
				BufferedReader reader = new BufferedReader(fin);
				
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
