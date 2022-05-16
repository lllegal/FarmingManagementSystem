package crop;

import java.util.Scanner;

import exception.LevelFormatException;

public abstract class Crop {
	protected CropKind kind = CropKind.BareGround;
	protected String name;
	protected int nutrient;
	protected int level;
	protected int period;
	protected String seeding;

	public Crop() {
	}

	public Crop(CropKind kind) {
		this.kind = kind;
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

	public Crop(CropKind kind, String name, int nutrient, int level, int period, String seeding) {
		this.kind = kind;
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

	public void setLevel(int level) throws LevelFormatException {
		if(level <= 0 || level >= 100) { 
			throw new LevelFormatException();
		}
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

	public abstract void printInfo();

	public void setCropName(Scanner input) {
		System.out.print("Crop Name:");
		String name = input.next();
		this.setName(name);
	}
	public void setCropNut(Scanner input) {
		System.out.print("Consumable Nutrient:");
		int nutrient = input.nextInt();
		this.setNutrient(nutrient);
	}
	public void setCropLevel (Scanner input) {
		int level = 0;
		while (level <= 0 || level >= 100) {
			System.out.print("Crop Level:");
			level = input.nextInt();
			try {
				this.setLevel(level);
			} catch (LevelFormatException e) {
				System.out.println("Incorrect Level. Put crop's level between 1-99");
			}
		}
	}
	public void setCropPeriod (Scanner input) {
		System.out.print("Cultivation Period(days):");
		int period = input.nextInt();
		this.setPeriod(period);
	}
	public void setCropSeeding (Scanner input) {
		System.out.print("The best month to plant:");
		String seeding = input.next();
		this.setSeeding(seeding);
	}
}
