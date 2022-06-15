package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAdderListener;
import listeners.ButtonViewListener;

//import listeners.ButtonViewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		//�гΰ� ���̺� ����
		
		JButton bt1 = new JButton("Add Crop");
		JButton bt2 = new JButton("Delete Crop");
		JButton bt3 = new JButton("Edit Crop");
		JButton bt4 = new JButton("View Crop");
		JButton bt5 = new JButton("Exit Program");
		//��ư ����
		
		bt1.addActionListener(new ButtonAdderListener(frame));
		bt4.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(bt1);
		panel2.add(bt2);
		panel2.add(bt3);
		panel2.add(bt4);
		panel2.add(bt5);
		//�гο� ��ư ���̺�� ��ư �߰�
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		//�����ӿ� �г� �߰�
	}
}
