package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CropViewer extends JFrame {

	public CropViewer() {
		//String column[] = {"NAME", "LEV", "NUT", "PER", "SEED"};
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Lev");
		model.addColumn("Nut");
		model.addColumn("Per");
		model.addColumn("Seed");
				
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);
	}

}
