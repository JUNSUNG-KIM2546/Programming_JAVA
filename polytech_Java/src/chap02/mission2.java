package chap02;

import java.util.Scanner;
// 컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
	
	System.out.print("입력할 내용을 적어주세요.");
	String msg = scan.next();
	System.out.println("msg = " + msg);
		
	System.out.print("입력할 정수를 적어주세요.");
	int num = scan.nextInt();
	System.out.println("msg = " + num);
	

	}

}
