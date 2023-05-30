package miniproject_db;

public abstract class Product {
	
	int pcode;
	String pname;
	int price;
	
	public void printDefault() {
		System.out.print("상품코드 : " + pcode + ",");
		System.out.print("상품명 : " + pname + ",");
		System.out.print("상품가격 : " + price + ",");
		printExtra(); // 엡스트렉스(프린트엑스트라)(정의안된) 불러오는
	}
	
//	@Override
//	public String toString() {
//		return pname + "(" + price + ")";
//	}
//	
//	public int getPrice() {
//		return price;
//	}

	public abstract void printExtra();
	
}
