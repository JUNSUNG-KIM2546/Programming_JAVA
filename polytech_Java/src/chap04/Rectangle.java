package chap04;

public class Rectangle {
	public int W;
	public int H;
	public int area() {
		return W * H;
	}
	
	public int perimeter() {
		return 2 * (W+H);
	}
//}

//public class RectangleTest {
	
	public static void main(String[] args) {
		Rectangle myRect;
		myRect = new Rectangle();
		myRect.W = 10;
		myRect.H = 20;
		System.out.println("¸éÀûÀº " + myRect.area());
	}
}
	
