package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String [] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.print("�̸��� �Է��ϼ��� >> ");
			a.add(scan.next());
		}
		
		for(String name : a) {
			System.out.println(name);
		}
		
		// ���� �� �̸��� ã�ƶ�!
		int longestIndex =0;
		for(int i=1; i<a.size(); i++)
			if(a.get(i).length() > a.get(longestIndex).length())
				longestIndex = i;
		
		System.out.println("���� �� �̸� : " + a.get(longestIndex));
		
	}
}
