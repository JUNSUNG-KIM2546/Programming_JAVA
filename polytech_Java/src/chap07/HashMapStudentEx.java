package chap07;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student0509> map = new HashMap<>();
		map.put("Ȳ����", new Student0509(1, "010-000-0000"));
		map.put("���繮", new Student0509(1, "010-111-1111"));
		map.put("�賲��", new Student0509(1, "010-222-2222"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�˻��� �̸�?");
			String name = sc.nextLine();
			
			if(name.equals("exit"))
				break;
			System.out.println(map.get(name));
			
		}

	}

}
