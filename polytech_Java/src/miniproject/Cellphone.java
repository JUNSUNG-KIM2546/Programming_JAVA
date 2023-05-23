package miniproject;

public class Cellphone extends Product{
	
	private String carrier;
	
	public Cellphone(String pname, int price, String carrier) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
	}

	@Override
	public void printExtra() {
		System.out.println("Ελ½Ε»η : " + carrier);
	}
	
}
