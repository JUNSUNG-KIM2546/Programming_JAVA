package chap01;
// 정수형의 2개의 input parameter를 입력받은 후
// 더 큰 수를 return 하는 max 메소드를 작성

public class mission02 {

	public static int max(int x, int y) {
		if(x>y)	//x가 y보다 큰지 비교
			return x;	//x가 y보다 크면 리턴(반환)x값을 줘라
		else	//x가 y보다 작은지 비교
			return y;	//x가 y보다 작으면 리턴(반환)y값을 줘라
	}
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("더 큰 수는 : " + max(x,y));

	}

}
