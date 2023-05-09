package chap08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		FileWriter fout = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			fout = new FileWriter("C:\\javaex\\test.txt");
			
			while(true) {
				String line = sc.nextLine();
				
				if(line.length() == 0)
					break;
				
				fout.write(line, 0, line.length());		//append 기존파일에 이어서 붙이기,	write 새로 만들어서 넣기
				fout.write("\r\n", 0, 2);				//append 기존파일에 이어서 붙이기,	write 새로 만들어서 넣기
			}
			fout.close();	
		}
		
		catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
		sc.close();
		
	}

}
