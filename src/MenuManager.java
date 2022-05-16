import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager { //this is the class that manages the menu of Farming Management System.
	public static void main(String[] args) { //define the main method.
		Scanner input = new Scanner(System.in);
		FarmingManager farmingManager = new FarmingManager(input);
		selectMenu(input, farmingManager);

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
					break;
				case 2:
					farmingManager.deleteCrop();
					break;
				case 3:
					farmingManager.editCrop();
					break;
				case 4:
					farmingManager.viewCrops();
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
}
