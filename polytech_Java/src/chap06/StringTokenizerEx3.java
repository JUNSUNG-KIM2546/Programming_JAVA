package chap06;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerEx3 {

	public static void main(String[] args) {
			
		// 남자들의 체중의 평균을 구하라		wrapper class = Integer.parseInt(문자) 정수형으로 바꿔줌 (스태틱)
		// StringTokenizer
		// -nextToken
		// -hasMoreTokens
		
		//String 비교
		// -gender.e
		
		//wrapper 클래스 활용
		//웨이트 = Integer.parseInt(st1.nextToken)
		
		// 홍길동,남,65,170 / 김세영,여,57,164 / 이장군,남,80,190 / 김명수,남,77,667 / 홍미용,여,64,165
		String data2 = " 홍길동,남,65,170/김세영,여,57,164/이장군,남,80,190/김명수,남,77,667/홍미용,여,64,165";
		StringTokenizer user = new StringTokenizer(data2,"/");
		ArrayList<Person> al = new ArrayList<Person>();
		Person p = new Person();
		
		while (user.hasMoreTokens()) {	//펄스가 될때까지 쪼갠서 가지고 온다 (다음 가지고올 값까지)
			StringTokenizer users = new StringTokenizer(user.nextToken(),",");
			
			while (users.hasMoreTokens()) {
				p.setName(users.nextToken());
				p.setGender(users.nextToken());
				p.setWeight(Integer.parseInt(users.nextToken()));
				p.setHeight(Integer.parseInt(users.nextToken()));
//				p.setHeight(Integer.parseInt(users.nextToken().trim()));
				al.add(p);
				
				System.out.println("-----------------------------------");				
			}			
		}
		for(Person s : al) {
			System.out.println(s.getHeight());
		}
			
		
		}

}
