package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CropAdder extends JFrame {
	public CropAdder() {
		JPanel panel = new JPanel(); //패널 생성
		panel.setLayout(new SpringLayout()); //레이아웃 설정

		JLabel labelName = new JLabel("Name:", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		//레이블과 텍스트필드 생성, 레이블을 텍스트필드에 첨부, 패널에 추가

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
		//패널에 추가

		SpringUtilities.makeCompactGrid(panel, 6, 2, 2, 6, 6, 6);

		this.setSize(300, 300); //프레임 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫으면 프로그램이 종료되도록 함
		this.setContentPane(panel); //프레임에 패널 추가
		this.setVisible(true); //화면에 표시
	}

}
