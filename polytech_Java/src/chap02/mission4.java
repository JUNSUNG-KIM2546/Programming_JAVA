package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission4 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
		
	System.out.print("2자리수 정수 입력(10~99) : ");
	var Num = scan.nextInt();
	var num10 = Num/10;
	var num1 = Num%10;
	
	if (num10==num1)
		
		System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		
	else		// ; 닫아주면 if와 else 결과가 나온다.
	
		System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
	
	
	
	
	}

}