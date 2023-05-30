package miniproject_db;

public abstract class Product {
	
	int pcode;
	String pname;
	int price;
	
	public void printDefault() {
		System.out.print("��ǰ�ڵ� : " + pcode + ",");
		System.out.print("��ǰ�� : " + pname + ",");
		System.out.print("��ǰ���� : " + price + ",");
		printExtra(); // ����Ʈ����(����Ʈ����Ʈ��)(���Ǿȵ�) �ҷ�����
	}
	
//	@Override
//	public String toString() {
//		return pname + "(" + price + ")";
//	}
//	
//	public int getPrice() {
//		return price;
//	}

	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract void printExtra();
	
}
