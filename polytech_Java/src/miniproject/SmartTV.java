package miniproject;

public class SmartTV extends Product {

	private String resolution;
	
	public SmartTV(String pname, int price, String resolution) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
	}

	@Override
	public void printExtra() {
		System.out.println("ÇØ»óµµ : " + resolution);
	}
	
}

