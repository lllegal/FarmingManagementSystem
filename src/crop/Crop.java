package crop;

import java.util.Scanner;

public class Crop {
	protected CropKind kind = CropKind.BareGround;
	protected String name;
	protected int nutrient;
	protected int level;
	protected int period;
	protected String seeding;
	
	public Crop() {
	}

	public Crop(String name, int level) {
		this.name = name;
		this.level = level;
	}

	public Crop(String name, int nutrient, int level, int period, String seeding) {
		this.name = name;
		this.nutrient = nutrient;
		this.level = level;
		this.period = period;
		this.seeding = seeding;
	}
	
	public CropKind getKind() {
		return kind;
	}

	public void setKind(CropKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNutrient() {
		return nutrient;
	}

	public void setNutrient(int nutrient) {
		this.nutrient = nutrient;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getSeeding() {
		return seeding;
	}

	public void setSeeding(String seeding) {
		this.seeding = seeding;
	}


	public void printInfo() {
		System.out.println("name:" + this.name + " nutrient:" + this.nutrient + " level:" + this.level + " period:" + this.period + " month: " + this.seeding);
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
}
