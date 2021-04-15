import java.util.Scanner;

public class Statistics {

	public static Character character;
	
	public static void GetStatistics(){
		
		Menu.clear();
		try {
		System.out.println("A hõs neve: "+character.GetName());
		System.out.println("A hõs szintje: "+character.GetLevel());
		System.out.println("A hõs tapasztalati pontja: "+character.GetExperience());
		
		System.out.println("A hõs ereje: "+character.GetPower());
		System.out.println("A hõs életerõ pontja: "+character.GetHealth());
		System.out.println("A hõs páncélja: "+character.GetArmor());
		System.out.println("A hõs tipusa: "+character.GetType());
		}catch (Exception e) {
		System.out.println("Nyomj egy entert hogy vissza menj a menübe!");
		Scanner counta = new Scanner(System.in);
		counta.nextLine();
		Menu.clear();
		Menu.Continue();
		counta.close();
		}
	}
}

