package chap06;

public class StringEx {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a.length());
		System.out.println(b.length());
		
		System.out.println(a.contains("#"));	// a�� #�� �� �ִ��� Ȯ��
		System.out.println(a.concat(b));	// a �ڿ� b�� ���δ�
		System.out.println(a);
		System.out.println(a.trim());
		System.out.println();
		
		String c = a.concat(b);
		System.out.println(c);
		System.out.println(c.replace("C#", "Java"));	// C#�� Java�� �ٲ㼭 ����϶�
		
		String s[] = c.split(",");
		for (String n : s)	// ,�� �������� �߶� ���
			System.out.println(n);
		
		String sub = c.substring(4);	// sub�� c�� 4���ڸ����� �־��
		System.out.println(sub);
		
		System.out.println(c.charAt(3));	// c ���ڿ� ��ȣ�� �ִ� ���ڸ� ������ ����϶�
		
		
	}

}
