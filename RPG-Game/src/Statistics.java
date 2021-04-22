import java.util.Scanner;

public class Statistics {

	
	public static void GetStatistics(){
		
		Menu.clear();
		System.out.println("A hõs neve: "+Menu.character.GetName());
		System.out.println("A hõs szintje: "+Menu.character.GetLevel());
		System.out.println("A hõs tapasztalati pontja: "+Menu.character.GetExperience()+"/"+Menu.character.GetLevel()*8);
		
		System.out.println("A hõs aranya: "+Menu.character.GetGold());
		
		System.out.println("A hõs ereje: "+Menu.character.GetPower());
		System.out.println("A hõs életerõ pontja: "+Menu.character.GetHealth());
		System.out.println("A hõs páncélja: "+Menu.character.GetArmor());
		System.out.println("A hõs tipusa: "+Menu.character.GetType());
		System.out.println("Nyomj egy entert hogy vissza menj a menübe!");
		Menu.Back();
		}
	}


