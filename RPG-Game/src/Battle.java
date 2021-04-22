import java.util.Scanner;

public class Battle {
	
	public static Monster monster;
	public static Character character;
	private static int startHP=0;
	
	public static void SetBattle() {
		
		Menu.character.setTrueDamage(Menu.character.GetPower(),Dungeon.monster.GetArmor());
		Dungeon.monster.setTrueDamage(Dungeon.monster.GetPower(),Menu.character.GetArmor());
		
		
		Scanner counta = new Scanner(System.in);
		Dungeon.monster.SetHealth(Dungeon.monster.GetHealth() - Menu.character.getTrueDamage());
		
		Quest.setQTrueDamageContainer(Quest.getQTrueDamageContainer()+Menu.character.getTrueDamage());
		if(Quest.getQTrueDamageContainer()>=Quest.getQTrueDamage()) {
			Quest.ThirdQ();
		}
		
		if(Dungeon.monster.GetHealth()<=0) {
			System.out.println("~~~~~~~~~~~~~~~~~~");
			System.out.println("A " +Dungeon.monster.GetName()+" megmúrdálódott! :)");
			System.out.println(Menu.character.GetHealth()+" életerõd maradt!");
			System.out.println("~~~~~~~~~~~~~~~~~~");
			counta.nextLine();
			Menu.clear();
			Menu.character.SetHealth(Battle.getStartHP());
			Dungeon.GetTreasure();
			
		}else {
			Menu.character.SetHealth(Menu.character.GetHealth() - Dungeon.monster.getTrueDamage());
			System.out.println("~~~~~~~~~~~~~~~~~~");
			System.out.println(Menu.character.GetHealth()+" életerõd maradt!");
			System.out.println(Dungeon.monster.GetHealth()+" életereje maradt a "+Dungeon.monster.GetName()+"!");	
			System.out.println("~~~~~~~~~~~~~~~~~~");
			counta.nextLine();
			Menu.clear();
		}
		
		if(Menu.character.GetHealth()<=0) {
			System.out.println("~~~~~~~~~~~~~~~~~~");
			System.out.println("Megmúrdálódtál! :(");
			System.out.println("~~~~~~~~~~~~~~~~~~");
			System.out.println("\n Nyomj egy Entert a tovább lépéshez!");
			
			Scanner countinues = new Scanner(System.in);
			countinues.nextLine();
			Menu.character.SetHealth(getStartHP());
			Menu.clear();
			Menu.Continue();
		}else if(Menu.character.GetHealth()>0&&Dungeon.monster.GetHealth()>0){
			SetBattle();
		}
	}

	public static int getStartHP() {
		return startHP;
	}

	public static void setStartHP(int startHP) {
		Battle.startHP = startHP;
	}
	
	public static void DungeonStarter(){
		Menu.clear();
		Scanner counta = new Scanner(System.in);
		System.out.println(Menu.character.GetName()+"\n Élete: "+Menu.character.GetHealth() +"\n Szintje: "+Menu.character.GetLevel());
		System.out.println();
		System.out.println("V         V   SSSSSSSSS");
		System.out.println(" V       V   SSS      SSS");
		System.out.println("  V     V      SSSS");
		System.out.println("   V   V         SSSS");
		System.out.println("    V V     SSS     SSS");
		System.out.println("     V        SSSSSSSS    *");
		System.out.println("==========================");
		System.out.println();
		System.out.println(Dungeon.monster.GetName()+"\n Élete: "+Dungeon.monster.GetHealth()+"\n Szintje: "+Dungeon.monster.GetLevel());
		counta.nextLine();
		Menu.clear();
	}
	
}
