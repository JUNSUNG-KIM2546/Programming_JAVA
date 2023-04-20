package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		
		String data = "홍길동,010-1234-5678,서울시,학생";		// 콤마 기준으로 쪼갠다(하나의 토큰)
		StringTokenizer st = new StringTokenizer(data,",");	//변수 data를 콤마기준으로 쪼개서 st에 저장한다
		
		while (st.hasMoreTokens()) {	//펄스가 될때까지 쪼갠서 가지고 온다 (다음 가지고올 값까지)
			System.out.println("이름 : " + st.nextToken());	//변수 data를 콤마기준으로 쪼개서 st에 저장한값을 출력한다.
			System.out.println("전화 : " + st.nextToken());
			System.out.println("주소 : " + st.nextToken());
			System.out.println("직업 : " + st.nextToken());
			System.out.println();
		}
			
		// 남자들의 체중의 평균을 구하라		wrapper class = Integer.parseInt(문자) 정수형으로 바꿔줌 (스태틱)
		// StringTokenizer
		// -nextToken
		// -hasMoreTokens
		
		//String 비교
		// -gender.e
		
		//wrapper 클래스 활용
		//웨이트 = Integer.parseInt(st1.nextToken)
		
		// 홍길동,남,65,170 / 김세영,여,57,164 / 이장군,남,80,190 / 김명수,남,77,667 / 홍미용,여,64,165
		String data2 = " 홍길동,남,65,170 / 김세영,여,57,164 / 이장군,남,80,190 / 김명수,남,77,667 / 홍미용,여,64,165";
		StringTokenizer user = new StringTokenizer(data2,"/");
		StringTokenizer u = new StringTokenizer(data2,"/");	
		
		int sum = 0;
		int count = 0;
				
		while (user.hasMoreTokens()) {	//펄스가 될때까지 쪼갠서 가지고 온다 (다음 가지고올 값까지)
			System.out.println("사람 : " + u.nextToken());	//변수 data를 콤마기준으로 쪼개서 st에 저장한값을 출력한다.
			System.out.println();
			StringTokenizer users = new StringTokenizer(user.nextToken(),",");
			
			while (users.hasMoreTokens()) {
				System.out.println("이름 : " + users.nextToken());
				System.out.println("성별 : " + users.nextToken());
				System.out.println("무게 : " + users.nextToken());
				System.out.println("키 : " + users.nextToken());
				System.out.println("-----------------------------------");
				
				if(users.nextToken().equals("남")) {
					count++;
					sum+=Integer.parseInt(users.nextToken());
				}
				
				//users.nextToken();
				
			}
			
			
		}

		System.out.println("남자들 평균 체중 : " + (int)(double)sum/count);
	}

}
