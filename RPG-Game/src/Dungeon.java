import java.util.Random;
public class Dungeon {
	
	public static Monster monster; 
	private int Levels=1;
	String[] Nevek= {"Kutja","Kis Lutyuy","Kis Kunya","Kis Lutyuj","Kunya"};
    
    
    
	public void LevelGenerator() {
		
		Random rand = new Random();
		int TypeSelecter = rand.nextInt((3 - 1) + 1) + 1;
		int i = rand.nextInt((4 - 0) + 1) + 0;
		monster= new Monster(Nevek[i],GetLevel(),TypeSelecter);
		
		
	}
	public  int GetLevel(){
		return Levels;
	}
	public void SetLevels(int l) {
		Levels=l;
	}
}
