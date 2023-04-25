package game;

import java.util.Scanner;

public class GameUnit {

	static int bossPower = 12345;
	private int unitPower = 5000;
	private MyWeapon weapon;
	private String name;
	static int coin;
	
	
	//생성자를 구현해주세요.
	public GameUnit(String name) {
		this.name = name;
		weapon = new MyWeapon();
		weapon.charge(unitPower);
	}
	
	
	//attack() 구현	
	void attack(int power) {
		GameUnit.bossPower = bossPower - power;
	}
	
	//코인
	void Coin(int coin) {
		this.coin = coin;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		GameUnit unit1 = new GameUnit("데마시아");
		GameUnit unit2 = new GameUnit("녹서스");
		GameUnit unit3 = new GameUnit("아이오니아");
		
		coin = 1;	//처음 주어진 코인수
		
		Thread.sleep(1000);
		System.out.println("@------------------------------------------------------------------------------------------@");
		System.out.println("@@----------------------------------------------------------------------------------------@@");
		Thread.sleep(600);
		System.out.print("@@@---------------------------------");
		Thread.sleep(600);
		System.out.print(" 하 ");
		Thread.sleep(600);
		System.out.print(" 이 ");
		Thread.sleep(600);
		System.out.print(" 테 ");
		Thread.sleep(600);
		System.out.print(" 크 ");
		Thread.sleep(600);
		System.out.print(" 랜 ");
		Thread.sleep(600);
		System.out.print(" 드 ");
		Thread.sleep(600);
		System.out.print("---------------------------------@@@");
		System.out.println();
		Thread.sleep(1000);
		System.out.println("@@@@------------------------------------------------------------------------------------@@@@");
		System.out.println("@@@@@----------------------------------------------------------------------------------@@@@@");
		Thread.sleep(1000);
		System.out.println("---------------------------------- 5초 후 게임을 시작하겠습니다. -----------------------------------");
		Thread.sleep(1000);
		System.out.println("@@@@@--------------------------------------- 5 ----------------------------------------@@@@@");
		Thread.sleep(1000);
		System.out.println("@@@@---------------------------------------- 4 -----------------------------------------@@@@");
		Thread.sleep(1000);
		System.out.println("@@@----------------------------------------- 3 ------------------------------------------@@@");
		Thread.sleep(1000);
		System.out.println("@@------------------------------------------ 2 -------------------------------------------@@");
		Thread.sleep(1000);
		System.out.println("@------------------------------------------- 1 --------------------------------------------@");
		Thread.sleep(1000);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< GAME START >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		
		
		while(0<coin) {
			System.out.print("원하는 진영을 선택 해주세요.(데마시아 : 1 / 녹서스 : 2 / 아이오니아 : 3) : ");
			int a = sc.nextInt();
			GameUnit.bossPower = 12345;
			
			if (a == 1) {
				System.out.println("보유 코인 : " + coin);
				System.out.print("코인을 원하는 만큼 배팅 해주세요. : ");
				int co = sc.nextInt();
				coin=(coin-co);
				
				while(true) {
					
					unit1.attack((int)(1+Math.random() * 500));
					System.out.println(unit1.name + " 공격!");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit1.name + " 승리! >");
						System.out.println("< 배팅에 성공하였습니다. 빙고! >");
						coin=(coin+(co*2));
						System.out.println("현재 보유 코인 : " + coin);
						break;
					}
					
					else
						System.out.println("' 돌연변이 자크 ' 남은 HP : " + GameUnit.bossPower);
			
					
					unit2.attack((int)(1+Math.random() * 500));
					System.out.println(unit2.name + " 공격! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit2.name + " 승리! >");
						System.out.println("< 배팅에 실패하였습니다. 으잉ㅠ  >");
						System.out.println("현재 보유 코인 : " + coin);
						break;
					}
					
					else
						System.out.println("' 돌연변이 자크 ' 남은 HP : " + GameUnit.bossPower);
					
					
					unit3.attack((int)(1+Math.random() * 500));
					System.out.println(unit3.name + " 공격! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit3.name + " 승리! >");
						System.out.println("< 배팅에 실패하였습니다. 으잉ㅠ  >");
						System.out.println("현재 보유 코인 : " + coin);
						break;
					}
					
					else
						System.out.println("' 돌연변이 자크 ' 남은 HP : " + GameUnit.bossPower);
					
				}
			}
			
			else if (a == 2) {
				System.out.println("보유 코인 : " + coin);
				System.out.print("코인을 원하는 만큼 배팅 해주세요. : ");
				int co2 = sc.nextInt();
				coin=(coin-co2);
				
				while(true) {
					
					unit1.attack((int)(1+Math.random() * 500));
					System.out.println(unit1.name + " 공격!");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit1.name + " 승리! >");
						System.out.println("< 배팅에 실패하였습니다. 으잉ㅠ >");
						System.out.println("현재 보유 코인 : " + coin);
						break;
					}
					
					else
						System.out.println("' 돌연변이 자크 ' 남은 HP : " + GameUnit.bossPower);
			
					
					unit2.attack((int)(1+Math.random() * 500));
					System.out.println(unit2.name + " 공격! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit2.name + " 승리! >");
						System.out.println("< 배팅에 성공하였습니다. 빙고! >");
						coin=(coin+(co2*2));
						System.out.println("현재 보유 코인 : " + coin);
						break;
					}
					
					else
						System.out.println("' 돌연변이 자크 ' 남은 HP : " + GameUnit.bossPower);
					
					
					unit3.attack((int)(1+Math.random() * 500));
					System.out.println(unit3.name + " 공격! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit3.name + " 승리! >");
						System.out.println("< 배팅에 실패하였습니다. 으잉ㅠ  >");
						System.out.println("현재 보유 코인 : " + coin);
						break;
					}
					
					else
						System.out.println("' 돌연변이 자크 ' 남은 HP : " + GameUnit.bossPower);
				}
			}
				
				
			else {
				System.out.println("보유 코인 : " + coin);
				System.out.print("코인을 원하는 만큼 배팅 해주세요. : ");
				int co3 = sc.nextInt();
				coin=(coin-co3);
				
				while(true) {
					
					unit1.attack((int)(1+Math.random() * 500));
					System.out.println(unit1.name + " 공격!");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit1.name + " 승리! >");
						System.out.println("< 배팅에 실패하였습니다. 으잉ㅠ  >");
						System.out.println("현재 보유 코인 : " + coin);
						break;
					}
					
					else
						System.out.println("' 돌연변이 자크 ' 남은 HP : " + GameUnit.bossPower);
			
					
					unit2.attack((int)(1+Math.random() * 500));
					System.out.println(unit2.name + " 공격! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit2.name + " 승리! >");
						System.out.println("< 배팅에 실패하였습니다. 으잉ㅠ  >");
						System.out.println("현재 보유 코인 : " + coin);
						break;
					}
					
					else
						System.out.println("' 돌연변이 자크 ' 남은 HP : " + GameUnit.bossPower);
					
					
					unit3.attack((int)(1+Math.random() * 500));
					System.out.println(unit3.name + " 공격! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit3.name + " 승리! >");
						System.out.println("< 배팅에 성공하였습니다. 빙고! >");
						coin=(coin+(co3*2));
						System.out.println("현재 보유 코인 : " + coin);
						break;
					}
					
					else
						System.out.println("' 돌연변이 자크 ' 남은 HP : " + GameUnit.bossPower);
				}
			}
			
			if(0 < coin) {	
				System.out.println("묶고 더블로 가? ( Y / N )");
				String text = sc.next();
				
				if(text.equals("n")||text.equals("N")) 
				{
				System.out.println(coin + " 코인 챙겨 갑니다.");
				System.exit(0);
				}
			}
			
			if(coin == 0) {
				System.out.println();
				System.out.println("아이고야 조졌네...조졌어...");
			}
			
			
		}
	
	}

}
