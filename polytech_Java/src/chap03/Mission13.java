// 04.04(ȭ)
package chap03;

public class Mission13 {
	
	// makeArray �޼ҵ� : int�� �迭�� �������� �����͸� �־� �����ϴ� �޼ҵ�
	static int[] makeArray() {
		int temp[] = new int[4];	//�迭 ����
		for(int i = 0; i<temp.length; i++)
			temp[i] = i;			//�迭�� ���Ҹ� 0,1,2,3���� �ʱ�ȭ
		return temp;				//�迭 ����
	}

	public static void main(String[] args) {
		int[] intArray = makeArray();	// static�� �޾� �������� ��� �Ҽ� �ְ� ����� �־�� ��.
		for(int n : intArray)
			System.out.print(n + " ");
			System.out.println();
			System.out.print(intArray + " ");

	}

}
//JVM : Gabage collection = ���� ������ ����
//-method ����(���� static)
//-stack ����(��������, �ν��Ͻ�)
//-heap ����()

