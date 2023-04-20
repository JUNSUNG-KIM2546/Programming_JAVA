package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission4_4 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
		
	System.out.print("2자리수 정수 입력(10~99) : ");
	var Num = scan.nextInt();
	var num10 = Num/10;	//10의 자리
	var num1 = Num%10;	//1의 자리
	
	//	조건연산자 활용
		String msg = (num10 == num1) ? "YES! 십의 자리와 일의 자리가 같습니다." : "NO! 같지 않습니다.";
	
	System.out.println(msg);
		
//	String msg;
//	if(num10 == num1)
//		msg = "YES! 십의 자리와 일의 자리가 같습니다.";
//	
//	else
//		msg = "NO! 같지 않습니다.";
//	
//	System.out.println(msg);
	
	}
	
}