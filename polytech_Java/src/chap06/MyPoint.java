package chap06;

public class MyPoint {
	
private int x;
private int y;

	
public MyPoint (int x, int y){ this.x = x;	this.y = y; } //������ �޼ҵ�(Ŭ���� �̸��� ������ ������)

boolean equals (MyPoint b) {
	if(this.x == b.x && this.y == b.y)
		return true;
	else
		return false;
}

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);	//��ü ����
		MyPoint q = new MyPoint(4, 50);	//��ü ����
		System.out.println(p);
		
		if(p.equals(q))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");	
	}

	
	@Override
	public String toString() {
		return "Point("+ x+","+y+")";
	}

}
