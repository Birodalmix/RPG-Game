import java.util.Scanner;

public class Statistics {

	
	public static void GetStatistics(){
		
		Menu.clear();
		System.out.println("A h�s neve: "+Menu.character.GetName());
		System.out.println("A h�s szintje: "+Menu.character.GetLevel());
		System.out.println("A h�s tapasztalati pontja: "+Menu.character.GetExperience()+"/"+Menu.character.GetLevel()*8);
		
		System.out.println("A h�s aranya: "+Menu.character.GetGold());
		
		System.out.println("A h�s ereje: "+Menu.character.GetPower());
		System.out.println("A h�s �leter� pontja: "+Menu.character.GetHealth());
		System.out.println("A h�s p�nc�lja: "+Menu.character.GetArmor());
		System.out.println("A h�s tipusa: "+Menu.character.GetType());
		System.out.println("Nyomj egy entert hogy vissza menj a men�be!");
		Menu.Back();
		}
	}


