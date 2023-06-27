package chap13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 라벨
class FlickeringLaberl extends JLabel implements Runnable {
	private long delay;	//배경색이 바뀌는 지연 시간, 밀리초단위
	
	//생성자
	public FlickeringLaberl(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		int n = 0; //상태초기값
		
		while(true) {	//무한루프
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
// GUI 프레임
public class FlickeringLaberlEx extends JFrame {
	public FlickeringLaberlEx() {
		setTitle("깜박거리는 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//label - 3가지 구성
		FlickeringLaberl label1 = new FlickeringLaberl(" 0.5초 깜빡 ", 500);
		label1.setFont(new Font("굴림", Font.ITALIC, 30));
		
		JLabel label2 = new JLabel(" 안깜빡 ");
		label2.setFont(new Font("고딕", Font.BOLD, 50));
		
		FlickeringLaberl label3 = new FlickeringLaberl(" 0.3초 깜빡 ", 300);
		label3.setFont(new Font("굴림", Font.ITALIC, 30));
		
		//label을 컨테이너에 부착
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
