package chap04;


public class RectangleTest {
	public Rectangle W;
	public Rectangle H;
	
	public int myRect2() {
		return myRect.area;
	}
	public RectangleTest(int W, int H) {	
	this.W = W;
	this.H = H;
	}
	
	public static void main(String[] args) {
		RectangleTest myRect = new RectangleTest(new Rectangle(10), 20);
		
		System.out.println("¸éÀûÀº " + myRect.area());
	}
}
	
