package chap07;

import java.util.Iterator;

public class MyStack {

	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("서울");
		stringStack.push("대전");
		stringStack.push("부산");

		for(int i=0; i<3; i++)
			System.out.println(stringStack.pop());	
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		for(int i=0; i<3; i++)
			System.out.println(intStack.pop());
	}

}
