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
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new CropAdderListener(fieldName, fieldLev, fieldNut, fieldPer, fieldSeed, farmingManager));

		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new CropAdderCancelListener(frame));
		
		panel.add(labelSeed); 
		panel.add(fieldSeed);

		panel.add(saveButton);
		panel.add(cancelButton);
		//�гο� �߰�

		SpringUtilities.makeCompactGrid(panel, 6, 2, 2, 6, 6, 6);


		this.add(panel); //�����ӿ� �г� �߰�
		this.setVisible(true); //ȭ�鿡 ǥ��
	}

}
