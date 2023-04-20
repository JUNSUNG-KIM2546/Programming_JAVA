package chap03;

public class Mission7 {

	public static void main(String[] args) {
	
		// 달력 출력
		int count = 0;
		
		for(int x=1; x<=31; x++) {
			count++;
			System.out.printf("%-5d",x);
			
			if(count%7 == 0)	System.out.println();
		
								 }
										   }
	

}
