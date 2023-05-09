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
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");
		
		//CollectionsEx ex = new CollectionsEx();
		//ex.printList(myList); ����Ʈ����Ʈ�� ����ƽ�� �Ⱥٿ�����
		printList(myList);
		
		Collections.sort(myList);	//���� ����
		printList(myList);
		
		
		
		Collections.reverse(myList);	//���� ����
		printList(myList);
		
		int index = Collections.binarySearch(myList, "")+1;
		System.out.println(index + "��° �ֽ��ϴ�.");
		
	}
	
}
