package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//HangManGame ���� ����
//==================//
public class HangManGameEx {
	//1. �ܾ �������� ���
	//2. ���� 2���� ����� ���(HiddenWord) : 2���� ���ڸ� ����� �ش� ���ڴ� _ǥ�÷� �ٲ�
	//3. ���ڸ� �ϳ��� �����ش�. ���� ���ڿ� ��ġ Ȯ��, �´ٰ� ���ְ� _��� �ش� ���ڷ� ��ü�ϴ� ���
	//4. 2������ ���� �� �ֵ��� �ϴ� ���
	//5. ���� ������ ���� �� �ִ� ���
	final int BlankMax = 2;
	final int TrialMax = 3;
	String randomWord;
	StringBuffer hiddenWord;
	Scanner scanner = new Scanner(System.in);
	
	void hideLetter() {	//���� 2���� ���ܼ� hiddenWord�� �����.
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
	
	boolean go() {	//������ �����մϴ�. �õ�Ƚ�� ������ ���ڸ� �ϼ���Ų��. ���� ������ �ϴ� �޼ҵ�
		boolean success = false;
		int count = 0;
		
		while(true) {
			count++;	//���� ���ߴ� Ƚ��
			
			if(count > TrialMax)
				break;
			
			System.out.println(hiddenWord);
			System.out.println(count + "ȸ �õ�");
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
		System.out.println("< ��� ������ �����մϴ� >");
		//������ Words �����ڿ� �־� Vector�� ��ȯ�մϴ�.
		Words words = new Words("C:\\javaex\\words.txt");
		//������ �����մϴ�.
		while(true) {
			randomWord = words.getRandomWord();
			System.out.println(randomWord);
			
			hideLetter();	//���� 2���� ���ܼ� hiddenWord�� �����.
			System.out.println(hiddenWord);
			
			if(go())		//������ �����մϴ�. �õ�Ƚ�� ������ ���ڸ� �ϼ���Ų��.
				System.out.println("success");
			else
				System.out.println("fail");
			
			System.out.println("������ �� �Ͻðڽ��ϱ�? ( y / n )");
		
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
