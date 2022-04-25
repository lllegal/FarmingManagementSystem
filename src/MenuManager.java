import java.util.Scanner;

public class MenuManager { //this is the class that manages the menu of Farming Management System.
	public static void main(String[] args) { //define the main method.
		Scanner input = new Scanner(System.in);
		FarmingManager farmingManager = new FarmingManager(input);

		int num = -1;
		while (num != 5) {
			System .out.println("*** Farming Management System Menu ***");
			System.out.println("1. Add Crop");
			System.out.println("2. Delete Crop");
			System.out.println("3. Edit Crop");
			System.out.println("4. View Crops");
			System.out.println("5. Exit"); //print the 5 menus with enter.
			System.out.print("Select one number between 1-5:"); 
			num = input.nextInt(); 
			if (num == 1) {
				farmingManager.addCrop();
			}
			if (num == 2) { 
				farmingManager.deleteCrop();
			}
			if (num == 3) { 
				farmingManager.editCrop();
			}
			if (num == 4) {
				farmingManager.viewCrops();
			}
			else { 
				continue;
			} 
		}
	}
}
