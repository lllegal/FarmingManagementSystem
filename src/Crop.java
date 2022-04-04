
public class Crop {
	String name;
	int nutrient;
	int level;
	int period;
	String seeding;

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

	public void printInfo() {
		System.out.println("name:" + this.name + " nutrient:" + this.nutrient + " level:" + this.level + " period:" + this.period + " month: " + this.seeding);
	}
}
