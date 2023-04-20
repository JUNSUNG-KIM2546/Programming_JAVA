package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission9_1 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
		
	//(5번 문제) Scanner클래스를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력박고 이 3개의 수로 삼각형을 만들수 있는지 판별하라.
	//삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
	
	System.out.print("정수 3개를 입력하세요. : ");
	var a = scan.nextInt();
	var b = scan.nextInt();
	var c = scan.nextInt();
	//int grade = 0;		// String 문자열		int 정수형
	
	// 분기적 if문
	if( (a+b)>c == (a+c)>b == (b+c)>a )
		System.out.println("삼각형이 가능합니다.");
	
	else
		System.out.println("삼각형이 불가능합니다");
	
	
	scan.close();

	}
	
}