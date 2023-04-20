package game;

//인터페이스 정의
public interface weapon {
	public void fire(int power);	//추상메소드 정의
	public int getRestPower();
	public int charge(int power);
	
}
