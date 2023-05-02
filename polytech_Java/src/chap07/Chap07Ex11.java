package chap07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Chap07Ex11 {
	static HashMap<String, String> map;
	public Chap07Ex11(){
		map = new HashMap<String, String>();
		map.put("�Ϻ�", "����");
		map.put("�̱�", "������");
		map.put("�߱�", "����¡");
		map.put("������", "�ĸ�");
		map.put("����", "����");
		map.put("������", "����");
		map.put("�±�", "����");
		map.put("�븸", "Ÿ�̺���");
		map.put("ȫ��", "ȫ��");	
		System.out.println("���� 9�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
	}
	
	public static void input() {		
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ���� �Է� >>");		
		String msg = scan.nextLine();
		StringTokenizer st = new StringTokenizer(msg, " ");
		while(st.hasMoreTokens()) {
			String country = st.nextToken().trim();
			String capital = st.nextToken().trim();
			map.put(country, capital);
		}
	}
	
	public static void print() {		
		for(String name : map.keySet())
			System.out.println(map.get(name));
	}
	
	public static String quiz() {
		Random rd = new Random();
		int num = rd.nextInt(map.size());
		System.out.println(num);
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();		
		int count = 0;
		while(it.hasNext()) {
			String country = it.next();
			if(count == num) {
				System.out.println(country + "�� ������?");
				break;
			}
			count++;
		}
		
		Scanner scan = new Scanner(System.in);
		String capital = scan.next();				
		
		return capital;
	}
	
	public static void answer(String capital) {
		for(String country : map.keySet()) {
			if(map.get(country).equals(capital)) {
				System.out.println("�����Դϴ�...");
				break;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�...");
				break;
			}
		}
	}
		
	
	public static void main(String[] args) {
		Chap07Ex11 ex = new Chap07Ex11();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ���߱� �����Դϴ�...");
		while(true) {
			System.out.println("�Է�: 1, ����: 2, ����:3 >>");
			int game_num = scan.nextInt();
			if(game_num == 3) {System.out.println("����...");break;}
			if(game_num == 1) {input();}
			if(game_num == 2) {String capital = quiz();answer(capital);}
		}
	}
}
