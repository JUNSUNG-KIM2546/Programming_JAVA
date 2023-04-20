package game;

public class MyWeapon implements weapon {

	//속성(필드)
	private int curPower;
		
	@Override
	public void fire(int power) {
		this.curPower = curPower - power;
		
	}

	@Override
	public int getRestPower() {
		return this.curPower;
	}

	@Override
	public int charge(int power) {
		return this.curPower = curPower + power;
	}

}
