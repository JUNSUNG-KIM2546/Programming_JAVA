package chap07;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		//Iterator 활용
		Iterator<Integer> it = v.iterator();
		while(it.hasNext())	//검색,출력 할게 더 있는지 체크(있다면 밑에서 출력을 한다)
			System.out.println(it.next());
		
		
	}

}
