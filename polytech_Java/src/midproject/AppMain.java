package midproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AppMain extends JFrame implements ActionListener /*implements ActionListener*/ {
	// 화면 구성을 위한 패널
	JPanel p1 = new JPanel();	//텍스트 라벨 패널
	JPanel p2 = new JPanel();	//입력 양식 패널
	JPanel p3 = new JPanel();	//데이터 출력 패널(button)
	
	// 텍스트 라벨부
	JLabel msg1 = new JLabel();		//Label은 여기에 붙습니다.
	
	// 입력 양식에 사용된 텍스트 필드
	JTextField t1 = new JTextField(20);	//상품명
	JTextField t2 = new JTextField(20);	//단가
	JTextField t3 = new JTextField(20);	//제조사
	
	// 관리 코드가 들어갈 콤보Box
	JComboBox cb;// = new JComboBox();
	
	// 데이터출력을 위한 텍스트 영역
	JTextArea area;// = new JTextArea(10, 40);
	
	// 등록, 조회, 삭제 메뉴 button
	JButton b1 = new JButton("등록");
	JButton b2 = new JButton("조회");
	JButton b3 = new JButton("삭제");
	
	// 입력 양식 옆에 라벨
	JLabel la1 = new JLabel("관리번호");
	JLabel la2 = new JLabel("상품명");
	JLabel la3 = new JLabel("단가");
	JLabel la4 = new JLabel("제조사");
	
	// editmode 설정 (flase : 등록/조회/삭제 안되게)
	boolean editmode;
	
	// productDAO 를 위한 객체 설정
	ProductDAO dao = new ProductDAO();
	ArrayList<Product> datas = new ArrayList<Product>();
	Product product;
	
	public AppMain() {
		setTitle("프로그램이 시작되었습니다.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		msg1.setText("프로그램이 시작되었습니다.");	// 라벨 초기화
		
		// 레이아웃 배치
		p1.setLayout(new GridLayout(4, 1, 20, 2));
		p2.setLayout(new GridLayout(4, 1, 20, 2));
		
		// 스크롤 기능이 들어가도록 area를 조정
		cb = new JComboBox();
		area = new JTextArea(10, 40);
		JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		// refreshData 메소드 호출
		refreshData();
		
		// 각각의 등록(b1), 조회(b2), 삭제(b3) 버튼에 이벤트 리스터 추가
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		p1.add(la1);
		p1.add(la2);
		p1.add(la3);
		p1.add(la4);
		
		p2.add(cb);
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		
		add(msg1, BorderLayout.PAGE_START);
		add(p1, BorderLayout.LINE_START);
		add(p2, BorderLayout.CENTER);
		add(scroll, BorderLayout.LINE_END);
		add(p3, BorderLayout.PAGE_END);
		
		setSize(1000,500);
		setVisible(true);
	}
	
	// refresh : 초기화면을 제공		// 전체 데이터 목록 출력
	public void refreshData() {
		// 기존의 내용을 모두 지우고 초기화
		// textarea 초기화
		area.setText(" ");
		t1.setText(" ");
		t2.setText(" ");
		t3.setText(" ");
		
		// edimode : true - 정수수정, 삭제, 전체목록 조회가 가능한 상태
		// edimode : false - 정보수정, 삭제, 전체목록 조회가 안되는 상태
		editmode = false;
		
		// 콤보박스에 items을 넣어주는 것
		//cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(dao.getItems()));
		
		// textfield 에 내용을 찍는 기능 구현
		datas = dao.getAll();
		area.append("관리번호 \t 상품명 \t 단가 \t 제조사 \n");
		if(datas!=null) {
			for(Product p : datas) {
				StringBuffer sb = new StringBuffer();
				sb.append(p.getPrcode() + " \t ");
				sb.append(p.getPrname() + " \t ");
				sb.append(p.getPrice() + " \t ");
				sb.append(p.getManufacture() + " \t \n");
				area.append(sb.toString());	// 투스트링을 통해서 안에 내용을 가지고 온다
			}
		}
		else {
			area.append("등록된 상품이 없습니다! 상품을 먼저 등록해주세요.");
		}
		
	}
	
	// actionPerformed 오버라이딩
	// 이벤트 발생 처리 메서드
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();	//오브젝트
		//등록기능
		if(obj==b1) {
			product = new Product();
			product.setPrname(t1.getText());					//상품명
			product.setPrice(Integer.parseInt(t2.getText()));	//단가
			product.setManufacture(t3.getText());				//제조사
			
			//등록인 경우
			if(editmode == false) {
				if(dao.newProduct(product)) {
					msg1.setText("상품이 등록되었습니다.");
				}
				else {
					msg1.setText("상품등록을 실패했습니다.");
				}
			}
			
			//수정인 경우 (editmode)
			else if(editmode == true) {
				product.setPrcode(Integer.parseInt((String)cb.getSelectedItem())); //다운캐스팅
				if(dao.updateProduct(product)) {
					msg1.setText("상품이 수정되었습니다.");
					t1.setText(" ");
					t2.setText(" ");
					t3.setText(" ");
					editmode = false;	//수정 불가 모드로 변경
				}
				else {
					msg1.setText("상품수정을 실패하였습니다.");
				}
			}
		}
		//조회기능
		if(obj==b2) {
			String item = (String)cb.getSelectedItem();
			if(item.equals("전체")) {
				refreshData();
			}
			else {
				product = dao.getProduct(Integer.parseInt(item));
				if(product != null) {
					t1.setText(product.getPrname());
					t2.setText(String.valueOf(product.getPrice()));
					t3.setText(product.getManufacture());
					editmode = true;	//수정가능 모드로 변경
				}
				else {
					msg1.setText("조회가 되지 않습니다.");
				}
			}
		}
		//삭제기능
		if(obj==b3) {
			String item = (String)cb.getSelectedItem();
			if(item.equals("전체")) {
				msg1.setText("전체 삭제는 되지 않습니다.");
			}
			else {
				if(dao.delProduct(Integer.parseInt(item))) {
					msg1.setText("삭제가 되었습니다.");
				}
				else {
					msg1.setText("삭제가 되지 않았습니다.");
				}
			}
			refreshData();	//화면 갱신
		}
	}

	public static void main(String[] args) {
		AppMain app = new AppMain();
	}

}



