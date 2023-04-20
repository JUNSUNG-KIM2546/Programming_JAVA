// 04.04
package chap04;

public class Circle1_1 {
	//필드 : 속성 =============================================
	public int radius;		//맴버변수
	public String name;		//맨버변수
	public static final double PI = 3.14;		//맴버변수(상수형)
	public static String Circle_name = "원형";	//클래스변수
	
	//메소드 : 행위 =============================================
	//생성자 메소드
	public Circle1_1(){}	//Default 생성자
	public Circle1_1(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}
	//일반 메소드
	double getArea() {
		return PI * radius * radius;
	}
	
	static double getArea(double radius) {
		return PI * radius * radius;
	}
	//main 메소드
	public static void main(String aragw[]) {
//		Circle1_1 c = new Circle1_1("원2", 4);
//		//위,아래 서로 다른 영역
//		Circle1_1 c1 = new Circle1_1("원1", 3);
//		System.out.printf("%.3f",c1.getArea());
//		System.out.println();
//		System.out.println(c.getArea());
		
		Circle pizza = new Circle("피자",10);
		Circle donut = new Circle("도넛",2);
		System.out.println(Circle1_1.Circle_name);
		System.out.println("피자의 크기는"+pizza.getArea());
		System.out.println("도넛의 크기는"+donut.getArea());
		System.out.println(Circle1_1.getArea(3.0));
		
	}
		
}
//JVM : Gabage collection = 남은 쓰레기 영역
//-method 영역(정적 static)
//-stack 영역(지역변수, 인스턴스)
//-heap 영역()

//클래스: 객체 모양을 선언한(캡슐화)
//객체(인스턴스): 클래스 모양대로 생성된 실체, 객체 내 데이터에 대한 보호, 외부 접근 제한

//생성자(Constructor):클래스명하고 같아야함, 공간을 확보하여 초기값까지 생성 
//	public class circle {
//		public circle(){}
//}

//다형성 : 메소드 오버로드
//	   : 메소드 오버라이딩

// public = 프로젝트안에서 다 사용가능
// default = 패키지안에서만 사용가능