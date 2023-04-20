package chap06;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerEx3 {

	public static void main(String[] args) {
			
		// ���ڵ��� ü���� ����� ���϶�		wrapper class = Integer.parseInt(����) ���������� �ٲ��� (����ƽ)
		// StringTokenizer
		// -nextToken
		// -hasMoreTokens
		
		//String ��
		// -gender.e
		
		//wrapper Ŭ���� Ȱ��
		//����Ʈ = Integer.parseInt(st1.nextToken)
		
		// ȫ�浿,��,65,170 / �輼��,��,57,164 / ���屺,��,80,190 / ����,��,77,667 / ȫ�̿�,��,64,165
		String data2 = " ȫ�浿,��,65,170/�輼��,��,57,164/���屺,��,80,190/����,��,77,667/ȫ�̿�,��,64,165";
		StringTokenizer user = new StringTokenizer(data2,"/");
		ArrayList<Person> al = new ArrayList<Person>();
		Person p = new Person();
		
		while (user.hasMoreTokens()) {	//�޽��� �ɶ����� �ɰ��� ������ �´� (���� ������� ������)
			StringTokenizer users = new StringTokenizer(user.nextToken(),",");
			
			while (users.hasMoreTokens()) {
				p.setName(users.nextToken());
				p.setGender(users.nextToken());
				p.setWeight(Integer.parseInt(users.nextToken()));
				p.setHeight(Integer.parseInt(users.nextToken()));
//				p.setHeight(Integer.parseInt(users.nextToken().trim()));
				al.add(p);
				
				System.out.println("-----------------------------------");				
			}			
		}
		for(Person s : al) {
			System.out.println(s.getHeight());
		}
			
		
		}

}
