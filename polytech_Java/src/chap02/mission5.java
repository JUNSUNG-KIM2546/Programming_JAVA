package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission5 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
		
	System.out.print("금액을 입력하시오. : ");
	
	var Won = scan.nextInt();
	int won50000 = Won/50000;
	int res = (Won%50000);
	
	int won10000 = res/10000;
	int res = (Won%10000);
	
	int won1000 = res/1000;
	int res = (Won%1000);
	
	int won100 = res/100;
	int res = (Won%100);
	
	int won50 = res/50;
	int res = (Won%50);
	
	int won10 = res/10;
	int res = (Won%10);
	
	int won1 = Won/1;
	int res = (Won%1);
	
		System.out.println("오만원권 : " + Won + "매");

	}
	
}