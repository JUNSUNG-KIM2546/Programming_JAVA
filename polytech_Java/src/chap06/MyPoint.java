package chap06;

public class MyPoint {
	
private int x;
private int y;

	
public MyPoint (int x, int y){ this.x = x;	this.y = y; } //생성자 메소드(클래스 이름과 같은거 생성자)

boolean equals (MyPoint b) {
	if(this.x == b.x && this.y == b.y)
		return true;
	else
		return false;
}

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);	//객체 생성
		MyPoint q = new MyPoint(4, 50);	//객체 생성
		System.out.println(p);
		
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");	
	}

	
	@Override
	public String toString() {
		return "Point("+ x+","+y+")";
	}

}
