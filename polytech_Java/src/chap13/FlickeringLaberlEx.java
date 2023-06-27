package chap13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

// ��
class FlickeringLaberl extends JLabel implements Runnable {
	private long delay;	//������ �ٲ�� ���� �ð�, �и��ʴ���
	
	//������
	public FlickeringLaberl(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		int n = 0; //�����ʱⰪ
		
		while(true) {	//���ѷ���
			if(n==0)		setBackground(Color.CYAN);
			else if(n==1)	setBackground(Color.pink);
			if(n==0)		n = 1;
			else if(n==1)	n = 0;
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
// GUI ������
public class FlickeringLaberlEx extends JFrame {
	public FlickeringLaberlEx() {
		setTitle("���ڰŸ��� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//label - 3���� ����
		FlickeringLaberl label1 = new FlickeringLaberl(" 0.5�� ���� ", 500);
		label1.setFont(new Font("����", Font.ITALIC, 30));
		
		JLabel label2 = new JLabel(" �ȱ��� ");
		label2.setFont(new Font("���", Font.BOLD, 50));
		
		FlickeringLaberl label3 = new FlickeringLaberl(" 0.3�� ���� ", 300);
		label3.setFont(new Font("����", Font.ITALIC, 30));
		
		//label�� �����̳ʿ� ����
		c.add(label1);
		c.add(label2);
		c.add(label3);
		
		setSize(600,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		FlickeringLaberlEx ex = new FlickeringLaberlEx();
	}

}
