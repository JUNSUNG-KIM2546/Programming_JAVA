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
		File f = new File("C:\\javaex\\번호.txt");
		
		while(true) {
		
		System.out.print("입력: 1, 조회: 2, 종료: 그만>> ");
		String sel1 =  sc.nextLine();
		
		
		if(sel1.equals("1")) {
			FileWriter fout = new FileWriter(f, Charset.forName("UTF-8"), true);
			System.out.println("전화번호 입력 프로그램 입니다.");
			System.out.println("이름과 전화번호(000-000-0000)를 공백으로 구분하여 작성해주세요.");
			try {
				while(true) {
					System.out.print("이름 전화번호 >> ");
					String line = sc.nextLine();
					if(line.equals("그만")) {
						break;
					}
					fout.append(line, 0, line.length() );
					fout.append("\r", 0, 1);	// \r 다음 첫줄로 이동
				}
				fout.close();
			}
			catch (IOException e) {
				System.out.println("입력 오류!!!");
			}
			
		}
		
		else if(sel1.equals("2")) {
			
			FileReader fr = new FileReader("C:\\javaex\\번호.txt", Charset.forName("UTF-8"));
			
			BufferedReader reader = new BufferedReader(fr);
			
			HashMap<String, String> map = new HashMap<String, String>();
			
			String line;
			while((line = reader.readLine()) !=null) {
				System.out.println(line);
				String[] spline = line.split(" ");
				map.put(spline[0],spline[1]);
				System.out.println(map.get(spline[0]));
			}
			
			
			System.out.println("총 " + map.size() + "개의 전화번호를 읽었습니다.");
			
			while(true) {
				System.out.print("이름 >> ");
				String answer =  sc.nextLine();
				
				if(answer.equals("그만")) {
					System.out.println("검색 종료");
					break;
				}
				
				System.out.println(map.get(answer));
			}
			
			reader.close();
		}
		
		else {
			System.out.println("종료합니다.");
			break;
		}	
		
		}
		sc.close();
	}
}
