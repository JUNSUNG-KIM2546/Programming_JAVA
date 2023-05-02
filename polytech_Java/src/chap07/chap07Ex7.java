package chap07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class chap07Ex7 {

	public static void main(String[] args) {
		HashMap<String, Double> h = new HashMap<String, Double>();
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		
		System.out.println("미래장학금관리시스템입니다. (스페이스바로 구분하여 입력하세요.)");
		
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점 >> ");
			st = new StringTokenizer(scan.nextLine()," ");	// 스캔너로 입력 받은 한줄값을 콤마 기준으로 쪼개줘 
	
			while(st.hasMoreTokens()) {
				String names = st.nextToken().trim();	//.trim() 으로 공백을 제거
				double scores = Double.parseDouble(st.nextToken().trim());	//오토 언박싱
			
				h.put(names, scores);
			}
		}
		
		//1.
		System.out.println("저장된 요소의 개수 : " + h.size());
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double sc = scan.nextDouble();
		for(String key : h.keySet())
			if(h.get(key) >= sc)
				System.out.println(key); 
		
		//2.
		System.out.println("저장된 요소의 개수 : " + h.size());
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double sc1 = scan.nextDouble();
		Set<String> set = h.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			double score = h.get(name);
			if(score >= sc1)
				System.out.println(name);
		}
			
		//3.
		Collection<Double> c = h.values();
		Iterator<Double> it1 = c.iterator();
		while(it1.hasNext())
			System.out.println(it.next());
		
		
		scan.close();
	}

}
