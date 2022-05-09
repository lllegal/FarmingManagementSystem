package crop;

import java.util.Scanner;

public class EcoFriendlyBareGroundCrop extends Crop implements CropInput {
	
	public EcoFriendlyBareGroundCrop(CropKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Crop Name:");
		String name = input.next();
		this.setName(name);

		System.out.print("Consumable Nutrient:");
		int nutrient = input.nextInt();
		this.setNutrient(nutrient);

		System.out.print("Crop Level:");
		int level = input.nextInt();
		this.setLevel(level);

		System.out.print("Cultivation Period(days):");
		int period = input.nextInt();
		this.setPeriod(period);

		System.out.print("The best month to plant:");
		String seeding = input.next();
		this.setSeeding(seeding);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case BareGround:
			skind = "Bare Ground";
			break;
		case GlassHouse:
			skind = "Glass House";
			break;
		case EcoFriendlyBareGround:
			skind = "(E)Bare Ground";
			break;
		case EcoFriendlyGlassHouse:
			skind = "(E)Glass House";
			break;
		default:
		}
		System.out.println("kind:" + skind + " name:" + this.name + " nutrient:" + this.nutrient + " level:" + this.level + " period:" + this.period + " month: " + this.seeding);
	}

}
