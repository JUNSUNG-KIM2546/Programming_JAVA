package chap02;

import java.util.Scanner;

// switch 문 활용
// 사용자로부터 month 를 정수로 입력받아서
// month의 days 를 출력해주세요.
// month : 2 - 28, 4,6,9,11 - 30일, 기타 - 31일

public class mission10 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
		
	System.out.print("월 (1~12) ");
	
	var month = scan.nextInt();
	var days = 0;		//초기화 값
			
	
	switch(month) {
	case 2 :
		days = 28;
		break;			// 해당 조건 브레이크로 스톱 해줘야함
		
	case 4: case 6: case 9: case 11:
		days = 30;
		break;			// 해당 조건 브레이크로 스톱 해줘야함
		
	default :
		days = 31;
		break;
	}
	
	System.out.println( month + "월은 " + days + "일 입니다");
	
		scan.close();
		
	}
	
}