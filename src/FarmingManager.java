import java.util.Scanner;

public class FarmingManager {
	Crop crop;
	Scanner input;
	FarmingManager(Scanner input) {
		this.input = input;
	}

	public void addCrops() {
		crop = new Crop();
		System.out.print("Crop Name:");
		crop.name = input.next();
		System.out.print("Consumable Nutrient:");
		crop.nutrient = input.nextInt();
		System.out.print("Crop Level:");
		crop.level = input.nextInt();
		System.out.print("Cultivation Period(days):");
		crop.period = input.nextInt();
		System.out.print("The best month to plant:");
		crop.seeding = input.next();
	}

	public void deleteCrops() {
		System.out.print("Crop Name:");
		String cropName = input.next();
		if (crop == null) {
			System.out.println("the crop has not been registered.");
			return;
		}
		if(crop.name.equals(cropName)) {
			crop = null;
			System.out.println("the crop is deleted");
		}
	}

	public void editCrops() {
		System.out.print("Crop Name:");
		String cropName = input.next();
		if(crop.name.equals(cropName)) {
			System.out.println("the crop to be edited is " + cropName);
		}
	}

	public void viewCrops() {
		System.out.print("Crop Name:");
		String cropName = input.next();
		if(crop.name.equals(cropName)) {
			crop.printInfo();
		}
	}

}
