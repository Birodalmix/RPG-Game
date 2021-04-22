public class Character {
	 private  String Name;
	 private  int Level;
	 private  int Experience;
	 
	 private static  int gold;
	 
	 private  int Health;
	 private  int Power;
	 private  int Armor;
	 
	 private  Spec Type;
	 
	 private int TrueDamage;
	 
	 public Character(String name, int s) {
		 this.Name=name;
		 this.Level=1;
		 this.Experience=0;
		 SetStartingStats(s);
		 
	 }
	 void SetStartingStats(int a) {	
		 switch(a) {
		  case 1:
			 Type=Spec.WARIOR;
			 SetHealth(15);
			 SetPower(13);
			 SetArmor(2);
		    break;
		  case 2:			 
			  Type=Spec.ARCHER;
			  SetHealth(6);
			  SetPower(20);
			  SetArmor(5);
		    break; 
		}
	 }
	 
	 
	 //Getterek ezekkel lehet kiolvasni a betokozott adatokat
	 public String GetName() {
		 return Name;
	 }
	 public int GetLevel() {
		 return Level;
	 }
	 public int GetExperience() {
		 return Experience;
	 }
	 public int GetHealth() {
		 return Health;
	 }
	 public int GetPower() {
		 return Power;
	 }
	 public int GetArmor() {
		 return Armor;
	 }
	 public Spec GetType() {
		 return Type;
	 }
	 
	 
	 //Setterek ezekkel lehet felülírni a betokozott adatokat
	 public  void SetName(String n) {
		 Name=n;
	 }
	 public  void SetLevel(int l) {
		
		 if(Level<l) {
			 Level=l;
			 SetHealth(GetHealth()+10);
			 SetPower(GetPower()+4);
			 if(Menu.character.GetLevel()>=Quest.getQLevel()) {
				 Quest.FirstQ();
			 }
		}
	 }
	 public  void SetExperience(int e) {
		 Experience=e;
		 Quest.setQExperienceContainer(Quest.getQExperienceContainer()+e);
		 if(Quest.getQExperienceContainer()>=Quest.getQExperienceCost()) {
			 Quest.SeconQ();
		 }
		 if(Menu.character.GetExperience()>=Menu.character.GetLevel()*8) {
			 SetExperience(Menu.character.GetExperience()-Menu.character.GetLevel()*8);
			 SetLevel(GetLevel()+1);
			 System.out.println("Szintet léptél!\n Az új szinted: "+Menu.character.GetLevel()+".\n További "+(Menu.character.GetLevel()*8-Menu.character.GetExperience())+" tapasztalati pont kell a következõ szinthez!");
		 }
	 }
	 public  void SetHealth(int h) {
		 Health=h;
	 }
	 public  void SetPower(int p) {
		 Power=p;
	 }
	 public  void SetArmor(int a) {	
		 Armor=a;
	 }
	 public  void SetType(int a) {	
		 switch(a) {
		  case 1:
			 Type=Spec.WARIOR;
		    break;
		  case 2:			 
			  Type=Spec.ARCHER;
		    break; 
		}
	 }
	 
	 public int GetGold() {
			return gold;
		}

		public void SetGold(int gold) {
			Character.gold = gold;
		}
	 
	public int getTrueDamage() {
		return TrueDamage;
	}
	public void setTrueDamage(int Damage,int Armor) {
		if(0 <= Damage-Armor) {
		TrueDamage = Damage-Armor;
		}else {
			TrueDamage = 0;
		}
	}
	 
}
