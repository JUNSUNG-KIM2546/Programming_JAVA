package chap10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;	// swing 모든것 임포트
//import java.awt.*;		// awt 모든것 임포트


public class MyFrame extends JFrame {
	
	public MyFrame() {
		setTitle("300X300 스윙 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//화면에서 안보이고 종료되도록 기능 추가
		
		// 컨텐트 팬의 정보를 갖고 와서 변경
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.yellow);
		
		// 버튼 추가(등록, 조회, 삭제 버튼 추가)
		JButton button1 = new JButton("등록");
		JButton button2 = new JButton("조회");
		JButton button3 = new JButton("삭제");
		
		contentPane.setLayout(new FlowLayout());	//정렬? 자리가 없으면 다음 줄로 가세요
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
			
		setSize(500,500);	// 사이즈 
		setVisible(true);	// 화면에 띄워준다 트루!
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();

	}

}
