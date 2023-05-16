package chap08;

import java.util.Scanner;

public class WordsSearchEx {

	Words words;
	Scanner scan;
	int count;
	
	//1. 단어검색
	boolean go() {
		boolean success = false;
		count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("단어 >> ");
		String search = scan.nextLine();
//		System.out.println(search);
		
		//코드1 : 검색하는 기능
		for(String ss : words.wordVector) {
			if(ss.length() >= search.length()) {
				String front = ss.substring(0, search.length());
				if(search.equals(front)) {
					System.out.println(ss);
					success = true;
					count++;
				}
			}	
		}
		
		//코드2 : 검색하는 기능(exception 활용)
//		for(String ss : words.wordVector) {
//			try {
//				String front = ss.substring(0, search.length());
//				if(search.equals(front)) {
//					System.out.println(ss);
//					success = true;
//					count++;
//				}
//			}
//			catch (StringIndexOutOfBoundsException e) {
//				continue;
//			}	
//		}
		
		return success;
	}
	
	//2. 단어찾기게임 - 시나리오
	void run() {
		System.out.println("< 단어 찾기 게임을 시작합니다. >");
		words = new Words("C:\\javaex\\words.txt");
		
		scan = new Scanner(System.in);
		System.out.print("단어 >> ");
		String search = scan.next();
		
		while(true) {
			if(go()) {
				System.out.println("YOU SUCCESS !" + count + "개 검색!");
			}
			
			else {
				System.out.println("YOU FAIL !");
			}
			
			System.out.println("게임을 더 하시겠습니까? ( y / n )");
			
			if (scan.next().equals("n"))
				break;
		}
	}
	
	public static void main(String[] args) {
		WordsSearchEx ex = new WordsSearchEx();
		ex.run();
	}

}

	
