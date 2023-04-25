package chap06;

public class StringEx {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a.length());
		System.out.println(b.length());
		
		System.out.println(a.contains("#"));	// a에 #이 들어가 있는지 확인
		System.out.println(a.concat(b));	// a 뒤에 b를 붙인다
		System.out.println(a);
		System.out.println(a.trim());
		System.out.println();
		
		String c = a.concat(b);
		System.out.println(c);
		System.out.println(c.replace("C#", "Java"));	// C#을 Java로 바꿔서 출력하라
		
		String s[] = c.split(",");
		for (String n : s)	// ,를 기준으로 잘라서 출력
			System.out.println(n);
		
		String sub = c.substring(4);	// sub에 c를 4번자리부터 넣어라
		System.out.println(sub);
		
		System.out.println(c.charAt(3));	// c 문자열 번호에 있는 문자를 가져와 출력하라
		
		
	}

}
