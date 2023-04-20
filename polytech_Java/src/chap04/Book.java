package chap04;

public class Book {
	// 필드 : 멤버변수
	String title;
	String author;
	String name = "준성";
	public static String names = "김준성";
	public static int num = 1000;
	//메소드
	//생성자 메소드
	Book() {
		System.out.println(name);
	}
	Book(String title){
//		super("", "");	// ("" , "") 문자열 2개짜리 찾아가, () 위에 출력 결과 가져와 
//		this.title = title;
//		this.author = "작가미상";
	}
	Book(String title,int n){n = 2000;}
	Book(String title, String author){
		System.out.println("String 두개짜리 출력된다!");
		this.title = title;
		this.author = author;
	}
		//일반메소드
		void printBook() {
			System.out.println(this.title + " : " + this.author);
		}
	
		public static void main(String args[]) {
//			Book book = new Book();
//			Book littlePrince = new Book("어린왕자", "생택쥐페리");
			Book loveStory = new Book("츈양뎐");
//			littlePrince.printBook();
			loveStory.printBook();
//			book.title = "북이예요.";
//			System.out.println(book.title);
		
		}
		
	
	}
	

