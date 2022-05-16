package crop;

import java.util.Scanner;

public class EcoFriendlyBareGroundCrop extends Crop implements CropInput {
	
	public EcoFriendlyBareGroundCrop(CropKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setCropName(input);
		setCropNut(input);
		setCropLevel(input);
		setCropPeriod(input);
		setCropSeeding(input);
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
