package chap07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class chap07Ex7 {

	public static void main(String[] args) {
		HashMap<String, Double> h = new HashMap<String, Double>();
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		
		System.out.println("�̷����бݰ����ý����Դϴ�. (�����̽��ٷ� �����Ͽ� �Է��ϼ���.)");
		
		for(int i=0; i<5; i++) {
			System.out.print("�̸��� ���� >> ");
			st = new StringTokenizer(scan.nextLine()," ");	// ��ĵ�ʷ� �Է� ���� ���ٰ��� �޸� �������� �ɰ��� 
	
			while(st.hasMoreTokens()) {
				String names = st.nextToken().trim();	//.trim() ���� ������ ����
				double scores = Double.parseDouble(st.nextToken().trim());	//���� ��ڽ�
			
				h.put(names, scores);
			}
		}
		
		//1.
		System.out.println("����� ����� ���� : " + h.size());
		System.out.print("���л� ���� ���� ���� �Է� >> ");
		double sc = scan.nextDouble();
		for(String key : h.keySet())
			if(h.get(key) >= sc)
				System.out.println(key); 
		
		//2.
		System.out.println("����� ����� ���� : " + h.size());
		System.out.print("���л� ���� ���� ���� �Է� >> ");
		double sc1 = scan.nextDouble();
		Set<String> set = h.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			double score = h.get(name);
			if(score >= sc1)
				System.out.println(name);
		}
			
		//3.
		Collection<Double> c = h.values();
		Iterator<Double> it1 = c.iterator();
		while(it1.hasNext())
			System.out.println(it.next());
		
		
		scan.close();
	}

}
