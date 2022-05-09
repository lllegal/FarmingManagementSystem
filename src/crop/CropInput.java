package crop;

import java.util.Scanner;

public interface CropInput {
	public String getName();
	public void setName(String name);
	public void setNutrient(int nutrient);
	public void setLevel(int level);
	public void setPeriod(int period);
	public void setSeeding(String seeding);
	public void getUserInput(Scanner input);
	public void printInfo();
}
