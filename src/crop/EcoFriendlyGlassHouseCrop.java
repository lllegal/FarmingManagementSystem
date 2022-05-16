package crop;

import java.util.Scanner;

import exception.LevelFormatException;

public class EcoFriendlyGlassHouseCrop extends Crop implements CropInput {
	
	protected boolean boiler;
	
	public EcoFriendlyGlassHouseCrop(CropKind kind) {
		super(kind);
	}
	
	public boolean getBoiler() {
		return boiler;
	}

	public void setBoiler(boolean boiler) {
		this.boiler = boiler;
	}
	
	public void getUserInput(Scanner input) {
		setCropName(input);
		setCropNut(input);
		setCropLevel(input);
		setCropPeriod(input);
		setCropSeeding(input);
		
		System.out.print("Boiler in GlassHouse(Y/N):");
		String answer = input.next();
		boolean boiler = false;
		if(answer.equals("y") || answer.equals("Y")) {
			boiler = true;
		}
		this.setBoiler(boiler);
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
		System.out.println("kind:" + skind + " name:" + this.name + " nutrient:" + this.nutrient + " level:" + this.level 
				+ " period:" + this.period + " month:" + this.seeding + " boiler:" + this.boiler);
	}
}
