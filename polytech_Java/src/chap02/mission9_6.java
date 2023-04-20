//package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission9_6 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
	
	//(10번 문제) 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력 받는다.
	//두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.
	//Scanner 와 if조건,산술식 사용
	
	System.out.print("첫번째 원의 중심과 반지름을 입력하세요. : ");
	var X = scan.nextDouble();
	var Y = scan.nextDouble();
	var C = scan.nextDouble();

	double Xp = X+C;
	double Xm = X-C;
	double Yp = Y+C;
	double Ym = Y-C;

	System.out.print("두번째 원의 중심과 반지름을 입력하세요. : ");
	var x = scan.nextDouble();
	var y = scan.nextDouble();
	var c = scan.nextDouble();

	double xp = x+c;
	double xm = x-c;
	double yp = y+c;
	double ym = y-c;


	//int grade = 0;		// String 문자열		int 정수형
	
	// 분기적 if문
	if((Xp>xm) && (Xm<xp) || (Xp>ym) && (Xm<yp))
		{ if((Yp<xm) && (Ym>xp) || (Yp>ym) && (Ym<yp))
			System.out.println("두 원은 서로 겹칩니다.");
		}
	else
		System.out.println("두 원은 서로 겹치지 않습니다.");
	
	
	scan.close();

	}
	
}