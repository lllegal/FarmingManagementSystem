package crop;

import java.util.Scanner;

import exception.LevelFormatException;

public interface CropInput {
	public String getName();
	public void setName(String name);
	public int getNutrient();
	public void setNutrient(int nutrient);
	public void setLevel(int level) throws LevelFormatException;
	public int getLevel();
	public int getPeriod();
	public void setPeriod(int period);
	public String getSeeding();
	public void setSeeding(String seeding);
	public void getUserInput(Scanner input);
	public void printInfo();
}
