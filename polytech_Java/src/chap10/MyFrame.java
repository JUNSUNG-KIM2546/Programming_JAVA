package chap10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;	// swing ���� ����Ʈ
//import java.awt.*;		// awt ���� ����Ʈ


public class MyFrame extends JFrame {
	
	public MyFrame() {
		setTitle("300X300 ���� ������ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//ȭ�鿡�� �Ⱥ��̰� ����ǵ��� ��� �߰�
		
		// ����Ʈ ���� ������ ���� �ͼ� ����
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.yellow);
		
		// ��ư �߰�(���, ��ȸ, ���� ��ư �߰�)
		JButton button1 = new JButton("���");
		JButton button2 = new JButton("��ȸ");
		JButton button3 = new JButton("����");
		
		contentPane.setLayout(new FlowLayout());	//����? �ڸ��� ������ ���� �ٷ� ������
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
			
		setSize(500,500);	// ������ 
		setVisible(true);	// ȭ�鿡 ����ش� Ʈ��!
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();

	}

}
