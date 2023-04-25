package game;

import java.util.Scanner;

public class GameUnit {

	static int bossPower = 12345;
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
	
	//����
	void Coin(int coin) {
		this.coin = coin;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		GameUnit unit1 = new GameUnit("�����þ�");
		GameUnit unit2 = new GameUnit("�켭��");
		GameUnit unit3 = new GameUnit("���̿��Ͼ�");
		
		coin = 1;	//ó�� �־��� ���μ�
		
		Thread.sleep(1000);
		System.out.println("@------------------------------------------------------------------------------------------@");
		System.out.println("@@----------------------------------------------------------------------------------------@@");
		Thread.sleep(600);
		System.out.print("@@@---------------------------------");
		Thread.sleep(600);
		System.out.print(" �� ");
		Thread.sleep(600);
		System.out.print(" �� ");
		Thread.sleep(600);
		System.out.print(" �� ");
		Thread.sleep(600);
		System.out.print(" ũ ");
		Thread.sleep(600);
		System.out.print(" �� ");
		Thread.sleep(600);
		System.out.print(" �� ");
		Thread.sleep(600);
		System.out.print("---------------------------------@@@");
		System.out.println();
		Thread.sleep(1000);
		System.out.println("@@@@------------------------------------------------------------------------------------@@@@");
		System.out.println("@@@@@----------------------------------------------------------------------------------@@@@@");
		Thread.sleep(1000);
		System.out.println("---------------------------------- 5�� �� ������ �����ϰڽ��ϴ�. -----------------------------------");
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
			System.out.print("���ϴ� ������ ���� ���ּ���.(�����þ� : 1 / �켭�� : 2 / ���̿��Ͼ� : 3) : ");
			int a = sc.nextInt();
			GameUnit.bossPower = 12345;
			
			if (a == 1) {
				System.out.println("���� ���� : " + coin);
				System.out.print("������ ���ϴ� ��ŭ ���� ���ּ���. : ");
				int co = sc.nextInt();
				coin=(coin-co);
				
				while(true) {
					
					unit1.attack((int)(1+Math.random() * 500));
					System.out.println(unit1.name + " ����!");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit1.name + " �¸�! >");
						System.out.println("< ���ÿ� �����Ͽ����ϴ�. ����! >");
						coin=(coin+(co*2));
						System.out.println("���� ���� ���� : " + coin);
						break;
					}
					
					else
						System.out.println("' �������� ��ũ ' ���� HP : " + GameUnit.bossPower);
			
					
					unit2.attack((int)(1+Math.random() * 500));
					System.out.println(unit2.name + " ����! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit2.name + " �¸�! >");
						System.out.println("< ���ÿ� �����Ͽ����ϴ�. ���פ�  >");
						System.out.println("���� ���� ���� : " + coin);
						break;
					}
					
					else
						System.out.println("' �������� ��ũ ' ���� HP : " + GameUnit.bossPower);
					
					
					unit3.attack((int)(1+Math.random() * 500));
					System.out.println(unit3.name + " ����! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit3.name + " �¸�! >");
						System.out.println("< ���ÿ� �����Ͽ����ϴ�. ���פ�  >");
						System.out.println("���� ���� ���� : " + coin);
						break;
					}
					
					else
						System.out.println("' �������� ��ũ ' ���� HP : " + GameUnit.bossPower);
					
				}
			}
			
			else if (a == 2) {
				System.out.println("���� ���� : " + coin);
				System.out.print("������ ���ϴ� ��ŭ ���� ���ּ���. : ");
				int co2 = sc.nextInt();
				coin=(coin-co2);
				
				while(true) {
					
					unit1.attack((int)(1+Math.random() * 500));
					System.out.println(unit1.name + " ����!");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit1.name + " �¸�! >");
						System.out.println("< ���ÿ� �����Ͽ����ϴ�. ���פ� >");
						System.out.println("���� ���� ���� : " + coin);
						break;
					}
					
					else
						System.out.println("' �������� ��ũ ' ���� HP : " + GameUnit.bossPower);
			
					
					unit2.attack((int)(1+Math.random() * 500));
					System.out.println(unit2.name + " ����! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit2.name + " �¸�! >");
						System.out.println("< ���ÿ� �����Ͽ����ϴ�. ����! >");
						coin=(coin+(co2*2));
						System.out.println("���� ���� ���� : " + coin);
						break;
					}
					
					else
						System.out.println("' �������� ��ũ ' ���� HP : " + GameUnit.bossPower);
					
					
					unit3.attack((int)(1+Math.random() * 500));
					System.out.println(unit3.name + " ����! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit3.name + " �¸�! >");
						System.out.println("< ���ÿ� �����Ͽ����ϴ�. ���פ�  >");
						System.out.println("���� ���� ���� : " + coin);
						break;
					}
					
					else
						System.out.println("' �������� ��ũ ' ���� HP : " + GameUnit.bossPower);
				}
			}
				
				
			else {
				System.out.println("���� ���� : " + coin);
				System.out.print("������ ���ϴ� ��ŭ ���� ���ּ���. : ");
				int co3 = sc.nextInt();
				coin=(coin-co3);
				
				while(true) {
					
					unit1.attack((int)(1+Math.random() * 500));
					System.out.println(unit1.name + " ����!");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit1.name + " �¸�! >");
						System.out.println("< ���ÿ� �����Ͽ����ϴ�. ���פ�  >");
						System.out.println("���� ���� ���� : " + coin);
						break;
					}
					
					else
						System.out.println("' �������� ��ũ ' ���� HP : " + GameUnit.bossPower);
			
					
					unit2.attack((int)(1+Math.random() * 500));
					System.out.println(unit2.name + " ����! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit2.name + " �¸�! >");
						System.out.println("< ���ÿ� �����Ͽ����ϴ�. ���פ�  >");
						System.out.println("���� ���� ���� : " + coin);
						break;
					}
					
					else
						System.out.println("' �������� ��ũ ' ���� HP : " + GameUnit.bossPower);
					
					
					unit3.attack((int)(1+Math.random() * 500));
					System.out.println(unit3.name + " ����! ");
					
					if(GameUnit.bossPower <= 0) {
						System.out.println();
						System.out.println("< " + unit3.name + " �¸�! >");
						System.out.println("< ���ÿ� �����Ͽ����ϴ�. ����! >");
						coin=(coin+(co3*2));
						System.out.println("���� ���� ���� : " + coin);
						break;
					}
					
					else
						System.out.println("' �������� ��ũ ' ���� HP : " + GameUnit.bossPower);
				}
			}
			
			if(0 < coin) {	
				System.out.println("���� ����� ��? ( Y / N )");
				String text = sc.next();
				
				if(text.equals("n")||text.equals("N")) 
				{
				System.out.println(coin + " ���� ì�� ���ϴ�.");
				System.exit(0);
				}
			}
			
			if(coin == 0) {
				System.out.println();
				System.out.println("���̰�� ������...������...");
			}
			
			
		}
	
	}

}
