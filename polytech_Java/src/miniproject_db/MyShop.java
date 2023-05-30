package miniproject_db;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	// ���θ� ���α׷��� ���� �ʵ屸��
	
	// ��� ����� ���� �迭
	User[] users = new User[2];
	
	
	// ��� ��ǰ ���� �迭
	Product[] products = new Product[4];
	
	// ��ǰ ������ �߰��� �� �ִ�
	ArrayList<Product> cart = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);
	
	// todo : �߰������� �ʿ��� �ʵ�
	//----------------------------------------------------------
	String title;	//���θ� �̸�
	int sel_user;	//���õ� ����� �ε���
	
	
	// setTitle : ���θ��� ���� �ޱ�
	//========================================
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
		
	// setUser : ����������� ����ϱ�
	//========================================
	@Override
	public void genUser() {
		User user = new User("Ȧ�浿", PayType.CARD);
		users[0] = user;
		
		user = new User("������", PayType.CASH);
		users[1] = user;
	}
		
	// setProduct : ��ǰ������ ����ϱ�
	//========================================
	@Override
	public void genProduct() {
		CellPhone cell = new CellPhone("�Ｚ ������ S20", 1200000, "LGU+");
		products[0] = cell;
		
		cell = new CellPhone("���� ������14", 1400000, "SKT");
		products[1] = cell;
		
		SmartTV tv = new SmartTV("�Ｚ 3D SmartTV", 3000000, "4K");
		products[2] = tv;
		
		tv = new SmartTV("LG SmartTV", 2000000, "FullHD");
		products[3] = tv;
	}
		
	// start : ���θ��� ��ü����� ���� �ó����� �ֱ�, ���θ��� ����ȭ���� ���� ���
	//========================================
	@Override
	public void start() {
		System.out.println();
		System.out.println(title + ": ���� ȭ�� - ���� ���� >>");
		System.out.println("=".repeat(60));
		//1. ����� ���� ���
		int index = 0;
		
		for(User u : users) {
			System.out.print(" [" + index++ + "] ");
			System.out.println(u.toString());
		}
		System.out.println("=".repeat(60));
		System.out.println(" [x] ���� ");	// System.exit(0) ȣ�� - ���α׷� ����
		System.out.print(" ���� : ");
		
		String select = scan.next(); // ����: x = ����
		
		switch(select) {
		case "x" : System.exit(0); break;	//����
		default :
			//1. select ���� int������ �ٲٰ�
			//2. int�� �ٲ� select ���� �ε��� - psel�� ���� products ������
			//3. cart�� add ��Ų��.
			sel_user = Integer.parseInt(select);
			productList();
		}
	}
	
	// productList : ��ǰ���� ����ϱ�
	//========================================
	public void productList() {
		System.out.println();
		System.out.println(title + ": ��ǰ ��� - ��ǰ ���� >>");
		System.out.println("=".repeat(60));
		int index = 0;
		
		for(Product p : products) {
			System.out.print(" [" + index++ + "] ");
			p.printDefault();
		}
		System.out.println("=".repeat(60));
		System.out.println(" [h] ����ȭ�� ");	// start �޼ҵ�
		System.out.println(" [c] üũȭ�� ");	// checjOut �޼ҵ�
		System.out.print(" ���� : ");
		
		String select = scan.next(); // ����: h, c, ��ǰindex
		
		switch(select) {
		case "h" : start(); break;	//����ȭ������
		case "c" : checkOut(); break;	//üũ�ƿ�����
		default :
			//1. select ���� int������ �ٲٰ�
			//2. int�� �ٲ� select ���� �ε��� - psel�� ���� products ������
			//3. cart�� add ��Ų��.
			cart.add(products[Integer.parseInt(select)]);
			productList();
		}
		// todo : �� �� �� ������ üũ
		
	}
	
	// checkOut : üũ�ƿ� �� �����ϱ�
	//========================================
	public void checkOut() {
		int sum = 0;	//��ٱ��� ���� �հ�
		System.out.println();
		System.out.println(title + ": üũ �ƿ� �ϱ� >>");
		System.out.println("=".repeat(60));
		
		int index = 0;
		
		for(Product p : cart) {
			System.out.print(" [" + index++ + "] ");
			System.out.println(p.toString());
			System.out.println();
			sum += p.getPrice();
		}
		System.out.println("=".repeat(60));
		System.out.println(" ����� �� : " + users[sel_user].getName());
		System.out.println("=".repeat(60));
		// ���� ��� ���
		System.out.println(" ���� ��� : " + users[sel_user].getPaytype());
		// �հ� ���
		System.out.println(" �� ���� �ݾ� : " + sum);
		// ���� �޴��� ���� ����
		System.out.println(" [p] ���� , [q] �ֹ� �ϱ�");
		System.out.print(" ���� : ");
		
		// ����
		String select = scan.next(); // ����: p = ��ǰ���, q = ���� ����
		
		switch(select) {
		case "p" : productList(); break;	//��ǰ��� ȭ��
		case "q" :
			System.out.println("=".repeat(30));
			System.out.println("���θ� ���α׷��� ���� �˴ϴ�.");
			System.out.println("=".repeat(30));
			System.exit(0);
			break;	//����
		default :
			checkOut();
		}
	}
	
	// ���α׷��� �ó������� ���� �ʱ�ȭ�ϰ� �����Ѵ�.
	public void run() {
		setTitle("�����θ�");
		genUser();
		genProduct();
		start();
	}
	
	public static void main (String args[]) {
		MyShop shop = new MyShop();
		shop.run();
	}
	
	//(����)������ ��ٱ��� DB ����(���) �ؿ���!
	// ��ǰ��ȣ, ��ǰ��, ����, ����, ���ϰ���
	
	// UML
	//-class Diagram
	//-Sequence Diagram
	
} 


