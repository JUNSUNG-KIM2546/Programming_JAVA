package chap07;

import java.util.Vector;

public class VectorEx {
	
	public void printVector(Vector<Integer> v) {
		for(Integer i : v)
			System.out.println(i);
	}
	
	public static void main(String[] arg) {
		Vector<Integer> v = new Vector<Integer>();	//갈호에 용량을 정할수있다.
		VectorEx ex = new VectorEx();	//printVector를 Ex로 불러오기
		v.add(5);	//int형의 데이터가 Integer로 자동박싱되면서 들어감
		v.add(4);
		v.add(-1);
		v.add(6);
		v.add(2,7);	//2번자리에 7값을 넣음
		int sum = 0;
		
		System.out.println("벡터 객체의 요소 갯수 : " + v.size());
		System.out.println("벡터 객체의 현재 용량 : " + v.capacity());	//처음 기본용량을 10개까지 정한다.
		System.out.println("벡터 객체 비어있는지 확인 : " + v.isEmpty());
		System.out.println(v.contains(-1));	//벡터에 -1이 있으므로 트루
		
		ex.printVector(v);
		
//		for(int i=0; i<v.size(); i++)
//			System.out.println("요소 : " + v.get(i));
		
		for(Integer i : v)
			sum += i;
			System.out.println("sum : " + sum);
		
	}

}
