package chap03;

public class Mission14 {

	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		}
		catch (ArithmeticException e){
			System.out.println("에러가 발생!!");	//에러문구를 원하는 문구로 출력
			e.printStackTrace();				//에러 났다고 문구 출력
		}

	}

}
// 생성자(Constructor):클래스명하고 같아야함, 공간을 확보하여 초기값까지 생성 
//	public class circle {
//		public circle(){}
//}