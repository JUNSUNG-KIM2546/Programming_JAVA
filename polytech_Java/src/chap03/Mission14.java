package chap03;

public class Mission14 {

	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		}
		catch (ArithmeticException e){
			System.out.println("������ �߻�!!");	//���������� ���ϴ� ������ ���
			e.printStackTrace();				//���� ���ٰ� ���� ���
		}

	}

}
// ������(Constructor):Ŭ�������ϰ� ���ƾ���, ������ Ȯ���Ͽ� �ʱⰪ���� ���� 
//	public class circle {
//		public circle(){}
//}