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
		int cyper = plain ^ key;	//XOR(^) ��Ʈ��(��Ʈ������ ��(2����)0,1�� ���, ���Ŀ��� ��Ʈ�� ������ �޽�, �ٸ��� Ʈ��)
		System.out.println("cyper = " + cyper);
		System.out.println("plain = " + (cyper^key));
		System.out.println("================");
		
		System.out.println(10>>1);	// (10>>1) ��Ʈ(2������ ��ȯ) 1010 ���������� 1ĭ �̵��ϸ� 0101 = 5, �� 1/2�� �Ȱ�
		System.out.println(10<<1);	//(10<<1) ��Ʈ(2������ ��ȯ) 1010 �������� 1ĭ �̵��ϸ� 10100 = 20, �� 2�谡 �Ȱ�
		System.out.println("================");
		
		var v = 30;
		var b = 'v';
		var n = "�پ�";
		System.out.println(v);		//var�� �ڷ��� ��� ��밡���ϴ�.
		System.out.println(b);
		System.out.println(n);
		
		

	}

}
