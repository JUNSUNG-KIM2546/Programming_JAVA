package chap02;

public class mission1 {

	public static void main(String[] args) {
		boolean result;
		result = 3 == 5;
		System.out.println(result);
		
		System.out.println("================");
		
		int a = (int) 3.5;
		
		int plain = 10;
		int key = 8;
		int cyper = plain ^ key;	//XOR(^) 비트논리(비트단위로 논리(2진수)0,1로 계산, 계산식에서 비트가 같으면 펄스, 다르면 트루)
		System.out.println("cyper = " + cyper);
		System.out.println("plain = " + (cyper^key));
		System.out.println("================");
		
		System.out.println(10>>1);	// (10>>1) 비트(2진수로 변환) 1010 오른쪽으로 1칸 이동하면 0101 = 5, 즉 1/2가 된거
		System.out.println(10<<1);	//(10<<1) 비트(2진수로 변환) 1010 왼쪽으로 1칸 이동하면 10100 = 20, 즉 2배가 된거
		System.out.println("================");
		
		var v = 30;
		var b = 'v';
		var n = "바아";
		System.out.println(v);		//var는 자료형 대신 사용가능하다.
		System.out.println(b);
		System.out.println(n);
		
		

	}

}
