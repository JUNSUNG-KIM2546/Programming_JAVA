package chap03;

public class Mission4 {

	public static void main(String[] args) {
//		//1. while�� Ȱ�� : 1~10������ ��(num)�� �ջ��� ��� ��(SUM)�� ����Ͻÿ�.
//		int num = 1;
//		int sum = 0;						//������ (�ʱ�ȭ�� �׻� 0)
//		
//		while(num<=10)	{
//						sum +=num;			
//						num++;
//						}
//		
//		System.out.println("sum = " + sum);
		
		
		//2. do while�� Ȱ�� : 1~10������ ��(num)�� �ջ��� ��� ��(SUM)�� ����Ͻÿ�.
//		int num = 1;
//		int sum = 0;						//������ (�ʱ�ȭ�� �׻� 0)
//		
//		  do{
//				sum +=num;			
//				num++;
//			}while	(num<=10);
//		  
//		System.out.println("sum = " + sum);
		
		
		//3. for�� Ȱ�� : 1~10������ ��(num)�� �ջ��� ��� ��(SUM)�� ����Ͻÿ�.
		int sum = 0;
		for(int num=1; num<=10; num++)
			sum += num;
		
		System.out.println("sum = " + sum);
		
	}

}
