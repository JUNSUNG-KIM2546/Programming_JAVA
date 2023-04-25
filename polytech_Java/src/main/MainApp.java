package main;

import etc.Calc;	//ÀÓÆ÷Æ®

public class MainApp{
	
	public static void main(String[] args) {
		
		Calc c = new Calc(10,20);
		System.out.println(c.sum());
	}
}
