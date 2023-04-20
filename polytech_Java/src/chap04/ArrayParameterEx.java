package chap04;

public class ArrayParameterEx {
	static void printCharArray(char a[]) {
//		for (int i = 0; i<a.length; i++)
//			if (a[i] == ' ')
//				a[i] = ',';
		for (char aa : a)
			System.out.print(aa);
		System.out.println();
	}
	
	static void replaceSpace(char a[]) {
		for (int i=0; i<a.length; i++)
			if(a[i] == ' ')
				a[i] = '™';
	}
	
	
	public static void main(String[] args) {
		char c[] = {'T','H','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l',' '};
		
		printCharArray(c);
		replaceSpace(c);	//공백을 변경값으로 바꾼다.
		printCharArray(c);
	}

}
