// 04.04
package chap04;

public class Circle2 {
	//필드 : 속성 =============================================
	public double radius;
	public final double PI = 3.141592;
	
	//메소드 : 행위 =============================================
	//생성자 메소드
	public Circle2(){}	//Default 생성자
	public Circle2(double radius) {
		this.radius = radius;
	}
	//(일반 메소드) 현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return PI * radius * radius;
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