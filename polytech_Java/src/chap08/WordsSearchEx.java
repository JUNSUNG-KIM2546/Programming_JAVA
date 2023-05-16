package chap08;

import java.util.Scanner;

public class WordsSearchEx {

	Words words;
	Scanner scan;
	int count;
	
	//1. �ܾ�˻�
	boolean go() {
		boolean success = false;
		count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("�ܾ� >> ");
		String search = scan.nextLine();
//		System.out.println(search);
		
		//�ڵ�1 : �˻��ϴ� ���
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
		
		//�ڵ�2 : �˻��ϴ� ���(exception Ȱ��)
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
	
	//2. �ܾ�ã����� - �ó�����
	void run() {
		System.out.println("< �ܾ� ã�� ������ �����մϴ�. >");
		words = new Words("C:\\javaex\\words.txt");
		
		scan = new Scanner(System.in);
		System.out.print("�ܾ� >> ");
		String search = scan.next();
		
		while(true) {
			if(go()) {
				System.out.println("YOU SUCCESS !" + count + "�� �˻�!");
			}
			
			else {
				System.out.println("YOU FAIL !");
			}
			
			System.out.println("������ �� �Ͻðڽ��ϱ�? ( y / n )");
			
			if (scan.next().equals("n"))
				break;
		}
	}
	
	public static void main(String[] args) {
		WordsSearchEx ex = new WordsSearchEx();
		ex.run();
	}

}

	
