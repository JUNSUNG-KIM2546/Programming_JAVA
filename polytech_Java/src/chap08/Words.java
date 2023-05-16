package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

 // Words 클래스 구성(생성자, 글자1개를 추룰하는 메소드)
//words.txt 파일을 읽고 백터에 저장하고 벡터로부터 랜덤하게 단어를 추출하는 클래스
//=======================================//
class Words{	
	static public Vector<String> wordVector = new Vector<String>();
	
	public Words(String filename) {
		// 스캐너 사용하여 파일 읽기
		try {
			Scanner scan = new Scanner(new FileReader(filename));
			
			while(scan.hasNext()) {
			String words = scan.nextLine();
			wordVector.add(words);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(0);	//시스템(프로그램) 종료
		}	
	}
	
	public void printVector() {
		for(String s : wordVector)
			System.out.println(s);
	}
	
	
	public String getRandomWord() {
		 final int WORDMAX = wordVector.size();	//변하지 않는 값
		 int randomIndex = (int)(Math.random() * WORDMAX);
		 return wordVector.get(randomIndex);		
	}
}

