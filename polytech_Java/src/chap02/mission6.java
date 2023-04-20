package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission6 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
		
	System.out.print("키 입력 : ");
	int height = scan.nextInt();
	
	System.out.print("나이 입력 : ");
	int age = scan.nextInt();
	
	//조건식으로 계산 (논리연산자 활욜)
	if(height >= 140 && age >= 10)				//1) if(조건식) {참}
		
		System.out.println("타도 좋습니다.");		//2) if(조건식) {참}
	else										//   else     {거짓}
		
		System.out.println("가셈염~");			//3) if(score >= 90) 		grade = 'A';	*분기if문*
												//   else if(score >= 80) 	grade = 'B';
												//   else					grade = 'C';
	
												//4) if(time >= 9 && time <= 18)		*중첩if문*
													// if(age <= || age >= 65)	price = 15000;
													// else						price = 30000;
												//	 else if(time > 18 && time <= 22)
	
		scan.close();

	}
	
}