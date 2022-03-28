import java.util.Scanner;

public class MenuManager { //this is the class that manages the menu of Farming Management System.
	public static void main(String[] args) { //define the main method.
		int num = 5;
		Scanner input = new Scanner(System.in);

		while (num != 6) {
			System .out.println("*** Farming Management System Menu ***");
			System.out.println("1. Add Crops");
			System.out.println("2. Delete Crops");
			System.out.println("3. Edit Crops");
			System.out.println("4. View Crops");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit"); //print the 6 menus with enter.
			System.out.print("Select one number between 1-6:"); 
			num = input.nextInt(); 
			if (num == 1) {
				addCrops();
			}
			if (num == 2) { 
				deleteCrops();
			}
			if (num == 3) { 
				editCrops();
			}
			if (num == 4) {
				viewCrops();
			}
			else { 
				continue;
			} 
		}
	}

	public static void addCrops() {
		Scanner input = new Scanner(System.in);
		System.out.print("Crop Name:");
		String cropName = input.next();
		System.out.print("Consumable Nutrient:");
		int cropNutrient = input.nextInt();
		System.out.print("Crop Level:");
		int cropLevel = input.nextInt();
		System.out.print("Cultivation Period(days):");
		int cropPeriod = input.nextInt();
		input.nextLine();
		System.out.print("The best month to plant:");
		String cropSeeding = input.nextLine();
	}

	public static void deleteCrops() {
		Scanner input = new Scanner(System.in);
		System.out.print("Crop Name:");
		String cropName = input.next();
	}

	public static void editCrops() {
		Scanner input = new Scanner(System.in);
		System.out.print("Crop Name:");
		String cropName = input.next();
	}

	public static void viewCrops() {
		Scanner input = new Scanner(System.in);
		System.out.print("Crop Name:");
		String cropName = input.next();
	}
}
