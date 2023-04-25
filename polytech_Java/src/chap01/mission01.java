package chap01;
// 미션01:주어진 섭씨 온도를 화씨 온도로 바꾸는 CtoF 메소드를 작성하라
// F = (9/5)*C + 32
// C : 15도 라고 가정

public class mission01 {
	public static double CtoF(double c) {	//CtoF()갈호안에 인풋값(입력)
		return (9.0/5.0)*c+32;	//뒤에 따라오는 값을 메소드의 결과로 반환, 동시에 메소드를 종료시킨다
	}
			
	public static void main(String[] args) {
		int c = 14;
		System.out.println("화씨온도 : " + CtoF(c));
		}
}
