// 04.04(화)
package chap03;

public class Mission13 {
	
	// makeArray 메소드 : int형 배열을 생성한후 데이터를 넣어 리턴하는 메소드
	static int[] makeArray() {
		int temp[] = new int[4];	//배열 생성
		for(int i = 0; i<temp.length; i++)
			temp[i] = i;			//배열의 원소를 0,1,2,3으로 초기화
		return temp;				//배열 리턴
	}

	public static void main(String[] args) {
		int[] intArray = makeArray();	// static을 달아 직속으로 사용 할수 있게 만들어 주어야 함.
		for(int n : intArray)
			System.out.print(n + " ");
			System.out.println();
			System.out.print(intArray + " ");

	}

}
//JVM : Gabage collection = 남은 쓰레기 영역
//-method 영역(정적 static)
//-stack 영역(지역변수, 인스턴스)
//-heap 영역()

