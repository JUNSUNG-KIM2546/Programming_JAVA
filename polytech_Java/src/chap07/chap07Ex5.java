package chap07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class chap07Ex5 {

	public static void main(String[] args) {
		ArrayList<Student0502> a = new ArrayList<Student0502>();
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
				a.add(s);
			}
		}
		
		for(Student0502 ss : a) {
			System.out.println("-".repeat(20));
			System.out.println("이름 : " + ss.getName());
			System.out.println("학과 : " + ss.getDept());
			System.out.println("학번 : " + ss.getId());
			System.out.println("학점평균 : " + ss.getScore());
		}
		System.out.println(a);
		
		//Iterator 활용
		System.out.print("학생 이름 >> ");
		String sc = scan.next();
		Iterator<Student0502> it = a.iterator();
		while(it.hasNext()) {
			Student0502 sss = it.next();
			
			if(sss.getName().equals(sc))
				System.out.println(sss);
		}
		
///		while(true) {
//			System.out.print("학생 이름 >> ");
//			String sc = scan.next();
//			for(Student0502 ss : a) {
//				if(sc.equals("그만"))
//					System.exit(0);
//				
//				else
//					if (ss.getName().trim().equals(sc))
//						System.out.println(ss);
//			}				
//		}
		
		
	}

}
