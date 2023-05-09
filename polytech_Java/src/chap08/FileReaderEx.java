package chap08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;


//1. ���ܻ�Ȳ ó�� : throws Ȱ��
//public class FileReaderEx {
//
//	public static void main(String[] args) throws IOException {	//IOException(�ؽ�Ʈ����, ���� �� �������� �θ�) = �ؽ�Ʈ����, ���� �� ���� ���� ó��
//		FileReader fin = new FileReader("C:\\javaex\\ex.txt");	//new FileReader("C:\\javaex\\ex.txt") ��ȣ�ȿ� ���� ��ġ, �̸�
//		int c;
//		
//		while ((c=fin.read())!=-1) {	//!=-1 : EOF End of File
//			System.out.print((char)c);
//		}
//		fin.close();
//	}
//
//}

////2. ���ܻ�Ȳ ó�� : try/catch Ȱ��(Charset.forName("UTF-8") = �ѵ����ڵ�)
public class FileReaderEx {

	public static void main(String[] args) {	
		FileReader fin;
		
		try {
			fin = new FileReader("C:\\javaex\\ex.txt", Charset.forName("UTF-8"));
			int c;
		
			while ((c=fin.read())!=-1) {	
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

//3. ���ܻ�Ȳ ó�� : try/catch Ȱ��(�ѱ����ڵ�)
//public class FileReaderEx {
//
//	public static void main(String[] args) {	
//		FileInputStream in;
//		
//		try {
//			in = new FileInputStream("C:\\javaex\\ex.txt");
//			InputStreamReader fin = new InputStreamReader(in, "UTF-8");
//			int c;
//		
//			while ((c=fin.read())!=-1) {	
//				System.out.print((char)c);
//			}
//			fin.close();
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
