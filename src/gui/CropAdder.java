package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.CropAdderCancelListener;
import listeners.CropAdderListener;
import manager.FarmingManager;

public class CropAdder extends JPanel {
	
	WindowFrame frame;
	FarmingManager farmingManager;
	 
	public CropAdder(WindowFrame frame, FarmingManager farmingmanager) {
		this.frame = frame;
		this.farmingManager = farmingManager; 
		
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
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new CropAdderListener(fieldName, fieldLev, fieldNut, fieldPer, fieldSeed, farmingManager));

		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new CropAdderCancelListener(frame));
		
		panel.add(labelSeed); 
		panel.add(fieldSeed);

		panel.add(saveButton);
		panel.add(cancelButton);
		//패널에 추가

		SpringUtilities.makeCompactGrid(panel, 6, 2, 2, 6, 6, 6);


		this.add(panel); //프레임에 패널 추가
		this.setVisible(true); //화면에 표시
	}

}
