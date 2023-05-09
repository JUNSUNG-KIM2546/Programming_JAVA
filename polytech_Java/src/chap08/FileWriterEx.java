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
				
				fout.write(line, 0, line.length());		//append �������Ͽ� �̾ ���̱�,	write ���� ���� �ֱ�
				fout.write("\r\n", 0, 2);				//append �������Ͽ� �̾ ���̱�,	write ���� ���� �ֱ�
			}
			fout.close();	
		}
		
		catch(IOException e) {
			System.out.println("���� ����� ����");
		}
		sc.close();
		
	}

}
