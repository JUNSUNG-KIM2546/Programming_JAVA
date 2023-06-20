package chap10;


import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class SwingLayout extends JFrame {
	
	JButton button1 = new JButton("��ư1");
	JButton button2 = new JButton("��ư2");
	JButton button3 = new JButton("��ư3");
	JButton button4 = new JButton("��ư4");
	JButton button5 = new JButton("��ư5");
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	public SwingLayout() {
		setTitle("���� ���̾ƿ� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Container container = getContentPane();
		//container.setBackground(Color.CYAN);
		
		// container�� panel ���� ������Ű��!
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
	
	// FlowLayout �����ϱ�
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
	// �̺�Ʈ �ڵ鷯�� �޾ƺ���!
	public void cardLayout() 	{
		final CardLayout card = new CardLayout();
		setLayout(card);
		
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p2.add(button4);
		p3.add(button5);
		
		// JFrame�� add ��Ű��
		add("p1", p1);
		add("p2", p2);
		add("p3", p3);
		
		// �̺�Ʈ �ڵ鷯 �ޱ�(�̺�Ʈ����, �ڵ鷯�ٴ� ���)
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
		
		// �͸�Ŭ������ �̺�Ʈ ��鷯 �޾��ִ� ���
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();	//�̺�Ʈ �ҽ�
				Font font = new Font("���� ���", Font.BOLD, 20);
				Label label = new Label("Action");
				label.setFont(font);
				label.setForeground(Color.red);
				
				if (btn.getText().equals("��ư1"))
					btn.setText("Action");
				else if (btn.getText().equals("Action"))
					btn.setText("��ư1");
			}
			
		});
		
		// ��ư2�� �׼� ---> ����Ŭ������ �ۼ��ؼ�
		button2.addMouseListener(new MyMouseAdapter());
	}	

	public static void main(String[] args) {
		SwingLayout layout = new SwingLayout();

	}
	
	// ��ư2�� ���罺�� ������ ��ǥ�� �����ͼ� ��ư�� ���
	// MyMouseAdapter Ȱ��
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			int x = e.getX();
			int y = e.getY();
			if (btn.getText().equals("��ư2"))
				btn.setText("��ǥ : " + x + "," + y);
			else
				btn.setText("��ư2");
			
		}
	}
	
//	// MyActionListener Ŭ���� ����
//	class MyActionListener implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton btn = (JButton)e.getSource();	//�̺�Ʈ �ҽ�
//			if (btn.getText().equals("��ư2"))
//				btn.setText("��ư�� ���������ϴ�..");
//			else if (btn.getText().equals("��ư�� ���������ϴ�.."))
//				btn.setText("��ư2");
//		}
//	}

}
