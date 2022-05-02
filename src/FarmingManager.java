import java.util.ArrayList;
import java.util.Scanner;

import crop.Crop;
import crop.CropKind;
import crop.EcoFriendlyBareGroundCrop;
import crop.EcoFriendlyGlassHouseCrop;
import crop.GlassHouseCrop;

public class FarmingManager {
	ArrayList<Crop> crops = new ArrayList<Crop>(); //CropŸ���� ������ �����ϴ� ArrayList ����
	Scanner input;
	FarmingManager(Scanner input) {
		this.input = input;
	}

	public void addCrop() {
		int kind = 0;
		Crop crop;
		while(kind != 1 && kind != 2) {
			System.out.println("1. Bare Ground");
			System.out.println("2. Glass House");
			System.out.println("3. Eco-friendly Bare Ground");
			System.out.println("4. Eco-friendly Glass House");
			System.out.print("Select num for Groud Kind between 1 and 4:");
			kind = input.nextInt();
			if (kind == 1) {
				crop = new Crop(CropKind.BareGround);
				crop.getUserInput(input); //�۹��� ���� 5���� �Է¹ޱ�
				crops.add(crop);  //crops collection�� crop �߰�
				break;
			}
			else if(kind == 2) {
				crop = new GlassHouseCrop(CropKind.GlassHouse); 
				crop.getUserInput(input); //�۹��� ���� 5���� �Է¹ޱ�
				crops.add(crop);  //crops collection�� crop �߰�
				break;
			}
			else if(kind == 3) {
				crop = new EcoFriendlyBareGroundCrop(CropKind.EcoFriendlyBareGround); 
				crop.getUserInput(input); //�۹��� ���� 5���� �Է¹ޱ�
				crops.add(crop);  //crops collection�� crop �߰�
				break;
			}
			else if(kind == 4) {
				crop = new EcoFriendlyGlassHouseCrop(CropKind.EcoFriendlyGlassHouse); 
				crop.getUserInput(input); //�۹��� ���� 5���� �Է¹ޱ�
				crops.add(crop);  //crops collection�� crop �߰�
				break;
			}
			else {
				System.out.print("Select num for Groud Kind between 1 and 4:");
			}
		}
	}

	public void deleteCrop() {
		System.out.print("Crop Name:");
		String cropName = input.next(); //�����Ϸ��� �۹� �̸� �Է¹ޱ�
		int index = -1;
		for(int i=0; i<crops.size(); i++) {
			if(crops.get(i).getName().equals(cropName)) {
				index = i;
				break;
			} //crops collection�� �Է¹��� �۹��� �ִ°�?
		}

		if(index >= 0) { //��ġ�ϴ� �۹��� ã���� ���
			crops.remove(index); //����
			System.out.println("the crop " + cropName + " is deleted");
		}
		else { //�� ã���� ���
			System.out.println("the crop has not been registered.");
			return;
		}
	}

	public void editCrop() {
		System.out.print("Crop Name:");
		String cropName = input.next();
		for(int i=0; i<crops.size(); i++) {
			Crop crop = crops.get(i);
			if(crop.getName().equals(cropName)) {
				int num = -1;
				while(num != 6) {
					System.out.println("*** Crop Editing Menu ***");
					System.out.println("1. Crop Name");
					System.out.println("2. Consumable Nutrient");
					System.out.println("3. Crop Level");
					System.out.println("4. Cultivation Period(days)");
					System.out.println("5. The best month to plant");
					System.out.println("6. Exit"); //print the 6 edit menus with enter.
					System.out.print("Select one number between 1-6:"); 
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Crop Name:");
						String name = input.next();
						crop.setName(name);
					}
					else if (num == 2) { 
						System.out.print("Consumable Nutrient:");
						int nutrient = input.nextInt();
						crop.setNutrient(nutrient);
					}
					else if (num == 3) { 
						System.out.print("Crop Level:");
						int level = input.nextInt();
						crop.setLevel(level);
					}
					else if (num == 4) {
						System.out.print("Cultivation Period(days):");
						int period = input.nextInt();
						crop.setPeriod(period);
					}
					else if (num == 5) { 
						System.out.print("The best month to plant:");
						String seeding = input.next();
						crop.setSeeding(seeding);
					} 
					else {
						continue;
					} //if
				}//while
				break;
			}	//if
		} //for
	}

	public void viewCrops() {
		System.out.println("# of registered crops:" + crops.size());
		for(int i=0; i<crops.size(); i++) {
			crops.get(i).printInfo();
		}
	}
}
