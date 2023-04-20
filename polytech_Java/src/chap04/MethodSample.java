package chap04;

public class MethodSample {

	//�޼ҵ� �����ε�
	int getSum(int x, int y) {
		return x+y;
	}
	int getSum(int x, int y, int z) {
		return x+y+z;
	}
	double getSum(double x, double y) {		// (�޼ҵ�)����Ÿ�԰� (����)Ÿ�Լ����� ���ƾ� �Ѵ�.
		return (double)(x+y);
	}
	String getSum(String x,String y ) {
		return x + y;
	}
	
	public static void main(String[] args) {		// static ������ ����� �ҷ��´�. ������ �����ָ� ��ü�� ����
		MethodSample sample = new MethodSample();
		System.out.println(sample.getSum(1,2));
		System.out.println(sample.getSum(1,2,3));
		System.out.println(sample.getSum(3.5,3.5));
		System.out.println(sample.getSum("1", "5"));
		
	}
}
