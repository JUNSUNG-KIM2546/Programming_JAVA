package game;

import java.util.Scanner;

public class GameUnit {

	static int bossPower = 10000;
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
	
	void Coin(int coin) {
		
		this.coin = coin;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		GameUnit unit1 = new GameUnit("데마시아");
		GameUnit unit2 = new GameUnit("녹서스");
		coin = 1;
		
		//Coin co = new Coin(coin);
		
		while(0<coin) {
			System.out.println("원하는 진영을 선택 해주세요.(데마시아 : 1 / 녹서스 : 2 ) : ");
			String a = sc.next();
			
			switch (a) {
			case "1":
				System.out.println("보유 코인 : " + coin);
				System.out.println("코인을 원하는 만큼 배팅 해주세요.");
				int co = sc.nextInt();
				coin=(coin-co);
				
				while(true) {
					
					unit1.attack((int)(1+Math.random() * 500));
					System.out.println(unit1.name + " 공격!");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println("< " + unit1.name + " 승리! >");
						System.out.println("< 게임을 종료 합니다. >");
						coin=(coin+(co*2));
						break;
						//System.exit(0);
					}
					
					else
						System.out.println("' 킹왕짱 빌런 ' 남은 HP : " + GameUnit.bossPower);
			
					
					unit2.attack((int)(1+Math.random() * 500));
					System.out.println(unit2.name + " 공격! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println("< " + unit2.name + " 승리! >");
						System.out.println("< 게임을 종료 합니다. >");
						break;
						//System.exit(0);
					}
					
					else
						System.out.println("' 킹왕짱 빌런 ' 남은 HP : " + GameUnit.bossPower);
					
				}
				
				//break;

			case "2":
				System.out.println("보유 코인 : " + coin);
				System.out.println("코인을 원하는 만큼 배팅 해주세요.");
				int co2 = sc.nextInt();
				coin=(coin-co2);
				
				while(true) {
					
					unit1.attack((int)(1+Math.random() * 500));
					System.out.println(unit1.name + " 공격!");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println("< " + unit1.name + " 승리! >");
						System.out.println("< 게임을 종료 합니다. >");
						break;
						//System.exit(0);
					}
					
					else
						System.out.println("' 킹왕짱 빌런 ' 남은 HP : " + GameUnit.bossPower);
			
					
					unit2.attack((int)(1+Math.random() * 500));
					System.out.println(unit2.name + " 공격! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println("< " + unit2.name + " 승리! >");
						System.out.println("< 게임을 종료 합니다. >");
						coin=(coin+(co2*2));
						break;
						//System.exit(0);
					}
					
					else
						System.out.println("' 킹왕짱 빌런 ' 남은 HP : " + GameUnit.bossPower);
					
				}
				
				//break;
			}
		
					
		}
					
	}
	

}
