import java.util.ArrayList;
import java.util.Scanner;

import crop.Crop;
import crop.CropInput;
import crop.CropKind;
import crop.EcoFriendlyBareGroundCrop;
import crop.EcoFriendlyGlassHouseCrop;
import crop.GlassHouseCrop;

public class FarmingManager {
	ArrayList<CropInput> crops = new ArrayList<CropInput>(); //Crop타입의 변수를 저장하는 ArrayList 생성
	Scanner input;
	FarmingManager(Scanner input) {
		this.input = input;
	}

	public void addCrop() {
		int kind = 0;
		CropInput cropInput;
		while(kind != 1 && kind != 2) {
			//System.out.println("1. Bare Ground");
			System.out.println("1. Glass House");
			System.out.println("2. Eco-friendly Bare Ground");
			System.out.println("3. Eco-friendly Glass House");
			System.out.print("Select num for Groud Kind between 1 and 3:");
			kind = input.nextInt();
			if(kind == 1) {
				cropInput = new GlassHouseCrop(CropKind.GlassHouse); 
				cropInput.getUserInput(input); //작물의 정보 5가지 입력받기
				crops.add(cropInput);  //crops collection에 cropInput 추가
				break;
			}
			else if(kind == 2) {
				cropInput = new EcoFriendlyBareGroundCrop(CropKind.EcoFriendlyBareGround); 
				cropInput.getUserInput(input); //작물의 정보 5가지 입력받기
				crops.add(cropInput);  //crops collection에 cropInput 추가
				break;
			}
			else if(kind == 3) {
				cropInput = new EcoFriendlyGlassHouseCrop(CropKind.EcoFriendlyGlassHouse); 
				cropInput.getUserInput(input); //작물의 정보 5가지 입력받기
				crops.add(cropInput);  //crops collection에 cropInput 추가
				break;
			}
			else {
				System.out.print("Select num for Groud Kind between 1 and 4:");
			}
		}
	}

	public void deleteCrop() {
		System.out.print("Crop Name:");
		String cropName = input.next(); //삭제하려는 작물 이름 입력받기
		int index = -1;
		for(int i=0; i<crops.size(); i++) {
			if(crops.get(i).getName().equals(cropName)) {
				index = i;
				break;
			} //crops collection에 입력받은 작물이 있는가?
		}

		if(index >= 0) { //일치하는 작물을 찾았을 경우
			crops.remove(index); //삭제
			System.out.println("the crop " + cropName + " is deleted");
		}
		else { //못 찾았을 경우
			System.out.println("the crop has not been registered.");
			return;
		}
	}

	public void editCrop() {
		System.out.print("Crop Name:");
		String cropName = input.next();
		for(int i=0; i<crops.size(); i++) {
			CropInput cropInput = crops.get(i);
			if(cropInput.getName().equals(cropName)) {
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
						cropInput.setName(name);
					}
					else if (num == 2) { 
						System.out.print("Consumable Nutrient:");
						int nutrient = input.nextInt();
						cropInput.setNutrient(nutrient);
					}
					else if (num == 3) { 
						System.out.print("Crop Level:");
						int level = input.nextInt();
						cropInput.setLevel(level);
					}
					else if (num == 4) {
						System.out.print("Cultivation Period(days):");
						int period = input.nextInt();
						cropInput.setPeriod(period);
					}
					else if (num == 5) { 
						System.out.print("The best month to plant:");
						String seeding = input.next();
						cropInput.setSeeding(seeding);
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
