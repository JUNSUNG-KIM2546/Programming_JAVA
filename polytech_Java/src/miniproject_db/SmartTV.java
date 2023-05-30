package miniproject_db;

public class SmartTV extends Product {

	String mf;
	
	public SmartTV(String pname, int price, String mf) {
		this.pname = pname;
		this.price = price;
		this.mf = mf;
	}

	public String getMf() {
		return mf;
	}

	public void setMf(String mf) {
		this.mf = mf;
	}

	@Override
	public void printExtra() {
		System.out.println("ÇØ»óµµ : " + mf);
	}
	
}

