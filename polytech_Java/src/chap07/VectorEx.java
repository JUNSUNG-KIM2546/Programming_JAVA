package chap07;

import java.util.Vector;

public class VectorEx {
	
	public void printVector(Vector<Integer> v) {
		for(Integer i : v)
			System.out.println(i);
	}
	
	public static void main(String[] arg) {
		Vector<Integer> v = new Vector<Integer>();	//��ȣ�� �뷮�� ���Ҽ��ִ�.
		VectorEx ex = new VectorEx();	//printVector�� Ex�� �ҷ�����
		v.add(5);	//int���� �����Ͱ� Integer�� �ڵ��ڽ̵Ǹ鼭 ��
		v.add(4);
		v.add(-1);
		v.add(6);
		v.add(2,7);	//2���ڸ��� 7���� ����
		int sum = 0;
		
		System.out.println("���� ��ü�� ��� ���� : " + v.size());
		System.out.println("���� ��ü�� ���� �뷮 : " + v.capacity());	//ó�� �⺻�뷮�� 10������ ���Ѵ�.
		System.out.println("���� ��ü ����ִ��� Ȯ�� : " + v.isEmpty());
		System.out.println(v.contains(-1));	//���Ϳ� -1�� �����Ƿ� Ʈ��
		
		ex.printVector(v);
		
//		for(int i=0; i<v.size(); i++)
//			System.out.println("��� : " + v.get(i));
		
		for(Integer i : v)
			sum += i;
			System.out.println("sum : " + sum);
		
	}

}
