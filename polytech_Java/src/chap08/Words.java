package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

 // Words Ŭ���� ����(������, ����1���� �߷��ϴ� �޼ҵ�)
//words.txt ������ �а� ���Ϳ� �����ϰ� ���ͷκ��� �����ϰ� �ܾ �����ϴ� Ŭ����
//=======================================//
class Words{	
	static public Vector<String> wordVector = new Vector<String>();
	
	public Words(String filename) {
		// ��ĳ�� ����Ͽ� ���� �б�
		try {
			Scanner scan = new Scanner(new FileReader(filename));
			
			while(scan.hasNext()) {
			String words = scan.nextLine();
			wordVector.add(words);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);	//�ý���(���α׷�) ����
		}	
	}
	
	public void printVector() {
		for(String s : wordVector)
			System.out.println(s);
	}
	
	
	public String getRandomWord() {
		 final int WORDMAX = wordVector.size();	//������ �ʴ� ��
		 int randomIndex = (int)(Math.random() * WORDMAX);
		 return wordVector.get(randomIndex);		
	}
}

