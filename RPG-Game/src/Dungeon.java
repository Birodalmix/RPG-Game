import java.util.Random;
public class Dungeon {
	
	public static Monster monster; 
	private static int Levels=1;
	static String[] Nevek= {"Kutja","Kis Lutyuy","Kis Kunya","Kis Lutyuj","Kunya","Gunya","Kis Gutya"};
    
    
    
	public static void LevelGenerator() {
		
		Random rand = new Random();
		int TypeSelecter = rand.nextInt((3 - 1) + 1) + 1;
		int i = rand.nextInt((6 - 0) + 1) + 0;
		monster= new Monster(Nevek[i],GetLevel(),TypeSelecter);		
	}
	
	public static void GetTreasure() {
		System.out.println("Kapott arany: "+GetLevel()*8);
		System.out.println("Kapott tapasztalati pont: "+GetLevel()*3);
		Menu.character.SetExperience(Menu.character.GetExperience()+GetLevel()*3);
		Menu.character.SetGold(Menu.character.GetGold()+GetLevel()*8);
		SetLevels(GetLevel()+1);
		Menu.Continue();
	} 
		
	public static  int GetLevel(){
		return Levels;
	}
	
	public static void SetLevels(int l) {
		Levels=l;
	}
}
