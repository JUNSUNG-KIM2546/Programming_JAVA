package chap07;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	public static void printList(LinkedList<String> ll) {
		Iterator<String> iterator = ll.iterator();
		
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			
			else
				separator = "\n";
			System.out.print(e + separator);
		}
		
	}
	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		
		//CollectionsEx ex = new CollectionsEx();
		//ex.printList(myList); 프린트리스트에 스태틱이 안붙였을때
		printList(myList);
		
		Collections.sort(myList);	//순차 정렬
		printList(myList);
		
		
		
		Collections.reverse(myList);	//역순 정렬
		printList(myList);
		
		int index = Collections.binarySearch(myList, "")+1;
		System.out.println(index + "번째 있습니다.");
		
	}
	
}
