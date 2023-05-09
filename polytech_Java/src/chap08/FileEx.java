package chap08;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		File f = new File("C:\\javaex\\file.txt");
		
		System.out.println( f.getName() );	//파일 이름
		System.out.println( f.getPath() );	//파일 경로
		System.out.println( f.getParent() );//파일이 있는 폴더
		System.out.println("파일 크기: " + f.length() );
		
		f = new File("C:\\javaex");
		
		if(f.isDirectory())
			System.out.println("디렉토리가 맞습니다.");
		
		File [] subFiles = f.listFiles();
		for(File ff : subFiles)
			System.out.println(ff.getName());

	}

}
