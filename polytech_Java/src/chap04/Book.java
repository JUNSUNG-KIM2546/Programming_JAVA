package chap04;

public class Book {
	// �ʵ� : �������
	String title;
	String author;
	String name = "�ؼ�";
	public static String names = "���ؼ�";
	public static int num = 1000;
	//�޼ҵ�
	//������ �޼ҵ�
	Book() {
		System.out.println(name);
	}
	Book(String title){
//		super("", "");	// ("" , "") ���ڿ� 2��¥�� ã�ư�, () ���� ��� ��� ������ 
//		this.title = title;
//		this.author = "�۰��̻�";
	}
	Book(String title,int n){n = 2000;}
	Book(String title, String author){
		System.out.println("String �ΰ�¥�� ��µȴ�!");
		this.title = title;
		this.author = author;
	}
		//�Ϲݸ޼ҵ�
		void printBook() {
			System.out.println(this.title + " : " + this.author);
		}
	
		public static void main(String args[]) {
//			Book book = new Book();
//			Book littlePrince = new Book("�����", "�������丮");
			Book loveStory = new Book("��絯");
//			littlePrince.printBook();
			loveStory.printBook();
//			book.title = "���̿���.";
//			System.out.println(book.title);
		
		}
		
	
	}
	

