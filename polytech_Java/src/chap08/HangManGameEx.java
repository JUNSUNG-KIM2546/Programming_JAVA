package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//HangManGame 게임 구성
//==================//
public class HangManGameEx {
	//1. 단어를 가져오는 기능
	//2. 글자 2개를 숨기는 기능(HiddenWord) : 2개의 글자를 숨기고 해당 글자는 _표시로 바꿈
	//3. 글자를 하나씩 맞춰준다. 숨긴 문자와 일치 확인, 맞다고 해주고 _대신 해당 문자로 교체하는 기능
	//4. 2개까지 맞출 수 있도록 하는 기능
	//5. 직접 게임을 해줄 수 있는 기능
	final int BlankMax = 2;
	final int TrialMax = 3;
	String randomWord;
	StringBuffer hiddenWord;
	Scanner scanner = new Scanner(System.in);
	
	void hideLetter() {	//글자 2개를 숨겨서 hiddenWord를 만든다.
		hiddenWord = new StringBuffer(randomWord);
		Random r = new Random();
		for(int i=0; i<BlankMax; i++) {
			int index = r.nextInt(hiddenWord.length());
			char c = randomWord.charAt(index);
			
			for(int j=0; j<randomWord.length(); j++) {
				if(hiddenWord.charAt(j) == c) {
					hiddenWord.setCharAt(j, '_');
				}									
			}
		}
	}
	
	boolean go() {	//게임을 진행합니다. 시도횟수 내에서 글자를 완성시킨다. 실제 게임을 하는 메소드
		boolean success = false;
		int count = 0;
		
		while(true) {
			count++;	//글자 맞추는 횟수
			
			if(count > TrialMax)
				break;
			
			System.out.println(hiddenWord);
			System.out.println(count + "회 시도");
			System.out.print(">> ");
			String st =  scanner.next();
			char key = st.charAt(0);
			
			for(int i=0; i<randomWord.length(); i++)
				if(randomWord.charAt(i)==key && hiddenWord.charAt(i)=='_') {
					hiddenWord.setCharAt(i, key);
				}
			
			String msg = new String(hiddenWord);
			
			if(randomWord.equals(msg)) {
				success = true;
				break;
			}
		}
		return success;
	}
	
	void run() {
		System.out.println("< 행맨 게임을 시작합니다 >");
		//파일을 Words 생성자에 넣어 Vector로 변환합니다.
		Words words = new Words("C:\\javaex\\words.txt");
		//게임을 시작합니다.
		while(true) {
			randomWord = words.getRandomWord();
			System.out.println(randomWord);
			
			hideLetter();	//글자 2개를 숨겨서 hiddenWord를 만든다.
			System.out.println(hiddenWord);
			
			if(go())		//게임을 진행합니다. 시도횟수 내에서 글자를 완성시킨다.
				System.out.println("success");
			else
				System.out.println("fail");
			
			System.out.println("게임을 더 하시겠습니까? ( y / n )");
		
			if(scanner.next().equals("n")) {
				break;
			}
		}
	}
		
	public static void main(String[] args) {
		HangManGameEx game = new HangManGameEx();
		game.run();
	}

}
