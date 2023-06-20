package chap10;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.*;

import javax.swing.*;

public class FruitSelect extends JFrame {
	
	int index = 0;
	String fruits[] = {"사과","귤","포도","수박","메론","참외"};
	
	JButton button1 = new JButton("<<");
	JButton button2 = new JButton(">>");
	JButton button3 = new JButton(fruits[0]);
	
	public FruitSelect() {
		setTitle("과일 고르기 GUI 프로그램");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		button3.setBackground(Color.CYAN);
		
		button1.addMouseListener(new Select());
		button2.addMouseListener(new Select());
		
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.CENTER);
		
		setSize(300,100);
		setVisible(true);
	}
	
	class Select extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			JButton btn = (JButton)e.getSource();	//이벤트 소스
			if (btn == button1) {
				index--;
				if (index <= 0) index = 0;
			}
			else if (btn == button2) {
				index++;
				if (index >= fruits.length) index = fruits.length - 1;
			}
			
			button3.setText(fruits[index]);
		}
	}

	public static void main(String[] args) {
		FruitSelect fruit = new FruitSelect();

	}

}
