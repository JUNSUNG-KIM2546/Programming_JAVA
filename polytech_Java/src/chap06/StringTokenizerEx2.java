package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

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
		String data2 = " ȫ�浿,��,65,170 / �輼��,��,57,164 / ���屺,��,80,190 / ����,��,77,667 / ȫ�̿�,��,64,165";
		StringTokenizer user = new StringTokenizer(data2,"/");
		StringTokenizer u = new StringTokenizer(data2,"/");	
		
		int sum = 0;
		int count = 0;
				
		while (user.hasMoreTokens()) {	//�޽��� �ɶ����� �ɰ��� ������ �´� (���� ������� ������)
			System.out.println("��� : " + u.nextToken());	//���� data�� �޸��������� �ɰ��� st�� �����Ѱ��� ����Ѵ�.
			System.out.println();
			StringTokenizer users = new StringTokenizer(user.nextToken(),",");
			
			while (users.hasMoreTokens()) {
				System.out.println("�̸� : " + users.nextToken());
				String gender = users.nextToken();				
				System.out.println("���� : " + gender);
				int weight = Integer.parseInt(users.nextToken());
				System.out.println("���� : " + weight);
				System.out.println("Ű : " + users.nextToken());
				System.out.println("-----------------------------------");
				
				if(gender.equals("��")) {
					count++;
					sum+=weight;
				}
				
				//users.nextToken();
				
			}
			
			
		}

		System.out.println("���ڵ� ��� ü�� : " + (double)sum/count);
	}

}
