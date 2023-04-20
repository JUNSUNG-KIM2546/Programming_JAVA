package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission9 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
		
	//(4번 문제) Scanner클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
	
	System.out.print("정수 3개를 입력하세요. : ");
	var a = scan.nextInt();
	var b = scan.nextInt();
	var c = scan.nextInt();
	int grade = 0;		// String 문자열		int 정수형
	
	// 분기적 if문
	if((a>b && a<c) || (a>c&&a<b))			grade = a;
	else if((b>c && b<a) || (b>a && b<c))	grade = b;
	else if((c>a && c<b) || (c>b && c<a))	grade = c;
	
	System.out.println("중간 크기의 값은: " + grade + " 입니다.");
	
	scan.close();
	}
	
}