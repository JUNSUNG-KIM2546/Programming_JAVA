package chap03;

import java.net.MulticastSocket;
import java.util.Random;
import java.util.Scanner;

public class Mission0328 {
	
	// 숨겨진 카드의 수를 맞추는 게임을 만들어보자. 0에서 99까지의 임의의 수를 가진 카드를 한 장 숨기고 이 카드의 구를 맞추는 게임이다.
	// 아래의 화면과 같이 카드 속의 수가 77인 경우를 보자. 
	// 수를 맞추는 사람이 55라고 입력하면 "더 높게". 다시 70을 입력하면 "더 높게"라는 식으로 범위를 좁혀가면서 수를 맞춘다.
	// 게임을 반복하기 위해 y/n을 묻고. n인 경우 종료한다.
	//========================================================================	
public static void main(String[] args) {

	//1. 값을 생성한다.
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	boolean ST = true;							//상태변수 (성공이라고 가정)
									//시도횟수를 위한 카운트
	
	//System.out.println(System.currentTimeMillis());
	rand.setSeed(System.currentTimeMillis());	// 1970.01.01부터 흘러온 시간 값으로 항상 달라지는 값
	
	System.out.println("카드게임 시작!");
	
	
	//3. 반복을 한다.
	while(true) {
				System.out.println("수를 결정하였습니다. 맞추어 보세요.");
				int com = rand.nextInt(99);
				int count = 0;
				int max = 99;
				int min = 0;
				
				while(true) {	
							count ++;
							System.out.println("컴값" + com);
						
							System.out.print(count + "회 >> 숫자입력 : ");
							int user = scan.nextInt();
							
							//2. 게임을 한다.
							if(user>com){
								System.out.println("더 낮게..");
								max = user;
								System.out.println(min + "~" + max);
										}
			
							else if(user<com) {	
								System.out.println("더 높게!!");
								min = user;
								System.out.println(min + "~" + max);
											  }
							
							else
								break;
							}	
				
				System.out.println("맞았습니다.");
				System.out.println("다시하시겠습니까? ( Y / N )");
				String text = scan.next();
				if(text.equals("n")||text.equals("N")) 
					{
					System.out.println("가세염~");
					break;
					}
				}

	scan.close();
	}
}

					
