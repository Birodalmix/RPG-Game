import java.util.Scanner;

public class Statistics {

	public static Character character;
	
	public static void GetStatistics(){
		
		Menu.clear();
		try {
		System.out.println("A h�s neve: "+character.GetName());
		System.out.println("A h�s szintje: "+character.GetLevel());
		System.out.println("A h�s tapasztalati pontja: "+character.GetExperience());
		
		System.out.println("A h�s ereje: "+character.GetPower());
		System.out.println("A h�s �leter� pontja: "+character.GetHealth());
		System.out.println("A h�s p�nc�lja: "+character.GetArmor());
		System.out.println("A h�s tipusa: "+character.GetType());
		}catch (Exception e) {
		System.out.println("Nyomj egy entert hogy vissza menj a men�be!");
		Scanner counta = new Scanner(System.in);
		counta.nextLine();
		Menu.clear();
		Menu.Continue();
		counta.close();
		}
	}
}

