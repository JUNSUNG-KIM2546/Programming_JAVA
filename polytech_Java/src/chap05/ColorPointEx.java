package chap05;

class Point1 {
	private int x,y;
	void set (int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showPoint() {
		System.out.println("(" + x + "," + y  + ")");
	}
	
}

class ColorPoint1 extends Point1{
	
	private String color;
	void setColor (String color) {
		this.color = color;
	}
	void showColorPoint () {
		System.out.print(this.color);
		super.showPoint();
	}
	
}


public class ColorPointEx {

	public static void main (String[] args) {
		Point1 p = new Point1();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint1 cp = new ColorPoint1();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}









