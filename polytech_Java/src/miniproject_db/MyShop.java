package miniproject_db;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	// 쇼핑몰 프로그램을 위한 필드구성
	
	// 등록 사용자 정보 배열
	User[] users = new User[2];
	
	
	// 등록 상품 정보 배열
	Product[] products = new Product[4];
	
	// 상품 정보를 추가할 수 있는
	ArrayList<Product> cart = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);
	
	// todo : 추가적으로 필요한 필드
	//----------------------------------------------------------
	String title;	//쇼핑몰 이름
	int sel_user;	//선택된 사용자 인덱스
	
	
	// setTitle : 쇼핑몰의 제목 달기
	//========================================
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
		
	// setUser : 사용자정보를 등록하기
	//========================================
	@Override
	public void genUser() {
		User user = new User("홀길동", PayType.CARD);
		users[0] = user;
		
		user = new User("엄남경", PayType.CASH);
		users[1] = user;
	}
		
	// setProduct : 상품정보를 등록하기
	//========================================
	@Override
	public void genProduct() {
		CellPhone cell = new CellPhone("삼성 갤러시 S20", 1200000, "LGU+");
		products[0] = cell;
		
		cell = new CellPhone("애플 아이폰14", 1400000, "SKT");
		products[1] = cell;
		
		SmartTV tv = new SmartTV("삼성 3D SmartTV", 3000000, "4K");
		products[2] = tv;
		
		tv = new SmartTV("LG SmartTV", 2000000, "FullHD");
		products[3] = tv;
	}
		
	// start : 쇼핑몰의 전체기능을 위한 시나리오 넣기, 쇼핑몰의 메인화면을 위한 기능
	//========================================
	@Override
	public void start() {
		System.out.println();
		System.out.println(title + ": 메인 화면 - 계정 선택 >>");
		System.out.println("=".repeat(60));
		//1. 사용자 정보 출력
		int index = 0;
		
		for(User u : users) {
			System.out.print(" [" + index++ + "] ");
			System.out.println(u.toString());
		}
		System.out.println("=".repeat(60));
		System.out.println(" [x] 종료 ");	// System.exit(0) 호출 - 프로그램 종료
		System.out.print(" 선택 : ");
		
		String select = scan.next(); // 선택: x = 종료
		
		switch(select) {
		case "x" : System.exit(0); break;	//종료
		default :
			//1. select 값을 int형으로 바꾸고
			//2. int로 바뀐 select 값의 인덱스 - psel에 대한 products 정보를
			//3. cart에 add 시킨다.
			sel_user = Integer.parseInt(select);
			productList();
		}
	}
	
	// productList : 상품정보 출력하기
	//========================================
	public void productList() {
		System.out.println();
		System.out.println(title + ": 상품 목록 - 상품 선택 >>");
		System.out.println("=".repeat(60));
		int index = 0;
		
		for(Product p : products) {
			System.out.print(" [" + index++ + "] ");
			p.printDefault();
		}
		System.out.println("=".repeat(60));
		System.out.println(" [h] 메인화면 ");	// start 메소드
		System.out.println(" [c] 체크화면 ");	// checjOut 메소드
		System.out.print(" 선택 : ");
		
		String select = scan.next(); // 선택: h, c, 상품index
		
		switch(select) {
		case "h" : start(); break;	//메인화면으로
		case "c" : checkOut(); break;	//체크아웃으로
		default :
			//1. select 값을 int형으로 바꾸고
			//2. int로 바뀐 select 값의 인덱스 - psel에 대한 products 정보를
			//3. cart에 add 시킨다.
			cart.add(products[Integer.parseInt(select)]);
			productList();
		}
		// todo : 더 할 일 없는지 체크
		
	}
	
	// checkOut : 체크아웃 후 결제하기
	//========================================
	public void checkOut() {
		int sum = 0;	//장바구니 가격 합계
		System.out.println();
		System.out.println(title + ": 체크 아웃 하기 >>");
		System.out.println("=".repeat(60));
		
		int index = 0;
		
		for(Product p : cart) {
			System.out.print(" [" + index++ + "] ");
			System.out.println(p.toString());
			System.out.println();
			sum += p.getPrice();
		}
		System.out.println("=".repeat(60));
		System.out.println(" 사용자 명 : " + users[sel_user].getName());
		System.out.println("=".repeat(60));
		// 결제 방법 출력
		System.out.println(" 결제 방법 : " + users[sel_user].getPaytype());
		// 합계 출력
		System.out.println(" 총 결제 금액 : " + sum);
		// 선택 메뉴에 따른 실행
		System.out.println(" [p] 이전 , [q] 주문 하기");
		System.out.print(" 선택 : ");
		
		// 선택
		String select = scan.next(); // 선택: p = 상품목록, q = 결제 종료
		
		switch(select) {
		case "p" : productList(); break;	//상품목록 화면
		case "q" :
			System.out.println("=".repeat(30));
			System.out.println("쇼핑몰 프로그램이 종료 됩니다.");
			System.out.println("=".repeat(30));
			System.exit(0);
			break;	//종료
		default :
			checkOut();
		}
	}
	
	// 프로그램의 시나리오에 따라 초기화하고 시작한다.
	public void run() {
		setTitle("쇼핑핑몰");
		genUser();
		genProduct();
		start();
	}
	
	public static void main (String args[]) {
		MyShop shop = new MyShop();
		shop.run();
	}
	
	//(과제)다음주 장바구니 DB 구성(고민) 해오기!
	// 상품번호, 상품명, 수량, 가격, 세일가격
	
	// UML
	//-class Diagram
	//-Sequence Diagram
	
} 


