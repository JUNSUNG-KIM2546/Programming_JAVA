package chap07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class chap07Ex5_2 {

	public static void main(String[] args) {
		HashMap<String, Student0502> h = new HashMap<String, Student0502>();
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		Student0502 s;
		
		System.out.println("�л��̸�, �а�, �й�, ��������� �޸��� �����Ͽ� �Է��ϼ���.");
		
		for(int i=0; i<4; i++) {
			System.out.print(">>>");
			st = new StringTokenizer(scan.nextLine(),",");	// ��ĵ�ʷ� �Է� ���� ���ٰ��� �޸� �������� �ɰ��� 
	
			while(st.hasMoreTokens()) {
				String name = st.nextToken().trim();	//.trim() ���� ������ ����
				String dept = st.nextToken().trim();
				int id = Integer.parseInt(st.nextToken().trim());	//���� ��ڽ�
				double score = Double.parseDouble(st.nextToken().trim());	//���� ��ڽ�
				
				s = new Student0502(name, dept, id, score);
				h.put(name,s);
			}
		}
		
//		for(Student0502 ss : a) {
//			System.out.println("-".repeat(20));
//			System.out.println("�̸� : " + ss.getName());
//			System.out.println("�а� : " + ss.getDept());
//			System.out.println("�й� : " + ss.getId());
//			System.out.println("������� : " + ss.getScore());
//		}
		
		System.out.println("����� ����� ���� : " + h.size());
		
		for(String key : h.keySet())
			System.out.println(h.get(key));
		//�� �Ʒ� ������
//		Set<String> set = h.keySet();	//Ű���� set�� �ְ�
//		Iterator<String> it = set.iterator();	//set�� ��ȸ����
//		while(it.hasNext()) {
//			System.out.println(h.get(it.next()));
//		}
		
//		//Iterator Ȱ��
//		System.out.print("�л� �̸� >> ");
//		String sc = scan.next();
//		Iterator<Student0502> it = h.iterator();
//		while(it.hasNext()) {
//			Student0502 sss = it.next();
//			
//			if(sss.getName().equals(sc))
//				System.out.println(sss);
//		}	
		
	}

}
