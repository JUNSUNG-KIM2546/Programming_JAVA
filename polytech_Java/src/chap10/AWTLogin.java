package chap10;

import java.awt.*;
import javax.swing.*;


public class AWTLogin extends Frame {

	public AWTLogin() {
		setTitle("로그인 예제");
		setLayout(new BorderLayout());
		Label label1 = new Label("ID");
		Label label2 = new Label("PW");
		
		TextField text1 = new TextField(10);
		TextField text2 = new TextField(10);
		
		Button btn = new Button("Login");
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		
		p1.add(label1);
		p1.add(text1);
		
		p2.add(label2);
		p2.add(text2);
		p3.add(btn);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		setSize(250,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		AWTLogin login = new AWTLogin();

	}

}
