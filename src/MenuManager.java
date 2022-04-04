import java.util.Scanner;

public class MenuManager { //this is the class that manages the menu of Farming Management System.
	public static void main(String[] args) { //define the main method.
		Scanner input = new Scanner(System.in);
		FarmingManager farmingManager = new FarmingManager(input);

		int num = -1;
		while (num != 5) {
			System .out.println("*** Farming Management System Menu ***");
			System.out.println("1. Add Crops");
			System.out.println("2. Delete Crops");
			System.out.println("3. Edit Crops");
			System.out.println("4. View Crops");
			System.out.println("5. Exit"); //print the 6 menus with enter.
			System.out.print("Select one number between 1-6:"); 
			num = input.nextInt(); 
			if (num == 1) {
				farmingManager.addCrops();
			}
			if (num == 2) { 
				farmingManager.deleteCrops();
			}
			if (num == 3) { 
				farmingManager.editCrops();
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
