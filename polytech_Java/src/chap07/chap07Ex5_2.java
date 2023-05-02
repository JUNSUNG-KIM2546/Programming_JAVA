package chap07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class chap07Ex5_2 {

	public static void main(String[] args) {
		HashMap<String, Student0502> h = new HashMap<String, Student0502>();
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		Student0502 s;
		
		System.out.println("학생이름, 학과, 학번, 학점평균을 콤마로 구분하여 입력하세요.");
		
		for(int i=0; i<4; i++) {
			System.out.print(">>>");
			st = new StringTokenizer(scan.nextLine(),",");	// 스캔너로 입력 받은 한줄값을 콤마 기준으로 쪼개줘 
	
			while(st.hasMoreTokens()) {
				String name = st.nextToken().trim();	//.trim() 으로 공백을 제거
				String dept = st.nextToken().trim();
				int id = Integer.parseInt(st.nextToken().trim());	//오토 언박싱
				double score = Double.parseDouble(st.nextToken().trim());	//오토 언박싱
				
				s = new Student0502(name, dept, id, score);
				h.put(name,s);
			}
		}
		
//		for(Student0502 ss : a) {
//			System.out.println("-".repeat(20));
//			System.out.println("이름 : " + ss.getName());
//			System.out.println("학과 : " + ss.getDept());
//			System.out.println("학번 : " + ss.getId());
//			System.out.println("학점평균 : " + ss.getScore());
//		}
		
		System.out.println("저장된 요소의 개수 : " + h.size());
		
		for(String key : h.keySet())
			System.out.println(h.get(key));
		//위 아래 같은거
//		Set<String> set = h.keySet();	//키값을 set에 넣고
//		Iterator<String> it = set.iterator();	//set을 순회공연
//		while(it.hasNext()) {
//			System.out.println(h.get(it.next()));
//		}
		
//		//Iterator 활용
//		System.out.print("학생 이름 >> ");
//		String sc = scan.next();
//		Iterator<Student0502> it = h.iterator();
//		while(it.hasNext()) {
//			Student0502 sss = it.next();
//			
//			if(sss.getName().equals(sc))
//				System.out.println(sss);
//		}	
		
	}

}
