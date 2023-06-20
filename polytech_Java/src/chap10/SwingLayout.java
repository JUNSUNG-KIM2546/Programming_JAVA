package chap10;


import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class SwingLayout extends JFrame {
	
	JButton button1 = new JButton("버튼1");
	JButton button2 = new JButton("버튼2");
	JButton button3 = new JButton("버튼3");
	JButton button4 = new JButton("버튼4");
	JButton button5 = new JButton("버튼5");
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	public SwingLayout() {
		setTitle("스윙 레이아웃 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Container container = getContentPane();
		//container.setBackground(Color.CYAN);
		
		// container에 panel 들을 부착시키자!
		//container.add(p1);
		//container.add(p2);
		//container.add(p3);
		//flowLayout();
		//gridLayout();
		//borderLayout();
		cardLayout();
		
		setSize(300,200);
		setVisible(true);
	}
	
	// FlowLayout 설정하기
	public void flowLayout() 	{
		p1.setLayout(new FlowLayout());
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
		p1.add(button5);
	}
	public void gridLayout() 	{
		p1.setLayout(new GridLayout(2,2));
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
		p1.add(button5);
	}
	public void borderLayout() 	{
		p1.setLayout(new BorderLayout());
		p1.add(button1, BorderLayout.NORTH);
		p1.add(button2, BorderLayout.WEST);
		p1.add(button3, BorderLayout.CENTER);
		p1.add(button4, BorderLayout.EAST);
		p1.add(button5, BorderLayout.SOUTH);
	}
	// 이벤트 핸들러도 달아보자!
	public void cardLayout() 	{
		final CardLayout card = new CardLayout();
		setLayout(card);
		
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p2.add(button4);
		p3.add(button5);
		
		// JFrame에 add 시키기
		add("p1", p1);
		add("p2", p2);
		add("p3", p3);
		
		// 이벤트 핸들러 달기(이벤트종료, 핸들러다는 방법)
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(getContentPane());
			}
			
		});
		
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(getContentPane());
			}
			
		});
		
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(),"p1");
			}
			
		});
		
		// 익명클래스의 이벤트 헨들러 달아주는 방법
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();	//이벤트 소스
				Font font = new Font("맑은 고딕", Font.BOLD, 20);
				Label label = new Label("Action");
				label.setFont(font);
				label.setForeground(Color.red);
				
				if (btn.getText().equals("버튼1"))
					btn.setText("Action");
				else if (btn.getText().equals("Action"))
					btn.setText("버튼1");
			}
			
		});
		
		// 버튼2에 액션 ---> 내부클래스로 작성해서
		button2.addMouseListener(new MyMouseAdapter());
	}	

	public static void main(String[] args) {
		SwingLayout layout = new SwingLayout();

	}
	
	// 버튼2에 마루스를 누르면 좌표를 가져와서 버튼에 찍기
	// MyMouseAdapter 활용
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			int x = e.getX();
			int y = e.getY();
			if (btn.getText().equals("버튼2"))
				btn.setText("좌표 : " + x + "," + y);
			else
				btn.setText("버튼2");
			
		}
	}
	
//	// MyActionListener 클래스 구현
//	class MyActionListener implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton btn = (JButton)e.getSource();	//이벤트 소스
//			if (btn.getText().equals("버튼2"))
//				btn.setText("버튼이 눌러졌습니다..");
//			else if (btn.getText().equals("버튼이 눌러졌습니다.."))
//				btn.setText("버튼2");
//		}
//	}

}
