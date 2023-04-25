package chap06;

import java.util.Scanner;

public class AlpahabetHistogram {
	int histData[] = new int[26];	// 각 알바벳의 갯수를 카운터하는 정수형 배열
	
	// 초기화
	AlpahabetHistogram( ) {
		for (int i=0; i<histData.length; i++)
			histData[i] = 0;
	}
	
	// 동작을 해주는 메소드 : readString -> checkAlphabet -> drawHistogram
	void run() {
		checkAlphabet(readString());
		drawHistogram();
	}
	
	// 입력받은 (readString을 통해 가지고 온) 텍스트를 알파벳 별로 카운팅하는 메소드
	void checkAlphabet(String msg) {
		msg = msg.toUpperCase();
		int index;
		for(int i=0;i<msg.length(); i++) {
			char c = msg.charAt(i);
			if(c>='A' && c<='Z') {
				index = c - 'A';	// 아스키코드로 변환하고 뺀다.
				histData[index]++;
			}
		}
	}
	
	// 히스토그램을 그리는 메소드(+)
	void drawHistogram() {
		for(int i=0; i<histData.length; i++) {
			System.out.print((char)(i+'A') + " : ");
			for(int j=0; j<histData[i]; j++)
				System.out.print("+");
			System.out.println();
		}
	}
	
	
	// 텍스트를 입력받아 하나의 StringBuffer로 붙이고, String으로 변경하여 리턴하는 메소드
	String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		while (true) {
			String line = scan.nextLine();
			if(line.length() == 1 && line.charAt(0) == ';')
				break;
			sb.append(line);
		}
		scan.close();
		return sb.toString();
	}
	
	public static void main(String[] args) {
		AlpahabetHistogram al = new AlpahabetHistogram();
		//System.out.println(a1.readString());
		System.out.print(">>");
		al.run();
	}
	
}
// 스태틱이 아닌 얘들 앞에 객체를 선언해주고 불러와야한다.
// 스태틱 선언 해준 얘들은 그냥 명으로 불러올수있다.