//04.04
package chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mission15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum = 0, n = 0;
		for(int i=0;i<3;i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt();	//���� �Է�
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scanner.next();		//�Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
				i--;	//�ε����� �������� �ʵ��� �̸� ����
				continue;	//���� ����
			}
			sum += n;	//��ġ��
		}
		System.out.println("����" + sum);
		scanner.close();
	}
	

}
//Ŭ����: ��ü ����� ������(ĸ��ȭ)
//��ü(�ν��Ͻ�): Ŭ���� ����� ������ ��ü, ��ü �� �����Ϳ� ���� ��ȣ, �ܺ� ���� ����
			  