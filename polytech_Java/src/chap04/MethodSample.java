package chap04;

public class MethodSample {

	//메소드 오버로딩
	int getSum(int x, int y) {
		return x+y;
	}
	int getSum(int x, int y, int z) {
		return x+y+z;
	}
	double getSum(double x, double y) {		// (메소드)리턴타입과 (리턴)타입선언이 같아야 한다.
		return (double)(x+y);
	}
	String getSum(String x,String y ) {
		return x + y;
	}
	
	public static void main(String[] args) {		// static 선언을 해줘야 불러온다. 선언을 안해주면 객체를 생성
		MethodSample sample = new MethodSample();
		System.out.println(sample.getSum(1,2));
		System.out.println(sample.getSum(1,2,3));
		System.out.println(sample.getSum(3.5,3.5));
		System.out.println(sample.getSum("1", "5"));
		
	}
}
