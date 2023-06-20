package midproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AppMain extends JFrame implements ActionListener /*implements ActionListener*/ {
	// ȭ�� ������ ���� �г�
	JPanel p1 = new JPanel();	//�ؽ�Ʈ �� �г�
	JPanel p2 = new JPanel();	//�Է� ��� �г�
	JPanel p3 = new JPanel();	//������ ��� �г�(button)
	
	// �ؽ�Ʈ �󺧺�
	JLabel msg1 = new JLabel();		//Label�� ���⿡ �ٽ��ϴ�.
	
	// �Է� ��Ŀ� ���� �ؽ�Ʈ �ʵ�
	JTextField t1 = new JTextField(20);	//��ǰ��
	JTextField t2 = new JTextField(20);	//�ܰ�
	JTextField t3 = new JTextField(20);	//������
	
	// ���� �ڵ尡 �� �޺�Box
	JComboBox cb;// = new JComboBox();
	
	// ����������� ���� �ؽ�Ʈ ����
	JTextArea area;// = new JTextArea(10, 40);
	
	// ���, ��ȸ, ���� �޴� button
	JButton b1 = new JButton("���");
	JButton b2 = new JButton("��ȸ");
	JButton b3 = new JButton("����");
	
	// �Է� ��� ���� ��
	JLabel la1 = new JLabel("������ȣ");
	JLabel la2 = new JLabel("��ǰ��");
	JLabel la3 = new JLabel("�ܰ�");
	JLabel la4 = new JLabel("������");
	
	// editmode ���� (flase : ���/��ȸ/���� �ȵǰ�)
	boolean editmode;
	
	// productDAO �� ���� ��ü ����
	ProductDAO dao = new ProductDAO();
	ArrayList<Product> datas = new ArrayList<Product>();
	Product product;
	
	public AppMain() {
		setTitle("���α׷��� ���۵Ǿ����ϴ�.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		msg1.setText("���α׷��� ���۵Ǿ����ϴ�.");	// �� �ʱ�ȭ
		
		// ���̾ƿ� ��ġ
		p1.setLayout(new GridLayout(4, 1, 20, 2));
		p2.setLayout(new GridLayout(4, 1, 20, 2));
		
		// ��ũ�� ����� ������ area�� ����
		cb = new JComboBox();
		area = new JTextArea(10, 40);
		JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		// refreshData �޼ҵ� ȣ��
		refreshData();
		
		// ������ ���(b1), ��ȸ(b2), ����(b3) ��ư�� �̺�Ʈ ������ �߰�
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
	
	// refresh : �ʱ�ȭ���� ����		// ��ü ������ ��� ���
	public void refreshData() {
		// ������ ������ ��� ����� �ʱ�ȭ
		// textarea �ʱ�ȭ
		area.setText(" ");
		t1.setText(" ");
		t2.setText(" ");
		t3.setText(" ");
		
		// edimode : true - ��������, ����, ��ü��� ��ȸ�� ������ ����
		// edimode : false - ��������, ����, ��ü��� ��ȸ�� �ȵǴ� ����
		editmode = false;
		
		// �޺��ڽ��� items�� �־��ִ� ��
		//cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(dao.getItems()));
		
		// textfield �� ������ ��� ��� ����
		datas = dao.getAll();
		area.append("������ȣ \t ��ǰ�� \t �ܰ� \t ������ \n");
		if(datas!=null) {
			for(Product p : datas) {
				StringBuffer sb = new StringBuffer();
				sb.append(p.getPrcode() + " \t ");
				sb.append(p.getPrname() + " \t ");
				sb.append(p.getPrice() + " \t ");
				sb.append(p.getManufacture() + " \t \n");
				area.append(sb.toString());	// ����Ʈ���� ���ؼ� �ȿ� ������ ������ �´�
			}
		}
		else {
			area.append("��ϵ� ��ǰ�� �����ϴ�! ��ǰ�� ���� ������ּ���.");
		}
		
	}
	
	// actionPerformed �������̵�
	// �̺�Ʈ �߻� ó�� �޼���
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();	//������Ʈ
		//��ϱ��
		if(obj==b1) {
			product = new Product();
			product.setPrname(t1.getText());					//��ǰ��
			product.setPrice(Integer.parseInt(t2.getText()));	//�ܰ�
			product.setManufacture(t3.getText());				//������
			
			//����� ���
			if(editmode == false) {
				if(dao.newProduct(product)) {
					msg1.setText("��ǰ�� ��ϵǾ����ϴ�.");
				}
				else {
					msg1.setText("��ǰ����� �����߽��ϴ�.");
				}
			}
			
			//������ ��� (editmode)
			else if(editmode == true) {
				product.setPrcode(Integer.parseInt((String)cb.getSelectedItem())); //�ٿ�ĳ����
				if(dao.updateProduct(product)) {
					msg1.setText("��ǰ�� �����Ǿ����ϴ�.");
					t1.setText(" ");
					t2.setText(" ");
					t3.setText(" ");
					editmode = false;	//���� �Ұ� ���� ����
				}
				else {
					msg1.setText("��ǰ������ �����Ͽ����ϴ�.");
				}
			}
		}
		//��ȸ���
		if(obj==b2) {
			String item = (String)cb.getSelectedItem();
			if(item.equals("��ü")) {
				refreshData();
			}
			else {
				product = dao.getProduct(Integer.parseInt(item));
				if(product != null) {
					t1.setText(product.getPrname());
					t2.setText(String.valueOf(product.getPrice()));
					t3.setText(product.getManufacture());
					editmode = true;	//�������� ���� ����
				}
				else {
					msg1.setText("��ȸ�� ���� �ʽ��ϴ�.");
				}
			}
		}
		//�������
		if(obj==b3) {
			String item = (String)cb.getSelectedItem();
			if(item.equals("��ü")) {
				msg1.setText("��ü ������ ���� �ʽ��ϴ�.");
			}
			else {
				if(dao.delProduct(Integer.parseInt(item))) {
					msg1.setText("������ �Ǿ����ϴ�.");
				}
				else {
					msg1.setText("������ ���� �ʾҽ��ϴ�.");
				}
			}
			refreshData();	//ȭ�� ����
		}
	}

	public static void main(String[] args) {
		AppMain app = new AppMain();
	}

}



