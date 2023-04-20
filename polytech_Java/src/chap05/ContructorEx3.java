package chap05;

class A{
	public A() {
		System.out.println("기본생성자 A");
	}
	public A(int x) {
		System.out.println(x + ": 정수값생성자 A");
	}
}

class B extends A {
	public B() {
		super(100);
		System.out.println("기본생성자 B");
	}
	public B(int x) {
		System.out.println(x + ": 기본생성자 B");
	}

}

public class ContructorEx3 {
	public static void main(String[] args) {
		B b = new B();
	}
}

