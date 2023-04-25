package chap01;
// 주석   컨트롤+/ 바로 주석처리
/* 영역주석 */
// 실행: 컨트롤+F11
// 만능키: 컨트롤+스페이스바
// static: 특별관리
// return: 뒤에 따라오는 값을 메소드의 결과로 반환, 동시에 메소드를 종료시킨다
public class HelloWorld {				// 보조(부) 메소드
	public static int sum(int n, int m) { //인풋 파라미터 //sum 메소드
		return n+m;
	}
// 위 (기능블록) 불러주지 않으면 실행이 안됨
		
	public static void main(String[] args) { //main 메소드(결과확인 메소드), 주 메소드
		int a = 10;  //정수(데이터타입) 표현 해줘야함
		int b = 30;  
		int s = sum(a,b); //인자값 //s값을 sum메소드(기능블록)에서 불러온다
		System.out.println("Hello World");
		System.out.println("a+b =" + s); //"a+b"= "" 문자취급, s= sum메소드에서 불러온 값
		System.out.println(s);
	}
}
