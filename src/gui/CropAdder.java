package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CropAdder extends JFrame {
	public CropAdder() {
		JPanel panel = new JPanel(); //�г� ����
		panel.setLayout(new SpringLayout()); //���̾ƿ� ����

		JLabel labelName = new JLabel("Name:", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		//���̺�� �ؽ�Ʈ�ʵ� ����, ���̺��� �ؽ�Ʈ�ʵ忡 ÷��, �гο� �߰�

		JLabel labelLev = new JLabel("Lev:", JLabel.TRAILING);
		JTextField fieldLev = new JTextField(10);
		labelName.setLabelFor(fieldLev);
		panel.add(labelLev);
		panel.add(fieldLev);

		JLabel labelNut = new JLabel("Nut:", JLabel.TRAILING);
		JTextField fieldNut = new JTextField(10);
		labelName.setLabelFor(fieldNut);
		panel.add(labelNut);
		panel.add(fieldNut);

		JLabel labelPer = new JLabel("Per:", JLabel.TRAILING);
		JTextField fieldPer = new JTextField(10);
		labelName.setLabelFor(fieldPer);
		panel.add(labelPer);
		panel.add(fieldPer);

		JLabel labelSeed = new JLabel("Seed:", JLabel.TRAILING);
		JTextField fieldSeed = new JTextField(10);
		labelName.setLabelFor(fieldSeed);
		panel.add(labelSeed); 
		panel.add(fieldSeed);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		//�гο� �߰�

		SpringUtilities.makeCompactGrid(panel, 6, 2, 2, 6, 6, 6);

		this.setSize(300, 300); //������ ũ�� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�� ������ ���α׷��� ����ǵ��� ��
		this.setContentPane(panel); //�����ӿ� �г� �߰�
		this.setVisible(true); //ȭ�鿡 ǥ��
	}

}
