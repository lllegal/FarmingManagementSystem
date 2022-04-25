package crop;

import java.util.Scanner;

public class GlassHouseCrop extends Crop {
	
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
		
//		System.out.print("The best month to plant:");
//		String seeding = input.next();
//		this.setSeeding(seeding);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' ) {
			System.out.print("Can you plant it any day? (Y/N):");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				this.setSeeding("");
				break;
			}
			else if(answer == 'n' || answer =='N') {
				System.out.print("The best month to plant:");
				String seeding = input.next();
				this.setSeeding(seeding);
				break;
			}
			else {
			}
		}
	}
}
