package game;

import java.util.Scanner;

public class GameUnit {

	static int bossPower = 10000;
	private int unitPower = 5000;
	private MyWeapon weapon;
	private String name;
	static int coin;
	
	
	//�����ڸ� �������ּ���.
	public GameUnit(String name) {
		this.name = name;
		weapon = new MyWeapon();
		weapon.charge(unitPower);
	}
	
	
	//attack() ����	
	void attack(int power) {
		GameUnit.bossPower = bossPower - power;
	}
	
	void Coin(int coin) {
		
		this.coin = coin;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		GameUnit unit1 = new GameUnit("�����þ�");
		GameUnit unit2 = new GameUnit("�켭��");
		coin = 1;
		
		//Coin co = new Coin(coin);
		
		while(0<coin) {
			System.out.println("���ϴ� ������ ���� ���ּ���.(�����þ� : 1 / �켭�� : 2 ) : ");
			String a = sc.next();
			
			switch (a) {
			case "1":
				System.out.println("���� ���� : " + coin);
				System.out.println("������ ���ϴ� ��ŭ ���� ���ּ���.");
				int co = sc.nextInt();
				coin=(coin-co);
				
				while(true) {
					
					unit1.attack((int)(1+Math.random() * 500));
					System.out.println(unit1.name + " ����!");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println("< " + unit1.name + " �¸�! >");
						System.out.println("< ������ ���� �մϴ�. >");
						coin=(coin+(co*2));
						break;
						//System.exit(0);
					}
					
					else
						System.out.println("' ŷ��¯ ���� ' ���� HP : " + GameUnit.bossPower);
			
					
					unit2.attack((int)(1+Math.random() * 500));
					System.out.println(unit2.name + " ����! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println("< " + unit2.name + " �¸�! >");
						System.out.println("< ������ ���� �մϴ�. >");
						break;
						//System.exit(0);
					}
					
					else
						System.out.println("' ŷ��¯ ���� ' ���� HP : " + GameUnit.bossPower);
					
				}
				
				//break;

			case "2":
				System.out.println("���� ���� : " + coin);
				System.out.println("������ ���ϴ� ��ŭ ���� ���ּ���.");
				int co2 = sc.nextInt();
				coin=(coin-co2);
				
				while(true) {
					
					unit1.attack((int)(1+Math.random() * 500));
					System.out.println(unit1.name + " ����!");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println("< " + unit1.name + " �¸�! >");
						System.out.println("< ������ ���� �մϴ�. >");
						break;
						//System.exit(0);
					}
					
					else
						System.out.println("' ŷ��¯ ���� ' ���� HP : " + GameUnit.bossPower);
			
					
					unit2.attack((int)(1+Math.random() * 500));
					System.out.println(unit2.name + " ����! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println("< " + unit2.name + " �¸�! >");
						System.out.println("< ������ ���� �մϴ�. >");
						coin=(coin+(co2*2));
						break;
						//System.exit(0);
					}
					
					else
						System.out.println("' ŷ��¯ ���� ' ���� HP : " + GameUnit.bossPower);
					
				}
				
				//break;
			}
		
					
		}
					
	}
	

}
