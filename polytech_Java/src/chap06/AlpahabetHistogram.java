package chap06;

import java.util.Scanner;

public class AlpahabetHistogram {
	int histData[] = new int[26];	// �� �˹ٺ��� ������ ī�����ϴ� ������ �迭
	
	// �ʱ�ȭ
	AlpahabetHistogram( ) {
		for (int i=0; i<histData.length; i++)
			histData[i] = 0;
	}
	
	// ������ ���ִ� �޼ҵ� : readString -> checkAlphabet -> drawHistogram
	void run() {
		checkAlphabet(readString());
		drawHistogram();
	}
	
	// �Է¹��� (readString�� ���� ������ ��) �ؽ�Ʈ�� ���ĺ� ���� ī�����ϴ� �޼ҵ�
	void checkAlphabet(String msg) {
		msg = msg.toUpperCase();
		int index;
		for(int i=0;i<msg.length(); i++) {
			char c = msg.charAt(i);
			if(c>='A' && c<='Z') {
				index = c - 'A';	// �ƽ�Ű�ڵ�� ��ȯ�ϰ� ����.
				histData[index]++;
			}
		}
	}
	
	// ������׷��� �׸��� �޼ҵ�(+)
	void drawHistogram() {
		for(int i=0; i<histData.length; i++) {
			System.out.print((char)(i+'A') + " : ");
			for(int j=0; j<histData[i]; j++)
				System.out.print("+");
			System.out.println();
		}
	}
	
	
	// �ؽ�Ʈ�� �Է¹޾� �ϳ��� StringBuffer�� ���̰�, String���� �����Ͽ� �����ϴ� �޼ҵ�
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
// ����ƽ�� �ƴ� ��� �տ� ��ü�� �������ְ� �ҷ��;��Ѵ�.
// ����ƽ ���� ���� ����� �׳� ������ �ҷ��ü��ִ�.