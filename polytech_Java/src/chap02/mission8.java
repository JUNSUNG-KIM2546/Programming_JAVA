package chap02;

import java.util.Scanner;
//컨트롤+쉬프트+O 해서 임포트 불러오기 

public class mission8 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 위랑 같은거
	//Scanner scan;				// Constructor(생성자)-메소드,생성을 위한, 생성자명==클레스명, scan- 객체명
	//new Scanner(System.in);	// 하나의 메소드(생성자 메소드), new- 생성해줘, Scanner- 생성자명, (System.in)- 표준입력스트림(입력버퍼)
	 							// new가 있어서 공간할당(생성)가능
		
	System.out.print("나이를 입력해주세요. : ");
	var age = scan.nextInt();
	System.out.print("시간을 입력해주세요. : ");
	var time = scan.nextInt();
	
	int price = 0;		
	
	// 중첩 if문
		if(time >= 22 || time < 9)
			System.out.println("현재 운영시간이 아닙니다.");
		else
			System.out.println("현재 운영중 입니다.");
		{
			if(time >= 9 && time <= 18)		//주간권
			{
				if(age <= 7 || age >= 65)	price = 15000;	//소인,노인
				else						price = 30000;	//대인
				System.out.println("요금은 " + price + "원 입니다.");
			}
	
			else if(time > 18 && time < 22)	//야간권
			{
				if(age <= 7 || age <= 65)	price = 10000;	//소인,노인
				else						price = 20000;	//대인
				System.out.println("요금은 " + price + "원 입니다.");
			}
			
		}
	
		scan.close();

	}
	
}