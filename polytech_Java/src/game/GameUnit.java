package game;


public class GameUnit {

	static int bossPower = 10000;
	private int unitPower = 5000;
	private MyWeapon weapon;
	private String name;
	
	
	//private Scanner name = new Scanner(System.in);
	
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
	
	public static void main(String[] args) {
		
		GameUnit unit1 = new GameUnit("unit1");
		GameUnit unit2 = new GameUnit("unit2");
		

		
		while(true) {
		
		
			
			unit1.attack((int)(1+Math.random() * 500));
			System.out.println(unit1);
				
	
			unit2.attack((int)(1+Math.random() * 500));
			System.out.println(unit2);
			
			if(GameUnit.bossPower <= 0) {
				System.out.println("�¸�! - ������ �����մϴ�.");
				System.exit(0);
			}
			else
				System.out.println("���� bossPower : " + GameUnit.bossPower);
			
			
		}

	}
	

}
