package chap08;

public class Phone {
	String name;
	String number;
	
	public Phone(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 전화번호: " + number;
	}
	
	
}
