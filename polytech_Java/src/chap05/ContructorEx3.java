package chap05;

class A{
	public A() {
		System.out.println("�⺻������ A");
	}
	public A(int x) {
		System.out.println(x + ": ������������ A");
	}
}

class B extends A {
	public B() {
		super(100);
		System.out.println("�⺻������ B");
	}
	public B(int x) {
		System.out.println(x + ": �⺻������ B");
	}

}

public class ContructorEx3 {
	public static void main(String[] args) {
		B b = new B();
	}
}

