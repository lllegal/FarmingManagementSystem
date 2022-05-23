import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager { //this is the class that manages the menu of Farming Management System.
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) { //define the main method.
		
		Scanner input = new Scanner(System.in);
		FarmingManager farmingManager = getObject("framingmanager.ser");
		if(farmingManager == null) {
			farmingManager = new FarmingManager(input);
		}
		
		selectMenu(input, farmingManager);
		putObject(farmingManager, "farmingmanager.ser");
	}

	public static void selectMenu(Scanner input, FarmingManager farmingManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt(); 
				switch(num) {
				case 1:
					farmingManager.addCrop();
					logger.log("add a crop");
					break;
				case 2:
					farmingManager.deleteCrop();
					logger.log("delete a crop");
					break;
				case 3:
					farmingManager.editCrop();
					logger.log("edit a crop");
					break;
				case 4:
					farmingManager.viewCrops();
					logger.log("view a list of crops");
					break;
				default:
					continue;
				}
			} catch(InputMismatchException e) {
				System.out.println("Plz put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System .out.println("*** Farming Management System Menu ***");
		System.out.println("1. Add Crop");
		System.out.println("2. Delete Crop");
		System.out.println("3. Edit Crop");
		System.out.println("4. View Crops");
		System.out.println("5. Exit"); //print the 5 menus with enter.
		System.out.print("Select one number between 1-5:"); 
	}
	
	public static FarmingManager getObject(String filename) {
		FarmingManager farmingManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			farmingManager = (FarmingManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return farmingManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return farmingManager;
	}
	
	public static void putObject(FarmingManager farmingManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(farmingManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
