package chap08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;


//1. 예외상황 처리 : throws 활용
//public class FileReaderEx {
//
//	public static void main(String[] args) throws IOException {	//IOException(텍스트파일, 문장 등 오류예외 부모) = 텍스트파일, 문장 등 오류 예외 처리
//		FileReader fin = new FileReader("C:\\javaex\\ex.txt");	//new FileReader("C:\\javaex\\ex.txt") 갈호안에 파일 위치, 이름
//		int c;
//		
//		while ((c=fin.read())!=-1) {	//!=-1 : EOF End of File
//			System.out.print((char)c);
//		}
//		fin.close();
//	}
//
//}

////2. 예외상황 처리 : try/catch 활용(Charset.forName("UTF-8") = 한들인코딩)
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

//3. 예외상황 처리 : try/catch 활용(한글인코딩)
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
