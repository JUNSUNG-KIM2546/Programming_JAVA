package chap06;

public class Circle {
	private int x;
	private int y;
	private int radius;
	

		
	public Circle (int x, int y, int radius){ this.x = x;	this.y = y;  this.radius = radius;}
	
	boolean equals (Circle b) {
		if(this.x == b.x && this.y == b.y)
			return true;
		else
			return false;
	}

		public static void main(String[] args) {
			Circle a = new Circle(2, 3, 5);		// 중심 (2,3)에 반지름 5인 원
			Circle b = new Circle(2, 3, 30);	// 중심 (2,3)에 반지름 30인 원
			System.out.println("원 a : " + a);
			System.out.println("원 b : " + b);
			if(a.equals(b))
				System.out.println("같은 원");
			else
				System.out.println("서로 다른 원");
			

		}

		@Override
		public String toString() {
			return "Circle("+ x+","+y+")" + "반지름" + radius;
		}

}
