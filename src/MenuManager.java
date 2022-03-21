import java.util.Scanner;

public class MenuManager { //this is the class that manages the menu of Farming Management System.

	public static void main(String[] args) { //define the main method.
		int num = 0; 
		Scanner input = new Scanner(System.in);

		while (num != 6) {
			System.out.println("1. Add Crops");
			System.out.println("2. Delete Crops");
			System.out.println("3. Edit Crops");
			System.out.println("4. View Crops");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit"); //print the 6 menus with enter.
			System.out.print("Select one number between 1-6:"); 

			num = input.nextInt(); 
			if (num == 1) {
				System.out.print("Crop Name:");
				String cropName = input.nextLine();
				input.nextLine();
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
			if (num == 2) { 
				input.nextLine(); 
				System.out.print("Crop Name:");
				String cropName2 = input.nextLine();
			}
			if (num == 3) { 
				input.nextLine(); 
				System.out.print("Crop Name:");
				String cropName3 = input.nextLine();
			}
			if (num == 4) {
				input.nextLine(); 
				System.out.print("Crop Name:");
				String cropName4 = input.nextLine();
			}
			if (num == 5) { 
				//
			} 
			if (num == 6) { 
				//
			}
		}
	}
}
