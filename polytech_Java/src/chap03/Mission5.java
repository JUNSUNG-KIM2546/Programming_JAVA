package chap03;

//Q. 1~100������ �� �߿��� 3�� ����� �ջ��� ���(sum)�� ����϶�

public class Mission5 {

	public static void main(String[] args) {
		//1. while�� Ȱ�� : 1~10������ ��(num)�� �ջ��� ��� ��(SUM)�� ����Ͻÿ�.
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
//		
		
		//3. for�� Ȱ�� : 1~10������ ��(num)�� �ջ��� ��� ��(SUM)�� ����Ͻÿ�.
//		int sum = 0;
//		for(int num=1; num<=10; num++)
//			sum += num;
//		
//		System.out.println("sum = " + sum);
		
		
		//Q1. 1~100������ �� �߿��� 13�� ����� �ջ��� ���(sum)�� ����϶�
		int sum = 0;
		for(int num =1; num<=100; num++) 
		if(num%13==0) sum += num;
		System.out.println("sum = " + sum);
		
		//Q2. 1~100������ �� �߿��� 13�� �Ǳ� �������� �ջ��� ���(sum)�� ����϶�
		sum = 0;
		for(int num =1; num<=100; num++){
			
		if(num%13==0) break;				//13�� �Ǳ� ������ for �������� ���ư��� �ݺ�, 13�� �Ǹ� �극��ũ
		sum += num;
										}
		System.out.println("sum = " + sum);
		
		
		//Q3. 1~100������ �� �� 13�� ����� ������  ���ڸ� �ջ��϶�
		sum = 0;
		for(int num =1; num<=100; num++){
			
		if(num%13==0) continue;				//13�� ����� �����ϰ� for �������� ���ư��� �ݺ�
		sum += num;
										}
		System.out.println("sum = " + sum);
		
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++)
			System.out.println();
								}
		
	
		
	}

}
