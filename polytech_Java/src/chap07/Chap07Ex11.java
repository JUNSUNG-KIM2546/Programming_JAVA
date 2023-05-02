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
		map.put("일본", "도쿄");
		map.put("미국", "워싱턴");
		map.put("중국", "베이징");
		map.put("프랑스", "파리");
		map.put("영국", "런던");
		map.put("폴리텍", "대전");
		map.put("태국", "방콕");
		map.put("대만", "타이베이");
		map.put("홍콩", "홍콩");	
		System.out.println("현재 9개 나라와 수도가 입력되어 있습니다.");
	}
	
	public static void input() {		
		Scanner scan = new Scanner(System.in);
		System.out.print("나라와 수도 입력 >>");		
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
				System.out.println(country + "의 수도는?");
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
				System.out.println("정답입니다...");
				break;
			}
			else {
				System.out.println("틀렸습니다...");
				break;
			}
		}
	}
		
	
	public static void main(String[] args) {
		Chap07Ex11 ex = new Chap07Ex11();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수도 맞추기 게임입니다...");
		while(true) {
			System.out.println("입력: 1, 퀴즈: 2, 종료:3 >>");
			int game_num = scan.nextInt();
			if(game_num == 3) {System.out.println("종료...");break;}
			if(game_num == 1) {input();}
			if(game_num == 2) {String capital = quiz();answer(capital);}
		}
	}
}
