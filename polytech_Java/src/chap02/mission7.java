package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission7 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
		
	System.out.print("성적을 입력 해주세요. : ");
	var score = scan.nextInt();
	String grade;		// 문자열
	
	// 분기적 if문
	if(score >= 90)			grade = "A";
	else if(score >= 80)	grade = "B";
	else if(score >= 70)	grade = "C";
	else if(score >= 60)	grade = "D";
	else if(score >= 50)	grade = "E";
	else if(score >= 40)	grade = "F";
	else					grade = "과락";
	
	System.out.println("성적은 " + grade + " 입니다.");
	
	scan.close();

	}
	
}