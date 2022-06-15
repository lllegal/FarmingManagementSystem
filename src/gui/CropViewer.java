package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import crop.CropInput;
import manager.FarmingManager;

public class CropViewer extends JPanel {
	WindowFrame frame;
	FarmingManager farmingManager;
	
	public FarmingManager getFarmingManager() {
		return farmingManager;
	}

	public void setFarmingManager(FarmingManager farmingManager) {
		this.farmingManager = farmingManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Lev");
		model.addColumn("Nut");
		model.addColumn("Per");
		model.addColumn("Seed");
		
		for(int i=0; i < farmingManager.size(); i++) {
			Vector row = new Vector();
			CropInput ci = farmingManager.get(i);
			row.add(ci.getName());
			row.add(ci.getLevel());
			row.add(ci.getNutrient());
			row.add(ci.getPeriod());
			row.add(ci.getSeeding());
			model.addRow(row);
		}
				
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public CropViewer(WindowFrame frame, FarmingManager farmingManager) {
		this.frame = frame;
		this.farmingManager = farmingManager;

		System.out.println("**" + farmingManager.size() + "**");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Lev");
		model.addColumn("Nut");
		model.addColumn("Per");
		model.addColumn("Seed");
		
		for(int i=0; i < farmingManager.size(); i++) {
			Vector row = new Vector();
			CropInput ci = farmingManager.get(i);
			row.add(ci.getName());
			row.add(ci.getLevel());
			row.add(ci.getNutrient());
			row.add(ci.getPeriod());
			row.add(ci.getSeeding());
			model.addRow(row);
		}
				
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
