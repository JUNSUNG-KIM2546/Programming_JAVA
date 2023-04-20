package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		
		String data = "ȫ�浿,010-1234-5678,�����,�л�";		// �޸� �������� �ɰ���(�ϳ��� ��ū)
		StringTokenizer st = new StringTokenizer(data,",");	//���� data�� �޸��������� �ɰ��� st�� �����Ѵ�
		
		while (st.hasMoreTokens()) {	//�޽��� �ɶ����� �ɰ��� ������ �´� (���� ������� ������)
			System.out.println("�̸� : " + st.nextToken());	//���� data�� �޸��������� �ɰ��� st�� �����Ѱ��� ����Ѵ�.
			System.out.println("��ȭ : " + st.nextToken());
			System.out.println("�ּ� : " + st.nextToken());
			System.out.println("���� : " + st.nextToken());
			System.out.println();
		}
			
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
				System.out.println("���� : " + users.nextToken());
				System.out.println("���� : " + users.nextToken());
				System.out.println("Ű : " + users.nextToken());
				System.out.println("-----------------------------------");
				
				if(users.nextToken().equals("��")) {
					count++;
					sum+=Integer.parseInt(users.nextToken());
				}
				
				//users.nextToken();
				
			}
			
			
		}

		System.out.println("���ڵ� ��� ü�� : " + (int)(double)sum/count);
	}

}
